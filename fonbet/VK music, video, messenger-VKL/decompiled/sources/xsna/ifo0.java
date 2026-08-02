package xsna;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

/* compiled from: TextEmphasis.java */
/* loaded from: classes12.dex */
public final class ifo0 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final ImmutableSet<String> e = ImmutableSet.m(2, "auto", "none");
    public static final ImmutableSet<String> f = ImmutableSet.m(3, "dot", "sesame", "circle");
    public static final ImmutableSet<String> g = ImmutableSet.m(2, "filled", "open");
    public static final ImmutableSet<String> h = ImmutableSet.m(3, "after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public ifo0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
