package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class qmc0 implements fmc0 {
    public final UploadDto a;
    public final UserId b;
    public final boolean c;

    public qmc0(UploadDto uploadDto, UserId userId, boolean z) {
        this.a = uploadDto;
        this.b = userId;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmc0)) {
            return false;
        }
        qmc0 qmc0Var = (qmc0) obj;
        return epx.f(this.a, qmc0Var.a) && epx.f(this.b, qmc0Var.b) && this.c == qmc0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        UserId userId = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartUpload(uploadDto=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", showPublishSnackbar=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
