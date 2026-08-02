package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import xsna.kbl0;
import xsna.kcl0;
import xsna.xhr0;

/* compiled from: AutoSuggestStickersInteractor.kt */
/* loaded from: classes6.dex */
public final class dk5 {
    public final kcl0 a;
    public final kcl0.c b;
    public final bpn0 c = new bpn0(new qc(this, 3));

    /* compiled from: AutoSuggestStickersInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickersDictionaryItem.QuickSuggestCollectionType.values().length];
            try {
                iArr[StickersDictionaryItem.QuickSuggestCollectionType.CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickersDictionaryItem.QuickSuggestCollectionType.POSTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dk5(kcl0 kcl0Var) {
        this.a = kcl0Var;
        this.b = kcl0Var.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0090  */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StickersDictionaryItem a(String str, k6n0 k6n0Var) {
        boolean z;
        nxc0 nxc0Var;
        StickersDictionaryItemLight stickersDictionaryItemLight;
        StickersDictionaryItemLight stickersDictionaryItemLight2;
        StickersDictionaryItem stickersDictionaryItem;
        StickersDictionaryItem stickersDictionaryItem2;
        Integer valueOf;
        StickerItem stickerItem;
        StickerItem stickerItem2;
        List<StickersDictionaryItemLight.DictionaryStickerModel> zb;
        StickersDictionaryItemLight.DictionaryStickerModel dictionaryStickerModel;
        int length;
        if (this.a.v0()) {
            r6m.a.getClass();
            if (r6m.j()) {
                String[] strArr = a6l0.a;
                if (str.length() != 0 && !brm0.v(str, " ", false) && !brm0.B(str, "@", false) && !brm0.B(str, "*", false) && str.length() <= 40 && !this.b.a().isEmpty()) {
                    String a2 = a6l0.a(str);
                    int i = 1;
                    if (str.length() > 0 && 2 <= (length = str.length()) && length < 41) {
                        if (!rl3.G(a6l0.a, str.toLowerCase(Locale.ROOT))) {
                            z = true;
                            nxc0Var = (nxc0) this.c.getValue();
                            if (epx.f(nxc0Var.c, a2)) {
                                synchronized (nxc0Var) {
                                    try {
                                        Map<String, StickersDictionaryItemLight> a3 = nxc0Var.b.a();
                                        if (a3.isEmpty()) {
                                            stickersDictionaryItemLight2 = null;
                                        } else {
                                            k9x k9xVar = nxc0Var.g;
                                            int i2 = k9xVar.b;
                                            int i3 = k9xVar.c;
                                            int length2 = a2.length();
                                            if (i2 <= length2 && length2 <= i3) {
                                                String a4 = xhr0.a.a("word_hash".concat(a2));
                                                Iterator it = nxc0Var.i.iterator();
                                                while (it.hasNext()) {
                                                    if (brm0.B(a4, (String) it.next(), false)) {
                                                    }
                                                }
                                                TreeMap<Integer, Map<String, StickersDictionaryItemLight>> b = nxc0Var.b(a2, a3);
                                                if (b != null) {
                                                    ArrayList arrayList = new ArrayList();
                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                    Iterator<Map.Entry<Integer, Map<String, StickersDictionaryItemLight>>> it2 = b.entrySet().iterator();
                                                    boolean z2 = false;
                                                    while (it2.hasNext()) {
                                                        Map<String, StickersDictionaryItemLight> value = it2.next().getValue();
                                                        ArrayList arrayList2 = new ArrayList();
                                                        for (Map.Entry<String, StickersDictionaryItemLight> entry : value.entrySet()) {
                                                            String key = entry.getKey();
                                                            StickersDictionaryItemLight value2 = entry.getValue();
                                                            arrayList.add(key);
                                                            arrayList2.addAll(value2.zb());
                                                            if (value2.Bb()) {
                                                                z2 = true;
                                                            }
                                                        }
                                                        linkedHashSet.addAll(nxc0.c(arrayList2, nxc0Var.a.i()));
                                                    }
                                                    if (!linkedHashSet.isEmpty()) {
                                                        stickersDictionaryItemLight = new StickersDictionaryItemLight(arrayList, j5g.O0(linkedHashSet), z2);
                                                        nxc0Var.e = stickersDictionaryItemLight;
                                                        s3q0 s3q0Var = s3q0.a;
                                                        stickersDictionaryItemLight2 = stickersDictionaryItemLight;
                                                    }
                                                }
                                                stickersDictionaryItemLight = null;
                                                nxc0Var.e = stickersDictionaryItemLight;
                                                s3q0 s3q0Var2 = s3q0.a;
                                                stickersDictionaryItemLight2 = stickersDictionaryItemLight;
                                            }
                                            stickersDictionaryItemLight = a3.get(a2);
                                            stickersDictionaryItemLight2 = stickersDictionaryItemLight;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                stickersDictionaryItemLight2 = nxc0Var.e;
                            }
                            if (stickersDictionaryItemLight2 == null) {
                                stickersDictionaryItem = this.b.c(stickersDictionaryItemLight2);
                                if (stickersDictionaryItem.isEmpty()) {
                                    this.a.h();
                                }
                                stickersDictionaryItem.g = a2;
                            } else {
                                stickersDictionaryItem = null;
                            }
                            if (z) {
                                ArrayList b2 = this.b.b(a2);
                                if (b2.isEmpty() || stickersDictionaryItem == null) {
                                    if (!b2.isEmpty()) {
                                        stickersDictionaryItem2 = new StickersDictionaryItem(null, null, null, b2, false, 23, null);
                                    }
                                    if (pla.e().b().m(HintId.VMOJI_KEYBOARD_AVATAR_SUGGESTION) && stickersDictionaryItem != null) {
                                        VmojiPromoInSuggestsRepositoryImpl M0 = this.a.M0();
                                        StickersDictionaryItemLight stickersDictionaryItemLight3 = (StickersDictionaryItemLight) M0.a.get(a2);
                                        valueOf = (stickersDictionaryItemLight3 != null || (zb = stickersDictionaryItemLight3.zb()) == null || (dictionaryStickerModel = (StickersDictionaryItemLight.DictionaryStickerModel) j5g.x0(zb, Random.b)) == null) ? null : Integer.valueOf(dictionaryStickerModel.o2());
                                        if (valueOf == null) {
                                            Iterator it3 = M0.b.iterator();
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    stickerItem2 = 0;
                                                    break;
                                                }
                                                stickerItem2 = it3.next();
                                                if (((StickerItem) stickerItem2).b == valueOf.intValue()) {
                                                    break;
                                                }
                                            }
                                            stickerItem = stickerItem2;
                                            if (stickerItem != null) {
                                                HashMap<UserId, kbl0> hashMap = kbl0.b;
                                                VmojiPromoInSuggestsRepositoryImpl.VmojiPromoInSuggestsConfig e = kbl0.a.b().e();
                                                if (System.currentTimeMillis() - e.d() < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS || e.b() == 0) {
                                                    VmojiPromoInSuggestsRepositoryImpl.b(false);
                                                } else {
                                                    int b3 = e.b();
                                                    tfx tfxVar = new tfx("stickers.markPromoAsViewed", new jh(25), new kgj0(i));
                                                    tfx.o(tfxVar, "promo_id", "vmoji_avatar_suggestion_stickers_suggestions", 0, 0, 12);
                                                    tfx.l(tfxVar, "count", b3, 1, 0, 8);
                                                    M0.d.b(rsg0.w0(yfb.x(tfxVar)).m(asu0.a.c()).l(new xq70(new l4k0(15), 24)).subscribe(new pw40(new kp1(1, M0, VmojiPromoInSuggestsRepositoryImpl.class, "processMarkPromoAsViewedResult", "processMarkPromoAsViewedResult(Z)V", 0, 11), 23), new cgu0(new ubj0(M0, 10), 5)));
                                                }
                                            }
                                        } else {
                                            stickerItem = null;
                                        }
                                        stickersDictionaryItem.h = stickerItem;
                                    }
                                } else {
                                    stickersDictionaryItem2 = new StickersDictionaryItem(stickersDictionaryItem.b, stickersDictionaryItem.c, stickersDictionaryItem.d, b2, stickersDictionaryItem.f);
                                    stickersDictionaryItem2.g = stickersDictionaryItem.g;
                                    stickersDictionaryItem2.h = stickersDictionaryItem.h;
                                }
                                stickersDictionaryItem = stickersDictionaryItem2;
                                if (pla.e().b().m(HintId.VMOJI_KEYBOARD_AVATAR_SUGGESTION)) {
                                    VmojiPromoInSuggestsRepositoryImpl M02 = this.a.M0();
                                    StickersDictionaryItemLight stickersDictionaryItemLight32 = (StickersDictionaryItemLight) M02.a.get(a2);
                                    if (stickersDictionaryItemLight32 != null) {
                                    }
                                    if (valueOf == null) {
                                    }
                                    stickersDictionaryItem.h = stickerItem;
                                }
                            }
                            if (stickersDictionaryItem != null) {
                                return (k6n0Var != null && k6n0Var.b && k6n0Var.a && k6n0Var.c) ? stickersDictionaryItem : new StickersDictionaryItem(stickersDictionaryItem.b, stickersDictionaryItem.c, stickersDictionaryItem.d, stickersDictionaryItem.e, false, 16, null);
                            }
                        }
                    }
                    z = false;
                    nxc0Var = (nxc0) this.c.getValue();
                    if (epx.f(nxc0Var.c, a2)) {
                    }
                    if (stickersDictionaryItemLight2 == null) {
                    }
                    if (z) {
                    }
                    if (stickersDictionaryItem != null) {
                    }
                }
            }
        }
        return null;
    }

    public final StickersDictionaryItem b(StickersDictionaryItem.QuickSuggestCollectionType quickSuggestCollectionType) {
        List<vcp> list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = a.$EnumSwitchMapping$0[quickSuggestCollectionType.ordinal()];
        if (i == 1) {
            list = bel.a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            list = bel.b;
        }
        List<vcp> list2 = list;
        ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((vcp) it.next()).a);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object obj = null;
            StickersDictionaryItem a2 = a((String) it2.next(), null);
            if (a2 != null) {
                Iterator<T> it3 = a2.c.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (!arrayList2.contains((StickerItem) next)) {
                        obj = next;
                        break;
                    }
                }
                StickerItem stickerItem = (StickerItem) obj;
                if (stickerItem != null) {
                    arrayList2.add(stickerItem);
                    arrayList.addAll(a2.b);
                }
            }
        }
        StickersDictionaryItem stickersDictionaryItem = new StickersDictionaryItem(arrayList, arrayList2, EmptyList.b, null, false, 24, null);
        stickersDictionaryItem.i = true;
        stickersDictionaryItem.j = quickSuggestCollectionType;
        return stickersDictionaryItem;
    }
}
