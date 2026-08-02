package defpackage;

import com.yandex.fintechsdk.entities.ui.BottomSheetMode;

/* loaded from: classes12.dex */
public final class a2w {
    public final BottomSheetMode a;
    public final float b;

    public a2w(BottomSheetMode bottomSheetMode, int i) {
        this.a = (i & 1) != 0 ? BottomSheetMode.DISABLED : bottomSheetMode;
        this.b = 16.0f;
    }

    public final boolean a() {
        return this.a != BottomSheetMode.DISABLED;
    }

    public a2w() {
        this(null, 3);
    }
}
