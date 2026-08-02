package yads;

/* loaded from: classes10.dex */
public final class mp0 extends RuntimeException {
    public mp0(int i) {
        super(a(i));
    }

    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
