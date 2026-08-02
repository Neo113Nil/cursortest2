package xsna;

import android.content.Context;
import com.vk.photo.editor.domain.LowMemoryException;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.views.ToolButton;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.x3p;

/* compiled from: MediaViewTool.kt */
/* loaded from: classes4.dex */
public final class s020 extends m3p<o020> implements v0g {
    public final v3p c;
    public final androidx.lifecycle.j d;
    public kkw e;
    public e4p f;
    public o3p g;
    public yok0 h;
    public final o020 i = new o020(null);
    public final bpn0 j = new bpn0(new gzv(this, 9));

    /* compiled from: MediaViewTool.kt */
    @b6l(c = "com.vk.photo.editor.features.media.MediaViewTool$onImageChanged$2", f = "MediaViewTool.kt", l = {101}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ i4p $imageState;
        Object L$0;
        int label;

        /* compiled from: MediaViewTool.kt */
        @b6l(c = "com.vk.photo.editor.features.media.MediaViewTool$onImageChanged$2$1", f = "MediaViewTool.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.s020$a$a, reason: collision with other inner class name */
        public static final class C3644a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ i4p $imageState;
            final /* synthetic */ o3p $scaledImage;
            int label;
            final /* synthetic */ s020 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3644a(s020 s020Var, i4p i4pVar, o3p o3pVar, spj<? super C3644a> spjVar) {
                super(2, spjVar);
                this.this$0 = s020Var;
                this.$imageState = i4pVar;
                this.$scaledImage = o3pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3644a(this.this$0, this.$imageState, this.$scaledImage, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3644a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.this$0.J(this.$imageState, this.$scaledImage);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i4p i4pVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$imageState = i4pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return s020.this.new a(this.$imageState, spjVar);
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
                o3p H = s020.this.H(this.$imageState);
                if (H == null) {
                    return s3q0.a;
                }
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                C3644a c3644a = new C3644a(s020.this, this.$imageState, H, null);
                this.L$0 = null;
                this.label = 1;
                if (myc0.k(ge00Var, c3644a, this) == coroutineSingletons) {
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

    public s020(v3p v3pVar, androidx.lifecycle.j jVar) {
        this.c = v3pVar;
        this.d = jVar;
    }

    @Override // xsna.m3p, xsna.d5p
    public final void B(i4p i4pVar) {
        if (i4pVar != null) {
            e4p e4pVar = i4pVar.b;
            if (!epx.f(this.f, e4pVar)) {
                yok0 yok0Var = this.h;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                this.f = e4pVar;
                if (e4pVar.getWidth() <= 4032 && e4pVar.getHeight() <= 4032) {
                    o3p H = H(i4pVar);
                    if (H == null) {
                        return;
                    }
                    J(i4pVar, H);
                    return;
                }
                com.vk.photo.editor.ivm.d d = this.c.d();
                caj0 caj0Var = d.c;
                caj0Var.e(new x3p.a(true));
                bdn bdnVar = bdn.a;
                this.h = myc0.h(this.d, wgl.c, null, new a(i4pVar, null), 2);
                return;
            }
        }
        o3p o3pVar = this.g;
        if (epx.f(o3pVar != null ? o3pVar.b : null, i4pVar != null ? i4pVar.b : null)) {
            I(i4pVar);
            kkw kkwVar = this.e;
            if (kkwVar != null) {
                Float f = i4pVar != null ? i4pVar.c : null;
                float floatValue = f != null ? f.floatValue() : kkwVar.getImageAspectRatio();
                kkwVar.i = floatValue;
                if (floatValue == kkwVar.getAspectRatio()) {
                    return;
                }
                kkwVar.h = Float.valueOf(kkwVar.i);
                kkwVar.invalidate();
                kkwVar.requestLayout();
                izs<? super Float, s3q0> izsVar = kkwVar.b;
                if (izsVar != null) {
                    izsVar.invoke(f);
                }
            }
        }
    }

    @Override // xsna.m3p
    public final /* bridge */ /* synthetic */ void G(o020 o020Var) {
    }

    public final o3p H(i4p i4pVar) {
        v3p v3pVar = this.c;
        try {
            b4p u = v3pVar.u();
            e4p e4pVar = i4pVar.b;
            o3p c = u.c(e4pVar, f4p.a(e4pVar, false));
            if (c == null) {
                c = null;
            }
            if (c == null) {
                return null;
            }
            return c;
        } catch (LowMemoryException e) {
            n4p logger = v3pVar.getLogger();
            if (logger != null) {
                logger.a(e);
            }
            v3pVar.d().a(EditorMessage.b.a);
            return null;
        }
    }

    public final void I(i4p i4pVar) {
        v3p v3pVar = this.c;
        com.vk.photo.editor.ivm.d d = v3pVar.d();
        caj0 caj0Var = d.c;
        caj0Var.e(new x3p.a(false));
        g5p g5pVar = ((EditorState) v3pVar.d().b.b.getValue()).b.get(u020.a);
        if ((g5pVar instanceof o020 ? (o020) g5pVar : null) != null) {
            v3pVar.d().a(new EditorMessage.i(new o020(i4pVar != null ? i4pVar.c : null), null, 2));
        }
    }

    public final void J(i4p i4pVar, o3p o3pVar) {
        kkw kkwVar = this.e;
        if (kkwVar != null) {
            kkwVar.setCustomAspectRatio(i4pVar.c);
        }
        kkw kkwVar2 = this.e;
        if (kkwVar2 != null) {
            kkwVar2.setImage(o3pVar);
        }
        kkw kkwVar3 = this.e;
        if (kkwVar3 != null) {
            fyt0.c(kkwVar3, new ync(this, o3pVar, i4pVar, 5));
        }
        kkw kkwVar4 = this.e;
        if (kkwVar4 != null) {
            kkwVar4.requestLayout();
        }
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ String e(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return u020.a;
    }

    @Override // xsna.d5p
    public final h5p getRenderer() {
        return new p020(this.c.u());
    }

    @Override // xsna.m3p, xsna.d5p
    public final e5p i() {
        return (r020) this.j.getValue();
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ String r(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ ToolButton s(Context context) {
        return null;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super o020> spjVar) {
        return this.i;
    }

    @Override // xsna.d5p
    public final void k() {
    }

    @Override // xsna.d5p
    public final void p() {
    }
}
