package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;

/* compiled from: ItemGroupView.kt */
/* loaded from: classes16.dex */
public final class nux extends FrameLayout implements lux {
    public kux b;
    public final VkCell c;

    /* compiled from: ItemGroupView.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(R.drawable.vk_icon_user_24);
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof c) {
                String str = ((c) fVar).a;
                this.a.setContent(str != null ? new c.d(str, null) : null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ItemGroupView.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: ItemGroupView.kt */
    public static final class c implements VkCell.f {
        public final String a;

        public c() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AvatarViewParams(avatarUrl="), this.a, ')');
        }

        public c(String str) {
            this.a = str;
        }
    }

    public nux(Context context) {
        super(context, null, 0);
        VkCell vkCell = new VkCell(context, null, 6, 0);
        vkCell.setLeftMainAvatarController(new b());
        vkCell.setOnClickListener(new aj6(this, 6));
        this.c = vkCell;
        addView(vkCell);
    }

    @Override // xsna.lux
    public void setAvatarParams(String str) {
        this.c.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(str), VkCell.Left.Main.Size.Medium)));
    }

    @Override // xsna.dc6
    public kux getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(kux kuxVar) {
        this.b = kuxVar;
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
    }
}
