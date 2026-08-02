package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.gw8;

/* compiled from: ClearCacheChooserDelegate.kt */
/* loaded from: classes15.dex */
public final class vhc {
    public final List<CacheTarget> a;
    public final gw8.c b;
    public final gx8 c;

    /* compiled from: ClearCacheChooserDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheTarget.values().length];
            try {
                iArr[CacheTarget.PHOTOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheTarget.VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheTarget.DOWNLOADS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheTarget.DOWNLOADED_VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CacheTarget.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CacheTarget.SYSTEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vhc(ListBuilder listBuilder, gw8.c cVar, gx8 gx8Var) {
        this.a = listBuilder;
        this.b = cVar;
        this.c = gx8Var;
    }
}
