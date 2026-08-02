package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.domain.LocalVariableName;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class evt0 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        vut0 vut0Var = (vut0) obj;
        u8j0 u8j0Var = vut0Var.a;
        if (!(u8j0Var instanceof r8j0)) {
            if (u8j0Var instanceof s8j0) {
                return new dvt0(new eu01((Text.Constant) null, false, (rbv) null, (Text.Constant) null, (Text) null, (rtz0) null, HProv.PP_VERSION_TIMESTAMP), true, new avt0(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534)));
            }
            if (!(u8j0Var instanceof t8j0)) {
                w511.b();
                return null;
            }
            return new dvt0(new eu01((Text.Constant) null, false, (rbv) null, (Text.Constant) null, (Text) null, (rtz0) null, HProv.PP_VERSION_TIMESTAMP), false, bvt0.a);
        }
        wtt0 wtt0Var = (wtt0) ((r8j0) u8j0Var).a;
        rr51 rr51Var = wtt0Var.a;
        String str = vut0Var.c;
        boolean z = vut0Var.e;
        ListBuilder a = rcc.a();
        a.add(new c5z(LocalVariableName.TRUST_ID.getVarName(), wtt0Var.c.a));
        if (str != null) {
            a.add(new c5z(LocalVariableName.AUTO_TOPUP_PAYMENT_METHOD_ID.getVarName(), str));
        }
        a.add(new c5z(LocalVariableName.SHOULD_HIDE_AUTO_TOPUP_PAYMENT_WIDGET.getVarName(), String.valueOf(!z)));
        return new dvt0(new eu01(g8e.i(Text.Companion, wtt0Var.b.a), true, job1.f(wtt0Var.c.c, new x8t0(7)), new Text.Constant(wtt0Var.c.b), (Text) null, (rtz0) null, 112), true, new zut0(rr51Var, a.j(), vut0Var.b, vut0Var.d));
    }
}
