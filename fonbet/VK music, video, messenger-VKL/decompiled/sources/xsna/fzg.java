package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityCreateReviewState.kt */
/* loaded from: classes18.dex */
public final class fzg implements km50 {
    public final int b;
    public final CreateCommunityReviewData c;
    public final UserId d;
    public final n7k e;
    public final String f;
    public final w9k g;
    public final Integer h;
    public final int i;
    public final List<UploadImageModel> j;
    public final Float k;
    public final Integer l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final CreateCommunityReviewData p;
    public final tlo0 q;
    public final tlo0 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public fzg() {
        this(null, null, null, null, null, 1048575);
    }

    public static fzg a(fzg fzgVar, n7k n7kVar, String str, w9k w9kVar, Integer num, int i, List list, boolean z, CreateCommunityReviewData createCommunityReviewData, tlo0 tlo0Var, tlo0 tlo0Var2, boolean z2, int i2) {
        int i3 = fzgVar.b;
        CreateCommunityReviewData createCommunityReviewData2 = fzgVar.c;
        UserId userId = fzgVar.d;
        n7k n7kVar2 = (i2 & 8) != 0 ? fzgVar.e : n7kVar;
        String str2 = (i2 & 16) != 0 ? fzgVar.f : str;
        w9k w9kVar2 = (i2 & 32) != 0 ? fzgVar.g : w9kVar;
        Integer num2 = (i2 & 64) != 0 ? fzgVar.h : num;
        int i4 = (i2 & 128) != 0 ? fzgVar.i : i;
        List list2 = (i2 & 256) != 0 ? fzgVar.j : list;
        Float f = fzgVar.k;
        n7k n7kVar3 = n7kVar2;
        String str3 = str2;
        w9k w9kVar3 = w9kVar2;
        Integer num3 = num2;
        int i5 = i4;
        List list3 = list2;
        Integer num4 = fzgVar.l;
        boolean z3 = (i2 & 2048) != 0 ? fzgVar.m : z;
        boolean z4 = (i2 & 4096) != 0 ? fzgVar.n : true;
        String str4 = fzgVar.o;
        CreateCommunityReviewData createCommunityReviewData3 = (i2 & 16384) != 0 ? fzgVar.p : createCommunityReviewData;
        tlo0 tlo0Var3 = (i2 & 32768) != 0 ? fzgVar.q : tlo0Var;
        tlo0 tlo0Var4 = (i2 & 65536) != 0 ? fzgVar.r : tlo0Var2;
        boolean z5 = (i2 & 131072) != 0 ? fzgVar.s : z2;
        boolean z6 = fzgVar.t;
        boolean z7 = fzgVar.u;
        fzgVar.getClass();
        return new fzg(i3, createCommunityReviewData2, userId, n7kVar3, str3, w9kVar3, num3, i5, list3, f, num4, z3, z4, str4, createCommunityReviewData3, tlo0Var3, tlo0Var4, z5, z6, z7);
    }

    public final boolean b() {
        if (this.n) {
            return false;
        }
        if (this.f.length() > 0 || this.i > 0) {
            return true;
        }
        List<UploadImageModel> list = this.j;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((UploadImageModel) it.next()).d() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        CreateCommunityReviewData createCommunityReviewData = this.p;
        return (createCommunityReviewData != null ? createCommunityReviewData.e : null) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzg)) {
            return false;
        }
        fzg fzgVar = (fzg) obj;
        return this.b == fzgVar.b && epx.f(this.c, fzgVar.c) && epx.f(this.d, fzgVar.d) && epx.f(this.e, fzgVar.e) && epx.f(this.f, fzgVar.f) && epx.f(this.g, fzgVar.g) && epx.f(this.h, fzgVar.h) && this.i == fzgVar.i && epx.f(this.j, fzgVar.j) && epx.f(this.k, fzgVar.k) && epx.f(this.l, fzgVar.l) && this.m == fzgVar.m && this.n == fzgVar.n && epx.f(this.o, fzgVar.o) && epx.f(this.p, fzgVar.p) && epx.f(this.q, fzgVar.q) && epx.f(this.r, fzgVar.r) && this.s == fzgVar.s && this.t == fzgVar.t && this.u == fzgVar.u;
    }

    public final boolean h() {
        Integer num;
        List<UploadImageModel> list;
        if (b() && c()) {
            List list2 = null;
            CreateCommunityReviewData createCommunityReviewData = this.p;
            String str = createCommunityReviewData != null ? createCommunityReviewData.c : null;
            if (str == null) {
                str = "";
            }
            if (!str.equals(this.f)) {
                return true;
            }
            if (createCommunityReviewData != null && (list = createCommunityReviewData.d) != null) {
                list2 = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Integer d = ((UploadImageModel) it.next()).d();
                    if (d != null) {
                        list2.add(d);
                    }
                }
            }
            if (list2 == null) {
                list2 = EmptyList.b;
            }
            List<UploadImageModel> list3 = this.j;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                Integer d2 = ((UploadImageModel) it2.next()).d();
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            if (!epx.f(list2, arrayList)) {
                return true;
            }
            if (createCommunityReviewData == null || (num = createCommunityReviewData.b) == null) {
                num = 0;
            }
            if (this.i != num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        CreateCommunityReviewData createCommunityReviewData = this.c;
        int a = bh10.a((hashCode + (createCommunityReviewData == null ? 0 : createCommunityReviewData.hashCode())) * 31, 31, this.d.b);
        n7k n7kVar = this.e;
        int a2 = urd0.a((a + (n7kVar == null ? 0 : n7kVar.hashCode())) * 31, 31, this.f);
        w9k w9kVar = this.g;
        int hashCode2 = (a2 + (w9kVar == null ? 0 : w9kVar.hashCode())) * 31;
        Integer num = this.h;
        int a3 = fw3.a(shy.a(this.i, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.j);
        Float f = this.k;
        int hashCode3 = (a3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.l;
        int b = qoy.b(qoy.b((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.m), 31, this.n);
        String str = this.o;
        int hashCode4 = (b + (str == null ? 0 : str.hashCode())) * 31;
        CreateCommunityReviewData createCommunityReviewData2 = this.p;
        int hashCode5 = (hashCode4 + (createCommunityReviewData2 == null ? 0 : createCommunityReviewData2.hashCode())) * 31;
        tlo0 tlo0Var = this.q;
        int hashCode6 = (hashCode5 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
        tlo0 tlo0Var2 = this.r;
        return Boolean.hashCode(this.u) + qoy.b(qoy.b((hashCode6 + (tlo0Var2 != null ? tlo0Var2.hashCode() : 0)) * 31, 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCreateReviewState(maxImageAttaches=");
        sb.append(this.b);
        sb.append(", argsPresetData=");
        sb.append(this.c);
        sb.append(", communityId=");
        sb.append(this.d);
        sb.append(", config=");
        sb.append(this.e);
        sb.append(", comment=");
        sb.append(this.f);
        sb.append(", commentHint=");
        sb.append(this.g);
        sb.append(", commentMaxLength=");
        sb.append(this.h);
        sb.append(", mark=");
        sb.append(this.i);
        sb.append(", reviewImages=");
        sb.append(this.j);
        sb.append(", communityRating=");
        sb.append(this.k);
        sb.append(", reviewsCount=");
        sb.append(this.l);
        sb.append(", isLoading=");
        sb.append(this.m);
        sb.append(", isReviewSent=");
        sb.append(this.n);
        sb.append(", utm=");
        sb.append(this.o);
        sb.append(", initialState=");
        sb.append(this.p);
        sb.append(", errorTitle=");
        sb.append(this.q);
        sb.append(", errorDescription=");
        sb.append(this.r);
        sb.append(", isScreenLoading=");
        sb.append(this.s);
        sb.append(", isBottomBarVisible=");
        sb.append(this.t);
        sb.append(", isFocused=");
        return defpackage.q0.a(sb, this.u, ')');
    }

    public fzg(int i, CreateCommunityReviewData createCommunityReviewData, UserId userId, n7k n7kVar, String str, w9k w9kVar, Integer num, int i2, List<UploadImageModel> list, Float f, Integer num2, boolean z, boolean z2, String str2, CreateCommunityReviewData createCommunityReviewData2, tlo0 tlo0Var, tlo0 tlo0Var2, boolean z3, boolean z4, boolean z5) {
        this.b = i;
        this.c = createCommunityReviewData;
        this.d = userId;
        this.e = n7kVar;
        this.f = str;
        this.g = w9kVar;
        this.h = num;
        this.i = i2;
        this.j = list;
        this.k = f;
        this.l = num2;
        this.m = z;
        this.n = z2;
        this.o = str2;
        this.p = createCommunityReviewData2;
        this.q = tlo0Var;
        this.r = tlo0Var2;
        this.s = z3;
        this.t = z4;
        this.u = z5;
    }

    public fzg(CreateCommunityReviewData createCommunityReviewData, UserId userId, Float f, Integer num, String str, int i) {
        this(5, (i & 2) != 0 ? null : createCommunityReviewData, (i & 4) != 0 ? UserId.d : userId, null, "", null, null, 0, EmptyList.b, (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : num, false, false, (i & 8192) != 0 ? null : str, null, null, null, false, true, true);
    }
}
