package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.fave.entities.FavePage;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.uqq;

/* compiled from: PageInfoHolder.kt */
/* loaded from: classes4.dex */
public final class f990 extends vif0<FavePage> {
    public final VKAvatarView n;
    public final ImageView o;
    public final TextView p;

    public f990(ViewGroup viewGroup, uqq.a aVar) {
        super(viewGroup, R.layout.fave_page_info_holder, 0);
        this.n = (VKAvatarView) this.itemView.findViewById(R.id.page_info_photo);
        this.o = (ImageView) this.itemView.findViewById(R.id.page_info_state);
        this.p = (TextView) this.itemView.findViewById(R.id.page_info_name);
        this.itemView.setOnClickListener(new eju(3, aVar, this));
    }

    @Override // xsna.vif0
    public final void i6(FavePage favePage) {
        VerifyInfo verifyInfo;
        FavePage favePage2 = favePage;
        if (favePage2 != null) {
            Owner owner = favePage2.e;
            AvatarBorderType avatarBorderType = AvatarBorderType.CIRCLE;
            Drawable drawable = null;
            VKAvatarView.Z0(this.n, owner != null ? owner.e : null, dhr0.t.a(epx.f(favePage2.b, "user") ? R.drawable.user_placeholder : R.drawable.group_placeholder), avatarBorderType, null, 8);
            String str = favePage2.f;
            if (str == null) {
                str = owner != null ? owner.c : null;
            }
            this.p.setText(str);
            Context context = this.l.getContext();
            Drawable i = (owner == null || (verifyInfo = owner.f) == null) ? null : VerifyInfoHelper.i(context, verifyInfo);
            if (i == null) {
                VisibleStatus zb = favePage2.g.zb();
                if (zb != null && zb.c) {
                    Platform platform = zb.e;
                    if (platform == Platform.WEB) {
                        e3m.a aVar = e3m.a;
                        drawable = m33.a(R.drawable.ic_online_web_composite_16, context);
                    } else if (platform == Platform.MOBILE) {
                        e3m.a aVar2 = e3m.a;
                        drawable = m33.a(R.drawable.ic_online_mobile_vkapp_composite_16, context);
                    }
                }
            } else {
                drawable = i;
            }
            this.o.setImageDrawable(drawable);
        }
    }
}
