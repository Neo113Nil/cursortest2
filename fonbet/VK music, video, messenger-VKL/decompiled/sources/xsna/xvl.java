package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DeletedSuggestedPostHolder.kt */
/* loaded from: classes4.dex */
public final class xvl extends rp6<yvl, Post> {
    public final VkCell E;
    public final VkCell.Middle.d F;
    public final Object G;

    /* compiled from: DeletedSuggestedPostHolder.kt */
    public static final class a implements VkCell.f {
    }

    /* compiled from: DeletedSuggestedPostHolder.kt */
    public static final class c implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xvl(ViewGroup viewGroup) {
        super(r0, viewGroup);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VkCell vkCell2 = (VkCell) this.itemView;
        this.E = vkCell2;
        this.F = new VkCell.Middle.d(tq.h(tlo0.Companion, R.string.newsfeed_post_removed), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new jb(14));
        this.G = a2;
        vkCell2.setLeftMainViewController((c) a2.getValue());
        float f = 32;
        vkCell2.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new a(), new Size(iah0.a(f), iah0.a(f)))));
    }

    @Override // xsna.rp6
    public final void R6(yvl yvlVar) {
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        String str = yvlVar.h;
        this.E.setMiddle(VkCell.Middle.a.a(aVar, str != null ? new VkCell.Middle.e(oq.d(tlo0.Companion, str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62) : null, this.F, null, 12));
    }

    /* compiled from: DeletedSuggestedPostHolder.kt */
    public static final class b implements VkCell.d {
        public final VkAvatar a;

        public b(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(R.drawable.vk_icon_avatar_placeholder_anonim_150);
            this.a = vkAvatar;
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
