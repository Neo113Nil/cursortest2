package com.yandex.go.user_profile.ui.am;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/user_profile/ui/am/AmProfileParams;", "", "Companion", "Profile", "Line", "UltimaMode", "Appearance", "Interactions", "$serializer", "com/yandex/go/user_profile/ui/am/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AmProfileParams {
    public static final j Companion = new j();
    public final UltimaMode a;
    public final Appearance b;
    public final Profile c;
    public final g d;
    public final Interactions e;

    public /* synthetic */ AmProfileParams(int i, UltimaMode ultimaMode, Appearance appearance, Profile profile, g gVar, Interactions interactions) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = ultimaMode;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = appearance;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = profile;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = gVar;
        }
        if ((i & 16) == 0) {
            this.e = new Interactions(0);
        } else {
            this.e = interactions;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmProfileParams)) {
            return false;
        }
        AmProfileParams amProfileParams = (AmProfileParams) obj;
        return jl40.l(this.a, amProfileParams.a) && jl40.l(this.b, amProfileParams.b) && jl40.l(this.c, amProfileParams.c) && jl40.l(this.d, amProfileParams.d) && jl40.l(this.e, amProfileParams.e);
    }

    public final int hashCode() {
        UltimaMode ultimaMode = this.a;
        int hashCode = (ultimaMode == null ? 0 : ultimaMode.hashCode()) * 31;
        Appearance appearance = this.b;
        int hashCode2 = (hashCode + (appearance == null ? 0 : appearance.hashCode())) * 31;
        Profile profile = this.c;
        int hashCode3 = (hashCode2 + (profile == null ? 0 : profile.hashCode())) * 31;
        g gVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AmProfileParams(ultimaMode=" + this.a + ", appearance=" + this.b + ", profile=" + this.c + ", closeAction=" + this.d + ", interactions=" + this.e + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Appearance;", "", "Companion", "$serializer", "com/yandex/go/user_profile/ui/am/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Appearance {
        public static final i Companion = new i();
        public final String a;
        public final int b;
        public final int c;

        public /* synthetic */ Appearance(int i, int i2, int i3, String str) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Appearance)) {
                return false;
            }
            Appearance appearance = (Appearance) obj;
            return jl40.l(this.a, appearance.a) && this.b == appearance.b && this.c == appearance.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "Appearance(theme=", this.a, ", top=", ", bottom="));
        }

        public Appearance(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public Appearance() {
            this("", 0, 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/ui/am/AmProfileParams$UltimaMode;", "", "Companion", "$serializer", "com/yandex/go/user_profile/ui/am/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class UltimaMode {
        public static final n Companion = new n();
        public final boolean a;
        public final boolean b;
        public final ief c;
        public final UltimaModeResponse.Profile.Card d;

        public /* synthetic */ UltimaMode(int i, boolean z, boolean z2, ief iefVar, UltimaModeResponse.Profile.Card card) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = iefVar;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = card;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UltimaMode)) {
                return false;
            }
            UltimaMode ultimaMode = (UltimaMode) obj;
            return this.a == ultimaMode.a && this.b == ultimaMode.b && jl40.l(this.c, ultimaMode.c) && jl40.l(this.d, ultimaMode.d);
        }

        public final int hashCode() {
            int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
            ief iefVar = this.c;
            int hashCode = (e + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
            UltimaModeResponse.Profile.Card card = this.d;
            return hashCode + (card != null ? card.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder u = qv10.u("UltimaMode(enabled=", ", manuallyDisabled=", ", currency=", this.a, this.b);
            u.append(this.c);
            u.append(", data=");
            u.append(this.d);
            u.append(Extension.C_BRAKE);
            return u.toString();
        }

        public UltimaMode(boolean z, boolean z2, ief iefVar, UltimaModeResponse.Profile.Card card) {
            this.a = z;
            this.b = z2;
            this.c = iefVar;
            this.d = card;
        }

        public UltimaMode() {
            this(false, false, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Line;", "", "Companion", "$serializer", "com/yandex/go/user_profile/ui/am/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Line {
        public static final l Companion = new l();
        public final String a;
        public final String b;
        public final g c;
        public final boolean d;
        public final boolean e;

        public /* synthetic */ Line(int i, String str, String str2, g gVar, boolean z, boolean z2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = gVar;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i & 16) == 0) {
                this.e = true;
            } else {
                this.e = z2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Line)) {
                return false;
            }
            Line line = (Line) obj;
            return jl40.l(this.a, line.a) && jl40.l(this.b, line.b) && jl40.l(this.c, line.c) && this.d == line.d && this.e == line.e;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            g gVar = this.c;
            return Boolean.hashCode(this.e) + unr0.e((hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder v = b64.v("Line(title=", this.a, ", value=", this.b, ", action=");
            v.append(this.c);
            v.append(", highlight=");
            v.append(this.d);
            v.append(", enabled=");
            return x4e.i(v, this.e, Extension.C_BRAKE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Line() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
        }

        public Line(String str, String str2, g gVar, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = gVar;
            this.d = z;
            this.e = z2;
        }

        public /* synthetic */ Line(String str, String str2, g gVar, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : gVar, false, true);
        }
    }

    public AmProfileParams(UltimaMode ultimaMode, Appearance appearance, Profile profile, AmActions$Command amActions$Command, Interactions interactions) {
        this.a = ultimaMode;
        this.b = appearance;
        this.c = profile;
        this.d = amActions$Command;
        this.e = interactions;
    }

    public AmProfileParams() {
        this(null, null, null, null, new Interactions(0));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Profile;", "", "Companion", "$serializer", "com/yandex/go/user_profile/ui/am/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Profile {
        public static final m Companion = new m();
        public final Line a;
        public final Line b;
        public final Line c;
        public final Line d;
        public final Line e;
        public final g f;
        public final g g;

        public /* synthetic */ Profile(int i, Line line, Line line2, Line line3, Line line4, Line line5, g gVar, g gVar2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = line;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = line2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = line3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = line4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = line5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = gVar;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = gVar2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) obj;
            return jl40.l(this.a, profile.a) && jl40.l(this.b, profile.b) && jl40.l(this.c, profile.c) && jl40.l(this.d, profile.d) && jl40.l(this.e, profile.e) && jl40.l(this.f, profile.f) && jl40.l(this.g, profile.g);
        }

        public final int hashCode() {
            Line line = this.a;
            int hashCode = (line == null ? 0 : line.hashCode()) * 31;
            Line line2 = this.b;
            int hashCode2 = (hashCode + (line2 == null ? 0 : line2.hashCode())) * 31;
            Line line3 = this.c;
            int hashCode3 = (hashCode2 + (line3 == null ? 0 : line3.hashCode())) * 31;
            Line line4 = this.d;
            int hashCode4 = (hashCode3 + (line4 == null ? 0 : line4.hashCode())) * 31;
            Line line5 = this.e;
            int hashCode5 = (hashCode4 + (line5 == null ? 0 : line5.hashCode())) * 31;
            g gVar = this.f;
            int hashCode6 = (hashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            g gVar2 = this.g;
            return hashCode6 + (gVar2 != null ? gVar2.hashCode() : 0);
        }

        public final String toString() {
            return "Profile(name=" + this.a + ", rating=" + this.b + ", email=" + this.c + ", phone=" + this.d + ", ratingInfo=" + this.e + ", action=" + this.f + ", uploadPhotoAction=" + this.g + Extension.C_BRAKE;
        }

        public Profile(Line line, Line line2, Line line3, Line line4, Line line5, AmActions$Command amActions$Command, AmActions$Command amActions$Command2) {
            this.a = line;
            this.b = line2;
            this.c = line3;
            this.d = line4;
            this.e = line5;
            this.f = amActions$Command;
            this.g = amActions$Command2;
        }

        public Profile() {
            this(null, null, null, null, null, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Interactions;", "", "Companion", "$serializer", "com/yandex/go/user_profile/ui/am/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Interactions {
        public static final k Companion = new k();
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public /* synthetic */ Interactions(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z2;
            }
            if ((i & 8) == 0) {
                this.d = true;
            } else {
                this.d = z3;
            }
            if ((i & 16) == 0) {
                this.e = true;
            } else {
                this.e = z4;
            }
            if ((i & 32) == 0) {
                this.f = true;
            } else {
                this.f = z5;
            }
            if ((i & 64) == 0) {
                this.g = true;
            } else {
                this.g = z6;
            }
            if ((i & 128) == 0) {
                this.h = false;
            } else {
                this.h = z7;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interactions)) {
                return false;
            }
            Interactions interactions = (Interactions) obj;
            return jl40.l(this.a, interactions.a) && this.b == interactions.b && this.c == interactions.c && this.d == interactions.d && this.e == interactions.e && this.f == interactions.f && this.g == interactions.g && this.h == interactions.h;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.h) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder l = oo31.l("Interactions(restrictionInfo=", this.a, ", changeAccount=", ", changePhone=", this.b);
            nnm.v(", changeName=", ", changePhoto=", l, this.c, this.d);
            nnm.v(", changeEmail=", ", changeBirthday=", l, this.e, this.f);
            return smw0.k(", logout=", Extension.C_BRAKE, l, this.g, this.h);
        }

        public Interactions() {
            this(0);
        }

        public Interactions(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = z7;
        }

        public /* synthetic */ Interactions(int i) {
            this(null, false, false, true, true, true, true, false);
        }
    }
}
