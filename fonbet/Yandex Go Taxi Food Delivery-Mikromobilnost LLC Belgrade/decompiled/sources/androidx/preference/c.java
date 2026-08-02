package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.ame0;
import defpackage.ny61;
import defpackage.xle0;
import defpackage.yle0;

/* loaded from: classes10.dex */
public final class c implements Runnable {
    public final /* synthetic */ Preference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PreferenceFragmentCompat c;

    public c(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference, String str) {
        this.c = preferenceFragmentCompat;
        this.a = preference;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        PreferenceFragmentCompat preferenceFragmentCompat = this.c;
        RecyclerView.Adapter adapter = preferenceFragmentCompat.mList.getAdapter();
        if (!(adapter instanceof yle0)) {
            if (adapter == 0) {
                return;
            }
            ny61.r("Adapter must implement PreferencePositionCallback");
            return;
        }
        String str = this.b;
        Preference preference = this.a;
        int i = preference != null ? ((ame0) ((yle0) adapter)).i(preference) : ((ame0) ((yle0) adapter)).j(str);
        RecyclerView recyclerView = preferenceFragmentCompat.mList;
        if (i != -1) {
            recyclerView.scrollToPosition(i);
        } else {
            adapter.registerAdapterDataObserver(new xle0(adapter, recyclerView, preference, str));
        }
    }
}
