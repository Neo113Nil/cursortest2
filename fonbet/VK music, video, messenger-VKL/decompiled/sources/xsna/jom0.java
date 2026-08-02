package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class jom0 implements yzs {
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int[] d;

    public /* synthetic */ jom0(String str, boolean z, int[] iArr) {
        this.b = str;
        this.c = z;
        this.d = iArr;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VKApiException h;
        per0 per0Var = (per0) obj3;
        String a = ((vx70.b) ((rsj0) obj).a()).a();
        String str = this.b;
        VKApiException i = mnh0.i(per0Var, str, a);
        if (i != null) {
            throw i;
        }
        if (!this.c || (h = mnh0.h(per0Var, str, this.d)) == null) {
            return s3q0.a;
        }
        throw h;
    }
}
