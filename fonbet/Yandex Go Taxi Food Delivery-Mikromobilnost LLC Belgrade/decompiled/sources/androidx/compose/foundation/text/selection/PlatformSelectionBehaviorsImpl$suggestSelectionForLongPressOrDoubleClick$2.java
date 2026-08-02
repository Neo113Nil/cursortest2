package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import defpackage.asy0;
import defpackage.eja1;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uky0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Lasy0;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)Lasy0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(long j, a aVar, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.$selection, this.this$0, this.$text, continuation);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create((TextClassifier) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        TextClassification textClassification;
        g050 g050Var;
        CharSequence charSequence;
        TextSelection textSelection;
        a aVar;
        TextClassification textClassification2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(this.$text, asy0.f(this.$selection), asy0.e(this.$selection)).setDefaultLocales(this.this$0.b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long c = eja1.c(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            if (i2 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    a aVar2 = this.this$0;
                    g050Var = aVar2.e;
                    charSequence = this.$text;
                    this.L$0 = suggestSelection;
                    this.L$1 = g050Var;
                    this.L$2 = aVar2;
                    this.L$3 = charSequence;
                    this.J$0 = c;
                    this.label = 1;
                    if (g050Var.a(this) != coroutineSingletons) {
                        textSelection = suggestSelection;
                        aVar = aVar2;
                        j = c;
                        textClassification2 = textSelection.getTextClassification();
                        aVar.g.setValue(new uky0(charSequence, j, textClassification2));
                    }
                    return coroutineSingletons;
                }
            }
            a aVar3 = this.this$0;
            CharSequence charSequence2 = this.$text;
            this.J$0 = c;
            this.label = 2;
            if (a.a(aVar3, charSequence2, c, textClassifier, this) != coroutineSingletons) {
                j = c;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            charSequence = (CharSequence) this.L$3;
            aVar = (a) this.L$2;
            g050Var = (g050) this.L$1;
            textSelection = (TextSelection) this.L$0;
            kotlin.b.b(obj);
            try {
                textClassification2 = textSelection.getTextClassification();
                aVar.g.setValue(new uky0(charSequence, j, textClassification2));
            } finally {
                g050Var.d(null);
            }
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            kotlin.b.b(obj);
        }
        return new asy0(j);
    }
}
