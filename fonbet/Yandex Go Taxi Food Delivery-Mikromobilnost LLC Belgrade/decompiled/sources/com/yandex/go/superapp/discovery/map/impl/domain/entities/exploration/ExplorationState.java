package com.yandex.go.superapp.discovery.map.impl.domain.entities.exploration;

import defpackage.k4o;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ExplorationState {
    public final Mode a;
    public final boolean b;
    public final boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/exploration/ExplorationState$Mode;", "", "DEFAULT", "GAMIFICATION", "FILTER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode DEFAULT;
        public static final Mode FILTER;
        public static final Mode GAMIFICATION;

        static {
            Mode mode = new Mode("DEFAULT", 0);
            DEFAULT = mode;
            Mode mode2 = new Mode("GAMIFICATION", 1);
            GAMIFICATION = mode2;
            Mode mode3 = new Mode("FILTER", 2);
            FILTER = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = a.a(modeArr);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public ExplorationState(Mode mode, boolean z, boolean z2) {
        this.a = mode;
        this.b = z;
        this.c = z2;
    }

    public static ExplorationState a(ExplorationState explorationState, Mode mode, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            mode = explorationState.a;
        }
        if ((i & 2) != 0) {
            z = explorationState.b;
        }
        if ((i & 4) != 0) {
            z2 = explorationState.c;
        }
        explorationState.getClass();
        return new ExplorationState(mode, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExplorationState)) {
            return false;
        }
        ExplorationState explorationState = (ExplorationState) obj;
        return this.a == explorationState.a && this.b == explorationState.b && this.c == explorationState.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExplorationState(mode=");
        sb.append(this.a);
        sb.append(", longPress=");
        sb.append(this.b);
        sb.append(", farPan=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public ExplorationState() {
        this(0);
    }

    public /* synthetic */ ExplorationState(int i) {
        this(Mode.DEFAULT, false, false);
    }
}
