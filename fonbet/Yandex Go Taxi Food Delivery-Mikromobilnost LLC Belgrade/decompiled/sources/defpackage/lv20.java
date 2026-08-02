package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class lv20 implements zo31 {
    public final HubFooterView a;
    public final RecyclerView b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public lv20(HubFooterView hubFooterView, RecyclerView recyclerView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = hubFooterView;
        this.b = recyclerView;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
