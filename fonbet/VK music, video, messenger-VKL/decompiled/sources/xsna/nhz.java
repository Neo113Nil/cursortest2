package xsna;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.a;
import xsna.dw20;
import xsna.nos0;
import xsna.q630;

/* compiled from: ListingBottomSheet.kt */
/* loaded from: classes6.dex */
public final class nhz extends jmu0 {
    public final pos0 h1;
    public final qos0 i1;
    public boolean j1;

    /* compiled from: ListingBottomSheet.kt */
    public static final class a extends dw20.b {
        public final pos0 e;
        public final nos0.a f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context, pos0 pos0Var, nos0.a aVar) {
            super(context, null);
            if (pos0Var.d) {
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i = dhr0.u().c;
                if (valueOf == null || valueOf.intValue() != i) {
                    context = new l7s(context, dhr0.u().c);
                }
            }
            this.e = pos0Var;
            this.f = aVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            p0(cn70.b(8));
            m0(cn70.b(8));
            n0(cn70.b(8));
            o0(cn70.b(8));
            return new nhz(this.e, this.f);
        }
    }

    public nhz(pos0 pos0Var, nos0.a aVar) {
        this.h1 = pos0Var;
        this.i1 = aVar;
    }

    @Override // xsna.vpi
    public final void bo(b33 b33Var) {
        this.i1.a();
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-926588266);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-926588266, 8, -1, "com.vk.video.growth.impl.listing.ListingBottomSheet.ThemedContent (ListingBottomSheet.kt:36)");
        }
        q630 f = txj0.f(q630.a.a, 1.0f);
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new p6y(this, 4);
            aVar.R(x);
        }
        gzs gzsVar = (gzs) x;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new dgm(this, 18);
            aVar.R(x2);
        }
        phz.b(this.h1, gzsVar, (gzs) x2, f, aVar, 3072);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.j1) {
            this.i1.onCancel();
        }
        super.onDismiss(dialogInterface);
    }
}
