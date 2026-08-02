package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.hints.Hint;
import com.vk.log.L;
import com.vk.stat.scheme.CommonOnboardingStat$TypeUiHintItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.e3m;
import xsna.h7v;
import xsna.l7v;
import xsna.r6v;
import xsna.ukg;

/* compiled from: HintsManagerImpl.kt */
/* loaded from: classes.dex */
public final class l7v implements h7v, s6v {
    public final ukg.a a;
    public WeakReference<Object> c;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    /* compiled from: HintsManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static abstract class a implements r6v {
        public final String a;
        public final bpn0 b = new bpn0(new mag(this, 27));

        public a(String str, l7v l7vVar) {
            this.a = str;
        }

        @Override // xsna.r6v
        public final dcn j(Activity activity) {
            Hint b = ((b) this).c.b(this.a);
            if (b != null) {
                return n(activity, b);
            }
            return null;
        }

        public final o7v n(Activity activity, Hint hint) {
            u6v u6vVar = (u6v) this.b.getValue();
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            u6vVar.c = c;
            u6vVar.b = SystemClock.elapsedRealtime();
            iid0 iid0Var = new iid0();
            SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new CommonOnboardingStat$TypeUiHintItem(u6vVar.a, CommonOnboardingStat$TypeUiHintItem.Action.SHOW, (int) 0), 3);
            iid0Var.f = c;
            iid0Var.g = b;
            iid0Var.q();
            final b bVar = (b) this;
            String str = hint.c;
            if (str == null || drm0.N(str)) {
                str = null;
            }
            String str2 = hint.d;
            if (str2 == null) {
                str2 = "";
            }
            Tooltip.WindowStyle windowStyle = bVar.i ? Tooltip.WindowStyle.FULLSCREEN : Tooltip.WindowStyle.FULLSCREEN_WITH_STATUSBAR;
            if ((str == null || str.length() == 0) && str2.length() == 0) {
                return null;
            }
            boolean z = bVar.k;
            int i = R.color.vk_white;
            int i2 = z ? R.color.vk_white : R.color.vk_tip_background;
            e3m.a aVar = e3m.a;
            int color = activity.getColor(i2);
            if (bVar.k) {
                i = R.color.vk_gray_900;
            }
            int color2 = activity.getColor(i);
            int i3 = Tooltip.n;
            androidx.appcompat.app.d a = Tooltip.a.a(activity, str, str2, new RectF(bVar.d), windowStyle, bVar.e, bVar.f, new b1y(hint.b), color, color2, null, bVar.p, bVar.m, bVar.n, bVar.j, null, bVar.l, null, null, new p7v(bVar), null, bVar.o, null, 375161856);
            a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.m7v
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    DialogInterface.OnShowListener onShowListener = l7v.b.this.f;
                    if (onShowListener != null) {
                        onShowListener.onShow(dialogInterface);
                    }
                }
            });
            a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.n7v
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    l7v.b bVar2 = l7v.b.this;
                    bVar2.c.c = null;
                    DialogInterface.OnDismissListener onDismissListener = bVar2.g;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(dialogInterface);
                    }
                }
            });
            a.setOnCancelListener(new tye(bVar, 1));
            bVar.c.k(a);
            return new o7v(a);
        }
    }

    /* compiled from: HintsManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a implements r6v.a {
        public final l7v c;
        public Rect d;
        public View.OnClickListener e;
        public DialogInterface.OnShowListener f;
        public DialogInterface.OnDismissListener g;
        public ykt0 h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public Integer m;
        public int n;
        public Integer o;
        public float p;

        public b(String str, l7v l7vVar, Rect rect) {
            super(str, l7vVar);
            this.c = l7vVar;
            this.d = rect;
            this.l = 1;
            this.p = 0.72f;
        }

        @Override // xsna.r6v.a
        public final r6v.a a(DialogInterface.OnDismissListener onDismissListener) {
            this.g = onDismissListener;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a b(DialogInterface.OnShowListener onShowListener) {
            this.f = onShowListener;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a c(int i) {
            this.o = Integer.valueOf(i);
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a d(float f) {
            this.p = f;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a e() {
            this.k = true;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a f(Rect rect) {
            this.d = rect;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a g(int i) {
            this.m = Integer.valueOf(i);
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a h(ykt0 ykt0Var) {
            this.h = ykt0Var;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a i(View.OnClickListener onClickListener) {
            this.e = onClickListener;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a k(int i) {
            this.n = i;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a l() {
            this.l = 0;
            return this;
        }

        @Override // xsna.r6v.a
        public final r6v.a m() {
            this.i = true;
            return this;
        }

        public final void o(i7v i7vVar) {
            this.g = i7vVar;
        }
    }

    /* compiled from: HintsManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public c(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public l7v(ukg.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.h7v
    public final boolean a(String str) {
        return !(n() || p(str) == null) || this.a.c();
    }

    @Override // xsna.h7v
    public final Hint b(String str) {
        ukg.a aVar = this.a;
        if (aVar.c()) {
            return new Hint("internal_test_tooltip", "Тестовый тултип", "Тестовый тултип, id:".concat(str), null, 8, null);
        }
        com.vk.dto.hints.a a2 = aVar.a();
        Hint c2 = a2 != null ? a2.c(str) : null;
        if (c2 == null) {
            return null;
        }
        s(c2);
        return c2;
    }

    @Override // xsna.h7v
    public final void c(String str, h7v.b bVar) {
        LinkedHashMap linkedHashMap = this.b;
        List list = (List) linkedHashMap.get(str);
        if (list == null) {
            list = s5a.a(str, linkedHashMap);
        }
        list.add(bVar);
    }

    @Override // xsna.s6v
    public final void detach() {
        this.c = null;
    }

    @Override // xsna.h7v
    public final void e(View view, String str, izs izsVar) {
        LinkedHashSet linkedHashSet = this.d;
        if (linkedHashSet.contains(str) || !a(str)) {
            return;
        }
        linkedHashSet.add(str);
        bwt0.l(view, 300L, new ho3(this, view, str, izsVar, 1), new g6(16, this, str));
    }

    @Override // xsna.h7v
    public final List<Hint> g() {
        return this.e;
    }

    @Override // xsna.h7v
    public final void h(final View view, final String str, final izs izsVar, final izs izsVar2, final h8n0 h8n0Var) {
        LinkedHashSet linkedHashSet = this.d;
        if (linkedHashSet.contains(str) || !a(str)) {
            return;
        }
        linkedHashSet.add(str);
        bwt0.l(view, 300L, new izs() { // from class: xsna.k7v
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Rect C;
                View view2 = (View) obj;
                izs izsVar3 = izs.this;
                View view3 = view;
                if (izsVar3 == null || (C = (Rect) izsVar3.invoke(view3)) == null) {
                    C = bwt0.C(view2);
                }
                Rect rect = C;
                l7v l7vVar = this;
                String str2 = str;
                l7vVar.j(view3, str2, izsVar2, rect, new tm1(l7vVar, str2, h8n0Var, 4));
                return s3q0.a;
            }
        }, new he3(26, this, str));
    }

    @Override // xsna.h7v
    public final void i(String str, h7v.b bVar) {
        LinkedHashMap linkedHashMap = this.b;
        List list = (List) linkedHashMap.get(str);
        if (list == null) {
            return;
        }
        list.remove(bVar);
        if (list.isEmpty()) {
            linkedHashMap.remove(str);
        }
    }

    @Override // xsna.h7v
    public final void j(View view, String str, izs<? super r6v.a, s3q0> izsVar, Rect rect, gzs<s3q0> gzsVar) {
        Activity b2 = enj.b(view);
        if (b2 == null) {
            gzsVar.invoke();
            return;
        }
        if (rect == null) {
            rect = bwt0.F(view);
        }
        b bVar = new b(str, this, rect);
        bVar.o(new i7v(gzsVar, 0));
        if (izsVar != null) {
            izsVar.invoke(bVar);
        }
        dcn j = bVar.j(b2);
        if (j == null) {
            gzsVar.invoke();
            return;
        }
        o7v o7vVar = (o7v) j;
        bwt0.k(view, new g22(15, view, o7vVar));
        view.addOnAttachStateChangeListener(new d(view, o7vVar));
    }

    @Override // xsna.s6v
    public final void k(Object obj) {
        this.c = new WeakReference<>(obj);
    }

    @Override // xsna.h7v
    public final void l(View view, String str, gzs<s3q0> gzsVar) {
        LinkedHashSet linkedHashSet = this.d;
        if (linkedHashSet.contains(str)) {
            return;
        }
        linkedHashSet.add(str);
        bwt0.i(view, 300L, new wyh(this, view, str, gzsVar, 2), new j6(10, this, str));
    }

    @Override // xsna.h7v
    public final boolean n() {
        return this.c != null;
    }

    @Override // xsna.h7v
    public final boolean o() {
        return this.a.c();
    }

    @Override // xsna.h7v
    public final Hint p(String str) {
        ukg.a aVar = this.a;
        if (aVar.c()) {
            return new Hint("internal_test_tooltip", "Тестовый тултип", "Тестовый тултип, id:".concat(str), null, 8, null);
        }
        com.vk.dto.hints.a a2 = aVar.a();
        if (a2 != null) {
            return a2.c(str);
        }
        return null;
    }

    @Override // xsna.h7v
    public final r6v.a r(String str, Rect rect) {
        return new b(str, this, rect);
    }

    @Override // xsna.h7v
    public final void s(Hint hint) {
        itg0.i(4, rsg0.y0(new mo(hint.getId()), null, null, 3), null, new z5a(13, this, hint), new c(L.a));
        this.e.add(hint);
        ukg.a aVar = this.a;
        com.vk.dto.hints.a a2 = aVar.a();
        if (a2 == null) {
            return;
        }
        aVar.b(a2.a(hint));
    }

    @Override // xsna.h7v
    public final void u() {
        final ta3 ta3Var = new ta3(4);
        this.e.removeIf(new Predicate() { // from class: xsna.j7v
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) ta3.this.invoke(obj)).booleanValue();
            }
        });
    }

    @Override // xsna.h7v
    public final g6p0 v(String str) {
        return new b1y(str);
    }

    public final void w(String str, boolean z) {
        List list = (List) this.b.get(str);
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((h7v.b) it.next()).a(z);
        }
    }

    /* compiled from: ViewExt.kt */
    /* loaded from: classes2.dex */
    public static final class d implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ o7v c;

        public d(View view, o7v o7vVar) {
            this.b = view;
            this.c = o7vVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.dismiss();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
