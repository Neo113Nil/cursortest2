package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.List;

/* loaded from: classes3.dex */
public final class ou20 implements ev31 {
    public mu20 a;

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        u8j0 u8j0Var = (u8j0) obj;
        if (u8j0Var instanceof s8j0) {
            return new ku20(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        if (u8j0Var instanceof t8j0) {
            return new lu20(lnb1.b());
        }
        if (!(u8j0Var instanceof r8j0)) {
            w511.b();
            return null;
        }
        gu20 gu20Var = (gu20) ((r8j0) u8j0Var).a;
        List list = gu20Var.a;
        PageHeaderEntity pageHeaderEntity = gu20Var.c;
        List c = aab1.c(list, new ft20(3, gu20Var), new ps20(this));
        Text.Constant i = g8e.i(Text.Companion, pageHeaderEntity.getTitle());
        ThemedImageUrlEntity image = pageHeaderEntity.getImage();
        rbv f = image != null ? job1.f(image, new ps20(7)) : null;
        String description = pageHeaderEntity.getDescription();
        stz0 stz0Var = new stz0(i, description != null ? new Text.Constant(description) : null, null, f, null, new ntz0(0), false, null, null, null, null, null, 32724);
        mu20 mu20Var = this.a;
        mu20 mu20Var2 = new mu20(c, stz0Var, vi01.c(mu20Var != null ? mu20Var.a : null, c), gu20Var.b);
        this.a = mu20Var2;
        return mu20Var2;
    }
}
