package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import defpackage.fp31;
import defpackage.fu11;
import defpackage.lml;
import defpackage.m6o;
import defpackage.ngd0;
import defpackage.sls;
import defpackage.tsu;
import defpackage.unr0;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class a {
    public final Div2View a;
    public final boolean b;
    public final fp31 c;
    public final lml d;
    public final tsu e;
    public boolean f;
    public final com.yandex.div.core.view2.debugview.b g;
    public ViewGroup h;
    public com.yandex.div.core.view2.debugview.a i;

    public a(m6o m6oVar, Div2View div2View, boolean z, boolean z2, fp31 fp31Var, lml lmlVar) {
        this.a = div2View;
        this.b = z2;
        this.c = fp31Var;
        this.d = lmlVar;
        tsu tsuVar = new tsu(div2View);
        this.e = tsuVar;
        this.f = z;
        this.g = new com.yandex.div.core.view2.debugview.b(m6oVar, div2View, z, z2, tsuVar);
        c();
    }

    public static final boolean a(a aVar) {
        return aVar.b || aVar.f || aVar.e.h;
    }

    public final void b(final ViewGroup viewGroup) {
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        boolean a = fu11Var.a();
        lml lmlVar = this.d;
        com.yandex.div.core.view2.debugview.b bVar = this.g;
        Div2View div2View = this.a;
        if (a) {
            this.h = viewGroup;
            if (a(this)) {
                com.yandex.div.core.view2.debugview.a aVar = this.i;
                if (aVar != null) {
                    aVar.close();
                }
                this.i = new com.yandex.div.core.view2.debugview.a(viewGroup, div2View, bVar, lmlVar);
                return;
            }
            return;
        }
        com.yandex.div.core.util.binding.a g = unr0.g(div2View, ngd0Var);
        if (!fu11Var.a()) {
            g.c(new sls() { // from class: com.yandex.div.core.view2.errors.ErrorVisualMonitor$connect$$inlined$runMainThreadAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    a aVar2 = a.this;
                    aVar2.h = viewGroup;
                    if (a.a(aVar2)) {
                        com.yandex.div.core.view2.debugview.a aVar3 = a.this.i;
                        if (aVar3 != null) {
                            aVar3.close();
                        }
                        a aVar4 = a.this;
                        aVar4.i = new com.yandex.div.core.view2.debugview.a(viewGroup, aVar4.a, aVar4.g, aVar4.d);
                    }
                    return zy11.a;
                }
            });
            return;
        }
        this.h = viewGroup;
        if (a(this)) {
            com.yandex.div.core.view2.debugview.a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.close();
            }
            this.i = new com.yandex.div.core.view2.debugview.a(viewGroup, div2View, bVar, lmlVar);
        }
    }

    public final void c() {
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        boolean a = fu11Var.a();
        fp31 fp31Var = this.c;
        if (a) {
            if (!a(this)) {
                com.yandex.div.core.view2.debugview.a aVar = this.i;
                if (aVar != null) {
                    aVar.close();
                }
                this.i = null;
                return;
            }
            ErrorVisualMonitor$connectOrDisconnect$1$1 errorVisualMonitor$connectOrDisconnect$1$1 = new ErrorVisualMonitor$connectOrDisconnect$1$1(this);
            errorVisualMonitor$connectOrDisconnect$1$1.invoke(fp31Var.a);
            fp31Var.b.add(errorVisualMonitor$connectOrDisconnect$1$1);
            ViewGroup viewGroup = this.h;
            if (viewGroup != null) {
                b(viewGroup);
                return;
            }
            return;
        }
        com.yandex.div.core.util.binding.a g = unr0.g(this.a, ngd0Var);
        if (!fu11Var.a()) {
            g.c(new sls() { // from class: com.yandex.div.core.view2.errors.ErrorVisualMonitor$connectOrDisconnect$$inlined$runMainThreadAction$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    boolean a2 = a.a(a.this);
                    a aVar2 = a.this;
                    if (a2) {
                        fp31 fp31Var2 = aVar2.c;
                        ErrorVisualMonitor$connectOrDisconnect$1$1 errorVisualMonitor$connectOrDisconnect$1$12 = new ErrorVisualMonitor$connectOrDisconnect$1$1(aVar2);
                        errorVisualMonitor$connectOrDisconnect$1$12.invoke(fp31Var2.a);
                        fp31Var2.b.add(errorVisualMonitor$connectOrDisconnect$1$12);
                        a aVar3 = a.this;
                        ViewGroup viewGroup2 = aVar3.h;
                        if (viewGroup2 != null) {
                            aVar3.b(viewGroup2);
                        }
                    } else {
                        com.yandex.div.core.view2.debugview.a aVar4 = aVar2.i;
                        if (aVar4 != null) {
                            aVar4.close();
                        }
                        a.this.i = null;
                    }
                    return zy11.a;
                }
            });
            return;
        }
        if (!a(this)) {
            com.yandex.div.core.view2.debugview.a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.close();
            }
            this.i = null;
            return;
        }
        ErrorVisualMonitor$connectOrDisconnect$1$1 errorVisualMonitor$connectOrDisconnect$1$12 = new ErrorVisualMonitor$connectOrDisconnect$1$1(this);
        errorVisualMonitor$connectOrDisconnect$1$12.invoke(fp31Var.a);
        fp31Var.b.add(errorVisualMonitor$connectOrDisconnect$1$12);
        ViewGroup viewGroup2 = this.h;
        if (viewGroup2 != null) {
            b(viewGroup2);
        }
    }
}
