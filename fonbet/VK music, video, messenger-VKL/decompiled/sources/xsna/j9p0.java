package xsna;

import android.content.Context;

/* compiled from: LyricsLinearLayoutManager.kt */
/* loaded from: classes3.dex */
public final class j9p0 extends androidx.recyclerview.widget.v {
    public final mb00 a;

    public j9p0(Context context, mb00 mb00Var) {
        super(context);
        this.a = mb00Var;
    }

    @Override // androidx.recyclerview.widget.v
    public final int calculateTimeForScrolling(int i) {
        return 200;
    }

    @Override // androidx.recyclerview.widget.v
    public final int getVerticalSnapPreference() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
    public final void onStart() {
        this.a.c = true;
    }

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
    public final void onStop() {
        this.a.c = false;
    }
}
