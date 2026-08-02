package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.Config$OptionPriority;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.yandex.div.core.view2.debugview.e;
import com.yandex.div.core.view2.divs.a;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFeedbackCardButtonNameV4;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersFeedbackCardScreenState;
import com.yandex.go.chargers.feedback.c;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackBannerAnalyticsAlias;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import com.yandex.go.coroutines.g;
import com.yandex.go.taxi.summary.shared.models.SmallSummaryConfigExperiment;
import com.yandex.mapkit.navigation.transport.layer.ConstructionStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.StyleProvider;
import com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonImageProvider;
import com.yandex.mapkit.styling.transportnavigation.TransportNavigationStyleProvider;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.files.ImageFileInfo;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ReplyData;
import com.yandex.messaging.internal.net.Error;
import com.yandex.messenger.websdk.internal.webview.ChatWebChromeClient;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.ArgumentsIllegalSdkEbsException;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.NotInitializedSdkEbsException;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IProdEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.network.entities.models.NoGOST;
import ru.rt.ebs.cryptosdk.core.verification.consumer.controllers.IConsumerController;
import ru.rt.ebs.cryptosdk.core.verification.consumer.di.IConsumerComponent;
import ru.yandex.taxi.web.CommonWebViewClient;

/* loaded from: classes8.dex */
public final class an8 implements fo3, at21, xs21, d9b, ICommonComponent, rt41, wni, IConsumerComponent, y9f, ye61, StyleProvider {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    public an8(Context context, lml lmlVar, sls slsVar) {
        this.a = 26;
        this.c = slsVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setBackgroundResource(uyg0.error_counter_background);
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setTextColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        appCompatTextView.setGravity(17);
        appCompatTextView.setElevation(context.getResources().getDimension(vsg0.div_shadow_elevation));
        appCompatTextView.setTypeface(lmlVar.a());
        appCompatTextView.setOnClickListener(new e(2, this));
        this.w = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setTextColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        appCompatTextView2.setElevation(context.getResources().getDimension(vsg0.div_shadow_elevation));
        appCompatTextView2.setGravity(20);
        appCompatTextView2.setTypeface(lmlVar.a());
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setMaxWidth(a.p(100, displayMetrics));
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.x = appCompatTextView2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        linearLayout.setOrientation(0);
        linearLayout.setElevation(linearLayout.getRootView().getResources().getDimension(vsg0.div_shadow_elevation));
        int p = a.p(8, displayMetrics);
        linearLayout.setPadding(p, p, 0, 0);
        int p2 = a.p(24, displayMetrics);
        linearLayout.addView(appCompatTextView, new ViewGroup.MarginLayoutParams(p2, p2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, p2);
        layoutParams.setMarginStart(a.p(4, displayMetrics));
        linearLayout.addView(appCompatTextView2, layoutParams);
        this.b = linearLayout;
    }

    public static ChargersAnalytics$ChargersFeedbackCardScreenState v(ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage) {
        int i = p0a.a[chargersFeedbackCompletedOrder$FinishingStage.ordinal()];
        if (i == 1) {
            return ChargersAnalytics$ChargersFeedbackCardScreenState.HoldoutStart;
        }
        if (i == 2) {
            return ChargersAnalytics$ChargersFeedbackCardScreenState.Default;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.d9b
    public void a(Error error) {
        z83.g(null, ((b) this.b).a.get(), Looper.myLooper());
    }

    @Override // defpackage.ye61
    public void b(TotalCaptureResult totalCaptureResult) {
        if (((androidx.concurrent.futures.b) this.x) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.b;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            ((androidx.concurrent.futures.b) this.x).b(null);
            this.x = null;
            this.b = null;
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public BalloonImageProvider balloonImageProvider() {
        return ((TransportNavigationStyleProvider) this.c).balloonImageProvider();
    }

    @Override // defpackage.d9b
    public void c(s020 s020Var) {
        b bVar = (b) this.b;
        z83.g(null, bVar.a.get(), Looper.myLooper());
        bVar.h.post(new d1(17, bVar, this, s020Var));
        e1k e1kVar = (e1k) this.x;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.x = ((a9b) this.w).w(s020Var);
    }

    @Override // defpackage.at21
    public void cancel() {
        z83.g(null, (Looper) this.x, Looper.myLooper());
        bc bcVar = (bc) this.w;
        z83.g(null, ((Handler) bcVar.a).getLooper(), Looper.myLooper());
        bcVar.x = null;
    }

    @Override // defpackage.xs21
    public void close() {
        tje.e();
        ((a9b) this.w).close();
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public ConstructionStyleProvider constructionStyleProvider() {
        return ((TransportNavigationStyleProvider) this.c).constructionStyleProvider();
    }

    @Override // defpackage.ye61
    public void d(float f, androidx.concurrent.futures.b bVar) {
        ((Rect) ((ep7) this.c).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float width = r0.width() / f;
        float height = r0.height() / f;
        float width2 = (r0.width() - width) / 2.0f;
        float height2 = (r0.height() - height) / 2.0f;
        this.w = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        androidx.concurrent.futures.b bVar2 = (androidx.concurrent.futures.b) this.x;
        if (bVar2 != null) {
            bVar2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.b = (Rect) this.w;
        this.x = bVar;
    }

    @Override // defpackage.at21
    /* renamed from: e, reason: collision with other method in class */
    public x08 mo25e(cl21 cl21Var) {
        z83.g(null, ((b) this.b).a.get(), Looper.myLooper());
        h9b b = ((d9g) cl21Var).b();
        ChatRequest chatRequest = (ChatRequest) this.c;
        kse.a(b.a);
        if (b.f.d.get()) {
            return wfz.z;
        }
        o1b0 f = b.f(chatRequest);
        return f != null ? r(b.b(f, chatRequest)) : new g9b(b, chatRequest, new a7b(4, b, this));
    }

    @Override // defpackage.ye61
    public void f(vn7 vn7Var) {
        Rect rect = (Rect) this.w;
        if (rect != null) {
            vn7Var.c(CaptureRequest.SCALER_CROP_REGION, rect, Config$OptionPriority.REQUIRED);
        }
    }

    @Override // defpackage.fo3
    public void g(Error error) {
        ((u1b) this.c).g(error);
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent
    public Set getAllowedRedirectHosts() {
        return ((mpe) this.c).b.getAllowedRedirectHosts();
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent
    public ICommonController getCommonController() {
        u6f0 u6f0Var = (u6f0) this.x;
        if (u6f0Var != null) {
            return u6f0Var;
        }
        mpe mpeVar = (mpe) this.c;
        new pnc();
        IProdEbsCryptoSdkConfig iProdEbsCryptoSdkConfig = mpeVar.a;
        IEbsCryptoSdkConfig iEbsCryptoSdkConfig = mpeVar.b;
        if ((iEbsCryptoSdkConfig instanceof NoGOST) || !(iEbsCryptoSdkConfig instanceof IProdEbsCryptoSdkConfig) || !jl40.l(iEbsCryptoSdkConfig.getKpmApiUri(), iProdEbsCryptoSdkConfig.getKpmApiUri()) || !jl40.l(iEbsCryptoSdkConfig.getInstructionsApiUri(), iProdEbsCryptoSdkConfig.getInstructionsApiUri())) {
            throw new ArgumentsIllegalSdkEbsException("IEbsCryptoSdkConfig - should be IProdEbsCryptoSdkConfig");
        }
        u6f0 u6f0Var2 = new u6f0();
        this.x = u6f0Var2;
        return u6f0Var2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.consumer.di.IConsumerComponent
    public IConsumerController getConsumerController() {
        i9e i9eVar = (i9e) this.b;
        if (i9eVar != null) {
            return i9eVar;
        }
        qwu j = ((boj0) this.c).j(d70.b);
        i9e i9eVar2 = new i9e(new m9e(new h9e(1, j)), ((s421) this.w).getVerificationSessionController(), ((an8) this.x).getSdkDispatchers());
        this.b = i9eVar2;
        return i9eVar2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent
    public Context getContext() {
        Context context = (Context) this.w;
        if (context != null) {
            return context;
        }
        throw new NotInitializedSdkEbsException();
    }

    @Override // defpackage.ye61
    public float getMaxZoom() {
        Float f = (Float) ((ep7) this.c).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // defpackage.ye61
    public float getMinZoom() {
        return 1.0f;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent
    public ISdkDispatchers getSdkDispatchers() {
        dop0 dop0Var = (dop0) this.b;
        if (dop0Var != null) {
            return dop0Var;
        }
        dop0 dop0Var2 = new dop0();
        this.b = dop0Var2;
        return dop0Var2;
    }

    @Override // defpackage.fo3
    public void h(ChatData chatData, UserData userData) {
        w1b w1bVar = (w1b) this.b;
        w1bVar.i.f("chat created", "chat id", chatData.getChatId(), "chat type", (String) this.w);
        ImageFileInfo imageFileInfo = (ImageFileInfo) this.x;
        if (imageFileInfo == null) {
            ((u1b) this.c).h(chatData, userData);
            return;
        }
        hwd hwdVar = w1bVar.h;
        hwdVar.getClass();
        wg10 wg10Var = null;
        z83.h(null, imageFileInfo.getByteSize() > 0);
        z83.h(null, ((Number) imageFileInfo.getPixelSize().c()).intValue() > 0);
        z83.h(null, ((Number) imageFileInfo.getPixelSize().f()).intValue() > 0);
        boolean z = ((long) ((Number) imageFileInfo.getPixelSize().c()).intValue()) * ((long) ((Number) imageFileInfo.getPixelSize().f()).intValue()) > 1000000;
        String mimeType = imageFileInfo.getMimeType();
        if (mimeType != null) {
            Regex regex = wg10.e;
            try {
                wg10Var = qje.o(mimeType);
            } catch (IllegalArgumentException unused) {
            }
        }
        gwd gwdVar = new gwd(hwdVar, imageFileInfo, wg10Var, z);
        to3 to3Var = w1bVar.f;
        to3Var.a.a(new jo3(to3Var, chatData.getChatId(), gwdVar, new p1b(this, userData), 0));
    }

    @Override // defpackage.ye61
    public void i() {
        this.b = null;
        this.w = null;
        androidx.concurrent.futures.b bVar = (androidx.concurrent.futures.b) this.x;
        if (bVar != null) {
            bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.x = null;
        }
    }

    @Override // defpackage.ye61
    public Rect j() {
        Rect rect = (Rect) this.w;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((ep7) this.c).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // defpackage.xs21
    public void k() {
        z83.g(null, ((b) this.b).a.get(), Looper.myLooper());
        e1k e1kVar = (e1k) this.x;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.x = null;
    }

    @Override // defpackage.rt41
    public void l() {
        ((SslErrorHandler) this.c).proceed();
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView((Context) this.c, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1326885258, new x3e(this, 0), true));
        return composeView;
    }

    public xz4 n() {
        k09 k09Var = (k09) this.b;
        ArrayList arrayList = (ArrayList) this.w;
        return !arrayList.isEmpty() ? ((k09) kotlin.collections.a.Z(arrayList)).a : k09Var != null ? k09Var.a : ((q09) this.x).a();
    }

    public LinearLayout o() {
        return (LinearLayout) this.b;
    }

    @Override // defpackage.rt41
    public void onCanceled() {
        ((CommonWebViewClient) this.w).handleSslErrorNormally((WebView) this.x, (SslErrorHandler) this.c, (SslError) this.b);
    }

    public void p() {
        ArrayList arrayList = (ArrayList) this.w;
        if (((k09) this.b) != null || arrayList.isEmpty()) {
            return;
        }
        k09 k09Var = (k09) arrayList.remove(0);
        k09Var.c = new i09(this, k09Var, 0);
        k09Var.d = new i09(this, k09Var, 1);
        this.b = k09Var;
        unr0.C(new Object[]{(q09) this.x, k09Var}, 2, "Transition from %s to %s has started", jst.e);
        k09 k09Var2 = (k09) this.b;
        if (k09Var2 != null) {
            k09Var2.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(String str, o0a o0aVar, c29 c29Var) {
        Object value;
        Set set;
        em9 em9Var = (em9) this.c;
        a0a a0aVar = (a0a) this.b;
        hz9 hz9Var = (hz9) this.x;
        Object[] objArr = 0;
        if (o0aVar instanceof m0a) {
            m0a m0aVar = (m0a) o0aVar;
            String str2 = m0aVar.a;
            ChargersFeedbackBannerAnalyticsAlias chargersFeedbackBannerAnalyticsAlias = m0aVar.b;
            String analyticsName = chargersFeedbackBannerAnalyticsAlias != null ? chargersFeedbackBannerAnalyticsAlias.getAnalyticsName() : null;
            ChargersAnalytics$ChargersFeedbackCardScreenState v = v(m0aVar.c);
            String str3 = m0aVar.d;
            HashMap u = g8e.u("order_id", str, "powerbank_serial_number", str2);
            if (analyticsName != null) {
                u.put("promo_banner", analyticsName);
            }
            u.put("screen_state", v.getEventValue());
            if (str3 != null) {
                u.put("promoplate_id", str3);
            }
            em9Var.a.a("Chargers.FeedbackCard.Shown", u, 4, new HashMap());
            return;
        }
        if (o0aVar instanceof i0a) {
            ChargersAnalytics$ChargersFeedbackCardButtonNameV4 chargersAnalytics$ChargersFeedbackCardButtonNameV4 = ChargersAnalytics$ChargersFeedbackCardButtonNameV4.Rating;
            i0a i0aVar = (i0a) o0aVar;
            int i = i0aVar.a;
            em9.j(em9Var, chargersAnalytics$ChargersFeedbackCardButtonNameV4, v(i0aVar.b), Integer.valueOf(i), null, null, 24);
            x4e.z(i, hz9Var.a, null);
            return;
        }
        if (o0aVar instanceof f0a) {
            String str4 = ((f0a) o0aVar).a.a;
            r0 r0Var = a0aVar.a;
            do {
                value = r0Var.getValue();
                set = (Set) value;
            } while (!r0Var.k(value, set.contains(str4) ? v4r0.f(set, str4) : v4r0.i(set, str4)));
            return;
        }
        if (o0aVar instanceof n0a) {
            ((com.yandex.go.chargers.feedback.domain.b) this.w).a(str, (Integer) hz9Var.b.a.getValue(), kotlin.collections.a.J0((Iterable) a0aVar.b.a.getValue()));
            return;
        }
        int i2 = 9;
        if (o0aVar instanceof g0a) {
            g0a g0aVar = (g0a) o0aVar;
            em9.j(em9Var, ChargersAnalytics$ChargersFeedbackCardButtonNameV4.Done, v(g0aVar.b), (Integer) hz9Var.b.a.getValue(), g0aVar.a, null, 16);
            ((c) c29Var.b).r(new qu(i2));
            return;
        }
        if (jl40.l(o0aVar, d0a.a)) {
            ((c) c29Var.b).r(new qu(i2));
            return;
        }
        boolean z = o0aVar instanceof e0a;
        c21 c21Var = sy60.Q2;
        if (z) {
            e0a e0aVar = (e0a) o0aVar;
            em9.j(em9Var, ChargersAnalytics$ChargersFeedbackCardButtonNameV4.PromoBar, v(e0aVar.b), (Integer) hz9Var.b.a.getValue(), null, null, 24);
            xy9 xy9Var = e0aVar.a;
            if (xy9Var instanceof uy9) {
                ((a60) ((y50) ((c) c29Var.b).J.get())).c(((uy9) xy9Var).a, v770.y);
                return;
            }
            if (jl40.l(xy9Var, wy9.a)) {
                c cVar = (c) c29Var.b;
                cVar.E((m950) cVar.K.get(), new qvn0(new pxm0("chargers", "feedback"), null), c21Var, hxx.a);
                return;
            } else if (jl40.l(xy9Var, vy9.a)) {
                ((c) c29Var.b).r(new ew9(16));
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (o0aVar instanceof j0a) {
            j0a j0aVar = (j0a) o0aVar;
            uj9 uj9Var = j0aVar.a;
            if (uj9Var instanceof ro9) {
                em9.j(em9Var, ChargersAnalytics$ChargersFeedbackCardButtonNameV4.SurgeIcon, v(j0aVar.b), (Integer) hz9Var.b.a.getValue(), null, null, 24);
                hwa hwaVar = ((ro9) uj9Var).a;
                c cVar2 = (c) c29Var.b;
                cVar2.A(cVar2.M.a(cVar2.H), hwaVar, c21Var);
                return;
            }
            return;
        }
        int i3 = 1;
        if (o0aVar instanceof k0a) {
            ((c) c29Var.b).r(new fx9(((k0a) o0aVar).a, i3));
            return;
        }
        if (jl40.l(o0aVar, l0a.a)) {
            ((c) c29Var.b).r(new fx9(objArr == true ? 1 : 0, i3));
        } else {
            if (!(o0aVar instanceof h0a)) {
                w511.b();
                return;
            }
            h0a h0aVar = (h0a) o0aVar;
            em9.j(em9Var, ChargersAnalytics$ChargersFeedbackCardButtonNameV4.Promoplate, v(h0aVar.b), (Integer) hz9Var.b.a.getValue(), null, h0aVar.c, 8);
            q(str, h0aVar.a, c29Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x08 r(s020 s020Var) {
        MessageRef[] messageRefArr;
        MessageRef[] messageRefArr2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        z83.g(null, ((b) this.b).a.get(), Looper.myLooper());
        bc bcVar = (bc) this.w;
        m8g m8gVar = (m8g) s020Var;
        naz0 f = m8gVar.f();
        vcz0 h = m8gVar.h();
        n5t0 e = m8gVar.d.e();
        at2 at2Var = (at2) m8gVar.c.z.get();
        ServerMessageRef serverMessageRef = (ServerMessageRef) bcVar.b;
        String str = (String) bcVar.c;
        String[] strArr = (String[]) bcVar.w;
        r3z c = h.c(serverMessageRef);
        if (c == null) {
            ny61.g("Required value was null.");
            return null;
        }
        if (((Boolean) c.a(new kmn())).booleanValue()) {
            return null;
        }
        GalleryMessageData galleryMessageData = (GalleryMessageData) c.b(new gmn());
        ReplyData replyData = (ReplyData) c.b(new imn());
        o1b0 o1b0Var = f.a;
        String str2 = o1b0Var.b;
        long timestamp = serverMessageRef.getTimestamp();
        String str3 = (String) c.b(new hmn());
        boolean booleanValue = ((Boolean) c.a(new lmn())).booleanValue();
        boolean booleanValue2 = ((Boolean) c.a(new jmn())).booleanValue();
        int i = 2;
        PlainMessage.Text text = new PlainMessage.Text(str, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        PlainMessage.Gallery gallery = galleryMessageData != null ? new PlainMessage.Gallery(str, galleryMessageData.items) : null;
        if (replyData != null) {
            messageRefArr = new MessageRef[]{MessageRef.a(replyData.getTimestamp(), o1b0Var.b)};
        } else {
            List u = at2Var.B().u(o1b0Var.a, serverMessageRef.getTimestamp());
            if (u.isEmpty()) {
                u = null;
            }
            if (u != null) {
                List<gz10> list = u;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (gz10 gz10Var : list) {
                    arrayList.add(MessageRef.a(gz10Var.b, gz10Var.a));
                }
                messageRefArr2 = (MessageRef[]) arrayList.toArray(new MessageRef[0]);
            }
            messageRefArr = messageRefArr2;
        }
        return e.f(new q0b(i, new PlainMessage(text, null, null, null, null, gallery, null, null, str2, timestamp, messageRefArr, null, strArr, str3, booleanValue, null, booleanValue2, null, null, null, 952542, null), bcVar));
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        switch (this.a) {
            case 19:
                this.b = null;
                this.x = null;
                this.w = null;
                break;
            default:
                this.b = null;
                break;
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public RequestPointStyleProvider requestPointStyleProvider() {
        return (p1b) this.x;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public RouteViewStyleProvider routeViewStyleProvider() {
        return (ukf) this.b;
    }

    public void s(List list) {
        ieb iebVar;
        PermissionRequest permissionRequest = (PermissionRequest) this.x;
        iebVar = ((ChatWebChromeClient) this.c).controller;
        hc3 hc3Var = ((heb) iebVar).v;
        hc3 hc3Var2 = (hc3) this.w;
        if (hc3Var == hc3Var2) {
            Fragment fragment = hc3Var2.a;
            if (fragment.isAdded() && !fragment.isRemoving()) {
                Set N0 = kotlin.collections.a.N0(list);
                for (String str : ((dj41) this.b).a) {
                    if (!N0.contains(str)) {
                        permissionRequest.deny();
                        return;
                    }
                }
                permissionRequest.grant(permissionRequest.getResources());
                return;
            }
        }
        permissionRequest.deny();
    }

    public void t(k09 k09Var) {
        ((ArrayList) this.w).add(k09Var);
        unr0.C(new Object[]{k09Var}, 1, "%s is pushed", jst.e);
    }

    public boolean u(k09 k09Var) {
        ArrayList arrayList = (ArrayList) this.w;
        k09 k09Var2 = (k09) this.b;
        if (k09Var2 == null) {
            if (((q09) this.x).c(k09Var)) {
                t(k09Var);
                p();
                return true;
            }
            unr0.C(new Object[]{k09Var, (q09) this.x, (k09) this.b}, 3, "%s is rejected, currentItem = %s, featureItem = %s", jst.e);
            return false;
        }
        k09 k09Var3 = (k09) kotlin.collections.a.b0(arrayList);
        if (k09Var3 != null && k09Var3.b(k09Var)) {
            arrayList.remove(k09Var3);
            unr0.C(new Object[]{k09Var3, k09Var}, 2, "Transition from %s to %s is annihilated", jst.e);
            return false;
        }
        if (k09Var3 != null && k09Var3.c(k09Var)) {
            t(k09Var);
            return true;
        }
        if (k09Var2.b(k09Var)) {
            hst hstVar = jst.e;
            String.format("Transition to %s is canceled by %s", Arrays.copyOf(new Object[]{k09Var2, k09Var}, 2));
            hstVar.getClass();
            k09Var2.d();
            return false;
        }
        if (k09Var2.c(k09Var)) {
            t(k09Var);
            return true;
        }
        unr0.C(new Object[]{k09Var, (q09) this.x, (k09) this.b}, 3, "%s is rejected, currentItem = %s, featureItem = %s", jst.e);
        return false;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public UserLocationStyleProvider userLocationStyleProvider() {
        return (vbb) this.w;
    }

    @Override // defpackage.xs21
    public e1k e(cl21 cl21Var) {
        z83.g(null, ((b) this.b).a.get(), Looper.myLooper());
        return ((d9g) cl21Var).b().d((ChatRequest) this.c, this);
    }

    public /* synthetic */ an8(v7p v7pVar, xvf0 xvf0Var, owf owfVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = v7pVar;
        this.w = xvf0Var;
        this.b = owfVar;
        this.x = xvf0Var2;
    }

    public /* synthetic */ an8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = obj4;
    }

    public an8(qoc qocVar, mpe mpeVar, Context context) {
        this.a = 19;
        this.c = mpeVar;
        this.w = context;
    }

    public an8(j9e j9eVar, boj0 boj0Var, s421 s421Var, an8 an8Var) {
        this.a = 24;
        this.c = boj0Var;
        this.w = s421Var;
        this.x = an8Var;
    }

    public an8(e09 e09Var) {
        this.a = 3;
        this.c = e09Var;
        this.w = new ArrayList();
        this.x = new p09();
    }

    public an8(gg9 gg9Var) {
        this.a = 4;
        this.c = gg9Var;
        this.x = new g();
        this.b = new g();
    }

    public an8(wwe wweVar, jve jveVar, w030 w030Var, Context context, j4n j4nVar) {
        this.a = 25;
        this.c = w030Var;
        this.w = context;
        this.x = j4nVar;
        this.b = jveVar.e;
    }

    public an8(ssr ssrVar) {
        this.a = 29;
        TransportNavigationStyleProvider transportNavigationStyleProvider = new TransportNavigationStyleProvider(ssrVar.a);
        this.c = transportNavigationStyleProvider;
        this.w = new vbb(ssrVar);
        this.x = new p1b(ssrVar);
        this.b = new ukf(transportNavigationStyleProvider.routeViewStyleProvider());
    }

    public an8(zuj0 zuj0Var, gu11 gu11Var, rqo rqoVar) {
        this.a = 21;
        this.c = zuj0Var;
        this.w = gu11Var;
        SmallSummaryConfigExperiment.Companion.getClass();
        this.x = ((jbh) rqoVar).c(SmallSummaryConfigExperiment.e);
        this.b = kotlin.a.a(new l7b(28, this));
    }

    public an8(ep7 ep7Var) {
        this.a = 28;
        this.w = null;
        this.b = null;
        this.c = ep7Var;
    }

    public /* synthetic */ an8() {
        this.a = 18;
    }

    public an8(b bVar, ChatRequest chatRequest, a9b a9bVar) {
        this.a = 15;
        this.b = bVar;
        this.c = chatRequest;
        this.w = a9bVar;
    }

    public an8(b bVar, ChatRequest chatRequest, bc bcVar) {
        this.a = 14;
        this.b = bVar;
        this.c = chatRequest;
        this.w = bcVar;
        this.x = Looper.myLooper();
    }

    public an8(w1b w1bVar, u1b u1bVar, String str, ImageFileInfo imageFileInfo) {
        this.a = 13;
        this.b = w1bVar;
        this.c = u1bVar;
        this.w = str;
        this.x = imageFileInfo;
    }
}
