package com.yandex.go.trusted_contacts.data.repositories;

import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsDto;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsOption;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.UpdatedTrustedContactsResponse;
import com.yandex.go.trusted_contacts.domain.entities.RenderedContactState;
import com.yandex.go.trusted_contacts.domain.entities.TrustedContactsMode;
import defpackage.avj0;
import defpackage.cyi0;
import defpackage.i47;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.myh0;
import defpackage.ny61;
import defpackage.og11;
import defpackage.u7q0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Log11;", "<anonymous>", "(Log11;)Log11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$updateContact$2$1$1", f = "TrustedContactsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$updateContact$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ UpdatedTrustedContactsResponse $response;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsRepository$updateContact$2$1$1(a aVar, UpdatedTrustedContactsResponse updatedTrustedContactsResponse, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = updatedTrustedContactsResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrustedContactsRepository$updateContact$2$1$1 trustedContactsRepository$updateContact$2$1$1 = new TrustedContactsRepository$updateContact$2$1$1(this.this$0, this.$response, continuation);
        trustedContactsRepository$updateContact$2$1$1.L$0 = obj;
        return trustedContactsRepository$updateContact$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsRepository$updateContact$2$1$1) create((og11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        og11 og11Var = (og11) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        i47 i47Var = this.this$0.c;
        UpdatedTrustedContactsResponse updatedTrustedContactsResponse = this.$response;
        i47Var.getClass();
        TrustedContactDto trustedContactDto = updatedTrustedContactsResponse.a;
        ShareSettingsDto shareSettingsDto = og11Var.e;
        u7q0 u7q0Var = og11Var.c;
        Iterator it = shareSettingsDto.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((ShareSettingsOption) obj2).a, trustedContactDto.d)) {
                break;
            }
        }
        ShareSettingsOption shareSettingsOption = (ShareSettingsOption) obj2;
        String str = shareSettingsOption != null ? shareSettingsOption.b : null;
        String str2 = trustedContactDto.b;
        String str3 = trustedContactDto.c;
        if (str != null) {
            str3 = ((avj0) i47Var.b).i(myh0.trusted_contacts_subtitle_template, str3, str);
        }
        cyi0 cyi0Var = new cyi0(str2, str3, RenderedContactState.DEFAULT, trustedContactDto);
        ArrayList arrayList = new ArrayList(u7q0Var.b);
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                arrayList.add(cyi0Var);
                break;
            }
            int i2 = i + 1;
            if (jl40.l(((TrustedContactDto) ((cyi0) it2.next()).d).a, updatedTrustedContactsResponse.a.a)) {
                arrayList.set(i, cyi0Var);
                break;
            }
            i = i2;
        }
        return og11.a(og11Var, TrustedContactsMode.DEFAULT, u7q0.a(u7q0Var, arrayList), null, null, 122);
    }
}
