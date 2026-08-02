package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.g;
import androidx.compose.foundation.text.selection.j;
import com.yandex.go.masstransit.sdk.camera.ml.b;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.navigation.a;
import com.yandex.go.taxi.order.ui.TaxiOrderTrackingBackButton;
import com.yandex.messaging.ui.creation.component.TelemessengerCreationDialogFragment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.transfer.utils.CommentValidator;
import com.ybsdk.core.transfer.utils.TransferCommentView;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.api.entities.TransactionsListShimmerType;
import com.ybsdk.feature.transactions.api.entities.TransactionsState;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedScreenParams;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.c;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes3.dex */
public final /* synthetic */ class i5y0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i5y0(g gVar, ik2 ik2Var, dg21 dg21Var) {
        this.a = 7;
        this.b = ik2Var;
        this.c = dg21Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View compactOrderView_delegate$lambda$0;
        TaxiOrderTrackingBackButton backNavigationButton_delegate$lambda$0;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        long j;
        ery0 d;
        oay oayVar;
        kk2 kk2Var;
        CommentValidator commentValidator_delegate$lambda$2;
        View showCommentDialogView$lambda$80;
        View renderBottomSheet$lambda$25$lambda$22$lambda$17;
        tya0 permissionManager_delegate$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return "[" + ((a) obj2).getLifecycle().w + "](" + ((tse) obj).hashCode() + ") unhandled, no active orders found";
            case 1:
                compactOrderView_delegate$lambda$0 = TaxiOrderTrackingView.compactOrderView_delegate$lambda$0((v6y0) obj2, (TaxiOrderTrackingView) obj);
                return compactOrderView_delegate$lambda$0;
            case 2:
                backNavigationButton_delegate$lambda$0 = TaxiOrderTrackingView.backNavigationButton_delegate$lambda$0((Context) obj2, (TaxiOrderTrackingView) obj);
                return backNavigationButton_delegate$lambda$0;
            case 3:
                TelemessengerCreationDialogFragment.viewComponentDelegate$lambda$1((TelemessengerCreationDialogFragment) obj2, (noh) obj);
                return null;
            case 4:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                } else {
                    activity.send();
                }
                return zy11Var;
            case 5:
                j jVar = (j) obj2;
                long j2 = ((k6w) ((oz40) obj).getValue()).a;
                wu60 j3 = jVar.j();
                long j4 = 9205357640488583168L;
                if (j3 != null) {
                    long j5 = j3.a;
                    kk2 n = jVar.n();
                    if (n != null && n.b.length() != 0) {
                        Handle handle = (Handle) jVar.r.getValue();
                        int i2 = handle == null ? -1 : doy0.a[handle.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2) {
                                long j6 = jVar.o().b;
                                int i3 = asy0.c;
                                j = j6 >> 32;
                            } else {
                                if (i2 != 3) {
                                    w511.b();
                                    return null;
                                }
                                long j7 = jVar.o().b;
                                int i4 = asy0.c;
                                j = j7 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                            }
                            int i5 = (int) j;
                            oay oayVar2 = jVar.d;
                            if (oayVar2 != null && (d = oayVar2.d()) != null && (oayVar = jVar.d) != null && (kk2Var = oayVar.a.a) != null) {
                                int d2 = y6i0.d(jVar.b.r(i5), 0, kk2Var.b.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j5) >> 32));
                                dry0 dry0Var = d.a;
                                hm40 hm40Var = dry0Var.b;
                                int d3 = hm40Var.d(d2);
                                float i6 = dry0Var.i(d3);
                                float j8 = dry0Var.j(d3);
                                float c = y6i0.c(intBitsToFloat, Math.min(i6, j8), Math.max(i6, j8));
                                if (k6w.a(j2, 0L) || Math.abs(intBitsToFloat - c) <= ((int) (j2 >> 32)) / 2) {
                                    float f = hm40Var.f(d3);
                                    j4 = (Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits(((hm40Var.b(d3) - f) / 2.0f) + f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                }
                            }
                        }
                    }
                }
                return new wu60(j4);
            case 6:
                ((tls) obj2).invoke(((t460) obj).b);
                return zy11Var;
            case 7:
                dg21 dg21Var = (dg21) obj;
                kky kkyVar = (kky) ((ik2) obj2).a;
                if (kkyVar instanceof jky) {
                    try {
                        String str = ((jky) kkyVar).a;
                        xc2 xc2Var = (xc2) dg21Var;
                        xc2Var.getClass();
                        try {
                            xc2Var.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException e2) {
                            yci0.p(unr0.l('.', "Can't open ", str), e2);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return zy11Var;
            case 8:
                return ((com.yandex.messaging.internal.view.chat.input.textsuggest.a) obj2).inflate((Activity) obj, olh0.msg_b_text_suggest);
            case 9:
                ((tls) obj2).invoke(((muy0) obj).g);
                return zy11Var;
            case 10:
                ((tls) obj2).invoke(((t3z0) obj).d);
                return zy11Var;
            case 11:
                v3z0 v3z0Var = (v3z0) obj;
                ((tls) obj2).invoke(new p3z0(v3z0Var.c, v3z0Var.d));
                return zy11Var;
            case 12:
                ((tls) obj2).invoke(new l3z0(((s3z0) obj).b));
                return zy11Var;
            case 13:
                ((tls) obj2).invoke(((u3z0) obj).c);
                return zy11Var;
            case 14:
                oz40 oz40Var = (oz40) obj;
                oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                ((b) obj2).b(((Boolean) oz40Var.getValue()).booleanValue());
                return zy11Var;
            case 15:
                ru.yandex.taxi.communications.ticket.router.b bVar = (ru.yandex.taxi.communications.ticket.router.b) obj;
                if (((o2z0) ((agd) ((yfd) obj2)).a).a.o) {
                    bVar.a();
                }
                return zy11Var;
            case 16:
                s37 s37Var = (s37) obj;
                ((lhg) obj2).b(null, s37Var.d);
                s37Var.b.b.invoke();
                return zy11Var;
            case 17:
                ((tls) obj2).invoke(((s9z0) obj).d);
                return zy11Var;
            case 18:
                ((tls) obj2).invoke(((wts0) obj).e);
                return zy11Var;
            case 19:
                sls slsVar = (sls) obj;
                if (((bb01) obj2).i) {
                    slsVar.invoke();
                }
                return zy11Var;
            case 20:
                ((tls) obj2).invoke(((ed01) obj).b);
                return zy11Var;
            case 21:
                ((id01) obj2).getClass();
                throw null;
            case 22:
                TransactionsFeedScreenParams transactionsFeedScreenParams = (TransactionsFeedScreenParams) obj2;
                TransactionsFeedFilterEntity filter = transactionsFeedScreenParams.getFilter();
                List<YbMobileTabBarConfig.TabBarItem> items = ((ue01) ((sf01) obj)).b.q().getItems();
                ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((YbMobileTabBarConfig.TabBarItem) it.next()).toEntity());
                }
                return new ff01(filter, arrayList, transactionsFeedScreenParams.getShowTabbar(), new t8j0(), null, TransactionsState.IDLE, false, TransactionsListShimmerType.FULL, null, 0, transactionsFeedScreenParams.getHideFilters());
            case 23:
                commentValidator_delegate$lambda$2 = TransferCommentView.commentValidator_delegate$lambda$2((TransferCommentView) obj2, (Context) obj);
                return commentValidator_delegate$lambda$2;
            case 24:
                showCommentDialogView$lambda$80 = TransferMainFragment.showCommentDialogView$lambda$80((TransferMainFragment) obj2, (String) obj);
                return showCommentDialogView$lambda$80;
            case 25:
                TransferMainResultScreenParams transferMainResultScreenParams = ((com.ybsdk.feature.transfer.version2.internal.screens.result.a) obj).B;
                cjw0 cjw0Var = ((ur01) obj2).a;
                return new tr01((us3) ((vs3) cjw0Var.a).get(), (AppAnalyticsReporter) ((hag) cjw0Var.b).get(), (vfy0) ((n3w) cjw0Var.c).a, transferMainResultScreenParams);
            case 26:
                renderBottomSheet$lambda$25$lambda$22$lambda$17 = TransferMe2MeConfirmFragment.renderBottomSheet$lambda$25$lambda$22$lambda$17((TransferMe2MeConfirmFragment) obj2, (mm01) obj);
                return renderBottomSheet$lambda$25$lambda$22$lambda$17;
            case 27:
                permissionManager_delegate$lambda$0 = TransferPhoneInputFragment.permissionManager_delegate$lambda$0((TransferPhoneInputFragment) obj2, (ug01) obj);
                return permissionManager_delegate$lambda$0;
            case 28:
                a201 a201Var = (a201) obj2;
                TransferPhoneInputFragment.Arguments arguments = ((c) obj).G;
                String transferSessionId = arguments.getTransferSessionId();
                TransferScenario scenario = arguments.getScenario();
                a201Var.getClass();
                return scenario == TransferScenario.CROSS_BORDER ? new sh01((AppAnalyticsReporter) ((th01) a201Var.c).a.a.get(), transferSessionId) : new xm01((AppAnalyticsReporter) ((an01) a201Var.b).a.a.get(), transferSessionId);
            default:
                return new nr01((AppAnalyticsReporter) ((hag) ((or01) obj2).a.b).get(), ((com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.b) obj).C.getTransferSessionId());
        }
    }

    public /* synthetic */ i5y0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
