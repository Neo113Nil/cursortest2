package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.tile.VkTile;
import com.vk.core.view.components.tile.VkTileImageView;
import com.vk.dto.group.Group;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.nj8;

/* compiled from: BroadcastSettingsAuthorViewHolder.kt */
/* loaded from: classes3.dex */
public final class ni8 extends mj8 {
    public final izs<BroadcastAuthor, s3q0> m;
    public final VkTile n;

    /* compiled from: BroadcastSettingsAuthorViewHolder.kt */
    public static final class a implements VkTileImageView.b {
        public final VkAvatar a;

        public a(Context context) {
            this.a = new VkAvatar(context, null, 6, 0);
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final void a(VkTileImageView.c cVar) {
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                c.d dVar = new c.d(bVar.a, new eko(bVar.b));
                VkAvatar vkAvatar = this.a;
                vkAvatar.setContent(dVar);
                vkAvatar.setForeground(bVar.c);
            }
        }

        @Override // com.vk.core.view.components.tile.VkTileImageView.b
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: BroadcastSettingsAuthorViewHolder.kt */
    public static final class b implements VkTileImageView.c {
        public final String a;
        public final baf0 b;
        public final Drawable c;

        public b(String str, baf0 baf0Var, ColorDrawable colorDrawable) {
            this.a = str;
            this.b = baf0Var;
            this.c = colorDrawable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            Drawable drawable = this.c;
            return hashCode + (drawable == null ? 0 : drawable.hashCode());
        }

        public final String toString() {
            return "AuthorAvatarParams(url=" + this.a + ", placeholderDrawable=" + this.b + ", foregroundDrawable=" + this.c + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ni8(ViewGroup viewGroup, izs<? super BroadcastAuthor, s3q0> izsVar) {
        super(viewGroup, R.layout.live_broadcast_settings_author_item, 0);
        this.m = izsVar;
        VkTile vkTile = (VkTile) this.itemView;
        vkTile.setTextAlignment(VkTile.TextAlignment.Center);
        vkTile.setVisualContentType(VkTile.VisualContentType.Avatar);
        vkTile.setVisualContentController(new com.vk.core.view.components.tile.c(new a(this.itemView.getContext()), this.itemView.getContext()));
        this.n = vkTile;
    }

    @Override // xsna.mj8
    /* renamed from: j6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void i6(nj8.a aVar) {
        String str;
        baf0 b2;
        ColorDrawable colorDrawable;
        String str2;
        BroadcastAuthor broadcastAuthor = aVar.b;
        boolean z = broadcastAuthor instanceof BroadcastAuthor.CurrentUser;
        if (z) {
            str = ((BroadcastAuthor.CurrentUser) broadcastAuthor).b.o(64);
        } else {
            if (!(broadcastAuthor instanceof BroadcastAuthor.Group)) {
                throw new NoWhenBranchMatchedException();
            }
            Group group = ((BroadcastAuthor.Group) broadcastAuthor).b;
            String str3 = group.f;
            str = str3 == null ? group.e : str3;
        }
        if (z) {
            b2 = dhr0.t.b(R.drawable.vk_icon_user_24, R.attr.vk_ui_image_placeholder);
        } else {
            if (!(broadcastAuthor instanceof BroadcastAuthor.Group)) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = dhr0.t.b(R.drawable.vk_icon_users_24, R.attr.vk_ui_image_placeholder);
        }
        if (aVar.d) {
            dhr0.a.getClass();
            colorDrawable = new ColorDrawable(dhr0.E().getColor(R.color.vk_white_alpha40));
        } else {
            colorDrawable = null;
        }
        b bVar = new b(str, b2, colorDrawable);
        float f = 56;
        VkTileImageView.a aVar2 = new VkTileImageView.a(new Size(iah0.a(f), iah0.a(f)), bVar, null, 4);
        VkTile vkTile = this.n;
        vkTile.setVisualContentParams(aVar2);
        if (z) {
            str2 = ((BroadcastAuthor.CurrentUser) broadcastAuthor).b.e;
        } else {
            if (!(broadcastAuthor instanceof BroadcastAuthor.Group)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = ((BroadcastAuthor.Group) broadcastAuthor).b.d;
        }
        vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, str2), 2, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
        vkTile.setSelected(aVar.c);
        bwt0.j0(vkTile, new v74(2, aVar, this), 100L);
    }
}
