package xsna;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionGestures.kt */
/* loaded from: classes11.dex */
public final class m7o {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ m7o[] $VALUES;
    public static final m7o Cancel;
    public static final m7o Drag;
    public static final m7o Timeout;
    public static final m7o Up;

    static {
        m7o m7oVar = new m7o("Up", 0);
        Up = m7oVar;
        m7o m7oVar2 = new m7o("Drag", 1);
        Drag = m7oVar2;
        m7o m7oVar3 = new m7o(AndroidInitializeBoldSDK.MSG_TIMEOUT, 2);
        Timeout = m7oVar3;
        m7o m7oVar4 = new m7o("Cancel", 3);
        Cancel = m7oVar4;
        m7o[] m7oVarArr = {m7oVar, m7oVar2, m7oVar3, m7oVar4};
        $VALUES = m7oVarArr;
        $ENTRIES = new asp(m7oVarArr);
    }

    public m7o() {
        throw null;
    }

    public static m7o valueOf(String str) {
        return (m7o) Enum.valueOf(m7o.class, str);
    }

    public static m7o[] values() {
        return (m7o[]) $VALUES.clone();
    }
}
