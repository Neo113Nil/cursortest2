package com.yandex.quark.lite.js;

import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.js.event.i;
import com.yandex.quark.utils.Disposable;
import defpackage.clc;
import defpackage.g8e;
import defpackage.ifo;
import defpackage.jyj0;
import defpackage.mih;
import defpackage.ny61;
import defpackage.olc;
import defpackage.ple;
import defpackage.shg0;
import defpackage.ss1;
import defpackage.syj0;
import defpackage.tse;
import defpackage.uhg0;
import defpackage.x0p;
import defpackage.x43;
import defpackage.xa20;
import defpackage.zhg0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class a implements shg0, zhg0, ifo {
    public final xa20 a;
    public volatile shg0 b;
    public Disposable w;
    public QuarkJsState c = QuarkJsState.NOT_CONNECTED;
    public final CopyOnWriteArraySet x = new CopyOnWriteArraySet();
    public final LinkedHashSet y = new LinkedHashSet();
    public final x43 z = new x43();

    public a(tse tseVar, xa20 xa20Var) {
        this.a = xa20Var;
    }

    @Override // defpackage.mfo
    public final Disposable a(ifo ifoVar) {
        this.x.add(ifoVar);
        return new ss1(1, this, ifoVar);
    }

    @Override // defpackage.mlc
    public final syj0 b(clc clcVar) {
        shg0 shg0Var = this.b;
        return shg0Var == null ? new jyj0(olc.b) : shg0Var.b(clcVar);
    }

    @Override // defpackage.ifo
    public final boolean c(i iVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.x;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            if (((ifo) it.next()).c(iVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zhg0
    public final synchronized void d(QuarkJsState quarkJsState) {
        try {
            int i = x0p.a[quarkJsState.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                j(quarkJsState);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.eq60
    public final void e(Object obj) {
        zhg0 zhg0Var = (zhg0) obj;
        synchronized (this) {
            this.y.add(zhg0Var);
            zhg0Var.d(this.c);
        }
    }

    @Override // defpackage.eq60
    public final void f(Object obj) {
        zhg0 zhg0Var = (zhg0) obj;
        synchronized (this) {
            this.y.remove(zhg0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ifo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(i iVar, ContinuationImpl continuationImpl) {
        ExternalQuarkJsSwitcher$handle$1 externalQuarkJsSwitcher$handle$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof ExternalQuarkJsSwitcher$handle$1) {
            externalQuarkJsSwitcher$handle$1 = (ExternalQuarkJsSwitcher$handle$1) continuationImpl;
            int i2 = externalQuarkJsSwitcher$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalQuarkJsSwitcher$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = externalQuarkJsSwitcher$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalQuarkJsSwitcher$handle$1.label;
                if (i != 0) {
                    b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = this.x.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((ifo) next).c(iVar)) {
                            arrayList.add(next);
                        }
                    }
                    it = arrayList.iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) externalQuarkJsSwitcher$handle$1.L$1;
                    iVar = (i) externalQuarkJsSwitcher$handle$1.L$0;
                    b.b(obj);
                }
                while (it.hasNext()) {
                    ifo ifoVar = (ifo) it.next();
                    externalQuarkJsSwitcher$handle$1.L$0 = iVar;
                    externalQuarkJsSwitcher$handle$1.L$1 = it;
                    externalQuarkJsSwitcher$handle$1.label = 1;
                    if (ifoVar.g(iVar, externalQuarkJsSwitcher$handle$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        externalQuarkJsSwitcher$handle$1 = new ExternalQuarkJsSwitcher$handle$1(this, continuationImpl);
        Object obj2 = externalQuarkJsSwitcher$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalQuarkJsSwitcher$handle$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    public final synchronized void h(uhg0 uhg0Var) {
        try {
            shg0 shg0Var = this.b;
            if (shg0Var != null) {
                this.z.addLast(shg0Var);
                k();
            }
            synchronized (this) {
                this.b = uhg0Var;
                mih mihVar = (mih) uhg0Var;
                this.w = mihVar.a(this);
                mihVar.e(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i() {
        try {
            k();
            if (this.z.isEmpty()) {
                this.b = null;
                this.w = null;
                j(QuarkJsState.NOT_CONNECTED);
            } else {
                shg0 shg0Var = (shg0) this.z.removeLast();
                synchronized (this) {
                    this.b = shg0Var;
                    this.w = shg0Var.a(this);
                    shg0Var.e(this);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(QuarkJsState quarkJsState) {
        this.c = quarkJsState;
        this.a.b(new ple("Core.QuarkJsStateChanged", g8e.z(ClidProvider.STATE, quarkJsState.name())));
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((zhg0) it.next()).d(quarkJsState);
        }
    }

    public final synchronized void k() {
        try {
            shg0 shg0Var = this.b;
            if (shg0Var != null) {
                shg0Var.f(this);
            }
            this.b = null;
            Disposable disposable = this.w;
            if (disposable != null) {
                disposable.dispose();
            }
            this.w = null;
            j(QuarkJsState.NOT_CONNECTED);
        } catch (Throwable th) {
            throw th;
        }
    }
}
