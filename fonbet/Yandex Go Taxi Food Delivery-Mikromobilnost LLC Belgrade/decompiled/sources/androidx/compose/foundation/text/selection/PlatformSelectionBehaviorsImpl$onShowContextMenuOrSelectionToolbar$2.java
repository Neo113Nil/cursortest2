package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Lzy11;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", f = "PlatformSelectionBehaviors.android.kt", l = {HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(long j, a aVar, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$text = charSequence;
        this.$selection = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 = new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this.$selection, this.this$0, this.$text, continuation);
        platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2) create((TextClassifier) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            a aVar = this.this$0;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            if (a.a(aVar, charSequence, j, textClassifier, this) == coroutineSingletons) {
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
