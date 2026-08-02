package xsna;

import android.app.Activity;
import android.os.Handler;
import com.vk.log.L;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import xsna.c63;
import xsna.q1q0;

/* compiled from: UiTrackingBgDetector.kt */
/* loaded from: classes.dex */
public final class w0q0 {
    public final b a;

    /* compiled from: UiTrackingBgDetector.kt */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: UiTrackingBgDetector.kt */
    public static final class b extends c {
        public final a c;
        public boolean d;
        public boolean e;
        public final q1q0 f;
        public final bpn0 g;
        public j3w h;

        public b(a aVar) {
            this.c = aVar;
            q1q0 q1q0Var = new q1q0();
            q1q0Var.a = EmptyList.b;
            q1q0Var.b = true;
            this.f = q1q0Var;
            this.g = new bpn0(new s3a(10));
            this.h = null;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(1:3)(1:45)|4|(4:6|(4:27|28|29|(5:31|(2:33|(1:36)(0))|39|40|(6:10|11|12|13|14|15))(0))(0)|8|(0))|44|11|12|13|14|15|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            r11 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        
            throw r11;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
        @Override // xsna.c63.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void o(Activity activity) {
            boolean z;
            ArrayList a;
            boolean z2;
            q1q0 q1q0Var = this.f;
            q1q0Var.getClass();
            if (!(gz80.a(26) ? activity.isInPictureInPictureMode() : false)) {
                if (!q1q0Var.b && !q1q0Var.c) {
                    try {
                        a = q1q0.a(activity);
                    } catch (Throwable th) {
                        L.j(th, "isNavigation calculation has failed");
                    }
                    if (a.size() == q1q0Var.a.size()) {
                        int size = a.size();
                        for (int i = 0; i < size; i++) {
                            q1q0.a aVar = (q1q0.a) q1q0Var.a.get(i);
                            int i2 = aVar.a;
                            int i3 = aVar.b;
                            q1q0.a aVar2 = (q1q0.a) a.get(i);
                            int i4 = aVar2.a;
                            int i5 = aVar2.b;
                            if (i4 == i2 && i5 == i3) {
                            }
                        }
                        z2 = false;
                        if (!z2) {
                            z = false;
                            q1q0Var.a = q1q0.a(activity);
                            q1q0Var.c = false;
                            this.e = z;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
            z = true;
            q1q0Var.a = q1q0.a(activity);
            q1q0Var.c = false;
            this.e = z;
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            this.e = false;
        }

        @Override // xsna.c63.b
        public final void u() {
            this.b = true;
            j3w j3wVar = this.h;
            if (j3wVar != null) {
                L.e("ImmediateHideObserver", "onAppBackground: aborted tracking appHide unsafely");
                ((Handler) this.g.getValue()).removeCallbacks(j3wVar);
                this.h = null;
            }
            if (this.d) {
                return;
            }
            L.e("ImmediateHideObserver", "onAppBackground: tracked appHide safely");
            this.d = true;
            this.c.a();
        }

        @Override // xsna.c63.b
        public final void v() {
            if (this.d || this.e) {
                return;
            }
            L.e("ImmediateHideObserver", "onAppBackgroundUnsafe: posted tracking appHide unsafely");
            this.h = new j3w(this, 1);
            ((Handler) this.g.getValue()).postDelayed(this.h, 500L);
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            if (this.b) {
                L.e("ImmediateHideObserver", "onAppForeground: tracked appShow safely");
                this.b = false;
                this.d = false;
                this.c.b();
            }
        }

        @Override // xsna.c63.b
        public final void y(Activity activity) {
            j3w j3wVar = this.h;
            if (j3wVar != null) {
                L.e("ImmediateHideObserver", "onAppForegroundUnsafe: aborted tracking appHide unsafely");
                ((Handler) this.g.getValue()).removeCallbacks(j3wVar);
                this.h = null;
            }
        }
    }

    /* compiled from: UiTrackingBgDetector.kt */
    public static abstract class c extends c63.b {
        public boolean b;
    }

    public w0q0(a aVar) {
        b bVar = new b(aVar);
        this.a = bVar;
        c63 c63Var = c63.a;
        c63.a(bVar);
    }
}
