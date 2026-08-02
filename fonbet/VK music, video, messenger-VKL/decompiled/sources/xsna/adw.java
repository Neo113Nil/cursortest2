package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.Peer;
import java.io.File;

/* compiled from: ImSharingBridge.kt */
/* loaded from: classes2.dex */
public interface adw {
    void a(Context context, Attach attach, Peer peer);

    default void b(Context context, File file) {
        Serializer.c<AttachDoc> cVar = AttachDoc.CREATOR;
        AttachDoc a = AttachDoc.a.a(file);
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        a(context, a, Peer.Unknown.e);
    }
}
