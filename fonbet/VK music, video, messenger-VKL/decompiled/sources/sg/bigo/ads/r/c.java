package sg.bigo.ads.r;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public enum c {
    FILL_MATCH_SELF(1, 1),
    FILL_MATCH_MAIN_VIEW(2, 2),
    FILL_MATCH_PARENT(3, 3);

    public final int d;
    private final int e;

    c(int i, int i2) {
        this.e = i;
        this.d = i2;
    }

    @NonNull
    public static c a(int i) {
        return i != 2 ? i != 3 ? FILL_MATCH_SELF : FILL_MATCH_PARENT : FILL_MATCH_MAIN_VIEW;
    }
}
