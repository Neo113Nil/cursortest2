package com.yandex.messaging.ui.settings;

import com.yandex.messaging.domain.statuses.StatusIconType;
import defpackage.du21;
import defpackage.gu21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgu21;", ACSPConstants.STATUS, "Lzy11;", "<anonymous>", "(Lgu21;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.SettingsScreenViewModel$observePersonalStatus$1", f = "SettingsScreenViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SettingsScreenViewModel$observePersonalStatus$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsScreenViewModel$observePersonalStatus$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SettingsScreenViewModel$observePersonalStatus$1 settingsScreenViewModel$observePersonalStatus$1 = new SettingsScreenViewModel$observePersonalStatus$1(this.this$0, continuation);
        settingsScreenViewModel$observePersonalStatus$1.L$0 = obj;
        return settingsScreenViewModel$observePersonalStatus$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SettingsScreenViewModel$observePersonalStatus$1 settingsScreenViewModel$observePersonalStatus$1 = (SettingsScreenViewModel$observePersonalStatus$1) create((gu21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        settingsScreenViewModel$observePersonalStatus$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gu21 gu21Var = (gu21) this.L$0;
        f fVar = this.this$0;
        if (gu21Var == null) {
            r0 r0Var = fVar.G;
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, pdr0.a((pdr0) value2, false, false, false, false, null, null, null, false, false, 425983)));
        } else {
            String b = gu21Var.b(fVar.B.a.getResources());
            du21 du21Var = gu21Var instanceof du21 ? (du21) gu21Var : null;
            StatusIconType statusIconType = du21Var != null ? du21Var.f : null;
            if (statusIconType == null && du21Var != null) {
                str = du21Var.d;
            }
            StringBuilder sb = new StringBuilder();
            if (str != null) {
                sb.append(str.concat(" "));
            }
            sb.append(b);
            String sb2 = sb.toString();
            r0 r0Var2 = this.this$0.G;
            do {
                value = r0Var2.getValue();
            } while (!r0Var2.k(value, pdr0.a((pdr0) value, false, false, false, false, null, sb2, statusIconType, false, false, 425983)));
        }
        return zy11.a;
    }
}
