package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes10.dex */
public final class emy0 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final ImmutableSet e = ImmutableSet.l(2, "auto", "none");
    public static final ImmutableSet f = ImmutableSet.l(3, "dot", "sesame", "circle");
    public static final ImmutableSet g = ImmutableSet.l(2, "filled", OpenList.STR_OPEN);
    public static final ImmutableSet h = ImmutableSet.l(3, "after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public emy0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
