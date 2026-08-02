package xsna;

import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.ui.video2.PlayerState;
import com.vkontakte.android.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.collections.EmptyList;
import one.video.controls20.SimpleControlsView;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: DefaultPlaybackQueueProvider.kt */
/* loaded from: classes3.dex */
public final class mkl implements gc40 {
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    public /* synthetic */ mkl(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // xsna.gc40
    public List a() {
        MusicTrack musicTrack = (MusicTrack) this.b;
        ia50 ia50Var = (ia50) this.c;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = (Bundle) ((fy2) this.e).b;
        if (bundle.containsKey("canSkipListening") && bundle.getBoolean("canSkipListening")) {
            arrayList.add(new ec40(R.id.music_action_podcast_mark_listened, (MusicTrack) this.b, R.string.music_podcast_listened, R.string.music_talkback_podcast_listened, R.drawable.vk_icon_add_circle_outline_28, 0, 0, 992));
        }
        arrayList.add(new ec40(R.id.music_action_share, musicTrack, R.string.music_share, R.string.music_talkback_share_podcast, R.drawable.vk_icon_share_outline_28, musicTrack.B() ? R.attr.vk_ui_icon_secondary : R.attr.vk_ui_icon_accent, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
        if (ia50Var.D(musicTrack)) {
            arrayList.add(new ec40(R.id.music_action_add_to_favorites, (MusicTrack) this.b, R.string.music_add_to_favorites, R.string.music_talkback_podcast_to_favorite, R.drawable.vk_icon_favorite_outline_28, 0, 0, 992));
        }
        if (ia50Var.j1(musicTrack)) {
            arrayList.add(new ec40(R.id.music_action_add_remove_from_favorites, (MusicTrack) this.b, R.string.music_remove_from_favorites, R.string.music_talkback_podcast_from_favorite, R.drawable.vk_icon_unfavorite_outline_28, 0, 0, 992));
        }
        if (!((u2b0) this.d).m0().i()) {
            arrayList.add(new ec40(R.id.music_action_setting_player_timer, (MusicTrack) this.b, R.string.music_sleep_timer, R.string.music_talkback_music_sleep_timer, R.drawable.vk_icon_moon_outline_28, 0, 0, 992));
        }
        arrayList.add(new ec40(R.id.music_action_open_equalizer, (MusicTrack) this.b, R.string.equalizer_settings_menu, R.string.equalizer_settings_menu, R.drawable.vk_icon_sliders_vertical_outline_28, 0, 0, 992));
        return arrayList;
    }

    public Pair b(String str) {
        if (((xo9) this.c) == null) {
            return null;
        }
        SecretKey secretKey = (SecretKey) this.b;
        byte[] generateSeed = new SecureRandom().generateSeed(12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKey, new GCMParameterSpec(128, generateSeed));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
        cipherOutputStream.write(str.getBytes(C.UTF8_NAME));
        cipherOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new Pair(Base64.encodeToString(generateSeed, 0), Base64.encodeToString(byteArray, 0));
    }

    @Override // xsna.gc40
    public EmptyList c() {
        return EmptyList.b;
    }

    public String d(String str, byte[] bArr) {
        if (((ine0) this.d) == null) {
            return null;
        }
        SecretKey secretKey = (SecretKey) this.b;
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKey, new GCMParameterSpec(128, bArr));
        CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(Base64.decode(str, 0)), cipher);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int read = cipherInputStream.read();
            if (read == -1) {
                break;
            }
            arrayList.add(Byte.valueOf((byte) read));
        }
        byte[] bArr2 = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr2[i] = ((Byte) arrayList.get(i)).byteValue();
        }
        return new String(bArr2, C.UTF8_NAME);
    }

    public void e() {
        vay0.a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init((KeyGenParameterSpec) this.e);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.b = (SecretKey) key;
            this.c = new xo9();
            this.d = new ine0();
        }
    }

    public mkl() {
        this.b = null;
        vay0.a("%s : create specs", "KeyGeneratorSpecCreator");
        this.e = new KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
    }

    public mkl(SimpleControlsView simpleControlsView, rzl0 rzl0Var) {
        this.b = simpleControlsView;
        this.c = new dac0(rzl0Var, 29);
        this.d = new hri0(rzl0Var, 15);
        this.e = rl3.y0(new PlayerState[]{PlayerState.BUFFERING, PlayerState.PLAYING, PlayerState.PAUSE});
    }
}
