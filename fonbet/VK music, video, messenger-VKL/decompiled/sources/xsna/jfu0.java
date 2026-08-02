package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.ad.BannerAdType;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsAdsStat$TypeAdsBanner;
import com.vk.stat.scheme.MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative;
import com.vk.stat.scheme.MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$AppIdItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$SessionUuidItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount;
import com.vk.stat.scheme.SchemeStat$AppsAdsSkippedReasonItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppCustomEventItem;
import com.vk.stat.scheme.SchemeStat$TypeRegistrationItem;
import com.vk.stat.scheme.SchemeStat$TypeVkBridge;
import com.vk.stat.scheme.SchemeStat$TypeVkBridgeShareItem;
import com.vk.stat.scheme.SchemeStat$TypeVkBridgeShowNativeAdsItem;
import com.vk.stat.scheme.SchemeStat$VkbridgeErrorItem;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.superapp.navigation.api.data.AppShareType;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.kfu0;

/* compiled from: VkBridgeAnalyticsImpl.kt */
/* loaded from: classes6.dex */
public final class jfu0 implements VkBridgeAnalytics {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final j19 f;

    /* compiled from: VkBridgeAnalyticsImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$11;
        public static final /* synthetic */ int[] $EnumSwitchMapping$12;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[AppShareType.values().length];
            try {
                iArr[AppShareType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppShareType.QR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppShareType.STORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppShareType.MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AppShareType.COPY_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AppShareType.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AppShareType.CREATE_CHAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AppShareType.WALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkAppsErrors.ErrorTypes.values().length];
            try {
                iArr2[VkAppsErrors.ErrorTypes.API.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VkAppsErrors.ErrorTypes.CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VkAppsErrors.ErrorTypes.AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AdvertisementType.values().length];
            try {
                iArr3[AdvertisementType.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[AdvertisementType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[AdvertisementType.MULTI_INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AdSlotSkipReason.values().length];
            try {
                iArr4[AdSlotSkipReason.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[AdSlotSkipReason.NETWORK_NO_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[AdSlotSkipReason.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[VkBridgeAnalytics.InstallScreenEvent.values().length];
            try {
                iArr5[VkBridgeAnalytics.InstallScreenEvent.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[VkBridgeAnalytics.InstallScreenEvent.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[VkBridgeAnalytics.InstallScreenEvent.LAUNCH_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[VkBridgeAnalytics.NativeAdEventType.values().length];
            try {
                iArr6[VkBridgeAnalytics.NativeAdEventType.CLICK_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[VkBridgeAnalytics.NativeAdEventType.SHOW_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[VkBridgeAnalytics.NativeAdEventType.HIDE_BY_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[VkBridgeAnalytics.NativeAdEventType.SHOW_AD_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[BannerAdType.values().length];
            try {
                iArr7[BannerAdType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[BannerParamsSnapshot.LayoutType.values().length];
            try {
                iArr8[BannerParamsSnapshot.LayoutType.RESIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[BannerParamsSnapshot.LayoutType.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[BannerParamsSnapshot.BannerLocation.values().length];
            try {
                iArr9[BannerParamsSnapshot.BannerLocation.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr9[BannerParamsSnapshot.BannerLocation.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[BannerParamsSnapshot.HeightType.values().length];
            try {
                iArr10[BannerParamsSnapshot.HeightType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr10[BannerParamsSnapshot.HeightType.COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[BannerParamsSnapshot.Orientation.values().length];
            try {
                iArr11[BannerParamsSnapshot.Orientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr11[BannerParamsSnapshot.Orientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$10 = iArr11;
            int[] iArr12 = new int[BannerParamsSnapshot.BannerAlign.values().length];
            try {
                iArr12[BannerParamsSnapshot.BannerAlign.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr12[BannerParamsSnapshot.BannerAlign.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr12[BannerParamsSnapshot.BannerAlign.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$11 = iArr12;
            int[] iArr13 = new int[BannerType.values().length];
            try {
                iArr13[BannerType.BONUS_VOTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr13[BannerType.FREE_VOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr13[BannerType.PERCENT_DISCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            $EnumSwitchMapping$12 = iArr13;
        }
    }

    public jfu0(long j, String str, String str2, String str3, boolean z, j19 j19Var) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = j19Var;
    }

    public static MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.DiscountType o(BannerType bannerType) {
        int i = bannerType == null ? -1 : a.$EnumSwitchMapping$12[bannerType.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.DiscountType.BONUS_VOTES;
        }
        if (i == 2) {
            return MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.DiscountType.FREE_VOTES;
        }
        if (i != 3) {
            return null;
        }
        return MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.DiscountType.PERCENT_DISCOUNT;
    }

    public static SchemeStat$AppsAdsSkippedReasonItem p(AdSlotSkipReason adSlotSkipReason) {
        int i = a.$EnumSwitchMapping$3[adSlotSkipReason.ordinal()];
        if (i == 1) {
            return SchemeStat$AppsAdsSkippedReasonItem.TIMEOUT;
        }
        if (i == 2) {
            return SchemeStat$AppsAdsSkippedReasonItem.NETWORK_NO_AD;
        }
        if (i == 3) {
            return SchemeStat$AppsAdsSkippedReasonItem.NETWORK_ERROR;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0106  */
    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(VkBridgeAnalytics.BannerAdEvent bannerAdEvent, boolean z, h16 h16Var, BannerParamsSnapshot bannerParamsSnapshot, String str) {
        MobileOfficialAppsAdsStat$TypeAdsBanner.Type type;
        MobileOfficialAppsAdsStat$TypeAdsBanner.BannerLocation bannerLocation;
        MobileOfficialAppsAdsStat$TypeAdsBanner.BannerAlign bannerAlign;
        MobileOfficialAppsAdsStat$TypeAdsBanner.LayoutType layoutType;
        MobileOfficialAppsAdsStat$TypeAdsBanner.HeightType heightType;
        MobileOfficialAppsAdsStat$TypeAdsBanner.Orientation orientation;
        MobileOfficialAppsAdsStat$TypeAdsBanner.Orientation orientation2;
        MobileOfficialAppsAdsStat$TypeAdsBanner.HeightType heightType2;
        MobileOfficialAppsAdsStat$TypeAdsBanner.LayoutType layoutType2;
        MobileOfficialAppsAdsStat$TypeAdsBanner.BannerAlign bannerAlign2;
        Set<Map.Entry<Integer, AdSlotSkipReason>> entrySet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map<Integer, AdSlotSkipReason> a2 = h16Var.a();
        if (a2 != null && (entrySet = a2.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(entry.getKey());
                arrayList2.add(p((AdSlotSkipReason) entry.getValue()));
            }
        }
        int i = (int) this.a;
        String str2 = this.b;
        if (str2 == null) {
            str2 = "";
        }
        Integer d = h16Var.d();
        int intValue = d != null ? d.intValue() : 0;
        Integer g = h16Var.g();
        String num = g != null ? g.toString() : null;
        int i2 = kfu0.a.$EnumSwitchMapping$2[bannerAdEvent.ordinal()];
        if (i2 == 1) {
            type = MobileOfficialAppsAdsStat$TypeAdsBanner.Type.TYPE_HIDE_BY_USER;
        } else if (i2 == 2) {
            type = MobileOfficialAppsAdsStat$TypeAdsBanner.Type.TYPE_HIDE_BY_BRIDGE;
        } else if (i2 == 3) {
            type = MobileOfficialAppsAdsStat$TypeAdsBanner.Type.TYPE_SHOW_AUTO_UPDATE;
        } else if (i2 == 4) {
            type = MobileOfficialAppsAdsStat$TypeAdsBanner.Type.TYPE_SHOW_BY_BRIDGE;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            type = MobileOfficialAppsAdsStat$TypeAdsBanner.Type.TYPE_TAPPED_BY_USER;
        }
        if (bannerParamsSnapshot != null) {
            BannerParamsSnapshot.BannerLocation bannerLocation2 = bannerParamsSnapshot.f;
            int i3 = bannerLocation2 == null ? -1 : a.$EnumSwitchMapping$8[bannerLocation2.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    bannerLocation = MobileOfficialAppsAdsStat$TypeAdsBanner.BannerLocation.TOP;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bannerLocation = MobileOfficialAppsAdsStat$TypeAdsBanner.BannerLocation.BOTTOM;
                }
                if (bannerParamsSnapshot == null) {
                    BannerParamsSnapshot.BannerAlign bannerAlign3 = bannerParamsSnapshot.g;
                    int i4 = bannerAlign3 == null ? -1 : a.$EnumSwitchMapping$11[bannerAlign3.ordinal()];
                    if (i4 == -1) {
                        bannerAlign2 = null;
                    } else if (i4 == 1) {
                        bannerAlign2 = MobileOfficialAppsAdsStat$TypeAdsBanner.BannerAlign.LEFT;
                    } else if (i4 == 2) {
                        bannerAlign2 = MobileOfficialAppsAdsStat$TypeAdsBanner.BannerAlign.RIGHT;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bannerAlign2 = MobileOfficialAppsAdsStat$TypeAdsBanner.BannerAlign.CENTER;
                    }
                    bannerAlign = bannerAlign2;
                } else {
                    bannerAlign = null;
                }
                if (bannerParamsSnapshot == null) {
                    BannerParamsSnapshot.LayoutType layoutType3 = bannerParamsSnapshot.e;
                    int i5 = layoutType3 == null ? -1 : a.$EnumSwitchMapping$7[layoutType3.ordinal()];
                    if (i5 == -1) {
                        layoutType2 = null;
                    } else if (i5 == 1) {
                        layoutType2 = MobileOfficialAppsAdsStat$TypeAdsBanner.LayoutType.RESIZE;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        layoutType2 = MobileOfficialAppsAdsStat$TypeAdsBanner.LayoutType.OVERLAY;
                    }
                    layoutType = layoutType2;
                } else {
                    layoutType = null;
                }
                if (bannerParamsSnapshot == null) {
                    BannerParamsSnapshot.HeightType heightType3 = bannerParamsSnapshot.h;
                    int i6 = heightType3 == null ? -1 : a.$EnumSwitchMapping$9[heightType3.ordinal()];
                    if (i6 == -1) {
                        heightType2 = null;
                    } else if (i6 == 1) {
                        heightType2 = MobileOfficialAppsAdsStat$TypeAdsBanner.HeightType.REGULAR;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        heightType2 = MobileOfficialAppsAdsStat$TypeAdsBanner.HeightType.COMPACT;
                    }
                    heightType = heightType2;
                } else {
                    heightType = null;
                }
                if (bannerParamsSnapshot == null) {
                    BannerParamsSnapshot.Orientation orientation3 = bannerParamsSnapshot.i;
                    int i7 = orientation3 == null ? -1 : a.$EnumSwitchMapping$10[orientation3.ordinal()];
                    if (i7 == -1) {
                        orientation2 = null;
                    } else if (i7 == 1) {
                        orientation2 = MobileOfficialAppsAdsStat$TypeAdsBanner.Orientation.VERTICAL;
                    } else {
                        if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        orientation2 = MobileOfficialAppsAdsStat$TypeAdsBanner.Orientation.HORIZONTAL;
                    }
                    orientation = orientation2;
                } else {
                    orientation = null;
                }
                MobileOfficialAppsAdsStat$TypeAdsBanner mobileOfficialAppsAdsStat$TypeAdsBanner = new MobileOfficialAppsAdsStat$TypeAdsBanner(i, str2, type, z, intValue, this.c, num, null, arrayList2, arrayList, null, null, bannerLocation, bannerAlign, layoutType, heightType, orientation, bannerParamsSnapshot != null ? Boolean.valueOf(bannerParamsSnapshot.d) : null, str, 3200, null);
                xgx0.a.getClass();
                xgx0.a("Banner ads: adItem=" + mobileOfficialAppsAdsStat$TypeAdsBanner);
                n(mobileOfficialAppsAdsStat$TypeAdsBanner);
            }
        }
        bannerLocation = null;
        if (bannerParamsSnapshot == null) {
        }
        if (bannerParamsSnapshot == null) {
        }
        if (bannerParamsSnapshot == null) {
        }
        if (bannerParamsSnapshot == null) {
        }
        MobileOfficialAppsAdsStat$TypeAdsBanner mobileOfficialAppsAdsStat$TypeAdsBanner2 = new MobileOfficialAppsAdsStat$TypeAdsBanner(i, str2, type, z, intValue, this.c, num, null, arrayList2, arrayList, null, null, bannerLocation, bannerAlign, layoutType, heightType, orientation, bannerParamsSnapshot != null ? Boolean.valueOf(bannerParamsSnapshot.d) : null, str, 3200, null);
        xgx0.a.getClass();
        xgx0.a("Banner ads: adItem=" + mobileOfficialAppsAdsStat$TypeAdsBanner2);
        n(mobileOfficialAppsAdsStat$TypeAdsBanner2);
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void b(AdRequestEvent adRequestEvent) {
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.AdFormat adFormat;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.EventType eventType;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestType requestType;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestSubtype requestSubtype;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.AdFormat adFormat2;
        int i = (int) this.a;
        String str = this.b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        AdRequestEvent.AdFormat adFormat3 = adRequestEvent.a;
        if (adFormat3 != null) {
            int i2 = kfu0.a.$EnumSwitchMapping$3[adFormat3.ordinal()];
            if (i2 == 1) {
                adFormat2 = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.AdFormat.REWARD;
            } else if (i2 == 2) {
                adFormat2 = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.AdFormat.INTERSTITIAL;
            } else if (i2 == 3) {
                adFormat2 = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.AdFormat.MULTI_INTERSTITIAL;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                adFormat2 = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.AdFormat.BANNER;
            }
            adFormat = adFormat2;
        } else {
            adFormat = null;
        }
        int i3 = kfu0.a.$EnumSwitchMapping$4[adRequestEvent.c.ordinal()];
        if (i3 == 1) {
            eventType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.EventType.REQUEST;
        } else if (i3 == 2) {
            eventType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.EventType.LOAD;
        } else if (i3 == 3) {
            eventType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.EventType.SHOW;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.EventType.IMPRESSION;
        }
        int i4 = kfu0.a.$EnumSwitchMapping$5[adRequestEvent.d.ordinal()];
        if (i4 == 1) {
            requestType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestType.BRIDGE;
        } else if (i4 == 2) {
            requestType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestType.SPLASH;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            requestType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestType.CLOSE;
        }
        int i5 = kfu0.a.$EnumSwitchMapping$6[adRequestEvent.e.ordinal()];
        if (i5 == 1) {
            requestSubtype = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestSubtype.PRELOAD;
        } else if (i5 == 2) {
            requestSubtype = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestSubtype.CHECK;
        } else if (i5 == 3) {
            requestSubtype = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestSubtype.SHOW;
        } else {
            if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            requestSubtype = MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestSubtype.LOAD_NEXT;
        }
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.RequestSubtype requestSubtype2 = requestSubtype;
        Integer num = adRequestEvent.h;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest.EventType eventType2 = eventType;
        n(new MobileOfficialAppsAdsStat$TypeMiniAppsAdsRequest(i, str2, eventType2, requestType, requestSubtype2, this.c, adFormat, num != null ? num.toString() : null, adRequestEvent.i, adRequestEvent.k, adRequestEvent.j, adRequestEvent.f, adRequestEvent.g, adRequestEvent.b));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void c(cnk cnkVar) {
        SchemeStat$TypeMiniAppCustomEventItem.Type type;
        String str = this.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = cnkVar.a;
        long currentTimeMillis = System.currentTimeMillis();
        int i = (int) this.a;
        String str4 = cnkVar.b;
        String str5 = cnkVar.c;
        String str6 = cnkVar.d;
        int hashCode = str6.hashCode();
        if (hashCode == -1095048125) {
            if (str6.equals("type_click")) {
                type = SchemeStat$TypeMiniAppCustomEventItem.Type.TYPE_CLICK;
            }
            type = SchemeStat$TypeMiniAppCustomEventItem.Type.TYPE_ACTION;
        } else if (hashCode != -1085204474) {
            if (hashCode == 519428234 && str6.equals("type_view")) {
                type = SchemeStat$TypeMiniAppCustomEventItem.Type.TYPE_VIEW;
            }
            type = SchemeStat$TypeMiniAppCustomEventItem.Type.TYPE_ACTION;
        } else {
            if (str6.equals("type_navgo")) {
                type = SchemeStat$TypeMiniAppCustomEventItem.Type.TYPE_NAVGO;
            }
            type = SchemeStat$TypeMiniAppCustomEventItem.Type.TYPE_ACTION;
        }
        n(new SchemeStat$TypeMiniAppCustomEventItem(str3, currentTimeMillis, i, str2, str4, str5, type, cnkVar.e, cnkVar.f, null, cnkVar.g, 512, null));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void d(VkBridgeAnalytics.PersonalDiscountExitReason personalDiscountExitReason, int i, Integer num, BannerType bannerType) {
        n(new MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount(MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event.MODAL_SESSION, o(bannerType), Integer.valueOf((int) this.a), num, personalDiscountExitReason.h(), Integer.valueOf(i)));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void e(boolean z, s31 s31Var, VkBridgeAnalytics.NativeAdEventType nativeAdEventType) {
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.EventType eventType;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.AdFormat adFormat;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.ActualAdFormat actualAdFormat;
        Set<Map.Entry<Integer, hi0>> entrySet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map<Integer, hi0> h = s31Var.h();
        if (h != null && (entrySet = h.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(entry.getKey());
                arrayList2.add(p(((hi0) entry.getValue()).b));
            }
        }
        int i = (int) this.a;
        String str = this.b;
        if (str == null) {
            str = "";
        }
        Integer e = s31Var.e();
        int intValue = e != null ? e.intValue() : 0;
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.ActualAdFormat actualAdFormat2 = null;
        if (nativeAdEventType != null) {
            int i2 = a.$EnumSwitchMapping$5[nativeAdEventType.ordinal()];
            if (i2 == 1) {
                eventType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.EventType.CLICK_AD;
            } else if (i2 == 2) {
                eventType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.EventType.SHOW_AD;
            } else if (i2 == 3) {
                eventType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.EventType.HIDE_BY_USER;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eventType = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.EventType.SHOW_AD_FAILED;
            }
        } else {
            eventType = null;
        }
        Integer b = s31Var.b();
        String num = b != null ? b.toString() : null;
        AdvertisementType c = s31Var.c();
        if (c != null) {
            int i3 = a.$EnumSwitchMapping$2[c.ordinal()];
            if (i3 == 1) {
                adFormat = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.AdFormat.REWARD;
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                adFormat = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.AdFormat.INTERSTITIAL;
            }
        } else {
            adFormat = null;
        }
        AdvertisementType f = s31Var.f();
        if (f != null) {
            int i4 = a.$EnumSwitchMapping$2[f.ordinal()];
            if (i4 == 1) {
                actualAdFormat = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.ActualAdFormat.REWARD;
            } else if (i4 == 2) {
                actualAdFormat = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.ActualAdFormat.INTERSTITIAL;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                actualAdFormat = MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative.ActualAdFormat.MULTI_INTERSTITIAL;
            }
            actualAdFormat2 = actualAdFormat;
        }
        MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative = new MobileOfficialAppsAdsStat$TypeMiniAppsAdsNative(i, str, z, intValue, eventType, this.c, num, adFormat, actualAdFormat2, arrayList2, arrayList, null);
        xgx0.a.getClass();
        xgx0.a("Fullscreen ads: adItem=" + mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative);
        n(mobileOfficialAppsAdsStat$TypeMiniAppsAdsNative);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void f(String str, boolean z, s31 s31Var, VkBridgeAnalytics.NativeAdEventType nativeAdEventType, String str2) {
        SchemeStat$TypeVkBridgeShowNativeAdsItem.AdFormat adFormat;
        String str3;
        Object obj;
        Object obj2;
        Set<Map.Entry<Integer, hi0>> entrySet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map<Integer, hi0> h = s31Var.h();
        if (h != null && (entrySet = h.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(entry.getKey());
                arrayList2.add(p(((hi0) entry.getValue()).b));
            }
        }
        AdvertisementType c = s31Var.c();
        if (c != null) {
            int i = a.$EnumSwitchMapping$2[c.ordinal()];
            if (i == 1) {
                adFormat = SchemeStat$TypeVkBridgeShowNativeAdsItem.AdFormat.REWARD;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                adFormat = SchemeStat$TypeVkBridgeShowNativeAdsItem.AdFormat.INTERSTITIAL;
            }
            str3 = null;
        } else {
            adFormat = null;
            str3 = null;
        }
        Integer e = s31Var.e();
        AdvertisementType f = s31Var.f();
        if (f != null) {
            int i2 = a.$EnumSwitchMapping$2[f.ordinal()];
            if (i2 == 1) {
                obj = SchemeStat$TypeVkBridgeShowNativeAdsItem.ActualAdFormat.REWARD;
            } else if (i2 == 2) {
                obj = SchemeStat$TypeVkBridgeShowNativeAdsItem.ActualAdFormat.INTERSTITIAL;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = SchemeStat$TypeVkBridgeShowNativeAdsItem.ActualAdFormat.MULTI_INTERSTITIAL;
            }
        } else {
            obj = str3;
        }
        Integer b = s31Var.b();
        String num = b != null ? b.toString() : str3;
        if (nativeAdEventType != null) {
            int i3 = a.$EnumSwitchMapping$5[nativeAdEventType.ordinal()];
            if (i3 == 1) {
                obj2 = SchemeStat$TypeVkBridgeShowNativeAdsItem.EventType.CLICK_AD;
            } else if (i3 == 2) {
                obj2 = SchemeStat$TypeVkBridgeShowNativeAdsItem.EventType.SHOW_AD;
            } else if (i3 == 3) {
                obj2 = SchemeStat$TypeVkBridgeShowNativeAdsItem.EventType.HIDE_BY_USER;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = SchemeStat$TypeVkBridgeShowNativeAdsItem.EventType.SHOW_AD_FAILED;
            }
        } else {
            obj2 = str3;
        }
        SchemeStat$TypeVkBridgeShowNativeAdsItem schemeStat$TypeVkBridgeShowNativeAdsItem = new SchemeStat$TypeVkBridgeShowNativeAdsItem(adFormat, num, Boolean.valueOf(z), arrayList, e, obj, arrayList2, obj2, null, str2, 256, null);
        xgx0.a.getClass();
        xgx0.a("Ads: adItem=" + schemeStat$TypeVkBridgeShowNativeAdsItem);
        n(SchemeStat$TypeVkBridge.a.a(str, Integer.valueOf((int) this.a), this.b, Boolean.valueOf(z), null, null, this.c, null, schemeStat$TypeVkBridgeShowNativeAdsItem, 368));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void g(VkBridgeAnalytics.RegistrationEvent registrationEvent) {
        SchemeStat$TypeRegistrationItem.EventType eventType;
        int i = kfu0.a.$EnumSwitchMapping$7[registrationEvent.ordinal()];
        if (i == 1) {
            eventType = SchemeStat$TypeRegistrationItem.EventType.EXTERNAL_LINK_MINIAPP_OPEN;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = SchemeStat$TypeRegistrationItem.EventType.EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN;
        }
        n(new SchemeStat$TypeRegistrationItem(eventType, null, null, null, null, null, null, null, null, null, Integer.valueOf(dgn0.b().b), Integer.valueOf((int) this.a), IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, null));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void h(VkBridgeAnalytics.ExitGameAlertEvent exitGameAlertEvent, Integer num, String[] strArr, Integer num2) {
        MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.Event a2 = kfu0.a(exitGameAlertEvent);
        long j = this.a;
        int i = (int) j;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new CommonStat$TypeTrackCodeItem(str));
        }
        String str2 = this.c;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = str2 != null ? new CommonStat$TypeTrackCodeItem(str2) : null;
        rxi0.a.getClass();
        n(new MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem(a2, Integer.valueOf(i), commonStat$TypeTrackCodeItem, new MobileOfficialAppsMiniappsStat$SessionUuidItem(rxi0.b(j)), num, arrayList, null, num2, 64, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0093  */
    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str, String str2, JSONObject jSONObject) {
        VkAppsErrors.ErrorTypes errorTypes;
        SchemeStat$VkbridgeErrorItem.Type type;
        SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem;
        j19 j19Var;
        boolean contains;
        String str3;
        JSONObject jSONObject2 = jSONObject;
        String str4 = null;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
            if (optJSONObject != null) {
                jSONObject2 = optJSONObject;
            }
            String optString = jSONObject2.optString("error_type");
            if (optString.length() > 0) {
                VkAppsErrors.ErrorTypes[] values = VkAppsErrors.ErrorTypes.values();
                int length = values.length;
                for (int i = 0; i < length; i++) {
                    errorTypes = values[i];
                    if (epx.f(errorTypes.h(), optString)) {
                        break;
                    }
                }
            }
            errorTypes = null;
            if (errorTypes != null) {
                int i2 = a.$EnumSwitchMapping$1[errorTypes.ordinal()];
                if (i2 == 1) {
                    type = SchemeStat$VkbridgeErrorItem.Type.API_ERROR;
                } else if (i2 == 2) {
                    type = SchemeStat$VkbridgeErrorItem.Type.CLIENT_ERROR;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type = SchemeStat$VkbridgeErrorItem.Type.AUTH_ERROR;
                }
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("error_data");
                schemeStat$VkbridgeErrorItem = new SchemeStat$VkbridgeErrorItem(type, optJSONObject2 != null ? optJSONObject2.optInt("error_code", VkAppsErrors.Client.UNKNOWN_ERROR.h()) : VkAppsErrors.Client.UNKNOWN_ERROR.h());
                long j = this.a;
                int i3 = (int) j;
                boolean z = schemeStat$VkbridgeErrorItem == null;
                rxi0.a.getClass();
                String b = rxi0.b(j);
                j19Var = this.f;
                if (j19Var.c) {
                    j19Var.b = j19Var.a();
                    j19Var.c = false;
                }
                contains = j19Var.b.contains(str);
                if (str2 != null && str2.length() != 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        jSONObject3.remove(CommonUrlParts.REQUEST_ID);
                        str3 = jSONObject3.toString();
                    } catch (JSONException unused) {
                        str3 = null;
                    }
                    if (contains && str3 != null && str3.length() != 0 && str3.length() <= 256) {
                        str4 = str3;
                    }
                }
                n(SchemeStat$TypeVkBridge.a(SchemeStat$TypeVkBridge.a.a(str, Integer.valueOf(i3), this.b, Boolean.valueOf(z), schemeStat$VkbridgeErrorItem, str4, this.c, b, null, 576), SchemeStat$TypeVkBridge.Type.TYPE_VK_BRIDGE_COMMON_ITEM));
            }
        }
        schemeStat$VkbridgeErrorItem = null;
        long j2 = this.a;
        int i32 = (int) j2;
        if (schemeStat$VkbridgeErrorItem == null) {
        }
        rxi0.a.getClass();
        String b2 = rxi0.b(j2);
        j19Var = this.f;
        if (j19Var.c) {
        }
        contains = j19Var.b.contains(str);
        if (str2 != null) {
            JSONObject jSONObject32 = new JSONObject(str2);
            jSONObject32.remove(CommonUrlParts.REQUEST_ID);
            str3 = jSONObject32.toString();
            if (contains) {
                str4 = str3;
            }
        }
        n(SchemeStat$TypeVkBridge.a(SchemeStat$TypeVkBridge.a.a(str, Integer.valueOf(i32), this.b, Boolean.valueOf(z), schemeStat$VkbridgeErrorItem, str4, this.c, b2, null, 576), SchemeStat$TypeVkBridge.Type.TYPE_VK_BRIDGE_COMMON_ITEM));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void j(VkBridgeAnalytics.InstallScreenEvent installScreenEvent) {
        MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen.EventType eventType;
        int i = a.$EnumSwitchMapping$4[installScreenEvent.ordinal()];
        if (i == 1) {
            eventType = MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen.EventType.OPEN;
        } else if (i == 2) {
            eventType = MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen.EventType.CLOSE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen.EventType.LAUNCH_APP;
        }
        long j = this.a;
        n(new MobileOfficialAppsMiniappsStat$TypeMiniAppsInstallScreen(eventType, new MobileOfficialAppsMiniappsStat$AppIdItem(Long.valueOf(j)), new SchemeStat$EventItem(SchemeStat$EventItem.Type.GAME, Long.valueOf(j), null, this.b, this.c, null, 36, null)));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void k(String str, AppShareType appShareType) {
        SchemeStat$TypeVkBridgeShareItem.ShareType shareType;
        switch (a.$EnumSwitchMapping$0[appShareType.ordinal()]) {
            case 1:
                shareType = SchemeStat$TypeVkBridgeShareItem.ShareType.POST;
                break;
            case 2:
                shareType = SchemeStat$TypeVkBridgeShareItem.ShareType.QR;
                break;
            case 3:
                shareType = SchemeStat$TypeVkBridgeShareItem.ShareType.STORY;
                break;
            case 4:
                shareType = SchemeStat$TypeVkBridgeShareItem.ShareType.MESSAGE;
                break;
            case 5:
                shareType = SchemeStat$TypeVkBridgeShareItem.ShareType.COPY_LINK;
                break;
            case 6:
                shareType = SchemeStat$TypeVkBridgeShareItem.ShareType.OTHER;
                break;
            case 7:
                shareType = SchemeStat$TypeVkBridgeShareItem.ShareType.CREATE_CHAT;
                break;
            case 8:
                shareType = SchemeStat$TypeVkBridgeShareItem.ShareType.WALL;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        SchemeStat$TypeVkBridgeShareItem schemeStat$TypeVkBridgeShareItem = new SchemeStat$TypeVkBridgeShareItem(shareType);
        n(SchemeStat$TypeVkBridge.a.a(str, Integer.valueOf((int) this.a), this.b, Boolean.TRUE, null, null, null, null, schemeStat$TypeVkBridgeShareItem, 496));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void l(VkBridgeAnalytics.PersonalDiscountEvent personalDiscountEvent, BannerType bannerType) {
        MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event event;
        switch (kfu0.a.$EnumSwitchMapping$1[personalDiscountEvent.ordinal()]) {
            case 1:
                event = MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event.OPEN_SNACK_BAR_PROMO;
                break;
            case 2:
                event = MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event.VIEW_PROMO_MODAL;
                break;
            case 3:
                event = MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event.HIDE_PROMO_MODAL;
                break;
            case 4:
                event = MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event.OPEN_TAB_MODAL_PURCHASE;
                break;
            case 5:
                event = MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event.OPEN_TAB_MENU_PURCHASE;
                break;
            case 6:
                event = MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event.OPEN_TAB_PROFILE_PURCHASE;
                break;
            case 7:
                event = MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.Event.CLICK_RULES_BUTTON;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        n(new MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount(event, o(bannerType), null, null, null, null, 60, null));
    }

    @Override // com.vk.superapp.navigation.api.VkBridgeAnalytics
    public final void m(VkBridgeAnalytics.ExitGameAlertEvent exitGameAlertEvent, Integer num) {
        MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem.Event a2 = kfu0.a(exitGameAlertEvent);
        long j = this.a;
        Integer valueOf = Integer.valueOf((int) j);
        String str = this.c;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = str != null ? new CommonStat$TypeTrackCodeItem(str) : null;
        rxi0.a.getClass();
        n(new MobileOfficialAppsMiniappsStat$TypeMiniAppsCloseConfirmationAlertItem(a2, valueOf, commonStat$TypeTrackCodeItem, new MobileOfficialAppsMiniappsStat$SessionUuidItem(rxi0.b(j)), num, null, null, null, 224, null));
    }

    public final void n(SchemeStat$TypeAction.b bVar) {
        new lfu0(this.e ? MobileOfficialAppsCoreNavStat$EventScreen.GAME : MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP, SchemeStat$TypeAction.a.b(null, null, bVar, 3)).q();
    }
}
