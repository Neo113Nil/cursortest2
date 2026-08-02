package androidx.fragment.app;

import android.widget.ListView;

/* loaded from: classes10.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ ListFragment a;

    public b0(ListFragment listFragment) {
        this.a = listFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = this.a.mList;
        listView.focusableViewAvailable(listView);
    }
}
