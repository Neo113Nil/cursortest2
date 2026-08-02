package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.vk.rlottie.RLottieDrawable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RenderData.kt */
/* loaded from: classes5.dex */
public class eyf0 {
    public final int A;
    public final int B;
    public int C;
    public final io.reactivex.rxjava3.disposables.b D;
    public final long a;
    public final int[] b;
    public final boolean c;
    public final boolean d;
    public final AtomicInteger e;
    public volatile Bitmap f;
    public izs<? super Canvas, s3q0> g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public boolean l;
    public boolean m;
    public int n;
    public final Paint o;
    public final AtomicBoolean p;
    public int q;
    public int r;
    public volatile boolean s;
    public RLottieDrawable.a t;
    public int u;
    public gzs<s3q0> v;
    public final ArrayList w;
    public boolean x;
    public boolean y;
    public final boolean z;

    public eyf0(long j, int[] iArr, boolean z, boolean z2, AtomicInteger atomicInteger, izs izsVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, AtomicBoolean atomicBoolean4, Paint paint, AtomicBoolean atomicBoolean5, boolean z3) {
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ArrayList arrayList = new ArrayList();
        this.a = j;
        this.b = iArr;
        this.c = z;
        this.d = z2;
        this.e = atomicInteger;
        this.f = null;
        this.g = izsVar;
        this.h = atomicBoolean;
        this.i = atomicBoolean2;
        this.j = atomicBoolean3;
        this.k = atomicBoolean4;
        this.l = true;
        this.m = true;
        this.n = 0;
        this.o = paint;
        this.p = atomicBoolean5;
        this.q = -1;
        this.r = 0;
        this.s = false;
        this.t = null;
        this.u = 0;
        this.v = null;
        this.w = arrayList;
        this.x = false;
        this.y = false;
        this.z = z3;
        this.A = 1;
        int i = iArr[0];
        int i2 = i != 0 ? 1000 / i : 16;
        if (i < 0 || i >= 31) {
            if (z2) {
                this.A = 2;
                i2 = 33;
            } else {
                i2 = Math.max(16, i2);
            }
        }
        this.B = i2;
        this.C = -1;
        this.D = new io.reactivex.rxjava3.disposables.b();
    }
}
