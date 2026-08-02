package okcalls;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h2 {
    public static final /* synthetic */ h2[] a = {new h2("ATTENDEE", 0), new h2("HAND_UP", 1), new h2("FEEDBACK", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    h2 EF5;

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) a.clone();
    }
}
