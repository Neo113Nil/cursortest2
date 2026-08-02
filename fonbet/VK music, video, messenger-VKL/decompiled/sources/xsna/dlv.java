package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Result;

/* compiled from: HuaweiHealthDataSource.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class dlv implements c680, cvp {
    public final Object b;

    public static final void e(UserId userId, List list, Map map) {
        Collection<Owner> values;
        dlv dlvVar = new dlv();
        if (map != null && (values = map.values()) != null) {
            for (Owner owner : values) {
                UserId userId2 = owner.b;
                String str = owner.c;
                ((LinkedHashMap) dlvVar.b).put(fkq0.a(owner.b), new PlaylistOwner(userId2, str == null ? "" : str, null, str, owner.l, null, null, 100, null));
            }
        }
        dlvVar.d(userId, list);
    }

    public void a(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Group group = (Group) it.next();
                ((LinkedHashMap) this.b).put(fkq0.a(group.c), new PlaylistOwner(group));
            }
        }
    }

    public void b(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UserProfile userProfile = (UserProfile) it.next();
                ((LinkedHashMap) this.b).put(userProfile.c, new PlaylistOwner(userProfile));
            }
        }
    }

    @Override // xsna.cvp
    public void c() {
        ((com.vk.libvideo.live.impl.views.live.b) this.b).a();
    }

    public void d(UserId userId, List list) {
        for (Object obj : list) {
            if (obj != null) {
                Playlist playlist = (Playlist) obj;
                playlist.q = (PlaylistOwner) ((LinkedHashMap) this.b).get(fkq0.a(playlist.Bb(userId).c));
            }
        }
    }

    @Override // xsna.c680
    public void onFailure(Exception exc) {
        ((lq9) this.b).resumeWith(new Result.Failure(exc));
    }

    public dlv() {
        this.b = new LinkedHashMap();
    }

    public dlv(d3z d3zVar) {
        this.b = new CountDownLatch(1);
    }
}
