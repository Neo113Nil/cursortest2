package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.MonthDayToMoneyDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.OncePerMonthDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.OncePerWeekDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.SelectedRegularAutotopupOptionDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.TwicePerMonthDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.b;
import com.ybsdk.feature.pfm.internal.domain.entities.PfmTextEntity$Amount$SignType;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class gdb0 {
    public final w530 a;

    public /* synthetic */ gdb0(w530 w530Var) {
        this.a = w530Var;
    }

    public adb0 a(xcb0 xcb0Var) {
        BigDecimal bigDecimal = xcb0Var.a;
        String str = xcb0Var.c;
        PfmTextEntity$Amount$SignType pfmTextEntity$Amount$SignType = xcb0Var.b;
        BigDecimal abs = bigDecimal.abs();
        String str2 = "";
        String a = w530.a(this.a, abs, str == null ? "" : str, false, null, str != null, 24);
        int i = fdb0.a[pfmTextEntity$Amount$SignType.ordinal()];
        if (i == 1) {
            str2 = "+";
        } else if (i == 2) {
            str2 = "–";
        } else if (i != 3) {
            w511.b();
            return null;
        }
        Text.Constant e = d.e(str2 + a);
        ThemedImageUrlEntity themedImageUrlEntity = xcb0Var.d;
        return new adb0(null, themedImageUrlEntity != null ? mi91.k(themedImageUrlEntity) : null, e, xcb0Var.e);
    }

    public giq0 b(SelectedRegularAutotopupOptionDto selectedRegularAutotopupOptionDto) {
        FrequencyType b = b.b(selectedRegularAutotopupOptionDto.getSelected());
        OncePerWeekDto oncePerWeek = selectedRegularAutotopupOptionDto.getOncePerWeek();
        w530 w530Var = this.a;
        ek11 ek11Var = null;
        w170 w170Var = oncePerWeek != null ? new w170(b.a(oncePerWeek.getDay()), bob1.g(oncePerWeek.getMoney(), w530Var)) : null;
        OncePerMonthDto oncePerMonth = selectedRegularAutotopupOptionDto.getOncePerMonth();
        u170 u170Var = oncePerMonth != null ? new u170(oncePerMonth.getDay(), bob1.g(oncePerMonth.getMoney(), w530Var), oncePerMonth.isLastDay()) : null;
        TwicePerMonthDto twicePerMonth = selectedRegularAutotopupOptionDto.getTwicePerMonth();
        if (twicePerMonth != null) {
            MonthDayToMoneyDto monthToMoney1 = twicePerMonth.getMonthToMoney1();
            a730 a730Var = new a730(monthToMoney1.getDay(), bob1.g(monthToMoney1.getMoney(), w530Var));
            MonthDayToMoneyDto monthToMoney2 = twicePerMonth.getMonthToMoney2();
            ek11Var = new ek11(a730Var, new a730(monthToMoney2.getDay(), bob1.g(monthToMoney2.getMoney(), w530Var)));
        }
        return new giq0(b, w170Var, u170Var, ek11Var);
    }
}
