package com.yandex.go.trusted_contacts.data.repositories;

import com.yandex.go.trusted_contacts.data.api.TrustedContactsApi;
import com.yandex.go.trusted_contacts.data.entities.network.ScreenConfigDto;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsOption;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsResponse;
import com.yandex.go.trusted_contacts.data.entities.network.TrustingContactDto;
import com.yandex.go.trusted_contacts.domain.entities.RenderedContactState;
import com.yandex.go.trusted_contacts.domain.entities.TrustedContactsMode;
import defpackage.avj0;
import defpackage.cmt;
import defpackage.cyi0;
import defpackage.gsh;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.myh0;
import defpackage.ny61;
import defpackage.og11;
import defpackage.tcc;
import defpackage.tls;
import defpackage.u7q0;
import defpackage.yg11;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Log11;", "<anonymous>", "()Log11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$loadTrustedContactsInfo$2", f = "TrustedContactsRepository.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$loadTrustedContactsInfo$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsRepository$loadTrustedContactsInfo$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TrustedContactsRepository$loadTrustedContactsInfo$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TrustedContactsRepository$loadTrustedContactsInfo$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            b.b(obj);
            cmt<TrustedContactsResponse> c = ((TrustedContactsApi) this.this$0.h.getValue()).c();
            this.label = 1;
            d = ru.yandex.taxi.network.api.a.d(c, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = obj;
        }
        TrustedContactsResponse trustedContactsResponse = (TrustedContactsResponse) d;
        yg11 yg11Var = this.this$0.a;
        yg11Var.getClass();
        TrustedContactsMode trustedContactsMode = TrustedContactsMode.DEFAULT;
        int i2 = trustedContactsResponse.a;
        ScreenConfigDto screenConfigDto = trustedContactsResponse.e;
        String str2 = screenConfigDto.a;
        List<TrustedContactDto> list = trustedContactsResponse.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (TrustedContactDto trustedContactDto : list) {
            Iterator it = trustedContactsResponse.d.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = str;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((ShareSettingsOption) obj2).a, trustedContactDto.d)) {
                    break;
                }
            }
            ShareSettingsOption shareSettingsOption = (ShareSettingsOption) obj2;
            String str3 = shareSettingsOption != null ? shareSettingsOption.b : str;
            String str4 = trustedContactDto.b;
            String str5 = trustedContactDto.c;
            if (str3 != null) {
                str5 = ((avj0) yg11Var.a).i(myh0.trusted_contacts_subtitle_template, str5, str3);
            }
            arrayList.add(new cyi0(str4, str5, RenderedContactState.DEFAULT, trustedContactDto));
            str = null;
        }
        u7q0 u7q0Var = new u7q0(str2, arrayList);
        String str6 = screenConfigDto.b;
        List<TrustingContactDto> list2 = trustedContactsResponse.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (TrustingContactDto trustingContactDto : list2) {
            arrayList2.add(new cyi0(trustingContactDto.b, trustingContactDto.c, RenderedContactState.DEFAULT, trustingContactDto));
        }
        return new og11(trustedContactsMode, i2, u7q0Var, new u7q0(str6, arrayList2), trustedContactsResponse.d, trustedContactsResponse.f, new gsh(0));
    }
}
