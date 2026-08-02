package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.lifecycle.e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.h7u0;
import xsna.k5g0;
import xsna.q630;

/* compiled from: ReportBottomSheetDialog.kt */
/* loaded from: classes4.dex */
public final class a5g0 extends jmu0 {
    public static final /* synthetic */ int k1 = 0;
    public final hb0<String> h1 = registerForActivityResult(new d1p(), new hsc(this, 1));
    public final Object i1;
    public final Object j1;

    /* compiled from: ReportBottomSheetDialog.kt */
    public static final class a extends kmu0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, hk70 hk70Var, int i) {
            super(activity, tzp0.a(null, 3));
            gzs<s3q0> k5f0Var = (i & 2) != 0 ? new k5f0(1) : hk70Var;
            if (iah0.s(activity)) {
                K0(16);
            } else {
                K0(32);
            }
            a0(k5f0Var);
            T0();
            w();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new a5g0();
        }
    }

    /* compiled from: ReportBottomSheetDialog.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            n6g0 n6g0Var = (n6g0) this.receiver;
            String str = ((d6g0) n6g0Var.k.b.getValue()).d;
            if (str != null) {
                myc0.h(fai.t(n6g0Var), null, null, new i6g0(n6g0Var, str, null), 3);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ReportBottomSheetDialog.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            utk0 utk0Var = ((n6g0) this.receiver).f;
            utk0Var.getClass();
            utk0Var.i(null, str);
            return s3q0.a;
        }
    }

    /* compiled from: ReportBottomSheetDialog.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            n6g0 n6g0Var = (n6g0) this.receiver;
            n6g0Var.getClass();
            myc0.h(fai.t(n6g0Var), null, null, new k6g0(n6g0Var, null), 3);
            return s3q0.a;
        }
    }

    /* compiled from: ReportBottomSheetDialog.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            n6g0 n6g0Var = (n6g0) this.receiver;
            if (n6g0Var.h != -1) {
                myc0.h(fai.t(n6g0Var), null, null, new j6g0(n6g0Var, null), 3);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ReportBottomSheetDialog.kt */
    @b6l(c = "com.vk.overlaymenu.feature.report.ReportBottomSheetDialog$onCreate$1", f = "ReportBottomSheetDialog.kt", l = {59}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: ReportBottomSheetDialog.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ a5g0 b;

            public a(a5g0 a5g0Var) {
                this.b = a5g0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                k5g0 k5g0Var = (k5g0) obj;
                boolean z = k5g0Var instanceof k5g0.b;
                a5g0 a5g0Var = this.b;
                if (z) {
                    a5g0Var.h1.a(((k5g0.b) k5g0Var).a);
                } else {
                    if (!(k5g0Var instanceof k5g0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y290 y290Var = x290.j;
                    if (y290Var == null) {
                        y290Var = null;
                    }
                    long j = ((k5g0.a) k5g0Var).a;
                    tj8 tj8Var = y290Var.a;
                    o0w b = ((ImBridgeComponent) tj8Var.b).g5().b();
                    Context context = (Context) tj8Var.a;
                    Peer.Type type = Peer.Type.CHAT;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    b.d(Peer.a.e(j, type), context);
                    a5g0Var.dismiss();
                }
                return s3q0.a;
            }
        }

        public f(spj<? super f> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return a5g0.this.new f(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                a5g0 a5g0Var = a5g0.this;
                int i2 = a5g0.k1;
                z7f0 z7f0Var = ((n6g0) a5g0Var.j1.getValue()).m;
                a aVar = new a(a5g0.this);
                this.label = 1;
                if (caj0.k(z7f0Var.b, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: ReportBottomSheetDialog.kt */
    public static final class g implements e0.c {
        @Override // androidx.lifecycle.e0.c
        public final <T extends nyt0> T a(Class<T> cls) {
            return new n6g0();
        }

        @Override // androidx.lifecycle.e0.c
        public final nyt0 c(Class cls, fg50 fg50Var) {
            return new n6g0();
        }
    }

    public a5g0() {
        iia0 iia0Var = new iia0(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i1 = msy.a(lazyThreadSafetyMode, iia0Var);
        this.j1 = msy.a(lazyThreadSafetyMode, new lbc0(this, 11));
    }

    public static s3q0 eo(a5g0 a5g0Var, DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        return s3q0.a;
    }

    @Override // xsna.vpi
    public final void bo(b33 b33Var) {
        View decorView;
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) b33Var;
        Window window = bVar.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(37742015, rte0.n);
        }
        bVar.l = true;
        BottomSheetBehavior<FrameLayout> o = bVar.o();
        b5g0 b5g0Var = new b5g0(this);
        ArrayList<BottomSheetBehavior.d> arrayList = o.Z;
        arrayList.clear();
        arrayList.add(b5g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(864380337);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(864380337, 8, -1, "com.vk.overlaymenu.feature.report.ReportBottomSheetDialog.ThemedContent (ReportBottomSheetDialog.kt:105)");
        }
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = (n6g0) ((androidx.lifecycle.e0) this.i1.getValue()).a(n6g0.class);
            aVar.R(x);
        }
        n6g0 n6g0Var = (n6g0) x;
        d6g0 d6g0Var = (d6g0) nr2.u(n6g0Var.k, aVar).getValue();
        wh50 u = nr2.u(n6g0Var.g, aVar);
        boolean y = aVar.y(n6g0Var);
        Object x2 = aVar.x();
        if (y || x2 == obj) {
            Object bVar = new b(0, n6g0Var, n6g0.class, "onEditScreenshotClick", "onEditScreenshotClick()V", 0);
            aVar.R(bVar);
            x2 = bVar;
        }
        gzs gzsVar = (gzs) ((fcy) x2);
        boolean y2 = aVar.y(n6g0Var);
        Object x3 = aVar.x();
        if (y2 || x3 == obj) {
            Object cVar = new c(1, n6g0Var, n6g0.class, "onDescriptionChange", "onDescriptionChange(Ljava/lang/String;)V", 0);
            aVar.R(cVar);
            x3 = cVar;
        }
        izs izsVar = (izs) ((fcy) x3);
        boolean y3 = aVar.y(n6g0Var);
        Object x4 = aVar.x();
        if (y3 || x4 == obj) {
            Object dVar = new d(0, n6g0Var, n6g0.class, "onSendClick", "onSendClick()V", 0);
            aVar.R(dVar);
            x4 = dVar;
        }
        gzs gzsVar2 = (gzs) ((fcy) x4);
        boolean y4 = aVar.y(n6g0Var);
        Object x5 = aVar.x();
        if (y4 || x5 == obj) {
            Object eVar = new e(0, n6g0Var, n6g0.class, "onGoToChatClick", "onGoToChatClick()V", 0);
            aVar.R(eVar);
            x5 = eVar;
        }
        gzs gzsVar3 = (gzs) ((fcy) x5);
        boolean y5 = aVar.y(this);
        Object x6 = aVar.x();
        if (y5 || x6 == obj) {
            x6 = new zf20(this, 27);
            aVar.R(x6);
        }
        j5g0.e(d6g0Var, u, gzsVar, izsVar, gzsVar2, gzsVar3, (gzs) x6, txj0.f(q630.a.a, 1.0f), aVar, 12582912);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void fo(gzs<s3q0> gzsVar) {
        n6g0 n6g0Var = (n6g0) this.j1.getValue();
        if (!n6g0Var.i && ((CharSequence) n6g0Var.f.getValue()).length() <= 0) {
            gzsVar.invoke();
            return;
        }
        h7u0.a aVar = new h7u0.a(requireContext());
        aVar.g0(R.string.confirm);
        aVar.U(R.string.overlay_menu_confirm_exit_message);
        aVar.c0(R.string.overlay_menu_confirm_exit_positive, new y4g0(0, gzsVar));
        aVar.W(R.string.overlay_menu_confirm_exit_negative, new ofn(this, 1));
        aVar.c = true;
        aVar.a.n = new DialogInterface.OnCancelListener() { // from class: xsna.z4g0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i = a5g0.k1;
                ((com.google.android.material.bottomsheet.b) a5g0.this.s).o().X(3);
            }
        };
        aVar.m();
    }

    @Override // xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        fo(new j4(23, this, dialogInterface));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        myc0.h(g5z.a(this), null, null, new f(null), 3);
        if (bundle == null) {
            x290 x290Var = x290.a;
            Activity b2 = x290.b();
            if (b2 != null) {
                n6g0 n6g0Var = (n6g0) this.j1.getValue();
                n6g0Var.getClass();
                myc0.h(fai.t(n6g0Var), null, null, new h6g0(n6g0Var, b2, null), 3);
            }
        }
    }

    @Override // xsna.dw20, androidx.fragment.app.d
    public final int vn() {
        return dhr0.C().b ? R.style.OverlayMenuBottomSheetTooltipFixThemeLight : R.style.OverlayMenuBottomSheetTooltipFixThemeDark;
    }
}
