package com.yandex.go.multimodal_route.network.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/DoneButtonDto;", "", "Companion", "com/yandex/go/multimodal_route/network/models/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DoneButtonDto {
    public static final f Companion = new f();
    public static final DoneButtonDto d = new DoneButtonDto();
    public final String a;
    public final String b;
    public final FormattedText c;

    public /* synthetic */ DoneButtonDto(int i, String str, String str2, FormattedText formattedText) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, DoneButtonDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoneButtonDto)) {
            return false;
        }
        DoneButtonDto doneButtonDto = (DoneButtonDto) obj;
        return jl40.l(this.a, doneButtonDto.a) && jl40.l(this.b, doneButtonDto.b) && jl40.l(this.c, doneButtonDto.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return tse0.m(b64.v("DoneButtonDto(id=", this.a, ", analyticsId=", this.b, ", title="), this.c, Extension.C_BRAKE);
    }

    public DoneButtonDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = "";
        this.c = formattedText;
    }
}
