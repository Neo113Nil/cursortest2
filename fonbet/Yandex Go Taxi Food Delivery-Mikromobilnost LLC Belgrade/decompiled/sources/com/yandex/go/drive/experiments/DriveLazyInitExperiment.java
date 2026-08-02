package com.yandex.go.drive.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tvl;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/drive/experiments/DriveLazyInitExperiment;", "Lvn11;", "Companion", "com/yandex/go/drive/experiments/a", "InitType", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DriveLazyInitExperiment implements vn11 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(11))};
    public static final DriveLazyInitExperiment e = new DriveLazyInitExperiment(0);
    public final boolean b;
    public final InitType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/drive/experiments/DriveLazyInitExperiment$InitType;", "", "Companion", "com/yandex/go/drive/experiments/b", "DEFAULT", "DRIVE_FLOW_ENTERED", "DRIVE_FINAL_SUGGEST_AVAILABILITY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class InitType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InitType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final InitType DEFAULT;
        public static final InitType DRIVE_FINAL_SUGGEST_AVAILABILITY;
        public static final InitType DRIVE_FLOW_ENTERED;

        static {
            InitType initType = new InitType("DEFAULT", 0);
            DEFAULT = initType;
            InitType initType2 = new InitType("DRIVE_FLOW_ENTERED", 1);
            DRIVE_FLOW_ENTERED = initType2;
            InitType initType3 = new InitType("DRIVE_FINAL_SUGGEST_AVAILABILITY", 2);
            DRIVE_FINAL_SUGGEST_AVAILABILITY = initType3;
            InitType[] initTypeArr = {initType, initType2, initType3};
            $VALUES = initTypeArr;
            $ENTRIES = kotlin.enums.a.a(initTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(12));
        }

        public static InitType valueOf(String str) {
            return (InitType) Enum.valueOf(InitType.class, str);
        }

        public static InitType[] values() {
            return (InitType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DriveLazyInitExperiment(int i, boolean z, InitType initType) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = InitType.DEFAULT;
        } else {
            this.c = initType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveLazyInitExperiment)) {
            return false;
        }
        DriveLazyInitExperiment driveLazyInitExperiment = (DriveLazyInitExperiment) obj;
        return this.b == driveLazyInitExperiment.b && this.c == driveLazyInitExperiment.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "DriveLazyInitExperiment(enabled=" + this.b + ", initType=" + this.c + Extension.C_BRAKE;
    }

    public DriveLazyInitExperiment() {
        this(0);
    }

    public DriveLazyInitExperiment(int i) {
        InitType initType = InitType.DEFAULT;
        this.b = false;
        this.c = initType;
    }
}
