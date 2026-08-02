package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.go.flex.common.api.FeedSdkTheme;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a5q0 extends b5q0 {
    public final FeedSdkTheme d;

    public a5q0(FeedSdkTheme feedSdkTheme) {
        super(DivkitThemeChangeListener.THEME_VARIABLE_NAME, true, false);
        this.d = feedSdkTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5q0) && this.d == ((a5q0) obj).d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "ThemeChangedTrigger(theme=" + this.d + Extension.C_BRAKE;
    }
}
