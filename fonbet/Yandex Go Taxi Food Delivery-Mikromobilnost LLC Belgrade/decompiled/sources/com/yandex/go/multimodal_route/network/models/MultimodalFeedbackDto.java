package com.yandex.go.multimodal_route.network.models;

import defpackage.ah40;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/MultimodalFeedbackDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MultimodalFeedbackDto {
    public static final j Companion = new j();
    public static final i3y[] h = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(13)), null};
    public final FormattedText a;
    public final FormattedText b;
    public final RatingSelectorDto c;
    public final CommentFieldDto d;
    public final DoneButtonDto e;
    public final List f;
    public final String g;

    public MultimodalFeedbackDto(int i, FormattedText formattedText, FormattedText formattedText2, RatingSelectorDto ratingSelectorDto, CommentFieldDto commentFieldDto, DoneButtonDto doneButtonDto, List list, String str) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            RatingSelectorDto.Companion.getClass();
            this.c = RatingSelectorDto.e;
        } else {
            this.c = ratingSelectorDto;
        }
        if ((i & 8) == 0) {
            CommentFieldDto.Companion.getClass();
            this.d = CommentFieldDto.g;
        } else {
            this.d = commentFieldDto;
        }
        if ((i & 16) == 0) {
            DoneButtonDto.Companion.getClass();
            this.e = DoneButtonDto.d;
        } else {
            this.e = doneButtonDto;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultimodalFeedbackDto)) {
            return false;
        }
        MultimodalFeedbackDto multimodalFeedbackDto = (MultimodalFeedbackDto) obj;
        return jl40.l(this.a, multimodalFeedbackDto.a) && jl40.l(this.b, multimodalFeedbackDto.b) && jl40.l(this.c, multimodalFeedbackDto.c) && jl40.l(this.d, multimodalFeedbackDto.d) && jl40.l(this.e, multimodalFeedbackDto.e) && jl40.l(this.f, multimodalFeedbackDto.f) && jl40.l(this.g, multimodalFeedbackDto.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.c((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder r = defpackage.n.r("MultimodalFeedbackDto(title=", this.a, ", subtitle=", this.b, ", ratingSelector=");
        r.append(this.c);
        r.append(", commentField=");
        r.append(this.d);
        r.append(", doneButton=");
        r.append(this.e);
        r.append(", routeUris=");
        r.append(this.f);
        r.append(", imageTag=");
        return oyr.t(r, this.g, Extension.C_BRAKE);
    }

    public MultimodalFeedbackDto() {
        FormattedText formattedText = FormattedText.c;
        RatingSelectorDto.Companion.getClass();
        RatingSelectorDto ratingSelectorDto = RatingSelectorDto.e;
        CommentFieldDto.Companion.getClass();
        CommentFieldDto commentFieldDto = CommentFieldDto.g;
        DoneButtonDto.Companion.getClass();
        DoneButtonDto doneButtonDto = DoneButtonDto.d;
        this.a = formattedText;
        this.b = formattedText;
        this.c = ratingSelectorDto;
        this.d = commentFieldDto;
        this.e = doneButtonDto;
        this.f = EmptyList.a;
        this.g = "";
    }
}
