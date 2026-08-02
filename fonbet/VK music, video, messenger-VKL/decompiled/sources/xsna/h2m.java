package xsna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsEditDescriptionView.kt */
/* loaded from: classes16.dex */
public final class h2m {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ h2m[] $VALUES;
    public static final h2m Badges;
    public static final h2m BadgesSeparator;
    public static final h2m ClickInterceptor;
    public static final h2m TextArea;

    static {
        h2m h2mVar = new h2m("TextArea", 0);
        TextArea = h2mVar;
        h2m h2mVar2 = new h2m("ClickInterceptor", 1);
        ClickInterceptor = h2mVar2;
        h2m h2mVar3 = new h2m("BadgesSeparator", 2);
        BadgesSeparator = h2mVar3;
        h2m h2mVar4 = new h2m("Badges", 3);
        Badges = h2mVar4;
        h2m[] h2mVarArr = {h2mVar, h2mVar2, h2mVar3, h2mVar4};
        $VALUES = h2mVarArr;
        $ENTRIES = new asp(h2mVarArr);
    }

    public h2m() {
        throw null;
    }

    public static h2m valueOf(String str) {
        return (h2m) Enum.valueOf(h2m.class, str);
    }

    public static h2m[] values() {
        return (h2m[]) $VALUES.clone();
    }
}
