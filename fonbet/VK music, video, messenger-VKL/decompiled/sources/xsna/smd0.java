package xsna;

import com.vk.dto.group.AdminLeaveAction;
import xsna.ln50;
import xsna.on50;

/* compiled from: ProductCardTask.kt */
/* loaded from: classes18.dex */
public interface smd0 extends hn50 {

    /* compiled from: ProductCardTask.kt */
    public interface a extends smd0 {

        /* compiled from: ProductCardTask.kt */
        /* renamed from: xsna.smd0$a$a, reason: collision with other inner class name */
        public static final class C3678a implements a {
            public static final C3678a b = new C3678a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3678a);
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return 933889110;
            }

            public final String toString() {
                return "ShowBusinessOnboardingDialog";
            }
        }
    }

    /* compiled from: ProductCardTask.kt */
    public interface b extends smd0 {

        /* compiled from: ProductCardTask.kt */
        public static final class a implements b {
            public static final a b = new a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                return -1183382263;
            }

            public final String toString() {
                return "SubscribeGroup";
            }
        }

        /* compiled from: ProductCardTask.kt */
        /* renamed from: xsna.smd0$b$b, reason: collision with other inner class name */
        public static final class C3679b implements b {
            public final AdminLeaveAction b;

            public C3679b(AdminLeaveAction adminLeaveAction) {
                this.b = adminLeaveAction;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3679b) && this.b == ((C3679b) obj).b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }

            public final int hashCode() {
                AdminLeaveAction adminLeaveAction = this.b;
                if (adminLeaveAction == null) {
                    return 0;
                }
                return adminLeaveAction.hashCode();
            }

            public final String toString() {
                return "UnSubscribeGroup(adminLeaveAction=" + this.b + ')';
            }
        }
    }
}
