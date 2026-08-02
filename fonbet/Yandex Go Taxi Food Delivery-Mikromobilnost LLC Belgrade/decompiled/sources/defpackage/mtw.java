package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.domain.InternetProviderWithPersonalAccountEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.keyboard.delegators.KeyboardTextButtonView;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes3.dex */
public final /* synthetic */ class mtw implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ mtw(int i, s6y s6yVar) {
        this.a = 22;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g render$lambda$12$lambda$8;
        zy11 onTextPressedCallback$lambda$0;
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                render$lambda$12$lambda$8 = InternetPaymentSelectProviderFragment.render$lambda$12$lambda$8((g) obj);
                return render$lambda$12$lambda$8;
            case 1:
                InternetProviderWithPersonalAccountEntity internetProviderWithPersonalAccountEntity = (InternetProviderWithPersonalAccountEntity) obj;
                euw euwVar = new euw(internetProviderWithPersonalAccountEntity);
                b bVar = Text.Companion;
                String name = internetProviderWithPersonalAccountEntity.getProvider().getName();
                bVar.getClass();
                Text.Constant constant = new Text.Constant(name);
                String subtitle = internetProviderWithPersonalAccountEntity.getProvider().getSubtitle();
                Text.Constant constant2 = subtitle != null ? new Text.Constant(subtitle) : null;
                ThemedImageUrlEntity logo = internetProviderWithPersonalAccountEntity.getProvider().getLogo();
                return new bj01(euwVar, constant, constant2, logo != null ? new qtw(logo, i2) : new qir(18), Integer.valueOf(vxg0.ybsdk_ic_arrow_select), false, 192);
            case 2:
                return new pbv((String) obj, (ccv) null, rev.o, (dcv) null, (vfv) null, 58);
            case 3:
                return new pbv((dcv) new ccv(myg0.ybsdk_ic_internet_provider_placeholder), (dcv) new ccv(myg0.ybsdk_ic_internet_provider_placeholder), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 4:
                h3x h3xVar = new h3x((ListItemComponent) obj);
                ListItemComponent listItemComponent = (ListItemComponent) ((View) h3xVar.R);
                listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent.setTrailCompanionMode(0);
                listItemComponent.setTrailCompanionTextColorAttr(xng0.textMain);
                return h3xVar;
            case 5:
                return null;
            case 6:
                return ((aax) obj).a();
            case 7:
                return ((aax) obj).a();
            case 8:
                return oyr.p("stringifyParam(", (String) obj, Extension.C_BRAKE);
            case 9:
                onTextPressedCallback$lambda$0 = KeyboardTextButtonView.onTextPressedCallback$lambda$0(((Character) obj).charValue());
                return onTextPressedCallback$lambda$0;
            case 10:
                meo meoVar = ymx.b;
                return zy11Var;
            case 11:
                meo meoVar2 = ymx.b;
                return obj;
            case 12:
                meo meoVar3 = ymx.b;
                return zmx.d(obj);
            case 13:
                return zy11Var;
            case 14:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 15:
                return Boolean.valueOf(Result.a(((Result) obj).getValue()) instanceof FailDataException);
            case 16:
                return Boolean.valueOf(Result.a(((Result) obj).getValue()) instanceof FailDataException);
            case 17:
                ((y1u0) ((zrx) obj)).a.r(new qu(9));
                return zy11Var;
            case 18:
                List list = (List) obj;
                return new androidx.compose.foundation.lazy.grid.b(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 19:
                ((Integer) obj).getClass();
                i4y i4yVar = p4y.a;
                return EmptyList.a;
            case 20:
                ((Integer) obj).getClass();
                i4y i4yVar2 = p4y.a;
                return -1;
            case 21:
                List list2 = (List) obj;
                return new androidx.compose.foundation.lazy.b(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 22:
                return zy11Var;
            case 23:
                return zy11Var;
            case 24:
                return zy11Var;
            case 25:
                return zy11Var;
            case 26:
                return zy11Var;
            case 27:
                RobotoTextView robotoTextView = new RobotoTextView((Context) obj, null, 0, 6, null);
                robotoTextView.setImportantForAccessibility(2);
                androidx.core.view.b.p(robotoTextView, null);
                robotoTextView.setIncludeFontPadding(false);
                return robotoTextView;
            case 28:
                RobotoTextView robotoTextView2 = new RobotoTextView((Context) obj, null, 0, 6, null);
                robotoTextView2.setImportantForAccessibility(2);
                androidx.core.view.b.p(robotoTextView2, null);
                robotoTextView2.setIncludeFontPadding(false);
                return robotoTextView2;
            default:
                dai0 dai0Var = ((ypy) obj).f;
                if (dai0Var instanceof ypy) {
                    return (ypy) dai0Var;
                }
                return null;
        }
    }

    public /* synthetic */ mtw(int i) {
        this.a = i;
    }

    public /* synthetic */ mtw(rtw rtwVar) {
        this.a = 1;
    }
}
