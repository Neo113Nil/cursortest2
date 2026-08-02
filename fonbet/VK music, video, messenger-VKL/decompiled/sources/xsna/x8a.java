package xsna;

import android.os.Bundle;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CatalogMarketCustomParamsHelper.kt */
/* loaded from: classes18.dex */
public final class x8a implements p7f0, ihk, l08 {
    public Object b;

    public /* synthetic */ x8a(Object obj) {
        this.b = obj;
    }

    @Override // xsna.ihk
    public void a(PhotoAttachment photoAttachment) {
        h0c0.a((h0c0) this.b, photoAttachment);
    }

    @Override // xsna.l08
    public void b(k08 k08Var) {
        Object obj;
        pid0 pid0Var = (pid0) this.b;
        List<? extends pmc> list = pid0Var.m;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof c5u) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c5u c5uVar = (c5u) obj;
            if (c5uVar.a == k08Var.a && epx.f(c5uVar.b, k08Var.b)) {
                break;
            }
        }
        c5u c5uVar2 = (c5u) obj;
        if (c5uVar2 != null) {
            pid0Var.e(c5uVar2, k08Var.c);
        }
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        return (io.reactivex.rxjava3.disposables.c) this.b;
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj2;
        io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) this.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.b = cVar;
    }

    public x8a(int i) {
        this.b = new Bundle();
    }
}
