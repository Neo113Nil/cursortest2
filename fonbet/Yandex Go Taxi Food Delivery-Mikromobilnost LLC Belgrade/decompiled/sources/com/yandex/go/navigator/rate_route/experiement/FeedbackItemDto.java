package com.yandex.go.navigator.rate_route.experiement;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.wmq;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/rate_route/experiement/FeedbackItemDto;", "", "Companion", "$serializer", "com/yandex/go/navigator/rate_route/experiement/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FeedbackItemDto {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wmq(24))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ FeedbackItemDto(String str, int i, String str2, String str3, List list) {
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
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackItemDto)) {
            return false;
        }
        FeedbackItemDto feedbackItemDto = (FeedbackItemDto) obj;
        return jl40.l(this.a, feedbackItemDto.a) && jl40.l(this.b, feedbackItemDto.b) && jl40.l(this.c, feedbackItemDto.c) && jl40.l(this.d, feedbackItemDto.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return tse0.j(this.c, ", options=", Extension.C_BRAKE, b64.v("FeedbackItemDto(id=", this.a, ", iconTagSelected=", this.b, ", iconTagUnselected="), this.d);
    }

    public FeedbackItemDto() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = EmptyList.a;
    }
}
