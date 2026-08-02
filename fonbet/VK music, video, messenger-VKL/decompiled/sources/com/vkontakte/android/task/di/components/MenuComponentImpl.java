package com.vkontakte.android.task.di.components;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.menu.di.MenuComponent;
import com.vk.permission.PermissionHelper;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.byz;
import xsna.c24;
import xsna.c8m;
import xsna.e7;
import xsna.ep;
import xsna.ez50;
import xsna.fp;
import xsna.fpf0;
import xsna.g7;
import xsna.g8m;
import xsna.hpf0;
import xsna.it80;
import xsna.k820;
import xsna.kzz;
import xsna.l67;
import xsna.nt0;
import xsna.nwy;
import xsna.o6r0;
import xsna.pf;
import xsna.pwj0;
import xsna.q6r0;
import xsna.qcy;
import xsna.rf;
import xsna.s65;
import xsna.txz;
import xsna.yp6;

/* compiled from: MenuComponentImpl.kt */
/* loaded from: classes11.dex */
public final class MenuComponentImpl implements MenuComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a;
    public final nwy b;
    public final nwy c;

    /* compiled from: MenuComponentImpl.kt */
    public static final class a implements c8m<MenuComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MenuComponentImpl();
        }
    }

    /* compiled from: MenuComponentImpl.kt */
    /* loaded from: classes7.dex */
    public static final class b implements byz {
        @Override // xsna.byz
        public final q a(Context context) {
            int i = nt0.a;
            PermissionHelper.a.getClass();
            if (PermissionHelper.b(context, PermissionHelper.h) && txz.b()) {
                int i2 = 1;
                return new p1(kzz.c(3000L, context).U(new e7(new pf(i2), i2)), new g7(new rf(1), 2));
            }
            it80.b.getClass();
            return q.T(it80.a.a());
        }
    }

    /* compiled from: MenuComponentImpl.kt */
    /* loaded from: classes7.dex */
    public static final class c {
    }

    /* compiled from: MenuComponentImpl.kt */
    public static final class d implements ez50 {
        @Override // xsna.ez50
        public final com.vk.dto.menu.a a() {
            return q6r0.f().s();
        }

        @Override // xsna.ez50
        public final void b(com.vk.dto.menu.a aVar) {
            o6r0 c = q6r0.c();
            c.o(aVar);
            c.f();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MenuComponentImpl.class, "menuRouter", "getMenuRouter()Lcom/vk/menu/MenuRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, MenuComponentImpl.class, "menuUiUtils", "getMenuUiUtils()Lcom/vk/menu/MenuUiUtils;", hpf0Var), ep.a(0, MenuComponentImpl.class, "locationRepository", "getLocationRepository()Lcom/vk/menu/domain/interactor/repository/LocationRepository;", hpf0Var), ep.a(0, MenuComponentImpl.class, "navigationRepository", "getNavigationRepository()Lcom/vk/menu/domain/interactor/repository/NavigationRepository;", hpf0Var)};
    }

    public MenuComponentImpl() {
        new nwy(new yp6(5));
        this.a = new nwy(new s65(4));
        this.b = new nwy(new c24(4));
        this.c = new nwy(new l67(2));
    }

    @Override // com.vk.menu.di.MenuComponent
    public final ez50 S2() {
        qcy<Object> qcyVar = d[3];
        return (ez50) this.c.c();
    }

    @Override // com.vk.menu.di.MenuComponent
    public final byz Sa() {
        qcy<Object> qcyVar = d[2];
        return (byz) this.b.c();
    }

    @Override // com.vk.menu.di.MenuComponent
    public final k820 md() {
        qcy<Object> qcyVar = d[1];
        return (k820) this.a.c();
    }
}
