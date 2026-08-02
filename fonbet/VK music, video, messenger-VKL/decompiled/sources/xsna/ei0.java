package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import kotlin.NoWhenBranchMatchedException;
import xsna.gi0;

/* compiled from: AdSlotInfo.kt */
/* loaded from: classes6.dex */
public final class ei0 implements fi0 {
    public final /* synthetic */ gi0.a a;

    /* compiled from: AdSlotInfo.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvertisementType.values().length];
            try {
                iArr[AdvertisementType.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementType.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ei0(gi0.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.fi0
    public final int a() {
        return this.a.a;
    }

    @Override // xsna.fi0
    public final AdRequestEvent.AdFormat getAdFormat() {
        int i = a.$EnumSwitchMapping$0[this.a.c.ordinal()];
        if (i == 1) {
            return AdRequestEvent.AdFormat.REWARD;
        }
        if (i == 2) {
            return AdRequestEvent.AdFormat.MULTI_INTERSTITIAL;
        }
        if (i == 3) {
            return AdRequestEvent.AdFormat.INTERSTITIAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.fi0
    public final int getAdSource() {
        return this.a.d;
    }
}
