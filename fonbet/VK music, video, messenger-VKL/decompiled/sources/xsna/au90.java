package xsna;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;

/* compiled from: PeerRelatedFragment.kt */
/* loaded from: classes.dex */
public interface au90 {
    default Bundle ok(long j, long j2) {
        Bundle bundle = new Bundle();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        bundle.putParcelable("dialog_id", Peer.a.b(j2));
        return bundle;
    }

    boolean v8(long j);
}
