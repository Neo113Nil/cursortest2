package defpackage;

import android.view.View;
import com.yandex.go.user_profile.settings.profile.presentation.SettingsProfileView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class mfr0 implements zo31 {
    public final SettingsProfileView a;
    public final ListItemComponent b;
    public final ListItemComponent c;
    public final ListItemComponent d;

    public mfr0(SettingsProfileView settingsProfileView, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ListItemComponent listItemComponent3) {
        this.a = settingsProfileView;
        this.b = listItemComponent;
        this.c = listItemComponent2;
        this.d = listItemComponent3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
