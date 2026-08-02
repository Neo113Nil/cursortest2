package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.masstransit.design.snippet.MtUndergroundSnippetView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class mj40 implements zo31 {
    public final MtUndergroundSnippetView a;
    public final GoImageView b;
    public final RobotoTextView c;

    public mj40(MtUndergroundSnippetView mtUndergroundSnippetView, GoImageView goImageView, RobotoTextView robotoTextView) {
        this.a = mtUndergroundSnippetView;
        this.b = goImageView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
