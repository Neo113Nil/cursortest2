package okcalls;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class e2 {
    public static final e2 a;
    public static final e2 b;
    public static final e2 c;
    public static final /* synthetic */ e2[] d;

    static {
        e2 e2Var = new e2("LOCAL", 0);
        a = e2Var;
        e2 e2Var2 = new e2("UTC", 1);
        b = e2Var2;
        e2 e2Var3 = new e2(SignalingProtocol.TOPOLOGY_SERVER, 2);
        c = e2Var3;
        d = new e2[]{e2Var, e2Var2, e2Var3};
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) d.clone();
    }
}
