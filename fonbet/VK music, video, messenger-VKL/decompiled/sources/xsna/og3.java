package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import xsna.fi3;

/* compiled from: ArchiveChannelItemAdapterDelegate.kt */
/* loaded from: classes15.dex */
public final class og3 extends vfz<fi3.b> {
    public final AvatarView l;
    public final TextView m;
    public final TextView n;
    public final ImageView o;
    public fi3.b p;

    public og3(View view, m0g0 m0g0Var) {
        super(view);
        this.l = (AvatarView) view.findViewById(R.id.channelAvatarView);
        this.m = (TextView) view.findViewById(R.id.channelTitleView);
        this.n = (TextView) view.findViewById(R.id.channelDescriptionView);
        ImageView imageView = (ImageView) view.findViewById(R.id.archiveButton);
        this.o = imageView;
        view.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 254));
        bwt0.i0(view, new ng3(0, m0g0Var, this));
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(p0w0.a);
        imageView.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 254));
        bwt0.i0(imageView, new com.vk.movika.sdk.base.logic.processor.d(2, m0g0Var, this));
    }

    @Override // xsna.vfz
    public final void W5(fi3.b bVar) {
        fi3.b bVar2 = bVar;
        this.p = bVar2;
        ImageList imageList = bVar2.c;
        AvatarView.a aVar = AvatarView.y;
        this.l.T0(imageList, null);
        this.m.setText(bVar2.d);
        this.n.setText(bVar2.e);
        this.o.setVisibility(0);
    }
}
