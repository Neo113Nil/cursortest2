package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.pushsdk.VkpnsPushConfig;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.MapBuilder;

/* compiled from: PushProviderSdkInitAnalyticsEvent.kt */
/* loaded from: classes.dex */
public final class eke0 extends BaseAnalyticsEvent {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final VkpnsPushConfig.BackgroundWorkMode g;
    public final int h;

    /* compiled from: PushProviderSdkInitAnalyticsEvent.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkpnsPushConfig.BackgroundWorkMode.values().length];
            try {
                iArr[VkpnsPushConfig.BackgroundWorkMode.SERVICE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkpnsPushConfig.BackgroundWorkMode.SERVICE_WITH_PERIODIC_WORKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public eke0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, VkpnsPushConfig.BackgroundWorkMode backgroundWorkMode, int i) {
        super("vkcm_sdk_master_init");
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = backgroundWorkMode;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eke0)) {
            return false;
        }
        eke0 eke0Var = (eke0) obj;
        return this.b == eke0Var.b && this.c == eke0Var.c && this.d == eke0Var.d && this.e == eke0Var.e && this.f == eke0Var.f && this.g == eke0Var.g && this.h == eke0Var.h;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        String str;
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.set(mapBuilder, "is_battery_permission_given", this.b);
        ExtensionsKt.set(mapBuilder, "is_master", this.c);
        ExtensionsKt.set(mapBuilder, "is_enabled", this.d);
        ExtensionsKt.set(mapBuilder, "is_first_launch", this.e);
        ExtensionsKt.set(mapBuilder, "was_disabled", this.f);
        int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
        if (i == 1) {
            str = "service";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "service_worker";
        }
        mapBuilder.put("work_mode", str);
        ExtensionsKt.set((Map<String, String>) mapBuilder, "app_standby_bucket", this.h);
        ExtensionsKt.set((Map<String, String>) mapBuilder, "is_deferred_service_start", false);
        return mapBuilder.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.d;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.e;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.f;
        return shy.a(this.h, (this.g.hashCode() + ((i8 + (z5 ? 1 : z5 ? 1 : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushProviderSdkInitAnalyticsEvent(isBatteryPermissionGiven=");
        sb.append(this.b);
        sb.append(", isMaster=");
        sb.append(this.c);
        sb.append(", isEnabled=");
        sb.append(this.d);
        sb.append(", isFirstLaunch=");
        sb.append(this.e);
        sb.append(", wasDisabled=");
        sb.append(this.f);
        sb.append(", workMode=");
        sb.append(this.g);
        sb.append(", appStandbyBucket=");
        return h5s.c(this.h, ", isDeferredServiceStart=false)", sb);
    }
}
