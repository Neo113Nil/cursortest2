package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadAnimatedIcon.kt */
/* loaded from: classes3.dex */
public final class x7o {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ x7o[] $VALUES;
    public static final a Companion;
    public static final x7o END;
    public static final x7o PROGRESS;
    public static final x7o START;

    /* compiled from: DownloadAnimatedIcon.kt */
    public static final class a {
    }

    static {
        x7o x7oVar = new x7o("START", 0);
        START = x7oVar;
        x7o x7oVar2 = new x7o("PROGRESS", 1);
        PROGRESS = x7oVar2;
        x7o x7oVar3 = new x7o("END", 2);
        END = x7oVar3;
        x7o[] x7oVarArr = {x7oVar, x7oVar2, x7oVar3};
        $VALUES = x7oVarArr;
        $ENTRIES = new asp(x7oVarArr);
        Companion = new a();
    }

    public x7o() {
        throw null;
    }

    public static x7o valueOf(String str) {
        return (x7o) Enum.valueOf(x7o.class, str);
    }

    public static x7o[] values() {
        return (x7o[]) $VALUES.clone();
    }
}
