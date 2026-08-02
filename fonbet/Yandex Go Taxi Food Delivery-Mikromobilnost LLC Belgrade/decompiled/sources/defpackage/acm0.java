package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class acm0 implements ev31 {
    public final Context a;
    public final w530 b;

    public acm0(Context context, w530 w530Var) {
        this.a = context;
        this.b = w530Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if ((r2 != null ? r2.a : null) != null) goto L29;
     */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Text g;
        Text text;
        MoneyEntity moneyEntity;
        lur0 lur0Var;
        rbv rbvVar;
        Text.Constant constant;
        ebm0 ebm0Var = (ebm0) obj;
        ham0 ham0Var = ebm0Var.j;
        iam0 iam0Var = ebm0Var.f;
        lur0 lur0Var2 = ebm0Var.a;
        if (ebm0Var.b) {
            return new vbm0(r501.a(ebm0Var.c, null, null, null, null, null, null, null, null, null, null, null, null, 65534), lur0Var2);
        }
        if (ebm0Var.d) {
            return new wbm0(lur0Var2);
        }
        if (iam0Var == null) {
            x4c.g("Wrong state of SavingsDashboardViewState savingsDashboardDataEntity is missing", null, null, null, 14);
            return new vbm0(r501.a(ebm0Var.c, null, null, null, null, null, null, null, null, null, null, null, null, 65534), lur0Var2);
        }
        List list = iam0Var.f;
        List list2 = iam0Var.h;
        boolean z = a.u0(list) instanceof jdm0;
        gam0 gam0Var = (gam0) a.S(ebm0Var.g, iam0Var.e);
        boolean z2 = (ham0Var != null ? ham0Var.b : null) == null;
        rbv rbvVar2 = iam0Var.a;
        Text text2 = iam0Var.b;
        Text.Constant constant2 = ham0Var != null ? ham0Var.a : null;
        MoneyEntity moneyEntity2 = iam0Var.c;
        if (!z) {
        }
        moneyEntity2 = null;
        ArrayList m0 = a.m0(list, list2);
        int size = list2.size();
        rbv rbvVar3 = ebm0Var.e;
        Text.Constant constant3 = constant2;
        xbm0 xbm0Var = new xbm0(gam0Var != null ? gam0Var.e : new ColorModel.Attr(ung0.ybColor_textIcon_primary));
        if (ham0Var == null || (g = ham0Var.b) == null) {
            g = d.g(gam0Var != null ? gam0Var.d : null);
        }
        int i = z2 ? l1i0.Widget_YB_Text_Title3 : l1i0.Widget_YB_Text_Body2;
        if (gam0Var != null) {
            MoneyEntity moneyEntity3 = gam0Var.a;
            String a = w530.a(this.b, moneyEntity3.getAmount(), moneyEntity3.getCurrency(), true, null, false, 56);
            text = g;
            SpannableString valueOf = SpannableString.valueOf(a);
            moneyEntity = moneyEntity2;
            int i2 = l1i0.Widget_YB_Text_Title3;
            Context context = this.a;
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, i2);
            lur0Var = lur0Var2;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(gam0Var.b.get(context));
            rbvVar = rbvVar2;
            valueOf.setSpan(textAppearanceSpan, 0, a.length(), 33);
            valueOf.setSpan(foregroundColorSpan, 0, a.length(), 33);
            Text.Companion.getClass();
            constant = new Text.Constant(valueOf);
        } else {
            text = g;
            moneyEntity = moneyEntity2;
            lur0Var = lur0Var2;
            rbvVar = rbvVar2;
            constant = null;
        }
        if (!z2) {
            constant = null;
        }
        return new ybm0(lur0Var, rbvVar, text2, constant3, moneyEntity, text, i, constant, m0, xbm0Var, size, ebm0Var.h, rbvVar3, gam0Var != null ? gam0Var.c : null, ebm0Var.i);
    }
}
