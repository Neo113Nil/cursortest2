package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.feature.FeatureFlag;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.MobileBackendInvalidAuthorizationError;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes3.dex */
public final /* synthetic */ class at3 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ at3(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        rbv f;
        boolean viewBinding$lambda$21$lambda$6;
        zy11 createMonthAdapter$lambda$9;
        zy11 onDropDownToggle$lambda$0;
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        int i3 = 1;
        switch (i) {
            case 0:
                ls3 ls3Var = (ls3) obj;
                List list = ls3Var.a;
                Text.Empty empty = Text.Empty.INSTANCE;
                PageHeaderEntity pageHeaderEntity = ls3Var.b;
                ThemedImageUrlEntity image = pageHeaderEntity.getImage();
                return new ht3(new stz0(empty, null, null, null, null, (image == null || (f = job1.f(image, new at3(i3))) == null) ? qtz0.a : new ptz0(f), false, null, null, null, null, null, 32734), list.isEmpty() ? new ft3(ls3Var.c) : new gt3(a.m0(list, Collections.singletonList(pageHeaderEntity))));
            case 1:
                return new pbv((String) obj, (ccv) null, rev.n, (dcv) null, (vfv) null, 58);
            case 2:
                int i4 = fw3.a;
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 3:
                int i5 = fw3.a;
                return new pbv((dcv) null, (dcv) null, (tev) rev.k, (vfv) h2b1.G, (String) obj, false);
            case 4:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 5:
                viewBinding$lambda$21$lambda$6 = AutoTopupRegularFragment.getViewBinding$lambda$21$lambda$6(((Integer) obj).intValue());
                return Boolean.valueOf(viewBinding$lambda$21$lambda$6);
            case 6:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 7:
                return new pbv((String) obj, (ccv) null, rev.g, (dcv) null, (vfv) null, 58);
            case 8:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 9:
                createMonthAdapter$lambda$9 = AutoTopupSummaryView.createMonthAdapter$lambda$9((n70) obj);
                return createMonthAdapter$lambda$9;
            case 10:
                onDropDownToggle$lambda$0 = AutoTopupSummaryView.onDropDownToggle$lambda$0(((Boolean) obj).booleanValue());
                return onDropDownToggle$lambda$0;
            case 11:
                return ((hgx) obj).getName();
            case 12:
                YSError ySError = (YSError) obj;
                return tia1.d(ySError) ? zmx.c(ySError) : zmx.c(new MobileBackendInvalidAuthorizationError(oyr.p("Mobile backend invalid authorization error: Oauth token exchange failure - \"", ySError.getMessage(), "\"")));
            case 13:
                fxy0 fxy0Var = (fxy0) obj;
                return "l:" + fxy0Var.b + ":d:" + fxy0Var.a;
            case 14:
                return new LinearLayout(((ViewGroup) obj).getContext());
            case 15:
                ButtonComponent buttonComponent = (ButtonComponent) obj;
                ca1 ca1Var = new ca1(buttonComponent, i2);
                int h = c.h(8, buttonComponent);
                int u = tje.u(8, buttonComponent.getContext());
                ButtonComponent buttonComponent2 = (ButtonComponent) ((View) ca1Var.R);
                buttonComponent2.setHeight(tje.u(30, buttonComponent.getContext()));
                buttonComponent2.setPadding(h, 0, h, 0);
                buttonComponent2.setRoundedCornersRadius(u);
                return ca1Var;
            case 16:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent.setTrailMode(2);
                listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent.setLeadImagePadding(tje.u(8, listItemComponent.getContext()));
                return listItemComponent;
            case 17:
                ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listGroupHeaderComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listGroupHeaderComponent.setUseAutoAccessibilityDelegate(false);
                return listGroupHeaderComponent;
            case 18:
                return new rc6((ListGroupHeaderComponent) obj, 1);
            case 19:
                return new ConcurrentHashMap();
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                return g8e.p(Uri.encode((String) entry.getKey()), "=", Uri.encode((String) entry.getValue()));
            case 21:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.d = true;
                acxVar.g = true;
                return zy11Var;
            case 22:
                acx acxVar2 = (acx) obj;
                acxVar2.c = true;
                acxVar2.d = true;
                acxVar2.g = true;
                return zy11Var;
            case 23:
                return ((FeatureFlag) obj).getValue();
            case 24:
                return zy11Var;
            case 25:
                return ((e6v) obj).getId();
            case 26:
                bl4 bl4Var = (bl4) obj;
                Integer l = bvu0.l(10, bl4Var.a);
                return new cl4(bl4Var, sb2.k(l != null ? l.intValue() : 100, 0, 100));
            case 27:
                return null;
            case 28:
                return (j3v) ((a5g) obj).m2.get();
            default:
                return (rj50) ((a5g) obj).u2.get();
        }
    }
}
