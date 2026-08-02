package xsna;

import android.content.res.Resources;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PublishMarkersUseCase.kt */
@b6l(c = "com.vk.geo.impl.presentation.publish.PublishMarkersUseCase$prefetchIcon$2", f = "PublishMarkersUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ade0 extends SuspendLambda implements wzs<yvj, spj<? super zrl<? extends s3q0>>, Object> {
    final /* synthetic */ akt $cluster;
    final /* synthetic */ do00 $marker;
    final /* synthetic */ int $style;
    final /* synthetic */ zk3<StringId, VisibleStyle> $styles;
    final /* synthetic */ Map<do00, List<Pair<String, VisibleStyle>>> $urls;
    final /* synthetic */ ui50 $urlsMutex;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xce0 this$0;

    /* compiled from: PublishMarkersUseCase.kt */
    @b6l(c = "com.vk.geo.impl.presentation.publish.PublishMarkersUseCase$prefetchIcon$2$1", f = "PublishMarkersUseCase.kt", l = {269}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ akt $cluster;
        final /* synthetic */ do00 $marker;
        final /* synthetic */ int $style;
        final /* synthetic */ Map<do00, List<Pair<String, VisibleStyle>>> $urls;
        final /* synthetic */ ui50 $urlsMutex;
        int label;
        final /* synthetic */ xce0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xce0 xce0Var, do00 do00Var, ui50 ui50Var, Map<do00, List<Pair<String, VisibleStyle>>> map, int i, akt aktVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = xce0Var;
            this.$marker = do00Var;
            this.$urlsMutex = ui50Var;
            this.$urls = map;
            this.$style = i;
            this.$cluster = aktVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$marker, this.$urlsMutex, this.$urls, this.$style, this.$cluster, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                q6r q6rVar = this.this$0.c;
                do00 do00Var = this.$marker;
                ui50 ui50Var = this.$urlsMutex;
                Map<do00, List<Pair<String, VisibleStyle>>> map = this.$urls;
                int i2 = this.$style;
                akt aktVar = this.$cluster;
                if (aktVar != null) {
                    aktVar.c();
                }
                this.label = 1;
                if (q6r.a(q6rVar, do00Var, ui50Var, map, i2, null, this, 32) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ade0(do00 do00Var, xce0 xce0Var, int i, akt aktVar, zk3<StringId, VisibleStyle> zk3Var, ui50 ui50Var, Map<do00, List<Pair<String, VisibleStyle>>> map, spj<? super ade0> spjVar) {
        super(2, spjVar);
        this.$marker = do00Var;
        this.this$0 = xce0Var;
        this.$style = i;
        this.$cluster = aktVar;
        this.$styles = zk3Var;
        this.$urlsMutex = ui50Var;
        this.$urls = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ade0 ade0Var = new ade0(this.$marker, this.this$0, this.$style, this.$cluster, this.$styles, this.$urlsMutex, this.$urls, spjVar);
        ade0Var.L$0 = obj;
        return ade0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super zrl<? extends s3q0>> spjVar) {
        return ((ade0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        String str = this.$marker.b;
        if (this.this$0.e.c(this.$style, str) == null) {
            String str2 = this.$marker.l;
            boolean z = str2 == null || str2.length() == 0;
            if (this.$marker.n && ((VisibleStyle.C(this.$style) || VisibleStyle.D(this.$style)) && !z)) {
                return myc0.b(yvjVar, hqu0.b().plus(this.this$0.b), null, new a(this.this$0, this.$marker, this.$urlsMutex, this.$urls, this.$style, this.$cluster, null), 2);
            }
            akt aktVar = this.$cluster;
            if (aktVar != null) {
                Resources resources = this.this$0.a;
                aktVar.c();
            }
            cpv f = this.this$0.e.f(this.$marker, this.$style, null);
            if (f != null && !VisibleStyle.D(f.c)) {
                qqm0.b(this.$styles, str, f.c);
            }
        }
        return null;
    }
}
