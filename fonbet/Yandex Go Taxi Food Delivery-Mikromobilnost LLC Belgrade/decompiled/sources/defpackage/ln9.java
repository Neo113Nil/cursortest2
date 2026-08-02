package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class ln9 implements zo31 {
    public final GoFrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final GoConstraintLayout d;
    public final RobotoTextView e;
    public final DialogueComponent f;

    public ln9(GoFrameLayout goFrameLayout, ImageView imageView, ImageView imageView2, GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, DialogueComponent dialogueComponent) {
        this.a = goFrameLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = goConstraintLayout;
        this.e = robotoTextView;
        this.f = dialogueComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
