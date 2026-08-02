package defpackage;

import com.yandex.go.coroutines.b;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.interactor.common.state.AddressesUiStateInteractor$addressesUiStateFlow$$inlined$start$1;
import com.yandex.go.summary.ui.model.common.address.AddressBodyUiState$AddressTextStyle;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.address.experiment.AddressItemMode;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;
import ru.yandex.taxi.address.experiment.a;

/* loaded from: classes14.dex */
public final class aa1 {
    public final zuj0 a;
    public final tpr b;

    public aa1(cov0 cov0Var, zuj0 zuj0Var) {
        this.a = zuj0Var;
        this.b = e.t(b.d(new com.yandex.go.summary.interactor.common.state.b(cov0Var.d, this), new AddressesUiStateInteractor$addressesUiStateFlow$$inlined$start$1(2, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y81 a(aa1 aa1Var, a aVar, boolean z) {
        n81 l81Var;
        au2 a = z ? u2b1.a() : xna1.a();
        yw0 yw0Var = aVar.f;
        String str = aVar.h;
        String str2 = yw0Var.a;
        if (str2 == null) {
            str2 = "";
        }
        n81 n81Var = null;
        ix0 ix0Var = new ix0(new ov0(mja1.b(str2, null, 6), yw0Var.e, yw0Var.d, a));
        String str3 = aVar.a;
        AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
        AddressBodyUiState$AddressTextStyle addressBodyUiState$AddressTextStyle = AddressBodyUiState$AddressTextStyle.TITLE_TEXT_STYLE;
        CharSequence charSequence = aVar.b;
        CharSequence charSequence2 = evu0.J(charSequence) ? aVar.e : charSequence;
        AppColor$Palette appColor$Palette2 = evu0.J(charSequence) ? appColor$Palette : AppColor$Palette.Text;
        AddressBodyUiState$AddressTextStyle addressBodyUiState$AddressTextStyle2 = AddressBodyUiState$AddressTextStyle.SUBTITLE_TEXT_STYLE;
        boolean z2 = aVar.l == AddressItemMode.LOADING;
        oq0 oq0Var = (aVar.p != NewbiesRedesignPointsABExperiment.SummaryAddressStyle.ONLY_CITY || evu0.J(str3)) ? new oq0(charSequence2, appColor$Palette2, addressBodyUiState$AddressTextStyle2, true, str3, appColor$Palette, addressBodyUiState$AddressTextStyle, false, z2) : new oq0(str3, appColor$Palette, addressBodyUiState$AddressTextStyle, false, charSequence2, appColor$Palette2, addressBodyUiState$AddressTextStyle2, true, z2);
        v81 v81Var = z ? t81.a : r81.a;
        if (str.length() > 0) {
            n81Var = new m81(str, v81Var);
        } else if (aVar.o) {
            l81Var = new l81(new ov0(mja1.b("", null, 6), AppColor$Palette.Text, new up2(up2.b), hq91.c()), v81Var, ((avj0) aa1Var.a).h(kyh0.add_route_stop));
            return new y81(ix0Var, oq0Var, l81Var, !z ? u81.a : s81.a, aVar.j, aVar.m);
        }
        l81Var = n81Var;
        return new y81(ix0Var, oq0Var, l81Var, !z ? u81.a : s81.a, aVar.j, aVar.m);
    }
}
