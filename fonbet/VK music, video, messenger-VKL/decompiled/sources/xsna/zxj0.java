package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.e3m;

/* compiled from: SkeletonAdapter.kt */
/* loaded from: classes16.dex */
public final class zxj0 extends BaseAdapter {
    public final int b = iah0.a(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);

    @Override // android.widget.Adapter
    public final int getCount() {
        return 12;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        VkSkeleton vkSkeleton = new VkSkeleton(context, null, 0, 14, 0);
        e3m.a aVar = e3m.a;
        vkSkeleton.setBackground(m33.a(R.drawable.clips_bg_skeleton_grid, context));
        vkSkeleton.setLayoutParams(new AbsListView.LayoutParams(-2, this.b));
        return vkSkeleton;
    }
}
