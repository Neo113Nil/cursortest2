package xsna;

import com.vk.auth.api.models.AuthResult;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class s45 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ s45(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return AuthResult.a((AuthResult) obj, this.c, null, null, null, 0L, null, null, 8388575);
            case 1:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                return Boolean.valueOf(epx.f(((l260) obj).a, this.c));
        }
    }
}
