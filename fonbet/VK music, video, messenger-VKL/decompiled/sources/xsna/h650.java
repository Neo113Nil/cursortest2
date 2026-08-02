package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import xsna.g650;
import xsna.mck0;

/* compiled from: MusicSnippetsContentView.kt */
/* loaded from: classes3.dex */
public final class h650 implements mck0.a {
    public final /* synthetic */ j650 a;

    public h650(j650 j650Var) {
        this.a = j650Var;
    }

    @Override // xsna.mck0.a
    public final void a(int i, boolean z) {
        if (z) {
            return;
        }
        this.a.e.performHapticFeedback(0);
    }

    @Override // xsna.mck0.a
    public final void b(int i) {
        nbk0 nbk0Var;
        j650 j650Var = this.a;
        bgy bgyVar = j650Var.c;
        e650 e650Var = j650Var.g;
        List<? extends hfz> list = e650Var.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof pck0) {
                arrayList.add(obj);
            }
        }
        List<? extends hfz> list2 = e650Var.h;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof pck0) {
                arrayList2.add(obj2);
            }
        }
        pck0 pck0Var = (pck0) j5g.b0(i, arrayList2);
        if (pck0Var != null) {
            nck0 nck0Var = pck0Var.b;
            RecyclerView.e0 findViewHolderForAdapterPosition = j650Var.e.findViewHolderForAdapterPosition(i);
            xck0 xck0Var = findViewHolderForAdapterPosition instanceof xck0 ? (xck0) findViewHolderForAdapterPosition : null;
            if (xck0Var != null) {
                int currentPosition = xck0Var.l.getCurrentPosition();
                Integer valueOf = currentPosition != -1 ? Integer.valueOf(currentPosition) : null;
                if (valueOf != null && (nbk0Var = (nbk0) j5g.b0(valueOf.intValue(), nck0Var.g)) != null) {
                    bgyVar.invoke(new g650.d.c(nck0Var.a, nbk0Var.b, false, 24));
                }
            }
        }
        if (i < arrayList.size() - 2 || j650Var.j) {
            return;
        }
        bgyVar.invoke(g650.c.a.b);
    }
}
