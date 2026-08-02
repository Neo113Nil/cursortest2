package coil3.util;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"coil3/util/Logger$Level", "", "Lcoil3/util/Logger$Level;", "Verbose", "Debug", "Info", "Warn", "Error", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Logger$Level {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Logger$Level[] $VALUES;
    public static final Logger$Level Debug;
    public static final Logger$Level Error;
    public static final Logger$Level Info;
    public static final Logger$Level Verbose;
    public static final Logger$Level Warn;

    static {
        Logger$Level logger$Level = new Logger$Level("Verbose", 0);
        Verbose = logger$Level;
        Logger$Level logger$Level2 = new Logger$Level("Debug", 1);
        Debug = logger$Level2;
        Logger$Level logger$Level3 = new Logger$Level("Info", 2);
        Info = logger$Level3;
        Logger$Level logger$Level4 = new Logger$Level("Warn", 3);
        Warn = logger$Level4;
        Logger$Level logger$Level5 = new Logger$Level("Error", 4);
        Error = logger$Level5;
        Logger$Level[] logger$LevelArr = {logger$Level, logger$Level2, logger$Level3, logger$Level4, logger$Level5};
        $VALUES = logger$LevelArr;
        $ENTRIES = kotlin.enums.a.a(logger$LevelArr);
    }

    public static Logger$Level valueOf(String str) {
        return (Logger$Level) Enum.valueOf(Logger$Level.class, str);
    }

    public static Logger$Level[] values() {
        return (Logger$Level[]) $VALUES.clone();
    }
}
