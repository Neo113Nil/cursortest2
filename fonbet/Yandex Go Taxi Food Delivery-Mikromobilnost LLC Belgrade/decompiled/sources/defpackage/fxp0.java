package defpackage;

import android.view.View;
import com.google.android.material.search.SearchView;

/* loaded from: classes11.dex */
public final /* synthetic */ class fxp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ fxp0(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.lambda$setUpBackButton$2(view);
                break;
            case 1:
                searchView.lambda$setUpClearButton$3(view);
                break;
            default:
                searchView.lambda$setupWithSearchBar$8(view);
                break;
        }
    }
}
