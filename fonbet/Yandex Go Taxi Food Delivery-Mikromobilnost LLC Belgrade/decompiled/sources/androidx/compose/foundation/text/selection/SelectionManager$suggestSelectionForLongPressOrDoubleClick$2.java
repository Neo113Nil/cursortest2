package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.asy0;
import defpackage.bkq0;
import defpackage.bwc0;
import defpackage.ckq0;
import defpackage.dry0;
import defpackage.gy40;
import defpackage.ho40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y8b1;
import defpackage.zkq0;
import defpackage.zlz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", f = "SelectionManager.kt", l = {455}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SelectionManager$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<asy0> $selectionInSelectable;
    final /* synthetic */ Ref$LongRef $targetSelectableId;
    final /* synthetic */ Ref$ObjectRef<CharSequence> $textInSelectable;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(i iVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$LongRef ref$LongRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$textInSelectable = ref$ObjectRef;
        this.$selectionInSelectable = ref$ObjectRef2;
        this.$targetSelectableId = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(this.this$0, this.$textInSelectable, this.$selectionInSelectable, this.$targetSelectableId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionManager$suggestSelectionForLongPressOrDoubleClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        asy0 asy0Var;
        ho40 ho40Var;
        dry0 dry0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bwc0 bwc0Var = this.this$0.w;
            if (bwc0Var == null) {
                asy0Var = null;
                zy11 zy11Var = zy11.a;
                if (asy0Var != null) {
                    long j = asy0Var.a;
                    if (!asy0.a(j, this.$selectionInSelectable.element) && (ho40Var = (ho40) this.this$0.a.c.e(this.$targetSelectableId.element)) != null && ho40Var.d() == this.$textInSelectable.element && (dry0Var = (dry0) ho40Var.c.invoke()) != null) {
                        int i2 = (int) (j >> 32);
                        bkq0 bkq0Var = new bkq0(y8b1.d(dry0Var, i2), i2, this.$targetSelectableId.element);
                        int i3 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        ResolvedTextDirection d = y8b1.d(dry0Var, i3);
                        long j2 = this.$targetSelectableId.element;
                        ckq0 ckq0Var = new ckq0(bkq0Var, new bkq0(d, i3, j2), false);
                        zkq0 zkq0Var = this.this$0.a;
                        gy40 gy40Var = zlz.a;
                        gy40 gy40Var2 = new gy40((Object) null);
                        gy40Var2.h(j2, ckq0Var);
                        zkq0Var.k.setValue(gy40Var2);
                        this.this$0.d.invoke(ckq0Var);
                        this.this$0.t = null;
                    }
                }
                return zy11Var;
            }
            CharSequence charSequence = this.$textInSelectable.element;
            long j3 = this.$selectionInSelectable.element.a;
            this.label = 1;
            a aVar = (a) bwc0Var;
            obj = (charSequence.length() == 0 || asy0.c(j3)) ? null : tje.k0(aVar.a, new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(aVar, new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(j3, aVar, charSequence, null), null), this);
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
        asy0Var = (asy0) obj;
        zy11 zy11Var2 = zy11.a;
        if (asy0Var != null) {
        }
        return zy11Var2;
    }
}
