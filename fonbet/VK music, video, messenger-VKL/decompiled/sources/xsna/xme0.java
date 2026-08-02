package xsna;

import android.content.Context;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import kotlin.LazyThreadSafetyMode;
import xsna.ca2;
import xsna.gfw;

/* compiled from: QrAnalyzer.kt */
/* loaded from: classes13.dex */
public final class xme0 implements gfw.a {
    public final gqe0 b;
    public final Object c;

    public xme0(Context context, gqe0 gqe0Var) {
        this.b = gqe0Var;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new wme0(context, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r2 == false) goto L31;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gfw.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(mzi0 mzi0Var) {
        Result result;
        try {
            try {
                try {
                    try {
                        boolean z = true;
                        boolean z2 = mzi0Var.getFormat() == 35;
                        if (!gz80.a(23) || (mzi0Var.getFormat() != 39 && mzi0Var.getFormat() != 40)) {
                            z = false;
                        }
                        if (mzi0Var.M2().length == 3) {
                            ca2.a aVar = (ca2.a) mzi0Var.M2()[0];
                            int b = aVar.b();
                            nne0 c = ((one0) this.c.getValue()).c(mzi0Var.getImage(), b, aVar.a().capacity() / b, mzi0Var.d.b());
                            if (c != null && (result = (Result) j5g.a0(c.a)) != null) {
                                this.b.invoke(result);
                            }
                        }
                        mzi0Var.close();
                    } catch (IllegalArgumentException e) {
                        xgx0.a.getClass();
                        xgx0.d(e);
                        mzi0Var.close();
                    }
                } catch (NotFoundException e2) {
                    xgx0.a.getClass();
                    xgx0.d(e2);
                    mzi0Var.close();
                }
            } catch (IllegalStateException e3) {
                xgx0.a.getClass();
                xgx0.d(e3);
                mzi0Var.close();
            }
        } catch (Throwable th) {
            mzi0Var.close();
            throw th;
        }
    }
}
