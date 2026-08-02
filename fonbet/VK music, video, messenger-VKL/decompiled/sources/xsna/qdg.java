package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.NewsComment;

/* compiled from: CommentVideoActionsMenuBuilderImpl.kt */
/* loaded from: classes4.dex */
public final class qdg {
    public final NewsComment a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final UserId i;
    public final UserId j;
    public final UserId k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r7.equals(r13) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (xsna.t6g0.b().g0(r5.j) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        if (r6.equals(r13) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qdg(NewsComment newsComment, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, UserId userId, UserId userId2) {
        boolean z7;
        boolean z8;
        boolean z9;
        this.a = newsComment;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = i;
        this.i = userId;
        this.j = userId2;
        UserId b = t11.b();
        this.k = b;
        boolean z10 = false;
        if (!newsComment.m && !newsComment.z && !epx.f(newsComment.j, b) && !epx.f(userId, b) && (!epx.f(userId2, b) || !epx.f(userId, b))) {
            if (z3) {
                UserId userId3 = newsComment.j;
                if (userId3.b != 101) {
                }
            }
            t6g0 t6g0Var = t6g0.b;
            if (!t6g0.b().g0(newsComment.j)) {
                z7 = false;
                this.l = z7;
                if (!epx.f(newsComment.j, b)) {
                    if (fkq0.b(newsComment.j)) {
                        t6g0 t6g0Var2 = t6g0.b;
                    }
                    z8 = false;
                    this.m = z8;
                    if (!newsComment.s && fkq0.d(b) && !epx.f(newsComment.j, b)) {
                        if (z3) {
                            UserId userId4 = newsComment.j;
                            if (userId4.b != 101) {
                            }
                        }
                        z9 = true;
                        this.n = z9;
                        this.o = i != 0 || i == 1 || i == 2 || i == 6;
                        if (!newsComment.s && z7 && z5 && z8 && newsComment.z1()) {
                            z10 = true;
                        }
                        this.p = z10;
                    }
                    z9 = false;
                    this.n = z9;
                    this.o = i != 0 || i == 1 || i == 2 || i == 6;
                    if (!newsComment.s) {
                        z10 = true;
                    }
                    this.p = z10;
                }
                z8 = true;
                this.m = z8;
                if (!newsComment.s) {
                    if (z3) {
                    }
                    z9 = true;
                    this.n = z9;
                    this.o = i != 0 || i == 1 || i == 2 || i == 6;
                    if (!newsComment.s) {
                    }
                    this.p = z10;
                }
                z9 = false;
                this.n = z9;
                this.o = i != 0 || i == 1 || i == 2 || i == 6;
                if (!newsComment.s) {
                }
                this.p = z10;
            }
        }
        z7 = true;
        this.l = z7;
        if (!epx.f(newsComment.j, b)) {
        }
        z8 = true;
        this.m = z8;
        if (!newsComment.s) {
        }
        z9 = false;
        this.n = z9;
        this.o = i != 0 || i == 1 || i == 2 || i == 6;
        if (!newsComment.s) {
        }
        this.p = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdg)) {
            return false;
        }
        qdg qdgVar = (qdg) obj;
        return epx.f(this.a, qdgVar.a) && this.b == qdgVar.b && this.c == qdgVar.c && this.d == qdgVar.d && this.e == qdgVar.e && this.f == qdgVar.f && this.g == qdgVar.g && this.h == qdgVar.h && epx.f(this.i, qdgVar.i) && epx.f(this.j, qdgVar.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j.b) + bh10.a(shy.a(this.h, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.a.i * 31, 31, this.b), 31, false), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, false), 31, true), 31, true), 31, true), 31, this.g), 31), 31, this.i.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentVideoActionsMenuParams(comment=");
        sb.append(this.a);
        sb.append(", canReply=");
        sb.append(this.b);
        sb.append(", isCanShowIcon=false, isEditor=");
        sb.append(this.c);
        sb.append(", isModerator=");
        sb.append(this.d);
        sb.append(", canShareComments=");
        sb.append(this.e);
        sb.append(", canShowEdit=");
        sb.append(this.f);
        sb.append(", canShowThreadDelete=false, isCanShowIsLiked=true, isCanShowLikesList=true, isShowEditFirst=true, isLiked=");
        sb.append(this.g);
        sb.append(", itemType=");
        sb.append(this.h);
        sb.append(", ownerId=");
        sb.append(this.i);
        sb.append(", userId=");
        return gp.b(sb, this.j, ')');
    }
}
