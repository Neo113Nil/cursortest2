package com.yandex.go.benefits_center.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.tt4;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/benefits_center/data/model/BenefitsCenterBanner;", "", "Companion", "Metadata", "Appearance", "$serializer", "com/yandex/go/benefits_center/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BenefitsCenterBanner {
    public static final c Companion = new c();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(24))};
    public final String a;
    public final String b;
    public final String c;
    public final Metadata d;
    public final ru.yandex.taxi.communications.api.dto.ticket.a e;
    public final Appearance f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/data/model/BenefitsCenterBanner$Appearance;", "", "NORMAL", "BLACK_WHITE", "MUTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Appearance {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance BLACK_WHITE;
        public static final Appearance MUTED;
        public static final Appearance NORMAL;

        static {
            Appearance appearance = new Appearance("NORMAL", 0);
            NORMAL = appearance;
            Appearance appearance2 = new Appearance("BLACK_WHITE", 1);
            BLACK_WHITE = appearance2;
            Appearance appearance3 = new Appearance("MUTED", 2);
            MUTED = appearance3;
            Appearance[] appearanceArr = {appearance, appearance2, appearance3};
            $VALUES = appearanceArr;
            $ENTRIES = kotlin.enums.a.a(appearanceArr);
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BenefitsCenterBanner(int i, String str, String str2, String str3, Metadata metadata, ru.yandex.taxi.communications.api.dto.ticket.a aVar, Appearance appearance) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = new Metadata(0);
        } else {
            this.d = metadata;
        }
        if ((i & 16) == 0) {
            this.e = new ru.yandex.taxi.communications.api.dto.ticket.a(0);
        } else {
            this.e = aVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = appearance;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitsCenterBanner)) {
            return false;
        }
        BenefitsCenterBanner benefitsCenterBanner = (BenefitsCenterBanner) obj;
        return jl40.l(this.a, benefitsCenterBanner.a) && jl40.l(this.b, benefitsCenterBanner.b) && jl40.l(this.c, benefitsCenterBanner.c) && jl40.l(this.d, benefitsCenterBanner.d) && jl40.l(this.e, benefitsCenterBanner.e) && this.f == benefitsCenterBanner.f;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        Appearance appearance = this.f;
        return hashCode + (appearance == null ? 0 : appearance.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("BenefitsCenterBanner(bannerId=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", metadata=");
        v.append(this.d);
        v.append(", centerPopupCard=");
        v.append(this.e);
        v.append(", appearance=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/data/model/BenefitsCenterBanner$Metadata;", "", "Companion", "$serializer", "com/yandex/go/benefits_center/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Metadata {
        public static final d Companion = new d();
        public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(25)), null, null};
        public final String a;
        public final String b;
        public final List c;
        public final String d;
        public final String e;

        public /* synthetic */ Metadata(int i, String str, String str2, String str3, String str4, List list) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return jl40.l(this.a, metadata.a) && jl40.l(this.b, metadata.b) && jl40.l(this.c, metadata.c) && jl40.l(this.d, metadata.d) && jl40.l(this.e, metadata.e);
        }

        public final int hashCode() {
            String str = this.a;
            return this.e.hashCode() + unr0.b(unr0.c(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder v = b64.v("Metadata(code=", this.a, ", seriesId=", this.b, ", services=");
            oyr.D(", expiration=", this.d, ", source=", v, this.c);
            return oyr.t(v, this.e, Extension.C_BRAKE);
        }

        public Metadata(int i) {
            this.a = null;
            this.b = "";
            this.c = EmptyList.a;
            this.d = "";
            this.e = "";
        }

        public Metadata() {
            this(0);
        }
    }

    public BenefitsCenterBanner() {
        this(0);
    }

    public BenefitsCenterBanner(int i) {
        Metadata metadata = new Metadata(0);
        ru.yandex.taxi.communications.api.dto.ticket.a aVar = new ru.yandex.taxi.communications.api.dto.ticket.a(0);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = metadata;
        this.e = aVar;
        this.f = null;
    }
}
