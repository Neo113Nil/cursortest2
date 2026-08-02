package xsna;

import android.os.SystemClock;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.List;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.i3i0;
import xsna.rxp;

/* compiled from: ClipItemVideoUIEventListener.kt */
/* loaded from: classes17.dex */
public final class f3d implements lih0 {
    public final j1d a;
    public final i3i0.a b;
    public final enf c;
    public final z0q d;
    public final x1d e;
    public SdkClipVideoFile f;
    public final syp g = new syp();

    public f3d(ClipFeedTab clipFeedTab, zof zofVar, j1d j1dVar, i3i0.a aVar, enf enfVar, z0q z0qVar) {
        this.a = j1dVar;
        this.b = aVar;
        this.c = enfVar;
        this.d = z0qVar;
        this.e = new x1d(clipFeedTab, zofVar, j1dVar);
    }

    @Override // xsna.lih0
    public final void H(long j, long j2) {
        this.a.a(new t6d(j, j2));
    }

    @Override // xsna.lih0
    public final void I(qi5 qi5Var, long j, long j2) {
        if (qi5Var.a.isPaused()) {
            return;
        }
        this.b.d(j, j2);
        this.e.d.a(j, j2);
        SdkClipVideoFile sdkClipVideoFile = this.f;
        if (sdkClipVideoFile != null) {
            String r1 = sdkClipVideoFile.r1();
            syp sypVar = this.g;
            sypVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!r1.equals((String) sypVar.b)) {
                sypVar.b = r1;
                sypVar.a = elapsedRealtime;
            } else if (elapsedRealtime - sypVar.a <= 500) {
                return;
            } else {
                sypVar.a = elapsedRealtime;
            }
            this.d.b(new rxp.f(sdkClipVideoFile, j, j2));
        }
    }

    @Override // xsna.lih0
    public final void J(qi5 qi5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        this.c.b(qi5Var);
        this.a.a(new f6d(new j4b0(qi5Var), i, errorCode));
    }

    @Override // xsna.lih0
    public final void K(int i, int i2) {
        this.a.a(new r6d(new rlh0(i, i2)));
    }

    @Override // xsna.lih0
    public final void M(qi5 qi5Var) {
        this.a.a(new g6d(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void a(boolean z) {
        this.c.a(z);
        this.a.a(i6d.b);
    }

    @Override // xsna.lih0
    public final void c() {
        SdkClipVideoFile sdkClipVideoFile = this.f;
        if (sdkClipVideoFile != null) {
            this.d.b(new rxp.e(sdkClipVideoFile));
        }
        this.a.a(n6d.b);
    }

    @Override // xsna.lih0
    public final void d(qi5 qi5Var) {
        this.c.d(qi5Var);
        this.a.a(new j6d(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void e(qi5 qi5Var) {
        this.c.e(qi5Var);
        this.a.a(new m6d(new j4b0(qi5Var)));
        SdkClipVideoFile sdkClipVideoFile = this.f;
        if (sdkClipVideoFile != null) {
            this.d.b(new rxp.d(sdkClipVideoFile));
        }
    }

    @Override // xsna.lih0
    public final void f(qi5 qi5Var) {
        this.c.f(qi5Var);
        this.a.a(new e6d(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void g(qi5 qi5Var) {
        this.c.g(qi5Var);
        this.a.a(new h6d(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void h(qi5 qi5Var) {
        this.c.h(qi5Var);
        this.a.a(new k6d(new j4b0(qi5Var)));
    }

    @Override // xsna.lih0
    public final void q(List<? extends SubtitleRenderItem> list) {
        this.a.a(new q6d(list));
    }

    @Override // xsna.lih0
    public final void u() {
        this.a.a(p6d.b);
    }

    @Override // xsna.lih0
    public final void x0() {
        this.a.a(s6d.b);
    }

    @Override // xsna.lih0
    public final void L(qi5 qi5Var) {
    }

    @Override // xsna.lih0
    public final void b(qi5 qi5Var) {
    }

    @Override // xsna.lih0
    public final void onIsPlayingChanged(boolean z) {
    }
}
