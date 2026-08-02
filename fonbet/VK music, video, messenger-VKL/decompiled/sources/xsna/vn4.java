package xsna;

import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.music.playerservice.api.PlayerServiceComponent;
import com.vk.music.playerservice.api.a;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import xsna.k840;

/* compiled from: AudioFacade.java */
@Deprecated
/* loaded from: classes.dex */
public final class vn4 {
    public static final a a = new a();

    @Nullable
    public static com.vk.music.pref.a b;

    /* compiled from: AudioFacade.java */
    public class a implements w8i {
    }

    /* compiled from: AudioFacade.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ShuffleMode.values().length];
            a = iArr;
            try {
                iArr[ShuffleMode.SHUFFLE_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ShuffleMode.SHUFFLE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void a(com.vk.music.player.e eVar, boolean z) {
        PlayState playState;
        dy4 dy4Var = dy4.p;
        dy4Var.getClass();
        HashSet hashSet = new HashSet(dy4Var.i);
        hashSet.add(eVar);
        dy4Var.i = hashSet;
        if (z) {
            com.vk.music.player.f fVar = dy4Var.d;
            if (fVar != null) {
                eVar.o2(fVar);
                eVar.W3(dy4Var.d);
            }
            com.vk.music.player.f fVar2 = dy4Var.d;
            if (fVar2 != null && (playState = dy4Var.c) != null) {
                eVar.N3(playState, fVar2);
            }
            List<PlayerTrack> list = dy4Var.e;
            if (list != null) {
                eVar.y4(list);
            }
            pro0.e(new ey4(dy4Var));
        }
    }

    @NonNull
    public static List<PlayerTrack> b() {
        kza0 a2 = dy4.p.a();
        return a2 == null ? Collections.EMPTY_LIST : a2.g();
    }

    @NonNull
    public static MusicPlaybackLaunchContext c() {
        kza0 a2 = dy4.p.a();
        return (a2 == null || a2.n() == null) ? MusicPlaybackLaunchContext.d : a2.n();
    }

    @Nullable
    public static MusicTrack d() {
        com.vk.music.player.f C;
        kza0 a2 = dy4.p.a();
        PlayerTrack g = (a2 == null || (C = a2.C()) == null) ? null : C.g();
        if (g == null) {
            return null;
        }
        return g.Ab();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r0 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(List<MusicTrack> list, final int i, @Nullable final Integer num, final MusicPlaybackLaunchContext musicPlaybackLaunchContext, ShuffleMode shuffleMode, @Nullable final String str, @Nullable final StartPlaySource startPlaySource, final PlaybackActionMeta playbackActionMeta, @Nullable final AdsAudioPixelsContainer adsAudioPixelsContainer) {
        List list2;
        if (num != null) {
            int intValue = num.intValue();
            if (list != null && !list.isEmpty() && intValue > -1 && intValue < list.size()) {
                k840.a.d.g(list.get(intValue));
            }
        }
        int i2 = b.a[shuffleMode.ordinal()];
        final boolean K0 = i2 != 1 ? i2 != 2 ? g().K0() : false : true;
        if (list != null) {
            ArrayList g = bis.g(list);
            if (g != null) {
                boolean isEmpty = g.isEmpty();
                list2 = g;
            }
            if (num == null) {
                dy4.p.onError(null);
                return;
            }
            return;
        }
        list2 = Collections.EMPTY_LIST;
        final List list3 = list2;
        a aVar = a;
        PlayerServiceComponent playerServiceComponent = (PlayerServiceComponent) j6i.b(m7m.f(aVar), PlayerServiceComponent.class);
        PlayerUIComponent playerUIComponent = (PlayerUIComponent) j6i.b(m7m.f(aVar), PlayerUIComponent.class);
        if (playerUIComponent.w4().a()) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair a2 = rzp0.a(UiMeasuringScreen.MUSIC_PLAYER_CONTROLS);
            ((mzp0) a2.j()).init();
            ((mzp0) a2.j()).start();
            playerUIComponent.w4().c((UUID) a2.i());
            playerUIComponent.w4().b();
        }
        playerServiceComponent.i7().a(MusicPlayerAction.ACTION_CONNECT_AND_PLAY, new a.b() { // from class: xsna.un4
            @Override // com.vk.music.playerservice.api.a.b
            public final void a(kza0 kza0Var) {
                kza0Var.D(list3, num, musicPlaybackLaunchContext, i, K0, str, startPlaySource, playbackActionMeta, adsAudioPixelsContainer);
            }
        });
    }

    public static void f(com.vk.music.player.e eVar) {
        dy4 dy4Var = dy4.p;
        dy4Var.getClass();
        HashSet hashSet = new HashSet(dy4Var.i);
        hashSet.remove(eVar);
        dy4Var.i = hashSet;
    }

    @NonNull
    public static com.vk.music.pref.a g() {
        if (b == null) {
            b = ((MusicPrefsComponent) j6i.b(m7m.f(a), MusicPrefsComponent.class)).Q0();
        }
        return b;
    }
}
