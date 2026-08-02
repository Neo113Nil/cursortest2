package defpackage;

import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Handler;
import android.view.inputmethod.InputContentInfo;
import androidx.media3.exoplayer.j;
import com.yandex.go.coroutines.b;
import com.yandex.go.summary.interactor.anchored.state.content.HeaderUiStateInteractor$headerUiStateFlow$$inlined$start$1;
import com.yandex.go.summary.interactor.anchored.state.content.n;
import com.yandex.go.summary.interactor.anchored.state.content.p;
import com.yandex.go.taxi.summary.interactor.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import com.ybsdk.screens.initial.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.hiredriver.HireDriverNotification;
import ru.yandex.taxi.linked_order.modals.info.LinkedOrderInfoModalView;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class i4u implements go3, lg51, kos0, n370, lc00, m710, bh3 {
    public final Object a;

    public i4u(g gVar, wiq0 wiq0Var) {
        this.a = b.d(new p(gVar.a(new n(e.s(((k) wiq0Var).j.b(), new w9u(6)))), this), new HeaderUiStateInteractor$headerUiStateFlow$$inlined$start$1(2, null));
    }

    public static qcu i(qgv0 qgv0Var) {
        if (qgv0Var instanceof ogv0) {
            ogv0 ogv0Var = (ogv0) qgv0Var;
            return new qcu(ogv0Var.a, ogv0Var.b, ugv0.b != ugv0.a ? cdu.a : null);
        }
        if (jl40.l(qgv0Var, pgv0.a)) {
            return null;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        vgu vguVar = (vgu) this.a;
        vgu.a(vguVar, (HiddenPrivateChatsBucket) obj);
        vguVar.c();
    }

    @Override // defpackage.bh3
    public void I() {
        ((qb10) this.a).R0 = true;
    }

    @Override // defpackage.bh3
    public void K() {
        j jVar = ((qb10) this.a).I;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Override // defpackage.n370
    public void a(u70 u70Var) {
        st0 st0Var = (st0) this.a;
        u70Var.c = null;
        ((m6e0) st0Var.B).a0(u70Var);
    }

    @Override // defpackage.n370
    public u70 b(int i, Object obj, int i2, int i3) {
        return ((st0) this.a).m(i, obj, i2, i3);
    }

    @Override // defpackage.lg51
    public void d(Throwable th) {
        r0 r0Var;
        Object value;
        x4c.g("Failed authorization from InitialViewModel", th, null, null, 12);
        pz40 Y = ((d) this.a).Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new dwv(th)));
    }

    public String e(String str, String str2) {
        Context context;
        Context context2 = ((y5z) this.a).b;
        if (str2 != null) {
            Locale a = y5z.a(str2);
            Configuration configuration = new Configuration(context2.getResources().getConfiguration());
            configuration.setLocale(a);
            context = context2.createConfigurationContext(configuration);
        } else {
            context = context2;
        }
        int identifier = context.getResources().getIdentifier(str, "string", context2.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    @Override // defpackage.lg51
    public void f() {
        d.i0((d) this.a, null, null, null, 5);
    }

    public ArrayList g(int i) {
        ArrayList arrayList = new ArrayList();
        androidx.compose.foundation.lazy.grid.b bVar = (androidx.compose.foundation.lazy.grid.b) this.a;
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            i4y i4yVar = bVar.b ? bVar.c : (i4y) bVar.e.getValue();
            if (i4yVar != null) {
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = 1;
                List list = (List) i4yVar.k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair pair = (Pair) list.get(i2);
                    c6y c6yVar = bVar.o;
                    int intValue = ((Number) pair.c()).intValue();
                    long j = ((n8e) pair.f()).a;
                    tig0 tig0Var = androidx.compose.foundation.lazy.grid.b.w;
                    ref$IntRef = ref$IntRef;
                    arrayList.add(c6yVar.a(intValue, j, false, new lc0((ArrayList) null, ref$IntRef, list, i, i4yVar)));
                }
            }
            tje.W(D, O, e);
            return arrayList;
        } catch (Throwable th) {
            tje.W(D, O, e);
            throw th;
        }
    }

    public void h() {
        j4a j4aVar = (j4a) this.a;
        yju a = gku.a((eku) ((gku) j4aVar.H).a.a.c());
        if (a == yju.n) {
            g8e.C("no hire driver data", jst.e);
            return;
        }
        HireDriverNotification hireDriverNotification = new HireDriverNotification((Activity) j4aVar.G, a.j, cvu0.v(a.k, "$PHONE$", ((h) ((vp21) ((r1s) j4aVar.J).c)).Og(), false));
        hireDriverNotification.setExpiresListener(new qn5(6, j4aVar, hireDriverNotification));
        hireDriverNotification.startExpiresTimer(6000L);
        ((tj60) j4aVar.I).e(hireDriverNotification);
    }

    public void j() {
        w8v w8vVar = (w8v) this.a;
        synchronized (w8vVar.r) {
            try {
                Integer num = (Integer) w8vVar.r.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != w8vVar.J()) {
                    w8vVar.R();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bh3
    public void l() {
        ((qb10) this.a).T0 = true;
    }

    @Override // defpackage.bh3
    public void onAudioSinkError(Exception exc) {
        lk91.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        h0w h0wVar = ((qb10) this.a).I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new tg3(h0wVar, exc, 1));
        }
    }

    @Override // defpackage.bh3
    public void onAudioTrackInitialized(ah3 ah3Var) {
        h0w h0wVar = ((qb10) this.a).I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new sg3(h0wVar, ah3Var, 1));
        }
    }

    @Override // defpackage.bh3
    public void onAudioTrackReleased(ah3 ah3Var) {
        h0w h0wVar = ((qb10) this.a).I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new sg3(h0wVar, ah3Var, 0));
        }
    }

    @Override // defpackage.bh3
    public void onSkipSilenceEnabledChanged(boolean z) {
        h0w h0wVar = ((qb10) this.a).I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new rg3(h0wVar, z, 0));
        }
    }

    @Override // defpackage.bh3
    public void p(long j) {
        h0w h0wVar = ((qb10) this.a).I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new vg3(h0wVar, j, 0));
        }
    }

    @Override // defpackage.kos0
    public void r(int i) {
        ((a3v) ((wrr) this.a).y).Td(i, LinkedOrderInfoModalView.class);
    }

    @Override // defpackage.bh3
    public void s(int i, long j, long j2) {
        h0w h0wVar = ((qb10) this.a).I0;
        Handler handler = (Handler) h0wVar.b;
        if (handler != null) {
            handler.post(new wg3(i, 0, j, j2, h0wVar));
        }
    }

    @Override // defpackage.bh3
    public void t() {
        ((qb10) this.a).onRendererCapabilitiesChanged();
    }

    @Override // defpackage.bh3
    public void y() {
        j jVar = ((qb10) this.a).I;
        if (jVar != null) {
            jVar.a();
        }
    }

    public i4u(Context context) {
        this.a = new me0(context, (byte) 0);
    }

    public /* synthetic */ i4u(Object obj) {
        this.a = obj;
    }

    public i4u(nas0 nas0Var, nas0 nas0Var2, t26 t26Var, ArrayList arrayList) {
        this.a = t26Var;
    }

    public i4u(Uri uri, ClipDescription clipDescription, Uri uri2) {
        h2t h2tVar = new h2t();
        h2tVar.a = new InputContentInfo(uri, clipDescription, uri2);
        this.a = h2tVar;
    }
}
