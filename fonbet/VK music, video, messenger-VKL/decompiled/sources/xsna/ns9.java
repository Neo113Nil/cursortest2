package xsna;

import androidx.annotation.NonNull;
import java.util.HashSet;

/* compiled from: CarColorConstraints.java */
/* loaded from: classes11.dex */
public final class ns9 {

    @NonNull
    public static final ns9 b = new ns9(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet<Integer> a = new HashSet<>();

    static {
        new ns9(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public ns9(int[] iArr) {
        for (int i : iArr) {
            this.a.add(Integer.valueOf(i));
        }
    }
}
