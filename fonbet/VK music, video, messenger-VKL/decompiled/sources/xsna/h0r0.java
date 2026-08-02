package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.tile.VkTile;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vkontakte.android.R;

/* compiled from: SelectionPreviewVh.kt */
/* loaded from: classes2.dex */
public final class h0r0 extends RecyclerView.e0 {
    public static final int o;
    public final gei0 l;
    public final VkTile m;
    public ldi0 n;

    /* compiled from: SelectionPreviewVh.kt */
    public static final class a implements VkTile.h {
        public final qtd0 a;
        public final Drawable b;

        public a() {
            this(null, null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            qtd0 qtd0Var = this.a;
            int hashCode = (qtd0Var == null ? 0 : qtd0Var.hashCode()) * 31;
            Drawable drawable = this.b;
            return hashCode + (drawable != null ? drawable.hashCode() : 0);
        }

        public final String toString() {
            return "SelectAvatarParams(profile=" + this.a + ", drawable=" + this.b + ')';
        }

        public a(qtd0 qtd0Var, Drawable drawable, int i) {
            qtd0Var = (i & 1) != 0 ? null : qtd0Var;
            drawable = (i & 2) != 0 ? null : drawable;
            this.a = qtd0Var;
            this.b = drawable;
        }
    }

    /* compiled from: SelectionPreviewVh.kt */
    public static final class b implements VkTile.g {
        public final VkImAvatar a;

        public b(Context context) {
            this.a = new VkImAvatar(context, null, 6, 0);
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            if (hVar instanceof a) {
                int i = h0r0.o;
                VkImAvatar vkImAvatar = this.a;
                ViewGroup.LayoutParams layoutParams = vkImAvatar.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i;
                bwt0.S(vkImAvatar, new l850(hVar, 28));
            }
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.a;
        }
    }

    static {
        iah0.a(72);
        o = iah0.a(64);
    }

    public h0r0(View view, gei0 gei0Var) {
        super(view);
        this.l = gei0Var;
        this.itemView.getContext();
        VkTile vkTile = (VkTile) view.findViewById(R.id.contacts_tile);
        this.m = vkTile;
        vkTile.setVisualContentController(new b(this.itemView.getContext()));
        vkTile.setRemoveIconClickListener(new v01(this, 11));
    }
}
