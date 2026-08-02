package com.yandex.go.trusted_contacts.share_settings;

import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.trusted_contacts.data.entities.network.EditContactNameConfigDto;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsDto;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsOption;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsSwitches;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import defpackage.bms;
import defpackage.mvg;
import defpackage.nlr0;
import defpackage.ny61;
import defpackage.qkr0;
import defpackage.rcc;
import defpackage.scc;
import defpackage.skr0;
import defpackage.slr0;
import defpackage.tcc;
import defpackage.tkr0;
import defpackage.tlr0;
import defpackage.ulr0;
import defpackage.vlr0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactDto;", "currentTrustedContact", "Lcom/yandex/go/trusted_contacts/data/entities/network/ShareSettingsDto;", "shareSetting", "Lskr0;", "contactData", "Lxlr0;", "<anonymous>", "(Lcom/yandex/go/trusted_contacts/data/entities/network/TrustedContactDto;Lcom/yandex/go/trusted_contacts/data/entities/network/ShareSettingsDto;Lskr0;)Lxlr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.share_settings.ShareSettingsPresenter$loadContact$1", f = "ShareSettingsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ShareSettingsPresenter$loadContact$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSettingsPresenter$loadContact$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ShareSettingsPresenter$loadContact$1 shareSettingsPresenter$loadContact$1 = new ShareSettingsPresenter$loadContact$1(this.this$0, (Continuation) obj4);
        shareSettingsPresenter$loadContact$1.L$0 = (TrustedContactDto) obj;
        shareSettingsPresenter$loadContact$1.L$1 = (ShareSettingsDto) obj2;
        shareSettingsPresenter$loadContact$1.L$2 = (skr0) obj3;
        return shareSettingsPresenter$loadContact$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrustedContactDto trustedContactDto = (TrustedContactDto) this.L$0;
        ShareSettingsDto shareSettingsDto = (ShareSettingsDto) this.L$1;
        skr0 skr0Var = (skr0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.z.getClass();
        ListBuilder a = rcc.a();
        EditContactNameConfigDto editContactNameConfigDto = shareSettingsDto.f;
        List list = shareSettingsDto.e;
        a.add(new tkr0(trustedContactDto, editContactNameConfigDto));
        a.add(new ulr0(shareSettingsDto.a));
        a.add(new slr0(shareSettingsDto.b));
        List<ShareSettingsOption> list2 = shareSettingsDto.d;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (ShareSettingsOption shareSettingsOption : list2) {
            String str = skr0Var.a;
            if (str == null) {
                str = shareSettingsDto.c;
            }
            arrayList.add(new nlr0(str, shareSettingsOption));
        }
        a.addAll(arrayList);
        if (!list.isEmpty()) {
            a.add(new qkr0(CardDivider.Type.BOTH));
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            int i = 0;
            for (Object obj2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                ShareSettingsSwitches shareSettingsSwitches = (ShareSettingsSwitches) obj2;
                List list4 = skr0Var.b;
                arrayList2.add(new tlr0(new ShareSettingsSwitches(shareSettingsSwitches.a, shareSettingsSwitches.b, list4 != null ? list4.contains(shareSettingsSwitches.a) : shareSettingsSwitches.c), i != scc.f(list)));
                i = i2;
            }
            a.addAll(arrayList2);
        }
        return new vlr0(a.j());
    }
}
