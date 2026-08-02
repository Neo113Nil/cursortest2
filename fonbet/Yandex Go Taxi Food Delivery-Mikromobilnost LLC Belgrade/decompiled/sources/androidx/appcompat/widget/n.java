package androidx.appcompat.widget;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes10.dex */
public final class n implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete a;

    public n(SearchView.SearchAutoComplete searchAutoComplete) {
        this.a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.showSoftInputIfNecessary();
    }
}
