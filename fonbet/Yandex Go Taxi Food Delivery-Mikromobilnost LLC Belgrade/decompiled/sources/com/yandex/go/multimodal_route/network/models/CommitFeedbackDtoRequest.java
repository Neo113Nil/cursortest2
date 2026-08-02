package com.yandex.go.multimodal_route.network.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import defpackage.z2c;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/CommitFeedbackDtoRequest;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommitFeedbackDtoRequest {
    public static final b Companion = new b();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(21)), null};
    public final String a;
    public final Integer b;
    public final List c;
    public final String d;

    public /* synthetic */ CommitFeedbackDtoRequest(int i, Integer num, String str, String str2, List list) {
        if (13 != (i & 13)) {
            qje.Z(i, 13, CommitFeedbackDtoRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        this.c = list;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitFeedbackDtoRequest)) {
            return false;
        }
        CommitFeedbackDtoRequest commitFeedbackDtoRequest = (CommitFeedbackDtoRequest) obj;
        return jl40.l(this.a, commitFeedbackDtoRequest.a) && jl40.l(this.b, commitFeedbackDtoRequest.b) && jl40.l(this.c, commitFeedbackDtoRequest.c) && jl40.l(this.d, commitFeedbackDtoRequest.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.d.hashCode() + unr0.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return defpackage.n.l(", comment=", this.d, Extension.C_BRAKE, defpackage.n.q("CommitFeedbackDtoRequest(id=", this.b, this.a, ", rating=", ", hintIds="), this.c);
    }

    public CommitFeedbackDtoRequest(String str, Integer num, String str2, List list) {
        this.a = str;
        this.b = num;
        this.c = list;
        this.d = str2;
    }
}
