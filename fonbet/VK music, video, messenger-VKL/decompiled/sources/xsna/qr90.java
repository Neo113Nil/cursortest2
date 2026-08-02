package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;
import xsna.bbv0;
import xsna.iv9;
import xsna.kku0;
import xsna.sr90;
import xsna.v4c;
import xsna.vl7;

/* compiled from: PayMethodConfirmationPresenter.kt */
/* loaded from: classes6.dex */
public abstract class qr90<T extends PayMethodData, Router extends kku0> implements or90 {
    public final pr90 b;
    public final a8c c;
    public final Router d;
    public final sr90<? extends PayMethodData> e;
    public boolean f;
    public final fm7 g;
    public ArrayList h;

    /* JADX WARN: Multi-variable type inference failed */
    public qr90(pr90 pr90Var, PayMethodData payMethodData, a8c a8cVar, kku0 kku0Var) {
        this.b = pr90Var;
        this.c = a8cVar;
        this.d = kku0Var;
        this.e = sr90.a.a(payMethodData);
        bbv0.g.getClass();
        this.g = bbv0.a.f().b.h ? new fm7(this, new v4c()) : null;
        this.h = new ArrayList();
    }

    public nsa a(boolean z) {
        return new nsa(this.e, z, 2);
    }

    @Override // xsna.fm6
    public boolean a0() {
        return false;
    }

    public hfz[] c() {
        this.c.getClass();
        return new hfz[]{new wu80(a8c.a().e.c, a8c.b()), a(false)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c5, code lost:
    
        if (r2 != null) goto L18;
     */
    @Override // xsna.fm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        ArrayList arrayList;
        hfz[] hfzVarArr;
        RandomAccess randomAccess;
        if (this.h.isEmpty()) {
            rmk0 rmk0Var = new rmk0(3);
            rmk0Var.b(c());
            rmk0Var.b(e());
            fm7 fm7Var = this.g;
            if (fm7Var != null) {
                ArrayList arrayList2 = fm7Var.b;
                bbv0.g.getClass();
                if (bbv0.a.f().b.h) {
                    int i = v4c.a;
                    List l = e43.l(new v4c.a(), new v4c.a(), new v4c.a(), new v4c.a());
                    arrayList2.add(new cm7(false));
                    arrayList2.add(new vl7(e43.l(new vl7.b(), new vl7.a())));
                    arrayList2.add(new q1e0());
                    arrayList2.add(new yl7("Это мой заголовок, но он с другой стороны очень длинный", "А это подзаголовок"));
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = l.iterator();
                    while (it.hasNext()) {
                        ((v4c.a) it.next()).getClass();
                        arrayList3.add(new iv9.a());
                    }
                    arrayList2.add(new iv9(arrayList3));
                    randomAccess = arrayList2;
                } else {
                    randomAccess = EmptyList.b;
                }
                if (randomAccess != null) {
                    hfzVarArr = (hfz[]) ((Collection) randomAccess).toArray(new hfz[0]);
                }
            }
            hfzVarArr = new hfz[0];
            rmk0Var.b(hfzVarArr);
            ArrayList<Object> arrayList4 = rmk0Var.a;
            arrayList = e43.o(arrayList4.toArray(new hfz[arrayList4.size()]));
            f(arrayList);
        } else {
            arrayList = this.h;
        }
        j(arrayList);
    }

    public hfz[] e() {
        return new hfz[0];
    }

    public void f(ArrayList arrayList) {
        arrayList.add(i());
    }

    @Override // xsna.or90
    public final void g(boolean z) {
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((hfz) it.next()) instanceof cm7) {
                break;
            } else {
                i++;
            }
        }
        arrayList.set(i, new cm7(z));
        fm7 fm7Var = this.g;
        if (fm7Var != null) {
            qr90 qr90Var = fm7Var.a;
            ArrayList arrayList2 = new ArrayList(qr90Var.h);
            if (z) {
                arrayList2.add(e43.h(arrayList2), new z8f0());
            } else {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((hfz) it2.next()) instanceof z8f0) {
                        it2.remove();
                    }
                }
            }
            qr90Var.j(arrayList2);
        }
    }

    public boolean h() {
        return true;
    }

    public hfz i() {
        String str;
        this.c.getClass();
        int i = a8c.b().b;
        String str2 = sua.i(i, ',') + (char) 8201 + a8c.b().d.h();
        Context context = this.b.getContext();
        if (context == null || (str = context.getString(R.string.vk_pay_checkout_vkpay_method_pay_amount, str2)) == null) {
            str = "";
        }
        return new ckl(str, h());
    }

    public final void j(List<? extends hfz> list) {
        pr90 pr90Var = this.b;
        boolean z = false;
        if (!pr90Var.wn().d.isEmpty()) {
            if (pr90Var.wn().d.size() == list.size() || pr90Var.wn().d.isEmpty()) {
                List<? extends hfz> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i2 = i + 1;
                        if (!((hfz) it.next()).getClass().equals(pr90Var.wn().d.get(i).getClass())) {
                            z = true;
                            break;
                        }
                        i = i2;
                    }
                }
                z = !z;
            } else {
                z = true;
            }
        }
        if (z) {
            czs.a(pr90Var.requireView());
        }
        pr90Var.wn().setItems(i7o0.a(list));
        zmp0.a((ViewGroup) pr90Var.requireView(), pr90Var.k);
        this.h = new ArrayList(list);
    }

    @Override // xsna.fm6
    public final void onResume() {
        if (this.f) {
            j(this.h);
        }
        this.f = true;
    }

    @Override // xsna.or90
    public void x0() {
        this.d.i();
    }

    @Override // xsna.fm6
    public final void onDestroy() {
    }

    @Override // xsna.fm6
    public final void onStart() {
    }
}
