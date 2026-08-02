package xsna;

import android.content.Context;
import android.content.Intent;
import android.util.LruCache;
import com.ironsource.C4217a2;
import com.vk.api.generated.store.dto.StoreUpdateStickerProductsStateKeyDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersPromoModel;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.dto.stickers.images.FormatType;
import com.vk.dto.stickers.images.ImageConfig;
import com.vk.dto.stickers.images.ImageFormat;
import com.vk.dto.stickers.images.ImageSize;
import com.vk.dto.stickers.images.ImageTheme;
import com.vk.dto.stickers.images.ImagesConfigsSet;
import com.vk.dto.stickers.images.ThemeType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kbl0;

/* compiled from: StickersRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class ncl0 implements kcl0 {
    public final Object a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final AtomicBoolean c;
    public final etj d;
    public final ere0 e;
    public final p9l0 f;
    public final m9l0 g;
    public final adl0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final s6n0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final u5f o;
    public final epo p;
    public final lcl0 q;
    public final bpn0 r;
    public final hwp0 s;
    public final LruCache<String, StickerRender> t;
    public final kbl0 u;
    public final kbl0 v;

    /* compiled from: StickersRepositoryImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((ncl0) this.receiver).d1();
            return s3q0.a;
        }
    }

    /* compiled from: StickersRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((ncl0) this.receiver).a1(false);
            return s3q0.a;
        }
    }

    /* compiled from: StickersRepositoryImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((StickerStockItem) t).z), Integer.valueOf(((StickerStockItem) t2).z));
        }
    }

    public ncl0(Lazy<? extends vre0> lazy) {
        Object obj = new Object();
        this.a = obj;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.b = bVar;
        this.c = new AtomicBoolean(false);
        etj etjVar = new etj();
        this.d = etjVar;
        this.e = new ere0(lazy);
        p9l0 p9l0Var = new p9l0(obj);
        this.f = p9l0Var;
        m9l0 m9l0Var = new m9l0(bVar);
        this.g = m9l0Var;
        this.h = new adl0(m9l0Var);
        int i = 5;
        this.i = new bpn0(new buc0(i));
        int i2 = 1;
        this.j = new bpn0(new nyk0(i2));
        this.k = new s6n0(p9l0Var);
        this.l = new bpn0(new jcf0(this, i));
        int i3 = 6;
        this.m = new bpn0(new yo80(i3));
        this.n = new bpn0(new zo80(i3));
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        this.o = new u5f(p9l0Var, m9l0Var, obj, bVar, kbl0.a.b());
        this.p = new epo(p9l0Var, m9l0Var);
        this.q = new lcl0(this);
        this.r = new bpn0(new ye80(this, 19));
        this.s = new hwp0(etjVar);
        this.t = new LruCache<>(80);
        bVar.b(kbl0.c.subscribe(new wmz(new kb40(this, 28), 23)));
        bVar.b(kbl0.d.subscribe(new kjs(new mi10(this, 27), 21)));
        bVar.b(p9l0Var.m.subscribe(new h8l0(new rj60(this, 25), i2)));
        io.reactivex.rxjava3.subjects.f<Boolean> fVar = kbl0.e;
        fVar.getClass();
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(fVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new xk30(new q8i0(this, 8), 22)));
        this.u = kbl0.a.b();
        this.v = kbl0.a.b();
    }

    @Override // xsna.kcl0
    public final void A() {
        a1(true);
    }

    @Override // xsna.kcl0
    public final boolean A0() {
        return o25.a().i().L;
    }

    @Override // xsna.kcl0
    public final r6e0 B() {
        return (r6e0) this.m.getValue();
    }

    @Override // xsna.kcl0
    public final io.reactivex.rxjava3.internal.operators.single.f0 B0() {
        m9l0 m9l0Var = this.g;
        m9l0Var.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.v(new obc(m9l0Var, 1)).q(asu0.a.c());
    }

    @Override // xsna.kcl0
    public final p5n0 D0() {
        return new p5n0();
    }

    @Override // xsna.kcl0
    public final void E(int i) {
        Preference.F(i, this.v.a, "stickers_num_global_promotions");
        kbl0.d.onNext(Integer.valueOf(i));
    }

    @Override // xsna.kcl0
    public final StickerItem E0(int i, int i2) {
        Object obj;
        ncl0 ncl0Var = this.q.a;
        Object obj2 = null;
        if (i2 == 0) {
            Iterator<T> it = ncl0Var.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i == ((StickerItem) next).b) {
                    obj2 = next;
                    break;
                }
            }
            return (StickerItem) obj2;
        }
        Iterator it2 = ncl0Var.f.f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((StickerStockItem) obj).b == i2) {
                break;
            }
        }
        StickerStockItem stickerStockItem = (StickerStockItem) obj;
        if (stickerStockItem != null) {
            return stickerStockItem.Db(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b A[SYNTHETIC] */
    @Override // xsna.kcl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList F() {
        Integer num;
        StickerStockItem I;
        lcl0 lcl0Var = this.q;
        ncl0 ncl0Var = lcl0Var.a;
        CopyOnWriteArrayList<StickerStockItem> copyOnWriteArrayList = ncl0Var.f.f;
        ArrayList arrayList = new ArrayList();
        for (StickerStockItem stickerStockItem : copyOnWriteArrayList) {
            if (stickerStockItem.b != 10102) {
                if (!stickerStockItem.Ib()) {
                    if (lcl0Var.a(stickerStockItem) != null) {
                        if (!stickerStockItem.Hb() && (num = stickerStockItem.L) != null && (I = ncl0Var.I(num.intValue())) != null) {
                            stickerStockItem = I;
                        }
                    }
                }
                if (stickerStockItem == null) {
                    arrayList.add(stickerStockItem);
                }
            }
            stickerStockItem = null;
            if (stickerStockItem == null) {
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(Integer.valueOf(((StickerStockItem) next).b))) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // xsna.kcl0
    public final boolean F0(StickerStockItem stickerStockItem) {
        return this.q.c(stickerStockItem);
    }

    @Override // xsna.kcl0
    public final io.reactivex.rxjava3.core.q<List<StickerItem>> G() {
        return this.h.c.c.a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.kcl0
    public final StickerStockItem H(int i) {
        StickerStockItem I;
        p9l0 p9l0Var = this.f;
        Integer num = (Integer) ((m900) p9l0Var.i.a).get(Integer.valueOf(i));
        if (num != null && (I = I(num.intValue())) != null) {
            return I;
        }
        Iterator it = zik0.g(p9l0Var.h).iterator();
        while (it.hasNext()) {
            StickerStockItem stickerStockItem = (StickerStockItem) it.next();
            if (stickerStockItem.Eb().contains(Integer.valueOf(i))) {
                p9l0Var.i.put(Integer.valueOf(i), Integer.valueOf(stickerStockItem.b));
                return stickerStockItem;
            }
        }
        return null;
    }

    @Override // xsna.kcl0
    public final void H0(int i, d4r d4rVar) {
        ncl0 ncl0Var = this.q.a;
        StickerStockItem I = ncl0Var.I(i);
        if (I != null) {
            ncl0Var.s(I, d4rVar);
        }
    }

    @Override // xsna.kcl0
    public final StickerStockItem I(int i) {
        return this.f.h.get(i);
    }

    @Override // xsna.kcl0
    public final myb0 I0() {
        return (myb0) this.j.getValue();
    }

    @Override // xsna.kcl0
    public final LruCache<String, StickerRender> J() {
        return this.t;
    }

    @Override // xsna.kcl0
    public final void K() {
        n2i0.a(this.d.b, hf8.a, new Intent("com.vkontakte.android.STICKERS_STYLE_UPDATED"));
    }

    @Override // xsna.kcl0
    public final boolean K0() {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        return Preference.d(kbl0.a.b().a, "animation_enabled", false) && A0();
    }

    @Override // xsna.kcl0
    public final VmojiPromoInSuggestsRepositoryImpl M0() {
        return (VmojiPromoInSuggestsRepositoryImpl) this.i.getValue();
    }

    @Override // xsna.kcl0
    public final int N() {
        ncl0 ncl0Var = this.q.a;
        return ncl0Var.c1() > 0 ? ncl0Var.c1() : ncl0Var.O0();
    }

    @Override // xsna.kcl0
    public final xi30 O() {
        return (xi30) this.n.getValue();
    }

    @Override // xsna.kcl0
    public final int O0() {
        return (int) Preference.m(0L, this.v.a, "stickers_num_global_promotions");
    }

    @Override // xsna.kcl0
    public final void P0() {
        this.b.b(new io.reactivex.rxjava3.internal.operators.maybe.m(new io.reactivex.rxjava3.internal.operators.maybe.l(new io.reactivex.rxjava3.internal.operators.single.v(new jm20(this, 2)).q(io.reactivex.rxjava3.schedulers.a.b()), new yzt(new oi40(18), 14)), new pi40(new viu(21), 10)).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oa4(this, 5), new d1e(new mcl0(0), 1)));
    }

    @Override // xsna.kcl0
    public final void Q() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"StickersRepositoryImpl softClear for " + o25.a().c()});
        }
        synchronized (this.a) {
            this.f.e();
            HashMap<UserId, kbl0> hashMap = kbl0.b;
            kbl0.a.b().a();
            m9l0 m9l0Var = this.g;
            m9l0Var.getClass();
            m9l0Var.a(new iri0(m9l0Var, 3));
            s3q0 s3q0Var = s3q0.a;
        }
        a1(true);
    }

    @Override // xsna.kcl0
    public final StickerStockItem Q0(StickerStockItem stickerStockItem) {
        return this.q.a(stickerStockItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b A[SYNTHETIC] */
    @Override // xsna.kcl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList R() {
        Integer num;
        StickerStockItem I;
        lcl0 lcl0Var = this.q;
        ncl0 ncl0Var = lcl0Var.a;
        ArrayList<StickerStockItem> arrayList = ncl0Var.f.g;
        ArrayList arrayList2 = new ArrayList();
        for (StickerStockItem stickerStockItem : arrayList) {
            if (stickerStockItem.b != 10102) {
                if (!stickerStockItem.Ib()) {
                    if (lcl0Var.a(stickerStockItem) == null) {
                        if (!stickerStockItem.Hb() && (num = stickerStockItem.L) != null && (I = ncl0Var.I(num.intValue())) != null) {
                            stickerStockItem = I;
                        }
                    }
                }
                if (stickerStockItem == null) {
                    arrayList2.add(stickerStockItem);
                }
            }
            stickerStockItem = null;
            if (stickerStockItem == null) {
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(Integer.valueOf(((StickerStockItem) next).b))) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }

    @Override // xsna.kcl0
    public final void R0(boolean z) {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        Preference.I(kbl0.a.b().a, "last_tab_emoji", z);
    }

    @Override // xsna.kcl0
    public final boolean T0(StickerStockItem stickerStockItem) {
        lcl0 lcl0Var = this.q;
        if (lcl0Var.a.j(stickerStockItem)) {
            return lcl0Var.b(stickerStockItem);
        }
        return true;
    }

    @Override // xsna.kcl0
    public final ArrayList U() {
        return this.f.d;
    }

    @Override // xsna.kcl0
    public final void U0() {
        this.s.f.clear();
        ere0 ere0Var = this.e;
        r8a0 r8a0Var = new r8a0(this, 26);
        synchronized (ere0Var) {
            ere0Var.a(new maw0(o25.a().c()), "vmoji_renders_queue", r8a0Var);
            s3q0 s3q0Var = s3q0.a;
        }
        ere0 ere0Var2 = this.e;
        ut30 ut30Var = new ut30(this, 20);
        synchronized (ere0Var2) {
            ere0Var2.a(new xbl0(o25.a().c()), "stickers_queue", ut30Var);
        }
    }

    @Override // xsna.kcl0
    public final void V(boolean z) {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        Preference.I(kbl0.a.b().a, "vmoji_promo_enabled", z);
    }

    @Override // xsna.kcl0
    public final StickerStockItem V0(StickerStockItem stickerStockItem, boolean z, wzs<? super StickerStockItem, ? super StickerStockItem, s3q0> wzsVar) {
        StickerStockItem zb;
        StickerStockItem stickerStockItem2;
        StickerStockItem Ab;
        int i = 0;
        Object obj = null;
        if (stickerStockItem.Q) {
            synchronized (this.a) {
                try {
                    stickerStockItem2 = StickerStockItem.Ab(stickerStockItem, z, 0, null, null, -513, 8191);
                    Iterator it = this.f.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((StickerStockItem) next).b == stickerStockItem.b) {
                            obj = next;
                            break;
                        }
                    }
                    StickerStockItem stickerStockItem3 = (StickerStockItem) obj;
                    if (stickerStockItem3 != null) {
                        this.f.d.remove(stickerStockItem3);
                    }
                    this.f.d.add(stickerStockItem2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            StickerStockItem a2 = this.q.a(stickerStockItem);
            if (!z || a2 == null) {
                synchronized (this.a) {
                    if (z) {
                        try {
                            int size = this.f.f.size();
                            ArrayList arrayList = this.f.d;
                            if (arrayList == null || !arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (((StickerStockItem) it2.next()).k && (i = i + 1) < 0) {
                                        e43.s();
                                        throw null;
                                    }
                                }
                            }
                            i += size;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    zb = stickerStockItem.zb(i, z);
                    if (z) {
                        this.f.c(zb, Integer.valueOf(i));
                        this.f.g.remove(stickerStockItem);
                    } else {
                        int indexOf = this.f.f.indexOf(stickerStockItem);
                        this.f.d(zb, 0);
                        if (indexOf >= 0) {
                            this.f.f.remove(stickerStockItem);
                            g1(indexOf, this.f.f.size() - 1);
                        }
                    }
                    this.f.h.put(zb.b, zb);
                    this.o.a();
                }
                stickerStockItem2 = zb;
            } else {
                synchronized (this.a) {
                    Ab = StickerStockItem.Ab(stickerStockItem, true, a2.z, null, null, -16777729, 8189);
                    StickerStockItem Ab2 = StickerStockItem.Ab(a2, false, 0, null, null, -16777729, 8189);
                    this.f.d(Ab2, 0);
                    this.f.f.remove(a2);
                    p9l0 p9l0Var = this.f;
                    int size2 = a2.z - p9l0Var.d.size();
                    if (size2 >= 0) {
                        i = size2;
                    }
                    p9l0Var.c(Ab, Integer.valueOf(i));
                    this.f.g.remove(stickerStockItem);
                    this.f.h.put(Ab2.b, Ab2);
                    this.f.h.put(Ab.b, Ab);
                    this.o.a();
                    HashMap<UserId, kbl0> hashMap = kbl0.b;
                    Preference.H(kbl0.a.b().a, "stickers_hash_last", C4217a2.f);
                }
                wzsVar.invoke(a2, Ab);
                stickerStockItem2 = Ab;
            }
        }
        this.d.c(stickerStockItem2);
        return stickerStockItem2;
    }

    @Override // xsna.kcl0
    public final boolean W() {
        return !this.f.j.isEmpty();
    }

    @Override // xsna.kcl0
    public final boolean W0(int i) {
        Object obj;
        Iterator<T> it = this.q.a.c0().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((StickerItem) obj).b == i) {
                break;
            }
        }
        return obj != null;
    }

    @Override // xsna.kcl0
    public final bcl0 X0() {
        return (bcl0) this.l.getValue();
    }

    @Override // xsna.kcl0
    public final void Y(long j) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder b2 = fp.b(j, "StickersRepositoryImpl onLogout(", ") for ");
            b2.append(o25.a().c());
            L.u(l, logType, new Object[]{b2.toString()});
        }
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        StickersDatabase.a.a(new UserId(j));
        HashMap<UserId, kbl0> hashMap2 = kbl0.b;
        kbl0.a.a(new UserId(j));
    }

    @Override // xsna.kcl0
    public final boolean Y0() {
        if (((AtomicBoolean) this.o.f).get() || this.f.f()) {
            return false;
        }
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        return !Preference.s(kbl0.a.b().a, "stickers_hash_last", C4217a2.f).equals(C4217a2.f);
    }

    @Override // xsna.kcl0
    public final void Z(StickerStockItem stickerStockItem) {
        if (stickerStockItem.b == 10101) {
            return;
        }
        if (stickerStockItem.Ib() || stickerStockItem.Hb()) {
            synchronized (this.a) {
                try {
                    if (stickerStockItem.k) {
                        this.f.c(stickerStockItem, 0);
                    }
                    this.f.h.put(stickerStockItem.b, stickerStockItem);
                    this.f.e.remove(stickerStockItem);
                    r6e0 r6e0Var = (r6e0) this.m.getValue();
                    r6e0Var.getClass();
                    asu0.a.getClass();
                    asu0.n().execute(new cc3(5, stickerStockItem, r6e0Var));
                    g1(0, this.f.f.size() - 1);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.o.a();
            this.d.c(stickerStockItem);
            a1(true);
        }
        this.f.j.add(stickerStockItem);
    }

    @Override // xsna.kcl0
    public final void Z0() {
        if (O0() > 0) {
            List singletonList = Collections.singletonList("global_promotion");
            tfx tfxVar = new tfx("store.markAsViewed", new bzk0(1), new ly80(4));
            tfx.o(tfxVar, "type", "stickers", 0, 0, 12);
            if (singletonList != null) {
                tfxVar.i("reset", singletonList);
            }
            this.b.b(rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new h4f0(new gqe0(this, 7), 3), new zng(new j6e0(11), 2)));
        }
    }

    @Override // xsna.kcl0
    public final void a0(StickerItem stickerItem) {
        StickerStockItem H = H(stickerItem.b);
        if (H == null || !H.h) {
            return;
        }
        s9f0 s9f0Var = this.h.c;
        s9f0Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(s9f0Var.d);
        arrayList.remove(stickerItem);
        arrayList.add(0, stickerItem);
        while (arrayList.size() > s9f0Var.e) {
            arrayList.remove(e43.h(arrayList));
        }
        s9f0Var.c.onNext(arrayList);
        m9l0 m9l0Var = s9f0Var.a;
        m9l0Var.a(new avj0(arrayList, m9l0Var));
    }

    public final void a1(boolean z) {
        ((qov) this.r.getValue()).f(z, new a(0, this, ncl0.class, "initCache", "initCache()V", 0));
    }

    public final void b1(UserId userId) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"StickersRepositoryImpl clearMemoryCache(" + userId + ") for " + o25.a().c()});
        }
        ere0 ere0Var = this.e;
        synchronized (ere0Var) {
            HashMap<String, sq9> hashMap = ere0Var.b;
            for (Map.Entry<String, sq9> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                entry.getValue().cancel();
                ((vre0) ere0Var.a.getValue()).f(key);
            }
            hashMap.clear();
            s3q0 s3q0Var = s3q0.a;
        }
        r3y.c("vmoji_character_recereate");
        r3y.c("vmojiPromoTabViewed");
        this.b.e();
        ((qov) this.r.getValue()).a(userId);
        HashMap<UserId, StickersDatabase> hashMap2 = StickersDatabase.m;
        StickersDatabase.a.a(UserId.d);
        this.c.set(false);
        synchronized (this.a) {
            adl0 adl0Var = this.h;
            io.reactivex.rxjava3.subjects.f<List<StickerItem>> fVar = adl0Var.b.c;
            EmptyList emptyList = EmptyList.b;
            fVar.onNext(emptyList);
            adl0Var.c.c.onNext(emptyList);
            adl0Var.a.e();
            this.f.e();
            VmojiPromoInSuggestsRepositoryImpl vmojiPromoInSuggestsRepositoryImpl = (VmojiPromoInSuggestsRepositoryImpl) this.i.getValue();
            vmojiPromoInSuggestsRepositoryImpl.getClass();
            vmojiPromoInSuggestsRepositoryImpl.b = emptyList;
            vmojiPromoInSuggestsRepositoryImpl.a.clear();
            vmojiPromoInSuggestsRepositoryImpl.c = null;
            vmojiPromoInSuggestsRepositoryImpl.d.e();
            hwp0 hwp0Var = this.s;
            hwp0Var.f.clear();
            hwp0Var.e.clear();
            hwp0Var.d.clear();
            hwp0Var.g.e();
            myb0 myb0Var = (myb0) this.j.getValue();
            myb0Var.a.e();
            myb0Var.b.set(false);
            bcl0 bcl0Var = (bcl0) this.l.getValue();
            bcl0Var.getClass();
            bcl0Var.c = emptyList;
            bcl0Var.b.e();
            s6n0 s6n0Var = this.k;
            s6n0Var.f.a.e();
            s6n0Var.c.e();
            s6n0Var.d.set(false);
            s6n0Var.e.set(false);
            s6n0Var.g = jgp.b;
            ((r6e0) this.m.getValue()).a();
            ((xi30) this.n.getValue()).a.e();
        }
    }

    @Override // xsna.kcl0
    public final void c() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"StickersRepositoryImpl warmUp for " + o25.a().c()});
        }
        d1();
    }

    @Override // xsna.kcl0
    public final List<StickerItem> c0() {
        return this.h.b.d;
    }

    public final int c1() {
        return (int) Preference.m(0L, this.u.a, "stickers_num_new_items");
    }

    @Override // xsna.xic
    public final void clear() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"StickersRepositoryImpl clear for " + o25.a().c()});
        }
        v(o25.a().c().b, false);
    }

    @Override // xsna.kcl0
    public final boolean d() {
        return ((qov) this.r.getValue()).d();
    }

    @Override // xsna.kcl0
    public final long d0() {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        return Preference.m(0L, kbl0.a.b().a, "vmoji_promo_viewed_pending");
    }

    public final void d1() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"StickersRepositoryImpl initCache for " + o25.a().c()});
        }
        if (this.c.get()) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.completable.y q = io.reactivex.rxjava3.core.a.l(new e9b(this, 4)).q(asu0.a.c());
        qw40 qw40Var = new qw40(new nt10(this, 29), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.b.b(new io.reactivex.rxjava3.internal.operators.completable.h(new io.reactivex.rxjava3.internal.operators.completable.w(q, qw40Var, lVar, kVar, kVar, kVar, kVar), new re4(this, 5)).i(new fl30(new c(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 23)).subscribe());
    }

    @Override // xsna.kcl0
    public final void e0(boolean z) {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        Preference.I(kbl0.a.b().a, "animation_enabled", z);
        kbl0.e.onNext(Boolean.valueOf(z));
    }

    public final void e1(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            try {
                Iterator it = this.f.d.iterator();
                while (it.hasNext()) {
                    StickerStockItem zb = ((StickerStockItem) it.next()).zb(0, z);
                    VmojiAvatar vmojiAvatar = zb.H;
                    if (vmojiAvatar != null) {
                        vmojiAvatar.Db(z);
                    }
                    arrayList.add(zb);
                }
                this.f.d.clear();
                this.f.d.addAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        a1(true);
        this.d.b();
    }

    @Override // xsna.kcl0
    public final void f(long j) {
        a1(false);
        hwp0.e(this.s, Long.valueOf(j), null, 2);
    }

    @Override // xsna.kcl0
    public final CopyOnWriteArrayList f0() {
        return this.f.f;
    }

    public final void f1(StickerStockItem stickerStockItem, izs<? super StickerStockItem, s3q0> izsVar) {
        synchronized (this.a) {
            try {
                if (stickerStockItem.Q) {
                    p9l0 p9l0Var = this.f;
                    StickersPromoModel zb = StickersPromoModel.zb(p9l0Var.n, 47);
                    p9l0Var.n = zb;
                    p9l0Var.m.onNext(zb);
                }
                this.f.b(Collections.singletonList(StickerStockItem.Ab(stickerStockItem, false, 0, null, null, -1, 8159)));
                this.f.j.remove(stickerStockItem);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.o.a();
        izsVar.invoke(stickerStockItem);
    }

    @Override // xsna.kcl0
    public final boolean g(int i) {
        lcl0 lcl0Var = this.q;
        StickerStockItem I = lcl0Var.a.I(i);
        return I != null && lcl0Var.c(I);
    }

    public final void g1(int i, int i2) {
        p9l0 p9l0Var = this.f;
        if (p9l0Var.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = p9l0Var.d;
        int i3 = 0;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((StickerStockItem) it.next()).k && (i3 = i3 + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        if (i <= i2) {
            while (true) {
                try {
                    StickerStockItem Ab = StickerStockItem.Ab((StickerStockItem) p9l0Var.f.get(i), false, i3 + i, null, null, -16777217, 8191);
                    p9l0Var.c(Ab, Integer.valueOf(i));
                    p9l0Var.h.put(Ab.b, Ab);
                } catch (IndexOutOfBoundsException e) {
                    L.g("Error in updateActivatedOrders", e);
                }
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        L.c("StickersRepositoryImpl", new hri0(this, 3));
    }

    @Override // xsna.kcl0
    public final void h() {
        a1(false);
    }

    @Override // xsna.kcl0
    public final List<StickerItem> i() {
        return this.h.c.d;
    }

    @Override // xsna.kcl0
    public final List<StickerStockItem> i0() {
        return j5g.O0(this.f.e);
    }

    @Override // xsna.kcl0
    public final boolean j(StickerStockItem stickerStockItem) {
        return !j5g.P(this.f.j, stickerStockItem);
    }

    @Override // xsna.kcl0
    public final PromoColor j0() {
        return this.f.n.f;
    }

    @Override // xsna.kcl0
    public final void k(StickerStockItem stickerStockItem) {
        synchronized (this.a) {
            this.f.h.put(stickerStockItem.b, stickerStockItem);
            s3q0 s3q0Var = s3q0.a;
        }
        this.o.a();
        a1(true);
        this.d.c(stickerStockItem);
    }

    @Override // xsna.kcl0
    public final hwp0 k0() {
        return this.s;
    }

    @Override // xsna.kcl0
    public final void m0(boolean z) {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        Preference.I(kbl0.a.b().a, "suggests_enabled", z);
        if (z) {
            a1(true);
        }
    }

    @Override // xsna.kcl0
    public final void n(boolean z) {
        VmojiAvatar vmojiAvatar;
        synchronized (this.a) {
            try {
                VmojiAvatarModel vmojiAvatarModel = this.f.b;
                if (vmojiAvatarModel != null && (vmojiAvatar = vmojiAvatarModel.b) != null) {
                    vmojiAvatar.Db(z);
                }
                e1(z);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a1(true);
    }

    @Override // xsna.kcl0
    public final void n0(StickerItem stickerItem) {
        jtq jtqVar = this.h.b;
        jtqVar.b(stickerItem, true);
        int i = stickerItem.b;
        gcl0 gcl0Var = new gcl0("store.removeStickersFromFavorite");
        gcl0Var.C(i, "sticker_ids");
        gcl0Var.k = true;
        jtqVar.b.b(rsg0.y0(gcl0Var, null, null, 3).subscribe(io.reactivex.rxjava3.internal.functions.a.d, kwg0.b()));
    }

    @Override // xsna.kcl0
    public final s6n0 o() {
        return this.k;
    }

    @Override // xsna.kcl0
    public final void o0(long j) {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        Preference.F(j, kbl0.a.b().a, "vmoji_promo_viewed_pending");
    }

    @Override // xsna.kcl0
    public final VmojiAvatarModel p() {
        return this.f.b;
    }

    @Override // xsna.kcl0
    public final boolean p0(StickerStockItem stickerStockItem) {
        return this.q.b(stickerStockItem);
    }

    @Override // xsna.kcl0
    public final boolean q() {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        return Preference.d(kbl0.a.b().a, "stickers_free_in_stories_promo", false);
    }

    @Override // xsna.kcl0
    public final boolean q0() {
        boolean z = ((AtomicBoolean) this.o.f).get();
        boolean d2 = ((qov) this.r.getValue()).d();
        if (z || d2) {
            return true;
        }
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        return kbl0.a.b().d() == j5g.O0(zik0.g(this.f.h)).size();
    }

    @Override // xsna.kcl0
    public final tux0 r() {
        return new tux0(new b(0, this, ncl0.class, "checkServerUpdates", "checkServerUpdates()V", 0));
    }

    @Override // xsna.kcl0
    public final void s(StickerStockItem stickerStockItem, izs<? super StickerStockItem, s3q0> izsVar) {
        int i = stickerStockItem.b;
        boolean z = stickerStockItem.h;
        boolean z2 = stickerStockItem.Q;
        io.reactivex.rxjava3.disposables.b bVar = this.b;
        if (z2 && z && j0() != null) {
            bVar.b(rsg0.y0(yfb.x(new zq70().K(Integer.valueOf(i))), null, null, 3).subscribe(new uu60(new ab6(this, stickerStockItem, izsVar, 11), 19), new jw80(new nyq(29), 13)));
            return;
        }
        if (!z || j(stickerStockItem)) {
            return;
        }
        List singletonList = Collections.singletonList(Integer.valueOf(i));
        StoreUpdateStickerProductsStateKeyDto storeUpdateStickerProductsStateKeyDto = StoreUpdateStickerProductsStateKeyDto.IS_NEW;
        tfx tfxVar = new tfx("store.updateStickerProductsState", new zil0(0), new vga0(4));
        tfxVar.i("product_ids", singletonList);
        tfx.o(tfxVar, "key", storeUpdateStickerProductsStateKeyDto.i(), 0, 0, 12);
        tfx.o(tfxVar, "value", "0", 0, 0, 12);
        bVar.b(rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new fsq(new l14(this, stickerStockItem, izsVar, 8), 26), new b0y(new udk0(1), 24)));
    }

    @Override // xsna.kcl0
    public final int s0() {
        return this.f.n.d;
    }

    @Override // xsna.kcl0
    public final void t(int i) {
        Preference.F(i, this.u.a, "stickers_num_new_items");
        kbl0.c.onNext(Integer.valueOf(i));
    }

    @Override // xsna.xic
    public final long u() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        UserId c2 = o25.a().c();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return com.vk.core.files.a.I(context.getDatabasePath("stickers_database_" + c2.b));
    }

    @Override // xsna.kcl0
    public final void v(long j, boolean z) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"StickersRepositoryImpl clearCache(" + j + ',' + z + ") for " + o25.a().c()});
        }
        if (z) {
            b1(new UserId(j));
            return;
        }
        UserId userId = new UserId(j);
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"StickersRepositoryImpl fullClear(" + userId + ") for " + o25.a().c()});
        }
        b1(userId);
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        StickersDatabase.a.a(userId);
        HashMap<UserId, kbl0> hashMap2 = kbl0.b;
        kbl0.a.a(userId);
    }

    @Override // xsna.kcl0
    public final boolean v0() {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        return Preference.d(kbl0.a.b().a, "suggests_enabled", false);
    }

    @Override // xsna.kcl0
    public final boolean w0() {
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        return Preference.d(kbl0.a.b().a, "last_tab_emoji", false);
    }

    @Override // xsna.kcl0
    public final StickerStockItem x(int i) {
        StickerStockItem H = H(i);
        if (H == null) {
            return null;
        }
        boolean Ib = H.Ib();
        lcl0 lcl0Var = this.q;
        if (Ib || H.Hb()) {
            return H.Hb() ? lcl0Var.a(H) : H;
        }
        Integer num = H.L;
        if (num == null) {
            return H;
        }
        StickerStockItem I = I(num.intValue());
        StickerStockItem a2 = I == null ? H : lcl0Var.a(I);
        return a2 == null ? H : a2;
    }

    @Override // xsna.kcl0
    public final io.reactivex.rxjava3.core.q<List<StickerItem>> x0() {
        return this.h.b.c.a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.kcl0
    public final VmojiConstructorOpenParamsModel y() {
        return this.f.n.g;
    }

    @Override // xsna.kcl0
    public final void y0(StickerItem stickerItem) {
        StickerStockItem H = H(stickerItem.b);
        if (!stickerItem.h || H == null) {
            return;
        }
        if (H.k || H.b == 10102) {
            jtq jtqVar = this.h.b;
            jtqVar.b(stickerItem, false);
            int i = stickerItem.b;
            q8l0 q8l0Var = new q8l0("store.addStickersToFavorite");
            q8l0Var.C(i, "sticker_ids");
            q8l0Var.k = true;
            jtqVar.b.b(rsg0.y0(q8l0Var, null, null, 3).subscribe(new wde(new sm(23), 1), kwg0.b()));
        }
    }

    @Override // xsna.kcl0
    public final void z(int i, int i2) {
        int i3;
        int i4;
        boolean z = i < i2;
        if (z) {
            i4 = i + 1;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        synchronized (this.a) {
            try {
                StickerStockItem stickerStockItem = (StickerStockItem) this.f.f.remove(i2);
                StickerStockItem zb = stickerStockItem.zb(z ? ((StickerStockItem) this.f.f.get(i)).z : ((StickerStockItem) this.f.f.get(i - 1)).z, stickerStockItem.k);
                this.f.c(zb, Integer.valueOf(i));
                this.f.h.put(zb.b, zb);
                g1(i4, i3);
                this.o.a();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c2, code lost:
    
        if (r6 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x020e, code lost:
    
        if (r6 != null) goto L147;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object] */
    @Override // xsna.kcl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String z0(n1l0 n1l0Var, int i, boolean z) {
        ImageList imageList;
        Object obj;
        ImageConfig imageConfig;
        ImageSize imageSize;
        String valueOf;
        Object obj2;
        ImageTheme imageTheme;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        ImageConfig imageConfig2;
        ImageList imageList2;
        String str = null;
        if (!n1l0Var.Z().Jb()) {
            boolean z2 = n1l0Var instanceof StickerItem;
            StickerItem stickerItem = z2 ? (StickerItem) n1l0Var : null;
            if (stickerItem == null || (imageList2 = stickerItem.e) == null || !imageList2.Jb()) {
                ImagesConfigsSet imagesConfigsSet = this.f.c;
                if (imagesConfigsSet == null) {
                    a1(true);
                    return "";
                }
                StickerItem stickerItem2 = z2 ? (StickerItem) n1l0Var : null;
                if (stickerItem2 != null) {
                    int i2 = imagesConfigsSet.c;
                    List<ImageConfig> list = imagesConfigsSet.d;
                    ImageConfigId imageConfigId = stickerItem2.f;
                    Integer valueOf2 = imageConfigId != null ? Integer.valueOf(imageConfigId.c) : null;
                    if (valueOf2 == null || valueOf2.intValue() <= 0) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((ImageConfig) obj).b == i2) {
                                break;
                            }
                        }
                        imageConfig = (ImageConfig) obj;
                    } else {
                        List<ImageConfig> list2 = list;
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj6 = null;
                                break;
                            }
                            obj6 = it2.next();
                            if (((ImageConfig) obj6).b == valueOf2.intValue()) {
                                break;
                            }
                        }
                        imageConfig = (ImageConfig) obj6;
                        if (imageConfig == null) {
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    imageConfig2 = 0;
                                    break;
                                }
                                imageConfig2 = it3.next();
                                if (((ImageConfig) imageConfig2).b == i2) {
                                    break;
                                }
                            }
                            imageConfig = imageConfig2;
                        }
                    }
                    int i3 = stickerItem2.b;
                    Integer valueOf3 = imageConfigId != null ? Integer.valueOf(imageConfigId.b) : null;
                    StringBuilder sb = new StringBuilder();
                    List<ImageSize> list3 = imageConfig.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : list3) {
                        ImageSize imageSize2 = (ImageSize) obj7;
                        if (imageSize2.getWidth() == imageSize2.getHeight()) {
                            arrayList.add(obj7);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        imageSize = new ImageSize();
                    } else if (arrayList.size() == 1) {
                        imageSize = (ImageSize) arrayList.get(0);
                    } else {
                        int i4 = i * i;
                        ImageSize imageSize3 = new ImageSize();
                        Iterator it4 = arrayList.iterator();
                        int i5 = Integer.MAX_VALUE;
                        while (it4.hasNext()) {
                            ImageSize imageSize4 = (ImageSize) it4.next();
                            int abs = Math.abs(i4 - imageSize4.e6());
                            if (abs < i5) {
                                imageSize3 = imageSize4;
                                i5 = abs;
                            }
                        }
                        imageSize = imageSize3;
                    }
                    Iterator it5 = imageConfig.f.iterator();
                    while (it5.hasNext()) {
                        hmw hmwVar = (hmw) it5.next();
                        if (hmwVar instanceof iqm0) {
                            sb.append(((iqm0) hmwVar).a);
                        } else if (hmwVar instanceof c730) {
                            int i6 = ImageConfig.a.$EnumSwitchMapping$0[((c730) hmwVar).a.ordinal()];
                            if (i6 == 1) {
                                valueOf = String.valueOf(i3);
                            } else if (i6 == 2) {
                                valueOf = imageSize.Ab();
                            } else if (i6 == 3) {
                                List<ImageTheme> list4 = imageConfig.e;
                                if (z) {
                                    Iterator it6 = list4.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it6.next();
                                        if (((ImageTheme) obj3).Ab() == ThemeType.DARK) {
                                            break;
                                        }
                                    }
                                    imageTheme = (ImageTheme) obj3;
                                } else {
                                    Iterator it7 = list4.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it7.next();
                                        if (((ImageTheme) obj2).Ab() == ThemeType.LIGHT) {
                                            break;
                                        }
                                    }
                                    imageTheme = (ImageTheme) obj2;
                                }
                                if (imageTheme != null) {
                                    valueOf = imageTheme.zb();
                                }
                                valueOf = "";
                            } else if (i6 == 4) {
                                List<ImageFormat> zb = imageSize.zb();
                                Iterator it8 = zb.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        obj4 = null;
                                        break;
                                    }
                                    obj4 = it8.next();
                                    if (((ImageFormat) obj4).zb() == FormatType.WEBP) {
                                        break;
                                    }
                                }
                                ImageFormat imageFormat = (ImageFormat) obj4;
                                if (imageFormat != null) {
                                    valueOf = imageFormat.Ab();
                                } else {
                                    Iterator it9 = zb.iterator();
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = it9.next();
                                        if (((ImageFormat) obj5).zb() == FormatType.PNG) {
                                            break;
                                        }
                                    }
                                    ImageFormat imageFormat2 = (ImageFormat) obj5;
                                    if (imageFormat2 != null) {
                                        valueOf = imageFormat2.Ab();
                                    }
                                    valueOf = "";
                                }
                            } else {
                                if (i6 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (valueOf3 != null && valueOf3.intValue() > 0) {
                                    valueOf = gq.d(valueOf3, "?");
                                }
                                valueOf = "";
                            }
                            sb.append(valueOf);
                        } else {
                            continue;
                        }
                    }
                    return sb.toString();
                }
            }
        }
        String Hb = n1l0Var.Z().Hb(i);
        StickerItem stickerItem3 = n1l0Var instanceof StickerItem ? (StickerItem) n1l0Var : null;
        if (stickerItem3 != null && (imageList = stickerItem3.e) != null) {
            str = imageList.Hb(i);
        }
        return (!z || str == null) ? Hb == null ? "" : Hb : str;
    }
}
