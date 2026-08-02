package androidx.security.crypto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
/* loaded from: classes.dex */
public final class MasterKey$KeyScheme {
    private static final /* synthetic */ MasterKey$KeyScheme[] $VALUES;
    public static final MasterKey$KeyScheme AES256_GCM;

    static {
        MasterKey$KeyScheme masterKey$KeyScheme = new MasterKey$KeyScheme("AES256_GCM", 0);
        AES256_GCM = masterKey$KeyScheme;
        $VALUES = new MasterKey$KeyScheme[]{masterKey$KeyScheme};
    }

    public static MasterKey$KeyScheme valueOf(String str) {
        return (MasterKey$KeyScheme) Enum.valueOf(MasterKey$KeyScheme.class, str);
    }

    public static MasterKey$KeyScheme[] values() {
        return (MasterKey$KeyScheme[]) $VALUES.clone();
    }
}
