package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CancelReasonsPresentation;", "", "Companion", "ExpandInfo", "com/yandex/go/zone/dto/objects/y", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CancelReasonsPresentation {
    public static final y Companion = new y();
    public final String a;
    public final ExpandInfo b;

    static {
        new CancelReasonsPresentation(0);
    }

    public /* synthetic */ CancelReasonsPresentation(int i, String str, ExpandInfo expandInfo) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new ExpandInfo(0);
        } else {
            this.b = expandInfo;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelReasonsPresentation)) {
            return false;
        }
        CancelReasonsPresentation cancelReasonsPresentation = (CancelReasonsPresentation) obj;
        return jl40.l(this.a, cancelReasonsPresentation.a) && jl40.l(this.b, cancelReasonsPresentation.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CancelReasonsPresentation(title=" + this.a + ", expandInfo=" + this.b + Extension.C_BRAKE;
    }

    public CancelReasonsPresentation() {
        this(0);
    }

    public CancelReasonsPresentation(int i) {
        ExpandInfo expandInfo = new ExpandInfo(0);
        this.a = "";
        this.b = expandInfo;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CancelReasonsPresentation$ExpandInfo;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/z", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class ExpandInfo {
        public static final z Companion = new z();
        public final int a;
        public final String b;
        public final String c;

        public /* synthetic */ ExpandInfo(int i, int i2, String str, String str2) {
            this.a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpandInfo)) {
                return false;
            }
            ExpandInfo expandInfo = (ExpandInfo) obj;
            return this.a == expandInfo.a && jl40.l(this.b, expandInfo.b) && jl40.l(this.c, expandInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(unr0.v(this.a, "ExpandInfo(reasonsThreshold=", ", iconTag=", this.b, ", text="), this.c, Extension.C_BRAKE);
        }

        public ExpandInfo(int i) {
            this.a = 0;
            this.b = "";
            this.c = "";
        }

        public ExpandInfo() {
            this(0);
        }
    }
}
