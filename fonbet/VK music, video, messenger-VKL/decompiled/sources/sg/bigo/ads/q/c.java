package sg.bigo.ads.q;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* loaded from: classes9.dex */
public final class c {
    public static WeakReference<b> a;
    protected final int b;
    protected final int c;
    protected final int d;
    protected final float e;

    public interface a {
        boolean a();
    }

    public interface b {
        void a(int i, int i2, int i3, int i4);

        void a(int i, int i2, int i3, int i4, int i5);

        boolean a(@NonNull MotionEvent motionEvent, @Nullable a aVar, int i);

        void a_(int i);

        void b_(int i);

        void c(int i);

        void d(int i);
    }

    public c(int i, int i2, int i3, float f) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public final void a() {
        int i = this.b;
        WeakReference<b> weakReference = a;
        b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar != null) {
            bVar.b_(i);
        }
    }

    public final void b() {
        int i = this.b;
        WeakReference<b> weakReference = a;
        b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar != null) {
            bVar.c(i);
        }
    }

    public final void c() {
        int i = this.b;
        WeakReference<b> weakReference = a;
        b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar != null) {
            bVar.d(i);
        }
    }

    public final int d() {
        return this.d;
    }

    public final float e() {
        return this.e;
    }

    public final boolean f() {
        int i = this.c;
        return i == 2 || i == 4 || i == 6;
    }

    public final boolean g() {
        int i = this.c;
        return (i == 3 || i == 4 || i == 5 || i == 6) ? false : true;
    }

    public static void a(int i, int i2, int i3, int i4) {
        WeakReference<b> weakReference = a;
        b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar != null) {
            bVar.a(i, i2, i3, i4);
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        WeakReference<b> weakReference = a;
        b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar != null) {
            bVar.a(i, i2, i3, i4, i5);
        }
    }

    public static void a(LandingPageStyleConfig landingPageStyleConfig) {
        if (landingPageStyleConfig == null || !landingPageStyleConfig.a() || landingPageStyleConfig.b()) {
            return;
        }
        WeakReference<b> weakReference = a;
        b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar != null) {
            bVar.a_(landingPageStyleConfig.c);
        }
    }

    public final boolean a(@NonNull MotionEvent motionEvent, a aVar) {
        int i = this.b;
        WeakReference<b> weakReference = a;
        b bVar = weakReference != null ? weakReference.get() : null;
        if (bVar != null) {
            return bVar.a(motionEvent, aVar, i);
        }
        return false;
    }
}
