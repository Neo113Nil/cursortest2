package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.List;
import kotlin.Pair;

/* compiled from: ClipsDecorationPageResponse.kt */
/* loaded from: classes17.dex */
public final class bpd {
    public final List<Pair<SdkVideoFile, ClipsFeedDecorationPayload>> a;
    public final PaginationKey b;
    public final PaginationKey c;

    /* JADX WARN: Multi-variable type inference failed */
    public bpd(List<? extends Pair<? extends SdkVideoFile, ? extends ClipsFeedDecorationPayload>> list, PaginationKey paginationKey, PaginationKey paginationKey2) {
        this.a = list;
        this.b = paginationKey;
        this.c = paginationKey2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpd)) {
            return false;
        }
        bpd bpdVar = (bpd) obj;
        return epx.f(this.a, bpdVar.a) && epx.f(this.b, bpdVar.b) && epx.f(this.c, bpdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ClipsDecorationPageResponse(items=" + this.a + ", paginationKeyBackward=" + this.b + ", paginationKeyForward=" + this.c + ')';
    }
}
