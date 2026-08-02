package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vkontakte.android.VKApplication;
import java.util.WeakHashMap;

/* compiled from: AudioPlayerPoolImpl.kt */
/* loaded from: classes3.dex */
public final class et4 implements xs4 {
    public static volatile et4 d;
    public final aw40 a;
    public final bpn0 b = new bpn0(new zq3(2));
    public final WeakHashMap<Context, os4> c = new WeakHashMap<>();

    public et4(aw40 aw40Var) {
        this.a = aw40Var;
    }

    @Override // xsna.xs4
    public final void a(Context context) {
        if (!i0q0.b()) {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            if (BuildInfo.h()) {
                throw new RuntimeException("[AudioPlayerPool] - main thread required");
            }
            bn40.d("[AudioPlayerPool] - main thread required");
            s3q0 s3q0Var = s3q0.a;
        }
        d(context).a(context);
    }

    @Override // xsna.xs4
    public final AudioPlayer b(Context context, boolean z) {
        if (!i0q0.b()) {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            if (BuildInfo.h()) {
                throw new RuntimeException("[AudioPlayerPool] - main thread required");
            }
            bn40.d("[AudioPlayerPool] - main thread required");
            s3q0 s3q0Var = s3q0.a;
        }
        return d(context).b(context, z);
    }

    @Override // xsna.xs4
    public final void c(Context context, AudioPlayer audioPlayer) {
        if (!i0q0.b()) {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            if (BuildInfo.h()) {
                throw new RuntimeException("[AudioPlayerPool] - main thread required");
            }
            bn40.d("[AudioPlayerPool] - main thread required");
            s3q0 s3q0Var = s3q0.a;
        }
        os4 os4Var = this.c.get(context);
        if (os4Var != null) {
            os4Var.c(context, audioPlayer);
        } else {
            bn40.d("[AudioPlayerPool] - release unknown instance");
            sa30.M(audioPlayer, false);
        }
    }

    public final os4 d(Context context) {
        WeakHashMap<Context, os4> weakHashMap = this.c;
        os4 os4Var = weakHashMap.get(context);
        if (os4Var == null) {
            os4Var = new os4(context, (ys4) this.b.getValue(), this.a);
            weakHashMap.put(context, os4Var);
        }
        return os4Var;
    }
}
