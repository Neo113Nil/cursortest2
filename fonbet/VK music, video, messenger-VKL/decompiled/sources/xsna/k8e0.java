package xsna;

import android.graphics.RectF;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import java.util.List;
import xsna.qpn0;

/* compiled from: ProtectionGroup.java */
/* loaded from: classes12.dex */
public final class k8e0 implements qpn0.c {
    public final ArrayList<androidx.core.view.insets.a> a = new ArrayList<>();
    public final qpn0 b;
    public h4x c;
    public h4x d;
    public int e;
    public boolean f;

    public k8e0(qpn0 qpn0Var, ArrayList arrayList) {
        h4x h4xVar = h4x.e;
        this.c = h4xVar;
        this.d = h4xVar;
        f(arrayList, false);
        f(arrayList, true);
        ArrayList<qpn0.c> arrayList2 = qpn0Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            d(qpn0Var.c, qpn0Var.d);
            e(qpn0Var.e);
        }
        this.b = qpn0Var;
    }

    @Override // xsna.qpn0.c
    public final void a() {
        this.e++;
    }

    @Override // xsna.qpn0.c
    public final void b() {
        int i = this.e;
        boolean z = i > 0;
        int i2 = i - 1;
        this.e = i2;
        if (z && i2 == 0) {
            g();
        }
    }

    @Override // xsna.qpn0.c
    public final void c(int i, h4x h4xVar, RectF rectF) {
        ArrayList<androidx.core.view.insets.a> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).getClass();
            if ((0 & i) != 0) {
                throw null;
            }
        }
    }

    @Override // xsna.qpn0.c
    public final void d(h4x h4xVar, h4x h4xVar2) {
        this.c = h4xVar;
        this.d = h4xVar2;
        g();
    }

    @Override // xsna.qpn0.c
    public final void e(int i) {
        ArrayList<androidx.core.view.insets.a> arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).a(i);
        }
    }

    public final void f(List<androidx.core.view.insets.a> list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.core.view.insets.a aVar = list.get(i);
            aVar.getClass();
            if ((aVar instanceof q7g) == z) {
                k8e0 k8e0Var = aVar.c;
                if (k8e0Var != null) {
                    throw new IllegalStateException(aVar + " (" + (i + 1) + DomExceptionUtils.SEPARATOR + size + ") is already controlled by " + k8e0Var + " but is still added to " + this);
                }
                aVar.c = this;
                this.a.add(aVar);
            }
        }
    }

    public final void g() {
        ArrayList<androidx.core.view.insets.a> arrayList = this.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        androidx.core.view.insets.a aVar = arrayList.get(size);
        h4x h4xVar = this.c;
        h4x h4xVar2 = this.d;
        aVar.a = h4xVar;
        aVar.b = h4xVar2;
        throw null;
    }
}
