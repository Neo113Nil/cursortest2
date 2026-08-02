package xsna;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventScreenMode;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventSource;
import java.util.concurrent.TimeUnit;

/* compiled from: LiveSeekPresenter.kt */
/* loaded from: classes3.dex */
public final class glz implements elz {
    public static final int i = iah0.a(480);
    public static final int j = iah0.a(320);
    public final Context b;
    public final nnz c;
    public final flz d;
    public final boolean e;
    public final zet0 f;
    public boolean g;
    public int h = -1;

    public glz(Context context, nnz nnzVar, flz flzVar, boolean z, zet0 zet0Var) {
        this.b = context;
        this.c = nnzVar;
        this.d = flzVar;
        this.e = z;
        this.f = zet0Var;
    }

    @Override // xsna.elz
    public final void K() {
        this.g = true;
        t();
    }

    @Override // xsna.elz
    public final void R() {
        zet0 zet0Var;
        yg5 yg5Var;
        if (d()) {
            nnz nnzVar = this.c;
            long j2 = 0;
            long j3 = nnzVar.h() ? C.TIME_UNSET : 0L;
            yg5 yg5Var2 = nnzVar.f;
            if (yg5Var2 != null) {
                yg5Var2.y0(j3);
            }
            if (nnzVar.h() && (yg5Var = nnzVar.f) != null) {
                j2 = yg5Var.getPosition();
            }
            this.d.m3(nnzVar.a(), j2, nnzVar.g());
            VideoFile videoFile = nnzVar.q;
            if (videoFile == null || (zet0Var = this.f) == null) {
                return;
            }
            zet0Var.a(new yet0(Long.valueOf(videoFile.o0()), videoFile.I0(), videoFile.r()), VideoSeekEventSource.Live, VideoSeekEventScreenMode.Fullscreen, TimeUnit.MILLISECONDS.toSeconds(nnzVar.a()));
        }
    }

    @Override // xsna.elz
    public final void b2(long j2) {
        if (d()) {
            nnz nnzVar = this.c;
            yg5 yg5Var = nnzVar.f;
            if (yg5Var != null) {
                yg5Var.y0(j2);
            }
            this.d.m3(nnzVar.a(), j2, nnzVar.g());
        }
    }

    public final boolean d() {
        nnz nnzVar = this.c;
        return nnzVar.c() && nnzVar.a() != 0;
    }

    @Override // xsna.elz
    public final void e0(int i2) {
        if (this.h == i2) {
            return;
        }
        this.h = i2;
        t();
    }

    @Override // xsna.elz
    public final boolean i() {
        return this.c.g();
    }

    @Override // xsna.elz
    public final boolean o() {
        return this.c.h();
    }

    public final void t() {
        boolean d = d();
        flz flzVar = this.d;
        if (d) {
            boolean z = this.g;
            boolean z2 = this.h < 0 || (!iah0.s(this.b) ? this.h < j : this.h < i);
            if (!z && z2) {
                if (!this.e) {
                    flzVar.show();
                }
                nnz nnzVar = this.c;
                long a = nnzVar.a();
                yg5 yg5Var = nnzVar.f;
                flzVar.m3(a, yg5Var != null ? yg5Var.getPosition() : 0L, nnzVar.g());
                return;
            }
        }
        flzVar.hide();
    }

    @Override // xsna.elz
    public final void x1() {
        this.g = false;
        t();
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void release() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }
}
