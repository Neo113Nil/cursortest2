package xsna;

import com.vk.libvideo.autoplay.VideoUIEventDispatcher;
import com.vk.mediastore.media.VideoCacheIdImpl;
import com.vk.mediastore.storage.ClipsVideoStorage;
import java.util.LinkedHashMap;
import kotlin.Result;
import one.video.exo.offline.DownloadInfo;
import one.video.player.model.VideoContentType;
import xsna.v7s0;

/* compiled from: VideoCacheDelegate.kt */
/* loaded from: classes3.dex */
public final class m7s0 implements q7s0, v7s0.a {
    public final k3s0 a;
    public final v7s0 b;
    public final VideoUIEventDispatcher c;
    public final String d;
    public DownloadInfo e;

    public m7s0(k3s0 k3s0Var, v7s0 v7s0Var, VideoUIEventDispatcher videoUIEventDispatcher) {
        String str;
        this.a = k3s0Var;
        this.b = v7s0Var;
        this.c = videoUIEventDispatcher;
        m7q b = b();
        this.d = (b == null || (str = b.a) == null) ? "" : str;
        if (b == null || (r1 = b.x) == null) {
            return;
        }
        r7s0 r7s0Var = r7s0Var != VideoCacheIdImpl.MESSAGES ? null : r7s0Var;
        if (r7s0Var != null) {
            v7s0Var.c(r7s0Var, this);
        }
    }

    @Override // xsna.v7s0.a
    public final void a(LinkedHashMap linkedHashMap) {
        DownloadInfo downloadInfo = (DownloadInfo) linkedHashMap.get(this.d);
        if (downloadInfo == null) {
            return;
        }
        DownloadInfo downloadInfo2 = this.e;
        if ((downloadInfo2 != null ? downloadInfo2.c : null) == downloadInfo.c) {
            if (epx.a(downloadInfo.g, downloadInfo2 != null ? Float.valueOf(downloadInfo2.g) : null)) {
                return;
            }
        }
        this.e = downloadInfo;
        this.c.U3(downloadInfo);
    }

    public final m7q b() {
        Object d = this.a.invoke().d();
        if (d instanceof Result.Failure) {
            d = null;
        }
        return (m7q) d;
    }

    @Override // xsna.q7s0
    public final void start() {
        m7q b = b();
        if (b == null) {
            return;
        }
        sht0 e = jgz.e(b);
        if (e instanceof ay8) {
            ay8 ay8Var = (ay8) e;
            r7s0 r7s0Var = ay8Var.e;
            v7s0 v7s0Var = this.b;
            if (v7s0Var.f(r7s0Var)) {
                v7s0Var.b(ay8Var);
                return;
            }
        }
        if (b.p && b.E && e.a == VideoContentType.DASH) {
            ClipsVideoStorage clipsVideoStorage = ClipsVideoStorage.a;
            String uri = b.e.b.toString();
            clipsVideoStorage.getClass();
            ClipsVideoStorage.e(uri);
        }
    }

    @Override // xsna.q7s0
    public final void stop() {
        j7q c;
        b9o e;
        v7s0 v7s0Var = this.b;
        m7q b = b();
        if (b == null) {
            return;
        }
        sht0 e2 = jgz.e(b);
        if (e2 instanceof ay8) {
            ay8 ay8Var = (ay8) e2;
            if (v7s0Var.f(ay8Var.e)) {
                String str = ay8Var.d;
                androidx.media3.exoplayer.offline.c cVar = v7s0Var.e(ay8Var.e).f;
                if (cVar != null) {
                    cVar.i(2, str);
                    return;
                }
                return;
            }
        }
        if (b.p && b.E && e2.a == VideoContentType.DASH) {
            ClipsVideoStorage clipsVideoStorage = ClipsVideoStorage.a;
            String uri = b.e.b.toString();
            clipsVideoStorage.getClass();
            if (ClipsVideoStorage.d() && (c = ClipsVideoStorage.c()) != null && uri != null && (e = c.e()) != null) {
                e.h(uri);
            }
            io.reactivex.rxjava3.disposables.c cVar2 = ClipsVideoStorage.g;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            ClipsVideoStorage.g = null;
        }
    }

    @Override // xsna.v7s0.a
    public final void onInitialized() {
    }
}
