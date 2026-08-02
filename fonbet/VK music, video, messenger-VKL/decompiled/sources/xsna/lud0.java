package xsna;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.tt9;
import xsna.us2;

/* compiled from: ProfileCard.kt */
@b6l(c = "com.vk.clips.design.compose.profile.ProfileCardKt$DescriptionRow$1$5$1", f = "ProfileCard.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class lud0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ tt9.b.a.C3769a $description;
    final /* synthetic */ wh50<Boolean> $readyToShow$delegate;
    final /* synthetic */ wh50<Boolean> $showMore$delegate;
    final /* synthetic */ wh50<ljo0> $textLayoutResult$delegate;
    final /* synthetic */ wh50<us2> $textToShow$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lud0(tt9.b.a.C3769a c3769a, wh50<ljo0> wh50Var, wh50<Boolean> wh50Var2, wh50<us2> wh50Var3, wh50<Boolean> wh50Var4, spj<? super lud0> spjVar) {
        super(2, spjVar);
        this.$description = c3769a;
        this.$textLayoutResult$delegate = wh50Var;
        this.$showMore$delegate = wh50Var2;
        this.$textToShow$delegate = wh50Var3;
        this.$readyToShow$delegate = wh50Var4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lud0(this.$description, this.$textLayoutResult$delegate, this.$showMore$delegate, this.$textToShow$delegate, this.$readyToShow$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lud0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        wh50<ljo0> wh50Var = this.$textLayoutResult$delegate;
        float f = nud0.a;
        ljo0 value = wh50Var.getValue();
        if (value == null) {
            return s3q0.a;
        }
        if (((int) (value.c >> 32)) < value.b.d || value.d()) {
            this.$showMore$delegate.setValue(Boolean.TRUE);
            wh50<us2> wh50Var2 = this.$textToShow$delegate;
            us2 us2Var = this.$description.a;
            if (drm0.Q(us2Var).size() > 1) {
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                String a = i5s.a(sb, (String) j5g.Y(drm0.Q(us2Var)), "…");
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(((us2.b.a) arrayList.get(i)).a(sb.length()));
                }
                us2Var = new us2(a, arrayList2);
            }
            wh50Var2.setValue(us2Var);
        }
        this.$readyToShow$delegate.setValue(Boolean.TRUE);
        return s3q0.a;
    }
}
