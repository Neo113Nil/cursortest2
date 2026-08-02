package xsna;

import com.vk.dto.common.Peer;
import java.util.List;

/* compiled from: ImStoriesUtils.kt */
/* loaded from: classes2.dex */
public final class rdw {
    public static final List<Peer.Type> a = e43.l(Peer.Type.CONTACT, Peer.Type.USER, Peer.Type.CHANNEL);

    public static boolean a(Peer peer, boolean z) {
        return !z && a.contains(peer.c);
    }
}
