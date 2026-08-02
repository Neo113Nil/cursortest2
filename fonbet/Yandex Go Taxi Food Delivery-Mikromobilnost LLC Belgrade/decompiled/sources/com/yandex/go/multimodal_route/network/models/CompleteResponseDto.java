package com.yandex.go.multimodal_route.network.models;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/CompleteResponseDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CompleteResponseDto {
    public static final e Companion = new e();
    public final MultimodalFeedbackDto a;

    public /* synthetic */ CompleteResponseDto(int i, MultimodalFeedbackDto multimodalFeedbackDto) {
        if (1 == (i & 1)) {
            this.a = multimodalFeedbackDto;
        } else {
            qje.Z(i, 1, CompleteResponseDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompleteResponseDto) && jl40.l(this.a, ((CompleteResponseDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CompleteResponseDto(multimodalFeedback=" + this.a + Extension.C_BRAKE;
    }
}
