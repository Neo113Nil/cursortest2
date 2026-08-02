package com.yandex.go.promocodes.referral.impl.data;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "canShowReferrals", "isBadgeButtonAvailable", "referralGiftExperiment", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/navigation/screen/api/Screen;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.promocodes.referral.impl.data.ReferralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1", f = "ReferralGiftStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ReferralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1(c cVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        ReferralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1 referralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1 = new ReferralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1(this.this$0, (Continuation) obj5);
        referralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1.Z$0 = booleanValue;
        referralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1.Z$1 = booleanValue2;
        referralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1.Z$2 = booleanValue3;
        referralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1.L$0 = (Screen) obj4;
        return referralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        Screen screen = (Screen) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z4 = false;
        boolean z5 = screen == Screen.SUMMARY;
        boolean z6 = screen == Screen.WHERE_YOU_ARE;
        if (z3 && z && ((!z5 || !z2) && !z6)) {
            List list = this.this$0.c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (screen == ((Screen) it.next())) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z4);
    }
}
