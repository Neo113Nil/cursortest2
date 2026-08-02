package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.masstransit.design.snippet.MtTransportSnippetView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class gj40 implements zo31 {
    public final MtTransportSnippetView a;
    public final GoImageView b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public gj40(MtTransportSnippetView mtTransportSnippetView, GoImageView goImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = mtTransportSnippetView;
        this.b = goImageView;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
