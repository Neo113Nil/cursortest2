package xsna;

import android.view.View;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.ui.components.common.DndPeriodAndSound;
import java.util.List;

/* compiled from: ProfileInfoViewEvent.kt */
/* loaded from: classes2.dex */
public abstract class zxd0 {

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class a extends zxd0 {
        public final View a;

        public a(View view) {
            this.a = view;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class b extends zxd0 {
        public static final b a = new b();
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class c extends zxd0 {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class d extends zxd0 {
        public static final d a = new d();
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class e extends zxd0 {
        public static final e a = new e();
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class f extends zxd0 {
        public final List<u8m> a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends u8m> list) {
            this.a = list;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class g extends zxd0 {
        public final List<u8m> a;

        /* JADX WARN: Multi-variable type inference failed */
        public g(List<? extends u8m> list) {
            this.a = list;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class h extends zxd0 {
        public final EduAchievement a;

        public h(EduAchievement eduAchievement) {
            this.a = eduAchievement;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class i extends zxd0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1177899284;
        }

        public final String toString() {
            return "EduAllOrganizationsClicked";
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class j extends zxd0 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1990106404;
        }

        public final String toString() {
            return "EduInviteToOrganizationClicked";
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class k extends zxd0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            ((k) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        public final String toString() {
            return "EduOrganizationClicked(organizationId=0)";
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class l extends zxd0 {
        public final xub a;

        public l(xub xubVar) {
            this.a = xubVar;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class m extends zxd0 {
        public static final m a = new m();
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class n extends zxd0 {
        public final qxb a;

        public n(qxb qxbVar) {
            this.a = qxbVar;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class o extends zxd0 {
        public final qxb a;

        public o(qxb qxbVar) {
            this.a = qxbVar;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class p extends zxd0 {
        public final DndPeriodAndSound a;

        public p(DndPeriodAndSound dndPeriodAndSound) {
            this.a = dndPeriodAndSound;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class q extends zxd0 {
        public final View a;

        public q(View view) {
            this.a = view;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class r extends zxd0 {
        public final View a;

        public r(View view) {
            this.a = view;
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static abstract class s extends zxd0 {

        /* compiled from: ProfileInfoViewEvent.kt */
        public static final class a extends s {
            public static final a a = new a();
        }

        /* compiled from: ProfileInfoViewEvent.kt */
        public static final class b extends s {
            public static final b a = new b();
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class t extends zxd0 {
        public static final t a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -36004926;
        }

        public final String toString() {
            return "SettingsClicked";
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class u extends zxd0 {
        public static final u a = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 1948704305;
        }

        public final String toString() {
            return "TitleClicked";
        }
    }

    /* compiled from: ProfileInfoViewEvent.kt */
    public static final class v extends zxd0 {
        public static final v a = new v();
    }
}
