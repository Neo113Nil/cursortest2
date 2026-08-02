package xsna;

import android.graphics.Bitmap;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MapViewBinding.kt */
@b6l(c = "com.vk.geo.impl.presentation.map.MapViewBinding$loadAvatarToMarker$1", f = "MapViewBinding.kt", l = {567, 569, 575, 580}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class nm00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ do00 $marker;
    final /* synthetic */ byf0 $rendered;
    final /* synthetic */ String $url;
    final /* synthetic */ int $visibleStyle;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ mm00<zv50, byf0> this$0;

    /* compiled from: MapViewBinding.kt */
    @b6l(c = "com.vk.geo.impl.presentation.map.MapViewBinding$loadAvatarToMarker$1$2", f = "MapViewBinding.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ do00 $marker;
        final /* synthetic */ byf0 $rendered;
        final /* synthetic */ int $visibleStyle;
        int label;
        final /* synthetic */ mm00<zv50, byf0> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mm00<zv50, byf0> mm00Var, byf0 byf0Var, do00 do00Var, int i, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = mm00Var;
            this.$rendered = byf0Var;
            this.$marker = do00Var;
            this.$visibleStyle = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$rendered, this.$marker, this.$visibleStyle, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            mm00<zv50, byf0> mm00Var = this.this$0;
            mm00Var.u(this.$rendered, mm00Var.f.c(this.$visibleStyle, this.$marker.b));
            return s3q0.a;
        }
    }

    /* compiled from: MapViewBinding.kt */
    @b6l(c = "com.vk.geo.impl.presentation.map.MapViewBinding$loadAvatarToMarker$1$3", f = "MapViewBinding.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ cpv $placeholder;
        final /* synthetic */ byf0 $rendered;
        int label;
        final /* synthetic */ mm00<zv50, byf0> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mm00<zv50, byf0> mm00Var, byf0 byf0Var, cpv cpvVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = mm00Var;
            this.$rendered = byf0Var;
            this.$placeholder = cpvVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$rendered, this.$placeholder, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.this$0.u(this.$rendered, this.$placeholder);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm00(mm00<zv50, byf0> mm00Var, int i, do00 do00Var, String str, byf0 byf0Var, spj<? super nm00> spjVar) {
        super(2, spjVar);
        this.this$0 = mm00Var;
        this.$visibleStyle = i;
        this.$marker = do00Var;
        this.$url = str;
        this.$rendered = byf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nm00(this.this$0, this.$visibleStyle, this.$marker, this.$url, this.$rendered, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nm00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
    
        if (xsna.myc0.k(r12, r5, r11) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010b, code lost:
    
        if (xsna.myc0.k(r3, r5, r11) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r12 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r12 == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int b2;
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            do00 do00Var = this.$marker;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Load marker avatar: " + ((Object) StringId.a(do00Var.b))});
            }
            b2 = (int) (this.this$0.f.f.c.b(this.$visibleStyle, this.$marker.m) >> 32);
            if (this.$marker.n) {
                s6r s6rVar = this.this$0.g;
                String str = this.$url;
                this.I$0 = b2;
                this.label = 1;
                s6rVar.getClass();
                obj = s6r.a(b2, b2, str, true, this);
            } else {
                s6r s6rVar2 = this.this$0.g;
                String str2 = this.$url;
                this.I$0 = b2;
                this.label = 2;
                s6rVar2.getClass();
                obj = s6r.a(b2, b2, str2, true, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            b2 = this.I$0;
            kotlin.a.a(obj);
            bitmap = (Bitmap) obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            b2 = this.I$0;
            kotlin.a.a(obj);
            bitmap = (Bitmap) obj;
        }
        if (bitmap != null) {
            this.this$0.f.g(this.$marker, bitmap, this.$visibleStyle, null);
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            a aVar = new a(this.this$0, this.$rendered, this.$marker, this.$visibleStyle, null);
            this.L$0 = null;
            this.I$0 = b2;
            this.label = 3;
        } else {
            rpv rpvVar = this.this$0.f;
            do00 do00Var2 = this.$marker;
            int i2 = this.$visibleStyle;
            rpvVar.getClass();
            cpv d = rpv.d(rpvVar, do00Var2.b, i2, do00Var2.m, null, 16);
            bdn bdnVar2 = bdn.a;
            ge00 ge00Var2 = ie00.a;
            b bVar = new b(this.this$0, this.$rendered, d, null);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = b2;
            this.label = 4;
        }
    }
}
