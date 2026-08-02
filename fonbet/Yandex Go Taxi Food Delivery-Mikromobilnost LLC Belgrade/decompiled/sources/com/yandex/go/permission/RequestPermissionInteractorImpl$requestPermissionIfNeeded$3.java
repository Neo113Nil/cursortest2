package com.yandex.go.permission;

import defpackage.j7j0;
import defpackage.jx81;
import defpackage.k40;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.permission.RequestPermissionInteractorImpl$requestPermissionIfNeeded$3", f = "RequestPermissionInteractorImpl.kt", l = {56, 58}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RequestPermissionInteractorImpl$requestPermissionIfNeeded$3 extends SuspendLambda implements wls {
    final /* synthetic */ int $permission;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPermissionInteractorImpl$requestPermissionIfNeeded$3(b bVar, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$permission = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RequestPermissionInteractorImpl$requestPermissionIfNeeded$3 requestPermissionInteractorImpl$requestPermissionIfNeeded$3 = new RequestPermissionInteractorImpl$requestPermissionIfNeeded$3(this.this$0, this.$permission, continuation);
        requestPermissionInteractorImpl$requestPermissionIfNeeded$3.L$0 = obj;
        return requestPermissionInteractorImpl$requestPermissionIfNeeded$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestPermissionInteractorImpl$requestPermissionIfNeeded$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        if (r9 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        if (r6 == r1) goto L52;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, CoroutineStart.UNDISPATCHED, new RequestPermissionInteractorImpl$requestPermissionIfNeeded$3$permissionResult$1(this.this$0, this.$permission, null), 1);
            b bVar = this.this$0;
            int i2 = this.$permission;
            k40 k40Var = bVar.b;
            switch (i2) {
                case 1:
                    k40Var.n(1);
                    break;
                case 2:
                    if (!k40Var.j()) {
                        k40Var.n(2);
                        break;
                    }
                    break;
                case 3:
                    if (!k40Var.a.c()) {
                        k40Var.n(3);
                        break;
                    }
                    break;
                case 4:
                default:
                    ny61.g(oyr.i(i2, "Unknown permission: "));
                    return null;
                case 5:
                    if (!k40Var.m()) {
                        k40Var.n(5);
                        break;
                    }
                    break;
                case 6:
                    k40Var.n(6);
                    break;
                case 7:
                    k40Var.n(7);
                    break;
                case 8:
                    k40Var.n(8);
                    break;
                case 9:
                    k40Var.n(9);
                    break;
                case 10:
                    if (!k40Var.i() && jx81.e()) {
                        k40Var.n(10);
                        break;
                    }
                    break;
                case 11:
                    if (!k40Var.a.h() && jx81.e()) {
                        k40Var.n(11);
                        break;
                    }
                    break;
                case 12:
                    k40Var.o();
                    break;
                case 13:
                    k40Var.n(13);
                    break;
                case 14:
                    if (!k40Var.k()) {
                        k40Var.n(14);
                        break;
                    }
                    break;
                case 15:
                    k40Var.n(15);
                    break;
            }
            j7j0 j7j0Var = this.this$0.d;
            int i3 = this.$permission;
            this.L$0 = null;
            this.L$1 = h;
            this.label = 1;
            Object obj2 = zy11.a;
            if (i3 == 1) {
                obj2 = j7j0Var.c.emit(obj2, this);
            } else {
                j7j0Var.getClass();
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                List list = (List) obj;
                if (!list.isEmpty()) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (!Boolean.TRUE.equals(it.next())) {
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            }
            h = (noh) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = h.k(this);
    }
}
