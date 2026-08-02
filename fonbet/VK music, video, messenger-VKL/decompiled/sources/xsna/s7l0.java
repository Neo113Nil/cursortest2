package xsna;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.photo.editor.features.markup.internal.utils.State;
import com.vk.photo.editor.markup.view.tools.button.RemoveButton;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.d5p;
import xsna.z6l0;

/* compiled from: StickerTool.kt */
/* loaded from: classes4.dex */
public final class s7l0 extends m3p<q5l0> implements p290, qkp0, v0g {
    public final d6l0 c;
    public final v3p d;
    public ToolBottomView e;
    public View f;
    public AnimatorSet g;
    public View h;
    public RemoveButton i;
    public View j;
    public final int[] k = {0, 0};
    public final Rect l = new Rect();
    public State m = State.Add;
    public final c5p n;
    public final tf10 o;
    public final bbp p;
    public final heq q;

    /* compiled from: StickerTool.kt */
    public static final class a implements d5p.a<q5l0> {
        public final d6l0 a;

        public a(d6l0 d6l0Var) {
            this.a = d6l0Var;
        }

        @Override // xsna.d5p.a
        public final d5p<q5l0> a(v3p v3pVar) {
            return new s7l0(this.a, v3pVar);
        }
    }

    /* compiled from: StickerTool.kt */
    public static final class b implements l290 {
        public final heq a;
        public final ddp0 b;
        public final bbp c;

        public b(s7l0 s7l0Var, Context context) {
            heq heqVar = s7l0Var.q;
            this.a = heqVar;
            ddp0 ddp0Var = new ddp0(context);
            ddp0Var.setDelegate(heqVar);
            this.b = ddp0Var;
            this.c = s7l0Var.p;
        }

        @Override // xsna.l290
        public final View a() {
            return this.a;
        }

        @Override // xsna.l290
        public final View b() {
            return this.c;
        }

        @Override // xsna.l290
        public final View c() {
            return this.b;
        }
    }

    /* compiled from: StickerTool.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements yzs<String, Bitmap, f5l0, s3q0> {
        @Override // xsna.yzs
        public final s3q0 invoke(String str, Bitmap bitmap, f5l0 f5l0Var) {
            String str2 = str;
            Bitmap bitmap2 = bitmap;
            f5l0 f5l0Var2 = f5l0Var;
            s7l0 s7l0Var = (s7l0) this.receiver;
            s7l0Var.getClass();
            kif0 kif0Var = new kif0(bitmap2.getWidth(), bitmap2.getHeight());
            if (!kif0Var.equals(kif0.c)) {
                xb7 xb7Var = new xb7(str2, bitmap2, kif0Var, f5l0Var2);
                mv10 provide = s7l0Var.d.r().provide();
                hif0 hif0Var = provide.d;
                boolean z = provide.g;
                kif0 D = edi.D(hif0Var);
                float f = D.a;
                float f2 = D.b;
                hif0 hif0Var2 = provide.f;
                PointF pointF = hif0Var2.a;
                float f3 = pointF.x;
                PointF pointF2 = hif0Var2.c;
                float f4 = 2;
                float f5 = (f3 + pointF2.x) / f4;
                float f6 = (pointF.y + pointF2.y) / f4;
                float floor = f - ((int) Math.floor(32 * Resources.getSystem().getDisplayMetrics().density));
                kif0 D2 = edi.D(hif0Var2);
                float f7 = D2.a;
                float f8 = D2.b;
                float f9 = floor * f8 < f2 * f7 ? f8 / f2 : f7 / floor;
                xb7Var.h();
                kif0 kif0Var2 = xb7Var.i;
                xb7Var.e(f5 - (kif0Var2.a / 2.0f), f6 - (kif0Var2.b / 2.0f));
                xb7Var.f((floor / 2.0f) / bitmap2.getWidth(), f5, f6);
                xb7Var.f(f9, f5, f6);
                xb7Var.g(nn10.c(provide.b), f5, f6);
                xb7Var.c().postScale(z ? -1.0f : 1.0f, 1.0f, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                vlo d = s7l0Var.p.d();
                s7l0Var.I(vlo.a(d, j5g.v0(xb7Var, d.a)));
            }
            return s3q0.a;
        }
    }

    public s7l0(d6l0 d6l0Var, v3p v3pVar) {
        bbp bbpVar;
        s7l0 s7l0Var;
        this.c = d6l0Var;
        this.d = v3pVar;
        this.h = new View(v3pVar.x());
        ov10 r = v3pVar.r();
        this.n = v3pVar.b();
        tf10 tf10Var = (tf10) v3pVar.g(uf10.a).h();
        tf10Var = (tf10Var == null || !tf10Var.a(t7l0.a)) ? null : tf10Var;
        this.o = tf10Var;
        if (tf10Var == null || (bbpVar = tf10Var.e()) == null) {
            bbpVar = new bbp(v3pVar.x());
            s7l0Var = this;
            bbpVar.setOnViewResized(new p8(1, s7l0Var, s7l0.class, "updateParams", "updateParams(Lcom/vk/photo/editor/markup/state/DrawingState;)V", 0, 9));
        } else {
            s7l0Var = this;
        }
        s7l0Var.p = bbpVar;
        heq heqVar = new heq(v3pVar.x());
        heqVar.setMediaPropertiesProvider(r);
        heqVar.setHandleTouchesFromDelegate(true);
        heqVar.setListener(this);
        fyt0.m(bbpVar, heqVar.getDrawView());
        s7l0Var.q = heqVar;
    }

    @Override // xsna.m3p, xsna.d5p
    public final void C() {
        View view = this.f;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            fyt0.i(viewGroup);
        }
        this.c.b();
        View view2 = this.h;
        ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup2 != null) {
            fyt0.j(viewGroup2, new xht(28));
        }
    }

    @Override // xsna.m3p
    public final void G(q5l0 q5l0Var) {
        q5l0 q5l0Var2 = q5l0Var;
        if (this.o == null) {
            this.p.b(q5l0Var2.a);
        }
    }

    public final void H() {
        bbp bbpVar = this.p;
        bbpVar.setTouchesEnabled(false);
        heq heqVar = this.q;
        heqVar.setTouchesEnabled(false);
        bbpVar.setExternalModifier(null);
        veq veqVar = heqVar.b.f;
        if (veqVar != null) {
            veqVar.finish();
        }
        bbpVar.c(true);
        I(bbpVar.d());
    }

    public final void I(vlo vloVar) {
        tf10 tf10Var = this.o;
        if (tf10Var != null) {
            tf10Var.b(vloVar);
        } else {
            this.d.s(new q5l0(vloVar));
        }
    }

    public final void J(State state) {
        if (state == this.m) {
            return;
        }
        Object[] objArr = {this.i, this.h};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                return;
            }
        }
        this.m = state;
        RemoveButton removeButton = this.i;
        if (removeButton == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.h.setPivotY(r0.getMeasuredHeight() - (this.c.a() / 2.0f));
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet a2 = yq2.a(removeButton, this.h, this.m);
        we2.a(a2, new tsk0(this, 2));
        a2.start();
        this.g = a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // xsna.m3p, xsna.d5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0() {
        boolean z;
        x6a0 x6a0Var = this.c.c;
        afi0 afi0Var = x6a0Var.c0;
        if (afi0Var == null || !afi0Var.e()) {
            VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = x6a0Var.K;
            if (vkBottomSheetBehavior.i == 4) {
                z = false;
                if (!z) {
                    H();
                    this.d.c(false);
                }
                return !z;
            }
            vkBottomSheetBehavior.J(4);
            if (afi0Var != null) {
                afi0Var.c();
            }
        } else {
            afi0Var.a();
        }
        z = true;
        if (!z) {
        }
        if (!z) {
        }
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean f(ToolButton toolButton, Map map) {
        vlo a2;
        Object obj = map.get(t7l0.a);
        q5l0 q5l0Var = null;
        bo00 bo00Var = obj instanceof q5l0 ? (q5l0) obj : null;
        if (this.o != null) {
            Object obj2 = map.get(uf10.a);
            bo00Var = obj2 instanceof bo00 ? (bo00) obj2 : null;
        }
        if (bo00Var != null && (a2 = bo00Var.a()) != null) {
            q5l0Var = new q5l0(a2);
        }
        boolean z = false;
        if (q5l0Var != null && !q5l0Var.I()) {
            z = true;
        }
        toolButton.setIndicatorActive(z);
        return true;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return t7l0.a;
    }

    @Override // xsna.d5p
    public final h5p getRenderer() {
        return new pli(14);
    }

    @Override // xsna.d5p
    public final void k() {
        d6l0 d6l0Var = this.c;
        w860 w860Var = d6l0Var.b;
        v3p v3pVar = this.d;
        View inflate = LayoutInflater.from(v3pVar.x()).inflate(R.layout.feature_sticker_bottom_panel, (ViewGroup) v3pVar.getBottom(), false);
        this.i = (RemoveButton) inflate.findViewById(R.id.remove_sticker_button);
        View findViewById = inflate.findViewById(R.id.space_view);
        this.j = findViewById;
        if (findViewById != null) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), (int) d6l0Var.a());
        }
        ToolBottomView toolBottomView = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
        this.e = toolBottomView;
        if (toolBottomView != null) {
            toolBottomView.setOnDoneClickListener(new dei0(this, 7));
        }
        ToolBottomView toolBottomView2 = this.e;
        if (toolBottomView2 != null) {
            toolBottomView2.setOnCancelClickListener(new yu60(this, 28));
        }
        v3pVar.getBottom().addView(inflate);
        this.f = inflate;
        bbp bbpVar = this.p;
        bbpVar.setTouchesEnabled(true);
        heq heqVar = this.q;
        bbpVar.setExternalModifier(heqVar);
        heqVar.setTouchesEnabled(true);
        this.m = State.Add;
        x6a0 x6a0Var = new x6a0(bwt0.u(d6l0Var.a), w860Var);
        x6a0Var.setPermittedClickableStickers(EmptySet.b);
        x6a0Var.O.e(x6a0Var.Q.getCurrentItem());
        d6l0Var.c = x6a0Var;
        this.h = x6a0Var;
        fyt0.a(v3pVar.v(), this.h, 0, null, 6);
        fyt0.k(81, this.h);
        v3pVar.v().setTranslationY(d6l0Var.a());
        w860Var.d = new c(3, this, s7l0.class, "onNewStickerElement", "onNewStickerElement(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/vk/photo/editor/features/markup/sticker/model/stat/StickerMeta;)V", 0);
        this.n.b(z6l0.a.a);
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean o() {
        return true;
    }

    @Override // xsna.d5p
    public final void p() {
        View view = this.f;
        v3p v3pVar = this.d;
        if (view != null) {
            v3pVar.getBottom().removeView(view);
        }
        v3pVar.v().removeView(this.h);
        this.i = null;
        this.e = null;
        bbp bbpVar = this.p;
        bbpVar.setTouchesEnabled(false);
        this.q.setTouchesEnabled(false);
        bbpVar.setExternalModifier(null);
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_Sticker, R.style.EditorToolButton_Sticker, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_sticker));
        return toolButton;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super q5l0> spjVar) {
        return new q5l0(0);
    }

    @Override // xsna.p290
    public final l290 x(Context context) {
        return new b(this, context);
    }

    @Override // xsna.qkp0
    public final void z(uap uapVar, MotionEvent motionEvent) {
        RemoveButton removeButton = this.i;
        int[] iArr = this.k;
        if (removeButton != null) {
            removeButton.getLocationOnScreen(iArr);
        }
        int i = iArr[0];
        int i2 = iArr[1];
        int floor = (int) Math.floor(16 * Resources.getSystem().getDisplayMetrics().density);
        int i3 = i - floor;
        int i4 = i2 - floor;
        int i5 = i + floor;
        RemoveButton removeButton2 = this.i;
        int measuredWidth = i5 + (removeButton2 != null ? removeButton2.getMeasuredWidth() : 0);
        int i6 = floor + i2;
        RemoveButton removeButton3 = this.i;
        int measuredHeight = i6 + (removeButton3 != null ? removeButton3.getMeasuredHeight() : 0);
        Rect rect = this.l;
        rect.set(i3, i4, measuredWidth, measuredHeight);
        boolean z = rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && motionEvent.getPointerCount() == 1;
        RemoveButton removeButton4 = this.i;
        if (removeButton4 != null) {
            removeButton4.setActive(z);
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (motionEvent.getPointerCount() == 1) {
                    J(State.Remove);
                    return;
                } else {
                    J(State.Add);
                    return;
                }
            }
            if (action != 3) {
                return;
            }
        }
        if (z) {
            vlo d = this.p.d();
            ArrayList arrayList = new ArrayList(d.a);
            arrayList.remove(uapVar);
            I(vlo.a(d, arrayList));
            RemoveButton removeButton5 = this.i;
            if (removeButton5 != null) {
                removeButton5.setActive(false);
            }
        }
        J(State.Add);
    }

    @Override // xsna.qkp0
    public final void w(uap uapVar) {
    }
}
