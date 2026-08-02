package xsna;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.k1u0;
import xsna.r2s;
import xsna.tlo0;

/* compiled from: FolderItemVh.kt */
/* loaded from: classes18.dex */
public final class azr extends o2s<yyr> {
    public final e680 l;
    public final VkCell m;

    public azr(ViewGroup viewGroup, r2s.a aVar) {
        super(R.layout.vkim_folder_cell_item, viewGroup);
        this.l = aVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.vkim_cell);
        this.m = vkCell;
        vkCell.setBackground(new ColorDrawable(dhr0.Y(R.attr.vk_ui_background_content, this.itemView.getContext())));
    }

    @Override // xsna.o2s, xsna.usx0
    public final List<Rect> V3() {
        VkCell.Region region = VkCell.Region.LeftMain;
        VkCell vkCell = this.m;
        return e43.l(vkCell.b(region), vkCell.b(VkCell.Region.RightExtraAction));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005a, code lost:
    
        if (com.vk.toggle.b.A.a(r0) == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W5(Object obj) {
        final yyr yyrVar = (yyr) obj;
        VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(R.drawable.vk_icon_reorder_24, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (tlo0.h) null, 8));
        VkCell vkCell = this.m;
        vkCell.setLeft(a);
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e((tlo0) u11.f(tlo0.Companion, yyrVar.getName()), 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        if (yyrVar.getType() == FolderType.CHANNELS) {
            ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
            imFeatures.getClass();
        }
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new lb6(12, this, yyrVar), new tlo0.f(R.string.vkim_folder_cell_item_menu_button_accessibility), 4), null, 27));
        vkCell.setOnClickListener(new n2q(1, this, yyrVar));
        vkCell.setOnDragListener(new View.OnDragListener() { // from class: xsna.zyr
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                azr azrVar = azr.this;
                e680 e680Var = azrVar.l;
                if (dragEvent.getAction() == 1) {
                    e680Var.d(azrVar);
                    return true;
                }
                if (dragEvent.getAction() == 4) {
                    e680Var.b();
                }
                return true;
            }
        });
        vkCell.setContentDescription(this.itemView.getContext().getString(R.string.vkim_accessibility_folder_name_hint, yyrVar.getName()));
    }

    @Override // xsna.o2s, xsna.usx0
    public final List<Rect> p2() {
        Rect rect = new Rect();
        this.itemView.getGlobalVisibleRect(rect);
        return Collections.singletonList(rect);
    }
}
