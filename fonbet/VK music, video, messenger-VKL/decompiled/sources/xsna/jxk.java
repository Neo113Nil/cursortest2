package xsna;

import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DateInput.kt */
@b6l(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class jxk extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wz8 $calendarModel;
    final /* synthetic */ bxk $dateInputFormat;
    final /* synthetic */ Long $initialDateMillis;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ wh50<tho0> $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxk(Long l, wz8 wz8Var, bxk bxkVar, Locale locale, wh50<tho0> wh50Var, spj<? super jxk> spjVar) {
        super(2, spjVar);
        this.$initialDateMillis = l;
        this.$calendarModel = wz8Var;
        this.$dateInputFormat = bxkVar;
        this.$locale = locale;
        this.$text$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jxk(this.$initialDateMillis, this.$calendarModel, this.$dateInputFormat, this.$locale, this.$text$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jxk) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        Long l = this.$initialDateMillis;
        if (l != null) {
            wz8 wz8Var = this.$calendarModel;
            bxk bxkVar = this.$dateInputFormat;
            Locale locale = this.$locale;
            wh50<tho0> wh50Var = this.$text$delegate;
            String a = wz8Var.a(l.longValue(), bxkVar.c, locale);
            tho0 tho0Var = new tho0(a, a.length() == 0 ? qko0.b : jgz.c(a.length(), a.length()), 4);
            u890 u890Var = gxk.a;
            wh50Var.setValue(tho0Var);
        }
        return s3q0.a;
    }
}
