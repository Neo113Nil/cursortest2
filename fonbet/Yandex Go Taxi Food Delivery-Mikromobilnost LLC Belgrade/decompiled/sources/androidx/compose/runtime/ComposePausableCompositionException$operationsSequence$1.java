package androidx.compose.runtime;

import defpackage.mp60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.srq0;
import defpackage.u5w;
import defpackage.wls;
import defpackage.ym11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class ComposePausableCompositionException$operationsSequence$1 extends RestrictedSuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ComposePausableCompositionException this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePausableCompositionException$operationsSequence$1(ComposePausableCompositionException composePausableCompositionException, Continuation continuation) {
        super(2, continuation);
        this.this$0 = composePausableCompositionException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new ComposePausableCompositionException$operationsSequence$1(this.this$0, continuation);
        composePausableCompositionException$operationsSequence$1.L$0 = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposePausableCompositionException$operationsSequence$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0040 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        srq0 srq0Var;
        int i2;
        int i3;
        int i4;
        u5w u5wVar;
        u5w u5wVar2;
        String str;
        mp60 mp60Var;
        u5w u5wVar3;
        u5w u5wVar4;
        u5w u5wVar5;
        u5w u5wVar6;
        u5w u5wVar7;
        u5w u5wVar8;
        int i5;
        mp60 mp60Var2;
        int i6;
        u5w u5wVar9;
        mp60 mp60Var3;
        mp60 mp60Var4;
        mp60 mp60Var5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        if (i7 == 0) {
            kotlin.b.b(obj);
            i = 0;
            srq0Var = (srq0) this.L$0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i7 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = this.I$2;
            int i9 = this.I$1;
            int i10 = this.I$0;
            srq0Var = (srq0) this.L$0;
            kotlin.b.b(obj);
            i2 = i9;
            i3 = i8;
            i = i10;
        }
        while (i < Math.min(i4 + 10, u5wVar.b)) {
            u5wVar2 = this.this$0.operations;
            int i11 = i + 1;
            int a = u5wVar2.a(i);
            switch (a) {
                case 0:
                    str = "up";
                    break;
                case 1:
                    mp60Var = this.this$0.instances;
                    str = qv10.o("down ", mp60Var.b(i2));
                    i2++;
                    break;
                case 2:
                    u5wVar3 = this.this$0.operations;
                    int a2 = u5wVar3.a(i11);
                    u5wVar4 = this.this$0.operations;
                    str = "remove " + a2 + HexString.CHAR_SPACE + u5wVar4.a(i + 2);
                    i11 = i + 3;
                    break;
                case 3:
                    u5wVar5 = this.this$0.operations;
                    int a3 = u5wVar5.a(i11);
                    u5wVar6 = this.this$0.operations;
                    int a4 = u5wVar6.a(i + 2);
                    u5wVar7 = this.this$0.operations;
                    str = "move " + a3 + HexString.CHAR_SPACE + a4 + HexString.CHAR_SPACE + u5wVar7.a(i + 3);
                    i11 = i + 4;
                    break;
                case 4:
                    str = "clear";
                    break;
                case 5:
                    u5wVar8 = this.this$0.operations;
                    i5 = i + 2;
                    int a5 = u5wVar8.a(i11);
                    mp60Var2 = this.this$0.instances;
                    i6 = i2 + 1;
                    str = "insertBottomUp " + a5 + HexString.CHAR_SPACE + mp60Var2.b(i2);
                    i11 = i5;
                    i2 = i6;
                    break;
                case 6:
                    u5wVar9 = this.this$0.operations;
                    i5 = i + 2;
                    int a6 = u5wVar9.a(i11);
                    mp60Var3 = this.this$0.instances;
                    i6 = i2 + 1;
                    str = "insertTopDown " + a6 + HexString.CHAR_SPACE + mp60Var3.b(i2);
                    i11 = i5;
                    i2 = i6;
                    break;
                case 7:
                    mp60Var4 = this.this$0.instances;
                    Object b = mp60Var4.b(i2);
                    ym11.e(2, b);
                    i2 += 2;
                    str = "apply " + ((wls) b);
                    break;
                case 8:
                    StringBuilder sb = new StringBuilder("reuse ");
                    mp60Var5 = this.this$0.reused;
                    sb.append(mp60Var5.b(i3));
                    str = sb.toString();
                    i3++;
                    break;
                case 9:
                    str = "recompose pending";
                    break;
                default:
                    str = oyr.i(a, "unknown op: ");
                    break;
            }
            String str2 = i + Extension.COLON_SPACE + str;
            this.L$0 = srq0Var;
            this.I$0 = i11;
            this.I$1 = i2;
            this.I$2 = i3;
            this.label = 1;
            if (srq0Var.a(str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i11;
        }
        return zy11.a;
    }
}
