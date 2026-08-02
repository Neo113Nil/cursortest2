package com.yandex.go.user_profile.ui.am;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import com.yandex.go.user_profile.ui.am.AmProfileParams;
import defpackage.avj0;
import defpackage.gff0;
import defpackage.hff0;
import defpackage.hv11;
import defpackage.i20;
import defpackage.iff0;
import defpackage.jff0;
import defpackage.jjo;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pff0;
import defpackage.qff0;
import defpackage.rff0;
import defpackage.sff0;
import defpackage.sgf0;
import defpackage.t1w;
import defpackage.tse;
import defpackage.ul21;
import defpackage.v02;
import defpackage.w511;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.ui.am.AmProfileMapper$mapParams$2", f = "AmProfileMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AmProfileMapper$mapParams$2 extends SuspendLambda implements wls {
    final /* synthetic */ t1w $insets;
    final /* synthetic */ sgf0 $state;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmProfileMapper$mapParams$2(sgf0 sgf0Var, h hVar, t1w t1wVar, Continuation continuation) {
        super(2, continuation);
        this.$state = sgf0Var;
        this.this$0 = hVar;
        this.$insets = t1wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AmProfileMapper$mapParams$2(this.$state, this.this$0, this.$insets, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AmProfileMapper$mapParams$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        AmProfileParams.Line line;
        AmProfileParams.Line line2;
        AmProfileParams.Line line3;
        AmProfileParams.Line line4;
        AmActions$Command amActions$Command;
        Object failure;
        UltimaModeResponse.Profile profile;
        UltimaModeResponse.Profile.Card card;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        g gVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        sgf0 sgf0Var = this.$state;
        if (sgf0Var == null) {
            return null;
        }
        h hVar = this.this$0;
        hv11 hv11Var = sgf0Var.i;
        hVar.getClass();
        UltimaModeResponse ultimaModeResponse = hv11Var.d;
        AmProfileParams.UltimaMode ultimaMode = (!ultimaModeResponse.a || (profile = ultimaModeResponse.d) == null || (card = profile.a) == null) ? null : new AmProfileParams.UltimaMode(true, hv11Var.b, ultimaModeResponse.c, card);
        h hVar2 = this.this$0;
        ThemeType themeType = this.$state.j;
        t1w t1wVar = this.$insets;
        hVar2.getClass();
        int i = v02.a[themeType.ordinal()];
        if (i == 1) {
            str = "light";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "dark";
        }
        AmProfileParams.Appearance appearance = new AmProfileParams.Appearance(str, t1wVar != null ? t1wVar.b : 0, t1wVar != null ? t1wVar.g : 0);
        h hVar3 = this.this$0;
        sgf0 sgf0Var2 = this.$state;
        zuj0 zuj0Var = hVar3.a;
        jff0 jff0Var = sgf0Var2.e;
        sff0 sff0Var = sgf0Var2.d;
        String str2 = "";
        int i2 = 24;
        if (jl40.l(jff0Var, iff0.a)) {
            line2 = null;
        } else {
            boolean z = jff0Var instanceof hff0;
            AmActions$Command amActions$Command2 = jjo.d;
            if (z) {
                String h = ((avj0) zuj0Var).h(kyh0.user_profile_name_hint);
                boolean z2 = ((hff0) jff0Var).a;
                if (z2) {
                    amActions$Command2 = jjo.f;
                } else if (z2) {
                    w511.b();
                    return null;
                }
                line = new AmProfileParams.Line(str2, h, amActions$Command2, i2);
            } else {
                if (!(jff0Var instanceof gff0)) {
                    w511.b();
                    return null;
                }
                line = new AmProfileParams.Line(((avj0) zuj0Var).h(kyh0.user_profile_name_title), ((gff0) jff0Var).a, amActions$Command2, i2);
            }
            line2 = line;
        }
        ul21 ul21Var = sgf0Var2.c;
        AmProfileParams.Line line5 = new AmProfileParams.Line(ul21Var.a, ul21Var.b, jjo.c, ul21Var.c, ul21Var.d);
        avj0 avj0Var = (avj0) zuj0Var;
        AmProfileParams.Line line6 = new AmProfileParams.Line(avj0Var.h(kyh0.settings_phone), sgf0Var2.b, jjo.e, i2);
        pff0 pff0Var = pff0.a;
        if (jl40.l(sff0Var, pff0Var)) {
            line3 = null;
        } else if (sff0Var instanceof qff0) {
            line3 = new AmProfileParams.Line(avj0Var.h(kyh0.user_profile_rating_title), ((qff0) sff0Var).a, gVar, i2);
        } else {
            if (!(sff0Var instanceof rff0)) {
                w511.b();
                return null;
            }
            line3 = new AmProfileParams.Line(avj0Var.h(kyh0.user_profile_rating_title), ((rff0) sff0Var).a, gVar, i2);
        }
        if (jl40.l(sff0Var, pff0Var) || (sff0Var instanceof qff0)) {
            line4 = null;
        } else {
            if (!(sff0Var instanceof rff0)) {
                w511.b();
                return null;
            }
            rff0 rff0Var = (rff0) sff0Var;
            line4 = new AmProfileParams.Line(str2, rff0Var.c, new AmActions$Uri(rff0Var.b), i2);
        }
        boolean z3 = sgf0Var2.k;
        if (z3) {
            amActions$Command = jjo.g;
        } else {
            if (z3) {
                w511.b();
                return null;
            }
            amActions$Command = null;
        }
        AmProfileParams.Profile profile2 = new AmProfileParams.Profile(line2, line3, line5, line6, line4, jjo.b, amActions$Command);
        h hVar4 = this.this$0;
        sgf0 sgf0Var3 = this.$state;
        i20 i20Var = sgf0Var3.h;
        boolean z4 = sgf0Var3.n;
        hVar4.getClass();
        String str3 = i20Var.c;
        boolean z5 = i20Var.a;
        boolean z6 = !z4;
        try {
            failure = ((xnt) this.this$0.b).e(new AmProfileParams(ultimaMode, appearance, profile2, jjo.a, new AmProfileParams.Interactions(str3, z5, z5 && !z4, z6, z6, z6, z6, i20Var.b)), AmProfileParams.Companion.serializer());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.k(a, "PROFILE:SERIALIZE_PARAMS");
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
