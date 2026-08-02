package xsna;

import android.util.LruCache;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.player.error.VkPlayerException;
import java.util.Objects;
import java.util.UUID;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1b0 implements izs {
    public final /* synthetic */ e2b0 b;
    public final /* synthetic */ MusicPlaybackLaunchContext c;
    public final /* synthetic */ int d;
    public final /* synthetic */ PlaybackActionMeta e;
    public final /* synthetic */ String f;

    public /* synthetic */ y1b0(e2b0 e2b0Var, MusicPlaybackLaunchContext musicPlaybackLaunchContext, int i, PlaybackActionMeta playbackActionMeta, String str) {
        this.b = e2b0Var;
        this.c = musicPlaybackLaunchContext;
        this.d = i;
        this.e = playbackActionMeta;
        this.f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        VkPlayerException emptyUuidException;
        e5b0 w4;
        String str = (String) obj;
        e2b0 e2b0Var = this.b;
        PlayerUIComponent playerUIComponent = e2b0Var.H;
        e2b0Var.d0();
        String str2 = this.f;
        if (str != null) {
            e5b0 w42 = playerUIComponent.w4();
            if (!w42.b) {
                LruCache<UUID, mzp0> lruCache = rzp0.a;
                mzp0 e = rzp0.e(w42.a);
                if (e != null) {
                    e.c(false);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            e2b0Var.t(this.c);
            e2b0Var.v = this.d;
            e2b0Var.g0(str, false, true, false, "new", this.e, str2);
        } else {
            bn40.f("uuid is null");
            StartPlaySource i = e2b0Var.i();
            if (i instanceof StartPlayVkMixSource) {
                StartPlayVkMixSource startPlayVkMixSource = (StartPlayVkMixSource) i;
                if (Objects.equals(startPlayVkMixSource.e, "album_mix") || Objects.equals(startPlayVkMixSource.e, "playlist_mix")) {
                    emptyUuidException = new VkPlayerException.NoVkMixException();
                    w4 = playerUIComponent.w4();
                    if (!w4.b) {
                        LruCache<UUID, mzp0> lruCache2 = rzp0.a;
                        mzp0 e2 = rzp0.e(w4.a);
                        if (e2 != null) {
                            e2.f();
                            e2b0Var.I(e2.Y0());
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                    }
                    e2b0Var.G(0, emptyUuidException);
                    e2b0Var.B(26, str2, false);
                }
            }
            emptyUuidException = new VkPlayerException.EmptyUuidException();
            w4 = playerUIComponent.w4();
            if (!w4.b) {
            }
            e2b0Var.G(0, emptyUuidException);
            e2b0Var.B(26, str2, false);
        }
        return s3q0.a;
    }
}
