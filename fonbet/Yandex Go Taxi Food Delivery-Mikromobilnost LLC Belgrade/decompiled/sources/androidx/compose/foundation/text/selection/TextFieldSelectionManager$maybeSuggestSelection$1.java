package androidx.compose.foundation.text.selection;

import defpackage.asy0;
import defpackage.bwc0;
import defpackage.eja1;
import defpackage.iv60;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {571}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends SuspendLambda implements wls {
    final /* synthetic */ iv60 $offsetMapping;
    final /* synthetic */ bwc0 $platformSelectionBehaviors;
    final /* synthetic */ asy0 $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(bwc0 bwc0Var, String str, long j, asy0 asy0Var, j jVar, iv60 iv60Var, Continuation continuation) {
        super(2, continuation);
        this.$platformSelectionBehaviors = bwc0Var;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = asy0Var;
        this.this$0 = jVar;
        this.$offsetMapping = iv60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bwc0 bwc0Var = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            a aVar = (a) bwc0Var;
            aVar.getClass();
            if (str.length() == 0 || asy0.c(j)) {
                obj = null;
            } else {
                obj = tje.k0(aVar.a, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(aVar, new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(j, aVar, str, null), null), this);
            }
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        asy0 asy0Var = (asy0) obj;
        zy11 zy11Var = zy11.a;
        if (asy0Var != null) {
            iv60 iv60Var = this.$offsetMapping;
            long j2 = asy0Var.a;
            long c = eja1.c(iv60Var.j((int) (j2 >> 32)), iv60Var.j((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            if (!asy0.a(c, this.$selection) && jl40.l(this.this$0.o().a.b, this.$text)) {
                iv60 iv60Var2 = this.$offsetMapping;
                j jVar = this.this$0;
                if (iv60Var2 == jVar.b) {
                    jVar.c.invoke(j.e(jVar.o().a, c));
                    this.this$0.w = new asy0(c);
                }
            }
        }
        return zy11Var;
    }
}
