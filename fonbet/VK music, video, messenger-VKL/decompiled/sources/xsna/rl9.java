package xsna;

import android.os.ConditionVariable;
import android.util.Log;
import android.util.Size;
import androidx.annotation.Nullable;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.ArrayList;
import ru.ok.proto.PublisherConfiguration;
import xsna.jhu0;

/* compiled from: CameraSource.java */
/* loaded from: classes3.dex */
public final class rl9 {
    public final b a = new b();
    public final ConditionVariable b = new ConditionVariable();
    public final d0 c = new d0(this, 3);
    public final ja6 d = new ja6(this, 1);

    /* compiled from: CameraSource.java */
    public final class b extends a {
        public static final /* synthetic */ int p = 0;
        public jhu0 k;
        public khu0 l;
        public int m = 0;
        public boolean n;

        public b() {
        }

        @Override // xsna.rl9.a
        public final void l(jhu0 jhu0Var) {
            if (jhu0Var == null || jhu0Var.a() == -1) {
                return;
            }
            jhu0 jhu0Var2 = this.k;
            if (jhu0Var2 != null) {
                jhu0Var2.a();
            }
            jhu0Var.a();
            jhu0 jhu0Var3 = this.k;
            rl9 rl9Var = rl9.this;
            if (jhu0Var3 == null || jhu0Var3.a() != jhu0Var.a()) {
                try {
                    this.k = jhu0Var;
                    this.l = jhu0Var.b();
                    this.n = false;
                    tj9 parameters = jhu0Var.getParameters();
                    Size h = parameters != null ? parameters.h() : null;
                    MediaUtils.d dVar = new MediaUtils.d(h != null ? h.getWidth() : CoverVideoUploadTask.y, h != null ? h.getHeight() : PublisherConfiguration.DEFAULT_MAX_RES);
                    this.m = m8g.a(dVar);
                    rl9Var.a.h = dVar;
                } catch (Throwable unused) {
                    Log.e("dzx0", "can't camera change!");
                }
            }
            rl9Var.b.open();
        }

        @Override // xsna.rl9.a
        public final void m() {
            super.m();
            o(false);
            this.k = null;
            this.m = 0;
        }

        @Override // xsna.rl9.c
        public final void n(int i, int i2, int i3, byte[] bArr) {
            if (bArr == null) {
                return;
            }
            ArrayList<c> arrayList = this.i;
            if (!arrayList.isEmpty() && bArr.length == this.m && this.l != null) {
                int a = io9.a();
                khu0 khu0Var = this.l;
                if (khu0Var.a() == 0) {
                    a = 360 - a;
                }
                i3 = (khu0Var.getOrientation() + a) % 360;
                for (int i4 = 0; i4 != arrayList.size(); i4++) {
                    arrayList.get(i4).n(i, i2, i3, bArr);
                }
            }
            c cVar = this.j;
            if (cVar != null) {
                cVar.n(i, i2, i3, bArr);
            }
            jhu0 jhu0Var = this.k;
            if (jhu0Var != null) {
                jhu0Var.w(bArr);
            }
        }

        public final void o(boolean z) {
            L.p("register=" + z + ", isPreviewCallbackRegistered?=" + this.n);
            if (this.n != z) {
                if (!z) {
                    p(null);
                    this.n = false;
                } else if (this.m > 0) {
                    p(this);
                    this.n = true;
                } else {
                    L.l("Failed to register camera preview callback, buffer size=" + this.m);
                }
            }
        }

        public final void p(b bVar) {
            try {
                jhu0 jhu0Var = this.k;
                if (jhu0Var != null) {
                    jhu0Var.v(bVar);
                }
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(new RuntimeException("Failed to set camera preview callback (" + bVar + ")", th));
            }
        }
    }

    /* compiled from: CameraSource.java */
    public interface c {
        void n(int i, int i2, int i3, @Nullable byte[] bArr);
    }

    /* compiled from: CameraSource.java */
    public static abstract class a extends dzx0 implements jhu0.c, c {
        public MediaUtils.d h = null;
        public final ArrayList<c> i = new ArrayList<>();

        @Nullable
        public c j;

        @Override // xsna.jhu0.c
        public final void f(byte[] bArr) {
            ih9 k = k();
            if (k == null || !k.a()) {
                return;
            }
            k.sendMessage(k.obtainMessage(1, bArr));
        }

        @Override // xsna.dzx0
        public final czx0 h() {
            return new ih9(this);
        }

        public final ih9 k() {
            if (this.b == null) {
                Log.e("dzx0", "call decoder.start() before");
            }
            return (ih9) this.b;
        }

        public void m() {
            this.i.clear();
        }

        public void l(jhu0 jhu0Var) {
        }
    }
}
