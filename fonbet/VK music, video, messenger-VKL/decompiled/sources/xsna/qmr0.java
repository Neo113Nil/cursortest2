package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.bridgeimpl.PushBridgeType;
import kotlin.Pair;
import xsna.krg0;

/* compiled from: VendorProvider.kt */
/* loaded from: classes.dex */
public final class qmr0 implements w8i {
    public static final bpn0 h = new bpn0(new ihg(11));
    public rmr0 b;
    public final bpn0 c = new bpn0(new exw(6));
    public final bpn0 d = new bpn0(new ag7(10));
    public final bpn0 e = new bpn0(new fb8(this, 12));
    public final bpn0 f = new bpn0(new gb8(this, 7));
    public final bpn0 g = new bpn0(new g67(this, 8));

    public final rmr0 a() {
        rmr0 rmr0Var;
        rmr0 rmr0Var2 = this.b;
        if (rmr0Var2 != null) {
            return rmr0Var2;
        }
        int m = (int) Preference.m(0L, "vendor", "preferred_impl_type");
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{lhg.a(m, "[Vendor] Got preferred vendor from pref:")});
        }
        if (m == PushBridgeType.GOOGLE.h()) {
            rmr0Var = (w2u) this.d.getValue();
        } else if (m == PushBridgeType.HUAWEI.h()) {
            rmr0Var = (dav) this.c.getValue();
        } else {
            boolean z = pmr0.a;
            Context context = rwi.e;
            if (context == null) {
                context = null;
            }
            if (pmr0.a(context)) {
                rmr0Var = (w2u) this.d.getValue();
            } else {
                Context context2 = rwi.e;
                if (context2 == null) {
                    context2 = null;
                }
                rmr0Var = pmr0.b(context2) ? (dav) this.c.getValue() : (rmr0) h.getValue();
            }
        }
        this.b = rmr0Var;
        Context context3 = rwi.e;
        if (context3 == null) {
            context3 = null;
        }
        if (rmr0Var == null) {
            rmr0Var = null;
        }
        krg0 b = com.vk.toggle.d.P0.b();
        if (b == null) {
            krg0.c.getClass();
            b = krg0.a.a();
        }
        if (b.a()) {
            boolean z2 = pmr0.a;
            grg0 grg0Var = (grg0) this.f.getValue();
            ki4 ki4Var = new ki4(rmr0Var, b, this, 11);
            if (Preference.v("vendor", "rustore_services_available")) {
                ki4Var.invoke(Boolean.valueOf(Preference.d("vendor", "rustore_services_available", false)));
            } else {
                grg0Var.b(new y310(new alj0(ki4Var, 16), 3));
            }
            if (!pmr0.c) {
                pmr0.c = true;
                asu0.a.getClass();
                asu0.o().execute(new df6(context3, grg0Var, ki4Var, 8));
            }
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.w;
            StringBuilder sb = new StringBuilder("[Vendor] Use push bridge type:");
            rmr0 rmr0Var3 = this.b;
            if (rmr0Var3 == null) {
                rmr0Var3 = null;
            }
            sb.append(rmr0Var3.g());
            L.u(l2, logType, new Object[]{sb.toString()});
        }
        rmr0 rmr0Var4 = this.b;
        if (rmr0Var4 == null) {
            return null;
        }
        return rmr0Var4;
    }

    public final void b() {
        Preference.C("vendor", "preferred_impl_type");
    }

    public final void c(int i) {
        Preference.F(i, "vendor", "preferred_impl_type");
    }

    /* compiled from: VendorProvider.kt */
    /* loaded from: classes5.dex */
    public static final class a implements rmr0 {
        public final int b = PushBridgeType.EMPTY.h();

        @Override // xsna.rmr0
        public final Pair<String, Long> c() {
            return new Pair<>("", 0L);
        }

        @Override // xsna.rmr0
        public final String d() {
            return "empty";
        }

        @Override // xsna.rmr0
        public final boolean e() {
            return false;
        }

        @Override // xsna.rmr0
        public final int g() {
            return this.b;
        }

        @Override // xsna.rmr0
        public final void a() {
        }

        @Override // xsna.rmr0
        public final void b() {
        }

        @Override // xsna.rmr0
        public final void f(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        }
    }
}
