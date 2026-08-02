package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.PlusWebMessagesDiagnostic$MessagesSource;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.diagnostic.PlusWebViewDiagnostic$WebViewSource;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import java.lang.reflect.InvocationHandler;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalStateVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationStateFactory;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.b;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.c;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.d;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.f;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.g;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.h;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.i;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.j;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.k;
import ru.rt.ebs.cryptosdk.entities.exceptions.InstructionHandlerException;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.VideoRecordingFragment;
import ru.yandex.taxi.order.state.transporting.TransportingStateView;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.view.WebViewState$State;

/* loaded from: classes13.dex */
public class eg01 implements b860, s8i0, wj2, IVerificationStateFactory, mvo, rmu0, yd70, z2v, WebMessageListenerBoundaryInterface, la41, fm41, ko41, a88 {
    public final Object a;

    public eg01(ofg ofgVar, st2 st2Var) {
        this.a = e.R(ofgVar.a(), bvf0.a(st2Var.a), wsr0.a(xsr0.a, 3), Boolean.valueOf(ofgVar.b()));
    }

    public static eg01 i(tt5 tt5Var, String str) {
        yxf0 yxf0Var = new yxf0();
        yxf0Var.b = new ArrayList();
        qm31 qm31Var = new qm31(yxf0Var);
        new afo(tt5Var, str.length() > 0 ? "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents.".concat(str) : "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents", iy10.a).a(new uk10(qm31Var));
        return new eg01(yxf0Var);
    }

    @Override // defpackage.ko41
    public gci0 a() {
        return (gci0) this.a;
    }

    @Override // defpackage.yd70
    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.a)) {
            ((ByteBuffer) this.a).position(0);
            messageDigest.update(((ByteBuffer) this.a).putLong(l.longValue()).array());
        }
    }

    @Override // defpackage.s8i0
    public void c(String str, boolean z) {
        Object value;
        TaxiOrder taxiOrder;
        o2y0 o2y0Var = ((TransportingStateView) this.a).getPresenter().A;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            LinkedHashSet linkedHashSet = new LinkedHashSet(taxiOrder.l.getW().getB());
            if (z) {
                linkedHashSet.add(str);
            } else {
                linkedHashSet.remove(str);
            }
            taxiOrder.R(new ArrayList(linkedHashSet));
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationStateFactory
    public z3v createState(lfx lfxVar, IVerificationFlow iVerificationFlow) {
        o021 o021Var = (o021) this.a;
        ht10 ht10Var = (ht10) o021Var.h;
        boj0 boj0Var = (boj0) o021Var.e;
        w3i w3iVar = (w3i) o021Var.f;
        s421 s421Var = (s421) o021Var.a;
        if (lfxVar.equals(qoi0.a(r721.class))) {
            return new r721(iVerificationFlow, o021Var.getRouter(), ((wrr) o021Var.b).getInitializationController());
        }
        if (lfxVar.equals(qoi0.a(k2u0.class))) {
            return new k2u0(iVerificationFlow, o021Var.getRouter(), ((hwo0) o021Var.c).getSecurityController(), ht10Var.getMetadataController());
        }
        if (lfxVar.equals(qoi0.a(o6f0.class))) {
            return new o6f0(iVerificationFlow, s421Var.getVerificationSessionController(), o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(b.class))) {
            return new b(w3iVar.getEbsController(), s421Var.getVerificationSessionController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(c.class))) {
            return new c(iVerificationFlow, s421Var.getVerificationSessionController(), o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(f.class))) {
            return new f(iVerificationFlow, o021Var.getRouter(), ht10Var.getMetadataController());
        }
        if (lfxVar.equals(qoi0.a(bxy.class))) {
            return new bxy(iVerificationFlow, o021Var.getRouter(), ((q4g) o021Var.d).getInstructionsController());
        }
        if (lfxVar.equals(qoi0.a(z0u0.class))) {
            return new z0u0(boj0Var.getAdapterController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(gbo.class))) {
            return new gbo(boj0Var.getAdapterController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(d.class))) {
            return new d(boj0Var.getAdapterController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(dvv.class))) {
            return new dvv(w3iVar.getEbsController(), s421Var.getVerificationSessionController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(d2k0.class))) {
            return new d2k0(w3iVar.getEbsController(), s421Var.getVerificationSessionController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(i.class))) {
            return new i(iVerificationFlow, o021Var.getRouter(), w3iVar.getEbsController());
        }
        if (lfxVar.equals(qoi0.a(qc21.class))) {
            return new qc21(w3iVar.getEbsController(), s421Var.getVerificationSessionController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(a1u0.class))) {
            return new a1u0(boj0Var.getAdapterController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(yvo.class))) {
            return new yvo(boj0Var.getAdapterController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.e.class))) {
            return new ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.e(boj0Var.getAdapterController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(h.class))) {
            return new h(iVerificationFlow, o021Var.getRouter(), w3iVar.getEbsController());
        }
        if (lfxVar.equals(qoi0.a(ad21.class))) {
            return new ad21(w3iVar.getEbsController(), s421Var.getVerificationSessionController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(u8p.class))) {
            return new u8p(iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(k731.class))) {
            return new k731(iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(pc21.class))) {
            return new pc21(iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(mar.class))) {
            return new mar(boj0Var.getAdapterController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(k.class))) {
            return new k(iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(g.class))) {
            return new g(w3iVar.getEbsController(), s421Var.getVerificationSessionController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(j.class))) {
            return new j(w3iVar.getEbsController(), s421Var.getVerificationSessionController(), iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(n9e.class))) {
            return new n9e(iVerificationFlow, ((an8) o021Var.g).getConsumerController(), o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(iz5.class))) {
            return new iz5(iVerificationFlow, s421Var.getVerificationSessionController(), o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(uao.class))) {
            return new uao(iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(fbo.class))) {
            return new fbo(iVerificationFlow, o021Var.getRouter());
        }
        if (lfxVar.equals(qoi0.a(xvo.class))) {
            return new xvo(iVerificationFlow, o021Var.getRouter());
        }
        throw new IllegalStateVerificationFlowEbsException(lfxVar.toString());
    }

    @Override // defpackage.mvo
    public b231 d(Map map) {
        return new ja31((bg1) this.a);
    }

    @Override // defpackage.fm41
    public void e(int i, String str) {
        hn41 hn41Var = (hn41) this.a;
        if (i == 401) {
            ((bi41) hn41Var.A.get()).onPageLoadingError(i790.a);
        } else {
            bi41 bi41Var = (bi41) hn41Var.A.get();
            Uri.parse(str);
            bi41Var.onPageLoadingError(new k790());
        }
        String title = hn41Var.H.getTitle();
        if (title == null) {
            title = "";
        }
        hn41.Kg(hn41Var, title, false);
        hn41Var.Og(cu41.d);
        ((dp41) hn41Var.B.get()).b();
    }

    @Override // defpackage.z2v
    public void f() {
        VideoRecordingFragment.access$getViewModel((VideoRecordingFragment) this.a).f0(pn31.a);
    }

    @Override // defpackage.z2v
    public void g() {
        VideoRecordingFragment videoRecordingFragment = (VideoRecordingFragment) this.a;
        VideoRecordingFragment.access$getViewModel(videoRecordingFragment).f0(new ln31(videoRecordingFragment.getString(kzh0.ebssdk_pre_instructions_for_video)));
    }

    @Override // defpackage.wj2
    public ynr get(int i) {
        return ((por[]) this.a)[i];
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // defpackage.z2v
    public void h(InstructionHandlerException instructionHandlerException) {
        VideoRecordingFragment.access$getViewModel((VideoRecordingFragment) this.a).f0(new hao(instructionHandlerException));
    }

    public void j(ItemType itemType) {
        com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.b bVar = (com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.b) this.a;
        int i = kr01.a[itemType.ordinal()];
        if (i == 1) {
            pzt0 pzt0Var = bVar.J;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            pzt0 pzt0Var2 = bVar.K;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        pzt0 pzt0Var3 = bVar.I;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        pzt0 pzt0Var4 = bVar.K;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
    }

    public kio k(PlusWebMessagesDiagnostic$MessagesSource plusWebMessagesDiagnostic$MessagesSource) {
        com.yandex.plus.home.internal.di.b bVar = (com.yandex.plus.home.internal.di.b) this.a;
        bVar.getClass();
        int i = s42.c[plusWebMessagesDiagnostic$MessagesSource.ordinal()];
        if (i == 1) {
            return (kio) bVar.y.getValue();
        }
        if (i == 2) {
            return (kio) bVar.z.getValue();
        }
        if (i == 3) {
            return (kio) bVar.A.getValue();
        }
        w511.b();
        return null;
    }

    public boolean l() {
        return ((WebSettingsBoundaryInterface) this.a).getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int m() {
        return ((WebSettingsBoundaryInterface) this.a).getForceDark();
    }

    public qio n(PlusPaymentStat$Source plusPaymentStat$Source) {
        com.yandex.plus.home.internal.di.b bVar = (com.yandex.plus.home.internal.di.b) this.a;
        bVar.getClass();
        int i = s42.d[plusPaymentStat$Source.ordinal()];
        if (i == 1) {
            return (qio) bVar.E.getValue();
        }
        if (i == 2) {
            return (qio) bVar.F.getValue();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.fm41
    public void o(String str, String str2) {
        hn41 hn41Var = (hn41) this.a;
        ((bi41) hn41Var.A.get()).onPageFinished(str);
        boolean z = hn41Var.I.a == WebViewState$State.ERROR;
        hn41.Kg(hn41Var, str2, z);
        if (z || !jl40.l(hn41Var.H.getSignalForLoaded(), UiWebViewConfig.SignalForLoaded.Default.INSTANCE)) {
            return;
        }
        hn41Var.Og(cu41.c);
    }

    @Override // defpackage.fm41
    public void onPageCommitVisible(String str) {
        hn41 hn41Var = (hn41) this.a;
        ((bi41) hn41Var.A.get()).onPageCommitVisible(str);
        if (hn41Var.I.a != WebViewState$State.ERROR && jl40.l(hn41Var.H.getSignalForLoaded(), UiWebViewConfig.SignalForLoaded.OnCommitVisible.INSTANCE)) {
            hn41Var.Og(cu41.c);
        }
    }

    @Override // defpackage.fm41
    public void onPageStarted(String str) {
        String fragment;
        hn41 hn41Var = (hn41) this.a;
        ((gn41) hn41Var.Dg()).H4();
        String str2 = "";
        ((bi41) hn41Var.A.get()).onPageStarted(str == null ? "" : str);
        if (str != null && (fragment = Uri.parse(str).getFragment()) != null) {
            str2 = fragment;
        }
        hn41Var.F = (str2.length() == 0 || !evu0.y(str2, "receipt_url_pdf=", false)) ? null : str2.substring(evu0.H(str2, "receipt_url_pdf=", 0, false, 6) + 16);
        ((gn41) hn41Var.Dg()).nb(hn41Var.I);
        String str3 = hn41Var.G;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        if (jl40.l(hn41Var.G, Uri.parse(str).getHost())) {
            ((gn41) hn41Var.Dg()).clearHistory();
            hn41Var.G = null;
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        ih41 b = gh41.b((WebMessageBoundaryInterface) ei6.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) ei6.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            ((qm41) this.a).onPostMessage(webView, b, uri, z, (e7x) jsReplyProxyBoundaryInterface.getOrCreatePeer(new d7x(0, jsReplyProxyBoundaryInterface)));
        }
    }

    public Set p() {
        return ((WebSettingsBoundaryInterface) this.a).getRequestedWithHeaderOriginAllowList();
    }

    public vio q(PlusWebMessagesDiagnostic$MessagesSource plusWebMessagesDiagnostic$MessagesSource) {
        com.yandex.plus.home.internal.di.b bVar = (com.yandex.plus.home.internal.di.b) this.a;
        bVar.getClass();
        int i = s42.c[plusWebMessagesDiagnostic$MessagesSource.ordinal()];
        if (i == 1) {
            return (vio) bVar.B.getValue();
        }
        if (i == 2) {
            return (vio) bVar.C.getValue();
        }
        if (i == 3) {
            return (vio) bVar.D.getValue();
        }
        w511.b();
        return null;
    }

    public wio r(PlusWebViewDiagnostic$WebViewSource plusWebViewDiagnostic$WebViewSource) {
        com.yandex.plus.home.internal.di.b bVar = (com.yandex.plus.home.internal.di.b) this.a;
        bVar.getClass();
        int i = s42.b[plusWebViewDiagnostic$WebViewSource.ordinal()];
        if (i == 1) {
            return (wio) bVar.s.getValue();
        }
        if (i == 2) {
            return (wio) bVar.t.getValue();
        }
        if (i == 3) {
            return (wio) bVar.u.getValue();
        }
        if (i == 4) {
            return (wio) bVar.v.getValue();
        }
        w511.b();
        return null;
    }

    public boolean s() {
        return ((WebSettingsBoundaryInterface) this.a).isAlgorithmicDarkeningAllowed();
    }

    public void t(boolean z) {
        ((WebSettingsBoundaryInterface) this.a).setAlgorithmicDarkeningAllowed(z);
    }

    public void u(boolean z) {
        ((WebSettingsBoundaryInterface) this.a).setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    public void v(int i) {
        ((WebSettingsBoundaryInterface) this.a).setForceDarkBehavior(i);
    }

    public void w(boolean z) {
        u111 viewModel;
        viewModel = ((TransportCardsActivity) this.a).getViewModel();
        ahr ahrVar = viewModel.b;
        if (ahrVar != null) {
            ((com.yandex.payment.sdk.flex.impl.b) ahrVar).h(gw00.e(new Pair("TransportGlobalState", gw00.e(new Pair("isNfcEnabled", Boolean.valueOf(z))))));
        }
    }

    public void x(boolean z) {
        ((WebSettingsBoundaryInterface) this.a).setPaymentRequestEnabled(z);
    }

    public void y(Set set) {
        ((WebSettingsBoundaryInterface) this.a).setRequestedWithHeaderOriginAllowList(set);
    }

    public /* synthetic */ eg01(Object obj) {
        this.a = obj;
    }

    public eg01(a73 a73Var) {
        this.a = (TorchFlashRequiredFor3aUpdateQuirk) a73Var.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public eg01() {
        this.a = ByteBuffer.allocate(8);
    }

    public eg01(sj2 sj2Var, float f, float f2) {
        int b = sj2Var.b();
        por[] porVarArr = new por[b];
        for (int i = 0; i < b; i++) {
            porVarArr[i] = new por(f, f2, sj2Var.a(i));
        }
        this.a = porVarArr;
    }
}
