package com.yandex.go.navigation.screen;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.bvf0;
import defpackage.hhf;
import defpackage.hst;
import defpackage.jhf;
import defpackage.jst;
import defpackage.k20;
import defpackage.mth;
import defpackage.ny61;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class c {
    public final r0 a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArrayList c;

    public c() {
        Screen screen = Screen.NONE;
        this.a = bvf0.c(new jhf(screen, screen));
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
    }

    public final k20 a(hhf hhfVar) {
        this.b.add(hhfVar);
        return new k20(1, this, hhfVar);
    }

    public final Screen b() {
        return ((jhf) this.a.getValue()).b;
    }

    public final b c() {
        return new b(this.a);
    }

    public final Screen d() {
        return ((jhf) this.a.getValue()).a;
    }

    public final boolean e() {
        Screen b = b();
        return b == Screen.MAIN || b == Screen.MAIN_V4;
    }

    public final boolean f() {
        Screen b = b();
        return b == Screen.ORDER || b == Screen.ORDERS_LIST || b == Screen.ORDER_DETAILS || b == Screen.ORDER_TRACKING || b == Screen.ORDER_INTERMEDIATE_POINTS;
    }

    public final boolean g() {
        return b() == Screen.SUMMARY;
    }

    public final boolean h() {
        Screen b = b();
        return b == Screen.MAIN || b == Screen.TAXI_MAIN;
    }

    public final void i(Screen screen) {
        Screen b = b();
        if (b != screen) {
            hst hstVar = jst.e;
            Objects.toString(screen);
            Objects.toString(b);
            hstVar.getClass();
            jhf jhfVar = new jhf(b, screen);
            r0 r0Var = this.a;
            r0Var.getClass();
            r0Var.m(null, jhfVar);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((hhf) it.next()).a(screen);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            List J0 = kotlin.collections.a.J0(copyOnWriteArrayList);
            Iterator it2 = J0.iterator();
            while (it2.hasNext()) {
                ((hhf) it2.next()).a(screen);
            }
            copyOnWriteArrayList.removeAll(J0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum j(ContinuationImpl continuationImpl) {
        CurrentScreenRepositoryImpl$waitForScreenChange$1 currentScreenRepositoryImpl$waitForScreenChange$1;
        int i;
        if (continuationImpl instanceof CurrentScreenRepositoryImpl$waitForScreenChange$1) {
            currentScreenRepositoryImpl$waitForScreenChange$1 = (CurrentScreenRepositoryImpl$waitForScreenChange$1) continuationImpl;
            int i2 = currentScreenRepositoryImpl$waitForScreenChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentScreenRepositoryImpl$waitForScreenChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentScreenRepositoryImpl$waitForScreenChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentScreenRepositoryImpl$waitForScreenChange$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = new mth(this.a, 4);
                    currentScreenRepositoryImpl$waitForScreenChange$1.label = 1;
                    obj = e.y(mthVar, currentScreenRepositoryImpl$waitForScreenChange$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((jhf) obj).b;
            }
        }
        currentScreenRepositoryImpl$waitForScreenChange$1 = new CurrentScreenRepositoryImpl$waitForScreenChange$1(this, continuationImpl);
        Object obj2 = currentScreenRepositoryImpl$waitForScreenChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentScreenRepositoryImpl$waitForScreenChange$1.label;
        if (i != 0) {
        }
        return ((jhf) obj2).b;
    }
}
