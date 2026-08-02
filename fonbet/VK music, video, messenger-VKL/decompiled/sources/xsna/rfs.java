package xsna;

import java.util.ArrayList;
import one.video.gl.GLESUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rfs implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rfs(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ufs ufsVar = (ufs) obj2;
                xfs xfsVar = (xfs) obj;
                GLESUtils.a(((r1t) obj3).b);
                try {
                    ufsVar.p = xfsVar.v(i2);
                    s3q0 s3q0Var = s3q0.a;
                    GLESUtils.a(0);
                    return s3q0.a;
                } catch (Throwable th) {
                    GLESUtils.a(0);
                    throw th;
                }
            default:
                ((rx90) obj3).d.invoke((ArrayList) obj2);
                ((com.vk.permission.d) obj).h.remove(Integer.valueOf(i2));
                return s3q0.a;
        }
    }
}
