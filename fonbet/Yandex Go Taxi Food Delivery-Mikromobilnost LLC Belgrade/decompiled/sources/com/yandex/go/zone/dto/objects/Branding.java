package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.av5;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/Branding;", "", "Companion", "Profile", "$serializer", "com/yandex/go/zone/dto/objects/h", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Branding {
    public static final h Companion = new h();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(22)), null, null, null, null};
    public final BrandingType a;
    public final String b;
    public final String c;
    public final String d;
    public final Profile e;

    public /* synthetic */ Branding(int i, BrandingType brandingType, String str, String str2, String str3, Profile profile) {
        this.a = (i & 1) == 0 ? BrandingType.OTHER : brandingType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = profile;
        }
    }

    public static final /* synthetic */ void b(Branding branding, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || branding.a != BrandingType.OTHER) {
            yjdVar.e(serialDescriptor, 0, (KSerializer) f[0].getValue(), branding.a);
        }
        if (yjdVar.F() || branding.b != null) {
            yjdVar.g(serialDescriptor, 1, auu0.a, branding.b);
        }
        if (yjdVar.F() || branding.c != null) {
            yjdVar.g(serialDescriptor, 2, auu0.a, branding.c);
        }
        if (yjdVar.F() || branding.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, branding.d);
        }
        if (!yjdVar.F() && branding.e == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 4, Branding$Profile$$serializer.INSTANCE, branding.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Branding)) {
            return false;
        }
        Branding branding = (Branding) obj;
        return this.a == branding.a && jl40.l(this.b, branding.b) && jl40.l(this.c, branding.c) && jl40.l(this.d, branding.d) && jl40.l(this.e, branding.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Profile profile = this.e;
        return hashCode4 + (profile != null ? profile.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Branding(type=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", brandColor=");
        g8e.D(sb, this.c, ", link=", this.d, ", profile=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/Branding$Profile;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/i", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Profile {
        public static final i Companion = new i();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ Profile(int i, String str, String str2, String str3, String str4) {
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
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
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
            return jl40.l(this.a, profile.a) && jl40.l(this.b, profile.b) && jl40.l(this.c, profile.c) && jl40.l(this.d, profile.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return g8e.r(b64.v("Profile(badgeTitle=", this.a, ", badgeSubtitle=", this.b, ", badgeImageTag="), this.c, ", titleBadgeTag=", this.d, Extension.C_BRAKE);
        }

        public Profile() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public Branding() {
        this.a = BrandingType.OTHER;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
