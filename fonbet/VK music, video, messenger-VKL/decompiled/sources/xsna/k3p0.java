package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.tlo0;

/* compiled from: ToolbarMenuDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class k3p0 {
    public final Context a;
    public final q3a b;
    public final sha c;
    public final y3l0 d;
    public final c9m0 e;
    public final ece0 f;
    public final in60 g;
    public final n7b0 h;

    /* compiled from: ToolbarMenuDelegateImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            UIBlockActionClearSection uIBlockActionClearSection;
            String str;
            k3p0 k3p0Var = (k3p0) this.receiver;
            UIBlockList uIBlockList = ((ToolbarRedesignVh) k3p0Var.d.c).v;
            if (uIBlockList != null && (uIBlockActionClearSection = uIBlockList.E) != null && (str = uIBlockActionClearSection.b) != null) {
                bfb bfbVar = new bfb(k3p0Var, str, uIBlockList, 6);
                sha shaVar = k3p0Var.c;
                if (shaVar != null) {
                    shaVar.a(k3p0Var.a, bfbVar).show();
                } else {
                    bfbVar.invoke();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: ToolbarMenuDelegateImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            k3p0 k3p0Var = (k3p0) this.receiver;
            k3p0Var.getClass();
            k3p0Var.c(new p7o());
            return s3q0.a;
        }
    }

    /* compiled from: ToolbarMenuDelegateImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            UIBlockActionEnterEditMode uIBlockActionEnterEditMode;
            String str;
            k3p0 k3p0Var = (k3p0) this.receiver;
            c9m0 c9m0Var = k3p0Var.e;
            UIBlockList uIBlockList = ((ToolbarRedesignVh) k3p0Var.d.c).v;
            if (uIBlockList != null && (uIBlockActionEnterEditMode = uIBlockList.C) != null && (str = uIBlockActionEnterEditMode.z) != null) {
                if (((Boolean) c9m0Var.invoke()).booleanValue()) {
                    k3p0Var.c(new qd3(str, null));
                    k3p0Var.c(new zra(EditorMode.EXIT_EDITOR_MODE, str));
                } else {
                    k3p0Var.c(new zra(EditorMode.ENTER_EDITOR_MODE, str));
                }
                k3p0Var.f.invoke(Boolean.valueOf(!((Boolean) c9m0Var.invoke()).booleanValue()));
            }
            return s3q0.a;
        }
    }

    /* compiled from: ToolbarMenuDelegateImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            y3l0 y3l0Var = ((k3p0) this.receiver).d;
            return s3q0.a;
        }
    }

    /* compiled from: ToolbarMenuDelegateImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            String str;
            k3p0 k3p0Var = (k3p0) this.receiver;
            UIBlockList uIBlockList = ((ToolbarRedesignVh) k3p0Var.d.c).v;
            if (uIBlockList != null && (str = uIBlockList.b) != null) {
                k3p0Var.c(new dq80(str));
            }
            return s3q0.a;
        }
    }

    public k3p0(Context context, q3a q3aVar, sha shaVar, y3l0 y3l0Var, c9m0 c9m0Var, ece0 ece0Var, in60 in60Var, n7b0 n7b0Var) {
        this.a = context;
        this.b = q3aVar;
        this.c = shaVar;
        this.d = y3l0Var;
        this.e = c9m0Var;
        this.f = ece0Var;
        this.g = in60Var;
        this.h = n7b0Var;
    }

    public final VkTopBar.a.b.C0877b a(s7p0 s7p0Var) {
        dko dkoVar = s7p0Var.a;
        tlo0.h d2 = oq.d(tlo0.Companion, s7p0Var.b);
        gzs<s3q0> gzsVar = s7p0Var.c ? s7p0Var.d : null;
        Integer num = s7p0Var.e;
        return new VkTopBar.a.b.C0877b(dkoVar, d2, gzsVar, null, num != null ? new b8g(dhr0.Y(num.intValue(), null)) : null, null, 40);
    }

    public final s7p0 b(int i, int i2, gzs gzsVar, boolean z) {
        if (z) {
            return new s7p0(new gko(i), this.a.getString(i2), true, gzsVar, Integer.valueOf(BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed));
        }
        return null;
    }

    public final void c(n3a n3aVar) {
        this.b.b(n3aVar, true);
    }

    public final void d(boolean z) {
        h(t7p0.a((t7p0) this.g.invoke(), null, null, b(R.drawable.vk_icon_delete_outline_28, R.string.accessibility_clear, new a(0, this, k3p0.class, "handleClearMenuItemClick", "handleClearMenuItemClick()V", 0), z), null, null, null, 59));
    }

    public final void e(boolean z, Boolean bool, dko dkoVar) {
        int i = epx.f(bool, Boolean.TRUE) ? R.drawable.vk_icon_download_cancel_outline_28 : R.drawable.vk_icon_download_outline_28;
        h(t7p0.a((t7p0) this.g.invoke(), null, null, null, null, null, !z ? null : new s7p0(dkoVar == null ? new gko(i) : dkoVar, this.a.getString(R.string.download), true, new b(0, this, k3p0.class, "handleDownloadAllMenuItemClick", "handleDownloadAllMenuItemClick()V", 0), Integer.valueOf(R.attr.vk_ui_icon_accent)), 31));
    }

    public final void f(boolean z) {
        Pair pair = ((Boolean) this.e.invoke()).booleanValue() ? new Pair(Integer.valueOf(R.drawable.vk_icon_done_outline_28), Integer.valueOf(R.string.accessibility_save)) : new Pair(Integer.valueOf(R.drawable.vk_icon_edit_outline_28), Integer.valueOf(R.string.accessibility_edit_list));
        h(t7p0.a((t7p0) this.g.invoke(), null, b(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), new c(0, this, k3p0.class, "handleEditMenuItemClick", "handleEditMenuItemClick()V", 0), z), null, null, null, null, 61));
    }

    public final void g(boolean z) {
        h(t7p0.a((t7p0) this.g.invoke(), null, null, null, null, b(R.drawable.vk_icon_sort_outline_28, R.string.accessibility_actions, new d(0, this, k3p0.class, "handleFiltersMenuItemClick", "handleFiltersMenuItemClick()V", 0), z), null, 47));
    }

    public final void h(t7p0 t7p0Var) {
        this.h.invoke(t7p0Var);
    }

    public final void i(boolean z) {
        h(t7p0.a((t7p0) this.g.invoke(), null, null, null, b(R.drawable.vk_icon_more_vertical_28, R.string.accessibility_actions, new e(0, this, k3p0.class, "handleOptionsMenuItemClick", "handleOptionsMenuItemClick()V", 0), z), null, null, 55));
    }
}
