package defpackage;

import android.app.Activity;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.j;
import androidx.room.RoomDatabase;
import androidx.room.c;
import androidx.room.i;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersView;
import com.yandex.go.mainscreen.superapp.popup.presentation.SuperAppMainScreenPopupView;
import com.yandex.go.screenshot_screencast_tracker.impl.trackers.h;
import com.yandex.go.splash.domain.b;
import com.yandex.mob.domain.ValidateConfigUseCase$InvalidCause;
import com.yandex.quark.lite.setup.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final /* synthetic */ class ate0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ate0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v38, types: [T, kotlinx.serialization.json.b] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        u3u0 u3u0Var;
        rr00 _init_$lambda$0;
        boolean onAttachedToWindow$lambda$0;
        int i = this.a;
        int i2 = 2;
        boolean z = false;
        int i3 = 1;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                b580 b580Var = (b580) obj;
                Iterator it = ((qrq0) obj3).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                    } else if (jl40.l(((b580) it.next()).a, b580Var.a)) {
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                lnf0 lnf0Var = (lnf0) obj3;
                lnf0 lnf0Var2 = (lnf0) obj;
                lnf0Var2.getClass();
                String str = lnf0Var.a;
                List list = lnf0Var.b;
                if (jl40.l(str, lnf0Var2.a) && jl40.l(list, lnf0Var2.b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ((ehg0) obj).G((wgg0) obj3);
                return zy11.a;
            case 3:
                lhg0 lhg0Var = ((ohg0) obj3).b;
                lhg0Var.a = null;
                lhg0Var.b = null;
                return zy11.a;
            case 4:
                a aVar = (a) obj3;
                b64.D(obj);
                ord ordVar = aVar.g;
                if (ordVar != null) {
                    ((CopyOnWriteArrayList) ordVar.c).add(null);
                }
                prd prdVar = aVar.h;
                if (prdVar != null) {
                    ((ArrayList) prdVar.c).add(null);
                }
                return zy11.a;
            case 5:
                ((bud) obj3).c(obj);
                return zy11.a;
            case 6:
                j jVar = (j) obj3;
                Throwable th = (Throwable) obj;
                CancellationException b = uh6.b("Recomposer effect job completed", th);
                synchronized (jVar.c) {
                    try {
                        l8x l8xVar = jVar.d;
                        if (l8xVar != null) {
                            jVar.u.l(Recomposer$State.ShuttingDown);
                            l8xVar.a(b);
                            jVar.r = null;
                            l8xVar.w(new kn2(23, jVar, th));
                        } else {
                            jVar.e = b;
                            jVar.u.l(Recomposer$State.ShutDown);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return zy11.a;
            case 7:
                ((i) obj3).h = (hkw0) obj;
                return zy11.a;
            case 8:
                return ((RoomDatabase) obj3).A0((c) obj);
            case 9:
                return ((sls) obj3).invoke();
            case 10:
                h hVar = (h) obj3;
                ggp0 ggp0Var = new ggp0(2, (tls) obj);
                Activity activity = hVar.b;
                activity.registerScreenCaptureCallback(activity.getMainExecutor(), ggp0Var);
                return new epo0(6, hVar, ggp0Var);
            case 11:
                return ((ar) obj3).invoke();
            case 12:
                return ((Supplier) obj3).get();
            case 13:
                return new wgd(i3, (ltr0) obj3);
            case 14:
                return new exg(3, (o370) obj3);
            case 15:
                fis0 fis0Var = (fis0) obj3;
                Object obj4 = fis0Var.f;
                if (!obj4.equals(obj4)) {
                    khe0.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                iz40 iz40Var = fis0Var.e;
                Object obj5 = fis0Var.c;
                if (iz40Var != null) {
                    if (obj5 != null) {
                        khe0.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    iz40Var.a(obj);
                } else if (obj5 == null) {
                    fis0Var.c = obj;
                } else {
                    iz40 a = dmm0.a();
                    a.a(obj5);
                    a.a(obj);
                    fis0Var.e = a;
                    fis0Var.c = null;
                }
                return zy11.a;
            case 16:
                n3t0 n3t0Var = (n3t0) obj3;
                synchronized (n3t0Var.g) {
                    m3t0 m3t0Var = n3t0Var.i;
                    Object obj6 = m3t0Var.b;
                    int i4 = m3t0Var.d;
                    qy40 qy40Var = m3t0Var.c;
                    if (qy40Var == null) {
                        qy40Var = new qy40((Object) null);
                        m3t0Var.c = qy40Var;
                        m3t0Var.f.o(obj6, qy40Var);
                    }
                    m3t0Var.b(obj, i4, obj6, qy40Var);
                }
                return zy11.a;
            case 17:
                ((b) ((ast0) obj3)).a((Runnable) obj);
                return zy11.a;
            case 18:
                azt0 azt0Var = (azt0) obj3;
                if (((Integer) obj).intValue() == 0) {
                    if (azt0Var.u()) {
                        azt0Var.r(new qu(9));
                    } else {
                        azt0Var.i();
                    }
                }
                return zy11.a;
            case 19:
                ru.yandex.taxi.statebar.a aVar2 = (ru.yandex.taxi.statebar.a) obj3;
                GoFrameLayout goFrameLayout = aVar2.b;
                goFrameLayout.setPadding(goFrameLayout.getPaddingLeft(), ((t1w) obj).b, goFrameLayout.getPaddingRight(), goFrameLayout.getPaddingBottom());
                Map.Entry lastEntry = aVar2.f.lastEntry();
                if (lastEntry != null && (u3u0Var = (u3u0) lastEntry.getValue()) != null && u3u0Var.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                oju0 oju0Var = (oju0) obj3;
                oju0Var.a = oju0Var.b.a.invoke(oju0Var.a, (peo) obj);
                return zy11.a;
            case 21:
                String str2 = (String) obj;
                Iterator it2 = ((r2w0) obj3).K.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (jl40.l(((w201) next).getId(), str2)) {
                            obj2 = next;
                        }
                    }
                }
                return (w201) obj2;
            case 22:
                _init_$lambda$0 = SuperAppMainScreenOrdersView._init_$lambda$0((SuperAppMainScreenOrdersView) obj3, ((Integer) obj).intValue());
                return _init_$lambda$0;
            case 23:
                onAttachedToWindow$lambda$0 = SuperAppMainScreenPopupView.onAttachedToWindow$lambda$0((SuperAppMainScreenPopupView) obj3, (t1w) obj);
                return Boolean.valueOf(onAttachedToWindow$lambda$0);
            case 24:
                ExperimentSource experimentSource = (ExperimentSource) obj;
                Collection values = ((dlw0) obj3).a.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : values) {
                    if (((clw0) obj7).c == experimentSource) {
                        arrayList.add(obj7);
                    }
                }
                return arrayList;
            case 25:
                return new wgd(i2, (zx01) obj3);
            case 26:
                ((Ref$ObjectRef) obj3).element = (kotlinx.serialization.json.b) obj;
                return zy11.a;
            case 27:
                vy21 vy21Var = (vy21) obj3;
                lq20 lq20Var = (lq20) obj;
                vy21Var.getClass();
                String str3 = lq20Var.d;
                String str4 = lq20Var.c;
                Object a2 = (evu0.J(str3) || evu0.J(str4)) ? ValidateConfigUseCase$InvalidCause.UrlParsingFailed : vy21Var.a(str3, str4);
                if (a2 == null) {
                    String str5 = lq20Var.g;
                    String str6 = lq20Var.f;
                    if ((str5 != null && !evu0.J(str5)) || (str6 != null && !evu0.J(str6))) {
                        obj2 = (str5 == null || evu0.J(str5) || str6 == null || evu0.J(str6)) ? ValidateConfigUseCase$InvalidCause.UrlParsingFailed : vy21Var.a(str5, str6);
                    }
                    a2 = obj2;
                }
                return new Pair(lq20Var, a2);
            case 28:
                ((x6f0) ((y6f0) obj3)).d((t1w) obj);
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(!jl40.l(((ro00) obj).b(), ((ym00) obj3).e()));
        }
    }
}
