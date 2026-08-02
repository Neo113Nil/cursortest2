package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lcom/ybsdk/rconfig/DashboardSkinSelection;", "", "", "action", "", "products", "", BackendConfig.Restrictions.ENABLED, "", "visitsBetweenOnboardingAnimation", "<init>", "(Ljava/lang/String;Ljava/util/List;ZI)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/util/List;ZI)Lcom/ybsdk/rconfig/DashboardSkinSelection;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "Ljava/util/List;", "getProducts", "Z", "getEnabled", CA20Status.STATUS_USER_I, "getVisitsBetweenOnboardingAnimation", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DashboardSkinSelection {

    @Json(name = "action")
    private final String action;

    @Json(name = "is_enabled")
    private final boolean enabled;

    @Json(name = "products")
    private final List<String> products;

    @Json(name = "visits_between_onboarding_animation")
    private final int visitsBetweenOnboardingAnimation;

    public DashboardSkinSelection(String str, List<String> list, boolean z, int i) {
        this.action = str;
        this.products = list;
        this.enabled = z;
        this.visitsBetweenOnboardingAnimation = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardSkinSelection copy$default(DashboardSkinSelection dashboardSkinSelection, String str, List list, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dashboardSkinSelection.action;
        }
        if ((i2 & 2) != 0) {
            list = dashboardSkinSelection.products;
        }
        if ((i2 & 4) != 0) {
            z = dashboardSkinSelection.enabled;
        }
        if ((i2 & 8) != 0) {
            i = dashboardSkinSelection.visitsBetweenOnboardingAnimation;
        }
        return dashboardSkinSelection.copy(str, list, z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final List<String> component2() {
        return this.products;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVisitsBetweenOnboardingAnimation() {
        return this.visitsBetweenOnboardingAnimation;
    }

    public final DashboardSkinSelection copy(String action, List<String> products, boolean enabled, int visitsBetweenOnboardingAnimation) {
        return new DashboardSkinSelection(action, products, enabled, visitsBetweenOnboardingAnimation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardSkinSelection)) {
            return false;
        }
        DashboardSkinSelection dashboardSkinSelection = (DashboardSkinSelection) other;
        return jl40.l(this.action, dashboardSkinSelection.action) && jl40.l(this.products, dashboardSkinSelection.products) && this.enabled == dashboardSkinSelection.enabled && this.visitsBetweenOnboardingAnimation == dashboardSkinSelection.visitsBetweenOnboardingAnimation;
    }

    public final String getAction() {
        return this.action;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final int getVisitsBetweenOnboardingAnimation() {
        return this.visitsBetweenOnboardingAnimation;
    }

    public int hashCode() {
        return Integer.hashCode(this.visitsBetweenOnboardingAnimation) + unr0.e(unr0.c(this.action.hashCode() * 31, 31, this.products), 31, this.enabled);
    }

    public String toString() {
        String str = this.action;
        List<String> list = this.products;
        boolean z = this.enabled;
        int i = this.visitsBetweenOnboardingAnimation;
        StringBuilder r = xvz.r("DashboardSkinSelection(action=", str, ", products=", list, ", enabled=");
        r.append(z);
        r.append(", visitsBetweenOnboardingAnimation=");
        r.append(i);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
