package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.unr0;
import defpackage.xlw0;
import defpackage.xvz;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffCard;", "", "Companion", "Option", "BrandingFeature", "LinkDto", "com/yandex/go/zone/dto/objects/b6", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TariffCard {
    public static final b6 Companion = new b6();
    public static final i3y[] e;
    public final String a;
    public final List b;
    public final n7v c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new xlw0(17)), null, kotlin.a.b(lazyThreadSafetyMode, new xlw0(18))};
    }

    public /* synthetic */ TariffCard(int i, String str, List list, n7v n7vVar, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = n7vVar;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffCard)) {
            return false;
        }
        TariffCard tariffCard = (TariffCard) obj;
        return jl40.l(this.a, tariffCard.a) && jl40.l(this.b, tariffCard.b) && jl40.l(this.c, tariffCard.c) && jl40.l(this.d, tariffCard.d);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        n7v n7vVar = this.c;
        return this.d.hashCode() + ((c + (n7vVar != null ? n7vVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("TariffCard(subtitle=", this.a, ", options=", this.b, ", partnerLogo=");
        r.append(this.c);
        r.append(", brandingFeatures=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffCard$Option;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/d6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class Option {
        public static final d6 Companion = new d6();
        public final String a;
        public final String b;

        public /* synthetic */ Option(int i, String str, String str2) {
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
        }

        public static final /* synthetic */ void a(Option option, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || option.a != null) {
                yjdVar.g(serialDescriptor, 0, auu0.a, option.a);
            }
            if (!yjdVar.F() && option.b == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 1, auu0.a, option.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return jl40.l(this.a, option.a) && jl40.l(this.b, option.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("Option(name=", this.a, ", value=", this.b, Extension.C_BRAKE);
        }

        public Option() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffCard$LinkDto;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/c6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class LinkDto {
        public static final c6 Companion = new c6();
        public final String a;
        public final String b;

        public /* synthetic */ LinkDto(int i, String str, String str2) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkDto)) {
                return false;
            }
            LinkDto linkDto = (LinkDto) obj;
            return jl40.l(this.a, linkDto.a) && jl40.l(this.b, linkDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("LinkDto(text=", this.a, ", url=", this.b, Extension.C_BRAKE);
        }

        public LinkDto() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffCard$BrandingFeature;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/a6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BrandingFeature {
        public static final a6 Companion = new a6();
        public final n7v a;
        public final String b;
        public final LinkDto c;

        public /* synthetic */ BrandingFeature(int i, n7v n7vVar, String str, LinkDto linkDto) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = n7vVar;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = linkDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandingFeature)) {
                return false;
            }
            BrandingFeature brandingFeature = (BrandingFeature) obj;
            return jl40.l(this.a, brandingFeature.a) && jl40.l(this.b, brandingFeature.b) && jl40.l(this.c, brandingFeature.c);
        }

        public final int hashCode() {
            n7v n7vVar = this.a;
            int b = unr0.b((n7vVar == null ? 0 : n7vVar.hashCode()) * 31, 31, this.b);
            LinkDto linkDto = this.c;
            return b + (linkDto != null ? linkDto.hashCode() : 0);
        }

        public final String toString() {
            return "BrandingFeature(image=" + this.a + ", text=" + this.b + ", linkDto=" + this.c + Extension.C_BRAKE;
        }

        public BrandingFeature() {
            this.a = null;
            this.b = "";
            this.c = null;
        }
    }

    public TariffCard() {
        this(null, 15);
    }

    public TariffCard(List list, int i) {
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        list = i2 != 0 ? emptyList : list;
        this.a = null;
        this.b = list;
        this.c = null;
        this.d = emptyList;
    }
}
