package xsna;

import com.vk.core.utils.newtork.NetworkState;
import com.vk.stat.scheme.CommonCoreNetworkStat$NetworkEffectiveType;
import com.vk.stat.scheme.CommonCoreNetworkStat$NetworkType;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$NetworkInfo;
import com.vk.stat.scheme.SchemeStat$TypeNetworkCommon;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NetworkConverters.kt */
/* loaded from: classes3.dex */
public final class x260 {

    /* compiled from: NetworkConverters.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemeStat$TypeNetworkCommon.NetworkType.values().length];
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.EDGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.GPRS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.LTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.EHRPD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.HSDPA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.HSUPA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.CDMA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.CDMAEVDOREV0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.CDMAEVDOREVA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.CDMAEVDOREVB.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.WCDMA_UMTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.NR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SchemeStat$TypeNetworkCommon.NetworkType.OTHER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CommonCoreNetworkStat$NetworkEffectiveType a(NetworkState networkState) {
        Integer num = (Integer) j5g.Z(networkState.b);
        if ((num != null && num.intValue() == 1) || num == null || num.intValue() != 0) {
            return null;
        }
        int i = networkState.c;
        if (i != 8 && i != 9) {
            if (i == 20) {
                return CommonCoreNetworkStat$NetworkEffectiveType.TYPE_5G;
            }
            switch (i) {
                case 1:
                    return CommonCoreNetworkStat$NetworkEffectiveType.SLOW_2G;
                case 2:
                    return CommonCoreNetworkStat$NetworkEffectiveType.TYPE_2G;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (i) {
                    }
                    return null;
            }
        }
        return CommonCoreNetworkStat$NetworkEffectiveType.TYPE_3G;
    }

    public static final MobileOfficialAppsCoreDeviceStat$NetworkInfo b(NetworkState networkState) {
        Integer num = (Integer) j5g.Z(networkState.b);
        if (num != null && num.intValue() == 1) {
            return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.WIFI, null);
        }
        if (num == null || num.intValue() != 0) {
            return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.UNKNOWN, null);
        }
        int i = networkState.c;
        if (i == 8) {
            return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.HSDPA, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G);
        }
        if (i == 9) {
            return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.HSUPA, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G);
        }
        if (i == 20) {
            return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.NR, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_5G);
        }
        switch (i) {
            case 1:
                return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.GPRS, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.SLOW_2G);
            case 2:
                return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.EDGE, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_2G);
            case 3:
                return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.WCDMA_UMTS, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G);
            case 4:
                return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.CDMA, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G);
            case 5:
                return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.CDMAEVDOREV0, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G);
            case 6:
                return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.CDMAEVDOREVA, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G);
            default:
                switch (i) {
                    case 12:
                        return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.CDMAEVDOREVB, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G);
                    case 13:
                        return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.LTE, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_4G);
                    case 14:
                        return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.EHRPD, MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G);
                    default:
                        return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.OTHER, null);
                }
        }
    }

    public static final MobileOfficialAppsCoreDeviceStat$NetworkInfo c(SchemeStat$TypeNetworkCommon.NetworkType networkType) {
        MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType networkType2;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType networkEffectiveType;
        int[] iArr = a.$EnumSwitchMapping$0;
        switch (iArr[networkType.ordinal()]) {
            case 1:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.WIFI;
                break;
            case 2:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.EDGE;
                break;
            case 3:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.GPRS;
                break;
            case 4:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.LTE;
                break;
            case 5:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.EHRPD;
                break;
            case 6:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.HSDPA;
                break;
            case 7:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.HSUPA;
                break;
            case 8:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.CDMA;
                break;
            case 9:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.CDMAEVDOREV0;
                break;
            case 10:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.CDMAEVDOREVA;
                break;
            case 11:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.CDMAEVDOREVB;
                break;
            case 12:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.WCDMA_UMTS;
                break;
            case 13:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.NR;
                break;
            case 14:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.UNKNOWN;
                break;
            case 15:
                networkType2 = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkType.OTHER;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[networkType.ordinal()]) {
            case 1:
            case 14:
            case 15:
                networkEffectiveType = null;
                break;
            case 2:
                networkEffectiveType = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_2G;
                break;
            case 3:
                networkEffectiveType = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.SLOW_2G;
                break;
            case 4:
                networkEffectiveType = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_4G;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                networkEffectiveType = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_3G;
                break;
            case 13:
                networkEffectiveType = MobileOfficialAppsCoreDeviceStat$NetworkInfo.NetworkEffectiveType.TYPE_5G;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new MobileOfficialAppsCoreDeviceStat$NetworkInfo(networkType2, networkEffectiveType);
    }

    public static final CommonCoreNetworkStat$NetworkType d(NetworkState networkState) {
        Integer num = (Integer) j5g.Z(networkState.b);
        if (num != null && num.intValue() == 1) {
            return CommonCoreNetworkStat$NetworkType.WIFI;
        }
        if (num == null || num.intValue() != 0) {
            return CommonCoreNetworkStat$NetworkType.UNKNOWN;
        }
        int i = networkState.c;
        if (i == 8) {
            return CommonCoreNetworkStat$NetworkType.HSDPA;
        }
        if (i == 9) {
            return CommonCoreNetworkStat$NetworkType.HSUPA;
        }
        if (i == 20) {
            return CommonCoreNetworkStat$NetworkType.NR;
        }
        switch (i) {
            case 1:
                return CommonCoreNetworkStat$NetworkType.GPRS;
            case 2:
                return CommonCoreNetworkStat$NetworkType.EDGE;
            case 3:
                return CommonCoreNetworkStat$NetworkType.WCDMA_UMTS;
            case 4:
                return CommonCoreNetworkStat$NetworkType.CDMA;
            case 5:
                return CommonCoreNetworkStat$NetworkType.CDMAEVDOREV0;
            case 6:
                return CommonCoreNetworkStat$NetworkType.CDMAEVDOREVA;
            default:
                switch (i) {
                    case 12:
                        return CommonCoreNetworkStat$NetworkType.CDMAEVDOREVB;
                    case 13:
                        return CommonCoreNetworkStat$NetworkType.LTE;
                    case 14:
                        return CommonCoreNetworkStat$NetworkType.EHRPD;
                    default:
                        return CommonCoreNetworkStat$NetworkType.OTHER;
                }
        }
    }
}
