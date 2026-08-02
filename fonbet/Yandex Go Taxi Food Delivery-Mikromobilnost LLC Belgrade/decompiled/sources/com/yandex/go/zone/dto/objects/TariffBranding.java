package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffBranding;", "", "Companion", "Card", "$serializer", "com/yandex/go/zone/dto/objects/z5", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TariffBranding {
    public static final z5 Companion = new z5();
    public static final i3y[] h = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(27)), null, null, null, null, null, null};
    public final BrandingType a;
    public final String b;
    public final String c;
    public final n7v d;
    public final n7v e;
    public final Card f;
    public final String g;

    public /* synthetic */ TariffBranding(int i, BrandingType brandingType, String str, String str2, n7v n7vVar, n7v n7vVar2, Card card, String str3) {
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
            this.d = n7v.f;
        } else {
            this.d = n7vVar;
        }
        if ((i & 16) == 0) {
            this.e = n7v.f;
        } else {
            this.e = n7vVar2;
        }
        if ((i & 32) == 0) {
            Card.Companion.getClass();
            this.f = y5.a();
        } else {
            this.f = card;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffBranding)) {
            return false;
        }
        TariffBranding tariffBranding = (TariffBranding) obj;
        return this.a == tariffBranding.a && jl40.l(this.b, tariffBranding.b) && jl40.l(this.c, tariffBranding.c) && jl40.l(this.d, tariffBranding.d) && jl40.l(this.e, tariffBranding.e) && jl40.l(this.f, tariffBranding.f) && jl40.l(this.g, tariffBranding.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str3 = this.g;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffBranding(type=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", inactiveIcon=");
        sb.append(this.e);
        sb.append(", card=");
        sb.append(this.f);
        sb.append(", summarySubtitle=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffBranding$Card;", "", "Companion", "com/yandex/go/zone/dto/objects/y5", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class Card {
        public static final y5 Companion = new y5();
        public static final Card d = new Card(0);
        public final String a;
        public final String b;
        public final n7v c;

        public /* synthetic */ Card(int i, String str, String str2, n7v n7vVar) {
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
                this.c = n7v.f;
            } else {
                this.c = n7vVar;
            }
        }

        /* renamed from: a, reason: from getter */
        public final n7v getC() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return jl40.l(this.a, card.a) && jl40.l(this.b, card.b) && jl40.l(this.c, card.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder v = b64.v("Card(title=", this.a, ", description=", this.b, ", icon=");
            v.append(this.c);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public Card() {
            this(0);
        }

        public Card(int i) {
            n7v n7vVar = n7v.f;
            this.a = "";
            this.b = "";
            this.c = n7vVar;
        }
    }

    public TariffBranding() {
        BrandingType brandingType = BrandingType.OTHER;
        n7v n7vVar = n7v.f;
        Card.Companion.getClass();
        Card a = y5.a();
        this.a = brandingType;
        this.b = null;
        this.c = null;
        this.d = n7vVar;
        this.e = n7vVar;
        this.f = a;
        this.g = null;
    }
}
