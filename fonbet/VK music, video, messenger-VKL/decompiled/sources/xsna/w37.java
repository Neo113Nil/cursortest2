package xsna;

import android.app.Activity;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.mvi.binder.BinderLifecycleMode;
import java.util.ArrayList;
import java.util.List;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w37 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w37(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sum0.d a;
        boolean z;
        switch (this.b) {
            case 0:
                ((com.vk.mvi.binder.c) this.c).a.a(new q34((com.vk.movika.sdk.base.observable.u) this.d, (pk50) obj, (BinderLifecycleMode) this.e, (iyp) this.f));
                return s3q0.a;
            case 1:
                ((u2i) ((r2i) this.c).b.getValue()).a((Activity) this.d, (String) this.e, ((VKApiExecutionException) this.f).t());
                return s3q0.a;
            default:
                izs izsVar = (izs) this.c;
                sum0.c cVar = (sum0.c) this.d;
                izs izsVar2 = (izs) this.e;
                List list = (List) this.f;
                int intValue = ((Integer) obj).intValue();
                izsVar.invoke(sum0.c.a(cVar, false, null, intValue, false, 11));
                ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    sum0.d dVar = (sum0.d) obj2;
                    boolean z2 = true;
                    if (cVar.d) {
                        if (i != intValue) {
                            z2 = dVar.k;
                        } else if (dVar.k) {
                            z = false;
                            a = sum0.d.a(dVar, null, null, null, false, null, false, null, false, 0, null, z, false, 3071);
                        }
                        z = z2;
                        a = sum0.d.a(dVar, null, null, null, false, null, false, null, false, 0, null, z, false, 3071);
                    } else {
                        a = sum0.d.a(dVar, null, null, null, false, null, false, null, false, 0, null, i == intValue, false, 3071);
                    }
                    arrayList.add(a);
                    i = i2;
                }
                izsVar2.invoke(arrayList);
                return s3q0.a;
        }
    }
}
