package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.k1u0;

/* compiled from: FolderHolder.kt */
/* loaded from: classes16.dex */
public final class syr extends vfz<w4e> {
    public final izs<com.vk.clips.favorites.impl.ui.folders.picker.a, s3q0> l;
    public final VkCell m;

    /* compiled from: FolderHolder.kt */
    public static final class a implements VkCell.d {
        public final ClipsFoldersCoverView a;

        public a(Context context) {
            this.a = new ClipsFoldersCoverView(context, null, 6);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            b bVar = fVar instanceof b ? (b) fVar : null;
            if (bVar == null) {
                return;
            }
            ClipsFoldersCoverView.Size size = ClipsFoldersCoverView.Size.SMALL;
            ClipsFoldersCoverView clipsFoldersCoverView = this.a;
            clipsFoldersCoverView.setSize(size);
            clipsFoldersCoverView.setEmptyIconResId(R.drawable.vk_icon_folder_simple_outline_28);
            clipsFoldersCoverView.setImageControllerFactory(new t0v0());
            List<Image> list = bVar.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new cmw((Image) it.next()));
            }
            clipsFoldersCoverView.setCoverImages(arrayList);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FolderHolder.kt */
    public static final class b implements VkCell.f {
        public final List<Image> a;

        public b(List<Image> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("CoverViewParams(coverImages="), this.a);
        }
    }

    public syr(ViewGroup viewGroup, qr0 qr0Var) {
        super(R.layout.clips_favorites_folders_picker_item, viewGroup);
        this.l = qr0Var;
        this.m = (VkCell) this.itemView.findViewById(R.id.clips_favorites_folders_picker_item_cell);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(w4e w4eVar) {
        w4e w4eVar2 = w4eVar;
        boolean z = w4eVar2.e;
        if (w4eVar2.g) {
            this.itemView.setEnabled(false);
            this.itemView.setOnClickListener(null);
        } else {
            this.itemView.setEnabled(true);
            jjc.g(this.itemView, new com.vk.im.engine.commands.messages.a(21, this, w4eVar2));
        }
        jjc.g(this.itemView, new j20(15, this, w4eVar2));
        tyr tyrVar = new tyr();
        VkCell vkCell = this.m;
        vkCell.setLeftMainViewController(tyrVar);
        b bVar = new b(w4eVar2.c);
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.e(bVar, new Size(size.k(this.itemView.getContext()), size.k(this.itemView.getContext()))), null));
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, w4eVar2.d), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
        vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(z ? R.drawable.vk_icon_check_circle_on_24 : R.drawable.vk_icon_check_circle_off_24), (k1u0) new k1u0.a(z ? new x7g(R.attr.vk_ui_icon_accent) : new x7g(R.attr.vk_ui_icon_tertiary)), (Size) null, (tlo0) null, false, (gzs) new kg(13, this, w4eVar2), 28), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
    }
}
