package com.yandex.go.scooters.ignition.controlling.permission_info;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.ignition.domain.model.ScootersIgnitionOption;
import defpackage.brn0;
import defpackage.dsn0;
import defpackage.esn0;
import defpackage.f9s;
import defpackage.fsn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ldsn0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.permission_info.ScootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1", f = "ScootersIgnitionPermissionInfoUiStateInteractor.kt", l = {21, 34}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionOption $scootersIgnitionOption;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ fsn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1(fsn0 fsn0Var, ScootersIgnitionOption scootersIgnitionOption, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fsn0Var;
        this.$scootersIgnitionOption = scootersIgnitionOption;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1 scootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1 = new ScootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1(this.this$0, this.$scootersIgnitionOption, continuation);
        scootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return scootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r0.emit(r4, r11) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        if (r12 == r1) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersIgnitionExperiment.Ui.PermissionsInfoItem permissionsInfoItem;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            brn0 brn0Var = this.this$0.c;
            this.L$0 = vprVar;
            this.label = 1;
            obj = brn0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        ScootersIgnitionExperiment scootersIgnitionExperiment = (ScootersIgnitionExperiment) obj;
        ScootersIgnitionExperiment.Ui.PermissionsInfoContainer permissionsInfoContainer = scootersIgnitionExperiment.r.f;
        ScootersIgnitionExperiment.Ui.PermissionsInfo permissionsInfo = permissionsInfoContainer != null ? permissionsInfoContainer.a : null;
        if (permissionsInfo == null) {
            ny61.r("No permission info in experiment");
            return null;
        }
        int i2 = esn0.a[this.$scootersIgnitionOption.ordinal()];
        if (i2 == 1) {
            permissionsInfoItem = permissionsInfo.a;
        } else if (i2 == 2) {
            permissionsInfoItem = permissionsInfo.b;
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            permissionsInfoItem = permissionsInfo.c;
        }
        if (permissionsInfoItem == null) {
            ny61.r("No permission info item in experiment");
            return null;
        }
        dsn0 dsn0Var = new dsn0(c.f(this.this$0.b, f9s.e(permissionsInfoItem.a, scootersIgnitionExperiment), false, null, 14).toString(), c.f(this.this$0.b, f9s.e(permissionsInfoItem.b, scootersIgnitionExperiment), false, null, 14).toString(), c.f(this.this$0.b, f9s.e(permissionsInfoItem.c, scootersIgnitionExperiment), false, null, 14).toString());
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }
}
