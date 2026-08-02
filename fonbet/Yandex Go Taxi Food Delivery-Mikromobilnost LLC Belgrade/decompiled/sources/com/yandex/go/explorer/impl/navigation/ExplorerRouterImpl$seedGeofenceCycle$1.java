package com.yandex.go.explorer.impl.navigation;

import android.location.Location;
import defpackage.c0g;
import defpackage.gto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$seedGeofenceCycle$1", f = "ExplorerRouterImpl.kt", l = {145, HProv.PP_CONTAINER_STATUS, 147, 151}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRouterImpl$seedGeofenceCycle$1 extends SuspendLambda implements wls {
    final /* synthetic */ gto $component;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRouterImpl$seedGeofenceCycle$1(c cVar, gto gtoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$component = gtoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRouterImpl$seedGeofenceCycle$1(this.this$0, this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRouterImpl$seedGeofenceCycle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if (r9 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r9 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r9 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r9 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.go.explorer.impl.geofencing.b bVar;
        Location location;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            bVar = (com.yandex.go.explorer.impl.geofencing.b) ((c0g) this.this$0.D).z.ug.get();
            this.L$0 = bVar;
            this.label = 1;
            obj = bVar.b(this);
        } else if (i == 1) {
            bVar = (com.yandex.go.explorer.impl.geofencing.b) this.L$0;
            kotlin.b.b(obj);
        } else {
            if (i == 2) {
                kotlin.b.b(obj);
                location = (Location) obj;
                if (location == null) {
                    ExplorerRouterImpl$seedGeofenceCycle$1$location$1 explorerRouterImpl$seedGeofenceCycle$1$location$1 = new ExplorerRouterImpl$seedGeofenceCycle$1$location$1(this.$component, null);
                    this.L$0 = null;
                    this.label = 3;
                    obj = kotlinx.coroutines.a.w(6000L, explorerRouterImpl$seedGeofenceCycle$1$location$1, this);
                }
                com.yandex.go.explorer.impl.geofencing.a s = ((c0g) this.this$0.D).z.s();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                return s.b(location, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
            location = (Location) obj;
        }
        location = (Location) obj;
        if (location == null) {
            this.L$0 = null;
            this.label = 2;
            obj = bVar.a(this);
        }
        com.yandex.go.explorer.impl.geofencing.a s2 = ((c0g) this.this$0.D).z.s();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 4;
        if (s2.b(location, this) != coroutineSingletons) {
        }
    }
}
