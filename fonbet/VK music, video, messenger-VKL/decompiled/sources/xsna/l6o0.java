package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.ih30;

/* compiled from: TaskLoadMoreViaCache.kt */
/* loaded from: classes2.dex */
public final class l6o0 extends zzp0<b> {
    public static final f9w h = e9w.a(l6o0.class);
    public final com.vk.im.ui.components.dialogs_list.c d;
    public final gkx0 e;
    public final int f = 30;
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: TaskLoadMoreViaCache.kt */
    public static final class a extends le6<b> {
        public final DialogsHistory b;
        public final ProfilesInfo c;
        public final gkx0 d;
        public final DialogsFilter e;
        public final int f;

        public a(DialogsHistory dialogsHistory, ProfilesInfo profilesInfo, gkx0 gkx0Var, DialogsFilter dialogsFilter, int i) {
            this.b = dialogsHistory;
            this.c = profilesInfo;
            this.d = gkx0Var;
            this.e = dialogsFilter;
            this.f = i;
        }

        @Override // xsna.le6
        public final b e(w2w w2wVar) {
            brm brmVar = (brm) w2wVar.J0(this, new crm(new drm(this.d, this.e, this.f, Source.CACHE, false, (Object) this, "LoadMoreViaCacheCmd " + this))).await();
            DialogsHistory a = t0w.a(this.b, brmVar.a, this.d);
            ArrayList r = brmVar.a.r();
            ProfilesInfo profilesInfo = brmVar.b;
            ProfilesInfo profilesInfo2 = this.c;
            profilesInfo2.Hb(profilesInfo);
            ih30.a aVar = ih30.a;
            LinkedHashMap a2 = ih30.a(a, profilesInfo2.Ob(), mq9.a(w2wVar));
            ArrayList arrayList = new ArrayList(c5g.u(r, 10));
            Iterator it = r.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList.add(Peer.a.b(longValue));
            }
            Map map = (Map) w2wVar.L0(this, new dfj(arrayList));
            ArrayList arrayList2 = new ArrayList(c5g.u(r, 10));
            Iterator it2 = r.iterator();
            while (it2.hasNext()) {
                long longValue2 = ((Number) it2.next()).longValue();
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                arrayList2.add(Peer.a.b(longValue2));
            }
            return new b(a, a2, profilesInfo2, map, (Map) w2wVar.L0(this, new cfj(arrayList2)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        @Override // xsna.le6, xsna.e1w
        public final int hashCode() {
            return Integer.hashCode(this.f) + ((this.e.hashCode() + bh10.a(ur.b(this.c, this.b.hashCode() * 31, 31), 31, this.d.b)) * 31);
        }

        @Override // xsna.e1w
        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadMoreViaCacheCmd(historyExists=");
            sb.append(this.b);
            sb.append(", members=");
            sb.append(this.c);
            sb.append(", sinceWeight=");
            sb.append(this.d);
            sb.append(", filter=");
            sb.append(this.e);
            sb.append(", limit=");
            return vu5.b(sb, this.f, ')');
        }
    }

    /* compiled from: TaskLoadMoreViaCache.kt */
    public static final class b {
        public final DialogsHistory a;
        public final LinkedHashMap b;
        public final ProfilesInfo c;
        public final Map<Long, Boolean> d;
        public final Map<Long, Boolean> e;

        public b(DialogsHistory dialogsHistory, LinkedHashMap linkedHashMap, ProfilesInfo profilesInfo, Map map, Map map2) {
            this.a = dialogsHistory;
            this.b = linkedHashMap;
            this.c = profilesInfo;
            this.d = map;
            this.e = map2;
        }
    }

    public l6o0(com.vk.im.ui.components.dialogs_list.c cVar, gkx0 gkx0Var) {
        this.d = cVar;
        this.e = gkx0Var;
    }

    @Override // xsna.zzp0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.zzp0
    public final void c(Throwable th) {
        h.a(th);
        if (this.d.f() != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.zzp0
    public final void d() {
        com.vk.im.ui.components.dialogs_list.c cVar = this.d;
        a1w a1wVar = cVar.d;
        DialogsFilter dialogsFilter = cVar.i;
        com.vk.im.ui.components.dialogs_list.e eVar = cVar.h;
        this.g = a1wVar.C(this, new a(new DialogsHistory(eVar.g), eVar.h, this.e, dialogsFilter, this.f)).q(asu0.a.c()).subscribe(new qca0(this, 7));
    }

    @Override // xsna.zzp0
    public final void e(b bVar) {
        b bVar2 = bVar;
        com.vk.im.ui.components.dialogs_list.c cVar = this.d;
        com.vk.im.ui.components.dialogs_list.e eVar = cVar.h;
        vtm f = cVar.f();
        eVar.g.v(bVar2.a);
        eVar.h.Hb(bVar2.c);
        eVar.i.putAll(bVar2.b);
        eVar.j.putAll(bVar2.d);
        eVar.k.putAll(bVar2.e);
        eVar.A = false;
        if (f != null) {
            cVar.B(this);
        }
        cVar.r(this);
    }

    public final String toString() {
        return "TaskLoadMoreViaCache{mSinceWeight=" + this.e + ", mLimit=" + this.f + "} " + super.toString();
    }
}
