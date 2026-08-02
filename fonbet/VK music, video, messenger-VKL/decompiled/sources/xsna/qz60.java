package xsna;

import android.util.SparseArray;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vk.newsfeed.domain.model.NewsfeedInitialPost;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.whs;

/* compiled from: NewsfeedState.kt */
/* loaded from: classes4.dex */
public final class qz60 implements tw60<qz60> {
    public static final qz60 j = new qz60(ur60.h, 0, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP), null, new k070(null), new pz60(null, true), new a(false, 15), null);
    public final ur60 b;
    public final int c;
    public final String d;
    public final NewsfeedList e;
    public final k070 f;
    public final pz60 g;
    public final a h;
    public final NewsfeedInitialPost i;

    /* compiled from: NewsfeedState.kt */
    public static final class a {
        public final SparseArray<lu60> a;
        public final whs b;
        public final int c;
        public final boolean d;

        public a() {
            this(false, 15);
        }

        public static a a(a aVar, SparseArray sparseArray, whs whsVar, int i, boolean z, int i2) {
            if ((i2 & 1) != 0) {
                sparseArray = aVar.a;
            }
            if ((i2 & 2) != 0) {
                whsVar = aVar.b;
            }
            if ((i2 & 4) != 0) {
                i = aVar.c;
            }
            if ((i2 & 8) != 0) {
                z = aVar.d;
            }
            aVar.getClass();
            return new a(sparseArray, whsVar, i, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FreshNews(list=");
            sb.append(this.a);
            sb.append(", loadingState=");
            sb.append(this.b);
            sb.append(", autoRetryCount=");
            sb.append(this.c);
            sb.append(", appendFreshNews=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public a(SparseArray<lu60> sparseArray, whs whsVar, int i, boolean z) {
            this.a = sparseArray;
            this.b = whsVar;
            this.c = i;
            this.d = z;
        }

        public /* synthetic */ a(boolean z, int i) {
            this(new SparseArray(), whs.c.a, 0, (i & 8) != 0 ? false : z);
        }
    }

    public qz60(ur60 ur60Var, int i, String str, NewsfeedList newsfeedList, k070 k070Var, pz60 pz60Var, a aVar, NewsfeedInitialPost newsfeedInitialPost) {
        this.b = ur60Var;
        this.c = i;
        this.d = str;
        this.e = newsfeedList;
        this.f = k070Var;
        this.g = pz60Var;
        this.h = aVar;
        this.i = newsfeedInitialPost;
    }

    public static qz60 a(qz60 qz60Var, ur60 ur60Var, int i, String str, NewsfeedList newsfeedList, k070 k070Var, pz60 pz60Var, a aVar, NewsfeedInitialPost newsfeedInitialPost, int i2) {
        if ((i2 & 1) != 0) {
            ur60Var = qz60Var.b;
        }
        ur60 ur60Var2 = ur60Var;
        if ((i2 & 2) != 0) {
            i = qz60Var.c;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = qz60Var.d;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            newsfeedList = qz60Var.e;
        }
        NewsfeedList newsfeedList2 = newsfeedList;
        if ((i2 & 16) != 0) {
            k070Var = qz60Var.f;
        }
        k070 k070Var2 = k070Var;
        if ((i2 & 32) != 0) {
            pz60Var = qz60Var.g;
        }
        pz60 pz60Var2 = pz60Var;
        a aVar2 = (i2 & 64) != 0 ? qz60Var.h : aVar;
        NewsfeedInitialPost newsfeedInitialPost2 = (i2 & 128) != 0 ? qz60Var.i : newsfeedInitialPost;
        qz60Var.getClass();
        return new qz60(ur60Var2, i3, str2, newsfeedList2, k070Var2, pz60Var2, aVar2, newsfeedInitialPost2);
    }

    @Override // xsna.tw60
    public final qz60 b(ur60 ur60Var) {
        return a(this, ur60Var, 0, null, null, null, null, null, null, 254);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz60)) {
            return false;
        }
        qz60 qz60Var = (qz60) obj;
        return epx.f(this.b, qz60Var.b) && this.c == qz60Var.c && epx.f(this.d, qz60Var.d) && epx.f(this.e, qz60Var.e) && epx.f(this.f, qz60Var.f) && epx.f(this.g, qz60Var.g) && epx.f(this.h, qz60Var.h) && epx.f(this.i, qz60Var.i);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        NewsfeedList newsfeedList = this.e;
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((a2 + (newsfeedList == null ? 0 : newsfeedList.hashCode())) * 31)) * 31)) * 31)) * 31;
        NewsfeedInitialPost newsfeedInitialPost = this.i;
        return hashCode + (newsfeedInitialPost != null ? newsfeedInitialPost.hashCode() : 0);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedState@");
        sb.append(System.identityHashCode(this));
        sb.append("(listState=");
        sb.append(this.b);
        sb.append(", listId=");
        return vu5.b(sb, this.c, ')');
    }
}
