package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.delivery.ui.photocomment.AddPhotocommentButtonView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class d1x implements zo31 {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final View c;
    public final BubbleTextComponent d;
    public final RobotoTextView e;
    public final RobotoTextView f;
    public final PhotocommentsView g;
    public final ListItemComponent h;
    public final AnimatedListItemInputComponent i;
    public final BubbleTextComponent j;
    public final AnimatedListItemInputComponent k;
    public final View l;
    public final ConstraintLayout m;
    public final AnimatedListItemInputComponent n;
    public final AnimatedListItemInputComponent o;
    public final AnimatedListItemInputComponent p;
    public final RobotoTextView q;
    public final AddPhotocommentButtonView r;

    public d1x(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, BubbleTextComponent bubbleTextComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, PhotocommentsView photocommentsView, ListItemComponent listItemComponent, AnimatedListItemInputComponent animatedListItemInputComponent, BubbleTextComponent bubbleTextComponent2, AnimatedListItemInputComponent animatedListItemInputComponent2, View view2, ConstraintLayout constraintLayout2, AnimatedListItemInputComponent animatedListItemInputComponent3, AnimatedListItemInputComponent animatedListItemInputComponent4, AnimatedListItemInputComponent animatedListItemInputComponent5, RobotoTextView robotoTextView3, AddPhotocommentButtonView addPhotocommentButtonView) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = view;
        this.d = bubbleTextComponent;
        this.e = robotoTextView;
        this.f = robotoTextView2;
        this.g = photocommentsView;
        this.h = listItemComponent;
        this.i = animatedListItemInputComponent;
        this.j = bubbleTextComponent2;
        this.k = animatedListItemInputComponent2;
        this.l = view2;
        this.m = constraintLayout2;
        this.n = animatedListItemInputComponent3;
        this.o = animatedListItemInputComponent4;
        this.p = animatedListItemInputComponent5;
        this.q = robotoTextView3;
        this.r = addPhotocommentButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
