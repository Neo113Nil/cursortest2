package xsna;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import java.util.HashSet;
import java.util.LinkedList;
import xsna.rl8;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes12.dex */
public final class k900 implements sc7 {
    public final j0u0 b = new j0u0();
    public final int c;
    public final gvb0 d;
    public int e;

    public k900(int i, u370 u370Var) {
        this.c = i;
        this.d = u370Var;
    }

    @Override // xsna.avb0, xsna.zag0
    public final void a(Object obj) {
        boolean add;
        Bitmap bitmap = (Bitmap) obj;
        this.b.getClass();
        int d = id7.d(bitmap);
        if (d <= this.c) {
            this.d.getClass();
            j0u0 j0u0Var = this.b;
            j0u0Var.getClass();
            if (j0u0.e(bitmap)) {
                synchronized (j0u0Var) {
                    add = ((HashSet) j0u0Var.b).add(bitmap);
                }
                if (add) {
                    rl8 rl8Var = (rl8) j0u0Var.c;
                    int d2 = id7.d(bitmap);
                    synchronized (rl8Var) {
                        try {
                            rl8.a aVar = (rl8.a) rl8Var.a.get(d2);
                            rl8.a aVar2 = aVar;
                            if (aVar == null) {
                                LinkedList<I> linkedList = new LinkedList<>();
                                rl8.a aVar3 = new rl8.a();
                                aVar3.a = null;
                                aVar3.b = d2;
                                aVar3.c = linkedList;
                                aVar3.d = null;
                                rl8Var.a.put(d2, aVar3);
                                aVar2 = aVar3;
                            }
                            aVar2.c.addLast(bitmap);
                            if (rl8Var.b != aVar2) {
                                rl8Var.a(aVar2);
                                rl8.a aVar4 = rl8Var.b;
                                if (aVar4 == null) {
                                    rl8Var.b = aVar2;
                                    rl8Var.c = aVar2;
                                } else {
                                    aVar2.d = aVar4;
                                    aVar4.a = aVar2;
                                    rl8Var.b = aVar2;
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            synchronized (this) {
                this.e += d;
            }
        }
    }

    @Override // xsna.avb0
    public final Bitmap get(int i) {
        synchronized (this) {
            try {
                if (this.e > 0) {
                    i(0);
                }
                Bitmap d = this.b.d(i);
                if (d == null) {
                    this.d.getClass();
                    return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
                this.b.getClass();
                this.e -= id7.d(d);
                this.d.getClass();
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.f320
    public final void h(MemoryTrimType memoryTrimType) {
        i((int) ((1.0d - memoryTrimType.h()) * 0));
    }

    public final synchronized void i(int i) {
        Bitmap bitmap;
        while (this.e > i && (bitmap = (Bitmap) this.b.f()) != null) {
            this.b.getClass();
            this.e -= id7.d(bitmap);
            this.d.getClass();
        }
    }
}
