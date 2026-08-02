package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.ValidateCommentRequestDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.PopupOptionsDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.RedirectionRuleDto$Redirect;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.ValidateCommentResponseDto;
import defpackage.g92;
import defpackage.ha2;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pmc;
import defpackage.rmc;
import defpackage.ski0;
import defpackage.smc;
import defpackage.umc;
import defpackage.vki0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wki0;
import defpackage.wls;
import defpackage.xki0;
import defpackage.zki0;
import defpackage.zmc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ltmc;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.CommentValidationStateInteractor$validateComment$1", f = "CommentValidationStateInteractor.kt", l = {82, HProv.ALG_SID_NO_HASH, 85, HProv.ALG_SID_KECCAK_224, 91}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CommentValidationStateInteractor$validateComment$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $input;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ zmc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentValidationStateInteractor$validateComment$1(zmc zmcVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zmcVar;
        this.$input = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CommentValidationStateInteractor$validateComment$1 commentValidationStateInteractor$validateComment$1 = new CommentValidationStateInteractor$validateComment$1(this.this$0, this.$input, continuation);
        commentValidationStateInteractor$validateComment$1.L$0 = obj;
        return commentValidationStateInteractor$validateComment$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CommentValidationStateInteractor$validateComment$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f3, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0168, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0166, code lost:
    
        if (r1.emit(r5, r18) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r3 == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
    
        if (r3 == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0057, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L54;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object y;
        Object a;
        zki0 wki0Var;
        pmc pmcVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            smc smcVar = smc.a;
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            kotlin.b.b(obj);
            y = obj;
            com.yandex.go.requirements.comment.summary.ui.v3.data.a aVar = this.this$0.d;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 3;
            a = aVar.a((ValidateCommentRequestDto) y, this);
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = obj;
            ValidateCommentResponseDto validateCommentResponseDto = (ValidateCommentResponseDto) a;
            zmc zmcVar = this.this$0;
            if (validateCommentResponseDto == null) {
                int i2 = zmc.h;
                zmcVar.getClass();
                rmc a2 = zmc.a();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
            } else {
                umc umcVar = zmcVar.e;
                PopupOptionsDto popupOptionsDto = validateCommentResponseDto.a;
                if (popupOptionsDto == null) {
                    pmcVar = new pmc(new wki0(null, null));
                } else {
                    String str = popupOptionsDto.b;
                    String str2 = popupOptionsDto.a;
                    if (str2 == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    String str3 = popupOptionsDto.c.a;
                    com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.g gVar = popupOptionsDto.d;
                    if (jl40.l(gVar, com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.f.INSTANCE)) {
                        wki0Var = xki0.a;
                    } else if (jl40.l(gVar, com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.d.INSTANCE)) {
                        wki0Var = vki0.a;
                    } else if (jl40.l(gVar, com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.c.INSTANCE)) {
                        wki0Var = ski0.a;
                    } else {
                        if (!(gVar instanceof RedirectionRuleDto$Redirect)) {
                            w511.b();
                            return null;
                        }
                        RedirectionRuleDto$Redirect redirectionRuleDto$Redirect = (RedirectionRuleDto$Redirect) gVar;
                        wki0Var = new wki0(redirectionRuleDto$Redirect.a, redirectionRuleDto$Redirect.b);
                    }
                    pmcVar = new pmc(str, str2, str3, wki0Var);
                }
                rmc rmcVar = new rmc(pmcVar);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
            }
        }
        zmc zmcVar2 = this.this$0;
        ha2 l = kotlinx.coroutines.flow.e.l(new h(new f(zmcVar2.c.c.k())), new d(new g92(2, zmcVar2.c.a.a.c())), new j(((com.yandex.go.taxi.tariffs.internal.repository.k) zmcVar2.c.b).j.b()), new l(((com.yandex.go.taxi.tariffs.internal.repository.k) zmcVar2.c.b).j.b()), zmcVar2.c.a(), new CommentValidationStateInteractor$requestParamFlow$1(this.$input, null));
        this.L$0 = vprVar;
        this.label = 2;
        y = kotlinx.coroutines.flow.e.y(l, this);
    }
}
