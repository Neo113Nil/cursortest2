package defpackage;

import com.google.android.material.search.SearchView;

/* loaded from: classes11.dex */
public final /* synthetic */ class exp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ exp0(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.lambda$requestFocusAndShowKeyboardIfNeeded$9();
                break;
            case 1:
                searchView.lambda$clearFocusAndHideKeyboard$11();
                break;
            case 2:
                searchView.lambda$requestFocusAndShowKeyboard$10();
                break;
            case 3:
                searchView.show();
                break;
            default:
                searchView.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
