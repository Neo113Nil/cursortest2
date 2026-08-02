package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConfigureRoomParticipantsListItemCountIndicator.kt */
/* loaded from: classes7.dex */
public final class u0j implements hfz {
    public final a b;
    public final int c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConfigureRoomParticipantsListItemCountIndicator.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CALL_PARTICIPANTS_INDICATOR;
        public static final a ROOM_PARTICIPANTS_INDICATOR;

        static {
            a aVar = new a("ROOM_PARTICIPANTS_INDICATOR", 0);
            ROOM_PARTICIPANTS_INDICATOR = aVar;
            a aVar2 = new a("CALL_PARTICIPANTS_INDICATOR", 1);
            CALL_PARTICIPANTS_INDICATOR = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: ConfigureRoomParticipantsListItemCountIndicator.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ROOM_PARTICIPANTS_INDICATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.CALL_PARTICIPANTS_INDICATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public u0j(a aVar, int i) {
        this.b = aVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof u0j)) {
            return false;
        }
        u0j u0jVar = (u0j) obj;
        return u0jVar.b == this.b && u0jVar.c == this.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        int i = b.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return -11;
        }
        if (i == 2) {
            return -12;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
