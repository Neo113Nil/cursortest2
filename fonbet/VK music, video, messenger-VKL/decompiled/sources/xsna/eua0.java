package xsna;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlatformSelectionBehaviors.android.kt */
@b6l(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class eua0 extends SuspendLambda implements wzs<TextClassifier, spj<? super qko0>, Object> {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ fua0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eua0(long j, CharSequence charSequence, spj spjVar, fua0 fua0Var) {
        super(2, spjVar);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = fua0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        eua0 eua0Var = new eua0(this.$selection, this.$text, spjVar, this.this$0);
        eua0Var.L$0 = obj;
        return eua0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(TextClassifier textClassifier, spj<? super qko0> spjVar) {
        return ((eua0) create(textClassifier, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextSelection suggestSelection;
        long j;
        TextClassification textClassification;
        ui50 ui50Var;
        CharSequence charSequence;
        fua0 fua0Var;
        TextClassification textClassification2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(this.$text, qko0.f(this.$selection), qko0.e(this.$selection)).setDefaultLocales(this.this$0.e());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            suggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long c = jgz.c(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            if (i2 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    fua0 fua0Var2 = this.this$0;
                    ui50Var = fua0Var2.e;
                    charSequence = this.$text;
                    this.L$0 = suggestSelection;
                    this.L$1 = ui50Var;
                    this.L$2 = fua0Var2;
                    this.L$3 = charSequence;
                    this.J$0 = c;
                    this.label = 1;
                    if (ui50Var.b(this) != coroutineSingletons) {
                        fua0Var = fua0Var2;
                        j = c;
                        textClassification2 = suggestSelection.getTextClassification();
                        ((zak0) fua0Var.g).setValue(new hco0(charSequence, j, textClassification2));
                        s3q0 s3q0Var = s3q0.a;
                    }
                    return coroutineSingletons;
                }
            }
            fua0 fua0Var3 = this.this$0;
            CharSequence charSequence2 = this.$text;
            this.J$0 = c;
            this.label = 2;
            if (fua0.d(fua0Var3, charSequence2, c, textClassifier, this) != coroutineSingletons) {
                j = c;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            charSequence = (CharSequence) this.L$3;
            fua0Var = (fua0) this.L$2;
            ui50Var = (ui50) this.L$1;
            suggestSelection = (TextSelection) this.L$0;
            kotlin.a.a(obj);
            try {
                textClassification2 = suggestSelection.getTextClassification();
                ((zak0) fua0Var.g).setValue(new hco0(charSequence, j, textClassification2));
                s3q0 s3q0Var2 = s3q0.a;
            } finally {
                ui50Var.c(null);
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            kotlin.a.a(obj);
        }
        return new qko0(j);
    }
}
