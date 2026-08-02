package defpackage;

import android.app.Activity;
import android.database.DatabaseUtils;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.compose.animation.core.c;
import androidx.compose.material3.g;
import androidx.compose.ui.layout.o;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import com.yandex.go.inapp_calls.navigation.f;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerStyleDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardPopupsDto;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.state.DashboardPromoBannerType;
import com.yandex.messaging.internal.view.input.b;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.plus.log.api.LogPriority;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.widget.InstructionsView;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes14.dex */
public final /* synthetic */ class mgu implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mgu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 icon$lambda$0;
        DashboardPromoBannerType dashboardPromoBannerType;
        Spannable spannable;
        Spannable a;
        zy11 viewBinding$lambda$6$lambda$2$lambda$1;
        int i = this.a;
        String str = "";
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ngu.e((ngu) obj3, (HashSet) obj2);
                return zy11Var;
            case 1:
                ((xgu) obj3).b.c((oll0) obj, (ArrayList) obj2);
                return zy11Var;
            case 2:
                SourceDestinationComponent sourceDestinationComponent = (SourceDestinationComponent) obj3;
                rzu rzuVar = (rzu) obj2;
                sourceDestinationComponent.render(rzuVar.a);
                gx0 gx0Var = rzuVar.b;
                sourceDestinationComponent.applyDrawables(gx0Var.a, gx0Var.b);
                sourceDestinationComponent.setStopPointsDelegate(new ba1(r4 ? 1 : 0, rzuVar));
                return zy11Var;
            case 3:
                ((kk31) obj3).render(((e0v) obj2).a);
                return zy11Var;
            case 4:
                q4g q4gVar = (q4g) obj3;
                Drawable drawable = (Drawable) obj;
                Activity activity = ((bhv) q4gVar.y).f;
                Point point = new Point();
                activity.getWindowManager().getDefaultDisplay().getSize(point);
                ImageViewerInfo imageViewerInfo = ((mhv) obj2).a;
                int min = Math.min(imageViewerInfo.getWidth(), point.x);
                int min2 = Math.min(imageViewerInfo.getHeight(), point.y);
                ((mt10) q4gVar.x).d(imageViewerInfo.getAnimated() ? new kt10(imageViewerInfo.getUrl(), min, min2, true, 0L, drawable, imageViewerInfo.getFileSource(), Boolean.valueOf(drawable == null)) : new kt10(imageViewerInfo.getUrl(), min, min2, false, 0L, drawable, imageViewerInfo.getFileSource(), Boolean.valueOf(drawable == null)), false);
                return zy11Var;
            case 5:
                hkv hkvVar = (hkv) obj2;
                ((skv) obj).u0();
                njv njvVar = ((f) obj3).K;
                String str2 = hkvVar.d.b;
                fkv fkvVar = hkvVar.a;
                njvVar.j(str2, InAppCallsAnalytics$PhoneCallFallbackReason.EnabledGeProxyProvisionExperiment, fkvVar != null ? fkvVar.a : null);
                return zy11Var;
            case 6:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                qam.p(c1yVar, (jb2) obj3, new a6t0(((ldc) ((g) obj2).D.e()).a), 0.0f, null, 60);
                return zy11Var;
            case 7:
                c cVar = (c) obj3;
                osv osvVar = (osv) obj2;
                cVar.b.b(osvVar);
                cVar.c.setValue(Boolean.TRUE);
                return new te4(8, cVar, osvVar);
            case 8:
                dur.b((dur) obj3);
                ((sls) obj2).invoke();
                return zy11Var;
            case 9:
                TextView textView = (TextView) obj;
                textView.setMaxLines(2);
                textView.setMaxWidth(kjs0.b(295));
                textView.setOnClickListener(new vsn(16, (w0w) obj3, (b) obj2));
                return zy11Var;
            case 10:
                icon$lambda$0 = InstructionsView.setIcon$lambda$0((InstructionsView) obj3, (h4w) obj2, (Drawable) obj);
                return icon$lambda$0;
            case 11:
                String str3 = (String) obj2;
                Exception exc = (Exception) obj;
                pgz pgzVar = (pgz) ((hzk) obj3).b;
                LogPriority logPriority = LogPriority.ERROR;
                if (pgzVar.e(logPriority)) {
                    pgzVar.b(logPriority, "IntentPlusPayUrlLauncher", g8e.o("No application found to handle the link: ", str3), exc);
                }
                return zy11Var;
            case 12:
                aaw aawVar = (aaw) obj3;
                iiw iiwVar = ((giw) obj).a;
                iiw.P(iiwVar);
                iiwVar.D((m950) iiwVar.F.get(), new gcw(aawVar.a, aawVar.b, aawVar.c, (zzs) obj2), new wui(iiwVar, 12));
                return zy11Var;
            case 13:
                zhw zhwVar = (zhw) obj3;
                IntercityDashboardPopupsDto intercityDashboardPopupsDto = (IntercityDashboardPopupsDto) obj2;
                IntercityDashboardBannerDto intercityDashboardBannerDto = (IntercityDashboardBannerDto) obj;
                IntercityDashboardBannerStyleDto intercityDashboardBannerStyleDto = intercityDashboardBannerDto.j;
                if (intercityDashboardBannerStyleDto == null) {
                    IntercityDashboardBannerStyleDto.Companion.getClass();
                    intercityDashboardBannerStyleDto = IntercityDashboardBannerStyleDto.d;
                }
                zhwVar.getClass();
                int i3 = yhw.e[intercityDashboardBannerStyleDto.a.ordinal()];
                if (i3 == 1) {
                    dashboardPromoBannerType = DashboardPromoBannerType.PLAIN;
                } else {
                    if (i3 != 2) {
                        ny61.k();
                        return null;
                    }
                    dashboardPromoBannerType = DashboardPromoBannerType.COUPON;
                }
                DashboardPromoBannerType dashboardPromoBannerType2 = dashboardPromoBannerType;
                String str4 = intercityDashboardBannerDto.a;
                if (str4 == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                String str5 = intercityDashboardBannerDto.b;
                String str6 = intercityDashboardBannerDto.c;
                String str7 = str6 == null ? "" : str6;
                String str8 = intercityDashboardBannerDto.d;
                String str9 = str8 == null ? "" : str8;
                String str10 = intercityDashboardBannerStyleDto.b;
                faw e = zhw.e(intercityDashboardBannerDto.h, intercityDashboardPopupsDto);
                kotlinx.serialization.json.b bVar = intercityDashboardBannerDto.i;
                return new khw(str4, str5, str7, str9, dashboardPromoBannerType2, str10, e, bVar != null ? bVar.toString() : null);
            case 14:
                sls slsVar = (sls) obj2;
                AtomicReference atomicReference = ((ciw) obj3).b;
                while (!atomicReference.compareAndSet(slsVar, null) && atomicReference.get() == slsVar) {
                }
                return zy11Var;
            case 15:
                gau gauVar = (gau) obj2;
                AtomicReference atomicReference2 = ((ciw) obj3).a;
                while (!atomicReference2.compareAndSet(gauVar, null) && atomicReference2.get() == gauVar) {
                }
                return zy11Var;
            case 16:
                return etw.a((etw) ((com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.b) obj3).X(), null, (String) obj2, null, true, 21);
            case 17:
                ktw ktwVar = (ktw) obj3;
                etw etwVar = (etw) obj2;
                ftw ftwVar = (ftw) obj;
                PaymentProviderEntity paymentProviderEntity = ftwVar.a;
                ThemedImageUrlEntity logo = paymentProviderEntity.getLogo();
                ahq0 ahq0Var = new ahq0(true, logo != null ? j5a0.d(logo, myg0.ybsdk_ic_internet_provider_placeholder, 2) : null, (Text) g8e.i(Text.Companion, paymentProviderEntity.getName()), (Text) null, (Text) new Text.Resource(dzh0.ybsdk_transfer_internet_payment_form_widget_label), new Text.Resource(dzh0.ybsdk_transfer_internet_payment_form_widget_accessibility), 0, (ColorModel) null, NetworkRequestException.INVALID_RANGE);
                boolean z = etwVar.d;
                String str11 = etwVar.b;
                cuw cuwVar = ftwVar.b;
                q4s q4sVar = cuwVar.b;
                String str12 = q4sVar != null ? q4sVar.b : null;
                if (z) {
                    str12 = null;
                }
                String str13 = z ? cuwVar.c : str12;
                eyy eyyVar = eyy.b;
                String str14 = str13;
                LoadableInput.LoadingState loadingState = LoadableInput.LoadingState.DEFAULT;
                String str15 = cuwVar.a;
                Text.Constant constant = str15 != null ? new Text.Constant(str15) : null;
                boolean z2 = !z;
                Text.Constant constant2 = str12 != null ? new Text.Constant(str12) : null;
                if (str14 != null) {
                    a = rtu.a(new jiu(6), str14);
                    spannable = a;
                } else {
                    spannable = null;
                }
                com.ybsdk.widgets.common.g gVar = new com.ybsdk.widgets.common.g(str11, eyyVar, loadingState, constant, null, spannable, z2, constant2, null, null, false, vng.t(nyg0.ybsdk_background_loadable_input_edit_text, ktwVar.a), null, 16635392);
                PageHeaderEntity pageHeaderEntity = ftwVar.c;
                Text.Constant constant3 = new Text.Constant(pageHeaderEntity.getTitle());
                ThemedImageUrlEntity image = pageHeaderEntity.getImage();
                rbv f = image != null ? job1.f(image, new xuv(29)) : null;
                String description = pageHeaderEntity.getDescription();
                return new gtw(ahq0Var, gVar, new stz0(constant3, description != null ? new Text.Constant(description) : null, null, f, null, new ntz0(0), false, null, null, null, null, null, 32724), new YbButtonView.a(new Text.Resource(etwVar.e ? dzh0.ybsdk_transfer_internet_payment_form_button_save : dzh0.ybsdk_transfer_internet_payment_form_button), null, null, null, null, null, null, false, false, null, 4094));
            case 18:
                viewBinding$lambda$6$lambda$2$lambda$1 = InternetPaymentSelectProviderFragment.getViewBinding$lambda$6$lambda$2$lambda$1((InternetPaymentSelectProviderFragment) obj3, (s161) obj2, (Editable) obj);
                return viewBinding$lambda$6$lambda$2$lambda$1;
            case 19:
                qvw qvwVar = (qvw) obj3;
                u131 u131Var = (u131) obj2;
                Object d = ((c231) obj).d();
                Boolean bool = d instanceof Boolean ? (Boolean) d : null;
                if (bool != null && bool.booleanValue()) {
                    qvwVar.a.b();
                    u131Var.j(false);
                }
                return zy11Var;
            case 20:
                sls slsVar2 = (sls) obj3;
                Activity activity2 = (Activity) obj2;
                if (((ActivityResult) obj).getResultCode() == -1) {
                    slsVar2.invoke();
                    vqb1.g(oyh0.invitelink_copied_notification, activity2);
                }
                return zy11Var;
            case 21:
                yd00 yd00Var = (yd00) obj3;
                Activity activity3 = (Activity) obj2;
                mdy0 mdy0Var = (mdy0) obj;
                if (mdy0Var instanceof kdy0) {
                    yd00Var.a(((kdy0) mdy0Var).a);
                } else {
                    if (!(mdy0Var instanceof ldy0)) {
                        w511.b();
                        return null;
                    }
                    Toast.makeText(activity3, oyh0.tm_temp_link_generation_fail, 0).show();
                }
                return zy11Var;
            case 22:
                f4y f4yVar = (f4y) obj2;
                nzr i4 = ((s1n) obj3).i(((Integer) obj).intValue());
                int i5 = i4.a;
                List list = i4.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i6 = 0;
                while (i2 < size) {
                    int i7 = (int) ((a1u) list.get(i2)).a;
                    arrayList.add(new Pair(Integer.valueOf(i5), new n8e(f4yVar.a(i6, i7))));
                    i5++;
                    i6 += i7;
                    i2++;
                }
                return arrayList;
            case 23:
                f4y f4yVar2 = (f4y) obj3;
                e4y e4yVar = (e4y) obj2;
                int intValue = ((Integer) obj).intValue();
                s1n s1nVar = f4yVar2.e;
                int i8 = s1nVar.a;
                int q = s1nVar.q(intValue);
                return e4yVar.c(intValue, 0, q, e4yVar.d, f4yVar2.a(0, q));
            case 24:
                e7y e7yVar = (e7y) obj3;
                e7yVar.c.i(obj2);
                return new te4(10, e7yVar, obj2);
            case 25:
                return new e7y((l1m0) obj3, (Map) obj, (j1m0) obj2);
            case 26:
                o.a aVar = (o.a) obj;
                ArrayList e2 = m5b1.e((List) obj3, ((dqy) obj2).a);
                if (e2 != null) {
                    int size2 = e2.size();
                    while (i2 < size2) {
                        Pair pair = (Pair) e2.get(i2);
                        o oVar = (o) pair.getFirst();
                        sls slsVar3 = (sls) pair.getSecond();
                        o.a.m(aVar, oVar, slsVar3 != null ? ((z5w) slsVar3.invoke()).a : 0L);
                        i2++;
                    }
                }
                return zy11Var;
            case 27:
                ((mtr0) obj3).a((rzx) obj, (dur0) obj2);
                return zy11Var;
            case 28:
                return Long.valueOf(((i2z) obj3).c.e((oll0) obj, (h2z) obj2));
            default:
                ArrayList<String> arrayList2 = (ArrayList) obj2;
                hkw0 writableDatabase = ((i2z) obj3).a.D0().getWritableDatabase();
                if (arrayList2.size() != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str16 : arrayList2) {
                        if (i2 != 0) {
                            sb.append(",");
                        }
                        DatabaseUtils.appendEscapedSQLString(sb, str16);
                        i2 = 1;
                    }
                    str = sb.toString();
                }
                return Integer.valueOf(writableDatabase.g("UPDATE local_contacts SET locals_deleted=1 WHERE locals_deleted != 1 AND locals_upload_id NOT IN (" + str + Extension.C_BRAKE).c());
        }
    }
}
