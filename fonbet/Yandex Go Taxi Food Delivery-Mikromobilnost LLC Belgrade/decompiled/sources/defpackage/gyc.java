package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.ContentInfo;
import android.webkit.WebSettings;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.messaging.core.net.entities.ContactCheckHashResponse;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes15.dex */
public final class gyc implements yk7, ag7, t030, fcv0, go3, jge, ert0, jg5, ryj0, us20, tt5, ryc0, zi51 {
    public final Object a;

    public gyc(mge mgeVar) {
        rt7.D();
        ContentInfo b = mgeVar.a.b();
        Objects.requireNonNull(b);
        this.a = rt7.h(rt7.j(b));
    }

    public void A(String str) {
        ((WebSettings) this.a).setUserAgentString(str);
    }

    public boolean B(boolean z) {
        WebSettings webSettings = (WebSettings) this.a;
        if (hm91.d("ALGORITHMIC_DARKENING")) {
            vj41.b(webSettings, false);
            return true;
        }
        if (!hm91.d("FORCE_DARK")) {
            return false;
        }
        int i = z ? 2 : 0;
        qp41.G.getClass();
        webSettings.setForceDark(i);
        if (hm91.d("FORCE_DARK_STRATEGY") && z) {
            vj41.c(webSettings, 1);
        }
        return true;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        ContactCheckHashResponse contactCheckHashResponse = (ContactCheckHashResponse) obj;
        u9e u9eVar = (u9e) this.a;
        aqb1.d(u9eVar.x, "sync_check_hash_response", b.i(new Pair("uuid", u9eVar.w), new Pair("status_check", contactCheckHashResponse.getStatusCheck().getWireValue())));
        int i = t9e.a[contactCheckHashResponse.getStatusCheck().ordinal()];
        if (i == 1) {
            u9eVar.c();
            return;
        }
        if (i == 2) {
            int i2 = u9eVar.G + 1;
            u9eVar.G = i2;
            if (i2 > 2) {
                u9eVar.c();
                return;
            } else {
                if (u9eVar.E == null) {
                    return;
                }
                s7m a = u9eVar.a();
                a.c();
                u9eVar.C = a;
                return;
            }
        }
        if (i != 3) {
            w511.b();
            return;
        }
        int i3 = u9eVar.G + 1;
        u9eVar.G = i3;
        if (i3 > 2) {
            u9eVar.c();
            return;
        }
        at2 at2Var = u9eVar.y;
        Set N0 = a.N0(at2Var.v().d());
        at2Var.P(new vqb(21, u9eVar));
        l020 C = u9eVar.c.C();
        try {
            ((Number) androidx.room.util.a.b(C.E.c.a, false, true, new vh10(0L, 24))).intValue();
            C.s();
            C.close();
            u9eVar.A.c(N0);
            if (u9eVar.E == null) {
                return;
            }
            s7m a2 = u9eVar.a();
            a2.c();
            u9eVar.C = a2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(C, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.t030
    public boolean H() {
        boolean z;
        z = ((CompositeAddressSearchModalView) this.a).hasCollapsedState;
        return z;
    }

    @Override // defpackage.jge
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.a).setLinkUri(uri);
    }

    @Override // defpackage.us20
    public void b(String str) {
        ((kvf) this.a).N.m(kl41.a);
    }

    @Override // defpackage.jge
    public mge build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.a).build();
        return new mge(new sae(build));
    }

    @Override // defpackage.t030
    public void collapse() {
        ((CompositeAddressSearchModalView) this.a).collapse();
    }

    @Override // defpackage.tt5
    public o501 d(st5 st5Var) {
        return ((bgg) this.a).d(st5Var);
    }

    @Override // defpackage.t030
    public void dismissWithAction(Runnable runnable) {
        ((CompositeAddressSearchModalView) this.a).dismissWithAction(runnable);
    }

    @Override // defpackage.us20
    public void e(ct20 ct20Var) {
        fvf fvfVar;
        p89 p89Var = ct20Var instanceof p89 ? (p89) ct20Var : null;
        if (p89Var == null || (fvfVar = ((kvf) this.a).E) == null) {
            return;
        }
        fvfVar.invoke(p89Var.b);
    }

    @Override // defpackage.t030
    public void expand() {
        ((CompositeAddressSearchModalView) this.a).expand();
    }

    @Override // defpackage.jge
    public void f(ClipData clipData) {
        ((ContentInfo.Builder) this.a).setClip(clipData);
    }

    @Override // defpackage.jge
    public void g(int i) {
        ((ContentInfo.Builder) this.a).setFlags(i);
    }

    @Override // defpackage.tt5
    public void h(String str, qt5 qt5Var, o501 o501Var) {
        ((bgg) this.a).h(str, qt5Var, o501Var);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        psf psfVar = (psf) this.a;
        CountDownTimer countDownTimer = psfVar.I;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        psfVar.I = null;
        dy40 dy40Var = psfVar.y;
        psfVar.w.getClass();
        dy40Var.m(new ksf(ryh0.paymentsdk_challenger_try_again));
    }

    @Override // defpackage.t030
    public boolean isCollapsed() {
        return ((CompositeAddressSearchModalView) this.a).isCollapsed();
    }

    @Override // defpackage.t030
    public boolean isExpanded() {
        return ((CompositeAddressSearchModalView) this.a).isExpanded();
    }

    @Override // defpackage.tt5
    public void j(String str, qt5 qt5Var) {
        ((bgg) this.a).h(str, qt5Var, null);
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        ((hyc) this.a).completeExceptionally(th);
    }

    @Override // defpackage.tt5
    public void l(String str, ByteBuffer byteBuffer) {
        ((bgg) this.a).m(str, byteBuffer, null);
    }

    @Override // defpackage.tt5
    public void m(String str, ByteBuffer byteBuffer, rt5 rt5Var) {
        ((bgg) this.a).m(str, byteBuffer, rt5Var);
    }

    @Override // defpackage.ag7
    public Type n() {
        return (Type) this.a;
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        boolean z = response.a.J;
        hyc hycVar = (hyc) this.a;
        if (z) {
            hycVar.complete(response.b);
        } else {
            hycVar.completeExceptionally(new HttpException(response));
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        ((psf) this.a).X(bvu0.m(10, ((rim0) obj).a));
    }

    public String p() {
        return ((WebSettings) this.a).getUserAgentString();
    }

    public boolean q(List list, TariffOrderFlow tariffOrderFlow) {
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CostCenterField costCenterField = (CostCenterField) it.next();
            TariffOrderFlow.Companion.getClass();
            String b = ijx0.b(tariffOrderFlow);
            if (tariffOrderFlow == null || (b != null && costCenterField.c.contains(b))) {
                String b2 = ((zwe) this.a).b(costCenterField.a);
                if (costCenterField.d && evu0.J(b2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ag7
    public Object r(yv60 yv60Var) {
        hyc hycVar = new hyc(yv60Var);
        yv60Var.k0(new yfa(hycVar));
        return hycVar;
    }

    public void s(boolean z) {
        ((WebSettings) this.a).setAllowContentAccess(z);
    }

    @Override // defpackage.jge
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.a).setExtras(bundle);
    }

    public void t() {
        ((WebSettings) this.a).setAllowFileAccess(false);
    }

    public void u() {
        ((WebSettings) this.a).setDomStorageEnabled(true);
    }

    public void v() {
        ((WebSettings) this.a).setGeolocationEnabled(true);
    }

    public void w() {
        ((WebSettings) this.a).setJavaScriptEnabled(true);
    }

    public void x() {
        ((WebSettings) this.a).setLoadsImagesAutomatically(true);
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        FlexAdapter flexAdapter;
        nh5 currentRouteHandler;
        if (!(ig5Var instanceof tjf) || (flexAdapter = (FlexAdapter) this.a) == null || (currentRouteHandler = flexAdapter.getCurrentRouteHandler()) == null) {
            return;
        }
        currentRouteHandler.hideOverlay(((tjf) ig5Var).a.a, true, b.f());
    }

    public void z() {
        ((WebSettings) this.a).setSupportMultipleWindows(true);
    }

    public gyc(ClipData clipData, int i) {
        this.a = rt7.g(clipData, i);
    }

    public /* synthetic */ gyc(Object obj) {
        this.a = obj;
    }
}
