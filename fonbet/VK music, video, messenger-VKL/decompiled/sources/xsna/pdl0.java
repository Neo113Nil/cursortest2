package xsna;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.ironsource.C4217a2;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.stickers.dto.StickersImageConfigDto;
import com.vk.api.generated.stickers.dto.StickersImageConfigItemDto;
import com.vk.api.generated.stickers.dto.StickersImageConfigModifierDto;
import com.vk.api.generated.stickers.dto.StickersImageConfigSizeDto;
import com.vk.api.generated.stickers.dto.StickersStoriesFreeStickersPromoConfigDto;
import com.vk.api.generated.store.dto.StoreGetProductsResponseDto;
import com.vk.api.generated.store.dto.StoreNewItemsDto;
import com.vk.api.generated.store.dto.StoreStickerPackVersionHashDto;
import com.vk.api.generated.vmoji.dto.VmojiConstructorNewItemsDto;
import com.vk.api.generated.vmoji.dto.VmojiConstructorOpenParamsDto;
import com.vk.api.generated.vmoji.dto.VmojiGetAvatarResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiPromotionDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersProduct;
import com.vk.dto.stickers.StickersPromoModel;
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
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.kbl0;
import xsna.ncl0;

/* compiled from: StickersUpdaterImpl.kt */
/* loaded from: classes5.dex */
public final class pdl0 implements qov {
    public static final List<String> p = e43.l("purchased", SignalingProtocol.KEY_ACTIVE);
    public static final long q = TimeUnit.SECONDS.toMillis(60);
    public final p9l0 a;
    public final adl0 b;
    public final u5f c;
    public final epo d;
    public final s6n0 e;
    public final VmojiPromoInSuggestsRepositoryImpl f;
    public final bcl0 g;
    public final myb0 h;
    public final xi30 i;
    public final etj j;
    public long k;
    public final ConcurrentHashMap<UserId, Boolean> l = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<UserId, Boolean> m = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<UserId, io.reactivex.rxjava3.disposables.c> n = new ConcurrentHashMap<>();
    public final io.reactivex.rxjava3.disposables.b o = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: StickersUpdaterImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public pdl0(p9l0 p9l0Var, adl0 adl0Var, u5f u5fVar, epo epoVar, s6n0 s6n0Var, VmojiPromoInSuggestsRepositoryImpl vmojiPromoInSuggestsRepositoryImpl, bcl0 bcl0Var, myb0 myb0Var, xi30 xi30Var, etj etjVar) {
        this.a = p9l0Var;
        this.b = adl0Var;
        this.c = u5fVar;
        this.d = epoVar;
        this.e = s6n0Var;
        this.f = vmojiPromoInSuggestsRepositoryImpl;
        this.g = bcl0Var;
        this.h = myb0Var;
        this.i = xi30Var;
        this.j = etjVar;
    }

    public static StoreNewItemsDto b() {
        zq70 zq70Var = new zq70();
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        dz2 x = yfb.x(zq70Var.J(Integer.valueOf((int) Preference.m(0L, kbl0.a.b().a, "stickers_last_config_version")), Preference.s(kbl0.a.b().a, "stickers_hash_last", C4217a2.f), Preference.s(kbl0.a.b().a, "stickers_keyboard_recommendation_hash", "")));
        x.n = true;
        return (StoreNewItemsDto) x.u(0L);
    }

    public static ArrayList c(List list, List list2, xpd xpdVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Boolean) xpdVar.invoke(obj, it.next())).booleanValue()) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static List i(ArrayList arrayList, List list) {
        ytw W0 = j5g.W0(arrayList);
        int e = on00.e(c5g.u(W0, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it = W0.iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.b.hasNext()) {
                return j5g.D0(new ti8(linkedHashMap, 1), list);
            }
            xtw xtwVar = (xtw) ztwVar.next();
            Pair pair = new Pair(xtwVar.b, Integer.valueOf(xtwVar.a));
            linkedHashMap.put(pair.i(), pair.j());
        }
    }

    @Override // xsna.qov
    public final void a(UserId userId) {
        ConcurrentHashMap<UserId, io.reactivex.rxjava3.disposables.c> concurrentHashMap = this.n;
        io.reactivex.rxjava3.disposables.c cVar = concurrentHashMap.get(userId);
        if (cVar != null) {
            cVar.dispose();
        }
        concurrentHashMap.remove(userId);
        this.m.remove(userId);
        this.l.remove(userId);
        this.o.e();
        this.k = 0L;
    }

    @Override // xsna.qov
    public final boolean d() {
        return g(o25.a().c());
    }

    @Override // xsna.qov
    public final void e(UserId userId) {
        this.l.put(userId, Boolean.TRUE);
    }

    @Override // xsna.qov
    public final void f(final boolean z, ncl0.a aVar) {
        final UserId c = o25.a().c();
        Boolean bool = this.l.get(c);
        if (!(bool != null ? bool.booleanValue() : false)) {
            aVar.invoke();
            return;
        }
        if (g(c)) {
            return;
        }
        this.m.put(c, Boolean.TRUE);
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.ndl0
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
            
                if (r2.f() == false) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00d2, code lost:
            
                if (r9 != false) goto L40;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                pdl0 pdl0Var = pdl0.this;
                u5f u5fVar = pdl0Var.c;
                p9l0 p9l0Var = pdl0Var.a;
                bpn0 bpn0Var = i0q0.a;
                if (!z) {
                    boolean z2 = SystemClock.elapsedRealtime() - pdl0Var.k > pdl0.q;
                    boolean z3 = ((AtomicBoolean) u5fVar.f).get();
                    StringBuilder c2 = gp.c("Update: exp=", "; getting=", "; empty=", z2, z3);
                    boolean f = p9l0Var.f();
                    SparseArray<StickerStockItem> sparseArray = p9l0Var.h;
                    c2.append(f);
                    c2.append("; h=");
                    HashMap<UserId, kbl0> hashMap = kbl0.b;
                    c2.append(Preference.s(kbl0.a.b().a, "stickers_hash_last", C4217a2.f));
                    c2.append("; act=");
                    c2.append(p9l0Var.f.size());
                    c2.append("; deact=");
                    c2.append(p9l0Var.g.size());
                    c2.append('}');
                    L.e("[VkStickersUpdater]", c2.toString());
                    if (kbl0.a.b().d() != sparseArray.size() && !z3) {
                        L.e("[VkStickersUpdater]", "needToCheckStickersUpdates: stickersPrefs.stickerPacksCount = " + kbl0.a.b().d() + "; stickersData.allStickers.size() = " + sparseArray.size());
                    }
                    if (p9l0Var.f() && !z3) {
                        kbl0.a.b().a();
                    }
                    if (!z2) {
                    }
                }
                if (o25.a().b()) {
                    pdl0Var.k = SystemClock.elapsedRealtime();
                    try {
                        StoreNewItemsDto b = pdl0.b();
                        UserId userId = c;
                        if (b != null) {
                            StringBuilder sb = new StringBuilder("check: remote hash=");
                            sb.append(b.k());
                            sb.append("; has ");
                            List<StoreStickerPackVersionHashDto> i = b.i();
                            sb.append(i != null ? Integer.valueOf(i.size()) : null);
                            sb.append(" items; local hash=");
                            HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                            sb.append(Preference.s(kbl0.a.b().a, "stickers_hash_last", C4217a2.f));
                            L.e("[VkStickersUpdater]", sb.toString());
                            pdl0Var.l(b);
                            pdl0Var.k(userId, b);
                            pdl0Var.n(userId, b);
                            pdl0Var.j(userId);
                            pdl0Var.p(userId, b);
                            pdl0Var.o(b);
                            pdl0Var.m(b);
                            pdl0Var.f.c(b);
                            pdl0Var.i.b();
                        }
                        if (pdl0Var.g(userId)) {
                            pdl0Var.b.b(false);
                            u5fVar.a();
                            pdl0Var.j.b();
                            wge0.a(zik0.g(p9l0Var.h));
                        }
                    } catch (Throwable th) {
                        com.vk.metrics.eventtracking.b.a.a(th);
                    }
                } else {
                    L.e("[VkStickersUpdater]", "Attempt to reload stickers failed, user is not logged in");
                }
                return s3q0.a;
            }
        });
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.n.put(c, new io.reactivex.rxjava3.internal.operators.observable.a0(s0Var.r0(asu0.r()), new of1(1, this, c)).subscribe());
        myb0 myb0Var = this.h;
        if (myb0Var.b.get()) {
            return;
        }
        tfx tfxVar = new tfx("stickers.getSettings", new qq(23), new rq(26));
        tfxVar.e = "no-cache";
        myb0Var.a.b(rsg0.w0(yfb.x(tfxVar)).m(asu0Var.c()).l(new he40(new u4u(24), 5)).subscribe(new cl30(new arb0(myb0Var, 2), 8), new bqs(new com.vk.channels.impl.channel_screen.send_msg.e(L.a, 11), 16)));
    }

    public final boolean g(UserId userId) {
        Boolean bool = this.m.get(userId);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    public final ArrayList h(List list) {
        ?? r4;
        bpn0 bpn0Var = i0q0.a;
        ArrayList arrayList = new ArrayList();
        try {
            List<String> list2 = p;
            tfx tfxVar = new tfx("store.getProducts", new az60(6), new yil0(0));
            tfx.o(tfxVar, "type", "stickers", 0, 0, 12);
            tfx.o(tfxVar, "merchant", AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, 0, 0, 12);
            if (list2 != null) {
                tfxVar.i("filters", list2);
            }
            dz2 x = yfb.x(tfxVar);
            x.n = true;
            List R = j5g.R(yal0.a((StoreGetProductsResponseDto) x.u(0L)));
            HashMap<UserId, kbl0> hashMap = kbl0.b;
            Preference.F(R.size(), kbl0.a.b().a, "sticker_packs_count");
            p9l0 p9l0Var = this.a;
            synchronized (p9l0Var.a) {
                SparseIntArray sparseIntArray = p9l0Var.k;
                SparseIntArray g = p9l0.g(R);
                u4q0 u4q0Var = zik0.a;
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    sparseIntArray.put(g.keyAt(i), g.valueAt(i));
                }
                SparseIntArray sparseIntArray2 = p9l0Var.l;
                SparseIntArray h = p9l0.h(R);
                int size2 = h.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sparseIntArray2.put(h.keyAt(i2), h.valueAt(i2));
                }
                s3q0 s3q0Var = s3q0.a;
            }
            if (list != null) {
                ArrayList c = c(list, R, new xpd((byte) 0, 8));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((StoreStickerPackVersionHashDto) next).e() != null) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    StoreStickerPackVersionHashDto storeStickerPackVersionHashDto = (StoreStickerPackVersionHashDto) next2;
                    String d = storeStickerPackVersionHashDto.d();
                    StickerStockItem stickerStockItem = this.a.h.get(storeStickerPackVersionHashDto.e().intValue());
                    if (!epx.f(d, stickerStockItem != null ? stickerStockItem.I : null)) {
                        arrayList3.add(next2);
                    }
                }
                r4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Integer e = ((StoreStickerPackVersionHashDto) it3.next()).e();
                    if (e != null) {
                        r4.add(e);
                    }
                }
            } else {
                r4 = EmptyList.b;
            }
            List list3 = R;
            ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(((StickersProduct) it4.next()).b));
            }
            arrayList.addAll(i(arrayList4, r4));
            StringBuilder sb = new StringBuilder();
            sb.append("Prepare to update: products{");
            sb.append(R.size());
            sb.append("}; items{");
            sb.append(list != null ? Integer.valueOf(list.size()) : null);
            sb.append("}; sorted{");
            sb.append(arrayList.size());
            sb.append("}; idsToUpdate{");
            sb.append(r4.size());
            sb.append('}');
            L.e("[VkStickersUpdater]", sb.toString());
            return arrayList;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
            return arrayList;
        }
    }

    public final void j(UserId userId) {
        bpn0 bpn0Var = i0q0.a;
        VmojiAvatarModel vmojiAvatarModel = null;
        if (g(userId)) {
            try {
                VmojiGetAvatarResponseDto vmojiGetAvatarResponseDto = (VmojiGetAvatarResponseDto) yfb.x(u3r0.c(new u3r0(), null, 63)).u(0L);
                if (vmojiGetAvatarResponseDto != null) {
                    vmojiAvatarModel = z8w0.a(vmojiGetAvatarResponseDto);
                }
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
        }
        if (g(userId)) {
            p9l0 p9l0Var = this.a;
            synchronized (p9l0Var.a) {
                p9l0Var.b = vmojiAvatarModel;
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final void k(UserId userId, StoreNewItemsDto storeNewItemsDto) {
        ImagesConfigsSet imagesConfigsSet;
        Map map;
        Map map2;
        if (g(userId)) {
            String f = storeNewItemsDto.f();
            HashMap<UserId, kbl0> hashMap = kbl0.b;
            boolean f2 = epx.f(f, Preference.s(kbl0.a.b().a, "images_config_hash", C4217a2.f));
            p9l0 p9l0Var = this.a;
            if (!f2 || p9l0Var.c == null) {
                dz2 x = yfb.x(new tfx("store.getStickersImageConfigs", new rf3(27), new r11(27)));
                x.n = true;
                StickersImageConfigDto stickersImageConfigDto = (StickersImageConfigDto) x.u(0L);
                if (stickersImageConfigDto != null) {
                    String e = stickersImageConfigDto.e();
                    int d = stickersImageConfigDto.d();
                    List<StickersImageConfigItemDto> f3 = stickersImageConfigDto.f();
                    int i = 10;
                    ArrayList arrayList = new ArrayList(c5g.u(f3, 10));
                    Iterator it = f3.iterator();
                    while (it.hasNext()) {
                        StickersImageConfigItemDto stickersImageConfigItemDto = (StickersImageConfigItemDto) it.next();
                        int id = stickersImageConfigItemDto.getId();
                        String d2 = stickersImageConfigItemDto.d();
                        List<StickersImageConfigSizeDto> e2 = stickersImageConfigItemDto.e();
                        ArrayList arrayList2 = new ArrayList(c5g.u(e2, i));
                        Iterator it2 = e2.iterator();
                        while (it2.hasNext()) {
                            StickersImageConfigSizeDto stickersImageConfigSizeDto = (StickersImageConfigSizeDto) it2.next();
                            int width = stickersImageConfigSizeDto.getWidth();
                            int height = stickersImageConfigSizeDto.getHeight();
                            String e3 = stickersImageConfigSizeDto.e();
                            List<StickersImageConfigModifierDto> d3 = stickersImageConfigSizeDto.d();
                            Iterator it3 = it;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = d3.iterator();
                            while (it4.hasNext()) {
                                StickersImageConfigModifierDto stickersImageConfigModifierDto = (StickersImageConfigModifierDto) it4.next();
                                FormatType.a aVar = FormatType.Companion;
                                StickersImageConfigItemDto stickersImageConfigItemDto2 = stickersImageConfigItemDto;
                                String id2 = stickersImageConfigModifierDto.getId();
                                aVar.getClass();
                                Iterator it5 = it2;
                                map2 = FormatType.map;
                                Iterator it6 = it4;
                                FormatType formatType = (FormatType) map2.get(id2.toLowerCase(Locale.ROOT));
                                ImageFormat imageFormat = formatType == null ? null : new ImageFormat(formatType, stickersImageConfigModifierDto.d());
                                if (imageFormat != null) {
                                    arrayList3.add(imageFormat);
                                }
                                it2 = it5;
                                stickersImageConfigItemDto = stickersImageConfigItemDto2;
                                it4 = it6;
                            }
                            arrayList2.add(new ImageSize(width, height, e3, arrayList3));
                            it = it3;
                            stickersImageConfigItemDto = stickersImageConfigItemDto;
                        }
                        Iterator it7 = it;
                        List<StickersImageConfigModifierDto> f4 = stickersImageConfigItemDto.f();
                        i = 10;
                        ArrayList arrayList4 = new ArrayList(c5g.u(f4, 10));
                        for (StickersImageConfigModifierDto stickersImageConfigModifierDto2 : f4) {
                            ThemeType.a aVar2 = ThemeType.Companion;
                            String id3 = stickersImageConfigModifierDto2.getId();
                            aVar2.getClass();
                            map = ThemeType.map;
                            ThemeType themeType = (ThemeType) map.get(id3.toLowerCase(Locale.ROOT));
                            if (themeType == null) {
                                themeType = ThemeType.LIGHT;
                            }
                            arrayList4.add(new ImageTheme(themeType, stickersImageConfigModifierDto2.d()));
                        }
                        arrayList.add(new ImageConfig(id, d2, arrayList2, arrayList4));
                        it = it7;
                    }
                    imagesConfigsSet = new ImagesConfigsSet(e, d, arrayList);
                } else {
                    imagesConfigsSet = null;
                }
                p9l0Var.c = imagesConfigsSet;
                HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                Preference.H(kbl0.a.b().a, "images_config_hash", storeNewItemsDto.f());
                ImagesConfigsSet imagesConfigsSet2 = p9l0Var.c;
                if (imagesConfigsSet2 != null) {
                    m9l0 m9l0Var = (m9l0) this.c.b;
                    m9l0Var.a(new dj60(m9l0Var, imagesConfigsSet2));
                }
                this.j.getClass();
                y8l0.a.a(lnw.a);
            }
        }
    }

    public final void l(StoreNewItemsDto storeNewItemsDto) {
        VmojiConstructorNewItemsDto d;
        VmojiConstructorNewItemsDto d2;
        VmojiConstructorNewItemsDto d3;
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        kbl0 b = kbl0.a.b();
        int i = 0;
        Preference.F(storeNewItemsDto.g() != null ? r1.intValue() : 0, b.a, "sticker_packs_chunk_size_limit");
        kbl0 b2 = kbl0.a.b();
        Integer l = storeNewItemsDto.l();
        int intValue = l != null ? l.intValue() : 0;
        Preference.F(intValue, b2.a, "stickers_num_new_items");
        kbl0.c.onNext(Integer.valueOf(intValue));
        kbl0 b3 = kbl0.a.b();
        BaseBoolIntDto e = storeNewItemsDto.e();
        int i2 = e != null ? e.i() : 0;
        Preference.F(i2, b3.a, "stickers_num_global_promotions");
        kbl0.d.onNext(Integer.valueOf(i2));
        Integer l2 = storeNewItemsDto.l();
        int intValue2 = l2 != null ? l2.intValue() : 0;
        BaseBoolIntDto e2 = storeNewItemsDto.e();
        int i3 = e2 != null ? e2.i() : 0;
        VmojiPromotionDto u = storeNewItemsDto.u();
        if (u != null && (d3 = u.d()) != null) {
            i = d3.e();
        }
        int i4 = i;
        VmojiPromotionDto u2 = storeNewItemsDto.u();
        VmojiConstructorNewItemsDto.CounterColorDto d4 = (u2 == null || (d2 = u2.d()) == null) ? null : d2.d();
        PromoColor.a aVar = PromoColor.Companion;
        String i5 = d4 != null ? d4.i() : null;
        aVar.getClass();
        PromoColor a2 = PromoColor.a.a(i5);
        VmojiPromotionDto u3 = storeNewItemsDto.u();
        VmojiPromotionDto.DotColorDto e3 = u3 != null ? u3.e() : null;
        PromoColor a3 = PromoColor.a.a(e3 != null ? e3.i() : null);
        VmojiPromotionDto u4 = storeNewItemsDto.u();
        VmojiConstructorOpenParamsDto f = (u4 == null || (d = u4.d()) == null) ? null : d.f();
        StickersPromoModel stickersPromoModel = new StickersPromoModel(intValue2, i3, i4, a2, a3, new VmojiConstructorOpenParamsModel(f != null ? f.f() : null, f != null ? f.d() : null, f != null ? f.e() : null));
        m9l0 m9l0Var = (m9l0) this.d.c;
        m9l0Var.a(new wm80(m9l0Var, stickersPromoModel));
        p9l0 p9l0Var = this.a;
        p9l0Var.n = stickersPromoModel;
        p9l0Var.m.onNext(stickersPromoModel);
    }

    public final void m(StoreNewItemsDto storeNewItemsDto) {
        if (epx.f(storeNewItemsDto.j(), Boolean.TRUE)) {
            bcl0 bcl0Var = this.g;
            bcl0Var.getClass();
            bcl0Var.b.b(rsg0.w0(yfb.x(new tfx("stickers.getKeyboardRecommendation", new wd10(13), new nyh0(2)))).m(asu0.a.c()).subscribe(new f2u(new p8(bcl0Var, 10), 20), new eeh0(new q8(L.a, 10), 1)));
        }
    }

    public final void n(UserId userId, StoreNewItemsDto storeNewItemsDto) {
        List<StickerStockItem> list;
        if (g(userId)) {
            String k = storeNewItemsDto.k();
            HashMap<UserId, kbl0> hashMap = kbl0.b;
            boolean f = epx.f(k, Preference.s(kbl0.a.b().a, "stickers_hash_last", C4217a2.f));
            p9l0 p9l0Var = this.a;
            if (!f || p9l0Var.f()) {
                List<StoreStickerPackVersionHashDto> i = storeNewItemsDto.i();
                bpn0 bpn0Var = i0q0.a;
                if (g(userId)) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        ArrayList h = h(i);
                        int min = Math.min(400, (int) Preference.m(400L, kbl0.a.b().a, "sticker_packs_chunk_size_limit"));
                        Iterator it = j5g.U0(h, min, min, true).iterator();
                        while (it.hasNext()) {
                            List list2 = (List) it.next();
                            if (!g(userId)) {
                                list = EmptyList.b;
                                break;
                            }
                            sil0 sil0Var = new sil0(list2, null);
                            sil0Var.n = true;
                            List u = sil0Var.u(0L);
                            arrayList.addAll(u != null ? u : EmptyList.b);
                        }
                    } catch (Throwable th) {
                        com.vk.metrics.eventtracking.b.a.a(th);
                    }
                    list = arrayList;
                } else {
                    list = EmptyList.b;
                }
                StringBuilder sb = new StringBuilder("Going to add: activated=");
                List<StickerStockItem> list3 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    if (((StickerStockItem) obj).k) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((StickerStockItem) it2.next()).b));
                }
                sb.append(arrayList3);
                sb.append("; deactivated=");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list3) {
                    StickerStockItem stickerStockItem = (StickerStockItem) obj2;
                    if (!stickerStockItem.k && stickerStockItem.h) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(Integer.valueOf(((StickerStockItem) it3.next()).b));
                }
                sb.append(arrayList5);
                sb.append("; all ");
                sb.append(list.size());
                L.e("[VkStickersUpdater]", sb.toString());
                if (list.isEmpty()) {
                    return;
                }
                p9l0Var.b(list);
                HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                kbl0 b = kbl0.a.b();
                String k2 = storeNewItemsDto.k();
                if (k2 == null) {
                    k2 = "";
                }
                Preference.H(b.a, "stickers_hash_last", k2);
                String d = storeNewItemsDto.d();
                adl0 adl0Var = this.b;
                if (d == null) {
                    adl0Var.getClass();
                } else {
                    adl0Var.getClass();
                    String s = Preference.s(kbl0.a.b().a, "stickers_favorites_hash_code", "");
                    if (!TextUtils.isEmpty(d) && !TextUtils.equals(s, d) && o25.a().b()) {
                        jtq jtqVar = adl0Var.b;
                        com.vk.movika.sdk.base.ui.p pVar = new com.vk.movika.sdk.base.ui.p(19, adl0Var, d);
                        jtqVar.getClass();
                        jtqVar.b.b(rsg0.y0(new dal0("store.getFavoriteStickers"), null, null, 3).subscribe(new k5(new defpackage.s(12, jtqVar, pVar), 20), kwg0.b()));
                    }
                }
                ImFeatures imFeatures = ImFeatures.REDUCE_GET_RECENT_STICKERS_CALLS;
                imFeatures.getClass();
                if (!com.vk.toggle.b.A.a(imFeatures)) {
                    adl0Var.b(true);
                } else {
                    adl0Var.getClass();
                    Preference.I(kbl0.a.b().a, "stickers_recent_synced", false);
                }
            }
        }
    }

    public final void o(StoreNewItemsDto storeNewItemsDto) {
        final int p2 = storeNewItemsDto.p();
        final StickersStoriesFreeStickersPromoConfigDto n = storeNewItemsDto.n();
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        if (((int) Preference.m(0L, kbl0.a.b().a, "stickers_last_config_version")) >= p2 || n == null) {
            return;
        }
        List<Integer> d = n.d();
        if (d == null) {
            d = EmptyList.b;
        }
        this.o.b(new io.reactivex.rxjava3.internal.operators.completable.m(new zge(d, (m9l0) this.c.b)).q(asu0.a.c()).subscribe(new io.reactivex.rxjava3.functions.a(this) { // from class: xsna.odl0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                Preference.F(p2, kbl0.a.b().a, "stickers_last_config_version");
                Preference.I(kbl0.a.b().a, "stickers_free_in_stories_promo", n.e());
            }
        }, new m330(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 25)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, io.reactivex.rxjava3.disposables.c] */
    public final void p(UserId userId, StoreNewItemsDto storeNewItemsDto) {
        boolean z;
        if (g(userId)) {
            s6n0 s6n0Var = this.e;
            String o = storeNewItemsDto.o();
            if (o == null) {
                s6n0Var.getClass();
                return;
            }
            s6n0Var.getClass();
            HashMap<UserId, kbl0> hashMap = kbl0.b;
            int i = 0;
            if (!Preference.d(kbl0.a.b().a, "suggests_enabled", false) || s6n0Var.e.get()) {
                z = false;
            } else {
                if (s6n0Var.g.isEmpty()) {
                    Preference.H(kbl0.a.b().a, "suggestions_version_hash", C4217a2.f);
                }
                z = !o.equals(Preference.s(kbl0.a.b().a, "suggestions_version_hash", ""));
            }
            if (!z || s6n0Var.d.getAndSet(true)) {
                return;
            }
            final fiy fiyVar = s6n0Var.f;
            final yu1 yu1Var = new yu1(26, s6n0Var, o);
            fiyVar.getClass();
            final ArrayList arrayList = new ArrayList();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            io.reactivex.rxjava3.core.q<R> L = new io.reactivex.rxjava3.internal.operators.mixed.q(rsg0.w0(yfb.x(zq70.I(new zq70(), 0, null, 691))).l(new u11(new rl2(27), 22)), new g7(new ut6(18, ref$ObjectRef, fiyVar), 23)).L(new pa(new g84(17, fiyVar, ref$ObjectRef), 23), false);
            xl0 xl0Var = new xl0(new u3u(arrayList, 5), 24);
            L.getClass();
            ?? subscribe = new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c2(L, xl0Var), new io.reactivex.rxjava3.functions.a() { // from class: xsna.diy
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    yu1.this.invoke(arrayList);
                    io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ref$ObjectRef2.element;
                    if (cVar != null) {
                        fiyVar.a.a(cVar);
                    }
                }
            }).subscribe(new eiy(new udo(arrayList, 21), i), new ubq(new d0w(arrayList, 2), 10));
            fiyVar.a.b(subscribe);
            ref$ObjectRef2.element = subscribe;
        }
    }
}
