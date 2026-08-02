package com.yandex.go.sharing_personal_goals.data.mapper;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockBadgeDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress;
import com.yandex.go.sharing_personal_goals.data.model.z;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oqr0;
import defpackage.prr0;
import defpackage.qoh;
import defpackage.qrr0;
import defpackage.rqr0;
import defpackage.rrr0;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsrr0;", "<anonymous>", "(Ltse;)Lsrr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.data.mapper.SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2", f = "SharingPersonalGoalsMapper.kt", l = {160, 161, HProv.PP_HANDLE_COUNT, HProv.PP_EXPORT_CSP, 173, 189, 190}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2 extends SuspendLambda implements wls {
    final /* synthetic */ SharingPersonalGoalsPromoblockDto $response;
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
    public SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2(SharingPersonalGoalsPromoblockDto sharingPersonalGoalsPromoblockDto, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$response = sharingPersonalGoalsPromoblockDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2 sharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2 = new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2(this.$response, this.this$0, continuation);
        sharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2.L$0 = obj;
        return sharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0177, code lost:
    
        if (r2 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e2, code lost:
    
        if (r11 == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z zVar;
        noh h;
        rqr0 rqr0Var;
        noh h2;
        Object s;
        noh h3;
        z zVar2;
        noh nohVar;
        Object k;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        CharSequence charSequence3;
        String str2;
        z zVar3;
        CharSequence charSequence4;
        rqr0 rqr0Var2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        oqr0 oqr0Var = null;
        sqr0 sqr0Var = null;
        switch (this.label) {
            case 0:
                b.b(obj);
                zVar = this.$response.a;
                if (zVar instanceof SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept) {
                    qoh h4 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$titleAsync$1(this.this$0, zVar, null), 3);
                    qoh h5 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$subtitleAsync$1(this.this$0, zVar, null), 3);
                    SharingPersonalGoalsPromoblockBadgeDto sharingPersonalGoalsPromoblockBadgeDto = ((SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept) zVar).d;
                    h3 = sharingPersonalGoalsPromoblockBadgeDto != null ? tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$badgeAsync$1$1(this.this$0, sharingPersonalGoalsPromoblockBadgeDto, null), 3) : null;
                    this.L$0 = null;
                    this.L$1 = zVar;
                    this.L$2 = null;
                    this.L$3 = h5;
                    this.L$4 = h3;
                    this.label = 1;
                    Object s2 = h4.s(this);
                    if (s2 != coroutineSingletons) {
                        zVar2 = zVar;
                        obj = s2;
                        nohVar = h5;
                        CharSequence charSequence5 = (CharSequence) obj;
                        this.L$0 = null;
                        this.L$1 = zVar2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = h3;
                        this.L$5 = charSequence5;
                        this.label = 2;
                        k = nohVar.k(this);
                        if (k != coroutineSingletons) {
                            charSequence = charSequence5;
                            obj = k;
                            charSequence2 = (CharSequence) obj;
                            str = ((SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept) zVar2).c;
                            if (h3 != null) {
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = charSequence;
                                this.L$6 = charSequence2;
                                this.L$7 = str;
                                this.label = 3;
                                Object k2 = h3.k(this);
                                if (k2 != coroutineSingletons) {
                                    charSequence3 = charSequence2;
                                    str2 = str;
                                    obj = k2;
                                    oqr0Var = (oqr0) obj;
                                    str = str2;
                                    charSequence2 = charSequence3;
                                }
                            }
                            return new prr0(charSequence, charSequence2, str, oqr0Var);
                        }
                    }
                } else if (zVar instanceof SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress) {
                    qoh h6 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$titleAsync$2(this.this$0, zVar, null), 3);
                    h2 = tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$subtitleAsync$2(this.this$0, zVar, null), 3);
                    this.L$0 = null;
                    this.L$1 = zVar;
                    this.L$2 = null;
                    this.L$3 = h2;
                    this.label = 4;
                    s = h6.s(this);
                    break;
                } else {
                    if (!(zVar instanceof SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed)) {
                        return null;
                    }
                    SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed sharingPersonalGoalsPromoblockDto$PromoblockDto$Completed = (SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed) zVar;
                    SharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.Content content = sharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.a;
                    qoh h7 = content != null ? tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$contentAsync$1$1(this.this$0, content, null), 3) : null;
                    h = sharingPersonalGoalsPromoblockDto$PromoblockDto$Completed.b != null ? tje.h(tseVar, null, null, new SharingPersonalGoalsMapper$mapSharingPersonalGoalsPromoblock$2$modalAsync$1$1(this.this$0, zVar, null), 3) : null;
                    if (h7 == null) {
                        rqr0Var = null;
                        if (h != null) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = rqr0Var;
                            this.label = 7;
                            Object k3 = h.k(this);
                            if (k3 != coroutineSingletons) {
                                rqr0Var2 = rqr0Var;
                                obj = k3;
                                sqr0Var = (sqr0) obj;
                                rqr0Var = rqr0Var2;
                            }
                        }
                        return new qrr0(rqr0Var, sqr0Var);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = h;
                    this.label = 6;
                    obj = h7.s(this);
                    break;
                }
                return coroutineSingletons;
            case 1:
                h3 = (noh) this.L$4;
                nohVar = (noh) this.L$3;
                zVar2 = (z) this.L$1;
                b.b(obj);
                CharSequence charSequence52 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = zVar2;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h3;
                this.L$5 = charSequence52;
                this.label = 2;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                CharSequence charSequence6 = (CharSequence) this.L$5;
                noh nohVar2 = (noh) this.L$4;
                zVar2 = (z) this.L$1;
                b.b(obj);
                charSequence = charSequence6;
                h3 = nohVar2;
                charSequence2 = (CharSequence) obj;
                str = ((SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept) zVar2).c;
                if (h3 != null) {
                }
                return new prr0(charSequence, charSequence2, str, oqr0Var);
            case 3:
                str2 = (String) this.L$7;
                charSequence3 = (CharSequence) this.L$6;
                charSequence = (CharSequence) this.L$5;
                b.b(obj);
                oqr0Var = (oqr0) obj;
                str = str2;
                charSequence2 = charSequence3;
                return new prr0(charSequence, charSequence2, str, oqr0Var);
            case 4:
                h2 = (noh) this.L$3;
                z zVar4 = (z) this.L$1;
                b.b(obj);
                s = obj;
                zVar = zVar4;
                CharSequence charSequence7 = (CharSequence) s;
                this.L$0 = null;
                this.L$1 = zVar;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = charSequence7;
                this.label = 5;
                Object k4 = h2.k(this);
                if (k4 != coroutineSingletons) {
                    z zVar5 = zVar;
                    obj = k4;
                    zVar3 = zVar5;
                    charSequence4 = charSequence7;
                    SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress sharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress = (SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress) zVar3;
                    return new rrr0(charSequence4, (CharSequence) obj, sharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress.c, sharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress.d, sharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress.e);
                }
                return coroutineSingletons;
            case 5:
                CharSequence charSequence8 = (CharSequence) this.L$4;
                zVar3 = (z) this.L$1;
                b.b(obj);
                charSequence4 = charSequence8;
                SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress sharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress2 = (SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress) zVar3;
                return new rrr0(charSequence4, (CharSequence) obj, sharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress2.c, sharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress2.d, sharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress2.e);
            case 6:
                h = (noh) this.L$3;
                b.b(obj);
                rqr0Var = (rqr0) obj;
                if (h != null) {
                }
                return new qrr0(rqr0Var, sqr0Var);
            case 7:
                rqr0Var2 = (rqr0) this.L$4;
                b.b(obj);
                sqr0Var = (sqr0) obj;
                rqr0Var = rqr0Var2;
                return new qrr0(rqr0Var, sqr0Var);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
