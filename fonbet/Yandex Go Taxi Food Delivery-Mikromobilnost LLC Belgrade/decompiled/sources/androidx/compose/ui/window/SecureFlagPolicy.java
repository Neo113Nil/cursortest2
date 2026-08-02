package androidx.compose.ui.window;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "Inherit", "SecureOn", "SecureOff", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureFlagPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SecureFlagPolicy[] $VALUES;
    public static final SecureFlagPolicy Inherit;
    public static final SecureFlagPolicy SecureOff;
    public static final SecureFlagPolicy SecureOn;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        Inherit = secureFlagPolicy;
        SecureFlagPolicy secureFlagPolicy2 = new SecureFlagPolicy("SecureOn", 1);
        SecureOn = secureFlagPolicy2;
        SecureFlagPolicy secureFlagPolicy3 = new SecureFlagPolicy("SecureOff", 2);
        SecureOff = secureFlagPolicy3;
        SecureFlagPolicy[] secureFlagPolicyArr = {secureFlagPolicy, secureFlagPolicy2, secureFlagPolicy3};
        $VALUES = secureFlagPolicyArr;
        $ENTRIES = kotlin.enums.a.a(secureFlagPolicyArr);
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) $VALUES.clone();
    }
}
