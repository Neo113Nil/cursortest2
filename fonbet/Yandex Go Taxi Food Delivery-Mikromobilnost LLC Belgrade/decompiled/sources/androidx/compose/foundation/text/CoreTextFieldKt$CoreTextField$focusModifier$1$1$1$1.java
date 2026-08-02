package androidx.compose.foundation.text;

import defpackage.asy0;
import defpackage.dry0;
import defpackage.ery0;
import defpackage.hoy0;
import defpackage.iv60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oay;
import defpackage.pk6;
import defpackage.pmy0;
import defpackage.tly0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {346}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ pk6 $bringIntoViewRequester;
    final /* synthetic */ ery0 $layoutResult;
    final /* synthetic */ iv60 $offsetMapping;
    final /* synthetic */ oay $state;
    final /* synthetic */ hoy0 $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(pk6 pk6Var, hoy0 hoy0Var, oay oayVar, ery0 ery0Var, iv60 iv60Var, Continuation continuation) {
        super(2, continuation);
        this.$bringIntoViewRequester = pk6Var;
        this.$value = hoy0Var;
        this.$state = oayVar;
        this.$layoutResult = ery0Var;
        this.$offsetMapping = iv60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long a;
        zii0 zii0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pk6 pk6Var = this.$bringIntoViewRequester;
        hoy0 hoy0Var = this.$value;
        tly0 tly0Var = this.$state.a;
        dry0 dry0Var = this.$layoutResult.a;
        iv60 iv60Var = this.$offsetMapping;
        this.label = 1;
        int r = iv60Var.r(asy0.e(hoy0Var.b));
        if (r < dry0Var.a.a.b.length()) {
            zii0Var = dry0Var.b(r);
        } else if (r != 0) {
            zii0Var = dry0Var.b(r - 1);
        } else {
            a = pmy0.a(tly0Var.b, tly0Var.g, tly0Var.h, pmy0.a, 1);
            zii0Var = new zii0(0.0f, 0.0f, 1.0f, (int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        }
        Object a2 = ((androidx.compose.foundation.relocation.a) pk6Var).a(zii0Var, this);
        if (a2 != coroutineSingletons) {
            a2 = zy11Var;
        }
        return a2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
