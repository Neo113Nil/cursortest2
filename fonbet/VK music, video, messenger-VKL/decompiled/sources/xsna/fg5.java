package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.autoenhance.AutoEnhanceMessage$Source;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.bg5;
import xsna.d5p;
import xsna.go5;
import xsna.qbk;

/* compiled from: AutoEnhanceTool.kt */
/* loaded from: classes4.dex */
public final class fg5 extends m3p<ag5> implements v0g {
    public final ig5 c;
    public final v3p d;
    public View e;
    public TextView f;
    public DashedSeekBar g;
    public final Map<f5p, d5p.a<?>> h;

    /* compiled from: AutoEnhanceTool.kt */
    public static final class a implements d5p.a<ag5> {
        @Override // xsna.d5p.a
        public final d5p<ag5> a(v3p v3pVar) {
            vyt0 vyt0Var = new vyt0(v3pVar.getViewModelStore(), new kg5(v3pVar.d()), qbk.a.b);
            rfc a = fpf0.a(ig5.class);
            String h = a.h();
            if (h != null) {
                return new fg5((ig5) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a), g5z.a(v3pVar.w()), v3pVar);
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }

    public fg5(ig5 ig5Var, androidx.lifecycle.j jVar, v3p v3pVar) {
        this.c = ig5Var;
        this.d = v3pVar;
        List<n2k0> list = r0g.a;
        this.h = on00.f(new Pair(y2g.a, new q0g()));
        dg5 dg5Var = ig5Var.c;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1((dg5Var == null ? null : dg5Var).b, new eg5(2, this, fg5.class, "updateViewWithCurrentState", "updateViewWithCurrentState(Lcom/vk/photo/editor/ivm/autoenhance/AutoEnhanceState;)V", 4)), jVar);
    }

    @Override // xsna.m3p, xsna.d5p
    public final Map<f5p, d5p.a<?>> E() {
        return this.h;
    }

    @Override // xsna.m3p
    public final /* bridge */ /* synthetic */ void G(ag5 ag5Var) {
    }

    public final void H(cg5 cg5Var) {
        DashedSeekBar dashedSeekBar;
        float f = cg5Var.a;
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(String.valueOf((int) f));
        }
        if (cg5Var.b != AutoEnhanceMessage$Source.Synthetic || (dashedSeekBar = this.g) == null) {
            return;
        }
        dashedSeekBar.a(f, false);
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        if (!(g5pVar == null ? true : g5pVar instanceof ag5)) {
            return null;
        }
        if (!(g5pVar2 != null ? g5pVar2 instanceof ag5 : true)) {
            return null;
        }
        v3p v3pVar = this.d;
        if (g5pVar2 != null) {
            ag5 ag5Var = (ag5) g5pVar2;
            if (!ag5Var.I()) {
                return (g5pVar == null || ((ag5) g5pVar).I()) ? v3pVar.x().getString(R.string.editor_history_auto_redo) : v3pVar.x().getString(R.string.editor_history_auto_intensity, Integer.valueOf((int) ag5Var.a));
            }
        }
        return v3pVar.x().getString(R.string.editor_history_auto_undo);
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return hg5.a;
    }

    @Override // xsna.d5p
    public final h5p getRenderer() {
        return new alk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [xsna.dg5] */
    @Override // xsna.d5p
    public final void k() {
        v3p v3pVar = this.d;
        v3pVar.b().b(go5.c.a);
        View inflate = LayoutInflater.from(v3pVar.getView().getContext()).inflate(R.layout.feature_auto, (ViewGroup) v3pVar.getBottom(), false);
        v3pVar.getBottom().addView(inflate);
        ToolBottomView toolBottomView = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
        toolBottomView.setOnCancelClickListener(new in0(this, 5));
        toolBottomView.setOnDoneClickListener(new z4(this, 8));
        this.f = (TextView) inflate.findViewById(R.id.auto_value_tv);
        DashedSeekBar dashedSeekBar = (DashedSeekBar) inflate.findViewById(R.id.seekbar_filter_enhance);
        this.g = dashedSeekBar;
        dashedSeekBar.setOnSeekBarChangeListener(new gg5(this));
        ig5 ig5Var = this.c;
        dg5 dg5Var = ig5Var.c;
        if (dg5Var == null) {
            dg5Var = null;
        }
        H((cg5) dg5Var.b.b.getValue());
        com.vk.photo.editor.ivm.d dVar = ig5Var.b;
        if (dVar == null) {
            dVar = null;
        }
        Map<f5p, g5p> map = ((EditorState) dVar.b.b.getValue()).b;
        hg5 hg5Var = hg5.a;
        g5p g5pVar = map.get(hg5Var);
        if ((g5pVar instanceof ag5 ? (ag5) g5pVar : null) == null) {
            dg5 dg5Var2 = ig5Var.c;
            if (dg5Var2 == null) {
                dg5Var2 = null;
            }
            if (((cg5) dg5Var2.b.b.getValue()).a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ?? r0 = ig5Var.c;
                (r0 != 0 ? r0 : null).a.d(new bg5.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AutoEnhanceMessage$Source.Synthetic));
                this.e = inflate;
            }
        }
        com.vk.photo.editor.ivm.d dVar2 = ig5Var.b;
        if (dVar2 == null) {
            dVar2 = null;
        }
        g5p g5pVar2 = ((EditorState) dVar2.b.b.getValue()).b.get(hg5Var);
        ag5 ag5Var = g5pVar2 instanceof ag5 ? (ag5) g5pVar2 : null;
        if (ag5Var != null && ag5Var.I()) {
            com.vk.photo.editor.ivm.d dVar3 = ig5Var.b;
            (dVar3 != null ? dVar3 : null).a(new EditorMessage.i(new ag5(100.0f), EditorMessage.Source.Synthetic, 4));
        }
        this.e = inflate;
    }

    @Override // xsna.d5p
    public final void p() {
        View view = this.e;
        if (view != null) {
            this.d.getBottom().removeView(view);
            this.e = null;
        }
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        if (!(g5pVar2 == null ? true : g5pVar2 instanceof ag5)) {
            return null;
        }
        if (!(g5pVar != null ? g5pVar instanceof ag5 : true)) {
            return null;
        }
        v3p v3pVar = this.d;
        if (g5pVar == null || ((ag5) g5pVar).I()) {
            return v3pVar.x().getString(R.string.editor_history_auto_redo);
        }
        if (g5pVar2 != null) {
            ag5 ag5Var = (ag5) g5pVar2;
            if (!ag5Var.I()) {
                return v3pVar.x().getString(R.string.editor_history_auto_intensity, Integer.valueOf((int) ag5Var.a));
            }
        }
        return v3pVar.x().getString(R.string.editor_history_auto_undo);
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_Auto, R.style.EditorToolButton_Auto, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_auto));
        return toolButton;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super ag5> spjVar) {
        return new ag5(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
