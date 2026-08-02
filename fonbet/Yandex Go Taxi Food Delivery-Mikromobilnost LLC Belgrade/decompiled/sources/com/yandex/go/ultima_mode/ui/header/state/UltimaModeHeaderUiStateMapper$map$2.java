package com.yandex.go.ultima_mode.ui.header.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import com.yandex.go.ultima_mode.api.data.e;
import defpackage.dv11;
import defpackage.ev11;
import defpackage.ief;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.su11;
import defpackage.tje;
import defpackage.tse;
import defpackage.vu11;
import defpackage.wls;
import defpackage.yu11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfv11;", "<anonymous>", "(Ltse;)Lfv11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.ui.header.state.UltimaModeHeaderUiStateMapper$map$2", f = "UltimaModeHeaderUiStateMapper.kt", l = {42, 44, 46}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UltimaModeHeaderUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ ief $currencyRulesDto;
    final /* synthetic */ UltimaModeResponse.Subtitle $subtitleDto;
    final /* synthetic */ UltimaModeResponse.Title $titleDto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UltimaModeHeaderUiStateMapper$map$2(UltimaModeResponse.Title title, UltimaModeResponse.Subtitle subtitle, a aVar, ief iefVar, Continuation continuation) {
        super(2, continuation);
        this.$titleDto = title;
        this.$subtitleDto = subtitle;
        this.this$0 = aVar;
        this.$currencyRulesDto = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UltimaModeHeaderUiStateMapper$map$2 ultimaModeHeaderUiStateMapper$map$2 = new UltimaModeHeaderUiStateMapper$map$2(this.$titleDto, this.$subtitleDto, this.this$0, this.$currencyRulesDto, continuation);
        ultimaModeHeaderUiStateMapper$map$2.L$0 = obj;
        return ultimaModeHeaderUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UltimaModeHeaderUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x013f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vu11 vu11Var;
        vu11 vu11Var2;
        noh nohVar;
        noh nohVar2;
        vu11 vu11Var3;
        e eVar;
        e eVar2;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        String str;
        Object k;
        CharSequence charSequence;
        UiStateDrawableWrapper uiStateDrawableWrapper2;
        vu11 vu11Var4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            UltimaModeResponse.Title title = this.$titleDto;
            if (title == null) {
                return ev11.a;
            }
            qoh h = tje.h(tseVar, null, null, new UltimaModeHeaderUiStateMapper$map$2$titleDrawable$1(this.this$0, title, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new UltimaModeHeaderUiStateMapper$map$2$subtitle$1(this.this$0, this.$subtitleDto, this.$currencyRulesDto, null), 3);
            UltimaModeResponse.Subtitle subtitle = this.$subtitleDto;
            vu11 vu11Var5 = su11.a;
            if (subtitle == null || (eVar2 = subtitle.b) == null) {
                vu11Var = vu11Var5;
            } else {
                this.this$0.c.getClass();
                vu11Var = yu11.b(eVar2);
            }
            qoh h3 = tje.h(tseVar, null, null, new UltimaModeHeaderUiStateMapper$map$2$titleTrail$1(this.this$0, this.$titleDto, this.$currencyRulesDto, null), 3);
            UltimaModeResponse.Title.Trail trail = this.$titleDto.b;
            if (trail != null && (eVar = trail.b) != null) {
                this.this$0.c.getClass();
                vu11Var5 = yu11.b(eVar);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = vu11Var;
            this.L$4 = h3;
            this.L$5 = vu11Var5;
            this.label = 1;
            obj = h.s(this);
            if (obj != coroutineSingletons) {
                vu11Var2 = vu11Var;
                nohVar = h2;
                nohVar2 = h3;
                vu11Var3 = vu11Var5;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vu11Var3 = (vu11) this.L$9;
                CharSequence charSequence2 = (CharSequence) this.L$8;
                str = (String) this.L$7;
                UiStateDrawableWrapper uiStateDrawableWrapper3 = (UiStateDrawableWrapper) this.L$6;
                vu11 vu11Var6 = (vu11) this.L$3;
                b.b(obj);
                charSequence = charSequence2;
                uiStateDrawableWrapper2 = uiStateDrawableWrapper3;
                vu11Var4 = vu11Var6;
                return new dv11(uiStateDrawableWrapper2, str, charSequence, vu11Var3, (CharSequence) obj, vu11Var4);
            }
            String str2 = (String) this.L$7;
            UiStateDrawableWrapper uiStateDrawableWrapper4 = (UiStateDrawableWrapper) this.L$6;
            vu11 vu11Var7 = (vu11) this.L$5;
            vu11Var2 = (vu11) this.L$3;
            nohVar = (noh) this.L$2;
            b.b(obj);
            str = str2;
            vu11Var3 = vu11Var7;
            uiStateDrawableWrapper = uiStateDrawableWrapper4;
            CharSequence charSequence3 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = vu11Var2;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = uiStateDrawableWrapper;
            this.L$7 = str;
            this.L$8 = charSequence3;
            this.L$9 = vu11Var3;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
                charSequence = charSequence3;
                uiStateDrawableWrapper2 = uiStateDrawableWrapper;
                vu11Var4 = vu11Var2;
                obj = k;
                return new dv11(uiStateDrawableWrapper2, str, charSequence, vu11Var3, (CharSequence) obj, vu11Var4);
            }
            return coroutineSingletons;
        }
        vu11Var3 = (vu11) this.L$5;
        nohVar2 = (noh) this.L$4;
        vu11Var2 = (vu11) this.L$3;
        nohVar = (noh) this.L$2;
        b.b(obj);
        UiStateDrawableWrapper uiStateDrawableWrapper5 = (UiStateDrawableWrapper) obj;
        String str3 = this.$titleDto.c;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = nohVar;
        this.L$3 = vu11Var2;
        this.L$4 = null;
        this.L$5 = vu11Var3;
        this.L$6 = uiStateDrawableWrapper5;
        this.L$7 = str3;
        this.label = 2;
        Object k2 = nohVar2.k(this);
        if (k2 != coroutineSingletons) {
            uiStateDrawableWrapper = uiStateDrawableWrapper5;
            obj = k2;
            str = str3;
            CharSequence charSequence32 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = vu11Var2;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = uiStateDrawableWrapper;
            this.L$7 = str;
            this.L$8 = charSequence32;
            this.L$9 = vu11Var3;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
