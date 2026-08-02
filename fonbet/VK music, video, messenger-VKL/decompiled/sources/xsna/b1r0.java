package xsna;

import android.util.ArraySet;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.UserNameType;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserStorageModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UsersGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class b1r0 extends le6<wpp<Long, User>> {
    public final Collection<Peer> b;
    public final Source c;
    public final boolean d;
    public final Object e;
    public final tni f;

    /* compiled from: UsersGetByIdCmd.kt */
    public static final class a {
        public final wpp<Long, User> a;
        public final wpp<Long, User> b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Result(users=" + this.a + ", changes=" + this.b + ')';
        }

        public a(wpp<Long, User> wppVar, wpp<Long, User> wppVar2) {
            this.a = wppVar;
            this.b = wppVar2;
        }

        public /* synthetic */ a(int i) {
            this(new wpp(), new wpp());
        }
    }

    /* compiled from: UsersGetByIdCmd.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b1r0() {
        throw null;
    }

    public b1r0(Peer peer, Source source, int i) {
        this(Collections.singletonList(peer), source, (i & 4) == 0, null);
    }

    @Override // xsna.le6
    public final wpp<Long, User> e(w2w w2wVar) {
        a f;
        Collection collection = this.b;
        if (collection.isEmpty()) {
            return new wpp<>();
        }
        int i = b.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i != 1) {
            boolean z = this.d;
            if (i == 2) {
                wpp<Long, User> wppVar = f(collection, w2wVar).a;
                Collection<Long> a2 = wppVar.a();
                ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
                Iterator<T> it = a2.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue));
                }
                a g = g(w2wVar, arrayList, z);
                wppVar.m(g.a);
                h(w2wVar, wppVar.c);
                f = new a(wppVar, g.b);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = g(w2wVar, collection, z);
            }
        } else {
            f = f(collection, w2wVar);
        }
        wpp<Long, User> wppVar2 = f.b;
        if (!wppVar2.i()) {
            w2wVar.S0().J(this.e, wppVar2);
        }
        return f.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1r0)) {
            return false;
        }
        b1r0 b1r0Var = (b1r0) obj;
        return epx.f(this.b, b1r0Var.b) && this.c == b1r0Var.c && this.d == b1r0Var.d && epx.f(this.e, b1r0Var.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
    
        if (r15.g == true) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a f(Collection collection, w2w w2wVar) {
        LinkedHashMap linkedHashMap;
        Iterator it;
        String str;
        hdj w = w2wVar.I0().w();
        x1r0 d = w2wVar.I0().d();
        long f1 = w2wVar.f1();
        long j = w2wVar.H0().d;
        boolean a2 = w2wVar.P0().a();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it2.next()).b));
        }
        LinkedHashMap k = w.k(arrayList);
        Map<Long, UserStorageModel> c = d.c(arrayList);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(c.size()));
        for (Iterator it3 = c.entrySet().iterator(); it3.hasNext(); it3 = it) {
            Map.Entry entry = (Map.Entry) it3.next();
            Object key = entry.getKey();
            UserStorageModel userStorageModel = (UserStorageModel) entry.getValue();
            Contact contact = (Contact) k.get(Long.valueOf(userStorageModel.b));
            OnlineInfo onlineInfo = userStorageModel.l;
            long j2 = userStorageModel.b;
            if (a2 || !(onlineInfo instanceof VisibleStatus)) {
                linkedHashMap = k;
                it = it3;
            } else {
                VisibleStatus visibleStatus = (VisibleStatus) onlineInfo;
                linkedHashMap = k;
                it = it3;
                onlineInfo = new VisibleStatus(visibleStatus.b, false, visibleStatus.d, visibleStatus.e);
            }
            if (j2 == j) {
                onlineInfo = new VisibleStatus(f1, true, 0, Platform.MOBILE);
            }
            OnlineInfo onlineInfo2 = onlineInfo;
            long j3 = f1 - w2wVar.getConfig().y;
            long j4 = f1 - w2wVar.getConfig().z;
            boolean z = userStorageModel.C < j3;
            if (j2 != j && a2) {
                z = z || userStorageModel.D < j4;
            }
            boolean z2 = z;
            boolean z3 = (userStorageModel.x == 3 || contact == null) ? false : true;
            UserNameType userNameType = (UserNameType) w2wVar.getConfig().U.invoke();
            this.f.getClass();
            User user = new User(userStorageModel.b, userStorageModel.c, null, null, userStorageModel.d, userStorageModel.e, userStorageModel.f, userStorageModel.g, userStorageModel.h, userStorageModel.i, userStorageModel.j, userStorageModel.k, userStorageModel.l, userStorageModel.m, userStorageModel.n, userStorageModel.o, userStorageModel.p, userStorageModel.q, userStorageModel.r, userStorageModel.s, userStorageModel.t, userStorageModel.u, userStorageModel.v, userStorageModel.w, userStorageModel.x, userStorageModel.y, userStorageModel.z, userStorageModel.A, userStorageModel.B, false, userStorageModel.E, userNameType, userStorageModel.F, userStorageModel.G, userStorageModel.H, userStorageModel.I, userStorageModel.J, userStorageModel.K, userStorageModel.L, userStorageModel.M, userStorageModel.P, userStorageModel.N, userStorageModel.O, userStorageModel.Q);
            Long valueOf = contact != null ? Long.valueOf(contact.b) : null;
            String str2 = contact != null ? contact.c : null;
            if (contact == null || (str = contact.d) == null) {
                str = userStorageModel.y;
            }
            linkedHashMap2.put(key, User.zb(user, valueOf, str2, Boolean.valueOf(z3), false, onlineInfo2, false, 0, str, z2, userNameType, 1577054193));
            k = linkedHashMap;
        }
        ArraySet arraySet = new ArraySet();
        ArraySet arraySet2 = new ArraySet();
        Iterator it4 = collection2.iterator();
        while (it4.hasNext()) {
            long j5 = ((Peer) it4.next()).b;
            User user2 = (User) linkedHashMap2.get(Long.valueOf(j5));
            if (user2 == null) {
                arraySet.add(Long.valueOf(j5));
            } else if (user2.E) {
                arraySet2.add(Long.valueOf(j5));
            }
        }
        wpp wppVar = new wpp(linkedHashMap2);
        wppVar.t(arraySet);
        wppVar.s(arraySet2);
        return new a(wppVar, new wpp());
    }

    public final a g(w2w w2wVar, Collection<? extends Peer> collection, boolean z) {
        if (collection.isEmpty()) {
            return new a(0);
        }
        Map<Long, User> map = (Map) bz2.c(new a1r0(collection, w2wVar.c(), z), "UsersGetByIdCmd.UsersGetByIdApiCmd");
        h(w2wVar, map);
        new i1r0(map, w2wVar.f1()).o(w2wVar);
        wpp<Long, User> wppVar = f(collection, w2wVar).a;
        return new a(wppVar, wppVar);
    }

    public final void h(w2w w2wVar, Map<Long, User> map) {
        Set<Map.Entry<Long, User>> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            User user = (User) ((Map.Entry) it.next()).getValue();
            if (user.c == null) {
                w2wVar.I0().w().a(user.b);
            }
            Long l = user.c;
            if (l != null) {
                arrayList.add(l);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (w2wVar.I0().w().c(((Number) next).longValue()) == null) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        w2wVar.L0(this, new abj(arrayList2, Source.NETWORK, this.d, null));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b2 = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        return b2 + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersGetByIdCmd(ids=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return k73.c(sb, this.e, ')');
    }

    public /* synthetic */ b1r0(Collection collection, Source source) {
        this(collection, source, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b1r0(Collection<? extends Peer> collection, Source source, boolean z, Object obj) {
        this.b = collection;
        this.c = source;
        this.d = z;
        this.e = obj;
        this.f = new tni(8);
        Collection<? extends Peer> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return;
        }
        for (Peer peer : collection2) {
            peer.getClass();
            if (!peer.Ab(Peer.Type.USER)) {
                throw new IllegalArgumentException(("Only users should be passed to command. Got " + this.b).toString());
            }
        }
    }
}
