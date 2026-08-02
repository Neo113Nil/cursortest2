package xsna;

import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AdvertisementAnalytics.kt */
/* loaded from: classes6.dex */
public final class r31 implements s31, h16 {
    public boolean a;
    public AdvertisementType b;
    public Integer c;
    public AdvertisementType d;
    public Integer e;
    public Map<Integer, hi0> f;
    public a g;
    public Integer h;
    public Integer i;
    public b j;
    public LinkedHashMap k;

    /* compiled from: AdvertisementAnalytics.kt */
    public static final class a implements s31 {
        public final AdvertisementType a;
        public final AdvertisementType b;
        public final Integer c;
        public final Integer d;
        public final Map<Integer, hi0> e;

        public a(AdvertisementType advertisementType, AdvertisementType advertisementType2, Integer num, Integer num2, LinkedHashMap linkedHashMap) {
            this.a = advertisementType;
            this.b = advertisementType2;
            this.c = num;
            this.d = num2;
            this.e = linkedHashMap;
        }

        @Override // xsna.s31
        public final Integer b() {
            return this.c;
        }

        @Override // xsna.s31
        public final AdvertisementType c() {
            return this.a;
        }

        @Override // xsna.s31
        public final Integer e() {
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
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        @Override // xsna.s31
        public final AdvertisementType f() {
            return this.b;
        }

        @Override // xsna.s31
        public final Map<Integer, hi0> h() {
            return this.e;
        }

        public final int hashCode() {
            AdvertisementType advertisementType = this.a;
            int hashCode = (advertisementType == null ? 0 : advertisementType.hashCode()) * 31;
            AdvertisementType advertisementType2 = this.b;
            int hashCode2 = (hashCode + (advertisementType2 == null ? 0 : advertisementType2.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.d;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Map<Integer, hi0> map = this.e;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdClickSnapshot(requestedAdType=");
            sb.append(this.a);
            sb.append(", actualAdFormat=");
            sb.append(this.b);
            sb.append(", adSource=");
            sb.append(this.c);
            sb.append(", actualSlotId=");
            sb.append(this.d);
            sb.append(", actualSkippedSlots=");
            return cjl0.a(sb, this.e, ')');
        }
    }

    /* compiled from: AdvertisementAnalytics.kt */
    public static final class b implements h16 {
        public final Integer a;
        public final Integer b;
        public final Map<Integer, AdSlotSkipReason> c;
        public boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Integer num, Integer num2, Map<Integer, ? extends AdSlotSkipReason> map) {
            this.a = num;
            this.b = num2;
            this.c = map;
        }

        @Override // xsna.h16
        public final Map<Integer, AdSlotSkipReason> a() {
            return this.c;
        }

        @Override // xsna.h16
        public final Integer d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        @Override // xsna.h16
        public final Integer g() {
            return this.b;
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Map<Integer, AdSlotSkipReason> map = this.c;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BannerAdSnapshot(actualBannerAdSlotId=");
            sb.append(this.a);
            sb.append(", bannerAdSource=");
            sb.append(this.b);
            sb.append(", bannerSkippedSlots=");
            return cjl0.a(sb, this.c, ')');
        }
    }

    /* compiled from: AdvertisementAnalytics.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvertisementType.values().length];
            try {
                iArr[AdvertisementType.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.h16
    public final Map<Integer, AdSlotSkipReason> a() {
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap != null) {
            return pn00.t(linkedHashMap);
        }
        return null;
    }

    @Override // xsna.s31
    public final Integer b() {
        return this.e;
    }

    @Override // xsna.s31
    public final AdvertisementType c() {
        return this.b;
    }

    @Override // xsna.h16
    public final Integer d() {
        return this.h;
    }

    @Override // xsna.s31
    public final Integer e() {
        return this.c;
    }

    @Override // xsna.s31
    public final AdvertisementType f() {
        return this.d;
    }

    @Override // xsna.h16
    public final Integer g() {
        return this.i;
    }

    @Override // xsna.s31
    public final Map<Integer, hi0> h() {
        AdvertisementType advertisementType = this.b;
        boolean z = (advertisementType == null ? -1 : c.$EnumSwitchMapping$0[advertisementType.ordinal()]) == 1 && this.a && this.b != this.d;
        Map<Integer, hi0> map = this.f;
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, hi0> entry : map.entrySet()) {
            AdvertisementType advertisementType2 = entry.getValue().a;
            if (advertisementType2 == this.b || advertisementType2 == this.d || z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void i() {
        this.b = null;
        this.a = false;
        this.f = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final void j(int i, AdSlotSkipReason adSlotSkipReason) {
        if (this.k == null) {
            this.k = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap != null) {
        }
    }
}
