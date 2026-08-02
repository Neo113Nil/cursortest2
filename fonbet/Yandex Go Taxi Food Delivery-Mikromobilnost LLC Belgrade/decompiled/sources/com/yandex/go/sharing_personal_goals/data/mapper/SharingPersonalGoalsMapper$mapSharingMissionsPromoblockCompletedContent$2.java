package com.yandex.go.sharing_personal_goals.data.mapper;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockBadgeDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oqr0;
import defpackage.qoh;
import defpackage.rqr0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrqr0;", "<anonymous>", "(Ltse;)Lrqr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.data.mapper.SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2", f = "SharingPersonalGoalsMapper.kt", l = {210, 211, 213}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2 extends SuspendLambda implements wls {
    final /* synthetic */ SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Content $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2(a aVar, SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Content content, Continuation continuation) {
        super(2, continuation);
        this.$response = content;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2 sharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2 = new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2(this.this$0, this.$response, continuation);
        sharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2.L$0 = obj;
        return sharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        CharSequence charSequence3;
        String str2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        oqr0 oqr0Var = null;
        if (i == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2$titleAsync$1(this.this$0, this.$response, null), 3);
            h = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2$subtitleAsync$1(this.this$0, this.$response, null), 3);
            SharingPersonalGoalsPromoblockBadgeDto sharingPersonalGoalsPromoblockBadgeDto = this.$response.d;
            h2 = sharingPersonalGoalsPromoblockBadgeDto != null ? tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedContent$2$badgeAsync$1$1(this.this$0, sharingPersonalGoalsPromoblockBadgeDto, null), 3) : null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.L$6;
                    charSequence3 = (CharSequence) this.L$5;
                    charSequence = (CharSequence) this.L$4;
                    b.b(obj);
                    oqr0Var = (oqr0) obj;
                    str = str2;
                    charSequence2 = charSequence3;
                    return new rqr0(charSequence, charSequence2, str, oqr0Var);
                }
                CharSequence charSequence4 = (CharSequence) this.L$4;
                noh nohVar = (noh) this.L$3;
                b.b(obj);
                charSequence = charSequence4;
                h2 = nohVar;
                charSequence2 = (CharSequence) obj;
                str = this.$response.c;
                if (h2 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = charSequence;
                    this.L$5 = charSequence2;
                    this.L$6 = str;
                    this.label = 3;
                    Object k = h2.k(this);
                    if (k != coroutineSingletons) {
                        charSequence3 = charSequence2;
                        str2 = str;
                        obj = k;
                        oqr0Var = (oqr0) obj;
                        str = str2;
                        charSequence2 = charSequence3;
                    }
                    return coroutineSingletons;
                }
                return new rqr0(charSequence, charSequence2, str, oqr0Var);
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        CharSequence charSequence5 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = charSequence5;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            charSequence = charSequence5;
            obj = k2;
            charSequence2 = (CharSequence) obj;
            str = this.$response.c;
            if (h2 != null) {
            }
            return new rqr0(charSequence, charSequence2, str, oqr0Var);
        }
        return coroutineSingletons;
    }
}
