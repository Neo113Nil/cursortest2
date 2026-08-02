package xsna;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioPlayerPoolImpl.kt */
/* loaded from: classes3.dex */
public final class at4 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ at4[] $VALUES;
    public static final at4 BUSY;
    public static final at4 DIRTY;
    public static final at4 READY;

    static {
        at4 at4Var = new at4("READY", 0);
        READY = at4Var;
        at4 at4Var2 = new at4(SignalingProtocol.HUNGUP_REASON_BUSY, 1);
        BUSY = at4Var2;
        at4 at4Var3 = new at4("DIRTY", 2);
        DIRTY = at4Var3;
        at4[] at4VarArr = {at4Var, at4Var2, at4Var3};
        $VALUES = at4VarArr;
        $ENTRIES = new asp(at4VarArr);
    }

    public at4() {
        throw null;
    }

    public static at4 valueOf(String str) {
        return (at4) Enum.valueOf(at4.class, str);
    }

    public static at4[] values() {
        return (at4[]) $VALUES.clone();
    }
}
