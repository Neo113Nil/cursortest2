package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.compose.notification.InAppComposeNotification;
import com.yandex.messaging.core.net.entities.PersonalUserData;
import com.yandex.messaging.domain.unreadcount.d;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.isolated.b;
import com.yandex.messaging.sdk.ChatFilterParams;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.x;
import ru.yandex.taxi.logistics.ndd_map.router.e;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.wheel.PickerView;

/* loaded from: classes15.dex */
public final /* synthetic */ class h2r implements gjf0, yls, xi4, wi4, wx60, ai60, bx60, k4x, c9e, dx4, th50, odv, rdj, n4y0, el7, go3, xz60, d5s0, b0t0, lzd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h2r(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        dt20 dt20Var = (dt20) this.b;
        dhv dhvVar = (dhv) this.c;
        PersonalUserData personalUserData = (PersonalUserData) obj;
        z83.g(null, (Looper) dt20Var.b, Looper.myLooper());
        if (!Objects.equals(((ml21) dt20Var.c).a, personalUserData.userId)) {
            ny61.k();
            return;
        }
        l020 C = ((k020) dt20Var.x).C();
        try {
            C.q0(personalUserData);
            C.s();
            C.close();
            dhvVar.run();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.lzd
    public void a(x34 x34Var) {
        q7j0 q7j0Var = (q7j0) this.b;
        b48 b48Var = (b48) this.c;
        q7j0Var.a.t(x34Var, b48Var.e(x34Var), b48Var.f(x34Var));
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        xf10 xf10Var = (xf10) this.b;
        ((yf10) obj).onDownstreamFormatChanged(xf10Var.a, xf10Var.b, (he10) this.c);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, h3t0] */
    @Override // defpackage.yls
    public Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 2:
                return b.d((b) obj3, (ChatFilterParams) obj2);
            case 3:
                return ((com.yandex.messaging.domain.unreadcount.b) obj3).b.z(((kat) obj2).a);
            case 4:
                ((Ref$ObjectRef) obj3).element = ((k020) obj).b.takeSnapshot();
                return ((v) obj2).b.A();
            default:
                wet wetVar = (wet) obj2;
                return ((d) obj3).b.g(wetVar.a, wetVar.b);
        }
    }

    @Override // defpackage.k4x
    public void b(mes mesVar) {
        j4x j4xVar = (j4x) this.b;
        String str = (String) this.c;
        if (mesVar.d) {
            long j = mesVar.c;
            long j2 = j / 1000000;
            boolean z = j > 700000000;
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = j4xVar.c.get();
            if (currentTimeMillis - j3 < 1000 || !j4xVar.c.compareAndSet(j3, currentTimeMillis)) {
                return;
            }
            z22 z22Var = j4xVar.a.a;
            MapBuilder y = qv10.y("scenario", str);
            y.put("duration_ms", String.valueOf(j2));
            y.put("is_frozen", String.valueOf(z));
            ((a) z22Var).a(new fyt0("stability_jank_frame", y.j()));
        }
    }

    @Override // defpackage.d5s0
    public boolean d() {
        pne0 pne0Var = (pne0) this.b;
        ob4 ob4Var = (ob4) this.c;
        if (!pne0Var.q) {
            pne0Var.h();
            ob4Var.a = ob4.a(pne0Var.o, ob4Var.a);
            pne0Var.q = !pne0Var.g(pne0Var.n, r1 + ob4Var.b);
        }
        return pne0Var.q;
    }

    @Override // defpackage.gjf0
    public void f(long j, long j2) {
        int i = this.a;
        Object obj = this.c;
        t2r t2rVar = (t2r) this.b;
        switch (i) {
            case 0:
                t2rVar.e.b(j, j2, ((eoc) obj).c);
                break;
            default:
                t2rVar.e.b(j, j2, ((bz31) obj).b);
                break;
        }
    }

    @Override // defpackage.b0t0
    public RecyclerView.j get(Context context) {
        return new c0t0(context, (mqu) this.b, (kk11) this.c);
    }

    @Override // defpackage.n4y0
    public void h() {
        com.yandex.go.taxi.order.promotions.mapper.a aVar = (com.yandex.go.taxi.order.promotions.mapper.a) this.b;
        ActionButton actionButton = (ActionButton) this.c;
        s480 s480Var = aVar.a;
        ru.yandex.taxi.communications.model.widgets.b bVar = actionButton.e;
        s480Var.getClass();
        if (jl40.l(bVar, x.INSTANCE)) {
            a480 a480Var = s480Var.a;
            a4y0 a4y0Var = (a4y0) a480Var.a.getValue();
            if (a4y0Var != null) {
                q480 q480Var = s480Var.b;
                ActionButton.ButtonActionType buttonActionType = ActionButton.ButtonActionType.DO_NOTHING;
                co40 co40Var = q480Var.a;
                String str = a4y0Var.a;
                String str2 = a4y0Var.b;
                String lowerCase = buttonActionType.name().toLowerCase(Locale.ROOT);
                co40Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", str);
                hashMap.put("modal_id", str2);
                co40Var.a.a("OrderModalCard.Tapped", hashMap, 1, tse0.r("button", hashMap, lowerCase));
            }
            a480Var.a.l(null);
        }
    }

    @Override // defpackage.ai60
    public void i(boolean z) {
        qkv qkvVar = (qkv) this.b;
        InAppComposeNotification inAppComposeNotification = (InAppComposeNotification) this.c;
        InAppComposeNotification inAppComposeNotification2 = qkvVar.D;
        if (inAppComposeNotification2 == null || inAppComposeNotification != inAppComposeNotification2) {
            return;
        }
        qkvVar.D = null;
        qkvVar.r(new qu(9));
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        aq80 aq80Var = (aq80) this.b;
        sa90 sa90Var = (sa90) aq80Var.a;
        if (sa90Var != null) {
            androidx.concurrent.futures.b bVar2 = (androidx.concurrent.futures.b) sa90Var.a;
            Objects.requireNonNull(bVar2);
            bVar2.c();
        }
        Object obj = this.c;
        aq80Var.a = new sa90(bVar, obj);
        return qv10.o("PendingValue ", obj);
    }

    @Override // defpackage.rdj
    public void k(AlertDialog alertDialog) {
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 19:
                alertDialog.setPositiveButton(kyh0.common_ok, (Runnable) obj2).setCancelable(false).setCancelableOnTouchOutside(false).setOnHideAnimationEndListener((Runnable) obj);
                break;
            case 20:
                final p370 p370Var = (p370) obj2;
                alertDialog.setPositiveButton(kyh0.no_connection_try_again, new Runnable() { // from class: np70
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        p370 p370Var2 = p370Var;
                        switch (i4) {
                            case 0:
                                ((f) p370Var2.b).d0((o2y0) p370Var2.c).g((cjm0) p370Var2.w);
                                break;
                            default:
                                f fVar = (f) p370Var2.b;
                                o2y0 o2y0Var = (o2y0) p370Var2.c;
                                if (fVar.d0(o2y0Var).d()) {
                                    fVar.O.c();
                                    fVar.p0(o2y0Var);
                                    break;
                                }
                                break;
                        }
                    }
                }).setCancelable(false).setCancelableOnTouchOutside(false);
                if (((o2y0) obj).b().K()) {
                    alertDialog.setNegativeButton(kyh0.common_cancel, new Runnable() { // from class: np70
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            p370 p370Var2 = p370Var;
                            switch (i4) {
                                case 0:
                                    ((f) p370Var2.b).d0((o2y0) p370Var2.c).g((cjm0) p370Var2.w);
                                    break;
                                default:
                                    f fVar = (f) p370Var2.b;
                                    o2y0 o2y0Var = (o2y0) p370Var2.c;
                                    if (fVar.d0(o2y0Var).d()) {
                                        fVar.O.c();
                                        fVar.p0(o2y0Var);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                alertDialog.setMainActionButton(((rp70) obj).a(((Dialog) obj2).a(Dialog.Action.BACK_TO_DRIVING_SCREEN)), new d82(1), (String) null);
                break;
        }
    }

    @Override // defpackage.xz60
    public void l(int i, int i2, int i3, boolean z) {
        PickerView._init_$lambda$0((Context) this.b, (PickerView) this.c, i, i2, i3, z);
    }

    @Override // defpackage.dx4
    public void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
        Address address = (Address) this.b;
        ag50 ag50Var = (ag50) this.c;
        int i = 2;
        if (address != null) {
            ag50Var.r(new yid(PointType.DESTINATION, new pv0(address, null, null, null, null, null, null, null, 1022), i));
        } else {
            ag50Var.r(new yid(PointType.DESTINATION, pv0Var, i));
        }
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 10:
                return ((l2w) obj2).b(((View) obj).getContext(), n751Var);
            default:
                new n751(n751Var);
                ((t26) ((i4u) obj2).a).m(view, n751Var, (bv31) obj);
                return n751Var;
        }
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        List list;
        xlm0 xlm0Var;
        kwt kwtVar = (kwt) this.b;
        tls tlsVar = (tls) this.c;
        Bitmap bitmap = kwtVar.e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        String str = null;
        kwtVar.e = null;
        if (!task.o()) {
            task = null;
        }
        if (task != null && (list = (List) task.k()) != null && (xlm0Var = (xlm0) kotlin.collections.a.R(kwt.g(list))) != null) {
            str = xlm0Var.a;
        }
        if (str == null) {
            str = "";
        }
        tlsVar.invoke(str);
    }

    @Override // defpackage.odv
    public void r(pdv pdvVar) {
        ((odv) this.c).r((ht10) this.b);
    }

    @Override // defpackage.th50
    public void onComplete() {
        Object value;
        e eVar = (e) this.b;
        zzs zzsVar = (zzs) this.c;
        r0 r0Var = eVar.R;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, zzsVar));
        if (eVar.H.a().a) {
            eVar.f(zzsVar);
        }
    }
}
