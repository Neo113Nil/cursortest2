package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Size;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.WeakReference;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: ImSnackbarHelper.kt */
@ozl
/* loaded from: classes2.dex */
public final class edw {
    public static final edw a = new edw();
    public static WeakReference<ikv0> b;
    public static volatile boolean c;

    static {
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        ImFeatures imFeatures = ImFeatures.IM_SHACKBAR_INSTEAD_TOAST;
        io.reactivex.rxjava3.core.q X = io.reactivex.rxjava3.core.q.X(bVar.k().a.U(new np1(new y40(29), 16)), new io.reactivex.rxjava3.internal.operators.observable.s0(new eqf(bVar, 2)));
        X.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.y(X, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new ur(new zj(29), 17)).U(new rx0(new b1a(16, bVar, imFeatures), 21)).a0(asu0.a.c());
        ir0 ir0Var = new ir0(new xsq(9), 18);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        itg0.i(7, a0.E(ir0Var, lVar, kVar, kVar), null, null, null);
    }

    public static void a() {
        ikv0 ikv0Var;
        WeakReference<ikv0> weakReference = b;
        if (weakReference == null || (ikv0Var = weakReference.get()) == null) {
            return;
        }
        ikv0Var.a();
    }

    public static void b(ikv0.a aVar) {
        ikv0 n = aVar.n();
        WeakReference<ikv0> weakReference = b;
        ikv0 ikv0Var = weakReference != null ? weakReference.get() : null;
        if (ikv0Var != null && ikv0Var.b.c()) {
            ikv0Var.a();
        }
        b = new WeakReference<>(n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Context context, gzs gzsVar) {
        if (c) {
            fdw.a(context, tq.h(tlo0.Companion, R.string.vkim_dialogs_archived_toast), new tlo0.f(R.string.vkim_cancel), gzsVar);
            return;
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
        aVar.u = new ikv0.d(context.getString(R.string.vkim_dialogs_archived_toast), (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.vkim_cancel), new k7f(gzsVar, 21));
        b(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(int i, Context context, boolean z) {
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_negative);
        int i2 = 6;
        ikv0.d.b bVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (c) {
            tlo0.f h = tq.h(tlo0.Companion, i);
            ikv0.a aVar = new ikv0.a(context);
            float f = 28;
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, valueOf, new Size(iah0.a(f), iah0.a(f)), 8);
            aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), bVar, (ikv0.d.a) (objArr4 == true ? 1 : 0), i2);
            aVar.n();
            return;
        }
        if (z) {
            enj.q(i, 0, context);
            return;
        }
        ikv0.a aVar2 = new ikv0.a(context);
        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, valueOf, (Size) (objArr3 == true ? 1 : 0), 12);
        aVar2.u = new ikv0.d(context.getString(i), (String) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), i2);
        b(aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Context context, String str, gzs gzsVar) {
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_positive);
        boolean z = c;
        int i = Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
        int i2 = 12;
        int i3 = R.drawable.vk_icon_check_circle_outline_28;
        Size size = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!z) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(i3, valueOf, (Size) (objArr2 == true ? 1 : 0), i2);
            aVar.u = new ikv0.d(context.getString(R.string.vkim_msg_request_sent), context.getString(R.string.vkim_msg_request_toast_message, str), new ikv0.d.a(context.getString(R.string.vkim_revoke_msg_request), objArr == true ? 1 : 0, new kqb(2, gzsVar), i));
            b(aVar);
            return;
        }
        tlo0.h d = oq.d(tlo0.Companion, context.getString(R.string.vkim_msg_request_toast_message, str));
        tlo0.f fVar = new tlo0.f(R.string.vkim_revoke_msg_request);
        ikv0.d.c cVar = new ikv0.d.c(tlo0.b.a(new tlo0.f(R.string.vkim_msg_request_sent), context).toString());
        ikv0.d.b bVar = new ikv0.d.b(tlo0.b.a(d, context).toString());
        ikv0.a aVar2 = new ikv0.a(context);
        aVar2.t = new ikv0.c.C3058c(i3, valueOf, size, i2);
        aVar2.u = new ikv0.d(cVar, bVar, new ikv0.d.a(tlo0.b.a(fVar, context).toString(), objArr3 == true ? 1 : 0, new cdw(0, gzsVar), i));
        aVar2.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Context context) {
        Resources resources = context.getResources();
        Size size = new Size((int) hbh0.c(context, resources.getDimension(R.dimen.vkim_snackbar_persik_icon_size)), (int) hbh0.c(context, resources.getDimension(R.dimen.vkim_snackbar_persik_icon_size)));
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_illustration_persik_downtime_210h, (Integer) null, size, 10);
        aVar.u = new ikv0.d(context.getString(R.string.vkim_error_server_not_disposable), (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.e = -1L;
        aVar.i = FloatingViewGesturesHelper.SwipeDirection.None;
        b(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(int i, Context context) {
        if (!c) {
            enj.q(i, 0, context);
            return;
        }
        tlo0.f h = tq.h(tlo0.Companion, i);
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Context context, String str) {
        if (!c) {
            enj.r(context, str, 0);
            return;
        }
        tlo0.h d = oq.d(tlo0.Companion, str);
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d, context).toString()), (ikv0.d.b) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(int i, Context context) {
        if (!c) {
            enj.q(i, 0, context);
            return;
        }
        tlo0.f h = tq.h(tlo0.Companion, i);
        if (Build.VERSION.SDK_INT <= 32) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
            aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
            aVar.n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(FragmentActivity fragmentActivity, String str) {
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_positive);
        boolean z = c;
        int i = 6;
        int i2 = 12;
        int i3 = R.drawable.vk_icon_check_circle_outline_28;
        Size size = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (!z) {
            ikv0.a aVar = new ikv0.a(fragmentActivity);
            aVar.t = new ikv0.c.C3058c(i3, valueOf, (Size) (objArr3 == true ? 1 : 0), i2);
            aVar.u = new ikv0.d(str, (String) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), i);
            b(aVar);
            return;
        }
        tlo0.h d = oq.d(tlo0.Companion, str);
        ikv0.a aVar2 = new ikv0.a(fragmentActivity);
        aVar2.t = new ikv0.c.C3058c(i3, valueOf, size, i2);
        aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d, fragmentActivity).toString()), (ikv0.d.b) (objArr5 == true ? 1 : 0), (ikv0.d.a) (objArr4 == true ? 1 : 0), i);
        aVar2.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(edw edwVar, Context context, int i) {
        edwVar.getClass();
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_positive);
        boolean z = c;
        int i2 = 6;
        int i3 = 12;
        int i4 = R.drawable.vk_icon_check_circle_outline_28;
        Size size = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (!z) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(i4, valueOf, (Size) (objArr3 == true ? 1 : 0), i3);
            aVar.u = new ikv0.d(context.getString(i), (String) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), i2);
            b(aVar);
            return;
        }
        tlo0.f h = tq.h(tlo0.Companion, i);
        ikv0.a aVar2 = new ikv0.a(context);
        aVar2.t = new ikv0.c.C3058c(i4, valueOf, size, i3);
        aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) (objArr5 == true ? 1 : 0), (ikv0.d.a) (objArr4 == true ? 1 : 0), i2);
        aVar2.n();
    }
}
