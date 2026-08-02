package xsna;

import android.os.Handler;
import com.vk.dto.common.id.UserId;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: FavePodcastEpisode.kt */
/* loaded from: classes14.dex */
public final class xqq implements yqq {
    public static final xqq b = new xqq();
    public static final HashSet<yqq> c = new HashSet<>();
    public static final bpn0 d = new bpn0(new f4(16));

    @Override // xsna.yqq
    public final void ie(final int i, final UserId userId, final boolean z) {
        ((Handler) d.getValue()).post(new Runnable() { // from class: xsna.wqq
            @Override // java.lang.Runnable
            public final void run() {
                Iterator<yqq> it = xqq.c.iterator();
                while (it.hasNext()) {
                    it.next().ie(i, userId, z);
                }
            }
        });
    }
}
