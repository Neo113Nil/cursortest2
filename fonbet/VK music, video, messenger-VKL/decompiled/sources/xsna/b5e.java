package xsna;

import android.view.View;

/* compiled from: ClipsFavoritesFoldersPickerSnapStrategy.kt */
/* loaded from: classes16.dex */
public final class b5e extends com.vk.core.ui.bottomsheet.internal.b {
    public final View a;

    public b5e(View view) {
        this.a = view;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean a() {
        return true;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        return i2 - this.a.getHeight();
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        return 0;
    }
}
