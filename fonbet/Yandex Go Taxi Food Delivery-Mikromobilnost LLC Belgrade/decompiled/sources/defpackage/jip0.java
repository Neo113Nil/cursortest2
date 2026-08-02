package defpackage;

import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class jip0 extends RecyclerView.g {
    public final /* synthetic */ ImageView a;

    public jip0(ImageView imageView) {
        this.a = imageView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r3 != (r2.getItemCount() - 1)) goto L17;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (r2 = recyclerView.getAdapter()) == null) {
            return;
        }
        int L1 = linearLayoutManager.L1();
        if (L1 != -1) {
            z = true;
        }
        z = false;
        this.a.setVisibility(z ? 0 : 8);
    }
}
