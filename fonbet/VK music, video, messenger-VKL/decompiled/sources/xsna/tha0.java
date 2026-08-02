package xsna;

import android.app.Activity;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.xia0;

/* compiled from: PickerComponent.kt */
/* loaded from: classes2.dex */
public final class tha0 extends j8i {
    public static final /* synthetic */ qcy<Object>[] t;
    public final Activity i;
    public final mxv j;
    public final u90 k;
    public final kkm l;
    public a m;
    public boolean n;
    public final y1q0 o;
    public io.reactivex.rxjava3.disposables.b p;
    public final b q;
    public final g9e0 r;
    public sia0 s;

    /* compiled from: PickerComponent.kt */
    public final class b implements xia0.a {
        public b() {
        }

        @Override // xsna.xia0.a
        public final void j() {
            tha0.this.s.getClass();
        }

        @Override // xsna.xia0.a
        public final void n0(float f) {
            tha0.this.s.d(f);
        }

        @Override // xsna.xia0.a
        public final int o0(int i) {
            return tha0.this.s.b(i);
        }

        @Override // xsna.xia0.a
        public final void onDestroyView() {
            tha0 tha0Var = tha0.this;
            tha0Var.s.a();
            tha0Var.r.a();
            tha0Var.p.dispose();
            tha0Var.m.getClass();
            if (tha0Var.n) {
                tha0Var.o.a();
            }
            tha0Var.n = true;
        }

        @Override // xsna.xia0.a
        public final boolean p0() {
            sia0 sia0Var = tha0.this.s;
            sia0Var.getClass();
            return sia0Var instanceof zyz;
        }

        @Override // xsna.xia0.a
        public final void q0() {
            tha0 tha0Var = tha0.this;
            tha0Var.s.getClass();
            EmptyList.b.getClass();
            xia0 X0 = tha0Var.X0();
            X0.m = null;
            X0.q.removeCallbacksAndMessages(null);
            d98 d98Var = X0.l;
            if (d98Var != null) {
                d98Var.g.X(5);
            }
        }

        @Override // xsna.xia0.a
        public final void query(String str) {
            tha0.this.s.e(str);
        }

        @Override // xsna.xia0.a
        public final void r0() {
            tha0 tha0Var = tha0.this;
            tha0Var.s.getClass();
            EmptyList.b.getClass();
            xia0 X0 = tha0Var.X0();
            X0.m = null;
            X0.q.removeCallbacksAndMessages(null);
            d98 d98Var = X0.l;
            if (d98Var != null) {
                d98Var.g.X(5);
            }
        }

        @Override // xsna.xia0.a
        public final void s0() {
            tha0.this.s.getClass();
        }

        @Override // xsna.xia0.a
        public final CharSequence t0() {
            tha0.this.m.getClass();
            return "";
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(tha0.class, "vc", "getVc()Lcom/vk/im/ui/components/msg_send/picker/PickerVc;", 0);
        fpf0.a.getClass();
        t = new qcy[]{propertyReference1Impl};
    }

    public tha0(Activity activity, mxv mxvVar, u90 u90Var, kkm kkmVar) {
        MsgSendSource.e eVar = MsgSendSource.e.a;
        this.i = activity;
        this.j = mxvVar;
        this.k = u90Var;
        this.l = kkmVar;
        a.a.getClass();
        this.m = a.C3744a.b;
        this.n = true;
        this.o = new y1q0(0);
        this.p = new io.reactivex.rxjava3.disposables.b();
        this.q = new b();
        this.r = new g9e0(new gd40(this, 8));
        this.s = sia0.c;
    }

    @Override // xsna.j8i
    public final void M0() {
        if (this.r.c()) {
            xia0 X0 = X0();
            X0.m = null;
            X0.q.removeCallbacksAndMessages(null);
            d98 d98Var = X0.l;
            if (d98Var != null) {
                d98Var.g.X(5);
            }
        }
    }

    @Override // xsna.j8i
    public final void N0() {
        this.s.a();
        if (this.r.c()) {
            xia0 X0 = X0();
            X0.m = null;
            X0.q.removeCallbacksAndMessages(null);
            d98 d98Var = X0.l;
            if (d98Var != null) {
                d98Var.g.X(5);
            }
        }
    }

    @Override // xsna.j8i
    public final void Q0() {
        this.s.f();
    }

    @Override // xsna.j8i
    public final void R0() {
        this.s.g();
    }

    public final xia0 X0() {
        qcy<Object> qcyVar = t[0];
        return (xia0) this.r.b();
    }

    public final void Y0(String str, MsgSendSource.b bVar) {
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.g(permissionHelper, this.i, PermissionHelper.h, PermissionHelper.i, R.string.vkim_permissions_location, R.string.vkim_permissions_location, new itb(this, str, bVar, 2), null, null, 128);
    }

    /* compiled from: PickerComponent.kt */
    public interface a {
        public static final C3744a a = C3744a.a;

        /* compiled from: PickerComponent.kt */
        /* renamed from: xsna.tha0$a$a, reason: collision with other inner class name */
        public static final class C3744a {
            public static final /* synthetic */ C3744a a = new C3744a();
            public static final C3745a b = new C3745a();

            /* compiled from: PickerComponent.kt */
            /* renamed from: xsna.tha0$a$a$a, reason: collision with other inner class name */
            public static final class C3745a implements a {
                @Override // xsna.tha0.a
                public final void a(List list, String str, MsgSendSource msgSendSource) {
                }
            }
        }

        default void a(List list, String str, MsgSendSource msgSendSource) {
        }
    }
}
