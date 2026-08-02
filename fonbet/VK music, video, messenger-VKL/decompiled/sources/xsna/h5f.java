package xsna;

import android.graphics.Canvas;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptyList;

/* compiled from: ClipsStickersState.kt */
/* loaded from: classes17.dex */
public final class h5f {
    public q a;
    public final CopyOnWriteArrayList<nov> b = new CopyOnWriteArrayList<>(EmptyList.b);
    public int c = -1;

    public static boolean f(nov novVar, int i) {
        q500 o = novVar.getCommons().o();
        return (o == null || o.f((long) i)) ? false : true;
    }

    public final void a(nov novVar) {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.b;
        int size = copyOnWriteArrayList.size();
        int i = 0;
        if (!copyOnWriteArrayList.isEmpty() && novVar.getStickerLayerType() >= copyOnWriteArrayList.get(0).getStickerLayerType()) {
            if (novVar.getStickerLayerType() >= copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).getStickerLayerType()) {
                size = copyOnWriteArrayList.size();
            } else {
                int size2 = copyOnWriteArrayList.size();
                while (i < size2) {
                    if (novVar.getStickerLayerType() >= copyOnWriteArrayList.get(i).getStickerLayerType()) {
                        i++;
                    }
                }
            }
            copyOnWriteArrayList.add(size, novVar);
        }
        size = i;
        copyOnWriteArrayList.add(size, novVar);
    }

    public final void b(Canvas canvas, int i) {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.b;
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nov novVar = copyOnWriteArrayList.get(i2);
            novVar.setTimestampMsValue(this.c);
            if (!novVar.getInEditMode() && !f(novVar, this.c)) {
                boolean z = i != -1 && (novVar instanceof oin0);
                if (z) {
                    ((oin0) novVar).setPreviewMode(i);
                }
                novVar.F0(canvas, true);
                if (z) {
                    ((oin0) novVar).setPreviewMode(-1);
                }
            }
        }
    }

    public final omv c() {
        nov novVar;
        tr0 tr0Var = new tr0(8);
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.b;
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                novVar = null;
                break;
            }
            if (((Boolean) tr0Var.invoke(copyOnWriteArrayList.get(i))).booleanValue()) {
                novVar = copyOnWriteArrayList.get(i);
                break;
            }
            i++;
        }
        if (novVar instanceof omv) {
            return (omv) novVar;
        }
        return null;
    }

    public final void d(int i, int i2) {
        Iterator<nov> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().w0(i, i2);
        }
    }

    public final boolean e() {
        nov novVar;
        nov novVar2;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.b;
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            novVar = null;
            if (i >= size) {
                novVar2 = null;
                break;
            }
            if (copyOnWriteArrayList.get(i).z0()) {
                novVar2 = copyOnWriteArrayList.get(i);
                break;
            }
            i++;
        }
        if (novVar2 != null) {
            return true;
        }
        int size2 = copyOnWriteArrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                break;
            }
            if (copyOnWriteArrayList.get(i2).getCommons().o() != null) {
                novVar = copyOnWriteArrayList.get(i2);
                break;
            }
            i2++;
        }
        return novVar != null;
    }
}
