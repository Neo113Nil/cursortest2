package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.editor.spoiler.tool.domain.stat.SpoilerStatEvent;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.Map;
import xsna.d5p;
import xsna.hmk0;
import xsna.tlo0;

/* compiled from: SpoilerTool.kt */
/* loaded from: classes18.dex */
public final class hmk0 extends m3p<dmk0> implements p290, v0g {
    public final v3p c;
    public final gmk0 d;
    public final boolean e;
    public final boolean f;
    public final nvg g;
    public View h;
    public VkCell i;
    public final b j = new b();
    public final qkd0 k = new qkd0(this, 9);

    /* compiled from: SpoilerTool.kt */
    public static final class a implements d5p.a<dmk0> {
        public final boolean a;
        public final boolean b;
        public final cwn c;
        public final nvg d;

        public a(boolean z, boolean z2, cwn cwnVar, nvg nvgVar) {
            this.a = z;
            this.b = z2;
            this.c = cwnVar;
            this.d = nvgVar;
        }

        @Override // xsna.d5p.a
        public final d5p<dmk0> a(v3p v3pVar) {
            androidx.lifecycle.j a = g5z.a(v3pVar.w());
            cwn cwnVar = this.c;
            hmk0 hmk0Var = new hmk0(v3pVar, new gmk0(v3pVar, a, cwnVar), this.a, this.b, this.d);
            cwnVar.e = new ux40(hmk0Var, 29);
            return hmk0Var;
        }
    }

    /* compiled from: SpoilerTool.kt */
    public final class b {
        public final imk0 a = new View.OnLayoutChangeListener() { // from class: xsna.imk0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                hmk0.b.this.a();
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [xsna.imk0] */
        public b() {
        }

        public final void a() {
            hmk0 hmk0Var = hmk0.this;
            gmk0 gmk0Var = hmk0Var.d;
            v3p v3pVar = hmk0Var.c;
            View view = hmk0Var.h;
            if (epx.f(view != null ? view.getParent() : null, v3pVar.getBottom()) || v3pVar.getBottom().getChildCount() == 1) {
                gmk0Var.d.setDonateBadgeVisibility(gmk0Var.b().b);
            } else {
                gmk0Var.d.setDonateBadgeVisibility(false);
            }
        }
    }

    /* compiled from: SpoilerTool.kt */
    public static final class c implements l290 {
        public final cmk0 a;

        public c(cmk0 cmk0Var) {
            this.a = cmk0Var;
        }

        @Override // xsna.l290
        public final View a() {
            return this.a;
        }

        @Override // xsna.l290
        public final View b() {
            return null;
        }

        @Override // xsna.l290
        public final View c() {
            return null;
        }
    }

    public hmk0(v3p v3pVar, gmk0 gmk0Var, boolean z, boolean z2, nvg nvgVar) {
        this.c = v3pVar;
        this.d = gmk0Var;
        this.e = z;
        this.f = z2;
        this.g = nvgVar;
    }

    @Override // xsna.m3p
    public final void G(dmk0 dmk0Var) {
        dmk0 dmk0Var2 = dmk0Var;
        gmk0 gmk0Var = this.d;
        cmk0 cmk0Var = gmk0Var.d;
        boolean z = dmk0Var2.a;
        gmk0Var.a();
        if (gmk0Var.e) {
            cmk0Var.setBlurImageVisibility(z);
            if (z && cmk0Var.c.getDrawable() == null) {
                gmk0Var.c();
            }
        }
        cmk0Var.setDonateBadgeVisibility(dmk0Var2.b);
    }

    public final dmk0 H() {
        g5p g5pVar = ((EditorState) this.c.d().b.b.getValue()).b.get(jmk0.a);
        dmk0 dmk0Var = g5pVar instanceof dmk0 ? (dmk0) g5pVar : null;
        return dmk0Var == null ? new dmk0(false, false, false, false) : dmk0Var;
    }

    public final String I(g5p g5pVar, g5p g5pVar2, int i, int i2, int i3) {
        if (!(g5pVar == null ? true : g5pVar instanceof dmk0)) {
            return null;
        }
        if (!(g5pVar2 == null ? true : g5pVar2 instanceof dmk0)) {
            return null;
        }
        dmk0 dmk0Var = (dmk0) g5pVar;
        dmk0 dmk0Var2 = (dmk0) g5pVar2;
        boolean z = (dmk0Var != null ? dmk0Var.a : false) != (dmk0Var2 != null ? dmk0Var2.a : false);
        boolean z2 = (dmk0Var != null ? dmk0Var.b : false) != (dmk0Var2 != null ? dmk0Var2.b : false);
        if (!z && !z2) {
            return null;
        }
        if (z && z2) {
            i = i3;
        } else if (!z) {
            i = i2;
        }
        return this.c.x().getString(i);
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean a0() {
        this.c.c(false);
        return true;
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        return I(g5pVar, g5pVar2, R.string.editor_history_spoiler_undo, R.string.editor_history_donate_undo, R.string.editor_history_spoiler_donate_undo);
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean f(ToolButton toolButton, Map map) {
        Object obj = map.get(jmk0.a);
        dmk0 dmk0Var = obj instanceof dmk0 ? (dmk0) obj : null;
        toolButton.setIndicatorActive((dmk0Var != null && dmk0Var.a) || (dmk0Var != null && dmk0Var.b));
        return true;
    }

    @Override // xsna.d5p
    public final f5p getId() {
        return jmk0.a;
    }

    @Override // xsna.d5p
    public final h5p<dmk0> getRenderer() {
        return new lbs();
    }

    @Override // xsna.d5p
    public final void k() {
        v3p v3pVar = this.c;
        v3pVar.b().b(SpoilerStatEvent.a.a);
        b bVar = this.j;
        hmk0.this.c.getBottom().removeOnLayoutChangeListener(bVar.a);
        gmk0 gmk0Var = this.d;
        gmk0Var.e = true;
        gmk0Var.a();
        boolean z = gmk0Var.b().a;
        if (z) {
            gmk0Var.c();
        }
        cmk0 cmk0Var = gmk0Var.d;
        cmk0Var.setToggleVisibility(true);
        cmk0Var.setBlurImageVisibility(z);
        cmk0Var.setTouchesEnabled(true);
        View inflate = LayoutInflater.from(v3pVar.x()).inflate(R.layout.feature_spoiler_bottom, (ViewGroup) v3pVar.getBottom(), false);
        dmk0 H = H();
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.donate_cell);
        vkCell.setVisibility(0);
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.donate_foto_toggle_title), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.f(R.string.donate_foto_toggle_subtitle), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.f((gzs) this.k, H.b, true), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        this.i = vkCell;
        ToolBottomView toolBottomView = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
        toolBottomView.setOnDoneClickListener(new iia0(this, 19));
        toolBottomView.setOnCancelClickListener(new lbc0(this, 16));
        v3pVar.getBottom().addView(inflate);
        this.h = inflate;
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean o() {
        return true;
    }

    @Override // xsna.d5p
    public final void p() {
        gmk0 gmk0Var = this.d;
        gmk0Var.e = false;
        cmk0 cmk0Var = gmk0Var.d;
        cmk0Var.setToggleVisibility(false);
        cmk0Var.setBlurImageVisibility(false);
        cmk0Var.setTouchesEnabled(false);
        View view = this.h;
        if (view != null) {
            this.c.getBottom().removeView(view);
        }
        this.h = null;
        if (H().b) {
            b bVar = this.j;
            hmk0.this.c.getBottom().addOnLayoutChangeListener(bVar.a);
            bVar.a();
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final void q() {
        b bVar = this.j;
        hmk0.this.c.getBottom().addOnLayoutChangeListener(bVar.a);
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        return I(g5pVar, g5pVar2, R.string.editor_history_spoiler_redo, R.string.editor_history_donate_redo, R.string.editor_history_spoiler_donate_redo);
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_Spoiler, R.style.EditorToolButton_Spoiler, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_spoiler));
        this.g.invoke(toolButton);
        return toolButton;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super dmk0> spjVar) {
        boolean z = this.f;
        boolean z2 = this.e;
        return new dmk0(z, z2, z, z2);
    }

    @Override // xsna.p290
    public final l290 x(Context context) {
        cmk0 cmk0Var = this.d.d;
        cmk0Var.setToggleOnClickListener(new qj8(this, 9));
        return new c(cmk0Var);
    }

    @Override // xsna.m3p, xsna.d5p
    public final void C() {
    }
}
