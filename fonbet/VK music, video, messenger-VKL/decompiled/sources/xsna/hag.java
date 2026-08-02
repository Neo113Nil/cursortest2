package xsna;

import com.vk.channels.api.CommentsHistory;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: Comment.kt */
/* loaded from: classes16.dex */
public final class hag {
    public final int a;
    public final UserId b;
    public final CharSequence c;
    public final List<Object> d;
    public final int e;
    public final CommentsHistory f;
    public final List<Integer> g;
    public final boolean h;
    public final boolean i;
    public final UserId j;
    public final Integer k;
    public final b l;
    public final Integer m;
    public final boolean n;
    public final boolean o;

    /* compiled from: Comment.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Reaction(id=");
            sb.append(this.a);
            sb.append(", count=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: Comment.kt */
    public static final class b {
        public final int a;
        public final List<a> b;
        public final Integer c;

        public b(int i, List<a> list, Integer num) {
            this.a = i;
            this.b = list;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int a = fw3.a(Integer.hashCode(this.a) * 31, 31, this.b);
            Integer num = this.c;
            return a + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Reactions(count=");
            sb.append(this.a);
            sb.append(", reactions=");
            sb.append(this.b);
            sb.append(", userReaction=");
            return uqi.b(sb, this.c, ')');
        }
    }

    public hag(int i, UserId userId, CharSequence charSequence, List<? extends Object> list, int i2, CommentsHistory commentsHistory, List<Integer> list2, boolean z, boolean z2, UserId userId2, Integer num, b bVar, Integer num2, boolean z3, boolean z4) {
        this.a = i;
        this.b = userId;
        this.c = charSequence;
        this.d = list;
        this.e = i2;
        this.f = commentsHistory;
        this.g = list2;
        this.h = z;
        this.i = z2;
        this.j = userId2;
        this.k = num;
        this.l = bVar;
        this.m = num2;
        this.n = z3;
        this.o = z4;
    }

    public static hag a(hag hagVar, CommentsHistory commentsHistory, boolean z, b bVar, boolean z2, int i) {
        int i2 = hagVar.a;
        UserId userId = hagVar.b;
        CharSequence charSequence = hagVar.c;
        List<Object> list = hagVar.d;
        int i3 = hagVar.e;
        CommentsHistory commentsHistory2 = (i & 32) != 0 ? hagVar.f : commentsHistory;
        List<Integer> list2 = hagVar.g;
        boolean z3 = (i & 128) != 0 ? hagVar.h : z;
        boolean z4 = hagVar.i;
        CommentsHistory commentsHistory3 = commentsHistory2;
        boolean z5 = z3;
        UserId userId2 = hagVar.j;
        Integer num = hagVar.k;
        b bVar2 = (i & 2048) != 0 ? hagVar.l : bVar;
        Integer num2 = hagVar.m;
        boolean z6 = (i & 8192) != 0 ? hagVar.n : z2;
        boolean z7 = (i & 16384) != 0 ? hagVar.o : true;
        hagVar.getClass();
        return new hag(i2, userId, charSequence, list, i3, commentsHistory3, list2, z5, z4, userId2, num, bVar2, num2, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hag)) {
            return false;
        }
        hag hagVar = (hag) obj;
        return this.a == hagVar.a && epx.f(this.b, hagVar.b) && epx.f(this.c, hagVar.c) && epx.f(this.d, hagVar.d) && this.e == hagVar.e && epx.f(this.f, hagVar.f) && epx.f(this.g, hagVar.g) && this.h == hagVar.h && this.i == hagVar.i && epx.f(this.j, hagVar.j) && epx.f(this.k, hagVar.k) && epx.f(this.l, hagVar.l) && epx.f(this.m, hagVar.m) && this.n == hagVar.n && this.o == hagVar.o;
    }

    public final int hashCode() {
        int b2 = qoy.b(qoy.b(fw3.a((this.f.hashCode() + shy.a(this.e, fw3.a(u11.c(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c), 31, this.d), 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
        UserId userId = this.j;
        int hashCode = (b2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.k;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        b bVar = this.l;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num2 = this.m;
        return Boolean.hashCode(this.o) + qoy.b((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comment(id=");
        sb.append(this.a);
        sb.append(", fromId=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append((Object) this.c);
        sb.append(", attachments=");
        sb.append(this.d);
        sb.append(", date=");
        sb.append(this.e);
        sb.append(", thread=");
        sb.append(this.f);
        sb.append(", parentStack=");
        sb.append(this.g);
        sb.append(", isDeleted=");
        sb.append(this.h);
        sb.append(", canDelete=");
        sb.append(this.i);
        sb.append(", replyToUser=");
        sb.append(this.j);
        sb.append(", replyToComment=");
        sb.append(this.k);
        sb.append(", reactions=");
        sb.append(this.l);
        sb.append(", updateTime=");
        sb.append(this.m);
        sb.append(", isRestoreAvailable=");
        sb.append(this.n);
        sb.append(", isRealPlaceUnknown=");
        return defpackage.q0.a(sb, this.o, ')');
    }
}
