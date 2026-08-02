package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersPhotoRemoveButton;

/* loaded from: classes6.dex */
public final class oho0 implements pho0 {
    public final i3y a;
    public final i3y b;

    public oho0(ScootersPhotoRemoveButton scootersPhotoRemoveButton) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = a.b(lazyThreadSafetyMode, new lho0(scootersPhotoRemoveButton, 6));
        this.b = a.b(lazyThreadSafetyMode, new lho0(scootersPhotoRemoveButton, 7));
    }

    @Override // defpackage.pho0
    public final /* bridge */ /* synthetic */ Drawable a() {
        return null;
    }

    @Override // defpackage.pho0
    public final String b() {
        return (String) this.b.getValue();
    }

    @Override // defpackage.pho0
    public final Drawable getBackground() {
        return (Drawable) this.a.getValue();
    }

    @Override // defpackage.pho0
    public final boolean isEnabled() {
        return false;
    }
}
