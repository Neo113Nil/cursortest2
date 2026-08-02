package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import com.vk.dto.music.Playlist;
import com.vk.music.offline.api.model.DownloadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xm9 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xm9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj;
        switch (this.b) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                List list = (List) this.d;
                atomicBoolean.set(true);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!(((nov) obj2) instanceof o7m0)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 1:
                vh40 vh40Var = (vh40) this.c;
                Playlist playlist = (Playlist) this.d;
                Iterator<T> it = vh40Var.h.z().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Playlist) obj).b == playlist.b) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Playlist playlist2 = (Playlist) obj;
                if (playlist2 != null) {
                    vh40Var.b(playlist2);
                }
                return vh40Var.b.w(o25.a().c(), DownloadType.DOWNLOADED);
            default:
                cts0 cts0Var = (cts0) this.c;
                Context context = (Context) this.d;
                synchronized (cts0Var.a) {
                    try {
                        MediaSessionCompat c = cts0.c(context);
                        if (c == null) {
                            return null;
                        }
                        ats0 ats0Var = new ats0();
                        c.setCallback(ats0Var, new Handler(Looper.getMainLooper()));
                        c.setActive(true);
                        cts0Var.c = c;
                        cts0Var.d = ats0Var;
                        cts0Var.e.clear();
                        cts0Var.b = false;
                        return cts0Var.d(c);
                    } finally {
                        cts0Var.a.notifyAll();
                    }
                }
        }
    }
}
