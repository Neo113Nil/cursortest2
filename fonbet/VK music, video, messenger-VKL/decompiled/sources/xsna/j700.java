package xsna;

import androidx.annotation.Nullable;

/* compiled from: LottieCompositionCache.java */
/* loaded from: classes12.dex */
public final class j700 {
    public static final j700 b = new j700();
    public final m900<String, i700> a = new m900<>(20);

    @Nullable
    public final i700 a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.a.get(str);
    }
}
