package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.masstransit.design.snippet.MtPedestrianSnippetView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class cs30 implements zo31 {
    public final MtPedestrianSnippetView a;
    public final GoImageView b;
    public final RobotoTextView c;

    public cs30(MtPedestrianSnippetView mtPedestrianSnippetView, GoImageView goImageView, RobotoTextView robotoTextView) {
        this.a = mtPedestrianSnippetView;
        this.b = goImageView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
