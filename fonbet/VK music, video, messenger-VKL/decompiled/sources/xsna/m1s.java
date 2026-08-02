package xsna;

import android.content.Context;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.n1s;
import xsna.p1s;
import xsna.u1s;
import xsna.wzr;
import xsna.xyr;

/* compiled from: FoldersPagerFeature.kt */
/* loaded from: classes18.dex */
public final class m1s extends di6<v1s, p1s, u1s, n1s> {
    public static final String m = i5s.a(new StringBuilder("https://"), a0a.d, "/im/channels/");
    public final v0s h;
    public final c1s i;
    public final p0s j;
    public final b1s k;
    public FolderType l;

    /* compiled from: FoldersPagerFeature.kt */
    public static final class a implements xyr {
        public final int a;
        public final String b;
        public final FolderType c;
        public final xyr.a d;

        public a(int i, String str, FolderType folderType, xyr.a aVar) {
            this.a = i;
            this.b = str;
            this.c = folderType;
            this.d = aVar;
        }

        @Override // xsna.xyr
        public final xyr.a a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        @Override // xsna.xyr
        public final int getId() {
            return this.a;
        }

        @Override // xsna.xyr
        public final String getName() {
            return this.b;
        }

        @Override // xsna.xyr
        public final FolderType getType() {
            return this.c;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "Folder(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ", countersInfo=" + this.d + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m1s(Context context, v0s v0sVar, c1s c1sVar, p0s p0sVar, cau0 cau0Var, b1s b1sVar, k0s k0sVar, FolderType folderType) {
        super(new v1s(r5, r6, j5g.u0(j5g.O0(r5.values()), r13), (xyr) j5g.X(r6.values()), r5, false, false));
        List singletonList = Collections.singletonList(new a(-1, context.getString(R.string.vkim_folders_predefined_folder_all_title), FolderType.DEFAULT, new xyr.a(0, false, false)));
        int e = on00.e(c5g.u(singletonList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : singletonList) {
            linkedHashMap.put(Integer.valueOf(((xyr) obj).getId()), obj);
        }
        List O0 = j5g.O0(linkedHashMap.values());
        jgp jgpVar = jgp.b;
        this.h = v0sVar;
        this.i = c1sVar;
        this.j = p0sVar;
        this.k = b1sVar;
        this.l = folderType;
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.core.w c = asu0Var.c();
        k0sVar.a(c1sVar);
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = c1sVar.f().a0(c);
        pm1 pm1Var = new pm1(this, 22);
        a.n nVar = io.reactivex.rxjava3.internal.functions.a.e;
        i(a0, nVar, pm1Var);
        i(p0sVar.h.a0(c), nVar, new defpackage.i0(this, 22));
        i(b1sVar.c.a0(c), nVar, new p41(this, 23));
        c1sVar.a();
        p0sVar.a();
        di6.k(this, new io.reactivex.rxjava3.internal.operators.completable.o(new com.vk.im.ui.fragments.chat.b()).q(asu0Var.c()), null, null, 3);
    }

    public static xyr.a s(spm spmVar) {
        if (spmVar == null) {
            return new xyr.a(0, false, false);
        }
        int i = spmVar.b;
        if (i > 0) {
            return new xyr.a(i, true, false);
        }
        int i2 = spmVar.c;
        return i2 > 0 ? new xyr.a(i2, true, true) : new xyr.a(0, false, false);
    }

    public static boolean u(xyr xyrVar) {
        return xyrVar.a().b && xyrVar.a().a > 0;
    }

    @Override // xsna.di6
    public final void d(p1s p1sVar) {
        p1s p1sVar2 = p1sVar;
        if (p1sVar2 instanceof p1s.f) {
            xyr xyrVar = ((p1s.f) p1sVar2).b;
            q(new lrk(xyrVar, 13));
            this.k.d(new ob80(xyrVar.getType()));
            return;
        }
        if (p1sVar2 instanceof p1s.c) {
            r(new s53(17, this, p1sVar2));
            return;
        }
        boolean z = p1sVar2 instanceof p1s.b;
        v0s v0sVar = this.h;
        if (z) {
            di6.a(this, v0sVar.F(((p1s.b) p1sVar2).b.getId()));
            return;
        }
        if (!(p1sVar2 instanceof p1s.d)) {
            if (p1sVar2.equals(p1s.e.b)) {
                r(new dhh(this, 13));
                return;
            }
            if (p1sVar2 instanceof p1s.h) {
                p1s.h hVar = (p1s.h) p1sVar2;
                di6.a(this, v0sVar.p(hVar.b, null, EmptyList.b, Collections.singletonList(Long.valueOf(hVar.c))));
                return;
            } else if (p1sVar2 instanceof p1s.a) {
                q(new z8f(p1sVar2, 13));
                return;
            } else {
                if (!(p1sVar2 instanceof p1s.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                r(new f1j(this, p1sVar2));
                return;
            }
        }
        p1s.d dVar = (p1s.d) p1sVar2;
        wzr wzrVar = dVar.c;
        xyr xyrVar2 = dVar.b;
        if (wzrVar instanceof wzr.a) {
            return;
        }
        if (wzrVar instanceof wzr.b) {
            r(new mh4(14, this, wzrVar));
            return;
        }
        if (epx.f(wzrVar, wzr.c.a)) {
            m(n1s.b.a);
            return;
        }
        if (wzrVar instanceof wzr.f) {
            n(new u1s.g(xyrVar2));
        } else if (wzrVar instanceof wzr.e) {
            n(new u1s.e(xyrVar2));
        } else {
            if (!(wzrVar instanceof wzr.d)) {
                throw new NoWhenBranchMatchedException();
            }
            n(new u1s.a(m));
        }
    }
}
