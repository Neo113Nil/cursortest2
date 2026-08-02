package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsPaginationDecorPayload;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: ChatClipsDecorationPaginationKey.kt */
/* loaded from: classes2.dex */
public final class fob implements apd {
    public final ClipsDecorationPaginationKey a;
    public final ArrayList b;

    public fob(ImChatPaginationKey imChatPaginationKey, ArrayList arrayList) {
        this.a = imChatPaginationKey;
        this.b = arrayList;
    }

    @Override // xsna.apd
    public final List<Pair<SdkClipVideoFile, ImChatClipsPaginationDecorPayload>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fob)) {
            return false;
        }
        fob fobVar = (fob) obj;
        return epx.f(this.a, fobVar.a) && this.b.equals(fobVar.b);
    }

    public final int hashCode() {
        ClipsDecorationPaginationKey clipsDecorationPaginationKey = this.a;
        return this.b.hashCode() + ((clipsDecorationPaginationKey == null ? 0 : clipsDecorationPaginationKey.hashCode()) * 31);
    }

    @Override // xsna.apd
    public final ClipsDecorationPaginationKey s1() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatClipsDecorationPaginationKey(nextFrom=");
        sb.append(this.a);
        sb.append(", clips=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
