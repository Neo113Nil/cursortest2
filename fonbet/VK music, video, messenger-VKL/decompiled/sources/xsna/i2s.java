package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import xsna.bzr;
import xsna.j2s;
import xsna.l2s;
import xsna.m2s;
import xsna.p2s;
import xsna.s2s;

/* compiled from: FoldersShowFeature.kt */
/* loaded from: classes18.dex */
public final class i2s extends di6<t2s, p2s, s2s, m2s> {
    public final c1s h;
    public final y1s i;
    public final v0s j;
    public final l2s k;
    public final cau0 l;

    /* compiled from: FoldersShowFeature.kt */
    public static final class b implements xzr {
        public final int b;
        public final CharSequence c;
        public final FolderType d;

        public b(int i, String str, FolderType folderType) {
            this.b = i;
            this.c = str;
            this.d = folderType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 0;
        }

        @Override // xsna.xzr
        public final CharSequence getName() {
            return this.c;
        }

        @Override // xsna.xzr
        public final FolderType getType() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + u11.c(Integer.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            return "Recommendation(id=" + this.b + ", name=" + ((Object) this.c) + ", type=" + this.d + ')';
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            return (a7iVar instanceof b) && ((b) a7iVar).b == this.b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i2s(com.vk.folders.impl.model.a aVar, y1s y1sVar, io.reactivex.rxjava3.subjects.f fVar, v0s v0sVar, l2s l2sVar, cau0 cau0Var) {
        super(new t2s(r2, true, jgp.b, r2, false, r7, r7, false, 0));
        EmptyList emptyList = EmptyList.b;
        EmptySet emptySet = EmptySet.b;
        this.h = aVar;
        this.i = y1sVar;
        this.j = v0sVar;
        this.k = l2sVar;
        this.l = cau0Var;
        io.reactivex.rxjava3.core.w c = asu0.a.c();
        boolean z = l2sVar instanceof l2s.a;
        io.reactivex.rxjava3.core.q s0 = aVar.d.a0(c).s0(new v20(new omf(this, 15), 23)).s0(new yi2(new weg(z, this), 18));
        xf1 xf1Var = new xf1(this, 22);
        a.n nVar = io.reactivex.rxjava3.internal.functions.a.e;
        i(s0, nVar, xf1Var);
        i(fVar.a0(c), nVar, new pv2(this, 16));
        aVar.a();
        if (z) {
            a1w a1wVar = y1sVar.b;
            cau0 cau0Var2 = a1wVar.r().h;
            ListBuilder e = e43.e();
            e.add(FoldersSupportedType.CHANNELS);
            p4g.a(FoldersSupportedType.BUSINESS, e, cau0Var2.o());
            e.add(FoldersSupportedType.PERSONAL);
            p4g.a(FoldersSupportedType.MANAGED_GROUPS, e, BuildInfo.s());
            y1sVar.e.b(io.reactivex.rxjava3.kotlin.c.e(a1wVar.C(y1sVar, new kqm(e.g())).q(y1sVar.d), new tuq(3), new com.vk.channels.impl.channel_screen.send_msg.e(1, y1sVar, y1s.class, "updatePublicState", "updatePublicState(Ljava/util/List;)V", 0, 9)));
        }
    }

    public static List s(LinkedHashMap linkedHashMap, List list) {
        Object obj;
        if (linkedHashMap.isEmpty() && list.isEmpty()) {
            return Collections.singletonList(r0s.b);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(linkedHashMap.values());
        if (linkedHashMap.size() < 15) {
            arrayList.add(j2s.a.b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            xzr xzrVar = (xzr) obj2;
            Iterator it = linkedHashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((yyr) obj).getType() == xzrVar.getType()) {
                    break;
                }
            }
            if (obj == null) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new ygk0(8, 0));
            arrayList.add(new ozo0(R.string.vkim_folder_recommendation_title));
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static t2s u(t2s t2sVar) {
        return t2s.a(t2sVar, null, !t2sVar.f.isEmpty() || !t2sVar.g.isEmpty() || t2sVar.e || t2sVar.h, null, null, false, null, null, false, 0, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
    }

    @Override // xsna.di6
    public final void d(p2s p2sVar) {
        p2s p2sVar2 = p2sVar;
        int i = 8;
        if (p2sVar2.equals(p2s.a.b)) {
            r(new u6k(this, i));
            return;
        }
        boolean z = p2sVar2 instanceof p2s.d;
        v0s v0sVar = this.j;
        if (z) {
            yyr yyrVar = ((p2s.d) p2sVar2).b;
            l2s l2sVar = this.k;
            if (l2sVar instanceof l2s.b) {
                di6.a(this, v0sVar.p(yyrVar.getId(), null, Collections.singletonList(Long.valueOf(((l2s.b) l2sVar).a)), EmptyList.b));
                m(m2s.a.a);
                return;
            } else {
                if (!(l2sVar instanceof l2s.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m(new m2s.c(yyrVar));
                return;
            }
        }
        if (p2sVar2 instanceof p2s.e) {
            yyr yyrVar2 = ((p2s.e) p2sVar2).b;
            ListBuilder e = e43.e();
            e.add(new bzr.a(yyrVar2.getId()));
            s3q0 s3q0Var = s3q0.a;
            n(new s2s.b(yyrVar2, e.g()));
            return;
        }
        if (p2sVar2 instanceof p2s.f) {
            xzr xzrVar = ((p2s.f) p2sVar2).b;
            di6.a(this, v0sVar.D(xzrVar.getName().toString(), xzrVar.getType(), EmptyList.b));
            return;
        }
        if (p2sVar2 instanceof p2s.g) {
            q(new g86(i, p2sVar2, this));
            return;
        }
        if (p2sVar2.equals(p2s.h.b)) {
            m(m2s.a.a);
        } else if (p2sVar2 instanceof p2s.b) {
            n(new s2s.a(((p2s.b) p2sVar2).b));
        } else {
            if (!(p2sVar2 instanceof p2s.c)) {
                throw new NoWhenBranchMatchedException();
            }
            di6.a(this, v0sVar.F(((p2s.c) p2sVar2).b.getId()));
        }
    }

    /* compiled from: FoldersShowFeature.kt */
    public static final class a implements yyr {
        public final CharSequence b;
        public final int c;
        public final FolderType d;

        public a(int i, String str, FolderType folderType) {
            this.b = str;
            this.c = i;
            this.d = folderType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        @Override // xsna.yyr
        public final int getId() {
            return this.c;
        }

        @Override // xsna.yyr, xsna.hfz
        public final Integer getItemId() {
            return Integer.valueOf(this.c);
        }

        @Override // xsna.yyr
        public final CharSequence getName() {
            return this.b;
        }

        @Override // xsna.yyr
        public final FolderType getType() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Folder(name=" + ((Object) this.b) + ", id=" + this.c + ", type=" + this.d + ')';
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            return (a7iVar instanceof a) && ((a) a7iVar).c == this.c;
        }

        @Override // xsna.yyr, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.c);
        }
    }
}
