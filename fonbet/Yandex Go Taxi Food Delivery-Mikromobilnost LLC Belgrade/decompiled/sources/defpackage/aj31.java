package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import androidx.camera.video.k;
import androidx.recyclerview.widget.x0;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import com.yandex.go.taxi.summary.drive.vertical_tariff_selector.VerticalTariffSelectorView;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import com.yandex.payment.sdk.ui.view.Default3DSWebView;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import yads.rf;
import yads.tf;
import yads.uf;

/* loaded from: classes7.dex */
public final class aj31 implements ve31, iqs, s2v, ef4, ja41, ecy0, b88, si51, jyi0, tn51, mp51, j581, o071, gm81 {
    public final /* synthetic */ int a;
    public final Object b;

    public aj31(Context context) {
        this.a = 4;
        this.b = new w53();
    }

    public static JSONObject g() {
        JSONObject a = y471.a(0, 0, 0, 0);
        UiModeManager uiModeManager = tga1.a;
        char c = 3;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                c = 2;
            } else if (currentModeType == 4) {
                c = 1;
            }
        }
        int i = c == 1 ? hia1.a : 2;
        int[] iArr = sy61.a;
        if (i == 0) {
            throw null;
        }
        try {
            a.put("noOutputDevice", iArr[i - 1] == 1);
            return a;
        } catch (JSONException e) {
            Log.e("OMIDLIB", "Error with setting output device status", e);
            return a;
        }
    }

    private final void w() {
    }

    private final void x() {
    }

    @Override // defpackage.o071
    public void a(rp61 rp61Var) {
        ((gp51) rp61Var).f(((WindowManager) this.b).getDefaultDisplay());
    }

    @Override // defpackage.j581
    public void b(cf71 cf71Var) {
        hlx0 hlx0Var = (hlx0) this.b;
        ((kzo) hlx0Var.w).b();
        eq71 eq71Var = (eq71) hlx0Var.b;
        eq71Var.i = null;
        eq71Var.d();
    }

    @Override // defpackage.j581
    public void c() {
        hlx0 hlx0Var = (hlx0) this.b;
        kzo kzoVar = (kzo) hlx0Var.w;
        if (!kzoVar.b) {
            kzoVar.b = true;
            ((xc71) kzoVar.w).a();
            ((Handler) kzoVar.x).post(new h3s0(12, kzoVar));
        }
        jm71 jm71Var = (jm71) hlx0Var.y;
        if (jm71Var != null) {
            jm71Var.c();
        }
    }

    @Override // defpackage.j581
    public void d() {
        hlx0 hlx0Var = (hlx0) this.b;
        ((kzo) hlx0Var.w).b();
        ((eq71) hlx0Var.b).i = null;
        jm71 jm71Var = (jm71) hlx0Var.y;
        if (jm71Var != null) {
            jm71Var.b();
        }
    }

    @Override // defpackage.j581
    public void e() {
        hlx0 hlx0Var = (hlx0) this.b;
        ((kzo) hlx0Var.w).b();
        ((eq71) hlx0Var.b).i = null;
    }

    @Override // defpackage.j581
    public void f() {
    }

    public void h(float f) {
        j681 j681Var = (j681) this.b;
        if (f < 0.0f || f > 1.0f) {
            ny61.g("Invalid Media volume");
            return;
        }
        zka1.a(j681Var);
        JSONObject jSONObject = new JSONObject();
        y471.c(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        y471.c(jSONObject, "deviceVolume", Float.valueOf(pn61.a().a));
        j681Var.e.b("volumeChange", jSONObject);
    }

    @Override // defpackage.j581
    public void i() {
    }

    @Override // defpackage.ve31
    public void i(ux31 ux31Var) {
    }

    @Override // defpackage.ve31
    public void j(String str) {
    }

    @Override // defpackage.ve31
    public void k() {
    }

    @Override // defpackage.ve31
    public void l() {
    }

    @Override // defpackage.mp51
    public gci0 m() {
        return ((hk3) this.b).e;
    }

    @Override // defpackage.ve31
    public void n(x0 x0Var, elx0 elx0Var) {
    }

    @Override // defpackage.ve31
    public void o() {
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        sgb1.g(5, "VideoEncoderSession");
        ((k) this.b).b();
    }

    @Override // defpackage.iqs
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // defpackage.j581
    public void onVolumeChanged(float f) {
    }

    @Override // defpackage.ecy0
    public void p(String str) {
        ((mg21) ((lg21) ((hn41) this.b).y.get())).c(str);
    }

    @Override // defpackage.ecy0
    public List q() {
        ((pux0) ((o3h) ((hn41) this.b).x.get())).getClass();
        return pux0.b;
    }

    @Override // defpackage.ve31
    public void r(elx0 elx0Var, boolean z, int i) {
        xi31 xi31Var;
        lgm lgmVar;
        xi31Var = ((VerticalTariffSelectorView) this.b).presenter;
        if (z) {
            lgmVar = ((DriveTariffCardCollapsedView) xi31Var.x.a).presenter;
            ahm ahmVar = lgmVar.y;
            fem femVar = ahmVar.H;
            if (femVar instanceof t0k) {
                ahmVar.Lg((t0k) femVar, DriveSummaryCardExpansionSource.OfferSelection);
                return;
            }
            return;
        }
        xi31Var.getClass();
        sgx0 sgx0Var = elx0Var.d;
        mi31 b = xi31Var.y.b(sgx0Var, elx0Var.a);
        if (b != null) {
            xi31Var.A.d(SelectionOrigin.USER, b.a.J0, b.b, true);
            return;
        }
        jst.e.k(new IllegalStateException("Tariff not found"), "Tariff " + sgx0Var.a + " not found");
    }

    @Override // defpackage.jyi0
    public void release() {
    }

    @Override // defpackage.jyi0
    public iyi0[] s() {
        return (iyi0[]) this.b;
    }

    @Override // defpackage.jyi0
    public int size() {
        return 0;
    }

    @Override // defpackage.ecy0
    public Map t() {
        return ((hn41) this.b).Mg();
    }

    public void u(float f, float f2) {
        j681 j681Var = (j681) this.b;
        if (f <= 0.0f) {
            ny61.g("Invalid Media duration");
            return;
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            ny61.g("Invalid Media volume");
            return;
        }
        zka1.a(j681Var);
        JSONObject jSONObject = new JSONObject();
        y471.c(jSONObject, "duration", Float.valueOf(f));
        y471.c(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        y471.c(jSONObject, "deviceVolume", Float.valueOf(pn61.a().a));
        j681Var.e.b("start", jSONObject);
    }

    public void v(rf rfVar) {
        tf tfVar;
        j18 j18Var = ((bp5) this.b).a;
        int ordinal = rfVar.ordinal();
        if (ordinal == 0) {
            tfVar = tf.b;
        } else if (ordinal == 1) {
            tfVar = tf.c;
        } else {
            if (ordinal != 2) {
                w511.b();
                return;
            }
            tfVar = tf.d;
        }
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new Result.Failure(new uf(tfVar)));
        }
    }

    public /* synthetic */ aj31(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gm81
    public cr71 a(Context context) {
        return ((s1n) this.b).h(context, MediatedNativeAdapter.class);
    }

    @Override // defpackage.j581, defpackage.o071
    public void a() {
        int i = this.a;
    }

    @Override // defpackage.j581
    public void b() {
    }

    @Override // defpackage.b88
    public void d(Context context, qq31 qq31Var) {
        rwo eventReporter;
        eventReporter = ((WebViewFragment) this.b).getEventReporter();
        qq31Var.invoke(new Default3DSWebView(context, eventReporter));
    }

    @Override // defpackage.j581
    public void h() {
        eq71 eq71Var = (eq71) ((hlx0) this.b).b;
        if (!eq71Var.j) {
            eq71Var.a.j(true);
        }
        if (eq71Var.k) {
            eq71Var.f();
        }
    }
}
