package xsna;

import android.net.Uri;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hkv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ hkv(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                return ((Uri.Builder) obj).encodedAuthority(str);
            case 1:
                qgi0.h((tgi0) obj, str);
                return s3q0.a;
            default:
                bpn0 bpn0Var = c7r0.a;
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new p68(3, (String) obj, str)).r0(asu0.a.c());
        }
    }
}
