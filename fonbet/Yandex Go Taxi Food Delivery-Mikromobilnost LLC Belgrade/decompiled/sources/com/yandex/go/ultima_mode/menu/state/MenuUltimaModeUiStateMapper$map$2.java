package com.yandex.go.ultima_mode.menu.state;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.fv11;
import defpackage.ief;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pn10;
import defpackage.qn10;
import defpackage.qoh;
import defpackage.qv11;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrn10;", "<anonymous>", "(Ltse;)Lrn10;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.menu.state.MenuUltimaModeUiStateMapper$map$2", f = "MenuUltimaModeUiStateMapper.kt", l = {23, 24}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MenuUltimaModeUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ UltimaModeResponse $response;
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
    public MenuUltimaModeUiStateMapper$map$2(UltimaModeResponse ultimaModeResponse, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$response = ultimaModeResponse;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MenuUltimaModeUiStateMapper$map$2 menuUltimaModeUiStateMapper$map$2 = new MenuUltimaModeUiStateMapper$map$2(this.$response, this.this$0, continuation);
        menuUltimaModeUiStateMapper$map$2.L$0 = obj;
        return menuUltimaModeUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MenuUltimaModeUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UltimaModeResponse.Menu.Card card;
        noh h;
        String str;
        String str2;
        fv11 fv11Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            UltimaModeResponse ultimaModeResponse = this.$response;
            UltimaModeResponse.Menu menu = ultimaModeResponse.e;
            if (menu == null || (card = menu.a) == null) {
                return qn10.a;
            }
            ief iefVar = ultimaModeResponse.c;
            qoh h2 = tje.h(tseVar, null, null, new MenuUltimaModeUiStateMapper$map$2$headerState$1(this.this$0, card, iefVar, null), 3);
            h = tje.h(tseVar, null, null, new MenuUltimaModeUiStateMapper$map$2$progressBarState$1(this.this$0, card, iefVar, null), 3);
            UltimaModeResponse.Menu menu2 = this.$response.e;
            String str3 = menu2 != null ? menu2.c : null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = h;
            this.L$5 = str3;
            this.label = 1;
            Object s = h2.s(this);
            if (s != coroutineSingletons) {
                str = str3;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fv11Var = (fv11) this.L$6;
            str2 = (String) this.L$5;
            b.b(obj);
            return new pn10(str2, fv11Var, (qv11) obj);
        }
        str = (String) this.L$5;
        h = (noh) this.L$4;
        b.b(obj);
        fv11 fv11Var2 = (fv11) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = str;
        this.L$6 = fv11Var2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str2 = str;
            fv11Var = fv11Var2;
            obj = k;
            return new pn10(str2, fv11Var, (qv11) obj);
        }
        return coroutineSingletons;
    }
}
