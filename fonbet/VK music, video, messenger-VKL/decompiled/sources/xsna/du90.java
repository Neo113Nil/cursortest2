package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.cr5;
import xsna.fzo0;
import xsna.lyv;
import xsna.n0n0;
import xsna.tlo0;

/* compiled from: PeerVh.kt */
/* loaded from: classes18.dex */
public final class du90 extends vfz<wt90> {
    public final xt90 l;
    public final VkCell m;
    public final DisplayNameFormatter n;
    public final r0n0 o;

    public du90(ViewGroup viewGroup, xt90 xt90Var) {
        super(R.layout.vkim_folder_cell_item, viewGroup);
        this.l = xt90Var;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.vkim_cell);
        this.m = vkCell;
        this.n = new DisplayNameFormatter(this.itemView.getContext(), 1, null);
        this.o = new r0n0(this.itemView.getContext());
        vkCell.setLeftMainAvatarController(myv.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x017b  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(wt90 wt90Var) {
        ProfilesSimpleInfo profilesSimpleInfo;
        ProfilesSimpleInfo profilesSimpleInfo2;
        String str;
        final wt90 wt90Var2 = wt90Var;
        Dialog dialog = wt90Var2.c;
        cr5 cr5Var = wt90Var2.d;
        if (cr5Var instanceof cr5.a) {
            profilesSimpleInfo = new ProfilesSimpleInfo(EmptyList.b, (Collection) null, (Collection) null, (Collection) null, (Collection) null, 30, (zcl) null);
        } else if (cr5Var instanceof cr5.c) {
            profilesSimpleInfo = new ProfilesSimpleInfo(Collections.singletonList(((cr5.c) cr5Var).a));
        } else if (cr5Var instanceof cr5.d) {
            profilesSimpleInfo = new ProfilesSimpleInfo(Collections.singletonList(((cr5.d) cr5Var).a));
        } else {
            if (!epx.f(cr5Var, cr5.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            profilesSimpleInfo = null;
        }
        Dialog dialog2 = epx.f(cr5Var, cr5.b.a) ? null : dialog;
        boolean z = wt90Var2.j;
        boolean z2 = z || wt90Var2.g;
        boolean z3 = z || wt90Var2.h;
        boolean z4 = !z;
        VkCell.Left.a aVar = VkCell.Left.Companion;
        VkCell.Left.Main.a aVar2 = new VkCell.Left.Main.a(new lyv.a(dialog2, profilesSimpleInfo), VkCell.Left.Main.Size.Medium);
        VkCell.Left.c.a aVar3 = z2 ? new VkCell.Left.c.a(new pk(17, this, wt90Var2), z3, z4) : null;
        aVar.getClass();
        VkCell.Left.b bVar = new VkCell.Left.b(aVar2, aVar3);
        VkCell vkCell = this.m;
        vkCell.setLeft(bVar);
        fzo0 fzo0Var = wt90Var2.e;
        if (fzo0Var instanceof fzo0.a) {
            profilesSimpleInfo2 = new ProfilesSimpleInfo(EmptyList.b, (Collection) null, (Collection) null, (Collection) null, (Collection) null, 30, (zcl) null);
        } else if (fzo0Var instanceof fzo0.c) {
            profilesSimpleInfo2 = new ProfilesSimpleInfo(Collections.singletonList(((fzo0.c) fzo0Var).b));
        } else {
            if (!(fzo0Var instanceof fzo0.d)) {
                if (!epx.f(fzo0Var, fzo0.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vkCell.setRight(wt90Var2.i ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new qk(14, this, wt90Var2), tq.h(tlo0.Companion, R.string.vkim_folder_cell_item_menu_button_accessibility), 4), null, 27) : null);
                vkCell.setOnClickListener(new q4m(2, this, wt90Var2));
                vkCell.setOnLongClickListener(new View.OnLongClickListener(wt90Var2) { // from class: xsna.cu90
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        du90.this.l.getClass();
                        return true;
                    }
                });
            }
            profilesSimpleInfo2 = new ProfilesSimpleInfo(Collections.singletonList(((fzo0.d) fzo0Var).b));
        }
        n0n0 n0n0Var = wt90Var2.f;
        if (epx.f(n0n0Var, n0n0.a.a)) {
            str = this.itemView.getContext().getString(R.string.vkim_chat_already_added_by_sublist);
        } else {
            boolean z5 = n0n0Var instanceof n0n0.b;
            r0n0 r0n0Var = this.o;
            if (z5) {
                str = r0n0Var.a(dialog, profilesSimpleInfo2);
            } else if (n0n0Var instanceof n0n0.d) {
                str = r0n0Var.a(dialog, profilesSimpleInfo2);
            } else if (n0n0Var instanceof n0n0.e) {
                str = r0n0Var.a(dialog, profilesSimpleInfo2);
            } else {
                if (!epx.f(n0n0Var, n0n0.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
        }
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, this.n.d(dialog, profilesSimpleInfo2)), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, dialog.sc() ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_ghost_16), (k1u0) null, (tlo0.f) null, (Size) null, 14) : null, 30), str != null ? new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, null, 12));
        vkCell.setRight(wt90Var2.i ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new qk(14, this, wt90Var2), tq.h(tlo0.Companion, R.string.vkim_folder_cell_item_menu_button_accessibility), 4), null, 27) : null);
        vkCell.setOnClickListener(new q4m(2, this, wt90Var2));
        vkCell.setOnLongClickListener(new View.OnLongClickListener(wt90Var2) { // from class: xsna.cu90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                du90.this.l.getClass();
                return true;
            }
        });
    }
}
