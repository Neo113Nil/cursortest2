package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.camera.editor.stories.impl.share.holders.ShareStoryDataRecyclerView;

/* compiled from: ShareStoryDataRecyclerView.kt */
/* loaded from: classes16.dex */
public final class j8j0 extends x6s {
    public final /* synthetic */ ShareStoryDataRecyclerView b;

    public j8j0(ShareStoryDataRecyclerView shareStoryDataRecyclerView, AttributeSet attributeSet) {
        this.b = shareStoryDataRecyclerView;
    }

    @Override // xsna.x6s
    public final View a(Context context, ViewGroup viewGroup) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        ShareStoryDataRecyclerView shareStoryDataRecyclerView = this.b;
        int i = shareStoryDataRecyclerView.P;
        for (int i2 = 0; i2 < i; i2++) {
            a.addView(shareStoryDataRecyclerView.h(context));
        }
        return a;
    }

    @Override // xsna.x6s
    public final ViewGroup.LayoutParams d() {
        return new FrameLayout.LayoutParams(-2, -2);
    }
}
