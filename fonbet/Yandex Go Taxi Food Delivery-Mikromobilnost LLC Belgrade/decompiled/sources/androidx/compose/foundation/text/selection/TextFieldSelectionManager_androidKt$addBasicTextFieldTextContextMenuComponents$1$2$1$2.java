package androidx.compose.foundation.text.selection;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2", f = "TextFieldSelectionManager.android.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 extends SuspendLambda implements tls {
    final /* synthetic */ j $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(j jVar, Continuation continuation) {
        super(1, continuation);
        this.$this_with = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(this.$this_with, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 = (TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        textFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j jVar = this.$this_with;
        jVar.d(jVar.B);
        return zy11.a;
    }
}
