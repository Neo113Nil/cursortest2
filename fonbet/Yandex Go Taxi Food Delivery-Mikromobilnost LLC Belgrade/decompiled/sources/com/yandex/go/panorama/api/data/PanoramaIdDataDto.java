package com.yandex.go.panorama.api.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.zzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/panorama/api/data/PanoramaIdDataDto;", "", "Companion", "$serializer", "com/yandex/go/panorama/api/data/a", "go-client-android.features.panorama:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PanoramaIdDataDto {
    public static final a Companion = new a();
    public final String a;
    public final double b;
    public final zzs c;
    public final String d;

    public /* synthetic */ PanoramaIdDataDto(int i, String str, double d, zzs zzsVar, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = zzs.f;
        } else {
            this.c = zzsVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanoramaIdDataDto)) {
            return false;
        }
        PanoramaIdDataDto panoramaIdDataDto = (PanoramaIdDataDto) obj;
        return jl40.l(this.a, panoramaIdDataDto.a) && Double.compare(this.b, panoramaIdDataDto.b) == 0 && jl40.l(this.c, panoramaIdDataDto.c) && jl40.l(this.d, panoramaIdDataDto.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nnm.b(this.c, unr0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "PanoramaIdDataDto(id=" + this.a + ", distance=" + this.b + ", lookAtPoint=" + this.c + ", photoPreviewUrl=" + this.d + Extension.C_BRAKE;
    }

    public PanoramaIdDataDto(String str, double d, zzs zzsVar, String str2) {
        this.a = str;
        this.b = d;
        this.c = zzsVar;
        this.d = str2;
    }

    public PanoramaIdDataDto() {
        this("", 0.0d, zzs.f, "");
    }
}
