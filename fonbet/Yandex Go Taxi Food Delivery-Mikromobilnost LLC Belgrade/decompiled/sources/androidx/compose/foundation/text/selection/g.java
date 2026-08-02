package androidx.compose.foundation.text.selection;

import defpackage.asy0;
import defpackage.ckq0;
import defpackage.eja1;
import defpackage.ho40;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.zkq0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final /* synthetic */ class g implements sls {
    public final /* synthetic */ i a;

    public /* synthetic */ g(i iVar) {
        this.a = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, kk2] */
    /* JADX WARN: Type inference failed for: r15v8, types: [T, asy0] */
    @Override // defpackage.sls
    public final Object invoke() {
        int i;
        tse tseVar;
        i iVar = this.a;
        iVar.x = true;
        iVar.o();
        iVar.r.setValue(null);
        iVar.s.setValue(null);
        if (iVar.u && iVar.i()) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            zkq0 zkq0Var = iVar.a;
            ArrayList c = zkq0Var.c(iVar.k());
            ListIterator listIterator = c.listIterator(c.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                ckq0 ckq0Var = (ckq0) zkq0Var.a().e(((ho40) listIterator.previous()).a);
                if (ckq0Var != null && ckq0Var.a.b != ckq0Var.b.b) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (i != -1) {
                int size = c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    ho40 ho40Var = (ho40) c.get(i2);
                    ckq0 ckq0Var2 = (ckq0) zkq0Var.a().e(ho40Var.a);
                    if (ckq0Var2 != null) {
                        ?? d = ho40Var.d();
                        long c2 = eja1.c(ckq0Var2.a.b, ckq0Var2.b.b);
                        boolean z = i2 >= i;
                        long j = ho40Var.a;
                        if (z) {
                            ref$ObjectRef.element = d;
                            ref$ObjectRef2.element = new asy0(c2);
                            ref$LongRef.element = j;
                        }
                    } else {
                        i2++;
                    }
                }
            }
            T t = ref$ObjectRef.element;
            if (t != 0 && ref$ObjectRef2.element != 0 && ref$LongRef.element != 0 && ((CharSequence) t).length() > 0 && (tseVar = iVar.v) != null) {
                tje.N(tseVar, null, null, new SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(iVar, ref$ObjectRef, ref$ObjectRef2, ref$LongRef, null), 3);
            }
        }
        iVar.u = false;
        return zy11.a;
    }
}
