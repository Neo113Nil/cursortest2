package com.yandex.go.places.models.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$DeleteUserReviewActionDto", "Lcom/yandex/go/places/models/data/entities/network/s;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/c", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionDto$DeleteUserReviewActionDto extends s {
    public static final c Companion = new c();
    public final String a;
    public final String b;

    public ActionDto$DeleteUserReviewActionDto(int i, String str, String str2) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDto$DeleteUserReviewActionDto)) {
            return false;
        }
        ActionDto$DeleteUserReviewActionDto actionDto$DeleteUserReviewActionDto = (ActionDto$DeleteUserReviewActionDto) obj;
        return jl40.l(this.a, actionDto$DeleteUserReviewActionDto.a) && jl40.l(this.b, actionDto$DeleteUserReviewActionDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DeleteUserReviewActionDto(orgId=", this.a, ", reviewId=", this.b, Extension.C_BRAKE);
    }

    public ActionDto$DeleteUserReviewActionDto() {
        this.a = "";
        this.b = "";
    }
}
