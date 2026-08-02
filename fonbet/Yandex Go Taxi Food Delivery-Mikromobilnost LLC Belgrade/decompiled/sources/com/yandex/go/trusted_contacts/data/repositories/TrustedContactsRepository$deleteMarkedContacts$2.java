package com.yandex.go.trusted_contacts.data.repositories;

import com.yandex.go.trusted_contacts.data.api.TrustedContactsApi;
import com.yandex.go.trusted_contacts.data.entities.network.DeleteTrustedContactsRequest;
import com.yandex.go.trusted_contacts.data.entities.network.DeletedTrustedContactsResponse;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustingContactDto;
import com.yandex.go.trusted_contacts.domain.entities.RenderedContactState;
import defpackage.cmt;
import defpackage.cyi0;
import defpackage.ish;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.og11;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Log11;", "<anonymous>", "(Ltse;)Log11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$deleteMarkedContacts$2", f = "TrustedContactsRepository.kt", l = {HProv.ALG_SID_SHA_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$deleteMarkedContacts$2 extends SuspendLambda implements wls {
    final /* synthetic */ og11 $this_deleteMarkedContacts;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsRepository$deleteMarkedContacts$2(og11 og11Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$this_deleteMarkedContacts = og11Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrustedContactsRepository$deleteMarkedContacts$2(this.$this_deleteMarkedContacts, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsRepository$deleteMarkedContacts$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ArrayList<cyi0> arrayList = this.$this_deleteMarkedContacts.c.b;
            ArrayList arrayList2 = new ArrayList();
            for (cyi0 cyi0Var : arrayList) {
                String str = cyi0Var.c == RenderedContactState.DELETED ? ((TrustedContactDto) cyi0Var.d).a : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ArrayList<cyi0> arrayList3 = this.$this_deleteMarkedContacts.d.b;
            ArrayList arrayList4 = new ArrayList();
            for (cyi0 cyi0Var2 : arrayList3) {
                String str2 = cyi0Var2.c == RenderedContactState.DELETED ? ((TrustingContactDto) cyi0Var2.d).a : null;
                if (str2 != null) {
                    arrayList4.add(str2);
                }
            }
            DeleteTrustedContactsRequest deleteTrustedContactsRequest = new DeleteTrustedContactsRequest(arrayList2, arrayList4);
            if (arrayList2.isEmpty() && arrayList4.isEmpty()) {
                ish ishVar = this.this$0.b;
                og11 og11Var = this.$this_deleteMarkedContacts;
                DeletedTrustedContactsResponse deletedTrustedContactsResponse = new DeletedTrustedContactsResponse(0);
                ishVar.getClass();
                return ish.a(og11Var, deletedTrustedContactsResponse);
            }
            cmt<DeletedTrustedContactsResponse> b = ((TrustedContactsApi) this.this$0.h.getValue()).b(deleteTrustedContactsRequest);
            this.L$0 = null;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.d(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ish ishVar2 = this.this$0.b;
        og11 og11Var2 = this.$this_deleteMarkedContacts;
        ishVar2.getClass();
        return ish.a(og11Var2, (DeletedTrustedContactsResponse) obj);
    }
}
