package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import androidx.media3.exoplayer.j;
import androidx.viewpager.widget.ViewPager;
import com.yandex.go.xiva.analytics.XivaWsAnalytics$ConnectionCloseReason;
import com.yandex.go.xiva.data.XivaWebSocketCloseReason;
import com.yandex.go.xiva.domain.g;
import com.yandex.go.xiva.domain.model.XivaConnectionState;
import com.yandex.mobile.ads.common.analytics.model.AdAnalyticsAppIntegrationConfiguration;
import com.ybsdk.api.YBSdkVisualParams;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.ReporterConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.web.view.WebProgressViewHolder$LayoutType;
import ru.yandex.taxi.web.view.WebViewState$State;
import ru.yandex.taxi.widget.progress.CircularProgressBar;
import yads.gh3;
import yads.t52;
import yads.w21;
import yads.yb2;
import yads.yl2;

/* loaded from: classes7.dex */
public final class ji41 implements zs10, af41, pv41, lj41, os41, ll51, bh3, mp51, t070, fo71, jm71, sn61, np71, q481, os71 {
    public final /* synthetic */ int a;
    public final Object b;

    public ji41(Context context, int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = new vr(context.getApplicationContext(), (char) 0);
                break;
            default:
                this.b = dda1.g(context);
                break;
        }
    }

    @Override // defpackage.os71
    public void A(w7o w7oVar) {
        Object failure;
        try {
            AppMetricaLibraryAdapter.setAdvIdentifiersTracking(new AdAnalyticsAppIntegrationConfiguration(w7oVar.a).getIdentifiersTracking());
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.j(a);
        }
    }

    @Override // defpackage.ll51
    public void B(ml51 ml51Var) {
    }

    @Override // defpackage.np71
    public void C(List list, aj31 aj31Var) {
        AppMetrica.requestStartupParams(((hv2) this.b).a, new gv2(list, new i971(5, aj31Var)), list);
    }

    @Override // defpackage.af41
    public void E(String str) {
        hn41.Kg((hn41) this.b, str, true);
    }

    @Override // defpackage.os71
    public void F(w7o w7oVar) {
        Object failure;
        AdAnalyticsAppIntegrationConfiguration adAnalyticsAppIntegrationConfiguration = new AdAnalyticsAppIntegrationConfiguration(w7oVar.a);
        iv2 iv2Var = (iv2) this.b;
        try {
            AppMetricaLibraryAdapter.activate(iv2Var.a, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(adAnalyticsAppIntegrationConfiguration.getIdentifiersTracking()).build());
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.j(a);
        }
    }

    @Override // defpackage.os41
    public String[] G() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // defpackage.af41
    public void H() {
        hn41 hn41Var = (hn41) this.b;
        if (hn41Var.I.a == WebViewState$State.ERROR) {
            return;
        }
        hn41Var.Og(cu41.c);
    }

    @Override // defpackage.bh3
    public void I() {
        ((eno) this.b).x1 = true;
    }

    @Override // defpackage.bh3
    public void K() {
        j jVar = ((eno) this.b).a0;
        if (jVar != null) {
            jVar.b();
        }
    }

    public Matrix L(float f, float f2, gh3 gh3Var) {
        int ordinal = gh3Var.ordinal();
        if (ordinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f, f2, 0.0f, 0.0f);
            return matrix;
        }
        if (ordinal != 1) {
            w511.b();
            return null;
        }
        vn61 vn61Var = (vn61) this.b;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f, f2, vn61Var.a / 2.0f, vn61Var.b / 2.0f);
        return matrix2;
    }

    public Drawable M(byte[] bArr) {
        jv81 pm81Var;
        w21 a = cr81.a(bArr);
        vr vrVar = (vr) this.b;
        vrVar.getClass();
        int ordinal = a.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                pm81Var = new z291();
                return pm81Var.a(vrVar.a.getApplicationContext(), bArr);
            }
            if (ordinal != 3) {
                w511.b();
                return null;
            }
        }
        pm81Var = new pm81();
        return pm81Var.a(vrVar.a.getApplicationContext(), bArr);
    }

    public boolean N() {
        return ((YBSdkVisualParams) this.b).getShowAsSlidableView();
    }

    public void O(XivaWebSocketCloseReason xivaWebSocketCloseReason) {
        XivaWsAnalytics$ConnectionCloseReason xivaWsAnalytics$ConnectionCloseReason;
        hst hstVar = jst.e;
        xivaWebSocketCloseReason.name();
        hstVar.getClass();
        g gVar = (g) this.b;
        gVar.f = null;
        gVar.e.l(XivaConnectionState.Disconnected);
        se51 se51Var = gVar.b;
        int i = ae51.a[xivaWebSocketCloseReason.ordinal()];
        if (i == 1) {
            xivaWsAnalytics$ConnectionCloseReason = XivaWsAnalytics$ConnectionCloseReason.ClientDisconnected;
        } else if (i == 2) {
            xivaWsAnalytics$ConnectionCloseReason = XivaWsAnalytics$ConnectionCloseReason.ConnectionError;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            xivaWsAnalytics$ConnectionCloseReason = XivaWsAnalytics$ConnectionCloseReason.ServerError;
        }
        se51Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, xivaWsAnalytics$ConnectionCloseReason.getEventValue());
        se51Var.a.a("XivaWs.Connection.Closed", hashMap, 1, new HashMap());
    }

    public void P() {
        g gVar = (g) this.b;
        r0 r0Var = gVar.e;
        XivaConnectionState xivaConnectionState = (XivaConnectionState) r0Var.getValue();
        XivaConnectionState xivaConnectionState2 = XivaConnectionState.Connected;
        if (xivaConnectionState == xivaConnectionState2) {
            return;
        }
        jst.e.getClass();
        r0Var.l(xivaConnectionState2);
        se51 se51Var = gVar.b;
        se51Var.getClass();
        se51Var.a.a("XivaWs.Connection.Connected", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.jm71
    /* renamed from: a */
    public void mo24a() {
        switch (this.a) {
            case 20:
                ((fl61) ((pzf) this.b).g).a();
                break;
            default:
                AppMetrica.setDataSendingEnabled(false);
                break;
        }
    }

    @Override // defpackage.jm71
    public void b() {
        pzf pzfVar = (pzf) this.b;
        pzfVar.b = null;
        ak81 ak81Var = (ak81) pzfVar.h;
        int i = 22;
        if (ak81Var == null || !ak81Var.d) {
            cr71 cr71Var = (cr71) pzfVar.l;
            t52 t52Var = (t52) ((yp61) cr71Var.b).d();
            if (t52Var != null) {
                yl2 yl2Var = t52Var.c.a;
                d291 d291Var = (d291) cr71Var.w;
                d291Var.getClass();
                yl2Var.setVisibility(4);
                yl2Var.a.setOnClickListener(d291Var.a);
                Bitmap bitmap = t52Var.b.getBitmap();
                if (bitmap != null) {
                    q981 q981Var = (q981) cr71Var.c;
                    q981Var.a.execute(new kz(bitmap, new vi71(i, cr71Var, t52Var, yl2Var), q981Var.b, q981Var.c, 9));
                }
            }
        } else {
            pp71 pp71Var = (pp71) pzfVar.a;
            pp71Var.a.post(new jy31(i, pzfVar));
        }
        ((fl61) pzfVar.g).b();
    }

    @Override // defpackage.fo71, defpackage.q481
    public void c(hk61 hk61Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 15:
                ((q481) obj).c(hk61Var);
                break;
            default:
                xrr xrrVar = (xrr) obj;
                if (!xrrVar.b) {
                    zn71 zn71Var = (zn71) xrrVar.c;
                    o9a1.d(zn71Var.c.a.b);
                    zn71Var.n();
                    zn71Var.m();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.os41
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ei6.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // defpackage.af41
    public void d() {
        ((gn41) ((hn41) this.b).Dg()).refreshBackButton();
    }

    @Override // defpackage.sn61
    public long g() {
        long j = Long.MAX_VALUE;
        for (sn61 sn61Var : (sn61[]) this.b) {
            long g = sn61Var.g();
            if (g != Long.MIN_VALUE) {
                j = Math.min(j, g);
            }
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.np71
    public String getDeviceId() {
        return AppMetrica.getDeviceId(((hv2) this.b).a);
    }

    @Override // defpackage.os41
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) ei6.a(DropDataContentProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getDropDataProvider());
    }

    @Override // defpackage.lj41
    public WebProgressViewHolder$LayoutType getLayoutType() {
        return WebProgressViewHolder$LayoutType.WRAP_CONTENT;
    }

    @Override // defpackage.os41
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) ei6.a(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getProxyController());
    }

    @Override // defpackage.os41
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ei6.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // defpackage.np71
    public String getUuid() {
        return AppMetrica.getUuid(((hv2) this.b).a);
    }

    @Override // defpackage.lj41
    public View getView() {
        return (CircularProgressBar) this.b;
    }

    @Override // defpackage.os41
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) ei6.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getWebkitToCompatConverter());
    }

    @Override // defpackage.sn61
    public void h(long j) {
        for (sn61 sn61Var : (sn61[]) this.b) {
            sn61Var.h(j);
        }
    }

    @Override // defpackage.sn61
    public long i() {
        long j = Long.MAX_VALUE;
        for (sn61 sn61Var : (sn61[]) this.b) {
            long i = sn61Var.i();
            if (i != Long.MIN_VALUE) {
                j = Math.min(j, i);
            }
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.sn61
    public boolean isLoading() {
        for (sn61 sn61Var : (sn61[]) this.b) {
            if (sn61Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sn61
    public boolean k(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long i = i();
            if (i == Long.MIN_VALUE) {
                return z2;
            }
            z = false;
            for (sn61 sn61Var : (sn61[]) this.b) {
                long i2 = sn61Var.i();
                boolean z3 = i2 != Long.MIN_VALUE && i2 <= j;
                if (i2 == i || z3) {
                    z |= sn61Var.k(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.bh3
    public void l() {
        ((eno) this.b).B1 = true;
    }

    @Override // defpackage.mp51
    public gci0 m() {
        return ((hk3) this.b).e;
    }

    @Override // defpackage.fo71
    public void n(ArrayList arrayList) {
        ((q481) this.b).b(so61.a);
    }

    @Override // defpackage.fo71
    public void o(mw81 mw81Var) {
        ((q481) this.b).c(mw81Var);
    }

    @Override // defpackage.bh3
    public void onAudioSinkError(Exception exc) {
        lk91.f("YMediaCodecAudioRendere", "Audio sink error", exc);
        h0w h0wVar = ((eno) this.b).N0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new tg3(h0wVar, exc, 1));
        }
    }

    @Override // defpackage.bh3
    public void onAudioTrackInitialized(ah3 ah3Var) {
        h0w h0wVar = ((eno) this.b).N0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new sg3(h0wVar, ah3Var, 1));
        }
    }

    @Override // defpackage.bh3
    public void onAudioTrackReleased(ah3 ah3Var) {
        h0w h0wVar = ((eno) this.b).N0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new sg3(h0wVar, ah3Var, 0));
        }
    }

    @Override // defpackage.bh3
    public void onSkipSilenceEnabledChanged(boolean z) {
        h0w h0wVar = ((eno) this.b).N0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new rg3(h0wVar, z, 0));
        }
    }

    @Override // defpackage.t070
    public /* synthetic */ void onSuccess(Object obj) {
        ((yb2) this.b).invoke(obj);
    }

    @Override // defpackage.bh3
    public void p(long j) {
        h0w h0wVar = ((eno) this.b).N0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new vg3(h0wVar, j, 0));
        }
    }

    @Override // defpackage.np71
    public String q() {
        return AppMetrica.getLibraryVersion();
    }

    @Override // defpackage.np71
    public hk71 r(String str) {
        return new hk71(0, new ryh(20, AppMetrica.getReporter(((hv2) this.b).a, str)));
    }

    @Override // defpackage.os71
    public void reportEvent(String str, String str2) {
        Object failure;
        try {
            AppMetricaLibraryAdapter.reportEvent("ads_sdk", str, str2);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.j(a);
        }
    }

    @Override // defpackage.bh3
    public void s(int i, long j, long j2) {
        h0w h0wVar = ((eno) this.b).N0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new wg3(i, 0, j, j2, h0wVar));
        }
    }

    @Override // defpackage.bh3
    public void t() {
        ((eno) this.b).onRendererCapabilitiesChanged();
    }

    @Override // defpackage.zs10
    public Object u(String str) {
        Object failure;
        Object failure2;
        sbx sbxVar = ((ki41) this.b).b.a;
        try {
            failure = (vi41) sbxVar.b(yi41.a, str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        vi41 vi41Var = (vi41) failure;
        if (vi41Var != null) {
            return vi41Var;
        }
        try {
            failure2 = (vi41) sbxVar.b(xi41.a, str);
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        vi41 vi41Var2 = (vi41) (failure2 instanceof Result.Failure ? null : failure2);
        return vi41Var2 == null ? new ti41(str) : vi41Var2;
    }

    @Override // defpackage.ll51
    public void v(ml51 ml51Var) {
        ((ViewPager) this.b).setCurrentItem(ml51Var.b);
    }

    @Override // defpackage.np71
    public void w(String str) {
        hv2 hv2Var = (hv2) this.b;
        AppMetrica.activateReporter(hv2Var.a, ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // defpackage.bh3
    public void y() {
        j jVar = ((eno) this.b).a0;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // defpackage.af41
    public void z() {
        hn41 hn41Var = (hn41) this.b;
        if (hn41Var.I.a == WebViewState$State.LOADED) {
            hn41Var.Og(cu41.b);
        }
    }

    public /* synthetic */ ji41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ji41(i971 i971Var) {
        this.a = 27;
        this.b = new nr41(8, i971Var);
    }

    @Override // defpackage.jm71
    public void c() {
        t52 t52Var = (t52) ((yp61) ((pzf) this.b).f).d();
        if (t52Var != null) {
            t52Var.setClickable(true);
        }
    }

    @Override // defpackage.fo71, defpackage.q481
    public void b(dl61 dl61Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 15:
                ((q481) obj).b(dl61Var);
                break;
            default:
                xrr xrrVar = (xrr) obj;
                if (!xrrVar.b) {
                    ((zn71) xrrVar.c).h(dl61Var);
                    break;
                }
                break;
        }
    }
}
