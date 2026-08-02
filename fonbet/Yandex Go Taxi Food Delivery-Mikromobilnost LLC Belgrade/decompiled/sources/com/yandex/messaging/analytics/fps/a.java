package com.yandex.messaging.analytics.fps;

import android.content.Context;
import android.view.Choreographer;
import android.view.WindowManager;
import defpackage.dfs;

/* loaded from: classes15.dex */
public final class a {
    public final Context a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public final Choreographer j = Choreographer.getInstance();
    public final FrameRateCalculator$PostFrameCallback k = new Choreographer.FrameCallback() { // from class: com.yandex.messaging.analytics.fps.FrameRateCalculator$PostFrameCallback
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long current) {
            if (current == 0) {
                return;
            }
            a aVar = a.this;
            long j = aVar.g;
            Choreographer choreographer = aVar.j;
            if (j == 0) {
                aVar.g = current / 1000000;
            } else {
                aVar.h = current / 1000000;
            }
            int i = aVar.f + 1;
            aVar.f = i;
            if (i >= 5000) {
                aVar.b();
                return;
            }
            long j2 = aVar.i;
            if (j2 == 0) {
                aVar.i = current;
                choreographer.postFrameCallback(this);
                return;
            }
            long j3 = (current - j2) / 1000000;
            aVar.i = current;
            if (j3 > aVar.c) {
                aVar.c = j3;
            }
            if (j3 > 100) {
                aVar.d++;
            } else if (j3 > 25) {
                aVar.e++;
            }
            choreographer.postFrameCallback(this);
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.messaging.analytics.fps.FrameRateCalculator$PostFrameCallback] */
    public a(Context context) {
        this.a = context;
    }

    public final boolean a() {
        if (this.f <= 2) {
            return false;
        }
        long j = this.g;
        if (j <= 0) {
            return false;
        }
        long j2 = this.h;
        return j2 > 0 && this.c > 0 && j != j2;
    }

    public final dfs b() {
        this.j.removeFrameCallback(this.k);
        if (!a()) {
            return null;
        }
        return new dfs(!a() ? -1 : (int) (((this.f - 1) * 1000) / (this.h - this.g)), a() ? (int) (((this.f - 2) * 1000) / ((this.h - this.g) - this.c)) : -1, this.f, this.e, this.d, this.c, (int) ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay().getRefreshRate());
    }
}
