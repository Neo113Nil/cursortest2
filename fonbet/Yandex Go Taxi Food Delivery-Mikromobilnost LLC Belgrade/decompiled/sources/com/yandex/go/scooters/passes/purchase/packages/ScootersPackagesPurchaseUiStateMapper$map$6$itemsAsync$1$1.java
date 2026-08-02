package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.f8o0;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t8o0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lf8o0;", "<anonymous>", "(Ltse;)Lf8o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {142, 143}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ t8o0 $item;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1(i iVar, t8o0 t8o0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$item = t8o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if (r12 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1 scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1;
        CharSequence charSequence;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.d;
            FormattedText formattedText = this.$item.a;
            this.label = 1;
            scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1 = this;
            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1, 30);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$0;
                kotlin.b.b(obj);
                scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1 = this;
                CharSequence charSequence2 = (CharSequence) obj;
                str = scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1.$item.c;
                if (str.length() <= 0) {
                    str = null;
                }
                return new f8o0(str != null ? mja1.a(str, null, 6) : null, charSequence, charSequence2);
            }
            kotlin.b.b(obj);
            scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1 = this;
        }
        CharSequence charSequence3 = (CharSequence) obj;
        ru.yandex.taxi.widget.c cVar2 = scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1.this$0.d;
        FormattedText formattedText2 = scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1.$item.b;
        scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1.L$0 = charSequence3;
        scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1.label = 2;
        obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1, 30);
        if (obj != coroutineSingletons) {
            charSequence = charSequence3;
            CharSequence charSequence22 = (CharSequence) obj;
            str = scootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1.$item.c;
            if (str.length() <= 0) {
            }
            return new f8o0(str != null ? mja1.a(str, null, 6) : null, charSequence, charSequence22);
        }
        return coroutineSingletons;
    }
}
