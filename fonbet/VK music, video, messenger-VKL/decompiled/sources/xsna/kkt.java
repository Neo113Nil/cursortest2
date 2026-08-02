package xsna;

import com.vk.geo.impl.model.VisibleStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.zk3;

/* compiled from: GeoFeature.kt */
@b6l(c = "com.vk.geo.impl.presentation.GeoFeature$processStaticPreviewState$processItems$1$3", f = "GeoFeature.kt", l = {573, 575}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class kkt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ zk3<do00, VisibleStyle> $selectedIcons;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ com.vk.geo.impl.presentation.b this$0;

    /* compiled from: GeoFeature.kt */
    @b6l(c = "com.vk.geo.impl.presentation.GeoFeature$processStaticPreviewState$processItems$1$3$1$1", f = "GeoFeature.kt", l = {565}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ do00 $marker;
        final /* synthetic */ VisibleStyle $style;
        final /* synthetic */ zk3<do00, List<Pair<String, VisibleStyle>>> $urls;
        final /* synthetic */ ui50 $urlsMutex;
        int label;
        final /* synthetic */ com.vk.geo.impl.presentation.b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.vk.geo.impl.presentation.b bVar, do00 do00Var, ui50 ui50Var, zk3<do00, List<Pair<String, VisibleStyle>>> zk3Var, VisibleStyle visibleStyle, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = bVar;
            this.$marker = do00Var;
            this.$urlsMutex = ui50Var;
            this.$urls = zk3Var;
            this.$style = visibleStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$marker, this.$urlsMutex, this.$urls, this.$style, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                com.vk.geo.impl.presentation.b bVar = this.this$0;
                qcy<Object>[] qcyVarArr = com.vk.geo.impl.presentation.b.H;
                q6r q6rVar = (q6r) bVar.B.getValue();
                do00 do00Var = this.$marker;
                ui50 ui50Var = this.$urlsMutex;
                zk3<do00, List<Pair<String, VisibleStyle>>> zk3Var = this.$urls;
                int i2 = this.$style.b;
                this.label = 1;
                if (q6r.a(q6rVar, do00Var, ui50Var, zk3Var, i2, null, this, 16) == coroutineSingletons) {
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
    public kkt(zk3<do00, VisibleStyle> zk3Var, com.vk.geo.impl.presentation.b bVar, spj<? super kkt> spjVar) {
        super(2, spjVar);
        this.$selectedIcons = zk3Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        kkt kktVar = new kkt(this.$selectedIcons, this.this$0, spjVar);
        kktVar.L$0 = obj;
        return kktVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kkt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a6, code lost:
    
        if (com.vk.geo.impl.presentation.b.U(r15, r0, r14) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zk3 zk3Var;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wi50 a2 = bay.a();
            zk3 zk3Var2 = new zk3(this.$selectedIcons.d);
            zk3<do00, VisibleStyle> zk3Var3 = this.$selectedIcons;
            com.vk.geo.impl.presentation.b bVar = this.this$0;
            ArrayList arrayList = new ArrayList(zk3Var3.d);
            Iterator it = ((zk3.a) zk3Var3.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(myc0.b(yvjVar, hqu0.a().plus(bVar.m), null, new a(bVar, (do00) entry.getKey(), a2, zk3Var2, (VisibleStyle) entry.getValue(), null), 2));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = zk3Var2;
            this.label = 1;
            if (fto0.e(arrayList, this) != coroutineSingletons) {
                zk3Var = zk3Var2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
        zk3Var = (zk3) this.L$2;
        kotlin.a.a(obj);
        com.vk.geo.impl.presentation.b bVar2 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
