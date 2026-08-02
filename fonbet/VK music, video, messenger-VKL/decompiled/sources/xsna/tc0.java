package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import xsna.kd0;
import xsna.zu50;

/* compiled from: AdBannerMediator.kt */
/* loaded from: classes16.dex */
public final class tc0 {
    public final q3a a;
    public final od0 b;
    public final boolean c;
    public final zu50 d;
    public String e;
    public izs<? super zu50, s3q0> f;

    public tc0(q3a q3aVar, od0 od0Var, boolean z) {
        this.a = q3aVar;
        this.b = od0Var;
        this.c = z;
        kd0.b a2 = od0Var.a();
        Context context = e43.a;
        zu50 zu50Var = new zu50(0, a2, context == null ? null : context);
        qnk qnkVar = zu50Var.a.a;
        Context context2 = e43.a;
        qnkVar.g("device_id", b6m.b(context2 == null ? null : context2));
        bpn0 bpn0Var = o25.a;
        qnkVar.g("user_id", String.valueOf(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).o().b().c.b));
        this.d = zu50Var;
        zu50Var.r = 5;
        zu50Var.i = new a();
    }

    public final void a() {
        String str = this.e;
        if (str != null) {
            this.a.b(new xxf0(str), false);
        }
    }

    /* compiled from: AdBannerMediator.kt */
    public final class a implements zu50.c {
        public a() {
        }

        @Override // xsna.zu50.c
        public final void c(iaz0 iaz0Var, zu50 zu50Var) {
            tc0.this.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        
            if (r1.i != null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            r0.b.c(r5);
            r5 = r0.f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (r5 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            r5.invoke(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x004e, code lost:
        
            if (r1.h != null) goto L37;
         */
        @Override // xsna.zu50.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(cw50 cw50Var, zu50 zu50Var) {
            kiw kiwVar;
            kiw kiwVar2;
            tc0 tc0Var = tc0.this;
            Bitmap bitmap = null;
            if (tc0Var.c) {
                cw50 d = zu50Var.d();
                if (d != null && (kiwVar2 = d.v) != null) {
                    bitmap = kiwVar2.a();
                }
                if (bitmap != null) {
                    if (d.o != null) {
                        if (d.l != null) {
                            if (d.g != null) {
                            }
                        }
                    }
                }
                tc0Var.a();
            }
            cw50 d2 = zu50Var.d();
            if (d2 != null && (kiwVar = d2.v) != null) {
                bitmap = kiwVar.a();
            }
            if (bitmap != null) {
                if (d2.o != null) {
                    if (d2.l != null) {
                        if (d2.g != null) {
                            if (d2.i != null) {
                                if (d2.n != null) {
                                }
                            }
                        }
                    }
                }
            }
            tc0Var.a();
        }

        @Override // xsna.zu50.c
        public final void onClick() {
        }

        @Override // xsna.zu50.c
        public final void onVideoComplete() {
        }

        @Override // xsna.zu50.c
        public final void onVideoPause() {
        }

        @Override // xsna.zu50.c
        public final void onVideoPlay() {
        }

        @Override // xsna.zu50.c
        public final void b(zu50 zu50Var) {
        }

        @Override // xsna.zu50.c
        public final void a(View view, zu50 zu50Var) {
        }
    }
}
