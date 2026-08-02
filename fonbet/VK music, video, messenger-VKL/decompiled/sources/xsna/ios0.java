package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.device.store.AppStore;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vkontakte.android.R;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.jos0;

/* compiled from: VideoGrowthConfigResolverImpl.kt */
/* loaded from: classes6.dex */
public final class ios0 implements hos0 {
    public static final VideoGrowthAppStore b = VideoGrowthAppStore.GOOGLE;
    public final bpn0 a = new bpn0(new nyk0(3));

    /* compiled from: VideoGrowthConfigResolverImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoGrowthType.values().length];
            try {
                iArr[VideoGrowthType.BOTTOM_SHEET_AND_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoGrowthType.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoGrowthType.GRAY_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoGrowthType.CTA_BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoGrowthAppStore.values().length];
            try {
                iArr2[VideoGrowthAppStore.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoGrowthAppStore.SAMSUNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoGrowthAppStore.HUAWEI.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoGrowthAppStore.XIAOMI.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VideoGrowthAppStore.RUSTORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static EnumMap e(kos0 kos0Var) {
        EnumMap enumMap = new EnumMap(AppStore.class);
        enumMap.put((EnumMap) AppStore.GOOGLE, (AppStore) kos0Var.f);
        enumMap.put((EnumMap) AppStore.HUAWEI, (AppStore) kos0Var.g);
        enumMap.put((EnumMap) AppStore.SAMSUNG, (AppStore) kos0Var.i);
        enumMap.put((EnumMap) AppStore.XIAOMI, (AppStore) kos0Var.j);
        enumMap.put((EnumMap) AppStore.RUSTORE, (AppStore) kos0Var.h);
        return enumMap;
    }

    @Override // xsna.hos0
    public final zos0 a(VideoGrowthType videoGrowthType) {
        kos0 b2;
        String str;
        int i = a.$EnumSwitchMapping$0[videoGrowthType.ordinal()];
        if (i == 1 || i == 2) {
            b2 = com.vk.toggle.d.D.b();
        } else if (i == 3) {
            b2 = com.vk.toggle.d.F.b();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = com.vk.toggle.d.E.b();
        }
        if (b2 == null) {
            return null;
        }
        Pair<VideoGrowthAppStore, String> d = d(e(b2));
        VideoGrowthAppStore d2 = d.d();
        String g = d.g();
        int i2 = a.$EnumSwitchMapping$1[d2.ordinal()];
        if (i2 == 1) {
            str = b2.e;
        } else if (i2 == 2) {
            str = b2.p;
        } else if (i2 == 3) {
            str = b2.n;
        } else if (i2 == 4) {
            str = b2.q;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = b2.o;
        }
        return new zos0(d2, g, str, qdq.a(d2), b2.c, b2.d, 448);
    }

    @Override // xsna.hos0
    public final Map<String, zos0> b() {
        int i;
        Map<String, kos0> b2 = com.vk.toggle.d.N0.b();
        if (b2 == null) {
            b2 = jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(b2.size()));
        Iterator<T> it = b2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Pair<VideoGrowthAppStore, String> d = d(e((kos0) entry.getValue()));
            VideoGrowthAppStore d2 = d.d();
            String g = d.g();
            Integer a2 = qdq.a(d2);
            Integer valueOf = Integer.valueOf(R.string.video_community_growth_trap_title);
            Integer valueOf2 = Integer.valueOf(R.string.video_community_growth_trap_description);
            int i2 = a.$EnumSwitchMapping$1[d2.ordinal()];
            if (i2 == 1) {
                i = R.string.video_growth_trap_button_text_g;
            } else if (i2 == 2) {
                i = R.string.video_growth_trap_button_text_s;
            } else if (i2 == 3) {
                i = R.string.video_growth_trap_button_text_h;
            } else if (i2 == 4) {
                i = R.string.video_growth_trap_button_text_x;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.video_growth_trap_button_text_r;
            }
            linkedHashMap.put(key, new zos0(d2, g, null, a2, null, null, valueOf, valueOf2, Integer.valueOf(i)));
        }
        return linkedHashMap;
    }

    @Override // xsna.hos0
    public final zos0 c(EnumMap<VideoGrowthAppStore, String> enumMap) {
        EnumMap<AppStore, String> enumMap2 = new EnumMap<>((Class<AppStore>) AppStore.class);
        for (Map.Entry<VideoGrowthAppStore, String> entry : enumMap.entrySet()) {
            enumMap2.put((EnumMap<AppStore, String>) jos0.a(entry.getKey()), (AppStore) entry.getValue());
        }
        Pair<VideoGrowthAppStore, String> d = d(enumMap2);
        return new zos0(d.d(), d.g(), null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
    }

    public final Pair<VideoGrowthAppStore, String> d(EnumMap<AppStore, String> enumMap) {
        VideoGrowthAppStore videoGrowthAppStore;
        bpn0 bpn0Var = this.a;
        int size = ((List) bpn0Var.getValue()).size();
        String str = null;
        VideoGrowthAppStore videoGrowthAppStore2 = b;
        int i = 0;
        VideoGrowthAppStore videoGrowthAppStore3 = videoGrowthAppStore2;
        while (i < size && (str == null || str.length() == 0)) {
            z93 z93Var = (z93) ((List) bpn0Var.getValue()).get(i);
            String a2 = z93Var.a(enumMap);
            int i2 = jos0.a.$EnumSwitchMapping$0[z93Var.getAppStore().ordinal()];
            if (i2 == 1) {
                videoGrowthAppStore = VideoGrowthAppStore.GOOGLE;
            } else if (i2 == 2) {
                videoGrowthAppStore = VideoGrowthAppStore.SAMSUNG;
            } else if (i2 == 3) {
                videoGrowthAppStore = VideoGrowthAppStore.HUAWEI;
            } else if (i2 == 4) {
                videoGrowthAppStore = VideoGrowthAppStore.RUSTORE;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                videoGrowthAppStore = VideoGrowthAppStore.XIAOMI;
            }
            i++;
            videoGrowthAppStore3 = videoGrowthAppStore;
            str = a2;
        }
        if (str == null || str.length() == 0) {
            String str2 = enumMap.get(jos0.a(videoGrowthAppStore2));
            if (str2 == null) {
                str2 = "";
            }
            str = str2;
        } else {
            videoGrowthAppStore2 = videoGrowthAppStore3;
        }
        return new Pair<>(videoGrowthAppStore2, str);
    }
}
