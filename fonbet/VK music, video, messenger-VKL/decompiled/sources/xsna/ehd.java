package xsna;

import com.vk.dto.shortvideo.ClipsAuthor;

/* compiled from: ClipsAuthor.kt */
/* loaded from: classes18.dex */
public final class ehd {
    public static final boolean a(ClipsAuthor clipsAuthor) {
        if (clipsAuthor.b.p) {
            return true;
        }
        if (clipsAuthor.g == 0 || clipsAuthor.f == 3 || !b(clipsAuthor)) {
            return (c(clipsAuthor) || e(clipsAuthor)) && !d(clipsAuthor);
        }
        return true;
    }

    public static final boolean b(ClipsAuthor clipsAuthor) {
        int i = clipsAuthor.d;
        return clipsAuthor.b.b.b > 0 ? i == 1 : i == 1;
    }

    public static final boolean c(ClipsAuthor clipsAuthor) {
        return clipsAuthor.g == 0 && clipsAuthor.d == 1;
    }

    public static final boolean d(ClipsAuthor clipsAuthor) {
        int i = clipsAuthor.f;
        return i == 1 || i == 2 || i == 4;
    }

    public static final boolean e(ClipsAuthor clipsAuthor) {
        return clipsAuthor.g == 0 && clipsAuthor.d == 2;
    }
}
