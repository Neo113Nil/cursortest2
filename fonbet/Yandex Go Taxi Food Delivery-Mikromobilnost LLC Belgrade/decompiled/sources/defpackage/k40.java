package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.b;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class k40 implements k0b0 {
    public final /* synthetic */ l0b0 a;
    public final Activity b;
    public final z9s0 c;

    public k40(Activity activity, z9s0 z9s0Var) {
        this.a = new l0b0(activity);
        this.b = activity;
        this.c = z9s0Var;
    }

    @Override // defpackage.k0b0
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.k0b0
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.k0b0
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.k0b0
    public final ArrayList d(int[] iArr) {
        return this.a.d(iArr);
    }

    @Override // defpackage.k0b0
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.k0b0
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.k0b0
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.k0b0
    public final boolean h() {
        return this.a.h();
    }

    public final boolean i() {
        int i;
        if (jx81.e()) {
            try {
                i = qke.h(this.a.a, "android.permission.BLUETOOTH_CONNECT");
            } catch (Exception e) {
                jst.e.x(e, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{"android.permission.BLUETOOTH_CONNECT"}, 1)));
                i = -1;
            }
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean j() {
        int i;
        try {
            i = qke.h(this.a.a, "android.permission.CALL_PHONE");
        } catch (Exception e) {
            jst.e.x(e, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{"android.permission.CALL_PHONE"}, 1)));
            i = -1;
        }
        return i == 0;
    }

    public final boolean k() {
        int i;
        try {
            i = qke.h(this.a.a, "android.permission.RECORD_AUDIO");
        } catch (Exception e) {
            jst.e.x(e, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{"android.permission.RECORD_AUDIO"}, 1)));
            i = -1;
        }
        return i == 0;
    }

    public final boolean l() {
        boolean f = jx81.f();
        Context context = this.a.a;
        int i = -1;
        if (f) {
            try {
                i = qke.h(context, "android.permission.READ_MEDIA_IMAGES");
            } catch (Exception e) {
                jst.e.x(e, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{"android.permission.READ_MEDIA_IMAGES"}, 1)));
            }
            if (i != 0) {
                return false;
            }
        } else {
            try {
                i = qke.h(context, "android.permission.READ_EXTERNAL_STORAGE");
            } catch (Exception e2) {
                jst.e.x(e2, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1)));
            }
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean m() {
        int i;
        try {
            i = qke.h(this.a.a, "android.permission.READ_PHONE_STATE");
        } catch (Exception e) {
            jst.e.x(e, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{"android.permission.READ_PHONE_STATE"}, 1)));
            i = -1;
        }
        return i == 0;
    }

    public final void n(int i) {
        this.c.a(i);
        b.J(this.b, jx81.b(i), i);
    }

    public final void o() {
        if (!jx81.f() || this.a.f()) {
            return;
        }
        n(12);
    }
}
