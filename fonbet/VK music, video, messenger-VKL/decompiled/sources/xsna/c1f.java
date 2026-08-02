package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.vk.media.MediaUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ClipsRenderingLayer.kt */
/* loaded from: classes3.dex */
public final class c1f implements uq10 {
    public final MediaUtils.d a;
    public final h5f b = new h5f();
    public final h5f c = new h5f();
    public final Bitmap d;
    public final boolean e;
    public final a f;

    /* compiled from: ClipsRenderingLayer.kt */
    public final class a {
        public final int a;
        public final int b;
        public volatile Bitmap c;
        public Canvas d;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final void a() {
            Bitmap bitmap = this.c;
            Canvas canvas = this.d;
            int i = this.a;
            int i2 = this.b;
            if (bitmap != null && !bitmap.isRecycled() && canvas != null && bitmap.getWidth() == i && bitmap.getHeight() == i2 && canvas.getWidth() == i && canvas.getHeight() == i2) {
                return;
            }
            Bitmap d = kd7.d(this.a, this.b);
            this.c = d;
            if (this.c != null) {
                this.d = new Canvas(d);
            }
        }
    }

    public c1f(ArrayList arrayList, MediaUtils.d dVar) {
        this.a = dVar;
        this.f = new a(dVar.a, dVar.b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nov novVar = (nov) it.next();
            if (novVar.getStickerLayerType() < 4) {
                this.b.a(novVar.C0());
            } else if (novVar.getStickerLayerType() > 4) {
                this.c.a(novVar.C0());
            }
        }
        boolean z = this.b.e() || this.c.e();
        this.e = z;
        this.d = z ? null : a(-1, -1);
    }

    public final Bitmap a(int i, int i2) {
        a aVar = this.f;
        aVar.a();
        Canvas canvas = aVar.d;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        try {
            if (!this.b.b.isEmpty()) {
                h5f h5fVar = this.b;
                h5fVar.c = i;
                a aVar2 = this.f;
                h5fVar.d(aVar2.a, aVar2.b);
                this.b.b(canvas, i2);
            }
            if (!this.c.b.isEmpty()) {
                h5f h5fVar2 = this.c;
                h5fVar2.c = i;
                a aVar3 = this.f;
                h5fVar2.d(aVar3.a, aVar3.b);
                this.c.b(canvas, -1);
            }
        } catch (Exception e) {
            lyd.a.g(e, Arrays.copyOf(new Object[0], 0));
        }
        a aVar4 = this.f;
        aVar4.a();
        return aVar4.c;
    }

    @Override // xsna.uq10
    public final boolean c() {
        return false;
    }

    @Override // xsna.uq10
    public final uq10 copy() {
        return new c1f(j5g.u0(this.c.b, this.b.b), this.a);
    }

    @Override // xsna.uq10
    public final Bitmap d(int i, int i2) {
        return (this.e || (i2 != -1)) ? a(i, i2) : this.d;
    }

    @Override // xsna.uq10
    public final void e() {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.b.b;
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            copyOnWriteArrayList.get(i).stopEncoding();
        }
        CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = this.c.b;
        int size2 = copyOnWriteArrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            copyOnWriteArrayList2.get(i2).stopEncoding();
        }
    }

    @Override // xsna.uq10
    public final void f() {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.b.b;
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            copyOnWriteArrayList.get(i).startEncoding();
        }
        CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = this.c.b;
        int size2 = copyOnWriteArrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            copyOnWriteArrayList2.get(i2).startEncoding();
        }
    }

    @Override // xsna.uq10
    public final boolean z0() {
        return this.e;
    }

    @Override // xsna.uq10
    public final void b() {
    }
}
