package xsna;

import android.os.SystemClock;
import one.video.gl.GLESUtils;
import xsna.xfs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sfs implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sfs(long j, pdq0 pdq0Var) {
        this.c = j;
        this.d = pdq0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ufs ufsVar = (ufs) this.d;
                long j = this.c;
                r1t r1tVar = ufsVar.k;
                if (r1tVar != null) {
                    GLESUtils.a(r1tVar.b);
                    try {
                        ufsVar.o = null;
                        rva0 rva0Var = ufsVar.t;
                        xfs.a a = rva0Var != null ? rva0Var.a(j) : null;
                        ufsVar.p = a;
                        ufsVar.m = a != null ? Long.valueOf(SystemClock.elapsedRealtime() - j) : null;
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                        GLESUtils.a(0);
                    }
                }
                return s3q0.a;
            default:
                return efz.b(((pdq0) this.d).a.f, ")", fp.b(this.c, "collectFileBatch: file size ", " is more than maxUploadFileSize param ("));
        }
    }

    public /* synthetic */ sfs(ufs ufsVar, long j) {
        this.d = ufsVar;
        this.c = j;
    }
}
