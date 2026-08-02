package xsna;

import android.view.View;
import com.vk.content.design.view.photo.albumdetails.AlbumDetailsSkeletonView;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsSkeleton.kt */
/* loaded from: classes4.dex */
public final class pyj0 extends vif0<yxj0> {
    public final AlbumDetailsSkeletonView n;

    public pyj0(View view) {
        super(view);
        this.n = (AlbumDetailsSkeletonView) view.findViewById(R.id.album_details_skeleton_view);
    }

    @Override // xsna.vif0
    public final void i6(yxj0 yxj0Var) {
        this.n.setIsShowHeader(yxj0Var.a);
    }
}
