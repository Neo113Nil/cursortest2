package xsna;

import com.android.billingclient.api.BillingResult;
import xsna.dug0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bh10 implements io.reactivex.rxjava3.functions.l {
    public static int a(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static BillingResult b(int i, String str) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        newBuilder.setDebugMessage(str);
        return newBuilder.build();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        dug0.c cVar = (dug0.c) obj;
        return (!cVar.d() || cVar.b <= 0.95f) ? cVar : dug0.c.b(1.0f);
    }
}
