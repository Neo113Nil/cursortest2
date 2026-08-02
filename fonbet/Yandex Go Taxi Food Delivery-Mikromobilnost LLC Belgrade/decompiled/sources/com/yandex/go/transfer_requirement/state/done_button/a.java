package com.yandex.go.transfer_requirement.state.done_button;

import android.graphics.drawable.Drawable;
import com.yandex.go.transfer_requirement.card_state.DoneButtonAction;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.avj0;
import defpackage.f4m;
import defpackage.i4m;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.o4m;
import defpackage.zuj0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes14.dex */
public final class a {
    public final zuj0 a;
    public final b b;

    public a(zuj0 zuj0Var, b bVar) {
        this.a = zuj0Var;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TransferRequirementExperiment.Card.ActionButtonDto actionButtonDto, f4m f4mVar, Map map, ContinuationImpl continuationImpl) {
        DoneButtonUiStateMapper$getNetworkErrorUiState$1 doneButtonUiStateMapper$getNetworkErrorUiState$1;
        int i;
        String str;
        boolean z;
        if (continuationImpl instanceof DoneButtonUiStateMapper$getNetworkErrorUiState$1) {
            doneButtonUiStateMapper$getNetworkErrorUiState$1 = (DoneButtonUiStateMapper$getNetworkErrorUiState$1) continuationImpl;
            int i2 = doneButtonUiStateMapper$getNetworkErrorUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                doneButtonUiStateMapper$getNetworkErrorUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = doneButtonUiStateMapper$getNetworkErrorUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = doneButtonUiStateMapper$getNetworkErrorUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = actionButtonDto.a;
                    String str3 = str2 != null ? (String) map.get(str2) : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    boolean z2 = f4mVar.a;
                    doneButtonUiStateMapper$getNetworkErrorUiState$1.L$0 = null;
                    doneButtonUiStateMapper$getNetworkErrorUiState$1.L$1 = null;
                    doneButtonUiStateMapper$getNetworkErrorUiState$1.L$2 = null;
                    doneButtonUiStateMapper$getNetworkErrorUiState$1.L$3 = str3;
                    doneButtonUiStateMapper$getNetworkErrorUiState$1.Z$0 = z2;
                    doneButtonUiStateMapper$getNetworkErrorUiState$1.label = 1;
                    obj = this.b.g(24, doneButtonUiStateMapper$getNetworkErrorUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str3;
                    z = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = doneButtonUiStateMapper$getNetworkErrorUiState$1.Z$0;
                    String str4 = (String) doneButtonUiStateMapper$getNetworkErrorUiState$1.L$3;
                    kotlin.b.b(obj);
                    z = z3;
                    str = str4;
                }
                return new o4m(str, z, ((avj0) this.a).h(kyh0.network_error), (Drawable) obj, DoneButtonAction.REQUEST);
            }
        }
        doneButtonUiStateMapper$getNetworkErrorUiState$1 = new DoneButtonUiStateMapper$getNetworkErrorUiState$1(this, continuationImpl);
        Object obj2 = doneButtonUiStateMapper$getNetworkErrorUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = doneButtonUiStateMapper$getNetworkErrorUiState$1.label;
        if (i != 0) {
        }
        return new o4m(str, z, ((avj0) this.a).h(kyh0.network_error), (Drawable) obj2, DoneButtonAction.REQUEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TransferRequirementExperiment.Card.ActionButtonDto actionButtonDto, i4m i4mVar, Map map, ContinuationImpl continuationImpl) {
        DoneButtonUiStateMapper$getRequestErrorUiState$1 doneButtonUiStateMapper$getRequestErrorUiState$1;
        int i;
        String str;
        boolean z;
        if (continuationImpl instanceof DoneButtonUiStateMapper$getRequestErrorUiState$1) {
            doneButtonUiStateMapper$getRequestErrorUiState$1 = (DoneButtonUiStateMapper$getRequestErrorUiState$1) continuationImpl;
            int i2 = doneButtonUiStateMapper$getRequestErrorUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                doneButtonUiStateMapper$getRequestErrorUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = doneButtonUiStateMapper$getRequestErrorUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = doneButtonUiStateMapper$getRequestErrorUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = actionButtonDto.a;
                    str = str2 != null ? (String) map.get(str2) : null;
                    if (str == null) {
                        str = "";
                    }
                    boolean z2 = i4mVar.a;
                    doneButtonUiStateMapper$getRequestErrorUiState$1.L$0 = null;
                    doneButtonUiStateMapper$getRequestErrorUiState$1.L$1 = i4mVar;
                    doneButtonUiStateMapper$getRequestErrorUiState$1.L$2 = null;
                    doneButtonUiStateMapper$getRequestErrorUiState$1.L$3 = str;
                    doneButtonUiStateMapper$getRequestErrorUiState$1.Z$0 = z2;
                    doneButtonUiStateMapper$getRequestErrorUiState$1.label = 1;
                    obj = this.b.g(24, doneButtonUiStateMapper$getRequestErrorUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = doneButtonUiStateMapper$getRequestErrorUiState$1.Z$0;
                    str = (String) doneButtonUiStateMapper$getRequestErrorUiState$1.L$3;
                    i4mVar = (i4m) doneButtonUiStateMapper$getRequestErrorUiState$1.L$1;
                    kotlin.b.b(obj);
                    z = z3;
                }
                return new o4m(str, z, i4mVar.b, (Drawable) obj, i4mVar.c);
            }
        }
        doneButtonUiStateMapper$getRequestErrorUiState$1 = new DoneButtonUiStateMapper$getRequestErrorUiState$1(this, continuationImpl);
        Object obj2 = doneButtonUiStateMapper$getRequestErrorUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = doneButtonUiStateMapper$getRequestErrorUiState$1.label;
        if (i != 0) {
        }
        return new o4m(str, z, i4mVar.b, (Drawable) obj2, i4mVar.c);
    }
}
