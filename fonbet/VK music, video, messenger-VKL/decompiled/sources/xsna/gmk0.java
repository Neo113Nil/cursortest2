package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.vk.photo.editor.ivm.EditorState;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SpoilerSelectionControllerImpl.kt */
/* loaded from: classes18.dex */
public final class gmk0 {
    public final v3p a;
    public final androidx.lifecycle.j b;
    public final cwn c;
    public final cmk0 d;
    public boolean e;
    public yok0 f;

    /* compiled from: SpoilerSelectionControllerImpl.kt */
    @b6l(c = "com.vk.editor.spoiler.tool.ui.SpoilerSelectionControllerImpl$renderBlur$1", f = "SpoilerSelectionControllerImpl.kt", l = {88, 101, 105}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ i4p $imageState;
        final /* synthetic */ int $mediaHeight;
        final /* synthetic */ int $mediaWidth;
        final /* synthetic */ Map<f5p, g5p> $toolParams;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* compiled from: SpoilerSelectionControllerImpl.kt */
        @b6l(c = "com.vk.editor.spoiler.tool.ui.SpoilerSelectionControllerImpl$renderBlur$1$1", f = "SpoilerSelectionControllerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.gmk0$a$a, reason: collision with other inner class name */
        public static final class C2948a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ Bitmap $smallBitmap;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2948a(Bitmap bitmap, spj<? super C2948a> spjVar) {
                super(2, spjVar);
                this.$smallBitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2948a(this.$smallBitmap, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2948a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                NativeBlurFilter.iterativeBoxBlur(this.$smallBitmap, 3, 5);
                return s3q0.a;
            }
        }

        /* compiled from: SpoilerSelectionControllerImpl.kt */
        @b6l(c = "com.vk.editor.spoiler.tool.ui.SpoilerSelectionControllerImpl$renderBlur$1$2", f = "SpoilerSelectionControllerImpl.kt", l = {}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ int $mediaHeight;
            final /* synthetic */ int $mediaWidth;
            final /* synthetic */ Bitmap $smallBitmap;
            int label;
            final /* synthetic */ gmk0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(gmk0 gmk0Var, int i, int i2, Bitmap bitmap, spj<? super b> spjVar) {
                super(2, spjVar);
                this.this$0 = gmk0Var;
                this.$mediaWidth = i;
                this.$mediaHeight = i2;
                this.$smallBitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.this$0, this.$mediaWidth, this.$mediaHeight, this.$smallBitmap, spjVar);
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
                cmk0 cmk0Var = this.this$0.d;
                cmk0Var.a(this.$mediaWidth, this.$mediaHeight);
                cmk0Var.setBlurredBitmap(this.$smallBitmap);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i4p i4pVar, Map<f5p, ? extends g5p> map, int i, int i2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$imageState = i4pVar;
            this.$toolParams = map;
            this.$mediaWidth = i;
            this.$mediaHeight = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return gmk0.this.new a(this.$imageState, this.$toolParams, this.$mediaWidth, this.$mediaHeight, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00cf, code lost:
        
            if (xsna.myc0.k(r13, r6, r12) != r0) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int height;
            Bitmap createScaledBitmap;
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            try {
            } catch (Exception e) {
                n4p logger = gmk0.this.a.getLogger();
                if (logger != null) {
                    logger.a(e);
                }
            }
            if (i2 == 0) {
                kotlin.a.a(obj);
                zdl i3 = gmk0.this.a.i();
                i4p i4pVar = this.$imageState;
                Map<f5p, g5p> map = this.$toolParams;
                this.label = 1;
                obj = i3.a(i4pVar, map, null, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i2 == 1) {
                kotlin.a.a(obj);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                height = this.I$1;
                i = this.I$0;
                createScaledBitmap = (Bitmap) this.L$1;
                kotlin.a.a(obj);
                Bitmap bitmap = createScaledBitmap;
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                b bVar = new b(gmk0.this, this.$mediaWidth, this.$mediaHeight, bitmap, null);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i;
                this.I$1 = height;
                this.label = 3;
            }
            ota0 ota0Var = (ota0) obj;
            if (!(ota0Var instanceof ld7)) {
                return s3q0.a;
            }
            height = (((ld7) ota0Var).a.getHeight() * 50) / ((ld7) ota0Var).a.getWidth();
            if (height < 1) {
                height = 1;
            }
            createScaledBitmap = Bitmap.createScaledBitmap(((ld7) ota0Var).a, 50, height, true);
            if (!epx.f(((ld7) ota0Var).a, createScaledBitmap)) {
                ((ld7) ota0Var).a.recycle();
            }
            ovj a = hqu0.a();
            C2948a c2948a = new C2948a(createScaledBitmap, null);
            this.L$0 = null;
            this.L$1 = createScaledBitmap;
            this.I$0 = 50;
            this.I$1 = height;
            this.label = 2;
            if (myc0.k(a, c2948a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = 50;
            Bitmap bitmap2 = createScaledBitmap;
            bdn bdnVar2 = bdn.a;
            ge00 ge00Var2 = ie00.a;
            b bVar2 = new b(gmk0.this, this.$mediaWidth, this.$mediaHeight, bitmap2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = i;
            this.I$1 = height;
            this.label = 3;
        }
    }

    public gmk0(v3p v3pVar, androidx.lifecycle.j jVar, cwn cwnVar) {
        this.a = v3pVar;
        this.b = jVar;
        this.c = cwnVar;
        this.d = new cmk0(v3pVar.x());
    }

    public final void a() {
        v3p v3pVar = this.a;
        RectF rectF = v3pVar.r().provide().e;
        View j = v3pVar.j();
        int measuredWidth = rectF.isEmpty() ? j.getMeasuredWidth() : (int) rectF.width();
        int measuredHeight = rectF.isEmpty() ? j.getMeasuredHeight() : (int) rectF.height();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        this.d.a(measuredWidth, measuredHeight);
    }

    public final dmk0 b() {
        g5p g5pVar = ((EditorState) this.a.d().b.b.getValue()).b.get(jmk0.a);
        dmk0 dmk0Var = g5pVar instanceof dmk0 ? (dmk0) g5pVar : null;
        return dmk0Var == null ? new dmk0(false, false, false, false) : dmk0Var;
    }

    public final void c() {
        v3p v3pVar = this.a;
        EditorState editorState = (EditorState) v3pVar.d().b.b.getValue();
        i4p i4pVar = editorState.a;
        if (i4pVar == null) {
            return;
        }
        Map<f5p, g5p> map = editorState.b;
        RectF rectF = v3pVar.r().provide().e;
        int measuredWidth = rectF.isEmpty() ? v3pVar.j().getMeasuredWidth() : (int) rectF.width();
        int measuredHeight = rectF.isEmpty() ? v3pVar.j().getMeasuredHeight() : (int) rectF.height();
        yok0 yok0Var = this.f;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.f = myc0.h(this.b, hqu0.b(), null, new a(i4pVar, map, measuredWidth, measuredHeight, null), 2);
    }
}
