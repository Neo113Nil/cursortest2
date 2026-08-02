package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.PermissionSchematicComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class lfb0 implements zo31 {
    public final PermissionSchematicComponent a;
    public final View b;
    public final View c;

    public lfb0(PermissionSchematicComponent permissionSchematicComponent, View view, AppCompatImageView appCompatImageView, View view2, AppCompatImageView appCompatImageView2, RobotoTextView robotoTextView) {
        this.a = permissionSchematicComponent;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
