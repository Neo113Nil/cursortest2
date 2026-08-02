package defpackage;

import com.yandex.go.design.compose.toolbar.StatusBarType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class m8u0 {
    public static final m8u0 b = new m8u0(StatusBarType.SyncWithTheme);
    public final StatusBarType a;

    public m8u0(StatusBarType statusBarType) {
        this.a = statusBarType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8u0) && this.a == ((m8u0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StatusBarUiState(statusBarType=" + this.a + Extension.C_BRAKE;
    }
}
