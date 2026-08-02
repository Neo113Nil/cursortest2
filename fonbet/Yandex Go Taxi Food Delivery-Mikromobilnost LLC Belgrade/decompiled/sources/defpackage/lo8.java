package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.entities.SetCardStatusScreenEntity$SetResultState$StateType;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.k;
import com.ybsdk.widgets.common.l;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class lo8 implements ev31 {
    public static ho8 a(String str) {
        return new ho8(new k(pc70.a, str != null ? g8e.i(Text.Companion, str) : null, null, null, null, null, null, 252));
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        OperationProgressView.StatusIcon statusIcon;
        bo8 bo8Var = (bo8) obj;
        String str = bo8Var.b;
        u8j0 u8j0Var = bo8Var.a;
        if (u8j0Var instanceof t8j0) {
            return a(str);
        }
        if (u8j0Var instanceof s8j0) {
            return new go8(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        if (!(u8j0Var instanceof r8j0)) {
            w511.b();
            return null;
        }
        k2r0 k2r0Var = (k2r0) ((r8j0) u8j0Var).a;
        if (k2r0Var instanceof i2r0) {
            return new fo8(((i2r0) k2r0Var).a);
        }
        if (!(k2r0Var instanceof j2r0)) {
            if (k2r0Var instanceof h2r0) {
                return a(str);
            }
            w511.b();
            return null;
        }
        j2r0 j2r0Var = (j2r0) k2r0Var;
        SetCardStatusScreenEntity$SetResultState$StateType setCardStatusScreenEntity$SetResultState$StateType = j2r0Var.a;
        g2r0 g2r0Var = j2r0Var.e;
        int i = ko8.a[setCardStatusScreenEntity$SetResultState$StateType.ordinal()];
        if (i == 1) {
            statusIcon = OperationProgressView.StatusIcon.SUCCESS;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            statusIcon = OperationProgressView.StatusIcon.ERROR;
        }
        l lVar = new l(statusIcon);
        Text.Constant i2 = g8e.i(Text.Companion, j2r0Var.b);
        Text.Constant constant = new Text.Constant(j2r0Var.c);
        rbv f = g2r0Var != null ? job1.f(g2r0Var.c, new sd8(22)) : null;
        g2r0 g2r0Var2 = j2r0Var.d;
        return new io8(new k(lVar, i2, null, constant, g2r0Var2 != null ? new Text.Constant(g2r0Var2.a) : null, g2r0Var != null ? new Text.Constant(g2r0Var.a) : null, f, HProv.PP_CONTAINER_EXTENSION));
    }
}
