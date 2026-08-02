package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.vvf0;

/* compiled from: ShareDialogsGetCmd.kt */
/* loaded from: classes2.dex */
public final class i7j0 extends le6<a> {
    public final gkx0 b;
    public final int c;
    public final boolean d;
    public final Object e;
    public final List<Peer> f;
    public final Integer g;

    /* compiled from: ShareDialogsGetCmd.kt */
    public static final class a {
        public final ArrayList a;
        public final ProfilesInfo b;
        public final boolean c;

        public a(ArrayList arrayList, ProfilesInfo profilesInfo, boolean z) {
            this.a = arrayList;
            this.b = profilesInfo;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ur.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(dialogs=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", areDialogsFullyLoaded=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i7j0(gkx0 gkx0Var, int i, boolean z, Object obj, List<? extends Peer> list, Integer num) {
        this.b = gkx0Var;
        this.c = i;
        this.d = z;
        this.e = obj;
        this.f = list;
        this.g = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.collections.EmptyList] */
    public static a f(Pair pair, DialogExt dialogExt, ArrayList arrayList, brm brmVar, int i) {
        ?? r1;
        ProfilesInfo profilesInfo;
        ProfilesInfo profilesInfo2;
        Dialog Cb;
        Collection collection;
        ArrayList arrayList2 = new ArrayList();
        if (pair != null && (collection = (Collection) pair.i()) != null) {
            arrayList2.addAll(collection);
        }
        if (arrayList != null) {
            r1 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Dialog Cb2 = ((DialogExt) it.next()).Cb();
                if (Cb2 != null) {
                    r1.add(Cb2);
                }
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        arrayList2.addAll((Collection) r1);
        if (dialogExt != null && (Cb = dialogExt.Cb()) != null) {
            arrayList2.add(Cb);
        }
        arrayList2.addAll(brmVar.a.k());
        ProfilesInfo profilesInfo3 = new ProfilesInfo();
        if (pair != null && (profilesInfo2 = (ProfilesInfo) pair.j()) != null) {
            profilesInfo3.Kb(profilesInfo2);
        }
        profilesInfo3.Kb(brmVar.b);
        if (dialogExt != null && (profilesInfo = dialogExt.b) != null) {
            profilesInfo3.Kb(profilesInfo);
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                profilesInfo3.Kb(((DialogExt) it2.next()).b);
            }
        }
        return new a(arrayList2, profilesInfo3, brmVar.a.size() < i);
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Object failure;
        boolean f = epx.f(this.b, gkx0.e);
        ArrayList arrayList = null;
        int i = this.c;
        if (!f) {
            brm g = g(w2wVar, Source.CACHE);
            if (g.a.isEmpty() || g.a.size() < i) {
                g = g(w2wVar, Source.ACTUAL);
            }
            return f(null, null, null, g, i);
        }
        try {
            vvf0.a aVar = (vvf0.a) w2wVar.L0(this, new vvf0(this.g));
            failure = new Pair(aVar.a, aVar.b);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object pair = new Pair(EmptyList.b, new ProfilesInfo());
        if (failure instanceof Result.Failure) {
            failure = pair;
        }
        Pair pair2 = (Pair) failure;
        Source source = Source.CACHE;
        DialogExt h = h(w2wVar, source);
        if (h == null) {
            h = h(w2wVar, Source.ACTUAL);
        }
        List<Peer> list = this.f;
        if (list != null && ((arrayList = i(source, list, w2wVar)) == null || arrayList.size() < list.size())) {
            arrayList = i(Source.NETWORK, list, w2wVar);
        }
        int max = Math.max(((Collection) pair2.i()).size() + (h != null ? 1 : arrayList != null ? arrayList.size() : 0) + 1, i);
        brm g2 = g(w2wVar, source);
        if (g2.a.isEmpty() || g2.a.size() < max) {
            g2 = g(w2wVar, Source.ACTUAL);
        }
        return f(pair2, h, arrayList, g2, max);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7j0)) {
            return false;
        }
        i7j0 i7j0Var = (i7j0) obj;
        return epx.f(this.b, i7j0Var.b) && this.c == i7j0Var.c && this.d == i7j0Var.d && epx.f(this.e, i7j0Var.e) && epx.f(this.f, i7j0Var.f) && epx.f(this.g, i7j0Var.g);
    }

    public final brm g(w2w w2wVar, Source source) {
        return (brm) w2wVar.J0(this, new crm(new drm(this.b, DialogsFilter.MAIN, this.c, source, true, this.e, "ShareDialogsGetCmd since= " + this.b))).await();
    }

    public final DialogExt h(w2w w2wVar, Source source) {
        DialogExt a2 = ((ipm) k9q0.f(w2wVar, this, new uqm(new sqm(w2wVar.H0(), source, this.d, this.e, 16)))).a(w2wVar.H0().b);
        if (a2.Cb() != null) {
            return a2;
        }
        return null;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31, this.d);
        Object obj = this.e;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        List<Peer> list = this.f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.g;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final ArrayList i(Source source, List list, w2w w2wVar) {
        ipm ipmVar = (ipm) w2wVar.J0(this, new uqm(new sqm(list, source, this.d, this.e, 0, 16))).await();
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ipmVar.a(((Peer) it.next()).b));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((DialogExt) next).Cb() != null) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareDialogsGetCmd(since=");
        sb.append(this.b);
        sb.append(", limit=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        sb.append(this.e);
        sb.append(", firstToMentionPeers=");
        sb.append(this.f);
        sb.append(", attachType=");
        return uqi.b(sb, this.g, ')');
    }
}
