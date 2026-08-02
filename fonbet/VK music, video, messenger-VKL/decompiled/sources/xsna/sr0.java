package xsna;

import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.impl.domain.model.UserType;
import java.util.UUID;

/* compiled from: AdditionalSettingsPatch.kt */
/* loaded from: classes4.dex */
public interface sr0 extends xl50 {

    /* compiled from: AdditionalSettingsPatch.kt */
    public static final class a implements sr0 {
        public final String b;
        public final boolean c;
        public final String d;

        public a(String str, boolean z, String str2) {
            this.b = str;
            this.c = z;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.b;
            int b = qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
            String str2 = this.d;
            return b + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeAdvertisingOrd(predIdAdvertising=");
            sb.append(this.b);
            sb.append(", isAddAdvertisingOrd=");
            sb.append(this.c);
            sb.append(", erId=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: AdditionalSettingsPatch.kt */
    public static final class b implements sr0 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeCommentsState(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: AdditionalSettingsPatch.kt */
    public static final class c implements sr0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeNotificationState(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: AdditionalSettingsPatch.kt */
    public static final class d implements sr0 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeSignState(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: AdditionalSettingsPatch.kt */
    public static final class e implements sr0 {
        public final boolean b;
        public final boolean c;
        public final WallOwner d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final AdditionalSettingsConfiguration i;
        public final UserType j;
        public final boolean k;
        public final boolean l;
        public final String m;
        public final String n;
        public final UUID o;

        public e(AdditionalSettingsConfiguration additionalSettingsConfiguration, WallOwner wallOwner, UserType userType, String str, String str2, UUID uuid, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.b = z;
            this.c = z2;
            this.d = wallOwner;
            this.e = z3;
            this.f = z4;
            this.g = z5;
            this.h = z6;
            this.i = additionalSettingsConfiguration;
            this.j = userType;
            this.k = z7;
            this.l = z8;
            this.m = str;
            this.n = str2;
            this.o = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c && this.d.equals(eVar.d) && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && this.i.equals(eVar.i) && this.j == eVar.j && this.k == eVar.k && this.l == eVar.l && epx.f(this.m, eVar.m) && epx.f(this.n, eVar.n) && epx.f(this.o, eVar.o);
        }

        public final int hashCode() {
            return this.o.hashCode() + urd0.a(urd0.a(qoy.b(qoy.b((this.j.hashCode() + qoy.b((this.i.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, false)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        }

        public final String toString() {
            return "Loaded(isEditMode=" + this.b + ", isDraft=" + this.c + ", owner=" + this.d + ", isCommentChangeAvailable=" + this.e + ", isCommunity=" + this.f + ", hasCoauthors=" + this.g + ", shouldShowNotificationsButton=" + this.h + ", additionalSettingsConfiguration=" + this.i + ", showTurnOnCommentsAlert=false, userType=" + this.j + ", isSuggest=" + this.k + ", isAdmin=" + this.l + ", signerFirstNameGen=" + this.m + ", signerLastNameGen=" + this.n + ", targetScreenUniqueId=" + this.o + ')';
        }
    }

    /* compiled from: AdditionalSettingsPatch.kt */
    public static final class f implements sr0 {
        public final AdditionalSettingsState b;

        public f(AdditionalSettingsState additionalSettingsState) {
            this.b = additionalSettingsState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RestoreState(state=" + this.b + ')';
        }
    }

    /* compiled from: AdditionalSettingsPatch.kt */
    public static final class g implements sr0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "SetCommentChangeAvailable(isEnabled=true)";
        }
    }

    /* compiled from: AdditionalSettingsPatch.kt */
    public static final class h implements sr0 {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowTurnOnCommentsAlert(showAlert="), this.b, ')');
        }
    }
}
