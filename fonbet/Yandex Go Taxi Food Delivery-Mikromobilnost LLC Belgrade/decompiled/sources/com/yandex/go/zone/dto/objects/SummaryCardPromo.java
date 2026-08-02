package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.w0v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SummaryCardPromo;", "", "Companion", "ShowPolicy", "Bullet", "HeaderAppearance", "Type", "$serializer", "com/yandex/go/zone/dto/objects/j5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SummaryCardPromo {
    public static final j5 Companion = new j5();
    public static final i3y[] i = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(20)), null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final ShowPolicy g;
    public final HeaderAppearance h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SummaryCardPromo$Type;", "", "Companion", "com/yandex/go/zone/dto/objects/m5", "DEFAULT", "PROMINENT", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final m5 Companion;
        public static final Type DEFAULT;
        public static final Type PROMINENT;

        static {
            Type type = new Type("DEFAULT", 0);
            DEFAULT = type;
            Type type2 = new Type("PROMINENT", 1);
            PROMINENT = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new m5();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(22));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SummaryCardPromo(int i2, String str, String str2, String str3, String str4, String str5, List list, ShowPolicy showPolicy, HeaderAppearance headerAppearance) {
        if ((i2 & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i2 & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i2 & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i2 & 64) == 0) {
            this.g = new ShowPolicy(0);
        } else {
            this.g = showPolicy;
        }
        if ((i2 & 128) == 0) {
            this.h = new HeaderAppearance(0);
        } else {
            this.h = headerAppearance;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryCardPromo)) {
            return false;
        }
        SummaryCardPromo summaryCardPromo = (SummaryCardPromo) obj;
        return jl40.l(this.a, summaryCardPromo.a) && jl40.l(this.b, summaryCardPromo.b) && jl40.l(this.c, summaryCardPromo.c) && jl40.l(this.d, summaryCardPromo.d) && jl40.l(this.e, summaryCardPromo.e) && jl40.l(this.f, summaryCardPromo.f) && jl40.l(this.g, summaryCardPromo.g) && jl40.l(this.h, summaryCardPromo.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        List list = this.f;
        return this.h.a.hashCode() + ((this.g.hashCode() + ((b + (list == null ? 0 : list.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SummaryCardPromo(type=", this.a, ", iconImageTag=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", buttonText=");
        tse0.x(this.e, ", bullets=", ", showPolicy=", v, this.f);
        v.append(this.g);
        v.append(", headerAppearance=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SummaryCardPromo$HeaderAppearance;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/k5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class HeaderAppearance {
        public static final k5 Companion = new k5();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(21))};
        public final Type a;

        public /* synthetic */ HeaderAppearance(int i, Type type) {
            if ((i & 1) == 0) {
                this.a = Type.DEFAULT;
            } else {
                this.a = type;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeaderAppearance) && this.a == ((HeaderAppearance) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HeaderAppearance(type=" + this.a + Extension.C_BRAKE;
        }

        public HeaderAppearance() {
            this(0);
        }

        public HeaderAppearance(int i) {
            this.a = Type.DEFAULT;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SummaryCardPromo$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/l5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ShowPolicy {
        public static final l5 Companion = new l5();
        public final String a;
        public final int b;

        public /* synthetic */ ShowPolicy(int i, String str, int i2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPolicy)) {
                return false;
            }
            ShowPolicy showPolicy = (ShowPolicy) obj;
            return jl40.l(this.a, showPolicy.a) && this.b == showPolicy.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return qv10.i(this.b, "ShowPolicy(id=", this.a, ", maxShowCount=", Extension.C_BRAKE);
        }

        public ShowPolicy(int i) {
            this.a = "";
            this.b = 0;
        }

        public ShowPolicy() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SummaryCardPromo$Bullet;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/i5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Bullet {
        public static final i5 Companion = new i5();
        public final FormattedText a;
        public final FormattedText b;
        public final String c;

        public /* synthetic */ Bullet(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bullet)) {
                return false;
            }
            Bullet bullet = (Bullet) obj;
            return jl40.l(this.a, bullet.a) && jl40.l(this.b, bullet.b) && jl40.l(this.c, bullet.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
        }

        public final String toString() {
            return oyr.t(defpackage.n.r("Bullet(title=", this.a, ", subtitle=", this.b, ", iconTag="), this.c, Extension.C_BRAKE);
        }

        public Bullet() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = "";
        }
    }

    public SummaryCardPromo() {
        ShowPolicy showPolicy = new ShowPolicy(0);
        HeaderAppearance headerAppearance = new HeaderAppearance(0);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = EmptyList.a;
        this.g = showPolicy;
        this.h = headerAppearance;
    }
}
