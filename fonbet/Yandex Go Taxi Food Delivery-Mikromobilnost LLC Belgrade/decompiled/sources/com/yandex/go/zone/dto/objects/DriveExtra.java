package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jbm;
import defpackage.jl40;
import defpackage.rcx;
import defpackage.unr0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DriveExtra;", "", "Companion", "Offer", "LayersExtra", "$serializer", "com/yandex/go/zone/dto/objects/a2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DriveExtra {
    public static final a2 Companion = new a2();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jbm(3))};
    public final kotlinx.serialization.json.b a;
    public final List b;

    public /* synthetic */ DriveExtra(int i, kotlinx.serialization.json.b bVar, List list) {
        this.a = (i & 1) == 0 ? null : bVar;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public static final /* synthetic */ void d(DriveExtra driveExtra, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || driveExtra.a != null) {
            yjdVar.g(serialDescriptor, 0, rcx.a, driveExtra.a);
        }
        if (!yjdVar.F() && jl40.l(driveExtra.b, EmptyList.a)) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), driveExtra.b);
    }

    /* renamed from: b, reason: from getter */
    public final kotlinx.serialization.json.b getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveExtra)) {
            return false;
        }
        DriveExtra driveExtra = (DriveExtra) obj;
        return jl40.l(this.a, driveExtra.a) && jl40.l(this.b, driveExtra.b);
    }

    public final int hashCode() {
        kotlinx.serialization.json.b bVar = this.a;
        return this.b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "DriveExtra(layersContext=" + this.a + ", offers=" + this.b + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DriveExtra$LayersExtra;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/b2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class LayersExtra {
        public static final b2 Companion = new b2();
        public final String a;
        public final String b;

        public /* synthetic */ LayersExtra(int i, String str, String str2) {
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

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayersExtra)) {
                return false;
            }
            LayersExtra layersExtra = (LayersExtra) obj;
            return jl40.l(this.a, layersExtra.a) && jl40.l(this.b, layersExtra.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("LayersExtra(carNumber=", this.a, ", layersObjectId=", this.b, Extension.C_BRAKE);
        }

        public LayersExtra(int i) {
            this.a = null;
            this.b = null;
        }

        public LayersExtra() {
            this(0);
        }
    }

    public DriveExtra() {
        this.a = null;
        this.b = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DriveExtra$Offer;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/c2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Offer {
        public static final c2 Companion = new c2();
        public final String a;
        public final String b;
        public final LayersExtra c;
        public final ServiceLevel d;

        public /* synthetic */ Offer(int i, String str, String str2, LayersExtra layersExtra, ServiceLevel serviceLevel) {
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
                this.c = layersExtra;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = serviceLevel;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final LayersExtra getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final ServiceLevel getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) obj;
            return jl40.l(this.a, offer.a) && jl40.l(this.b, offer.b) && jl40.l(this.c, offer.c) && jl40.l(this.d, offer.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            LayersExtra layersExtra = this.c;
            int hashCode3 = (hashCode2 + (layersExtra == null ? 0 : layersExtra.hashCode())) * 31;
            ServiceLevel serviceLevel = this.d;
            return hashCode3 + (serviceLevel != null ? serviceLevel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("Offer(offerId=", this.a, ", baseServiceLevelClass=", this.b, ", layersExtra=");
            v.append(this.c);
            v.append(", serviceLevelOverride=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public Offer() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }
}
