package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import java.util.ArrayList;

/* compiled from: CommunityCheckListPatch.kt */
/* loaded from: classes18.dex */
public abstract class owg implements xl50 {

    /* compiled from: CommunityCheckListPatch.kt */
    public static abstract class a extends owg {

        /* compiled from: CommunityCheckListPatch.kt */
        /* renamed from: xsna.owg$a$a, reason: collision with other inner class name */
        public static final class C3476a extends a {
        }

        /* compiled from: CommunityCheckListPatch.kt */
        public static final class b extends owg {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }
        }

        /* compiled from: CommunityCheckListPatch.kt */
        public static final class c extends a {
            public final int b;
            public final int c;
            public final ArrayList d;
            public final UserId e;
            public final uy9 f;

            public c(int i, int i2, ArrayList arrayList, UserId userId, uy9 uy9Var) {
                this.b = i;
                this.c = i2;
                this.d = arrayList;
                this.e = userId;
                this.f = uy9Var;
            }
        }
    }

    /* compiled from: CommunityCheckListPatch.kt */
    public static final class b extends owg {
        public final String b;
        public final String c;

        public b(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadGroupInfo(description=");
            sb.append(this.b);
            sb.append(", shortAddress=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityCheckListPatch.kt */
    public static abstract class c extends owg {

        /* compiled from: CommunityCheckListPatch.kt */
        public static final class a extends c {
            public final nwg b;

            public a(nwg nwgVar) {
                this.b = nwgVar;
            }
        }
    }

    /* compiled from: CommunityCheckListPatch.kt */
    public static final class d extends owg {
        public final CommunityCheckListTip.Type b;

        public d(CommunityCheckListTip.Type type) {
            this.b = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetTipCompleted(type=" + this.b + ')';
        }
    }
}
