package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;

/* compiled from: CreateFolderHolder.kt */
/* loaded from: classes16.dex */
public final class u7k extends vfz<v4e> {
    public final izs<com.vk.clips.favorites.impl.ui.folders.picker.a, s3q0> l;
    public final VkCell m;

    /* compiled from: CreateFolderHolder.kt */
    public static final class b implements VkCell.e {
        public static final b a = new b();

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: CreateFolderHolder.kt */
    public static final class c implements VkCell.f {
        public static final c a = new c();
    }

    public u7k(ViewGroup viewGroup, qr0 qr0Var) {
        super(R.layout.clips_favorites_folders_picker_add_folder, viewGroup);
        this.l = qr0Var;
        this.m = (VkCell) this.itemView.findViewById(R.id.clips_favorites_folders_picker_add_folder_cell);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(v4e v4eVar) {
        v4e v4eVar2 = v4eVar;
        if (v4eVar2.c) {
            this.itemView.setEnabled(false);
            this.itemView.setOnClickListener(null);
        } else {
            this.itemView.setEnabled(true);
            jjc.g(this.itemView, new wd3(9, this, v4eVar2));
        }
        b bVar = b.a;
        VkCell vkCell = this.m;
        vkCell.setLeftMainViewController(bVar);
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.e(c.a, new Size(size.k(this.itemView.getContext()), size.k(this.itemView.getContext()))), null));
        VkCell.Middle.d dVar = null;
        VkCell.Middle.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.clips_favorites_folders_picker_add_folder), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, cVar, (VkCell.Middle.Size) objArr, 14));
    }

    /* compiled from: CreateFolderHolder.kt */
    public static final class a implements VkCell.d {
        public final ClipsFoldersCoverView a;

        public a(Context context) {
            ClipsFoldersCoverView clipsFoldersCoverView = new ClipsFoldersCoverView(context, null, 6);
            this.a = clipsFoldersCoverView;
            clipsFoldersCoverView.setSize(ClipsFoldersCoverView.Size.SMALL);
            clipsFoldersCoverView.setEmptyIconResId(R.drawable.vk_icon_folder_simple_plus_outline_28);
            clipsFoldersCoverView.setImageControllerFactory(new t0v0());
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }
}
