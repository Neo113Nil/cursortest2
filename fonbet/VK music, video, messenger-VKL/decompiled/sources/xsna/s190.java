package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: ClassifiedsCatalogAppBarButtonsHolder.kt */
/* loaded from: classes18.dex */
public final class s190 {
    public final View a;
    public final View b;

    public s190(View view, sa saVar) {
        this.a = view;
        View findViewById = view.findViewById(R.id.overflow_dot);
        this.b = findViewById;
        f4m.j(findViewById);
        view.setOnClickListener(new jsk(saVar, 7));
        awt0.o(view, new el30(this, 10));
    }
}
