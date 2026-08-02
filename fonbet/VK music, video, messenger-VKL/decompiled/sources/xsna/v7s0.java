package xsna;

import android.content.Context;
import androidx.media3.exoplayer.offline.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.mediastore.media.VideoCacheIdImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.exo.offline.DownloadInfo;
import one.video.player.model.VideoContentType;

/* compiled from: VideoCacheManager.kt */
@ozl
/* loaded from: classes8.dex */
public final class v7s0 {
    public final Context a;
    public final p7s0 b;
    public final ConcurrentHashMap<String, k7s0> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<r7s0, List<a>> d = new ConcurrentHashMap<>();
    public final LinkedList<Runnable> e = new LinkedList<>();
    public final AtomicBoolean f = new AtomicBoolean();

    /* compiled from: VideoCacheManager.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.RTMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.OFFLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoContentType.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoContentType.FRAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoContentType.MP4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoContentType.HLS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoContentType.DASH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoCacheManager.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<r7s0, k7s0> {
        @Override // xsna.izs
        public final k7s0 invoke(r7s0 r7s0Var) {
            return ((v7s0) this.receiver).e(r7s0Var);
        }
    }

    public v7s0(Context context, p7s0 p7s0Var) {
        this.a = context;
        this.b = p7s0Var;
    }

    public static final void a(v7s0 v7s0Var, k7s0 k7s0Var) {
        Map<String, o7o> map = k7s0Var.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new DownloadInfo((o7o) entry.getValue()));
        }
        List<a> list = v7s0Var.d.get(k7s0Var.a);
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a(linkedHashMap);
            }
        }
    }

    public static void g(k7s0 k7s0Var) {
        androidx.media3.exoplayer.offline.a aVar;
        androidx.media3.exoplayer.offline.c cVar = k7s0Var.f;
        if (cVar == null || (aVar = cVar.b) == null) {
            return;
        }
        a.C0060a g = aVar.g(new int[0]);
        while (g.moveToNext()) {
            try {
                o7o l = androidx.media3.exoplayer.offline.a.l(g.b);
                k7s0Var.g = pn00.o(k7s0Var.g, new Pair(l.a.b, l));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ro.e(g, th);
                    throw th2;
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
        g.close();
    }

    public final void b(ay8 ay8Var) {
        k7s0 e = e(ay8Var.e);
        androidx.media3.exoplayer.offline.c cVar = e.f;
        Map<String, o7o> map = e.g;
        String str = ay8Var.d;
        o7o o7oVar = map.get(str);
        if (o7oVar == null) {
            h(ay8Var, e);
            return;
        }
        int i = o7oVar.b;
        if (i != 0) {
            if (i == 1) {
                if (cVar != null) {
                    cVar.i(0, str);
                }
                if (cVar != null) {
                    cVar.g(false);
                    return;
                }
                return;
            }
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (cVar != null) {
                        cVar.a(o7oVar.a, 0);
                        return;
                    }
                    return;
                } else if (i == 5) {
                    h(ay8Var, e);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
        }
        if (cVar != null) {
            cVar.g(false);
        }
    }

    public final void c(r7s0 r7s0Var, a aVar) {
        ConcurrentHashMap<r7s0, List<a>> concurrentHashMap = this.d;
        List<a> list = concurrentHashMap.get(r7s0Var);
        if (list == null) {
            list = EmptyList.b;
        }
        concurrentHashMap.put(r7s0Var, j5g.v0(aVar, list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void d(r7s0... r7s0VarArr) {
        try {
            try {
                uki0 D = rl3.D(r7s0VarArr);
                c cVar = new c(1, this, v7s0.class, "getCacheById", "getCacheById(Lone/video/player/model/VideoCacheId;)Lone/video/exo/cache/VideoCache;", 0);
                Iterator it = D.iterator();
                while (it.hasNext()) {
                    androidx.media3.exoplayer.offline.c cVar2 = ((k7s0) cVar.invoke(it.next())).f;
                    if (cVar2 != null) {
                        cVar2.e();
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized k7s0 e(r7s0 r7s0Var) {
        k7s0 k7s0Var;
        try {
            k7s0Var = this.c.get(r7s0Var.getId());
            if (k7s0Var == null) {
                k7s0Var = this.b.a(r7s0Var);
                if (k7s0Var == null) {
                    throw new IllegalStateException("Unknown " + this + ". You must have factory for each VideoCacheId");
                }
                g(k7s0Var);
                androidx.media3.exoplayer.offline.c cVar = k7s0Var.f;
                if (cVar != null) {
                    cVar.f.add(new w7s0(this, k7s0Var));
                }
                this.c.put(r7s0Var.getId(), k7s0Var);
                List<a> list = this.d.get(r7s0Var);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).onInitialized();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return k7s0Var;
    }

    public final boolean f(r7s0 r7s0Var) {
        return this.c.get(r7s0Var.getId()) != null;
    }

    public final void h(ay8 ay8Var, k7s0 k7s0Var) {
        String str;
        switch (b.$EnumSwitchMapping$0[ay8Var.a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                str = MimeTypes.APPLICATION_MP4;
                break;
            case 6:
                str = MimeTypes.APPLICATION_M3U8;
                break;
            case 7:
                str = MimeTypes.APPLICATION_MPD;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.e.add(new u7s0(this, ay8Var, str, k7s0Var, 2));
        i();
    }

    public final void i() {
        if (this.f.get()) {
            return;
        }
        LinkedList<Runnable> linkedList = this.e;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.removeFirst().run();
    }

    public final void j(VideoCacheIdImpl videoCacheIdImpl) {
        if (videoCacheIdImpl != null) {
            androidx.media3.exoplayer.offline.c cVar = e(videoCacheIdImpl).f;
            if (cVar != null) {
                cVar.i(2, null);
                return;
            }
            return;
        }
        Iterator<T> it = this.c.values().iterator();
        while (it.hasNext()) {
            androidx.media3.exoplayer.offline.c cVar2 = ((k7s0) it.next()).f;
            if (cVar2 != null) {
                cVar2.i(2, null);
            }
        }
    }

    /* compiled from: VideoCacheManager.kt */
    public interface a {
        default void onInitialized() {
        }

        default void a(LinkedHashMap linkedHashMap) {
        }
    }
}
