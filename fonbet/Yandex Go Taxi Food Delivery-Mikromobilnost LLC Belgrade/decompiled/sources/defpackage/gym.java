package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.camera.video.internal.encoder.j;
import com.google.android.material.floatingtoolbar.FloatingToolbarLayout;
import com.yandex.go.flex.common.analytics.models.WebAdjustEventParams;
import com.yandex.go.flex.common.router.web_view.b;
import com.yandex.messaging.core.net.entities.UserData;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.widget.due_timetable.DueTimetableView;

/* loaded from: classes12.dex */
public final class gym implements cym, k2n, tx11, tsn, iqs, ho3, r1o, jg5, q1y0, ymr, bx60, rsr, s2h, aa3, af70 {
    public final Object a;

    public gym(File file) {
        mrj mrjVar = new mrj(20, false);
        mrjVar.b = 0L;
        mrjVar.c = 0L;
        this.a = mrjVar;
        mrjVar.w = file;
    }

    public static gym l(ep7 ep7Var) {
        CameraCharacteristics.Key key;
        int i = Build.VERSION.SDK_INT;
        gym gymVar = null;
        if (i >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            DynamicRangeProfiles h = jif.h(ep7Var.a(key));
            if (h != null) {
                d6z.y("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
                gymVar = new gym(new v8n(h));
            }
        }
        return gymVar == null ? w8n.a : gymVar;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        UserData userData = (UserData) obj;
        l020 C = ((d1o) this.a).y.C();
        try {
            C.P0(userData);
            C.s();
            C.close();
        } finally {
        }
    }

    @Override // defpackage.tsn
    public void a() {
        EditText editText = (EditText) this.a;
        if (editText.getText().length() > 0) {
            editText.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        return ni91.f(((ims) this.a).mo104apply(obj));
    }

    @Override // defpackage.tsn
    public void b(String str) {
        EditText editText = (EditText) this.a;
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        editText.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), str);
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        return true;
    }

    @Override // defpackage.af70
    public void d(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        if (i2 < i) {
            o(str, "Minus");
        } else {
            o(str, "Plus");
        }
    }

    @Override // defpackage.af70
    public void e(String str, String str2, boolean z) {
        if (z) {
            d(0, 1, str2);
        } else {
            d(1, 0, str2);
        }
    }

    @Override // defpackage.tx11
    public void f() {
        ((ImageView) this.a).setActivated(true);
    }

    @Override // defpackage.tx11
    public void g() {
        ((ImageView) this.a).setActivated(false);
    }

    @Override // defpackage.s2h
    public void h(String str) {
        ((eks) this.a).r(new vsq(str, 5));
    }

    @Override // defpackage.k2n
    public void i(int i) {
        ((DueTimetableView) this.a).notifyItemSelected(i);
    }

    public r0r j() {
        mrj mrjVar = (mrj) this.a;
        String str = ((Long) mrjVar.b) == null ? " fileSizeLimit" : "";
        if (((Long) mrjVar.c) == null) {
            str = str.concat(" durationLimitMillis");
        }
        if (((File) mrjVar.w) == null) {
            str = str.concat(" file");
        }
        if (str.isEmpty()) {
            return new r0r(new r64(((Long) mrjVar.b).longValue(), ((Long) mrjVar.c).longValue(), (File) mrjVar.w));
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }

    @Override // defpackage.k2n
    public void k(int i) {
        ((DueTimetableView) this.a).notifyItemSelected(i);
    }

    public void m(String str) {
        Uri parse = Uri.parse(str);
        b bVar = (b) this.a;
        Context context = bVar.D;
        f fVar = bVar.N;
        if (fVar.c(parse)) {
            fVar.b((Activity) context, str, v770.e);
        } else {
            q5z.O(context, str);
        }
    }

    @Override // defpackage.r1o
    public Object n(String str) {
        return ((j2o) this.a).a(str, null);
    }

    public void o(String str, String str2) {
        ubx0 ubx0Var = (ubx0) this.a;
        Map z = g8e.z(str, str2);
        o7r0 o7r0Var = ubx0Var.a;
        Map e = gw00.e(new Pair("OptionClick", z));
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("Glued", e);
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        o7r0Var.a.a(sb2.q("TariffCard", hashMap), hashMap, 1, hashMap2);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        FloatingToolbarLayout floatingToolbarLayout = (FloatingToolbarLayout) this.a;
        z = floatingToolbarLayout.marginLeftSystemWindowInsets;
        if (!z) {
            z2 = floatingToolbarLayout.marginRightSystemWindowInsets;
            if (!z2) {
                z3 = floatingToolbarLayout.marginTopSystemWindowInsets;
                if (!z3) {
                    z4 = floatingToolbarLayout.marginBottomSystemWindowInsets;
                    if (!z4) {
                        return n751Var;
                    }
                }
            }
        }
        u1w g = n751Var.a.g(655);
        floatingToolbarLayout.bottomMarginWindowInset = g.d;
        floatingToolbarLayout.topMarginWindowInset = g.b;
        floatingToolbarLayout.rightMarginWindowInset = g.c;
        floatingToolbarLayout.leftMarginWindowInset = g.a;
        floatingToolbarLayout.updateMargins();
        return n751Var;
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        boolean z = th instanceof MediaCodec.CodecException;
        j jVar = (j) ((jln) this.a).b;
        if (!z) {
            jVar.b(0, th.getMessage(), th);
        } else {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            jVar.b(1, codecException.getMessage(), codecException);
        }
    }

    @Override // defpackage.iqs
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public void p(String str, WebAdjustEventParams webAdjustEventParams) {
        WebAdjustEventParams.WebAdjustEventRevenue webAdjustEventRevenue;
        umr umrVar = ((b) this.a).M;
        umrVar.getClass();
        jx4 jx4Var = new jx4(str);
        ix4 ix4Var = null;
        jx4Var.b = webAdjustEventParams != null ? webAdjustEventParams.a : null;
        jx4Var.c = webAdjustEventParams != null ? webAdjustEventParams.b : null;
        jx4Var.f = webAdjustEventParams != null ? webAdjustEventParams.d : null;
        jx4Var.e = webAdjustEventParams != null ? webAdjustEventParams.c : null;
        if (webAdjustEventParams != null && (webAdjustEventRevenue = webAdjustEventParams.e) != null) {
            ix4Var = new ix4(webAdjustEventRevenue.a, webAdjustEventRevenue.b);
        }
        jx4Var.d = ix4Var;
        ((ru.yandex.taxi.analytics.j) umrVar.a).i().a(jx4Var);
    }

    public void q(String str) {
        b bVar = (b) this.a;
        bVar.A((m950) bVar.L.get(), new okr0(str), sy60.Q2);
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        if (ig5Var instanceof lko) {
            ((lg5) this.a).getClass();
        }
    }

    public gym(rqo rqoVar) {
        this.a = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.ENABLE_FULLSCREEN_ORDERHISTORY);
    }

    public gym(d5s d5sVar, y5s y5sVar) {
        this.a = d5sVar;
    }

    public /* synthetic */ gym(Object obj) {
        this.a = obj;
    }
}
