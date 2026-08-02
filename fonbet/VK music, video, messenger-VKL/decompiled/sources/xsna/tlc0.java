package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PostingSettingsDialogDelegate.kt */
/* loaded from: classes4.dex */
public final class tlc0 {
    public final fkc0 a;
    public final sdc0 b;
    public final dxb0 c;
    public final dxb0 d;
    public VkContextMenu e;
    public VkContextMenu f;
    public final List<exb0> g;
    public final List<exb0> h;

    /* compiled from: PostingSettingsDialogDelegate.kt */
    public static final class a implements fux<exb0> {
        public a() {
        }

        @Override // xsna.fux
        public final void li(int i, Object obj) {
            sdc0 sdc0Var;
            int i2 = ((exb0) obj).a;
            tlc0 tlc0Var = tlc0.this;
            if (i2 == 0) {
                fkc0 fkc0Var = tlc0Var.a;
                if (fkc0Var != null) {
                    fkc0Var.d();
                }
            } else if (i2 == 1) {
                fkc0 fkc0Var2 = tlc0Var.a;
                if (fkc0Var2 != null) {
                    fkc0Var2.e();
                }
            } else if (i2 == 2) {
                sdc0 sdc0Var2 = tlc0Var.b;
                if (sdc0Var2 != null) {
                    sdc0Var2.y0();
                }
            } else if (i2 == 3 && (sdc0Var = tlc0Var.b) != null) {
                sdc0Var.q0();
            }
            VkContextMenu vkContextMenu = tlc0Var.e;
            if (vkContextMenu != null) {
                vkContextMenu.b();
            }
            VkContextMenu vkContextMenu2 = tlc0Var.f;
            if (vkContextMenu2 != null) {
                vkContextMenu2.b();
            }
        }
    }

    public tlc0() {
        this(null, null);
    }

    public final void a(View view) {
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        bVar.l = this.d;
        this.f = bVar.j();
    }

    public final void b(View view) {
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        bVar.l = this.c;
        this.e = bVar.j();
    }

    public tlc0(fkc0 fkc0Var, sdc0 sdc0Var) {
        this.a = fkc0Var;
        this.b = sdc0Var;
        Context context = e43.a;
        exb0 exb0Var = new exb0(0, (context == null ? null : context).getString(R.string.posting_postpone_change));
        Context context2 = e43.a;
        List<exb0> l = e43.l(exb0Var, new exb0(1, (context2 == null ? null : context2).getString(R.string.posting_postpone_remove)));
        this.g = l;
        Context context3 = e43.a;
        exb0 exb0Var2 = new exb0(2, (context3 == null ? null : context3).getString(R.string.posting_settings_change_copyright));
        Context context4 = e43.a;
        List<exb0> l2 = e43.l(exb0Var2, new exb0(3, (context4 != null ? context4 : null).getString(R.string.posting_settings_delete_copyright)));
        this.h = l2;
        a aVar = new a();
        dxb0 dxb0Var = new dxb0(aVar);
        this.c = dxb0Var;
        ArrayList<exb0> arrayList = dxb0Var.d;
        arrayList.clear();
        arrayList.addAll(l);
        dxb0Var.notifyDataSetChanged();
        dxb0 dxb0Var2 = new dxb0(aVar);
        this.d = dxb0Var2;
        ArrayList<exb0> arrayList2 = dxb0Var2.d;
        arrayList2.clear();
        arrayList2.addAll(l2);
        dxb0Var2.notifyDataSetChanged();
    }
}
