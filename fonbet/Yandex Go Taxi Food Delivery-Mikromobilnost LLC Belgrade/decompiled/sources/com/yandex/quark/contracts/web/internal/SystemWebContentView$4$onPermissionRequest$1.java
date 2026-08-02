package com.yandex.quark.contracts.web.internal;

import android.webkit.PermissionRequest;
import com.yandex.quark.webchat.g;
import defpackage.cya0;
import defpackage.gw00;
import defpackage.j73;
import defpackage.lcy0;
import defpackage.mcy0;
import defpackage.mvg;
import defpackage.mya0;
import defpackage.ny61;
import defpackage.ple;
import defpackage.tse;
import defpackage.wls;
import defpackage.y3x0;
import defpackage.zxa0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.contracts.web.internal.SystemWebContentView$4$onPermissionRequest$1", f = "SystemWebContentView.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SystemWebContentView$4$onPermissionRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ PermissionRequest $request;
    final /* synthetic */ List<cya0> $requiredPermissions;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ y3x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemWebContentView$4$onPermissionRequest$1(y3x0 y3x0Var, List list, PermissionRequest permissionRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y3x0Var;
        this.$requiredPermissions = list;
        this.$request = permissionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SystemWebContentView$4$onPermissionRequest$1 systemWebContentView$4$onPermissionRequest$1 = new SystemWebContentView$4$onPermissionRequest$1(this.this$0, this.$requiredPermissions, this.$request, continuation);
        systemWebContentView$4$onPermissionRequest$1.L$0 = obj;
        return systemWebContentView$4$onPermissionRequest$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SystemWebContentView$4$onPermissionRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            g gVar = this.this$0.g;
            if (gVar != null) {
                List<cya0> list = this.$requiredPermissions;
                this.L$0 = tseVar;
                this.label = 1;
                obj = gVar.a(list, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            PermissionRequest permissionRequest = this.$request;
            y3x0 y3x0Var = this.this$0;
            permissionRequest.deny();
            y3x0Var.d.b(new lcy0());
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<mya0> list2 = (List) obj;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (mya0 mya0Var : list2) {
                String str = mya0Var.a.equals(zxa0.a) ? "android.webkit.resource.AUDIO_CAPTURE" : null;
                if (mya0Var.c && str != null) {
                    arrayList.add(str);
                }
            }
            boolean isEmpty = arrayList.isEmpty();
            y3x0 y3x0Var2 = this.this$0;
            if (isEmpty) {
                y3x0Var2.b.c("SystemWebContentView", "Deny permissions for resources: ".concat(j73.L(this.$request.getResources(), null, null, null, 63)));
                this.this$0.d.b(new mcy0());
                this.$request.deny();
                return zy11Var;
            }
            y3x0Var2.b.c("SystemWebContentView", "Allow permissions for resources: " + arrayList);
            this.this$0.d.b(new ple(4, "Technical.Permission.WebProvided", gw00.e(new Pair("permissions", arrayList)), false));
            this.$request.grant((String[]) arrayList.toArray(new String[0]));
            return zy11Var;
        }
        PermissionRequest permissionRequest2 = this.$request;
        y3x0 y3x0Var3 = this.this$0;
        permissionRequest2.deny();
        y3x0Var3.d.b(new lcy0());
        return zy11Var;
    }
}
