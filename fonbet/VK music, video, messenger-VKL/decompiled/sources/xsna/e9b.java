package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.dto.stickers.StickersPromoModel;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.dto.stickers.images.ImagesConfigsSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.reactions.view.ElevationImageView;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import xsna.kbl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class e9b implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e9b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                i9b i9bVar = (i9b) this.c;
                i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channels_unpinned), new d7k0(R.string.vkim_channels_pin, new mz(i9bVar, 21)));
                return;
            case 1:
                ((r5p) this.c).d = null;
                return;
            case 2:
                ((ElevationImageView) this.c).s = false;
                return;
            case 3:
                ((ha50) this.c).h = null;
                return;
            case 4:
                ncl0 ncl0Var = (ncl0) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"StickersRepositoryImpl initCache start for " + o25.a().c()});
                }
                r3y.a("vmoji_character_recereate", new arb0(ncl0Var, 20));
                r3y.a("vmojiPromoTabViewed", new skj0(ncl0Var, 3));
                hwp0 hwp0Var = ncl0Var.s;
                hwp0Var.getClass();
                try {
                    List<dwp0> b = hwp0Var.c.a.b();
                    ArrayList arrayList = new ArrayList(c5g.u(b, 10));
                    for (dwp0 dwp0Var : b) {
                        arrayList.add(new ewp0(dwp0Var.a, dwp0Var.b, dwp0Var.c, dwp0Var.d, dwp0Var.e));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ewp0 ewp0Var = (ewp0) it.next();
                        hwp0Var.d.put(ewp0Var.a.b, Collections.singletonList(ewp0Var));
                    }
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(new RuntimeException("[UGCStickersRepositoryImpl]", th));
                }
                epo epoVar = ncl0Var.p;
                epoVar.getClass();
                try {
                    ArrayList c = ((m9l0) epoVar.c).c();
                    p9l0 p9l0Var = (p9l0) epoVar.b;
                    StickersPromoModel stickersPromoModel = (StickersPromoModel) j5g.a0(c);
                    if (stickersPromoModel == null) {
                        stickersPromoModel = new StickersPromoModel(0, 0, 0, null, null, null, 63, null);
                    }
                    p9l0Var.n = stickersPromoModel;
                    p9l0Var.m.onNext(stickersPromoModel);
                } catch (Throwable th2) {
                    com.vk.metrics.eventtracking.b.a.a(new RuntimeException("[VkStickersPromoStorage]", th2));
                }
                VmojiPromoInSuggestsRepositoryImpl vmojiPromoInSuggestsRepositoryImpl = (VmojiPromoInSuggestsRepositoryImpl) ncl0Var.i.getValue();
                vmojiPromoInSuggestsRepositoryImpl.getClass();
                try {
                    HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                    kaw0 c2 = StickersDatabase.a.b().L().c();
                    if (c2 == null) {
                        c2 = new kaw0(0);
                    }
                    List<StickersDictionaryItemLight> list = c2.a;
                    vmojiPromoInSuggestsRepositoryImpl.b = c2.b;
                    vmojiPromoInSuggestsRepositoryImpl.a.clear();
                    for (StickersDictionaryItemLight stickersDictionaryItemLight : list) {
                        if (stickersDictionaryItemLight != null) {
                            Iterator<String> it2 = stickersDictionaryItemLight.Ab().iterator();
                            while (it2.hasNext()) {
                                vmojiPromoInSuggestsRepositoryImpl.a.put(it2.next(), stickersDictionaryItemLight);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    com.vk.metrics.eventtracking.b.a.a(th3);
                    vmojiPromoInSuggestsRepositoryImpl.a();
                }
                r6e0 r6e0Var = (r6e0) ncl0Var.m.getValue();
                r6e0Var.getClass();
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl initCacheSync"});
                }
                try {
                    r6e0Var.d();
                } catch (Throwable th4) {
                    com.vk.metrics.eventtracking.b.a.a(th4);
                }
                u5f u5fVar = ncl0Var.o;
                u5fVar.getClass();
                try {
                    ArrayList b2 = ((m9l0) u5fVar.b).b();
                    if (!b2.isEmpty()) {
                        ((p9l0) u5fVar.a).c = (ImagesConfigsSet) j5g.Y(b2);
                    }
                } catch (Throwable th5) {
                    com.vk.metrics.eventtracking.b.a.a(th5);
                }
                adl0 adl0Var = ncl0Var.h;
                int i = adl0Var.d;
                s9f0 s9f0Var = adl0Var.c;
                jtq jtqVar = adl0Var.b;
                try {
                    HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                    if (((int) Preference.m(0L, kbl0.a.b().a, "stickers_last_version_code")) != i) {
                        adl0.a();
                        Preference.F(i, kbl0.a.b().a, "stickers_last_version_code");
                    }
                    int i2 = 18;
                    jtqVar.b.b(jtqVar.c.subscribe(new defpackage.p(new u4e(jtqVar, i2), 24)));
                    s9f0Var.b.b(s9f0Var.c.subscribe(new o3y(new bq00(s9f0Var, 28), i2)));
                    jtqVar.a();
                    s9f0Var.a();
                } catch (Throwable th6) {
                    com.vk.metrics.eventtracking.b.a.a(th6);
                    adl0.a();
                    m9l0 m9l0Var = jtqVar.a;
                    m9l0Var.a(new ob0(m9l0Var, 29));
                    io.reactivex.rxjava3.subjects.f<List<StickerItem>> fVar = jtqVar.c;
                    EmptyList emptyList = EmptyList.b;
                    fVar.onNext(emptyList);
                    m9l0 m9l0Var2 = s9f0Var.a;
                    m9l0Var2.a(new qqf0(m9l0Var2));
                    s9f0Var.c.onNext(emptyList);
                    adl0Var.a.e();
                }
                bcl0 bcl0Var = (bcl0) ncl0Var.l.getValue();
                bcl0Var.getClass();
                try {
                    HashMap<UserId, StickersDatabase> hashMap3 = StickersDatabase.m;
                    acl0 acl0Var = StickersDatabase.a.b().G().get();
                    if (acl0Var != null) {
                        bcl0Var.b(acl0Var.b, acl0Var.c);
                    }
                } catch (Throwable th7) {
                    com.vk.metrics.eventtracking.b.a.a(th7);
                }
                u5f u5fVar2 = ncl0Var.o;
                if (!((AtomicBoolean) u5fVar2.f).get()) {
                    ((AtomicBoolean) u5fVar2.f).set(true);
                    try {
                        HashMap<UserId, StickersDatabase> hashMap4 = StickersDatabase.m;
                        List<j5l0> b3 = StickersDatabase.a.b().F().b();
                        ArrayList arrayList2 = new ArrayList(c5g.u(b3, 10));
                        Iterator<T> it3 = b3.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(sdy.l((j5l0) it3.next()));
                        }
                        ArrayList d = ((m9l0) u5fVar2.b).d();
                        synchronized (u5fVar2.c) {
                            try {
                                ((p9l0) u5fVar2.a).b(j5g.D0(new daa(1), arrayList2));
                                if (!d.isEmpty()) {
                                    ((p9l0) u5fVar2.a).b = (VmojiAvatarModel) j5g.Y(d);
                                }
                                s3q0 s3q0Var = s3q0.a;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
                s6n0 s6n0Var = ncl0Var.k;
                if (s6n0Var.e.get()) {
                    return;
                }
                s6n0Var.e.set(true);
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList a = s6n0Var.b.a();
                    ArrayList arrayList3 = new ArrayList(c5g.u(a, 10));
                    Iterator it4 = a.iterator();
                    while (it4.hasNext()) {
                        StickersDictionaryItemLight stickersDictionaryItemLight2 = (StickersDictionaryItemLight) it4.next();
                        if (stickersDictionaryItemLight2 != null) {
                            Iterator<String> it5 = stickersDictionaryItemLight2.Ab().iterator();
                            while (it5.hasNext()) {
                                linkedHashMap.put(it5.next(), stickersDictionaryItemLight2);
                            }
                        }
                        arrayList3.add(s3q0.a);
                    }
                    s6n0Var.g = linkedHashMap;
                } catch (Throwable th8) {
                    try {
                        s6n0Var.f.a.e();
                        s6n0Var.c.e();
                        s6n0Var.d.set(false);
                        s6n0Var.e.set(false);
                        s6n0Var.g = jgp.b;
                        com.vk.metrics.eventtracking.b.a.a(th8);
                    } finally {
                        s6n0Var.e.set(false);
                    }
                }
                return;
            default:
                com.vk.superapp.verification.account.d dVar = ((tyv0) this.c).e;
                if (dVar != null) {
                    dVar.Gn();
                    return;
                }
                return;
        }
    }
}
