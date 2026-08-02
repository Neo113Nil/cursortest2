package xsna;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import com.vk.core.apps.BuildInfo;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.k840;

/* compiled from: AudioPlayerPoolImpl.kt */
/* loaded from: classes3.dex */
public final class os4 implements xs4 {
    public final ys4 a;
    public final aw40 b;
    public final boolean c;
    public final MessageQueue d;
    public final ms4 e;
    public final ns4 f;
    public final Context g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r2v7, types: [xsna.ms4] */
    /* JADX WARN: Type inference failed for: r2v8, types: [xsna.ns4] */
    public os4(Context context, ys4 ys4Var, aw40 aw40Var) {
        this.a = ys4Var;
        this.b = aw40Var;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        this.c = com.vk.toggle.d.T(k840.a.i.b());
        this.d = Looper.getMainLooper().getQueue();
        this.e = new MessageQueue.IdleHandler() { // from class: xsna.ms4
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                os4 os4Var = os4.this;
                Context context2 = os4Var.g;
                if (context2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ArrayList arrayList = os4Var.h;
                int size = arrayList.size();
                int i = os4Var.a.a;
                int size2 = i - (size < i ? arrayList.size() : sa30.m(arrayList, at4.READY).size());
                if (size2 < 0) {
                    size2 = 0;
                }
                bn40.b(uq.b(arrayList, ji.b(size2, "[AudioPlayerPool] - prepare ", " slot(s). Total slots - ")));
                for (int i2 = 0; i2 < size2; i2++) {
                    os4Var.e(context2, arrayList, os4Var.c);
                }
                return false;
            }
        };
        this.f = new MessageQueue.IdleHandler() { // from class: xsna.ns4
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                os4 os4Var = os4.this;
                Context context2 = os4Var.g;
                if (context2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z = os4Var.c;
                ArrayList arrayList = os4Var.h;
                ArrayList m = sa30.m(arrayList, at4.DIRTY);
                bn40.b("[AudioPlayerPool] - refresh " + m.size() + " dirty slot(s). Total slots - " + arrayList.size());
                int size = os4Var.a.a - sa30.m(arrayList, at4.READY).size();
                if (size < 0) {
                    size = 0;
                }
                Iterator it = m.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    zs4 zs4Var = (zs4) next;
                    if (i < size) {
                        sa30.J(zs4Var, context2, os4Var.b, z);
                    } else {
                        zs4Var.b = at4.DIRTY;
                        sa30.M(zs4Var.a, false);
                        arrayList.remove(zs4Var);
                    }
                    i = i2;
                }
                return false;
            }
        };
        this.g = context;
        this.h = new ArrayList();
    }

    @Override // xsna.xs4
    public final void a(Context context) {
        d(new hy2(1));
        this.d.addIdleHandler(this.e);
    }

    @Override // xsna.xs4
    public final AudioPlayer b(Context context, boolean z) {
        d(new com.vk.movika.sdk.base.ui.g0(4));
        at4 at4Var = at4.READY;
        ArrayList arrayList = this.h;
        zs4 zs4Var = (zs4) j5g.Z(sa30.m(arrayList, at4Var));
        if (zs4Var != null) {
            bn40.b("[AudioPlayerPool] - receive slot from pool");
        } else {
            Context context2 = this.g;
            if (context2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            zs4Var = e(context2, arrayList, z);
            bn40.b("[AudioPlayerPool] - receive new slot");
        }
        boolean z2 = z && (zs4Var.a instanceof hk80);
        boolean z3 = !z && (zs4Var.a instanceof l5q);
        if (!z2 && !z3) {
            zs4Var.b = at4.DIRTY;
            sa30.M(zs4Var.a, false);
            sa30.J(zs4Var, context, this.b, z);
        }
        bn40.b("[AudioPlayerPool] - refresh slot with new player type");
        zs4Var.b = at4.BUSY;
        this.d.addIdleHandler(this.e);
        return zs4Var.a;
    }

    @Override // xsna.xs4
    public final void c(Context context, AudioPlayer audioPlayer) {
        Object obj;
        d(new t61(1));
        Iterator it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((zs4) obj).a == audioPlayer) {
                    break;
                }
            }
        }
        zs4 zs4Var = (zs4) obj;
        if (zs4Var == null) {
            bn40.h("[AudioPlayerPool] - release unknown instance");
            sa30.M(audioPlayer, false);
            return;
        }
        boolean z = this.a.c;
        zs4Var.b = at4.DIRTY;
        sa30.M(zs4Var.a, z);
        if (audioPlayer.isReleased()) {
            this.d.addIdleHandler(this.f);
            return;
        }
        Context context2 = this.g;
        if (context2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        sa30.J(zs4Var, context2, this.b, this.c);
    }

    public final <T> void d(gzs<? extends T> gzsVar) {
        if (!i0q0.b()) {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            if (BuildInfo.h()) {
                throw new RuntimeException("[AudioPlayerPool] - main thread required");
            }
            bn40.d("[AudioPlayerPool] - main thread required");
            gzsVar.invoke();
        }
        if (this.g == null) {
            BuildInfo.Client client2 = BuildInfo.a;
            VKApplication vKApplication2 = com.vk.core.apps.a.a;
            if (BuildInfo.h()) {
                throw new RuntimeException("[AudioPlayerPool] - already destroyed");
            }
            bn40.d("[AudioPlayerPool] - already destroyed");
            gzsVar.invoke();
        }
    }

    public final zs4 e(Context context, ArrayList arrayList, boolean z) {
        aw40 aw40Var = this.b;
        AudioPlayer hk80Var = z ? new hk80(context, aw40Var) : new l5q(context, aw40Var);
        at4 at4Var = at4.READY;
        zs4 zs4Var = new zs4();
        zs4Var.a = hk80Var;
        zs4Var.b = at4Var;
        if (arrayList.size() < this.a.b) {
            arrayList.add(zs4Var);
            return zs4Var;
        }
        bn40.h("[AudioPlayerPool] - pool is oversize");
        return zs4Var;
    }
}
