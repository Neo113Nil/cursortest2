package com.yandex.go.ultima_mode.ui.progress_bar.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.ief;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ov11;
import defpackage.pv11;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqv11;", "<anonymous>", "(Ltse;)Lqv11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.ui.progress_bar.state.UltimaModeProgressBarUiStateMapper$map$2", f = "UltimaModeProgressBarUiStateMapper.kt", l = {33, 34, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UltimaModeProgressBarUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ ief $currencyRulesDto;
    final /* synthetic */ UltimaModeResponse.ProgressBar $dto;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UltimaModeProgressBarUiStateMapper$map$2(ief iefVar, UltimaModeResponse.ProgressBar progressBar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$dto = progressBar;
        this.this$0 = aVar;
        this.$currencyRulesDto = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UltimaModeProgressBarUiStateMapper$map$2 ultimaModeProgressBarUiStateMapper$map$2 = new UltimaModeProgressBarUiStateMapper$map$2(this.$currencyRulesDto, this.$dto, this.this$0, continuation);
        ultimaModeProgressBarUiStateMapper$map$2.L$0 = obj;
        return ultimaModeProgressBarUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UltimaModeProgressBarUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        if (r5 == r2) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fc  */
    /* JADX WARN: Type inference failed for: r3v9, types: [noh] */
    /* JADX WARN: Type inference failed for: r5v5, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v5, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        Object s;
        qoh qohVar;
        int i;
        CharSequence charSequence;
        Object k;
        Object k2;
        CharSequence charSequence2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            UltimaModeResponse.ProgressBar progressBar = this.$dto;
            if (progressBar == null) {
                return pv11.a;
            }
            qoh h2 = tje.h(tseVar, null, null, new UltimaModeProgressBarUiStateMapper$map$2$subtitleText$1(this.$currencyRulesDto, progressBar, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new UltimaModeProgressBarUiStateMapper$map$2$subtitleTrail$1(this.$currencyRulesDto, this.$dto, this.this$0, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new UltimaModeProgressBarUiStateMapper$map$2$subtitleBottomText$1(this.$currencyRulesDto, this.$dto, this.this$0, null), 3);
            int i3 = this.$dto.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h3;
            this.I$0 = i3;
            this.label = 1;
            s = h2.s(this);
            if (s != coroutineSingletons) {
                qohVar = h3;
                i = i3;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                CharSequence charSequence3 = (CharSequence) this.L$5;
                charSequence = (CharSequence) this.L$4;
                b.b(obj);
                k2 = obj;
                charSequence2 = charSequence3;
                int i4 = i;
                CharSequence charSequence4 = charSequence;
                CharSequence charSequence5 = (CharSequence) k2;
                UltimaModeResponse.ProgressBar progressBar2 = this.$dto;
                String str = progressBar2.a;
                UltimaModeResponse.ProgressBar.ProgressBarSubtitle progressBarSubtitle = progressBar2.c;
                return new ov11(i4, charSequence4, charSequence2, charSequence5, str, progressBarSubtitle == null ? progressBarSubtitle.a : null, progressBarSubtitle != null ? progressBarSubtitle.d : null);
            }
            i = this.I$0;
            charSequence = (CharSequence) this.L$4;
            ?? r5 = (noh) this.L$3;
            b.b(obj);
            qohVar = r5;
            k = obj;
            CharSequence charSequence6 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence6;
            this.I$0 = i;
            this.label = 3;
            k2 = qohVar.k(this);
            if (k2 != coroutineSingletons) {
                charSequence2 = charSequence6;
                int i42 = i;
                CharSequence charSequence42 = charSequence;
                CharSequence charSequence52 = (CharSequence) k2;
                UltimaModeResponse.ProgressBar progressBar22 = this.$dto;
                String str2 = progressBar22.a;
                UltimaModeResponse.ProgressBar.ProgressBarSubtitle progressBarSubtitle2 = progressBar22.c;
                return new ov11(i42, charSequence42, charSequence2, charSequence52, str2, progressBarSubtitle2 == null ? progressBarSubtitle2.a : null, progressBarSubtitle2 != null ? progressBarSubtitle2.d : null);
            }
            return coroutineSingletons;
        }
        i = this.I$0;
        ?? r3 = (noh) this.L$3;
        ?? r6 = (noh) this.L$2;
        b.b(obj);
        h = r6;
        qohVar = r3;
        s = obj;
        charSequence = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = qohVar;
        this.L$4 = charSequence;
        this.I$0 = i;
        this.label = 2;
        k = h.k(this);
    }
}
