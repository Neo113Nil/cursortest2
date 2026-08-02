package com.yandex.go.sharing_personal_goals.data.mapper;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.qqr0;
import defpackage.sqr0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsqr0;", "<anonymous>", "(Ltse;)Lsqr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.data.mapper.SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2", f = "SharingPersonalGoalsMapper.kt", l = {229, 230, 233}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2 extends SuspendLambda implements wls {
    final /* synthetic */ SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Modal $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2(a aVar, SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Modal modal, Continuation continuation) {
        super(2, continuation);
        this.$response = modal;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2 sharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2 = new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2(this.this$0, this.$response, continuation);
        sharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2.L$0 = obj;
        return sharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        CharSequence charSequence;
        noh nohVar;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        String str2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        String str3;
        String str4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        qqr0 qqr0Var = null;
        if (i == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2$titleAsync$1(this.this$0, this.$response, null), 3);
            h = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2$subtitleAsync$1(this.this$0, this.$response, null), 3);
            SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Button button = this.$response.e;
            h2 = button != null ? tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingMissionsPromoblockCompletedModal$2$buttonAsync$1$1(this.this$0, button, null), 3) : null;
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
                    str3 = (String) this.L$7;
                    str4 = (String) this.L$6;
                    charSequence4 = (CharSequence) this.L$5;
                    charSequence5 = (CharSequence) this.L$4;
                    b.b(obj);
                    qqr0Var = (qqr0) obj;
                    str = str3;
                    str2 = str4;
                    charSequence2 = charSequence4;
                    charSequence3 = charSequence5;
                    return new sqr0(charSequence3, charSequence2, str2, str, qqr0Var);
                }
                charSequence = (CharSequence) this.L$4;
                nohVar = (noh) this.L$3;
                b.b(obj);
                CharSequence charSequence6 = (CharSequence) obj;
                SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Modal modal = this.$response;
                String str5 = modal.c;
                String str6 = modal.d;
                if (nohVar != null) {
                    charSequence2 = charSequence6;
                    charSequence3 = charSequence;
                    str = str6;
                    str2 = str5;
                    return new sqr0(charSequence3, charSequence2, str2, str, qqr0Var);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = charSequence;
                this.L$5 = charSequence6;
                this.L$6 = str5;
                this.L$7 = str6;
                this.label = 3;
                Object k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    charSequence4 = charSequence6;
                    charSequence5 = charSequence;
                    str3 = str6;
                    str4 = str5;
                    obj = k;
                    qqr0Var = (qqr0) obj;
                    str = str3;
                    str2 = str4;
                    charSequence2 = charSequence4;
                    charSequence3 = charSequence5;
                    return new sqr0(charSequence3, charSequence2, str2, str, qqr0Var);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        CharSequence charSequence7 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = charSequence7;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            noh nohVar2 = h2;
            charSequence = charSequence7;
            obj = k2;
            nohVar = nohVar2;
            CharSequence charSequence62 = (CharSequence) obj;
            SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Modal modal2 = this.$response;
            String str52 = modal2.c;
            String str62 = modal2.d;
            if (nohVar != null) {
            }
        }
        return coroutineSingletons;
    }
}
