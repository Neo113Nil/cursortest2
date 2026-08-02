package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.g;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class py3 implements ev31 {
    public final Context a;
    public final w530 b;

    public py3(Context context, w530 w530Var) {
        this.a = context;
        this.b = w530Var;
    }

    public final b730 a(MoneyEntity moneyEntity, String str, fsi0 fsi0Var, boolean z, boolean z2) {
        BigDecimal amount;
        BigInteger bigInteger;
        String str2 = fsi0Var.c;
        String str3 = str == null ? str2 : str;
        String bigInteger2 = (moneyEntity == null || (amount = moneyEntity.getAmount()) == null || (bigInteger = amount.toBigInteger()) == null) ? null : bigInteger.toString();
        if (bigInteger2 == null) {
            bigInteger2 = "";
        }
        String str4 = bigInteger2;
        return new b730(g.a(g.z, str4, new cyy(false, false), false, null, new Text.Constant(fsi0Var.d), new Text.Constant(g8e.o("0 ", NumberFormatUtils$Currencies.RUB.getSymbol())), null, z2, null, null, evu0.J(str4) ? null : new Text.Constant(NumberFormatUtils$Currencies.RUB.getSymbol()), false, vng.t(xxg0.ybsdk_autotopup_saver_source_background, this.a), null, true, 0, false, 0, 0, null, null, null, 33510220), new hsg(str == null ? null : g8e.i(Text.Companion, str2), g8e.i(Text.Companion, str3), new ColorModel.Attr(z ? ung0.ybColor_textIcon_negative : str == null ? ung0.ybColor_textIcon_secondary : ung0.ybColor_textIcon_primary)));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.ev31
    public final java.lang.Object q(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py3.q(java.lang.Object):java.lang.Object");
    }
}
