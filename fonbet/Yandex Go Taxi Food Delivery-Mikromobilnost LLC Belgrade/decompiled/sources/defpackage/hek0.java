package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.net.http.SslError;
import android.os.Message;
import android.view.Surface;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.camera.view.l;
import androidx.core.view.b;
import androidx.recyclerview.widget.x0;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.insurance.ScootersInsuranceModalView;
import com.yandex.go.scooters.insurance.analytics.InsuranceButton;
import com.yandex.go.scooters.insurance.analytics.InsuranceScreen;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;
import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;
import com.yandex.go.scooters.offers.v2.f;
import com.yandex.go.scooters.offers.v2.g;
import com.yandex.go.taxi.order.details.v2.analytics.perf.a;
import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;
import com.yandex.messaging.input.DimmedBackgroundView;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import io.appmetrica.analytics.impl.C0205b1;
import io.appmetrica.analytics.impl.V0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.e;
import ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManagerImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class hek0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ hek0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v57, types: [T, gr71] */
    /* JADX WARN: Type inference failed for: r1v60, types: [T, gr71] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        cek0 cek0Var;
        View view;
        f fVar;
        e eVar;
        zsn0 zsn0Var;
        com.yandex.go.scooters.insurance.e eVar2;
        ?? r8;
        boolean z;
        float[] fArr;
        String e;
        BufferedWriter bufferedWriter;
        int i = this.a;
        c21 c21Var = sy60.Q2;
        View view2 = null;
        r5 = null;
        BufferedWriter bufferedWriter2 = null;
        view2 = null;
        int i2 = 12;
        boolean z2 = false;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                fek0 fek0Var = (fek0) obj3;
                RideCardCompactView rideCardCompactView = (RideCardCompactView) obj2;
                RideCardState$ProcessingStep rideCardState$ProcessingStep = (RideCardState$ProcessingStep) obj;
                boolean z3 = fek0Var.a;
                final RideCardCompactView rideCardCompactView2 = ((iek0) obj4).a;
                if (z3) {
                    cek0Var = rideCardCompactView2.binding;
                    x0 findViewHolderForLayoutPosition = cek0Var.b.findViewHolderForLayoutPosition(0);
                    if (findViewHolderForLayoutPosition != null && (view = findViewHolderForLayoutPosition.a) != null) {
                        WeakHashMap weakHashMap = b.a;
                        if (!view.isLaidOut() || view.isLayoutRequested()) {
                            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView$MvpView$updateFirstItemHeightValue$$inlined$doOnLayout$1
                                @Override // android.view.View.OnLayoutChangeListener
                                public void onLayoutChange(View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                    view3.removeOnLayoutChangeListener(this);
                                    RideCardCompactView.this.firstItemHeight = view3.getHeight();
                                }
                            });
                        } else {
                            rideCardCompactView2.firstItemHeight = view.getHeight();
                        }
                    }
                } else {
                    rideCardCompactView2.firstItemHeight = 0;
                }
                aVar = rideCardCompactView.perfAnalyticsTracer;
                aVar.e(rideCardState$ProcessingStep, fek0Var.b.a.size());
                return;
            case 1:
                fVar = ((ScootersCardV2ModalView) obj4).scootersCardV2Presenter;
                qxm0 qxm0Var = fVar.x;
                qxm0Var.a.a("Scooters.VehicleActualPhotoButton.Tapped", tse0.p(qxm0Var), 1, new HashMap());
                g gVar = ((h7n0) fVar.A).b;
                gVar.A((m950) gVar.j0.get(), new z6p0((CharSequence) obj2, (CharSequence) obj, (String) obj3), c21Var);
                return;
            case 2:
                eVar = ((ScootersDetailedOrderV2ModalView) obj4).scootersDetailedOrderPresenter;
                qxm0 qxm0Var2 = eVar.A;
                qxm0Var2.a.a("Scooters.VehicleActualPhotoButton.Tapped", tse0.p(qxm0Var2), 1, new HashMap());
                ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar2 = eVar.V.a;
                aVar2.A((m950) aVar2.W.get(), new z6p0((CharSequence) obj2, (CharSequence) obj, (String) obj3), c21Var);
                return;
            case 3:
                ScootersInsuranceModalView scootersInsuranceModalView = (ScootersInsuranceModalView) obj3;
                ScootersInsuranceControl scootersInsuranceControl = (ScootersInsuranceControl) obj2;
                String str = (String) obj;
                InsuranceButton insuranceButton = ((itn0) obj4).g.isChecked() ? InsuranceButton.INSURANCE_OFF : InsuranceButton.INSURANCE_ON;
                zsn0Var = scootersInsuranceModalView.scootersInsuranceAnalytics;
                zsn0Var.c(insuranceButton, scootersInsuranceControl, str, InsuranceScreen.DEFAULT);
                eVar2 = scootersInsuranceModalView.scootersInsurancePresenter;
                int i3 = qtn0.a[eVar2.x.d().a.ordinal()];
                if (i3 == 1) {
                    eVar2.Kg(ScootersInsuranceType.FULL, new bgc(i2));
                    return;
                } else if (i3 == 2) {
                    eVar2.Kg(ScootersInsuranceType.STANDART, new bgc(i2));
                    return;
                } else {
                    if (i3 == 3) {
                        return;
                    }
                    w511.b();
                    return;
                }
            case 4:
                com.yandex.messaging.input.f fVar2 = (com.yandex.messaging.input.f) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                DimmedBackgroundView dimmedBackgroundView = (DimmedBackgroundView) obj2;
                ?? r10 = (FrameLayout) obj;
                Activity activity = fVar2.c;
                wy31 wy31Var = fVar2.e;
                wy31Var.get().getClass();
                Mesix mesix = fVar2.b;
                try {
                    View a = ((mlg0) fVar2.d.get()).a.a();
                    if (a.getVisibility() == 0) {
                        view2 = a;
                    }
                } catch (UninitializedPropertyAccessException unused) {
                }
                int[] iArr = new int[2];
                mesix.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                wy31Var.get().getClass();
                View view3 = view2 == null ? fVar2.f : view2;
                if (view3 != null) {
                    view3.getLocationOnScreen(iArr2);
                }
                int[] iArr3 = new int[2];
                r10.getLocationOnScreen(iArr3);
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                KeyboardAwareEmojiEditText keyboardAwareEmojiEditText = fVar2.f;
                boolean z4 = keyboardAwareEmojiEditText != null && keyboardAwareEmojiEditText.hasFocus();
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr2[1];
                int measuredWidth = linearLayout.getMeasuredWidth();
                int measuredHeight = linearLayout.getMeasuredHeight();
                int i7 = (int) (activity.getResources().getDisplayMetrics().density * 8.0f);
                layoutParams.leftMargin = ((mesix.getPaddingStart() + (i4 - iArr3[0])) + ((mesix.getWidth() - mesix.getPaddingStart()) - mesix.getPaddingEnd())) - measuredWidth;
                if (z4) {
                    wy31Var.get().getClass();
                    layoutParams.topMargin = (i5 - iArr3[1]) + (mesix.getHeight() - linearLayout.getPaddingTop()) + i7;
                } else {
                    if (view2 != null) {
                        int[] iArr4 = new int[2];
                        view2.getLocationOnScreen(iArr4);
                        i6 = iArr4[1];
                    }
                    layoutParams.topMargin = ((i6 - iArr3[1]) - measuredHeight) - i7;
                }
                linearLayout.setLayoutParams(layoutParams);
                if (view2 != null) {
                    View findViewById = view2.findViewById(e9h0.chat_input_panel_cutout_area);
                    View findViewById2 = view2.findViewById(e9h0.chat_input_panel_cutout_background);
                    View findViewById3 = view2.findViewById(e9h0.chat_input_panel_vertical_line);
                    if (findViewById != null && findViewById2 != null) {
                        findViewById2.setVisibility(0);
                        findViewById2.setBackgroundColor(fxa1.c(jng0.messagingChatInputBackgroundColor, activity).data);
                        if (findViewById3 != null) {
                            findViewById3.setBackgroundColor(fxa1.c(jng0.messagingCommonLineMediumColor, activity).data);
                            findViewById3.setAlpha(1.0f);
                        }
                        dimmedBackgroundView.addCutoutView(findViewById, false, new float[]{12.0f, 16.0f, 2.0f, 12.0f});
                    }
                }
                wy31Var.get().getClass();
                KeyboardAwareEmojiEditText keyboardAwareEmojiEditText2 = fVar2.f;
                if (keyboardAwareEmojiEditText2 != null) {
                    if (((uqq0) fVar2.a.f.a.getValue()).a) {
                        z = false;
                        fArr = new float[]{20.0f, 20.0f, 20.0f, 20.0f};
                    } else {
                        z = false;
                        fArr = new float[]{18.0f, 18.0f, 18.0f, 18.0f};
                    }
                    dimmedBackgroundView.addCutoutView(keyboardAwareEmojiEditText2, z, fArr);
                    r8 = z;
                } else {
                    r8 = 0;
                }
                DimmedBackgroundView.addCutoutView$default(dimmedBackgroundView, mesix, true, null, 4, null);
                r10.setVisibility(r8);
                return;
            case 5:
                l lVar = (l) obj4;
                Surface surface = (Surface) obj3;
                gl7 gl7Var = (gl7) obj2;
                znw0 znw0Var = (znw0) obj;
                sgb1.g(3, "TextureViewImpl");
                androidx.camera.view.e eVar3 = lVar.l;
                if (eVar3 != null) {
                    eVar3.a();
                    lVar.l = null;
                }
                surface.release();
                if (lVar.g == gl7Var) {
                    lVar.g = null;
                }
                if (lVar.h == znw0Var) {
                    lVar.h = null;
                    return;
                }
                return;
            case 6:
                glr0 glr0Var = (glr0) obj4;
                vmn0 vmn0Var = ((hlr0) glr0Var.K).a;
                glr0Var.z(new glr0((w030) ((xvf0) vmn0Var.a).get(), (clr0) ((n3w) vmn0Var.b).a, (rlr0) ((n3w) vmn0Var.c).a, (TrustedContactDto) obj3, (ShareSettingsMode) obj2, (idj) ((n3w) vmn0Var.w).a, (ug11) ((n3w) vmn0Var.x).a, (ej1) ((kln) vmn0Var.y).get()), (hh11) obj);
                return;
            case 7:
                jp21 jp21Var = (jp21) obj4;
                String str2 = (String) obj3;
                Map map = (Map) obj2;
                List list = (List) obj;
                m820 m820Var = jp21Var.a;
                AtomicMarkableReference atomicMarkableReference = jp21Var.g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    m820Var.i(str2, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    m820Var.h(str2, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File c = m820Var.a.c(str2, "rollouts-state");
                if (list.isEmpty()) {
                    m820.g(c, "Rollout state is empty for session: " + str2);
                    return;
                }
                try {
                    try {
                        e = m820.e(list);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), m820.b));
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bufferedWriter.write(e);
                    bufferedWriter.flush();
                    CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
                    return;
                } catch (Exception unused3) {
                    bufferedWriter2 = bufferedWriter;
                    m820.f(c);
                    CommonUtils.b(bufferedWriter2, "Failed to close rollouts state file.");
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter2 = bufferedWriter;
                    CommonUtils.b(bufferedWriter2, "Failed to close rollouts state file.");
                    throw th;
                }
            case 8:
                V0.a((V0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 9:
                VideoDataPreloadManagerImpl.postResult$lambda$14((Map) obj4, (VideoDataPreloadManagerImpl) obj3, (LinkedHashMap) obj2, (LinkedHashMap) obj);
                return;
            case 10:
                zv31 zv31Var = (zv31) obj4;
                zv31Var.e = new d82(1);
                zv31Var.b((View) obj3, (View) obj2, (oy01) obj, ValueAnimator.ofFloat(0.0f, 1.0f));
                return;
            case 11:
                ((WebViewClientProxyApi$WebViewClientImpl) obj4).lambda$onFormResubmission$15((WebView) obj3, (Message) obj2, (Message) obj);
                return;
            case 12:
                ((WebViewClientProxyApi$WebViewClientImpl) obj4).lambda$onReceivedSslError$25((WebView) obj3, (SslErrorHandler) obj2, (SslError) obj);
                return;
            case 13:
                ((WebViewClientProxyApi$WebViewClientImpl) obj4).lambda$onReceivedError$7((WebView) obj3, (WebResourceRequest) obj2, (WebResourceError) obj);
                return;
            case 14:
                ((WebViewClientProxyApi$WebViewClientImpl) obj4).lambda$onReceivedHttpError$5((WebView) obj3, (WebResourceRequest) obj2, (WebResourceResponse) obj);
                return;
            case 15:
                C0205b1.a((C0205b1) obj4, (String) obj3, (String) obj2, (PluginErrorDetails) obj);
                return;
            case 16:
                String str3 = (String) obj2;
                ((Ref$ObjectRef) obj4).element = ((z4m0) ((ntk) obj3).c).b(str3, new cf71(str3, (btk) obj, z2, i2), 0, 0);
                return;
            case 17:
                ((Ref$ObjectRef) obj4).element = ((z4m0) ((ntk) obj3).c).b((String) obj2, new qs71((ImageView) obj, 0), 0, 0);
                return;
            default:
                ((sf81) obj3).u(((sc81) obj4).a, (v281) obj2, (pil0) obj);
                return;
        }
    }
}
