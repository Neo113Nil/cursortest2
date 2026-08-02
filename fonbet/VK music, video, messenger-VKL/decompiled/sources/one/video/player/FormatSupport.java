package one.video.player;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormatSupport.kt */
/* loaded from: classes8.dex */
public final class FormatSupport {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FormatSupport[] $VALUES;
    public static final FormatSupport FORMAT_EXCEEDS_CAPABILITIES;
    public static final FormatSupport FORMAT_HANDLED;
    public static final FormatSupport FORMAT_UNSUPPORTED_DRM;
    public static final FormatSupport FORMAT_UNSUPPORTED_SUBTYPE;
    public static final FormatSupport FORMAT_UNSUPPORTED_TYPE;
    public static final FormatSupport UNKNOWN;

    static {
        FormatSupport formatSupport = new FormatSupport("FORMAT_HANDLED", 0);
        FORMAT_HANDLED = formatSupport;
        FormatSupport formatSupport2 = new FormatSupport("FORMAT_EXCEEDS_CAPABILITIES", 1);
        FORMAT_EXCEEDS_CAPABILITIES = formatSupport2;
        FormatSupport formatSupport3 = new FormatSupport("FORMAT_UNSUPPORTED_DRM", 2);
        FORMAT_UNSUPPORTED_DRM = formatSupport3;
        FormatSupport formatSupport4 = new FormatSupport("FORMAT_UNSUPPORTED_SUBTYPE", 3);
        FORMAT_UNSUPPORTED_SUBTYPE = formatSupport4;
        FormatSupport formatSupport5 = new FormatSupport("FORMAT_UNSUPPORTED_TYPE", 4);
        FORMAT_UNSUPPORTED_TYPE = formatSupport5;
        FormatSupport formatSupport6 = new FormatSupport(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        UNKNOWN = formatSupport6;
        FormatSupport[] formatSupportArr = {formatSupport, formatSupport2, formatSupport3, formatSupport4, formatSupport5, formatSupport6};
        $VALUES = formatSupportArr;
        $ENTRIES = new asp(formatSupportArr);
    }

    public FormatSupport() {
        throw null;
    }

    public static FormatSupport valueOf(String str) {
        return (FormatSupport) Enum.valueOf(FormatSupport.class, str);
    }

    public static FormatSupport[] values() {
        return (FormatSupport[]) $VALUES.clone();
    }
}
