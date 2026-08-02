package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.dto.common.id.UserId;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: BottomNavigationItemsDelegate.kt */
/* loaded from: classes.dex */
public final class s58 implements l58 {
    public static final /* synthetic */ qcy<Object>[] f = {new MutablePropertyReference1Impl(s58.class, "loadItemsBottomMenu", "getLoadItemsBottomMenu()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, s58.class, "loadIconToManagedGroupDisposable", "getLoadIconToManagedGroupDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    public static final int g;
    public static final int h;
    public static final int i;
    public final k820 a;
    public final gxh b;
    public final wtn0 c;
    public final pgn d = new pgn();
    public final pgn e = new pgn();

    static {
        abg0 abg0Var = dhr0.t;
        g = abg0Var.c(R.attr.vk_ui_background_secondary);
        h = abg0Var.c(R.attr.vk_ui_image_border_alpha);
        i = abg0Var.c(R.attr.vk_ui_icon_accent_themed);
    }

    public s58(k820 k820Var, gxh gxhVar, wtn0 wtn0Var) {
        this.a = k820Var;
        this.b = gxhVar;
        this.c = wtn0Var;
    }

    @Override // xsna.l58
    public final void a(t58 t58Var, BottomNavigationView bottomNavigationView) {
        k820 k820Var;
        io.reactivex.rxjava3.core.b0 i2;
        ArrayList<androidx.appcompat.view.menu.h> arrayList = t58Var.f;
        LinkedHashSet g2 = b68.b.g();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = g2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k820Var = this.a;
            if (!hasNext) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            Integer num = null;
            if (arrayList.size() >= 6) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                StringBuilder sb = new StringBuilder("Unable to add tab with id ");
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                sb.append(gbg0.b(context.getResources(), intValue));
                sb.append(". Size of menu ");
                sb.append(arrayList.size());
                sb.append(" >= 6");
                bVar.a(new IllegalStateException(sb.toString()));
            } else {
                TabMenuItemUiData.Companion.getClass();
                TabMenuItemUiData a = TabMenuItemUiData.a.a(intValue);
                if (a != null) {
                    int h2 = a.h();
                    boolean b = k820Var.b(h2);
                    int f2 = b ? 0 : com.vk.menu.presentation.entity.a.a.f(h2);
                    androidx.appcompat.view.menu.h a2 = t58Var.a(0, h2, 0, f2 != 0 ? t58Var.a.getString(f2) : "");
                    int c = b ? 0 : com.vk.menu.presentation.entity.a.a.c(h2);
                    if (c != 0) {
                        a2.setIcon(c);
                    }
                    a2.setShowAsAction(1);
                    num = Integer.valueOf(intValue);
                }
            }
            if (num != null) {
                arrayList2.add(num);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (k820Var.b(((Number) next).intValue())) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            int intValue2 = ((Number) it3.next()).intValue();
            TabMenuItemUiData.Companion.getClass();
            TabMenuItemUiData a3 = TabMenuItemUiData.a.a(intValue2);
            if (a3 != null) {
                int c0 = j5g.c0(b68.b.g(), Integer.valueOf(a3.h()));
                UserId k = this.c.k();
                if (k != null) {
                    io.reactivex.rxjava3.internal.operators.single.d0 d = d(k, false);
                    asu0 asu0Var = asu0.a;
                    i2 = d.q(asu0Var.c()).m(asu0Var.d()).l(new vj0(new r58(this, k, t58Var, c0), 3));
                } else {
                    i2 = io.reactivex.rxjava3.core.x.k(s3q0.a);
                }
            } else {
                i2 = io.reactivex.rxjava3.core.x.i(new Throwable(lhg.a(intValue2, "Can not find TabMenu with id=")));
            }
            arrayList4.add(i2);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add((io.reactivex.rxjava3.core.x) it4.next());
        }
        io.reactivex.rxjava3.disposables.c subscribe = (!arrayList5.isEmpty() ? io.reactivex.rxjava3.core.x.D(arrayList5, new o58(new n58(bottomNavigationView, 0))) : io.reactivex.rxjava3.core.x.k(s3q0.a)).h(new q58(new p58(0), 0)).subscribe();
        qcy<Object> qcyVar = f[0];
        this.d.b(subscribe);
    }

    @Override // xsna.l58
    public final ArrayList b() {
        LinkedHashSet g2 = b68.b.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : g2) {
            if (this.a.b(((Number) obj).intValue())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // xsna.l58
    public final void c(boolean z, Drawable drawable, j58 j58Var) {
        wtn0 wtn0Var = this.c;
        if (drawable == null) {
            j58Var.h.setForeground(wtn0Var.f(g, h, i));
        }
        UserId k = wtn0Var.k();
        if (k == null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.d0 d = d(k, z);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = d.q(asu0Var.c()).m(asu0Var.d()).subscribe(new defpackage.n(new tb(j58Var, 16), 10));
        qcy<Object> qcyVar = f[1];
        this.e.b(subscribe);
    }

    public final io.reactivex.rxjava3.internal.operators.single.d0 d(UserId userId, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.d0(io.reactivex.rxjava3.core.x.j(this.b.N0(fkq0.a(userId)).L(new do3(new com.vk.movika.sdk.base.observable.e0(5), 3), false)).l(new yh1(new m58(this, z, 0), 2)).h(new x8(new com.vk.movika.sdk.base.observable.u(6), 5)), new pj4(this, 5), null);
    }

    @Override // xsna.l58
    public final void dispose() {
        qcy<Object>[] qcyVarArr = f;
        qcy<Object> qcyVar = qcyVarArr[0];
        hg1.f((io.reactivex.rxjava3.disposables.c) this.d.b);
        qcy<Object> qcyVar2 = qcyVarArr[1];
        hg1.f((io.reactivex.rxjava3.disposables.c) this.e.b);
    }
}
