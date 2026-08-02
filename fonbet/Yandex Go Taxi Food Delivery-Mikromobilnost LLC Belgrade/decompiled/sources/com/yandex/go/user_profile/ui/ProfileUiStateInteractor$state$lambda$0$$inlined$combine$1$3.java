package com.yandex.go.user_profile.ui;

import defpackage.d6z;
import defpackage.evu0;
import defpackage.gff0;
import defpackage.hff0;
import defpackage.hv11;
import defpackage.i20;
import defpackage.iff0;
import defpackage.jff0;
import defpackage.kj;
import defpackage.l10;
import defpackage.lk51;
import defpackage.mvg;
import defpackage.n150;
import defpackage.ny61;
import defpackage.pff0;
import defpackage.q8i0;
import defpackage.qff0;
import defpackage.rff0;
import defpackage.sff0;
import defpackage.sgf0;
import defpackage.tgf0;
import defpackage.ul21;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.ui.ProfileUiStateInteractor$state$lambda$0$$inlined$combine$1$3", f = "ProfileUiStateInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class ProfileUiStateInteractor$state$lambda$0$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ kj $account$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ tgf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUiStateInteractor$state$lambda$0$$inlined$combine$1$3(Continuation continuation, tgf0 tgf0Var, kj kjVar) {
        super(3, continuation);
        this.this$0 = tgf0Var;
        this.$account$inlined = kjVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProfileUiStateInteractor$state$lambda$0$$inlined$combine$1$3 profileUiStateInteractor$state$lambda$0$$inlined$combine$1$3 = new ProfileUiStateInteractor$state$lambda$0$$inlined$combine$1$3((Continuation) obj3, this.this$0, this.$account$inlined);
        profileUiStateInteractor$state$lambda$0$$inlined$combine$1$3.L$0 = (vpr) obj;
        profileUiStateInteractor$state$lambda$0$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return profileUiStateInteractor$state$lambda$0$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Pair pair2;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            Object obj10 = objArr[8];
            Object obj11 = objArr[9];
            l10 l10Var = (l10) objArr[10];
            ProfileContext profileContext = (ProfileContext) obj11;
            boolean booleanValue = ((Boolean) obj10).booleanValue();
            ThemeType themeType = (ThemeType) obj9;
            hv11 hv11Var = (hv11) obj8;
            i20 i20Var = (i20) obj7;
            ul21 ul21Var = (ul21) obj6;
            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
            lk51 lk51Var = (lk51) obj4;
            String str = (String) obj3;
            n150 n150Var = (n150) obj2;
            tgf0 tgf0Var = this.this$0;
            kj kjVar = this.$account$inlined;
            boolean equals = l10Var.a.equals("default");
            boolean z = !equals;
            ru.yandex.taxi.profile.a aVar = tgf0Var.c;
            boolean a = n150Var.a();
            String str2 = n150Var.a;
            Object obj12 = iff0.a;
            Object obj13 = pff0.a;
            if (a) {
                String str3 = kjVar != null ? kjVar.e : null;
                if (str2 == null || evu0.J(str2)) {
                    str2 = str3;
                }
                if ((str2 == null || evu0.J(str2)) && equals) {
                    pair = new Pair(new hff0(aVar.b()), obj13);
                } else if (str2 == null || evu0.J(str2)) {
                    pair2 = new Pair(obj12, obj13);
                } else {
                    gff0 gff0Var = new gff0(str2);
                    String str4 = n150Var.b;
                    if (str4 != null && !evu0.J(str4)) {
                        String str5 = ((q8i0) aVar.c.b()).d;
                        if (str5 == null || evu0.J(str5)) {
                            obj13 = new qff0(str4);
                        } else {
                            q8i0 q8i0Var = (q8i0) aVar.c.b();
                            q8i0Var.getClass();
                            obj13 = new rff0(str4, str5, d6z.Y(q8i0Var, "rating_info_trail_text_key"));
                        }
                    }
                    pair = new Pair(gff0Var, obj13);
                }
                pair2 = pair;
            } else {
                boolean b = aVar.b();
                if (b) {
                    obj12 = new hff0(true);
                } else if (b) {
                    w511.b();
                    return null;
                }
                pair2 = new Pair(obj12, obj13);
            }
            sgf0 sgf0Var = new sgf0(kjVar != null ? Long.valueOf(kjVar.a) : null, str, ul21Var, (sff0) pair2.getSecond(), (jff0) pair2.getFirst(), booleanValue2, lk51Var, i20Var, hv11Var, themeType, booleanValue, n150Var.a(), profileContext, z);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(sgf0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
