package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DonutModalHint.kt */
/* loaded from: classes5.dex */
public final class t0o extends jmu0 {
    public final v0o h1;

    /* compiled from: DonutModalHint.kt */
    public static final class a extends kmu0 {
        public final v0o h;

        public a(Context context, v0o v0oVar) {
            super(context, tzp0.a(null, 3));
            this.h = v0oVar;
            F0(true);
            P0();
            O0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new t0o(this.h);
        }
    }

    /* compiled from: DonutModalHint.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((t0o) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    public t0o(v0o v0oVar) {
        this.h1 = v0oVar;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        t0o t0oVar;
        androidx.compose.runtime.a M = aVar.M(-292692018);
        int i2 = (M.y(this) ? 4 : 2) | i;
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-292692018, i2, -1, "com.vk.profile.community.impl.ui.donut.modalhint.DonutModalHint.ThemedContent (DonutModalHint.kt:14)");
            }
            if ((i2 & 14) != 4 && !M.y(this)) {
                z = false;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                t0oVar = this;
                b bVar = new b(0, t0oVar, t0o.class, "dismiss", "dismiss()V", 0);
                M.R(bVar);
                x = bVar;
            } else {
                t0oVar = this;
            }
            u0o.a(t0oVar.h1, (gzs) ((fcy) x), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nw6(this, i, 7);
        }
    }
}
