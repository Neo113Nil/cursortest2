package xsna;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSharedWebViewPool.kt */
/* loaded from: classes6.dex */
public final class u1w0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ u1w0[] $VALUES;
    public static final u1w0 BUSY;
    public static final u1w0 DIRTY;
    public static final u1w0 READY;

    static {
        u1w0 u1w0Var = new u1w0("READY", 0);
        READY = u1w0Var;
        u1w0 u1w0Var2 = new u1w0(SignalingProtocol.HUNGUP_REASON_BUSY, 1);
        BUSY = u1w0Var2;
        u1w0 u1w0Var3 = new u1w0("DIRTY", 2);
        DIRTY = u1w0Var3;
        u1w0[] u1w0VarArr = {u1w0Var, u1w0Var2, u1w0Var3};
        $VALUES = u1w0VarArr;
        $ENTRIES = new asp(u1w0VarArr);
    }

    public u1w0() {
        throw null;
    }

    public static u1w0 valueOf(String str) {
        return (u1w0) Enum.valueOf(u1w0.class, str);
    }

    public static u1w0[] values() {
        return (u1w0[]) $VALUES.clone();
    }
}
