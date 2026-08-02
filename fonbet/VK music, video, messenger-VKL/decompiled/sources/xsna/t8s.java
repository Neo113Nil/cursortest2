package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.Z3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.design.demo.presentation.screens.GroupMode;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.e3m;
import xsna.e8s;
import xsna.f8s;
import xsna.g8s;
import xsna.h8s;
import xsna.i8s;
import xsna.k8s;
import xsna.q630;
import xsna.s2x;
import xsna.tlo0;
import xsna.ty6;

/* compiled from: FormFieldScreenContent.kt */
/* loaded from: classes18.dex */
public final class t8s {

    /* compiled from: FormFieldScreenContent.kt */
    public static final class a implements k8s.a {
        public final /* synthetic */ wh50<tho0> a;

        public a(wh50<tho0> wh50Var) {
            this.a = wh50Var;
        }

        @Override // xsna.k8s.a
        public final void a(k8s.a aVar, androidx.compose.runtime.a aVar2, int i) {
            androidx.compose.runtime.a M = aVar2.M(2029041609);
            int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2029041609, i2, -1, "com.vk.design.demo.presentation.screens.ComposeHorizontalFormFieldGroup.<anonymous>.<anonymous>.<no name provided>.Content (FormFieldScreenContent.kt:703)");
                }
                wh50<tho0> wh50Var = this.a;
                tho0 value = wh50Var.getValue();
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new s8s(0, wh50Var);
                    M.R(x);
                }
                vyu0.a(aVar, g8s.b.a.a(s2x.a.C3649a.b(value, (izs) x, null, 0L, 0L, null, null, null, null, null, false, null, M, 48, 196608, 32764), null, false, null, M, 24576, 14), null, h8s.a.a("Title 1", false, null, i8s.a.AbstractC3037a.C3038a.a(wh50Var.getValue().a.c.length(), 15, null, M, 3120, 4), null, M, 196614, 22), null, f8s.a.a("Caption 1, very long caption 1, not short", null, null, M, 3078, 6), M, i2 & 14, 10);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new fza(this, aVar, i, 4);
            }
        }
    }

    /* compiled from: FormFieldScreenContent.kt */
    public static final class b implements k8s.a {
        public final /* synthetic */ wh50<tho0> a;

        public b(wh50<tho0> wh50Var) {
            this.a = wh50Var;
        }

        @Override // xsna.k8s.a
        public final void a(k8s.a aVar, androidx.compose.runtime.a aVar2, int i) {
            androidx.compose.runtime.a M = aVar2.M(-1875747662);
            int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1875747662, i2, -1, "com.vk.design.demo.presentation.screens.ComposeHorizontalFormFieldGroup.<anonymous>.<anonymous>.<no name provided>.Content (FormFieldScreenContent.kt:727)");
                }
                wh50<tho0> wh50Var = this.a;
                tho0 value = wh50Var.getValue();
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new qoj(1, wh50Var);
                    M.R(x);
                }
                u2x a = g8s.b.a.a(s2x.a.C3649a.b(value, (izs) x, null, 0L, 0L, null, null, null, null, null, false, null, M, 48, 196608, 32764), null, false, null, M, 24576, 14);
                hly a2 = h8s.a.a("Title 2", false, null, null, null, M, 196614, 30);
                vr9 a3 = f8s.a.a("Caption 2", null, null, M, 3078, 6);
                M = M;
                vyu0.a(aVar, a, null, a2, null, a3, M, i2 & 14, 10);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new xd0(this, aVar, i, 4);
            }
        }
    }

    /* compiled from: FormFieldScreenContent.kt */
    @b6l(c = "com.vk.design.demo.presentation.screens.FormFieldScreenContentKt$LegoComposeContent$1$1", f = "FormFieldScreenContent.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(2, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            h6v0 h6v0Var = h6v0.a;
            h6v0.b(true);
            return s3q0.a;
        }
    }

    /* compiled from: FormFieldScreenContent.kt */
    public static final class d implements k8s.a {
        public final /* synthetic */ v1z a;

        public d(v1z v1zVar) {
            this.a = v1zVar;
        }

        @Override // xsna.k8s.a
        public final void a(k8s.a aVar, androidx.compose.runtime.a aVar2, int i) {
            k8s.a aVar3;
            v1z v1zVar = this.a;
            wh50 wh50Var = v1zVar.j;
            androidx.compose.runtime.a M = aVar2.M(554389946);
            int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(554389946, i2, -1, "com.vk.design.demo.presentation.screens.LegoFormFieldGroupRow.<anonymous>.<anonymous>.<no name provided>.Content (FormFieldScreenContent.kt:361)");
                }
                aVar3 = aVar;
                vyu0.a(aVar3, t8s.u((String) ((zak0) wh50Var).getValue(), v1zVar.a(), ((Boolean) ((zak0) v1zVar.h).getValue()).booleanValue(), M, 0), null, t8s.w(((Boolean) ((zak0) v1zVar.a).getValue()).booleanValue(), ((Boolean) ((zak0) v1zVar.c).getValue()).booleanValue(), ((Boolean) ((zak0) v1zVar.g).getValue()).booleanValue(), (String) ((zak0) wh50Var).getValue(), false, M, 16), null, t8s.v(((Boolean) ((zak0) v1zVar.b).getValue()).booleanValue(), v1zVar.a(), M, 0), M, i2 & 14, 10);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar3 = aVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new n85(this, aVar3, i, 4);
            }
        }
    }

    /* compiled from: FormFieldScreenContent.kt */
    public static final class e implements k8s.a {
        public final /* synthetic */ v1z a;

        public e(v1z v1zVar) {
            this.a = v1zVar;
        }

        @Override // xsna.k8s.a
        public final void a(k8s.a aVar, androidx.compose.runtime.a aVar2, int i) {
            androidx.compose.runtime.a aVar3;
            androidx.compose.runtime.a aVar4;
            hly hlyVar;
            z61 z61Var;
            androidx.compose.runtime.a M = aVar2.M(-1748284879);
            int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1748284879, i2, -1, "com.vk.design.demo.presentation.screens.LegoFormFieldGroupRow.<anonymous>.<anonymous>.<no name provided>.Content (FormFieldScreenContent.kt:368)");
                }
                v1z v1zVar = this.a;
                u2x u = t8s.u((String) ((zak0) v1zVar.k).getValue(), false, ((Boolean) ((zak0) v1zVar.h).getValue()).booleanValue(), M, 48);
                vr9 vr9Var = null;
                if (((Boolean) ((zak0) v1zVar.l).getValue()).booleanValue()) {
                    M.K(1913747113);
                    hlyVar = h8s.a.a("Label", false, null, null, null, M, 196614, 30);
                    aVar4 = M;
                    aVar4.j();
                } else {
                    aVar4 = M;
                    aVar4.K(1913822380);
                    aVar4.j();
                    hlyVar = null;
                }
                if (((Boolean) ((zak0) v1zVar.f).getValue()).booleanValue()) {
                    aVar4.K(1913884536);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                    }
                    lg90 b = or.b(aVar4, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean J = aVar4.J(v1zVar);
                    Object x = aVar4.x();
                    if (J || x == a.C0011a.a) {
                        x = new myh(v1zVar, 15);
                        aVar4.R(x);
                    }
                    z61Var = e8s.a.C2787a.a(b, "Clear", (gzs) x, aVar4, 196664);
                    aVar4.j();
                } else {
                    aVar4.K(1914129900);
                    aVar4.j();
                    z61Var = null;
                }
                if (((Boolean) ((zak0) v1zVar.m).getValue()).booleanValue()) {
                    aVar4.K(1914192118);
                    vr9Var = t8s.v(true, false, aVar4, 54);
                    aVar4.j();
                } else {
                    aVar4.K(1914285644);
                    aVar4.j();
                }
                aVar3 = aVar4;
                vyu0.a(aVar, u, null, hlyVar, z61Var, vr9Var, aVar3, i2 & 14, 2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar3 = M;
                aVar3.h();
            }
            androidx.compose.runtime.f s = aVar3.s();
            if (s != null) {
                s.d = new rig(this, aVar, i, 1);
            }
        }
    }

    /* compiled from: FormFieldScreenContent.kt */
    @b6l(c = "com.vk.design.demo.presentation.screens.FormFieldScreenContentKt$LegoViewContent$1$1", f = "FormFieldScreenContent.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public f() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new f(2, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            h6v0 h6v0Var = h6v0.a;
            h6v0.b(true);
            return s3q0.a;
        }
    }

    /* compiled from: FormFieldScreenContent.kt */
    @b6l(c = "com.vk.design.demo.presentation.screens.FormFieldScreenContentKt$MilkshakeContent$1$1", f = "FormFieldScreenContent.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public g() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new g(2, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            h6v0 h6v0Var = h6v0.a;
            h6v0.b(false);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1596062306);
        int i2 = 1;
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1596062306, i, -1, "com.vk.design.demo.presentation.screens.ComposeFormFieldWithCheckBoxColumn (FormFieldScreenContent.kt:651)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new ecm(wh50Var, 10);
                M.R(x4);
            }
            e0c a2 = g8s.d.a.C2927a.a(12582966, 120, M, (gzs) x4, ((Boolean) wh50Var.getValue()).booleanValue());
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new m1i(wh50Var2, 13);
                M.R(x5);
            }
            e0c a3 = g8s.d.a.C2927a.a(12582966, 120, M, (gzs) x5, ((Boolean) wh50Var2.getValue()).booleanValue());
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new o8s(0, wh50Var3);
                M.R(x6);
            }
            List l = e43.l(a2, a3, g8s.d.a.C2927a.a(12582966, 120, M, (gzs) x6, ((Boolean) wh50Var3.getValue()).booleanValue()));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2093357976, 384, -1, "com.vk.core.compose.component.form.FormField.Content.Column.Companion.invoke (FormField.kt:187)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-809444722, 6, -1, "com.vk.core.compose.component.form.remember (ColumnImpl.kt:41)");
            }
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new m9g(l);
                M.R(x7);
            }
            m9g m9gVar = (m9g) x7;
            ((zak0) m9gVar.c).setValue(l);
            ((zak0) m9gVar.d).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            hly a4 = h8s.a.a("Title", true, null, null, null, M, 196662, 28);
            vr9 a5 = f8s.a.a("Caption", FormField$Style.Default, null, M, 3126, 4);
            M = M;
            nvu0.a(m9gVar, null, a4, null, a5, M, 0, 10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uki(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1758387792);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1758387792, i, -1, "com.vk.design.demo.presentation.screens.ComposeFormFieldWithCheckBoxRow (FormFieldScreenContent.kt:608)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new n8s(0, wh50Var);
                M.R(x4);
            }
            e0c a2 = g8s.d.a.C2927a.a(12582966, 120, M, (gzs) x4, ((Boolean) wh50Var.getValue()).booleanValue());
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new zc2(2, wh50Var2);
                M.R(x5);
            }
            e0c a3 = g8s.d.a.C2927a.a(12582966, 120, M, (gzs) x5, ((Boolean) wh50Var2.getValue()).booleanValue());
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new i36(1, wh50Var3);
                M.R(x6);
            }
            List l = e43.l(a2, a3, g8s.d.a.C2927a.a(12582966, 120, M, (gzs) x6, ((Boolean) wh50Var3.getValue()).booleanValue()));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1203341796, 384, -1, "com.vk.core.compose.component.form.FormField.Content.Row.Companion.invoke (FormField.kt:177)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2146846682, 6, -1, "com.vk.core.compose.component.form.remember (RowImpl.kt:41)");
            }
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new qpg0(l);
                M.R(x7);
            }
            qpg0 qpg0Var = (qpg0) x7;
            ((zak0) qpg0Var.c).setValue(l);
            ((zak0) qpg0Var.d).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            hly a4 = h8s.a.a("Title", true, null, null, null, M, 196662, 28);
            vr9 a5 = f8s.a.a("Caption", FormField$Style.Default, null, M, 3126, 4);
            M = M;
            nvu0.a(qpg0Var, null, a4, null, a5, M, 0, 10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r1d(i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-991120538);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-991120538, i, -1, "com.vk.design.demo.presentation.screens.ComposeFormFieldWithDropdown (FormFieldScreenContent.kt:533)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = e43.l("Option 1", "Option 2", "Option 3");
                M.R(x);
            }
            final List list = (List) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b("Option 1");
                M.R(x2);
            }
            final wh50 wh50Var = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            final wh50 wh50Var2 = (wh50) x3;
            String str = (String) wh50Var.getValue();
            boolean booleanValue = ((Boolean) wh50Var2.getValue()).booleanValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new q8s(0, wh50Var2);
                M.R(x4);
            }
            u2x a2 = g8s.b.a.a(s2x.b.a.b(str, booleanValue, (izs) x4, null, null, 0L, 0L, null, kai.c(489706929, new yzs() { // from class: xsna.r8s
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    int i2 = 16;
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(489706929, intValue, -1, "com.vk.design.demo.presentation.screens.ComposeFormFieldWithDropdown.<anonymous> (FormFieldScreenContent.kt:548)");
                        }
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630.a aVar3 = q630.a.a;
                        q630 c2 = qri.c(aVar2, aVar3);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a3, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c2, cri.a.d);
                        aVar2.K(-1565150602);
                        for (String str2 : list) {
                            q630 f2 = txj0.f(aVar3, 1.0f);
                            boolean J = aVar2.J(str2);
                            Object x5 = aVar2.x();
                            if (J || x5 == a.C0011a.a) {
                                x5 = new kfb(str2, wh50Var, wh50Var2, 2);
                                aVar2.R(x5);
                            }
                            androidx.compose.runtime.a aVar5 = aVar2;
                            yqv0.c(str2, s200.D(ojc.c(f2, false, null, null, (gzs) x5, 15), i2), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar5, 0, 0, 16380);
                            i2 = i2;
                            aVar2 = aVar5;
                            aVar3 = aVar3;
                        }
                        if (gp.d(aVar2)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, Z3.l), null, false, null, M, 24576, 14);
            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            hly a3 = h8s.a.a("Title", true, null, null, null, M, 196662, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b2 = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new w9(14);
                M.R(x5);
            }
            z61 a4 = e8s.a.C2787a.a(b2, "Remove field", (gzs) x5, M, 197048);
            vr9 a5 = f8s.a.a("Caption", FormField$Style.Default, null, M, 3126, 4);
            M = M;
            nvu0.a(a2, H, a3, a4, a5, M, 48, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lq2(i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(int i, androidx.compose.runtime.a aVar) {
        vr9 a2;
        androidx.compose.runtime.a M = aVar.M(-1079749763);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1079749763, i, -1, "com.vk.design.demo.presentation.screens.ComposeFormFieldWithInput (FormFieldScreenContent.kt:477)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a(null, 0L, 7, M);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b("");
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            tho0 tho0Var = (tho0) wh50Var.getValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new bp7(13, wh50Var, wh50Var2);
                M.R(x3);
            }
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x3, "Placeholder", 0L, 0L, null, null, null, null, null, false, null, M, Tensorflow.FRAME_WIDTH, 196608, 32760), ((String) wh50Var2.getValue()).length() > 0 ? InputSelect$State.Error : InputSelect$State.Default, false, null, M, 24576, 12);
            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            qzu0.a.getClass();
            lg90 c0 = qzu0.c0(M);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new xs6(8);
                M.R(x4);
            }
            hly a4 = h8s.a.a("Title", true, i8s.b.a.a(c0, (gzs) x4, M), i8s.a.AbstractC3037a.C3038a.a(((tho0) wh50Var.getValue()).a.c.length(), 10, null, M, 3120, 4), null, M, 196662, 16);
            if (((String) wh50Var2.getValue()).length() > 0) {
                M.K(-1813770432);
                a2 = f8s.a.a((String) wh50Var2.getValue(), FormField$Style.Error, null, M, 3120, 4);
                M.j();
            } else {
                M.K(-1813632358);
                a2 = f8s.a.a("Caption", FormField$Style.Default, null, M, 3126, 4);
                M.j();
            }
            nvu0.a(a3, H, a4, null, a2, M, 48, 8);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oq2(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-2070291099);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2070291099, i, -1, "com.vk.design.demo.presentation.screens.ComposeFormFieldsWithCheckBox (FormFieldScreenContent.kt:585)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new p8s(0, wh50Var);
                M.R(x2);
            }
            e0c a2 = g8s.d.a.C2927a.a(12586038, 112, M, (gzs) x2, booleanValue);
            hly a3 = h8s.a.a("Title", true, null, null, null, M, 196662, 28);
            vr9 a4 = f8s.a.a("Caption", FormField$Style.Default, null, M, 3126, 4);
            M = M;
            nvu0.a(a2, null, a3, null, a4, M, 0, 10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hkb(i, 4);
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1648705086);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1648705086, i, -1, "com.vk.design.demo.presentation.screens.ComposeHorizontalFormFieldGroup (FormFieldScreenContent.kt:694)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a(null, 0L, 7, M);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = or.a(null, 0L, 7, M);
            }
            wh50 wh50Var2 = (wh50) x2;
            q630 f2 = txj0.f(q630.a.a, 1.0f);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new k22(5, wh50Var, wh50Var2);
                M.R(x3);
            }
            vyu0.c(54, M, (izs) x3, f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zh3(i, 3);
        }
    }

    public static final void g(int i, int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-2128916936);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2128916936, i3, -1, "com.vk.design.demo.presentation.screens.Content (FormFieldScreenContent.kt:133)");
            }
            q630 D = p490.D(q630Var, p490.x(M), 14);
            a.j g2 = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g2, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (i == 0) {
                M.K(628389940);
                p(0, M);
                M.j();
            } else if (i != 1) {
                if (i != 2) {
                    M.K(-2000648320);
                } else {
                    M.K(628392307);
                    o(0, M);
                }
                M.j();
            } else {
                M.K(628391094);
                h(0, M);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g7g(i, q630Var, i2);
        }
    }

    public static final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1895386809);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1895386809, i, -1, "com.vk.design.demo.presentation.screens.LegoComposeContent (FormFieldScreenContent.kt:175)");
            }
            s3q0 s3q0Var = s3q0.a;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new c(2, null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            rrv0.a(null, null, xfi.d, M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bkh(i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1874980392);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1874980392, i, -1, "com.vk.design.demo.presentation.screens.LegoFormFieldBasic (FormFieldScreenContent.kt:749)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b("");
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            String str = (String) wh50Var.getValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new o1e(wh50Var, 24);
                M.R(x2);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.a(str, (izs) x2, "Placeholder", null, null, M, Tensorflow.FRAME_WIDTH, 32760), null, false, null, M, 24576, 14);
            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            qzu0.a.getClass();
            lg90 c0 = qzu0.c0(M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new com.vk.movika.sdk.base.model.props.d(24);
                M.R(x3);
            }
            hly a3 = h8s.a.a("Label", true, i8s.b.a.a(c0, (gzs) x3, M), i8s.a.AbstractC3037a.C3038a.a(0, 25, null, M, 3126, 4), null, M, 196662, 16);
            vr9 a4 = f8s.a.a("Caption", FormField$Style.Default, null, M, 3126, 4);
            M = M;
            nvu0.a(a2, H, a3, null, a4, M, 48, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nde(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0517, code lost:
    
        if (r5 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015b, code lost:
    
        if (r6 == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01eb, code lost:
    
        if (r1 == r6) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(v1z v1zVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        a.C0011a.C0012a c0012a;
        LayoutNode.a aVar2;
        a.C0011a.C0012a c0012a2;
        LayoutNode.a aVar3;
        LayoutNode.a aVar4;
        cri.a.e eVar;
        a.C0011a.C0012a c0012a3;
        v1z v1zVar2 = v1zVar;
        androidx.compose.runtime.a M = aVar.M(-1246298223);
        int i2 = i | (M.J(v1zVar2) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1246298223, i2, -1, "com.vk.design.demo.presentation.screens.LegoFormFieldControls (FormFieldScreenContent.kt:265)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar6 = q630.a.a;
            q630 c3 = qri.c(M, aVar6);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar6, true);
            boolean booleanValue = ((Boolean) ((zak0) v1zVar2.a).getValue()).booleanValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a4 = a.C0011a.a;
            if (z || x == c0012a4) {
                x = new h2s(v1zVar2, 1);
                M.R(x);
            }
            zov0.b(booleanValue, "Label", (izs) x, b2, null, false, false, M, 48, 112);
            q630 b3 = tpg0Var.b(1.0f, aVar6, true);
            boolean booleanValue2 = ((Boolean) ((zak0) v1zVar2.b).getValue()).booleanValue();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2) {
                c0012a = c0012a4;
            } else {
                c0012a = c0012a4;
            }
            x2 = new oce(v1zVar2, 25);
            M.R(x2);
            a.C0011a.C0012a c0012a5 = c0012a;
            zov0.b(booleanValue2, "Caption", (izs) x2, b3, null, false, false, M, 48, 112);
            M.G();
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, aVar6);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar2 = aVar5;
                M.I(aVar2);
            } else {
                aVar2 = aVar5;
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar2);
            LayoutNode.a aVar7 = aVar2;
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 b4 = tpg0Var.b(1.0f, aVar6, true);
            boolean booleanValue3 = ((Boolean) ((zak0) v1zVar2.c).getValue()).booleanValue();
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3) {
                c0012a2 = c0012a5;
            } else {
                c0012a2 = c0012a5;
            }
            x3 = new fre(v1zVar2, 25);
            M.R(x3);
            a.C0011a.C0012a c0012a6 = c0012a2;
            zov0.b(booleanValue3, "Required", (izs) x3, b4, null, false, false, M, 48, 112);
            q630 b5 = tpg0Var.b(1.0f, aVar6, true);
            boolean booleanValue4 = ((Boolean) ((zak0) v1zVar2.d).getValue()).booleanValue();
            boolean z4 = i3 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a6) {
                x4 = new omf(v1zVar2, 16);
                M.R(x4);
            }
            zov0.b(booleanValue4, "Icon", (izs) x4, b5, null, false, false, M, 48, 112);
            M.G();
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c5 = qri.c(M, aVar6);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar3 = aVar7;
                M.I(aVar3);
            } else {
                aVar3 = aVar7;
                M.f();
            }
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D4, eVar2);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b6 = tpg0Var.b(1.0f, aVar6, true);
            boolean a6 = v1zVar2.a();
            boolean z5 = i3 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a6) {
                x5 = new nhe(v1zVar2, 23);
                M.R(x5);
            }
            LayoutNode.a aVar8 = aVar3;
            zov0.b(a6, "Error", (izs) x5, b6, null, false, false, M, 48, 112);
            q630 b7 = tpg0Var.b(1.0f, aVar6, true);
            boolean booleanValue5 = ((Boolean) ((zak0) v1zVar2.f).getValue()).booleanValue();
            boolean z6 = i3 == 4;
            Object x6 = M.x();
            if (z6 || x6 == c0012a6) {
                x6 = new t1e(v1zVar2, 23);
                M.R(x6);
            }
            zov0.b(booleanValue5, "After Icon", (izs) x6, b7, null, false, false, M, 48, 112);
            M.G();
            androidx.compose.foundation.layout.k a7 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c6 = qri.c(M, aVar6);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar4 = aVar8;
                M.I(aVar4);
            } else {
                aVar4 = aVar8;
                M.f();
            }
            k9q0.w(M, a7, cVar);
            k9q0.w(M, D5, eVar2);
            ur.d(hashCode5, M, bVar, M, c2678a);
            k9q0.w(M, c6, dVar);
            q630 b8 = tpg0Var.b(1.0f, aVar6, true);
            boolean booleanValue6 = ((Boolean) ((zak0) v1zVar2.g).getValue()).booleanValue();
            boolean z7 = i3 == 4;
            Object x7 = M.x();
            if (z7 || x7 == c0012a6) {
                x7 = new m4g(v1zVar2, 22);
                M.R(x7);
            }
            LayoutNode.a aVar9 = aVar4;
            zov0.b(booleanValue6, "After Text", (izs) x7, b8, null, false, false, M, 48, 112);
            M.G();
            androidx.compose.foundation.layout.k a8 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode6 = Long.hashCode(n34.n(M));
            sy90 D6 = M.D();
            q630 c7 = qri.c(M, aVar6);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar9);
            } else {
                M.f();
            }
            k9q0.w(M, a8, cVar);
            k9q0.w(M, D6, eVar2);
            ur.d(hashCode6, M, bVar, M, c2678a);
            k9q0.w(M, c7, dVar);
            q630 b9 = tpg0Var.b(1.0f, aVar6, true);
            boolean booleanValue7 = ((Boolean) ((zak0) v1zVar.h).getValue()).booleanValue();
            boolean z8 = i3 == 4;
            Object x8 = M.x();
            if (z8 || x8 == c0012a6) {
                eVar = eVar2;
                x8 = new wze(v1zVar, 27);
                M.R(x8);
            } else {
                eVar = eVar2;
            }
            izs izsVar = (izs) x8;
            cri.a.e eVar3 = eVar;
            v1zVar2 = v1zVar;
            zov0.b(booleanValue7, "Befor Icon", izsVar, b9, null, false, false, M, 48, 112);
            M.G();
            if (((GroupMode) ((zak0) v1zVar2.i).getValue()) == GroupMode.Row) {
                M.K(-1377660783);
                w0n0.a(54, 0, M, "Right Field Controls", s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar6));
                androidx.compose.foundation.layout.k a9 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
                int hashCode7 = Long.hashCode(n34.n(M));
                sy90 D7 = M.D();
                q630 c8 = qri.c(M, aVar6);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar9);
                } else {
                    M.f();
                }
                k9q0.w(M, a9, cVar);
                k9q0.w(M, D7, eVar3);
                ur.d(hashCode7, M, bVar, M, c2678a);
                k9q0.w(M, c8, dVar);
                q630 b10 = tpg0Var.b(1.0f, aVar6, true);
                boolean booleanValue8 = ((Boolean) ((zak0) v1zVar2.l).getValue()).booleanValue();
                boolean z9 = i3 == 4;
                Object x9 = M.x();
                if (z9) {
                    c0012a3 = c0012a6;
                } else {
                    c0012a3 = c0012a6;
                }
                x9 = new r9k(v1zVar2, 10);
                M.R(x9);
                zov0.b(booleanValue8, "Label", (izs) x9, b10, null, false, false, M, 48, 112);
                q630 b11 = tpg0Var.b(1.0f, aVar6, true);
                boolean booleanValue9 = ((Boolean) ((zak0) v1zVar2.m).getValue()).booleanValue();
                boolean z10 = i3 == 4;
                Object x10 = M.x();
                if (z10 || x10 == c0012a3) {
                    x10 = new uoh(v1zVar2, 16);
                    M.R(x10);
                }
                zov0.b(booleanValue9, "Caption", (izs) x10, b11, null, false, false, M, 48, 112);
                M.G();
            } else {
                M.K(-1389005977);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wbi(v1zVar2, q630Var, i, 5);
        }
    }

    public static final void k(v1z v1zVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1578156530);
        int i2 = (M.J(v1zVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1578156530, i2, -1, "com.vk.design.demo.presentation.screens.LegoFormFieldDemoContent (FormFieldScreenContent.kt:349)");
            }
            if (((GroupMode) ((zak0) v1zVar.i).getValue()) == GroupMode.Row) {
                M.K(-2145672764);
                l(v1zVar, M, i2 & 14);
                M.j();
            } else {
                M.K(-2145623102);
                n(v1zVar, M, i2 & 14);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkg(v1zVar, i, 4);
        }
    }

    public static final void l(v1z v1zVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2107374299);
        int i2 = (M.J(v1zVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2107374299, i2, -1, "com.vk.design.demo.presentation.screens.LegoFormFieldGroupRow (FormFieldScreenContent.kt:358)");
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new pcg(v1zVar, 22);
                M.R(x);
            }
            vyu0.c(6, M, (izs) x, F);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nq1(v1zVar, i, 3);
        }
    }

    public static final void m(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(374384820);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(374384820, i, -1, "com.vk.design.demo.presentation.screens.LegoFormFieldInteractive (FormFieldScreenContent.kt:207)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1895071622, 0, -1, "com.vk.design.demo.presentation.screens.rememberLegoFormFieldInteractiveState (FormFieldScreenContent.kt:242)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new v1z();
                M.R(x);
            }
            v1z v1zVar = (v1z) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 16;
            q630.a aVar2 = q630.a.a;
            w0n0.a(54, 0, M, "Controls", s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2));
            j(v1zVar, s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), M, 48);
            List O0 = j5g.O0(GroupMode.h());
            GroupMode groupMode = (GroupMode) ((zak0) v1zVar.i).getValue();
            boolean J = M.J(v1zVar);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new dkg(v1zVar, 17);
                M.R(x2);
            }
            y9i0.b("Group", O0, groupMode, (izs) x2, s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), M, 24582, 0);
            k(v1zVar, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z2(i, 5);
        }
    }

    public static final void n(v1z v1zVar, androidx.compose.runtime.a aVar, int i) {
        z61 z61Var;
        wh50 wh50Var = v1zVar.j;
        androidx.compose.runtime.a M = aVar.M(-1349982385);
        int i2 = i | (M.J(v1zVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1349982385, i2, -1, "com.vk.design.demo.presentation.screens.LegoFormFieldStandalone (FormFieldScreenContent.kt:389)");
            }
            String str = (String) ((zak0) wh50Var).getValue();
            boolean a2 = v1zVar.a();
            boolean booleanValue = ((Boolean) ((zak0) v1zVar.h).getValue()).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1086326406, 0, -1, "com.vk.design.demo.presentation.screens.buildStandaloneFieldContent (FormFieldScreenContent.kt:425)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new qb(27);
                M.R(x);
            }
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.a(str, (izs) x, "Placeholder", null, y(booleanValue, M, 0), M, Tensorflow.FRAME_WIDTH, 30712), a2 ? InputSelect$State.Error : InputSelect$State.Default, false, null, M, 24576, 12);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
            hly w = w(((Boolean) ((zak0) v1zVar.a).getValue()).booleanValue(), ((Boolean) ((zak0) v1zVar.c).getValue()).booleanValue(), ((Boolean) ((zak0) v1zVar.g).getValue()).booleanValue(), (String) ((zak0) wh50Var).getValue(), ((Boolean) ((zak0) v1zVar.d).getValue()).booleanValue(), M, 0);
            if (((Boolean) ((zak0) v1zVar.f).getValue()).booleanValue()) {
                M.K(749022506);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                lg90 b2 = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean z = (i2 & 14) == 4;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new ocg(v1zVar, 21);
                    M.R(x2);
                }
                z61Var = e8s.a.C2787a.a(b2, "Clear", (gzs) x2, M, 196664);
                M.j();
            } else {
                M.K(749221742);
                M.j();
                z61Var = null;
            }
            nvu0.a(a3, F, w, z61Var, v(((Boolean) ((zak0) v1zVar.b).getValue()).booleanValue(), v1zVar.a(), M, 0), M, 48, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.w(v1zVar, i, 8);
        }
    }

    public static final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1376067574);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1376067574, i, -1, "com.vk.design.demo.presentation.screens.LegoViewContent (FormFieldScreenContent.kt:191)");
            }
            s3q0 s3q0Var = s3q0.a;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new f(2, null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            rrv0.a(null, null, xfi.e, M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f6g(i);
        }
    }

    public static final void p(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1873830189);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1873830189, i, -1, "com.vk.design.demo.presentation.screens.MilkshakeContent (FormFieldScreenContent.kt:148)");
            }
            s3q0 s3q0Var = s3q0.a;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new g(2, null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            float f2 = 16;
            q630.a aVar2 = q630.a.a;
            rzo0.a(54, 0, M, "Form Fields", s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2));
            d(0, M);
            c(0, M);
            rzo0.a(54, 0, M, "Form Fields Group", s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2));
            f(0, M);
            rzo0.a(54, 0, M, "Form Selection Controls", s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2));
            e(0, M);
            b(0, M);
            a(0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xpd(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0160, code lost:
    
        if (r6 == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ef, code lost:
    
        if (r1 == r6) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0463  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(fxt0 fxt0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        a.C0011a.C0012a c0012a;
        LayoutNode.a aVar2;
        a.C0011a.C0012a c0012a2;
        LayoutNode.a aVar3;
        cri.a.e eVar;
        a.C0011a.C0012a c0012a3;
        cri.a.d dVar;
        boolean z;
        Object x;
        fxt0 fxt0Var2 = fxt0Var;
        androidx.compose.runtime.a M = aVar.M(-667555943);
        int i2 = i | (M.J(fxt0Var2) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-667555943, i2, -1, "com.vk.design.demo.presentation.screens.ViewFormFieldControls (FormFieldScreenContent.kt:821)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c2, dVar2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar5 = q630.a.a;
            q630 c3 = qri.c(M, aVar5);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar2);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar5, true);
            wh50 wh50Var = fxt0Var2.a;
            wh50 wh50Var2 = fxt0Var2.i;
            boolean booleanValue = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a4 = a.C0011a.a;
            if (z2 || x2 == c0012a4) {
                x2 = new n6f(fxt0Var2, 26);
                M.R(x2);
            }
            zov0.b(booleanValue, "Label", (izs) x2, b2, null, false, false, M, 48, 112);
            q630 b3 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue2 = ((Boolean) ((zak0) fxt0Var2.b).getValue()).booleanValue();
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3) {
                c0012a = c0012a4;
            } else {
                c0012a = c0012a4;
            }
            x3 = new e2s(fxt0Var2, 1);
            M.R(x3);
            a.C0011a.C0012a c0012a5 = c0012a;
            zov0.b(booleanValue2, "Caption", (izs) x3, b3, null, false, false, M, 48, 112);
            M.G();
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, aVar5);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar2 = aVar4;
                M.I(aVar2);
            } else {
                aVar2 = aVar4;
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar2);
            LayoutNode.a aVar6 = aVar2;
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar2);
            q630 b4 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue3 = ((Boolean) ((zak0) fxt0Var2.c).getValue()).booleanValue();
            boolean z4 = i3 == 4;
            Object x4 = M.x();
            if (z4) {
                c0012a2 = c0012a5;
            } else {
                c0012a2 = c0012a5;
            }
            x4 = new i4h(fxt0Var2, 22);
            M.R(x4);
            a.C0011a.C0012a c0012a6 = c0012a2;
            zov0.b(booleanValue3, "Required", (izs) x4, b4, null, false, false, M, 48, 112);
            q630 b5 = tpg0Var.b(1.0f, aVar5, true);
            boolean b6 = fxt0Var2.b();
            boolean z5 = i3 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a6) {
                x5 = new n3i(fxt0Var2, 21);
                M.R(x5);
            }
            zov0.b(b6, "Error", (izs) x5, b5, null, false, false, M, 48, 112);
            M.G();
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c5 = qri.c(M, aVar5);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar3 = aVar6;
                M.I(aVar3);
            } else {
                aVar3 = aVar6;
                M.f();
            }
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D4, eVar2);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar2);
            q630 b7 = tpg0Var.b(1.0f, aVar5, true);
            boolean a6 = fxt0Var2.a();
            boolean z6 = i3 == 4;
            Object x6 = M.x();
            if (z6 || x6 == c0012a6) {
                x6 = new k0j(fxt0Var2, 14);
                M.R(x6);
            }
            LayoutNode.a aVar7 = aVar3;
            zov0.b(a6, "After Icon", (izs) x6, b7, null, false, false, M, 48, 112);
            M.G();
            androidx.compose.foundation.layout.k a7 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c6 = qri.c(M, aVar5);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            k9q0.w(M, a7, cVar);
            k9q0.w(M, D5, eVar2);
            ur.d(hashCode5, M, bVar, M, c2678a);
            k9q0.w(M, c6, dVar2);
            q630 b8 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue4 = ((Boolean) ((zak0) fxt0Var.f).getValue()).booleanValue();
            boolean z7 = i3 == 4;
            Object x7 = M.x();
            if (z7 || x7 == c0012a6) {
                eVar = eVar2;
                x7 = new f2s(fxt0Var, 1);
                M.R(x7);
            } else {
                eVar = eVar2;
            }
            izs izsVar = (izs) x7;
            cri.a.e eVar3 = eVar;
            zov0.b(booleanValue4, "After Text", izsVar, b8, null, false, false, M, 48, 112);
            M.G();
            androidx.compose.foundation.layout.k a8 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
            int hashCode6 = Long.hashCode(n34.n(M));
            sy90 D6 = M.D();
            q630 c7 = qri.c(M, aVar5);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            k9q0.w(M, a8, cVar);
            k9q0.w(M, D6, eVar3);
            ur.d(hashCode6, M, bVar, M, c2678a);
            k9q0.w(M, c7, dVar2);
            q630 b9 = tpg0Var.b(1.0f, aVar5, true);
            boolean booleanValue5 = ((Boolean) ((zak0) fxt0Var.g).getValue()).booleanValue();
            boolean z8 = i3 == 4;
            Object x8 = M.x();
            if (z8) {
                c0012a3 = c0012a6;
            } else {
                c0012a3 = c0012a6;
                if (x8 != c0012a3) {
                    dVar = dVar2;
                    a.C0011a.C0012a c0012a7 = c0012a3;
                    cri.a.d dVar3 = dVar;
                    fxt0Var2 = fxt0Var;
                    zov0.b(booleanValue5, "Befor Icon", (izs) x8, b9, null, false, false, M, 48, 112);
                    M.G();
                    List O0 = j5g.O0(GroupMode.h());
                    GroupMode groupMode = (GroupMode) ((zak0) wh50Var2).getValue();
                    z = i3 != 4;
                    x = M.x();
                    if (!z || x == c0012a7) {
                        x = new eqd(fxt0Var2, 20);
                        M.R(x);
                    }
                    float f2 = 16;
                    y9i0.b("Group", O0, groupMode, (izs) x, s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar5), M, 24582, 0);
                    M = M;
                    if (((GroupMode) ((zak0) wh50Var2).getValue()) != GroupMode.Row) {
                        M.K(-65076823);
                        w0n0.a(54, 0, M, "Right Field Controls", s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar5));
                        androidx.compose.foundation.layout.k a9 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 0);
                        int hashCode7 = Long.hashCode(n34.n(M));
                        sy90 D7 = M.D();
                        q630 c8 = qri.c(M, aVar5);
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar7);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a9, cVar);
                        k9q0.w(M, D7, eVar3);
                        ur.d(hashCode7, M, bVar, M, c2678a);
                        k9q0.w(M, c8, dVar3);
                        q630 b10 = tpg0Var.b(1.0f, aVar5, true);
                        boolean booleanValue6 = ((Boolean) ((zak0) fxt0Var2.j).getValue()).booleanValue();
                        boolean z9 = i3 == 4;
                        Object x9 = M.x();
                        if (z9 || x9 == c0012a7) {
                            x9 = new h6g(fxt0Var2, 17);
                            M.R(x9);
                        }
                        zov0.b(booleanValue6, "Label", (izs) x9, b10, null, false, false, M, 48, 112);
                        q630 b11 = tpg0Var.b(1.0f, aVar5, true);
                        boolean booleanValue7 = ((Boolean) ((zak0) fxt0Var2.k).getValue()).booleanValue();
                        boolean z10 = i3 == 4;
                        Object x10 = M.x();
                        if (z10 || x10 == c0012a7) {
                            x10 = new p4f(fxt0Var2, 25);
                            M.R(x10);
                        }
                        zov0.b(booleanValue7, "Caption", (izs) x10, b11, null, false, false, M, 48, 112);
                        M.G();
                    } else {
                        M.K(-94059777);
                    }
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            dVar = dVar2;
            x8 = new j6e(fxt0Var, 26);
            M.R(x8);
            a.C0011a.C0012a c0012a72 = c0012a3;
            cri.a.d dVar32 = dVar;
            fxt0Var2 = fxt0Var;
            zov0.b(booleanValue5, "Befor Icon", (izs) x8, b9, null, false, false, M, 48, 112);
            M.G();
            List O02 = j5g.O0(GroupMode.h());
            GroupMode groupMode2 = (GroupMode) ((zak0) wh50Var2).getValue();
            if (i3 != 4) {
            }
            x = M.x();
            if (!z) {
            }
            x = new eqd(fxt0Var2, 20);
            M.R(x);
            float f22 = 16;
            y9i0.b("Group", O02, groupMode2, (izs) x, s200.F(f22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar5), M, 24582, 0);
            M = M;
            if (((GroupMode) ((zak0) wh50Var2).getValue()) != GroupMode.Row) {
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn7(fxt0Var2, q630Var, i, 6);
        }
    }

    public static final void r(fxt0 fxt0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-849607003);
        int i2 = (M.J(fxt0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-849607003, i2, -1, "com.vk.design.demo.presentation.screens.ViewFormFieldDemo (FormFieldScreenContent.kt:906)");
            }
            if (((GroupMode) ((zak0) fxt0Var.i).getValue()) == GroupMode.Row) {
                M.K(-399826547);
                s(fxt0Var, M, i2 & 14);
                M.j();
            } else {
                M.K(-399751217);
                q630 f2 = txj0.f(q630.a.a, 1.0f);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new com.vk.movika.sdk.base.utils.b(25);
                    M.R(x);
                }
                izs izsVar = (izs) x;
                boolean z = (i2 & 14) == 4;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new nvg(fxt0Var, 23);
                    M.R(x2);
                }
                ae2.a(54, 0, M, izsVar, (izs) x2, f2);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ht7(fxt0Var, i, 5);
        }
    }

    public static final void s(fxt0 fxt0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1402236448);
        int i2 = (M.J(fxt0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1402236448, i2, -1, "com.vk.design.demo.presentation.screens.ViewFormFieldGroupRowDemo (FormFieldScreenContent.kt:977)");
            }
            q630 f2 = txj0.f(q630.a.a, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new g8(24);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new m1k(fxt0Var, 9);
                M.R(x2);
            }
            ae2.a(54, 0, M, izsVar, (izs) x2, f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.u(fxt0Var, i, 5);
        }
    }

    public static final void t(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1688260432);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1688260432, i, -1, "com.vk.design.demo.presentation.screens.ViewFormFieldInteractive (FormFieldScreenContent.kt:782)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2120519686, 0, -1, "com.vk.design.demo.presentation.screens.rememberViewFormFieldInteractiveState (FormFieldScreenContent.kt:799)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new fxt0();
                M.R(x);
            }
            fxt0 fxt0Var = (fxt0) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 16;
            q630.a aVar2 = q630.a.a;
            w0n0.a(54, 0, M, "Controls", s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2));
            q(fxt0Var, s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), M, 48);
            r(fxt0Var, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kxa(i);
        }
    }

    public static final u2x u(String str, boolean z, boolean z2, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1009874368, i, -1, "com.vk.design.demo.presentation.screens.buildGroupFieldContent (FormFieldScreenContent.kt:412)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new kjw0(1);
            aVar.R(x);
        }
        u2x a2 = g8s.b.a.a(s2x.a.C3649a.a(str, (izs) x, "Placeholder", null, y(z2, aVar, 0), aVar, Tensorflow.FRAME_WIDTH, 30712), z ? InputSelect$State.Error : InputSelect$State.Default, false, null, aVar, 24576, 12);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }

    public static final vr9 v(boolean z, boolean z2, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-339931083);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-339931083, i, -1, "com.vk.design.demo.presentation.screens.buildCaption (FormFieldScreenContent.kt:463)");
        }
        if (!z) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return null;
        }
        vr9 a2 = f8s.a.a(z2 ? "Error message" : "Caption", z2 ? FormField$Style.Error : FormField$Style.Default, null, aVar, 3072, 4);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    public static final hly w(boolean z, boolean z2, boolean z3, String str, boolean z4, androidx.compose.runtime.a aVar, int i) {
        fly flyVar;
        androidx.compose.runtime.a aVar2;
        aVar.K(-844931972);
        if ((i & 16) != 0) {
            z4 = false;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-844931972, 0, -1, "com.vk.design.demo.presentation.screens.buildLabel (FormFieldScreenContent.kt:444)");
        }
        bly blyVar = null;
        if (!z) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return null;
        }
        if (z4) {
            aVar.K(1435281937);
            qzu0.a.getClass();
            lg90 c0 = qzu0.c0(aVar);
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new vv0(18);
                aVar.R(x);
            }
            fly a2 = i8s.b.a.a(c0, (gzs) x, aVar);
            aVar.j();
            flyVar = a2;
        } else {
            aVar.K(1435461953);
            aVar.j();
            flyVar = null;
        }
        if (z3) {
            aVar.K(1435505323);
            blyVar = i8s.a.AbstractC3037a.C3038a.a(str.length(), 25, null, aVar, 3120, 4);
            aVar2 = aVar;
            aVar2.j();
        } else {
            aVar2 = aVar;
            aVar2.K(1435598849);
            aVar2.j();
        }
        hly a3 = h8s.a.a("Label", z2, flyVar, blyVar, null, aVar2, 196614, 16);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return a3;
    }

    public static final VkFormField x(Context context) {
        VkFormField vkFormField = new VkFormField(context, null, 6);
        vkFormField.setInHorizontalGroup(true);
        VkTextArea vkTextArea = new VkTextArea(context, null, 6);
        vkTextArea.setMiddle(new VkTextArea.d(12, oq.d(tlo0.Companion, ""), new tlo0.h("Placeholder")));
        vkFormField.addView(vkTextArea, new FrameLayout.LayoutParams(-1, -2));
        vkFormField.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        return vkFormField;
    }

    public static final tzy y(boolean z, androidx.compose.runtime.a aVar, int i) {
        tzy tzyVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(721628622, i, -1, "com.vk.design.demo.presentation.screens.getLeftContent (FormFieldScreenContent.kt:232)");
        }
        if (z) {
            aVar.K(1727076720);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2122257602, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-SearchOutline24> (VkIcons.kt:9652)");
            }
            lg90 b2 = or.b(aVar, 2037516774, R.drawable.vk_icon_search_outline_24, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            tzyVar = sv1.s(b2, "Search", 0L, aVar, 12);
            aVar.j();
        } else {
            aVar.K(1727209647);
            aVar.j();
            tzyVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return tzyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [xsna.cwg] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [xsna.gzs] */
    /* JADX WARN: Type inference failed for: r12v4, types: [xsna.z4f] */
    public static final void z(VkFormField vkFormField, u8s u8sVar, fxt0 fxt0Var, cwg cwgVar) {
        Drawable drawable;
        boolean z = u8sVar.e;
        String str = u8sVar.a;
        FrameLayout frameLayout = (FrameLayout) vkFormField.findViewById(R.id.vk_form_item_layout_container);
        View childAt = frameLayout != null ? frameLayout.getChildAt(1) : null;
        VkTextArea vkTextArea = childAt instanceof VkTextArea ? (VkTextArea) childAt : null;
        if (vkTextArea != null) {
            vkTextArea.setMiddle(new VkTextArea.d(12, oq.d(tlo0.Companion, str), new tlo0.h("Placeholder")));
        }
        if (vkTextArea != null) {
            vkTextArea.setBefore(u8sVar.d ? new VkTextArea.b.a(new gko(R.drawable.vk_icon_search_outline_24)) : null);
        }
        boolean z2 = u8sVar.g;
        if (z) {
            Context context = vkFormField.getContext();
            e3m.a aVar = e3m.a;
            drawable = m33.a(R.drawable.vk_icon_cross_large_outline_28, context);
        } else {
            drawable = null;
        }
        if (!z) {
            cwgVar = 0;
        } else if (cwgVar == 0) {
            cwgVar = new z4f(fxt0Var, 23);
        }
        vkFormField.setAfterIconButtonDrawable(drawable);
        vkFormField.setAfterIconButtonContentDescription("Clear");
        if (cwgVar != 0) {
            vkFormField.setOnAfterIconButtonClickListener(new z95(1, cwgVar));
        }
        vkFormField.setAfterIconButtonVisible(drawable != null);
        String str2 = "";
        if (u8sVar.b) {
            vkFormField.setLabel("Label");
            vkFormField.setRequired(u8sVar.h);
        } else {
            vkFormField.setLabel("");
            vkFormField.setRequired(false);
        }
        if (!u8sVar.c) {
            vkFormField.setError("");
            vkFormField.setCaption("");
        } else if (z2) {
            vkFormField.setError("Error message");
            vkFormField.setCaption("");
        } else {
            vkFormField.setError("");
            vkFormField.setCaption("Caption");
        }
        if (u8sVar.f) {
            str2 = str.length() + "/25";
        }
        vkFormField.setAfterText(str2);
        vkFormField.setError(z2);
        if (vkTextArea != null) {
            vkTextArea.setError(z2);
        }
    }
}
