package com.yandex.go.multimodal_route.network.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nsq;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/FeedbackHintDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FeedbackHintDto {
    public static final g Companion = new g();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(1))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ FeedbackHintDto(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, FeedbackHintDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackHintDto)) {
            return false;
        }
        FeedbackHintDto feedbackHintDto = (FeedbackHintDto) obj;
        return jl40.l(this.a, feedbackHintDto.a) && jl40.l(this.b, feedbackHintDto.b) && jl40.l(this.c, feedbackHintDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("FeedbackHintDto(id=", this.a, ", hint=", this.b, ", visibleOnRatings="), this.c, Extension.C_BRAKE);
    }
}
