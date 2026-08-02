package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import java.util.Stack;
import xsna.g8x;
import xsna.i8x;
import xsna.ijz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class o6z0 {
    public i8x g;
    public ijz0.c h;
    public lgz0 i;
    public int j;
    public float k;
    public boolean m;
    public float f = 1.0f;
    public int l = 10;
    public int n = 0;
    public final a a = new a();
    public final saz0 b = saz0.b(200);
    public final b c = new b();
    public final Stack d = new Stack();
    public final kwy0 e = new kwy0(null, null, null, null, new wiy0(new Handler(Looper.getMainLooper())));

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements i8x.a {
        public float a = 1.0f;

        public a() {
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o6z0.this.a();
        }
    }

    public final void a() {
        float f;
        float f2;
        float f3;
        lgz0 lgz0Var;
        lgz0 lgz0Var2;
        lgz0 lgz0Var3;
        i8x i8xVar;
        kwy0 kwy0Var = this.e;
        b bVar = this.c;
        saz0 saz0Var = this.b;
        lgz0 lgz0Var4 = this.i;
        float f4 = lgz0Var4 != null ? lgz0Var4.D : 0.0f;
        if (lgz0Var4 == null) {
            saz0Var.h(bVar);
            return;
        }
        if (this.n != 1 || (i8xVar = this.g) == null) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f = i8xVar.E();
            f2 = this.g.I();
            f3 = f4 - f2;
        }
        if (this.n != 1 || this.k == f2 || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.j++;
        } else {
            this.j = 0;
            this.k = f2;
            if (f2 < f4) {
                kwy0Var.b(f2, f4);
                ijz0.c cVar = this.h;
                if (cVar != null && (lgz0Var3 = this.i) != null) {
                    cVar.a(f3, f4, lgz0Var3);
                }
            } else {
                kwy0Var.b(f4, f4);
                ijz0.c cVar2 = this.h;
                if (cVar2 != null && (lgz0Var2 = this.i) != null) {
                    cVar2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, lgz0Var2);
                }
                saz0Var.h(bVar);
                if (this.n != 2) {
                    this.n = 2;
                    i8x i8xVar2 = this.g;
                    if (i8xVar2 != null) {
                        i8xVar2.y();
                    }
                    if (this.i != null && this.h != null) {
                        kwy0Var.i();
                        lgz0 lgz0Var5 = this.i;
                        this.i = null;
                        ijz0.c cVar3 = this.h;
                        ijz0 ijz0Var = ijz0.this;
                        if (!cVar3.b(lgz0Var5)) {
                            g8x g8xVar = ijz0Var.a;
                            g8x.d dVar = g8xVar.j;
                            if (dVar != null) {
                                dVar.d(g8xVar, ijz0Var.l);
                            }
                            xrz0 xrz0Var = ijz0Var.j;
                            if (xrz0Var != null) {
                                xrz0Var.f();
                            }
                        }
                    }
                }
            }
        }
        if (this.j >= (this.l * 1000) / 200) {
            gu8.c(null, "InstreamAdAudioController: Video freeze more then " + this.l + " seconds, stopping");
            i8x i8xVar3 = this.g;
            if (i8xVar3 != null) {
                i8xVar3.y();
            }
            saz0Var.h(bVar);
            kwy0Var.m();
            ijz0.c cVar4 = this.h;
            if (cVar4 == null || (lgz0Var = this.i) == null) {
                return;
            }
            ijz0 ijz0Var2 = ijz0.this;
            if (cVar4.b(lgz0Var)) {
                return;
            }
            g8x g8xVar2 = ijz0Var2.a;
            g8x.d dVar2 = g8xVar2.j;
            if (dVar2 != null) {
                dVar2.c(g8xVar2);
            }
            xrz0 xrz0Var2 = ijz0Var2.j;
            if (xrz0Var2 != null) {
                xrz0Var2.f();
            }
        }
    }

    public final Context b() {
        i8x i8xVar = this.g;
        if (i8xVar == null) {
            return null;
        }
        return i8xVar.J();
    }
}
