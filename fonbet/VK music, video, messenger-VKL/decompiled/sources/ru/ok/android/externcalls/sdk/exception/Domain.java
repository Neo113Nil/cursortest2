package ru.ok.android.externcalls.sdk.exception;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Domain.kt */
/* loaded from: classes9.dex */
public final class Domain {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Domain[] $VALUES;
    public static final Domain NETWORK = new Domain("NETWORK", 0);
    public static final Domain SERVER = new Domain(SignalingProtocol.TOPOLOGY_SERVER, 1);
    public static final Domain INTERNAL = new Domain("INTERNAL", 2);
    public static final Domain EXTERNAL = new Domain("EXTERNAL", 3);
    public static final Domain UNKNOWN = new Domain(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);

    private static final /* synthetic */ Domain[] $values() {
        return new Domain[]{NETWORK, SERVER, INTERNAL, EXTERNAL, UNKNOWN};
    }

    static {
        Domain[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private Domain(String str, int i) {
    }

    public static zrp<Domain> getEntries() {
        return $ENTRIES;
    }

    public static Domain valueOf(String str) {
        return (Domain) Enum.valueOf(Domain.class, str);
    }

    public static Domain[] values() {
        return (Domain[]) $VALUES.clone();
    }
}
