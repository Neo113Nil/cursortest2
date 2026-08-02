package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                RecyclerView recyclerView = ((PreferenceFragment) obj).mList;
                recyclerView.focusableViewAvailable(recyclerView);
                break;
            default:
                RecyclerView recyclerView2 = ((PreferenceFragmentCompat) obj).mList;
                recyclerView2.focusableViewAvailable(recyclerView2);
                break;
        }
    }
}
