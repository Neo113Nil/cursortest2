package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;

/* compiled from: FeedRecyclerEmptySwipeLayout.kt */
/* loaded from: classes4.dex */
public final class r3r extends SwipeDrawableRefreshLayout implements fe90 {
    public final s3r m0;

    public r3r(Context context) {
        super(context, null);
        s3r s3rVar = new s3r(context);
        this.m0 = s3rVar;
        s3rVar.setPadding(cn70.b(32), 0, cn70.b(32), cn70.b(88));
        addView(s3rVar, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // xsna.fe90
    public final void a() {
        this.m0.a();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view != this || i == 0) {
            return;
        }
        setRefreshing(false);
    }

    public void setImage(int i) {
        this.m0.setImage(i);
    }

    public void setImageTint(int i) {
        this.m0.setImageTint(i);
    }

    @Override // xsna.fe90
    public void setText(int i) {
        this.m0.setText(i);
    }

    public void setTextSize(float f) {
        this.m0.setTextSize(f);
    }

    @Override // xsna.fe90
    public void setText(CharSequence charSequence) {
        this.m0.setText(charSequence);
    }
}
