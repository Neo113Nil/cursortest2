package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import defpackage.b16;
import defpackage.exj;
import defpackage.lgt;
import defpackage.lp60;
import defpackage.nw01;
import defpackage.p5j0;
import defpackage.ph91;
import defpackage.pw21;
import defpackage.r7j0;
import defpackage.sgt;
import defpackage.tgt;
import defpackage.tzt0;
import defpackage.ugt;
import defpackage.wgt;
import defpackage.z2a1;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class a {
    public final lgt a;
    public final Handler b;
    public final ArrayList c;
    public final RequestManager d;
    public final b16 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public p5j0 i;
    public tgt j;
    public boolean k;
    public tgt l;
    public Bitmap m;
    public nw01 n;
    public tgt o;
    public int p;
    public int q;
    public int r;

    public a(Glide glide, lgt lgtVar, int i, int i2, nw01 nw01Var, Bitmap bitmap) {
        b16 bitmapPool = glide.getBitmapPool();
        RequestManager with = Glide.with(glide.getContext());
        p5j0 a = Glide.with(glide.getContext()).asBitmap().a(((r7j0) ((r7j0) r7j0.A(exj.a).z()).v(true)).m(i, i2));
        this.c = new ArrayList();
        this.d = with;
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bumptech.glide.load.resource.gif.GifFrameLoader$FrameLoaderCallback
            static final int MSG_CLEAR = 2;
            static final int MSG_DELAY = 1;

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i3 = message.what;
                if (i3 == 1) {
                    a.this.b((tgt) message.obj);
                    return true;
                }
                if (i3 != 2) {
                    return false;
                }
                a.this.d.clear((tgt) message.obj);
                return false;
            }
        });
        this.e = bitmapPool;
        this.b = handler;
        this.i = a;
        this.a = lgtVar;
        c(nw01Var, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        boolean z = this.h;
        int i2 = -1;
        lgt lgtVar = this.a;
        if (z) {
            z2a1.c("Pending target must be null when starting from the first frame", this.o == null);
            ((tzt0) lgtVar).k = -1;
            this.h = false;
        }
        tgt tgtVar = this.o;
        if (tgtVar != null) {
            this.o = null;
            b(tgtVar);
            return;
        }
        this.g = true;
        tzt0 tzt0Var = (tzt0) lgtVar;
        wgt wgtVar = tzt0Var.l;
        int i3 = wgtVar.c;
        if (i3 <= 0 || (i = tzt0Var.k) < 0) {
            i2 = 0;
        } else if (i >= 0 && i < i3) {
            i2 = ((sgt) wgtVar.e.get(i)).i;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + i2;
        int i4 = (tzt0Var.k + 1) % tzt0Var.l.c;
        tzt0Var.k = i4;
        this.l = new tgt(this.b, i4, uptimeMillis);
        p5j0 K = this.i.a((r7j0) new r7j0().u(new lp60(Double.valueOf(Math.random())))).K(lgtVar);
        K.F(this.l, null, K, ph91.a);
    }

    public final void b(tgt tgtVar) {
        this.g = false;
        boolean z = this.k;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, tgtVar).sendToTarget();
            return;
        }
        if (!this.f) {
            if (this.h) {
                handler.obtainMessage(2, tgtVar).sendToTarget();
                return;
            } else {
                this.o = tgtVar;
                return;
            }
        }
        if (tgtVar.z != null) {
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                this.e.c(bitmap);
                this.m = null;
            }
            tgt tgtVar2 = this.j;
            this.j = tgtVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ugt) arrayList.get(size)).onFrameReady();
            }
            if (tgtVar2 != null) {
                handler.obtainMessage(2, tgtVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(nw01 nw01Var, Bitmap bitmap) {
        z2a1.e(nw01Var, "Argument must not be null");
        this.n = nw01Var;
        z2a1.e(bitmap, "Argument must not be null");
        this.m = bitmap;
        this.i = this.i.a(new r7j0().x(nw01Var, true));
        this.p = pw21.f(bitmap);
        this.q = bitmap.getWidth();
        this.r = bitmap.getHeight();
    }
}
