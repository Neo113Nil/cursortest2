package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersPhotoRemoveButton;

/* loaded from: classes6.dex */
public final class kho0 implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;
    public final ScootersPhotoRemoveButton c;

    public kho0(GoFrameLayout goFrameLayout, GoImageView goImageView, ScootersPhotoRemoveButton scootersPhotoRemoveButton) {
        this.a = goFrameLayout;
        this.b = goImageView;
        this.c = scootersPhotoRemoveButton;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
