package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ActionsSheet.kt */
/* loaded from: classes18.dex */
public final class v70 {
    public final ArrayList a;
    public final izs<u60, s3q0> b;
    public final gzs<s3q0> c;
    public dw20 d;

    /* compiled from: ActionsSheet.kt */
    public static final class a extends kmu0 {
        public final List h;
        public final e1 i;

        public a(Context context, ArrayList arrayList, e1 e1Var) {
            super(context, dig0.b);
            this.h = arrayList;
            this.i = e1Var;
            T0();
            P0();
            U0(new jai(398664128, new u70(this, 0), true));
        }
    }

    public /* synthetic */ v70(ArrayList arrayList, izs izsVar) {
        this(arrayList, izsVar, null);
    }

    public final void a(Context context) {
        this.d = new a(context, this.a, new e1(this, 5)).a0(new f1(this, 3)).I0(null);
    }

    public v70(ArrayList arrayList, izs izsVar, yuh yuhVar) {
        this.a = arrayList;
        this.b = izsVar;
        this.c = yuhVar;
    }
}
