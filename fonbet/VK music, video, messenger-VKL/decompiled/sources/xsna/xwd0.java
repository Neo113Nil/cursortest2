package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ProfileFriendsFriendVh.kt */
/* loaded from: classes4.dex */
public final class xwd0 extends vfz<jqs> implements w8i {
    public static final int q = iah0.a(56);
    public final d l;
    public final VkCell m;
    public final View n;
    public jqs o;
    public final Object p;

    /* compiled from: ProfileFriendsFriendVh.kt */
    public static final class a implements VkCell.d {
        public final Drawable a;
        public final VkAvatar b;

        public a(Context context) {
            Drawable a = dhr0.t.a(R.drawable.user_placeholder);
            this.a = a;
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(a);
            this.b = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                String str = cVar.a;
                VkAvatar vkAvatar = this.b;
                if (str != null) {
                    vkAvatar.setContent(new c.d(str, null));
                    return;
                }
                Drawable drawable = this.a;
                if (drawable == null) {
                    drawable = null;
                }
                vkAvatar.setContent(new c.b(drawable != null ? new eko(drawable) : null));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: ProfileFriendsFriendVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: ProfileFriendsFriendVh.kt */
    public static final class c implements VkCell.f {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("AvatarViewParams(url="), this.a, ')');
        }
    }

    /* compiled from: ProfileFriendsFriendVh.kt */
    public interface d {
        void b(ProfileFriendItem profileFriendItem, boolean z);

        void c(ProfileFriendItem profileFriendItem);
    }

    public xwd0(ViewGroup viewGroup, d dVar) {
        super(R.layout.holder_profile_friends_friend, viewGroup);
        this.l = dVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.friend_cell);
        this.m = vkCell;
        this.n = this.itemView.findViewById(R.id.profile_friends_friend_highlighted);
        this.p = msy.a(LazyThreadSafetyMode.NONE, new gd70(this, 19));
        vkCell.setLeftMainAvatarController(new b());
        this.itemView.setOnClickListener(new bt8(this, 4));
    }

    @Override // xsna.vfz
    public final void W5(jqs jqsVar) {
        VkCell.Left.c.a aVar;
        jqs jqsVar2 = jqsVar;
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Small;
        ProfileFriendItem profileFriendItem = jqsVar2.b;
        ImageList imageList = profileFriendItem.e;
        int k = size.k(this.itemView.getContext());
        int k2 = size.k(this.itemView.getContext());
        int i = q;
        Image Bb = imageList.Bb(Math.max(k, i), Math.max(k2, i));
        String str = Bb != null ? Bb.d : null;
        this.o = jqsVar2;
        if (jqsVar2.e) {
            aVar = new VkCell.Left.c.a(4, new h3b(0, this, xwd0.class, "onClickFriend", "onClickFriend()V", 0, 2), jqsVar2.c);
        } else {
            aVar = null;
        }
        VkCell.Left.a aVar2 = VkCell.Left.Companion;
        VkCell.Left.Main.a aVar3 = new VkCell.Left.Main.a(new c(str), size.j());
        aVar2.getClass();
        VkCell.Left.b bVar = new VkCell.Left.b(aVar3, aVar);
        VkCell vkCell = this.m;
        vkCell.setLeft(bVar);
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, profileFriendItem.h), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
        boolean z = jqsVar2.d;
        View view = this.n;
        bwt0.p0(view, z);
        if (jqsVar2.d) {
            jqsVar2.d = false;
            view.setAlpha(1.0f);
            view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void h6() {
        if (bwt0.b()) {
            return;
        }
        jqs jqsVar = this.o;
        boolean z = (jqsVar == null ? null : jqsVar).c;
        d dVar = this.l;
        if (z) {
            if (jqsVar == null) {
                jqsVar = null;
            }
            dVar.c(jqsVar.b);
            return;
        }
        ProfileFriendItem profileFriendItem = (jqsVar == null ? null : jqsVar).b;
        if (jqsVar == null) {
            jqsVar = null;
        }
        dVar.b(profileFriendItem, !jqsVar.e);
        jqs jqsVar2 = this.o;
        if ((jqsVar2 != null ? jqsVar2 : null).e) {
            return;
        }
        jbc0 jbc0Var = (jbc0) this.p.getValue();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var.g();
    }
}
