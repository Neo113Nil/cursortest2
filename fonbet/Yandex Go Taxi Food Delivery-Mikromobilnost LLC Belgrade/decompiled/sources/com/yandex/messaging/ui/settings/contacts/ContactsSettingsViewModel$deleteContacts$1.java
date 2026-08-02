package com.yandex.messaging.ui.settings.contacts;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.tde;
import defpackage.tse;
import defpackage.wls;
import defpackage.x22;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.contacts.ContactsSettingsViewModel$deleteContacts$1", f = "ContactsSettingsViewModel.kt", l = {90, 91}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ContactsSettingsViewModel$deleteContacts$1 extends SuspendLambda implements wls {
    final /* synthetic */ l8x $minimalActionProgress;
    boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSettingsViewModel$deleteContacts$1(c cVar, l8x l8xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$minimalActionProgress = l8xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsSettingsViewModel$deleteContacts$1(this.this$0, this.$minimalActionProgress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactsSettingsViewModel$deleteContacts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.messaging.domain.contacts.a aVar = this.this$0.w;
            this.label = 1;
            obj = aVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                kotlin.b.b(obj);
                r0 r0Var = this.this$0.z;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                c cVar = this.this$0;
                x22 x22Var = cVar.y;
                LinkedHashMap Z = c.Z(cVar);
                Z.put(TarifficatorScenarioActivity.RESULT_KEY, Boolean.valueOf(z));
                x22Var.reportEvent("contacts_settings_delete_finished", Z);
                this.this$0.X(new tde(!z ? oyh0.purge_contacts_confirmation_finished : oyh0.purge_contacts_confirmation_failed));
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        l8x l8xVar = this.$minimalActionProgress;
        this.Z$0 = booleanValue;
        this.label = 2;
        if (l8xVar.u0(this) != coroutineSingletons) {
            z = booleanValue;
            r0 r0Var2 = this.this$0.z;
            Boolean bool2 = Boolean.FALSE;
            r0Var2.getClass();
            r0Var2.m(null, bool2);
            c cVar2 = this.this$0;
            x22 x22Var2 = cVar2.y;
            LinkedHashMap Z2 = c.Z(cVar2);
            Z2.put(TarifficatorScenarioActivity.RESULT_KEY, Boolean.valueOf(z));
            x22Var2.reportEvent("contacts_settings_delete_finished", Z2);
            this.this$0.X(new tde(!z ? oyh0.purge_contacts_confirmation_finished : oyh0.purge_contacts_confirmation_failed));
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
