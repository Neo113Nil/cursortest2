package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public interface iyi0 {
    static int a(int i, int i2, int i3, int i4) {
        return d(i, i2, i3, 0, 128, i4);
    }

    static int d(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    static boolean e(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    void clearListener();

    String getName();

    int getTrackType();

    void setListener(hyi0 hyi0Var);

    int supportsFormat(a aVar);

    int supportsMixedMimeTypeAdaptation();
}
