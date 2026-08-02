package xsna;

import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;

/* compiled from: CommunityCheckListAction.kt */
/* loaded from: classes18.dex */
public abstract class mvg implements kj50 {

    /* compiled from: CommunityCheckListAction.kt */
    public static final class a extends mvg {
        public final int b;
        public final int c;
        public final Intent d;

        public a(int i, int i2, Intent intent) {
            this.b = i;
            this.c = i2;
            this.d = intent;
        }
    }

    /* compiled from: CommunityCheckListAction.kt */
    public static final class b extends mvg {
        public final CommunityCheckListTip.Type b;
        public final String c;

        public b(CommunityCheckListTip.Type type, String str) {
            this.b = type;
            this.c = str;
        }
    }

    /* compiled from: CommunityCheckListAction.kt */
    public static abstract class d {

        /* compiled from: CommunityCheckListAction.kt */
        public static final class a extends d {
            public final UserId a;

            public a(UserId userId) {
                this.a = userId;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class b extends d {
            public final UserId a;

            public b(UserId userId) {
                this.a = userId;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class c extends d {
            public final UserId a;

            public c(UserId userId) {
                this.a = userId;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        /* renamed from: xsna.mvg$d$d, reason: collision with other inner class name */
        public static final class C3375d extends d {
            public final UserId a;

            public C3375d(UserId userId) {
                this.a = userId;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class e extends d {
            public final String a;

            public e(String str) {
                this.a = str;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class f extends d {
            public final String a;

            public f(String str) {
                this.a = str;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class g extends d {
            public final UserId a;
            public final String b;

            public g(UserId userId, String str) {
                this.a = userId;
                this.b = str;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class h extends d {
            public final UserId a;
            public final String b;

            public h(UserId userId, String str) {
                this.a = userId;
                this.b = str;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class i extends d {
            public final String a;

            public i(String str) {
                this.a = str;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class j extends d {
            public final UserId a;

            public j(UserId userId) {
                this.a = userId;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class k extends d {
            public final String a;

            public k(String str) {
                this.a = str;
            }
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class l extends d {
            public static final l a = new l();
        }

        /* compiled from: CommunityCheckListAction.kt */
        public static final class m extends d {
            public final CommunityCheckListTip.Type a;
            public final String b;

            public m(CommunityCheckListTip.Type type, String str) {
                this.a = type;
                this.b = str;
            }
        }
    }

    /* compiled from: CommunityCheckListAction.kt */
    public static final class e extends mvg {
        public final String b;

        public e(String str) {
            this.b = str;
        }
    }

    /* compiled from: CommunityCheckListAction.kt */
    public static final class f extends mvg {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 849391279;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: CommunityCheckListAction.kt */
    public static final class g extends mvg {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1828905433;
        }

        public final String toString() {
            return "Resume";
        }
    }

    /* compiled from: CommunityCheckListAction.kt */
    public static final class h extends mvg {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1998660476;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: CommunityCheckListAction.kt */
    public static final class i extends mvg {
        public final CommunityCheckListTip.Type b;

        public i(CommunityCheckListTip.Type type) {
            this.b = type;
        }
    }

    /* compiled from: CommunityCheckListAction.kt */
    public static final class c extends mvg {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Init(deeplinkTipType="), this.b, ')');
        }

        public c() {
            this(null);
        }
    }
}
