package xsna;

import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import java.util.UUID;

/* compiled from: AdditionalSettingsSideEffect.kt */
/* loaded from: classes4.dex */
public interface ks0 {

    /* compiled from: AdditionalSettingsSideEffect.kt */
    public static final class a implements ks0 {
        public final AdditionalSettingsState a;

        public a(AdditionalSettingsState additionalSettingsState) {
            this.a = additionalSettingsState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Close(additionalSettingsState=" + this.a + ')';
        }
    }

    /* compiled from: AdditionalSettingsSideEffect.kt */
    public static final class b implements ks0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NavigateAdvertisingOrd(requestParams="), this.a, ')');
        }
    }

    /* compiled from: AdditionalSettingsSideEffect.kt */
    public static final class c implements ks0 {
        public final AdditionalSettingsConfiguration a;
        public final boolean b;
        public final UUID c;

        public c(AdditionalSettingsConfiguration additionalSettingsConfiguration, boolean z, UUID uuid) {
            this.a = additionalSettingsConfiguration;
            this.b = z;
            this.c = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "OnAdditionalSettingsChanged(additionalSettingsConfiguration=" + this.a + ", isCommentChangeAvailable=" + this.b + ", targetScreenUniqueId=" + this.c + ')';
        }
    }

    /* compiled from: AdditionalSettingsSideEffect.kt */
    public static final class d implements ks0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1849686565;
        }

        public final String toString() {
            return "ShowAuthorSignDisabledByUserSnackBar";
        }
    }

    /* compiled from: AdditionalSettingsSideEffect.kt */
    public static final class e implements ks0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1577013;
        }

        public final String toString() {
            return "ShowCommunitySignWarningSnackBar";
        }
    }

    /* compiled from: AdditionalSettingsSideEffect.kt */
    public static final class f implements ks0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -21602278;
        }

        public final String toString() {
            return "ShowNotAllowedAdvertisingSnackBar";
        }
    }

    /* compiled from: AdditionalSettingsSideEffect.kt */
    public static final class g implements ks0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 980812171;
        }

        public final String toString() {
            return "ShowRemoveAdvertisingSnackBar";
        }
    }
}
