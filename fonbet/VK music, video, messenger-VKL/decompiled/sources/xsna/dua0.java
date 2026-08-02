package xsna;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.text.selection.SelectedTextType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlatformSelectionBehaviors.android.kt */
@b6l(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class dua0 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ wzs<TextClassifier, spj<Object>, Object> $block;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ fua0 this$0;

    /* compiled from: PlatformSelectionBehaviors.android.kt */
    @b6l(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
        final /* synthetic */ wzs<TextClassifier, spj<Object>, Object> $block;
        final /* synthetic */ TextClassifier $textClassificationSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TextClassifier textClassifier, wzs<? super TextClassifier, ? super spj<Object>, ? extends Object> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$textClassificationSession = textClassifier;
            this.$block = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$textClassificationSession, this.$block, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            TextClassifier textClassifier = this.$textClassificationSession;
            if (textClassifier == null) {
                return null;
            }
            wzs<TextClassifier, spj<Object>, Object> wzsVar = this.$block;
            this.label = 1;
            Object invoke = wzsVar.invoke(textClassifier, this);
            return invoke == coroutineSingletons ? coroutineSingletons : invoke;
        }
    }

    /* compiled from: PlatformSelectionBehaviors.android.kt */
    @b6l(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super TextClassifier>, Object> {
        int label;
        final /* synthetic */ fua0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fua0 fua0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = fua0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super TextClassifier> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            fua0 fua0Var = this.this$0;
            Context context = fua0Var.b;
            SelectedTextType selectedTextType = fua0Var.c;
            TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
            int i = ico0.$EnumSwitchMapping$0[selectedTextType.ordinal()];
            if (i == 1) {
                str = "edittext";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "textview";
            }
            TextClassifier createTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
            this.this$0.f = createTextClassificationSession;
            return createTextClassificationSession;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dua0(fua0 fua0Var, wzs<? super TextClassifier, ? super spj<Object>, ? extends Object> wzsVar, spj<? super dua0> spjVar) {
        super(2, spjVar);
        this.this$0 = fua0Var;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dua0(this.this$0, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((dua0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
    
        if (r10.b(r9) == r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [xsna.ui50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fua0 fua0Var;
        wi50 wi50Var;
        ?? r1;
        Throwable th;
        TextClassifier textClassifier;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                fua0Var = this.this$0;
                wi50Var = fua0Var.e;
                this.L$0 = wi50Var;
                this.L$1 = fua0Var;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    r1 = (ui50) this.L$0;
                    try {
                        kotlin.a.a(obj);
                        r1 = r1;
                        textClassifier = (TextClassifier) obj;
                        wi50Var = r1;
                        wi50Var.c(null);
                        a aVar = new a(textClassifier, this.$block, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        Object c = oxo0.c(200L, aVar, this);
                        return c == coroutineSingletons ? coroutineSingletons : c;
                    } catch (Throwable th2) {
                        th = th2;
                        r1.c(null);
                        throw th;
                    }
                }
                fua0Var = (fua0) this.L$1;
                ?? r4 = (ui50) this.L$0;
                kotlin.a.a(obj);
                wi50Var = r4;
            }
            textClassifier = fua0Var.f;
            if (textClassifier != null) {
                if (textClassifier.isDestroyed()) {
                }
                wi50Var.c(null);
                a aVar2 = new a(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object c2 = oxo0.c(200L, aVar2, this);
                if (c2 == coroutineSingletons) {
                }
            }
            b bVar = new b(fua0Var, null);
            this.L$0 = wi50Var;
            this.L$1 = null;
            this.label = 2;
            Object c3 = oxo0.c(300L, bVar, this);
            if (c3 != coroutineSingletons) {
                r1 = wi50Var;
                obj = c3;
                textClassifier = (TextClassifier) obj;
                wi50Var = r1;
                wi50Var.c(null);
                a aVar22 = new a(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object c22 = oxo0.c(200L, aVar22, this);
                if (c22 == coroutineSingletons) {
                }
            }
        } catch (Throwable th3) {
            r1 = wi50Var;
            th = th3;
            r1.c(null);
            throw th;
        }
    }
}
