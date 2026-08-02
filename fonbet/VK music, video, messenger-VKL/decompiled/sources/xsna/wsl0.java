package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.stories.ImStoryState;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoriesInfoManagerImpl.kt */
/* loaded from: classes2.dex */
public final class wsl0 implements vsl0, mtx0 {
    public final tgl0 b;
    public final dhl0<z4m0, Peer> c;

    /* compiled from: StoriesInfoManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends Peer>, Map<Peer, ? extends z4m0>> {
        @Override // xsna.izs
        public final Map<Peer, ? extends z4m0> invoke(Collection<? extends Peer> collection) {
            ImStoryState imStoryState;
            wsl0 wsl0Var = (wsl0) this.receiver;
            wsl0Var.getClass();
            Cursor d = wsl0Var.b.b().d(xqm0.g("\n            SELECT * from stories_info where\n             owner_id in (" + j5g.g0(collection, StringUtils.COMMA, null, null, 0, new fxi0(2), 30) + ")\n        "), null);
            HashMap hashMap = new HashMap(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            Peer b = Peer.a.b(d.getLong(0));
                            Peer b2 = Peer.a.b(d.getLong(0));
                            ImStoryState.a aVar = ImStoryState.Companion;
                            int i = d.getInt(1);
                            aVar.getClass();
                            if (i == 0) {
                                imStoryState = ImStoryState.NONE;
                            } else if (i == 1) {
                                imStoryState = ImStoryState.NEW;
                            } else {
                                if (i != 2) {
                                    throw new IllegalArgumentException("Illegal typeAsInt value: " + i);
                                }
                                imStoryState = ImStoryState.SEEN;
                            }
                            hashMap.put(b, new z4m0(b2, imStoryState, d.getLong(2)));
                            d.moveToNext();
                        }
                    }
                    Trace.endSection();
                    return hashMap;
                } finally {
                    d.close();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    /* compiled from: StoriesInfoManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Collection<? extends z4m0>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends z4m0> collection) {
            Collection<? extends z4m0> collection2 = collection;
            wsl0 wsl0Var = (wsl0) this.receiver;
            wsl0Var.getClass();
            if (!collection2.isEmpty()) {
                wsl0Var.b.b().h(new fa00(collection2, 26));
            }
            return s3q0.a;
        }
    }

    public wsl0(tgl0 tgl0Var) {
        this.b = tgl0Var;
        this.c = new dhl0<>(200, tgl0Var.c(z4m0.class), new rvq(27), new a(1, this, wsl0.class, "getFromDb", "getFromDb(Ljava/util/Collection;)Ljava/util/Map;", 0), new b(1, this, wsl0.class, "putToDb", "putToDb(Ljava/util/Collection;)V", 0), tgl0Var.I0());
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
    }

    @Override // xsna.vsl0
    public final void a(List<z4m0> list) {
        this.c.f(list);
    }

    @Override // xsna.vsl0
    public final Map<Peer, z4m0> b(Collection<? extends Peer> collection) {
        return this.c.e(collection);
    }
}
