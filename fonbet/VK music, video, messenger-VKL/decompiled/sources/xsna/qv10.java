package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$NetworkInfo;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;

/* compiled from: MediaRequestMetric.kt */
/* loaded from: classes3.dex */
public final class qv10 {
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final SchemeStat$TypeNetworkImagesItem.Protocol f;
    public final String g;
    public final int h;
    public final Integer i;
    public final MobileOfficialAppsCoreDeviceStat$NetworkInfo j;
    public final int k;

    /* compiled from: MediaRequestMetric.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemeStat$TypeNetworkImagesItem.Protocol.values().length];
            try {
                iArr[SchemeStat$TypeNetworkImagesItem.Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStat$TypeNetworkImagesItem.Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SchemeStat$TypeNetworkImagesItem.Protocol.H2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SchemeStat$TypeNetworkImagesItem.Protocol.QUIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qv10(String str, long j, int i, int i2, int i3, SchemeStat$TypeNetworkImagesItem.Protocol protocol, String str2, int i4, Integer num, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, int i5) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = protocol;
        this.g = str2;
        this.h = i4;
        this.i = num;
        this.j = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        this.k = i5;
    }
}
