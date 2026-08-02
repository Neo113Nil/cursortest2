package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.storage.delegates.dialogs.DialogWeightDb;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: DialogFolderStorageImpl.kt */
/* loaded from: classes2.dex */
public final class pdm implements mtx0 {
    public static final long l;
    public static final /* synthetic */ int m = 0;
    public final tgl0 b;
    public final hpm c;
    public final DialogWeightDb d;
    public final bpn0 e = new bpn0(new k6k(this, 1));
    public final bpn0 f = new bpn0(new odm(this, 0));
    public final bpn0 g = new bpn0(new akh(this, 8));
    public final bpn0 h = new bpn0(new xyh(this, 4));
    public final bpn0 i = new bpn0(new enh(this, 7));
    public final bpn0 j = new bpn0(new t2l(this, 2));
    public final dhl0<spm, Integer> k;

    /* compiled from: DialogFolderStorageImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogsCounters.Type.values().length];
            try {
                iArr[DialogsCounters.Type.UNREAD_UNMUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsCounters.Type.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        zno.a aVar = zno.c;
        l = zno.e(eoo.e(1, DurationUnit.DAYS));
    }

    public pdm(tgl0 tgl0Var, hpm hpmVar, DialogWeightDb dialogWeightDb, upj upjVar) {
        this.b = tgl0Var;
        this.c = hpmVar;
        this.d = dialogWeightDb;
        int i = 0;
        int i2 = 1;
        this.k = new dhl0<>(15, tgl0Var.c(spm.class), new dh5(18), new lpd(i2, this, pdm.class, "getCountFromDb", "getCountFromDb(Ljava/util/Collection;)Ljava/util/Map;", i, 4), new y89(i2, this, pdm.class, "putCountToDb", "putCountToDb(Ljava/util/Collection;)V", i, 5), tgl0Var.I0());
    }

    public static int m(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((FoldersSupportedType) it.next()).h().hashCode() * 31;
        }
        return i;
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.k.c();
    }

    public final void a(int i) {
        this.b.b().h(new lj1(this, i));
    }

    public final List<rdm> b() {
        return j5g.O0(i().a());
    }

    public final LinkedHashSet c(int i) {
        return izi0.j(j5g.S0(d().a(i)), j5g.S0(g().b(l().b(i))));
    }

    public final xlm d() {
        return (xlm) this.e.getValue();
    }

    public final rdm e(int i) {
        return i().b(i);
    }

    public final Integer f() {
        return this.b.I0().k().e("folders_counters_phase");
    }

    public final ylm g() {
        return (ylm) this.g.getValue();
    }

    public final ArrayList h(int i) {
        return d().a(i);
    }

    public final ldm i() {
        return (ldm) this.i.getValue();
    }

    public final Integer j() {
        return this.b.I0().k().e("folders_phase");
    }

    public final dum0 k() {
        return (dum0) this.h.getValue();
    }

    public final f0s l() {
        return (f0s) this.f.getValue();
    }

    public final void n(int i, Collection<? extends Peer> collection) {
        if (collection.isEmpty()) {
            return;
        }
        this.b.b().h(new mdm(this, i, collection, 0));
    }

    public final void o(int i, Collection<Long> collection) {
        if (i != -1) {
            hpm hpmVar = this.c;
            Collection<com.vk.im.engine.models.dialogs.b> values = hpmVar.J(-1, collection).values();
            ArrayList arrayList = new ArrayList(c5g.u(values, 10));
            for (com.vk.im.engine.models.dialogs.b bVar : values) {
                vjm vjmVar = bVar.e;
                vjm e = vjmVar != null ? vjm.e(vjmVar, 0, 0, 2) : null;
                vjm e2 = vjm.e(bVar.d, 0, 0, 2);
                Pair<Integer, Integer> pair = lmm.a;
                arrayList.add(com.vk.im.engine.models.dialogs.b.a(bVar, e2, e, lmm.a(bVar.f), 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -29, 2097151));
            }
            hpmVar.Y(i, arrayList);
        }
    }

    public final void p(int i, Collection<? extends Peer> collection) {
        Collection<? extends Peer> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it.next()).b));
        }
        o(i, arrayList);
    }

    public final void q(ArrayList arrayList) {
        this.b.I0().k().i("folders_order", arrayList);
    }

    public final void r(int i) {
        this.b.I0().k().putInt("folders_phase", i);
    }
}
