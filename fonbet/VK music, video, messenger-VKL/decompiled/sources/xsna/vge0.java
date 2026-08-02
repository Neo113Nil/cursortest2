package xsna;

import com.android.billingclient.api.Purchase;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vge0 implements izs {
    public final /* synthetic */ com.vk.billing.h b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Purchase e;
    public final /* synthetic */ ner0 f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ vge0(com.vk.billing.h hVar, AtomicInteger atomicInteger, int i, Purchase purchase, ner0 ner0Var, boolean z) {
        this.b = hVar;
        this.c = atomicInteger;
        this.d = i;
        this.e = purchase;
        this.f = ner0Var;
        this.g = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = this.g;
        this.b.h(this.c, this.d, this.e, (String) obj, this.f, z);
        return s3q0.a;
    }
}
