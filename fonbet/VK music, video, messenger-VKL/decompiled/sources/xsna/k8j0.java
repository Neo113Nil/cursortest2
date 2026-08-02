package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.editor.stories.impl.share.holders.ShareStoryDataRecyclerView;

/* compiled from: ShareStoryDataRecyclerView.kt */
/* loaded from: classes16.dex */
public final class k8j0 extends n6s {
    public final /* synthetic */ ShareStoryDataRecyclerView b;
    public final /* synthetic */ AttributeSet c;

    /* compiled from: ShareStoryDataRecyclerView.kt */
    public static final class a extends RecyclerView.e0 {
    }

    public k8j0(ShareStoryDataRecyclerView shareStoryDataRecyclerView, AttributeSet attributeSet) {
        this.b = shareStoryDataRecyclerView;
        this.c = attributeSet;
    }

    @Override // xsna.n6s
    public final ee a(Context context, ViewGroup viewGroup) {
        return this.b.d(context, this.c);
    }

    @Override // xsna.n6s
    public final RecyclerView.e0 b(Context context, ViewGroup viewGroup, xa80 xa80Var) {
        a aVar = new a(this.b.d(context, this.c));
        aVar.itemView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return aVar;
    }
}
