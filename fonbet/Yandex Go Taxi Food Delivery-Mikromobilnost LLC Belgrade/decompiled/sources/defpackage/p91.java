package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.internal.a;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.compose.spinner.SpinnerSize;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import com.yandex.messaging.ui.folders.CreateEditFolderDialogFragment;
import com.yandex.messaging.ui.folders.e;
import com.yandex.messaging.ui.folders.selectDialog.SelectFolderDialogFragment;
import com.yx360.design.compose.atoms.DsActionBar$Variant;
import java.util.List;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public final /* synthetic */ class p91 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ p91(int i, f530 f530Var, Float f, String str, sls slsVar, int i2, int i3) {
        this.a = 8;
        this.c = i;
        this.b = f530Var;
        this.x = f;
        this.y = str;
        this.z = slsVar;
        this.w = i3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 CreateEditFolderDialogRoot$lambda$25;
        zy11 SelectFolderDialogContent$lambda$14;
        int i = this.a;
        int i2 = this.c;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jpa1.a((z91) obj6, (f530) obj3, (yur) obj5, (tls) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 1:
                ((Integer) obj2).getClass();
                sya1.a((au2) obj6, (f530) obj3, (String) obj5, (wp2) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 2:
                ((Integer) obj2).getClass();
                s3b1.a((zh4) obj6, (f530) obj3, (String) obj5, (a) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 3:
                int intValue = ((Integer) obj2).intValue();
                CreateEditFolderDialogRoot$lambda$25 = CreateEditFolderDialogFragment.CreateEditFolderDialogRoot$lambda$25((CreateEditFolderDialogFragment) obj6, (f530) obj3, (sls) obj5, (e) obj4, this.c, this.w, (fid) obj, intValue);
                break;
            case 4:
                ((Integer) obj2).getClass();
                unm.b((DsActionBar$Variant) obj6, (snm) obj5, (f530) obj3, (snm) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 5:
                ((Integer) obj2).getClass();
                jh91.a((f530) obj3, (p6o) obj6, (sls) obj5, (tls) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 6:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.g((ncu) obj6, (f530) obj3, (yur) obj5, (tls) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 7:
                pav pavVar = (pav) obj6;
                tt2 tt2Var = (tt2) obj3;
                ru.yandex.taxi.design.utils.a aVar = (ru.yandex.taxi.design.utils.a) obj5;
                ub60 ub60Var = (ub60) obj4;
                View inflate = ((LayoutInflater) obj).inflate(uuh0.organizations_organization_preview_item, (ViewGroup) obj2, false);
                int i3 = o6h0.badge;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
                if (robotoTextView != null) {
                    i3 = o6h0.badge_shadow;
                    GoView goView = (GoView) cma1.O(i3, inflate);
                    if (goView != null) {
                        i3 = o6h0.banner_dots_view;
                        DotsIndicatorComponent dotsIndicatorComponent = (DotsIndicatorComponent) cma1.O(i3, inflate);
                        if (dotsIndicatorComponent != null) {
                            i3 = o6h0.description;
                            CompressionResistantListComponent compressionResistantListComponent = (CompressionResistantListComponent) cma1.O(i3, inflate);
                            if (compressionResistantListComponent != null) {
                                i3 = o6h0.image_slider;
                                ViewPager2 viewPager2 = (ViewPager2) cma1.O(i3, inflate);
                                if (viewPager2 != null) {
                                    i3 = o6h0.image_slider_frame;
                                    GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i3, inflate);
                                    if (goFrameLayout != null) {
                                        LinearLayout linearLayout = (LinearLayout) inflate;
                                        i3 = o6h0.subtitle;
                                        CompressionResistantListComponent compressionResistantListComponent2 = (CompressionResistantListComponent) cma1.O(i3, inflate);
                                        if (compressionResistantListComponent2 != null) {
                                            i3 = o6h0.title;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, inflate);
                                            if (robotoTextView2 != null) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                ru.yandex.taxi.logistics.sdk.photocomments.a.h(this.c, (f530) obj3, (Float) obj6, (String) obj5, (sls) obj4, (fid) obj, O, this.w);
                break;
            case 9:
                ((Integer) obj2).getClass();
                kla1.a((lej0) obj6, (f530) obj3, (j690) obj5, (tls) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1 | this.w);
                ru.yandex.taxi.masstransit.trains.schedule.uicomponents.a.b((List) obj6, (b) obj5, this.c, (f530) obj3, (tls) obj4, (fid) obj, O2);
                break;
            case 11:
                int intValue2 = ((Integer) obj2).intValue();
                SelectFolderDialogContent$lambda$14 = SelectFolderDialogFragment.SelectFolderDialogContent$lambda$14((SelectFolderDialogFragment) obj6, (f530) obj3, (com.yandex.messaging.ui.folders.selectDialog.e) obj5, (sls) obj4, this.c, this.w, (fid) obj, intValue2);
                break;
            case 12:
                ((Integer) obj2).getClass();
                ffb1.c((SpinnerSize) obj6, (f530) obj3, (wp2) obj5, (f3n) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 13:
                ((Integer) obj2).getClass();
                aib1.c((f530) obj3, (cyu0) obj6, (cyu0) obj5, (it1) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 14:
                ((Integer) obj2).getClass();
                cjb1.b((nww0) obj6, (f530) obj3, (yur) obj5, (tls) obj4, (fid) obj, vng.O(1 | i2), this.w);
                break;
            case 15:
                ((Integer) obj2).getClass();
                tkb1.a((vnx0) obj6, (f530) obj3, (tls) obj4, (tls) obj5, (fid) obj, vng.O(i2 | 1), this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                xtb1.a((Integer) obj6, (obm) obj5, (Integer) obj4, (f530) obj3, (fid) obj, vng.O(i2 | 1), this.w);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ p91(pav pavVar, tt2 tt2Var, int i, int i2, ru.yandex.taxi.design.utils.a aVar, ub60 ub60Var) {
        this.a = 7;
        this.x = pavVar;
        this.b = tt2Var;
        this.c = i;
        this.w = i2;
        this.y = aVar;
        this.z = ub60Var;
    }

    public /* synthetic */ p91(f530 f530Var, Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.b = f530Var;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ p91(vnx0 vnx0Var, f530 f530Var, tls tlsVar, tls tlsVar2, int i, int i2) {
        this.a = 15;
        this.x = vnx0Var;
        this.b = f530Var;
        this.z = tlsVar;
        this.y = tlsVar2;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ p91(DsActionBar$Variant dsActionBar$Variant, snm snmVar, f530 f530Var, snm snmVar2, int i, int i2) {
        this.a = 4;
        this.x = dsActionBar$Variant;
        this.y = snmVar;
        this.b = f530Var;
        this.z = snmVar2;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ p91(Integer num, obm obmVar, Integer num2, f530 f530Var, int i, int i2) {
        this.a = 16;
        this.x = num;
        this.y = obmVar;
        this.z = num2;
        this.b = f530Var;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ p91(Object obj, f530 f530Var, Object obj2, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.x = obj;
        this.b = f530Var;
        this.y = obj2;
        this.z = obj3;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ p91(List list, b bVar, int i, f530 f530Var, tls tlsVar, int i2) {
        this.a = 10;
        this.x = list;
        this.y = bVar;
        this.c = i;
        this.b = f530Var;
        this.z = tlsVar;
        this.w = i2;
    }
}
