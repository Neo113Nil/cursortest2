package xsna;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fh50;

/* compiled from: TextContextMenuModifier.kt */
/* loaded from: classes11.dex */
public final class fdo0 {

    /* compiled from: TextContextMenuModifier.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<izs<? super uco0, ? extends Boolean>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(izs<? super uco0, ? extends Boolean> izsVar) {
            ((tco0) this.receiver).b.j(izsVar);
            return s3q0.a;
        }
    }

    public static final vco0 a(htl htlVar) {
        ido0 ido0Var;
        tco0 tco0Var = new tco0();
        hr80.H(htlVar, xco0.a, new np5(22, new k170(tco0Var, 29), new a(1, tco0Var, tco0.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0)));
        fh50 fh50Var = new fh50((Object) null);
        fh50<uco0> fh50Var2 = tco0Var.a;
        Object[] objArr = fh50Var2.a;
        int i = fh50Var2.b;
        uco0 uco0Var = null;
        int i2 = 0;
        boolean z = true;
        while (true) {
            ido0Var = ido0.b;
            if (i2 >= i) {
                break;
            }
            uco0 uco0Var2 = (uco0) objArr[i2];
            if (!z || uco0Var2 != ido0Var) {
                if (uco0Var2 != ido0Var || uco0Var != ido0Var) {
                    if (uco0Var2 != ido0Var) {
                        fh50<izs<uco0, Boolean>> fh50Var3 = tco0Var.b;
                        Object[] objArr2 = fh50Var3.a;
                        int i3 = fh50Var3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((izs) objArr2[i4]).invoke(uco0Var2)).booleanValue()) {
                            }
                        }
                    }
                    fh50Var.j(uco0Var2);
                    z = false;
                    uco0Var = uco0Var2;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (((uco0) (fh50Var.f() ? null : fh50Var.a[fh50Var.b - 1])) == ido0Var) {
            fh50Var.o(fh50Var.b - 1);
        }
        List list = fh50Var.c;
        List list2 = list;
        if (list == null) {
            fh50.b<E> bVar = new fh50.b<>(fh50Var);
            fh50Var.c = bVar;
            list2 = bVar;
        }
        return new vco0(list2);
    }
}
