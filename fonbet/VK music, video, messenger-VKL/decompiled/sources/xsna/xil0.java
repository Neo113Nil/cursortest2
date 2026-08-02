package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import com.vk.storeregion.StoreRegionProvider;
import java.util.Iterator;

/* compiled from: StoreRegionConcentrator.kt */
/* loaded from: classes11.dex */
public final class xil0 implements dyp<SchemeStat$TypeAppStarts> {

    /* compiled from: StoreRegionConcentrator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoreRegionProvider.Region.values().length];
            try {
                iArr[StoreRegionProvider.Region.RU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoreRegionProvider.Region.BY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoreRegionProvider.Region.KZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        StoreRegionProvider.Region region;
        Iterator it = e43.l("com.vk.dynamicregionimpl.ru.StoreRegionProviderImpl", "com.vk.dynamicregionimpl.by.StoreRegionProviderImpl", "com.vk.dynamicregionimpl.kz.StoreRegionProviderImpl").iterator();
        while (true) {
            if (!it.hasNext()) {
                L.e("StoreRegion: UNKNOWN");
                region = StoreRegionProvider.Region.UNKNOWN;
                break;
            }
            try {
                region = ((StoreRegionProvider) Class.forName((String) it.next()).getDeclaredConstructor(null).newInstance(null)).a();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"StoreRegion:", String.valueOf(region)});
                    break;
                }
                break;
            } catch (ClassNotFoundException unused) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"StoreRegion:", "try to load next region"});
                }
            } catch (Exception e) {
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{"StoreRegion:", cqi.b(e, new StringBuilder("something went wrong ex is "))});
                }
            }
        }
        int i = a.$EnumSwitchMapping$0[region.ordinal()];
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, i != 1 ? i != 2 ? i != 3 ? SchemeStat$TypeAppStarts.StoreRegion.UNKNOWN : SchemeStat$TypeAppStarts.StoreRegion.KZ : SchemeStat$TypeAppStarts.StoreRegion.BY : SchemeStat$TypeAppStarts.StoreRegion.RU, -1, -1, 524287);
    }
}
