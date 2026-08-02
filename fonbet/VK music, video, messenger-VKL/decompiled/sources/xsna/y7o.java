package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadAnimatedIcon.kt */
/* loaded from: classes3.dex */
public final class y7o {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ y7o[] $VALUES;
    public static final a Companion;
    public static final y7o END;
    public static final y7o PROGRESS;
    public static final y7o START;

    /* compiled from: DownloadAnimatedIcon.kt */
    public static final class a {
    }

    static {
        y7o y7oVar = new y7o("START", 0);
        START = y7oVar;
        y7o y7oVar2 = new y7o("PROGRESS", 1);
        PROGRESS = y7oVar2;
        y7o y7oVar3 = new y7o("END", 2);
        END = y7oVar3;
        y7o[] y7oVarArr = {y7oVar, y7oVar2, y7oVar3};
        $VALUES = y7oVarArr;
        $ENTRIES = new asp(y7oVarArr);
        Companion = new a();
    }

    public y7o() {
        throw null;
    }

    public static y7o valueOf(String str) {
        return (y7o) Enum.valueOf(y7o.class, str);
    }

    public static y7o[] values() {
        return (y7o[]) $VALUES.clone();
    }
}
