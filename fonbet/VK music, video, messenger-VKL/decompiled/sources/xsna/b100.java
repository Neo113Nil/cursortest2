package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: LogcatClipsVideoStateStatistics.kt */
/* loaded from: classes17.dex */
public final class b100 implements enf {
    public static final b100 a = new b100();

    @Override // xsna.enf
    public final void a(boolean z) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{zhy0.a("ClipsVideoState: onLostNetwork hasDownloads = ", z)});
    }

    @Override // xsna.enf
    public final void b(qi5 qi5Var) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ClipsVideoState: onError videoId = " + qi5Var.A().a1()});
    }

    @Override // xsna.enf
    public final void d(qi5 qi5Var) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ClipsVideoState: onPause videoId = " + qi5Var.A().a1()});
    }

    @Override // xsna.enf
    public final void e(qi5 qi5Var) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ClipsVideoState: onReady videoId = " + qi5Var.A().a1()});
    }

    @Override // xsna.enf
    public final void f(qi5 qi5Var) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ClipsVideoState: onEndOfBuffer videoId = " + qi5Var.A().a1()});
    }

    @Override // xsna.enf
    public final void g(qi5 qi5Var) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ClipsVideoState: onLoading videoId = " + qi5Var.A().a1()});
    }

    @Override // xsna.enf
    public final void h(qi5 qi5Var) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ClipsVideoState: onPlay videoId = " + qi5Var.A().a1()});
    }

    @Override // xsna.enf
    public final void i(SdkClipVideoFile sdkClipVideoFile) {
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ClipsVideoState: videoId = " + sdkClipVideoFile.a1()});
    }
}
