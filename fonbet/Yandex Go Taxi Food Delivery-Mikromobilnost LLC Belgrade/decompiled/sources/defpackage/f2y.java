package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.taxi.order.details.v1.ui.SectionDetailView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class f2y implements zo31 {
    public final SectionDetailView a;
    public final ImageView b;
    public final RobotoTextView c;

    public f2y(SectionDetailView sectionDetailView, ImageView imageView, RobotoTextView robotoTextView) {
        this.a = sectionDetailView;
        this.b = imageView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
