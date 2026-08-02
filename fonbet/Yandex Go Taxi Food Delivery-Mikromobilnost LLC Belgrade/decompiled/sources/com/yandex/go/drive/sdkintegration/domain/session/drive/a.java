package com.yandex.go.drive.sdkintegration.domain.session.drive;

import defpackage.fnt;
import defpackage.hqn;
import defpackage.jnt;
import defpackage.jqn;
import defpackage.lqn;
import defpackage.ny61;
import defpackage.qfm;
import defpackage.tcc;
import defpackage.vhf;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DriveSessionStateInteractor$special$$inlined$map$1$2$1 driveSessionStateInteractor$special$$inlined$map$1$2$1;
        int i;
        jnt jntVar;
        if (continuation instanceof DriveSessionStateInteractor$special$$inlined$map$1$2$1) {
            driveSessionStateInteractor$special$$inlined$map$1$2$1 = (DriveSessionStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = driveSessionStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveSessionStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = driveSessionStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveSessionStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lqn lqnVar = (lqn) obj;
                    if (lqnVar instanceof hqn) {
                        jntVar = new jnt(EmptyList.a);
                    } else {
                        if (!(lqnVar instanceof jqn)) {
                            w511.b();
                            return null;
                        }
                        ArrayList arrayList = ((vhf) ((jqn) lqnVar).b()).b;
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new fnt((qfm) it.next()));
                        }
                        jntVar = new jnt(arrayList2);
                    }
                    driveSessionStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    driveSessionStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    driveSessionStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    driveSessionStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    driveSessionStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(jntVar, driveSessionStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        driveSessionStateInteractor$special$$inlined$map$1$2$1 = new DriveSessionStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = driveSessionStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveSessionStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
