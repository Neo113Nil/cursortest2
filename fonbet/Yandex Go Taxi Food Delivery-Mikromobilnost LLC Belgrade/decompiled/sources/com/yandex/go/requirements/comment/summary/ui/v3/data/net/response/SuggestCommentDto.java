package com.yandex.go.requirements.comment.summary.ui.v3.data.net.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/response/SuggestCommentDto;", "", "Companion", "$serializer", "com/yandex/go/requirements/comment/summary/ui/v3/data/net/response/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestCommentDto {
    public static final h Companion = new h();
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ SuggestCommentDto(String str, int i, String str2, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestCommentDto)) {
            return false;
        }
        SuggestCommentDto suggestCommentDto = (SuggestCommentDto) obj;
        return jl40.l(this.a, suggestCommentDto.a) && this.b == suggestCommentDto.b && jl40.l(this.c, suggestCommentDto.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(oo31.l("SuggestCommentDto(text=", this.a, ", isAiGenerated=", ", imageTag=", this.b), this.c, Extension.C_BRAKE);
    }

    public SuggestCommentDto() {
        this.a = "";
        this.b = false;
        this.c = null;
    }
}
