package com.yandex.messaging.ui.settings.contacts;

import defpackage.eyc;
import defpackage.fyc;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.contacts.ContactsSettingsFragment$launchWhenReady$1", f = "ContactsSettingsFragment.kt", l = {HProv.PP_REBOOT, HProv.PP_REBOOT}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ContactsSettingsFragment$launchWhenReady$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    Object L$0;
    int label;
    final /* synthetic */ ContactsSettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSettingsFragment$launchWhenReady$1(wls wlsVar, ContactsSettingsFragment contactsSettingsFragment, Continuation continuation) {
        super(2, continuation);
        this.$block = wlsVar;
        this.this$0 = contactsSettingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsSettingsFragment$launchWhenReady$1(this.$block, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactsSettingsFragment$launchWhenReady$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wls wlsVar;
        eyc eycVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wlsVar = this.$block;
            eycVar = this.this$0.fragmentComponent;
            this.L$0 = wlsVar;
            this.label = 1;
            obj = ((fyc) eycVar).s(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wlsVar = (wls) this.L$0;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
