package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class itr extends swc0 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itr(el11 el11Var) {
        super(bd2.a());
        cd2.U0.getClass();
        this.b = el11Var;
    }

    @Override // defpackage.swc0
    public final qwc0 create(Context context, int i, Object obj) {
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                if (((Integer) obj) == null) {
                    ny61.r("An identifier is required to retrieve a View instance.");
                    return null;
                }
                Object m = ((w4u) obj2).m(r3.intValue());
                if (m instanceof qwc0) {
                    return (qwc0) m;
                }
                if (m instanceof View) {
                    return new htr((View) m);
                }
                ak00.h("Unable to find a PlatformView or View instance: ", obj, Extension.FIX_SPACE, m);
                return null;
            default:
                pwc0 pwc0Var = (pwc0) obj;
                Objects.requireNonNull(pwc0Var);
                return new owc0(context, ((nm31) ((LongSparseArray) ((el11) obj2).b).get(pwc0Var.a)).w);
        }
    }

    public itr(w4u w4uVar) {
        super(vzt0.a);
        this.b = w4uVar;
    }
}
