package defpackage;

import android.view.View;
import com.yandex.go.user_profile.main_menu.profile.presentation.MainMenuUserProfileView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.LoadingCircleButtonImageView;

/* loaded from: classes14.dex */
public final class n600 implements zo31 {
    public final MainMenuUserProfileView a;
    public final ListItemComponent b;
    public final LoadingCircleButtonImageView c;
    public final RobotoTextView d;

    public n600(MainMenuUserProfileView mainMenuUserProfileView, ListItemComponent listItemComponent, LoadingCircleButtonImageView loadingCircleButtonImageView, RobotoTextView robotoTextView) {
        this.a = mainMenuUserProfileView;
        this.b = listItemComponent;
        this.c = loadingCircleButtonImageView;
        this.d = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
