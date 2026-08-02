package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackItemsSelectionComponent;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersCommentAndPhotosView;
import ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFeedbackCardNewbieHeader;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class aln0 implements zo31 {
    public final ScootersFeedbackCard a;
    public final ScootersCommentAndPhotosView b;
    public final ScootersFeedbackItemsSelectionComponent c;
    public final ScootersFeedbackCardNewbieHeader d;
    public final RatingBarComponent e;
    public final RobotoTextView f;
    public final ListItemComponent g;
    public final ListItemComponent h;

    public aln0(ScootersFeedbackCard scootersFeedbackCard, ScootersCommentAndPhotosView scootersCommentAndPhotosView, ScootersFeedbackItemsSelectionComponent scootersFeedbackItemsSelectionComponent, ScootersFeedbackCardNewbieHeader scootersFeedbackCardNewbieHeader, RatingBarComponent ratingBarComponent, RobotoTextView robotoTextView, ListItemComponent listItemComponent, ListItemComponent listItemComponent2) {
        this.a = scootersFeedbackCard;
        this.b = scootersCommentAndPhotosView;
        this.c = scootersFeedbackItemsSelectionComponent;
        this.d = scootersFeedbackCardNewbieHeader;
        this.e = ratingBarComponent;
        this.f = robotoTextView;
        this.g = listItemComponent;
        this.h = listItemComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
