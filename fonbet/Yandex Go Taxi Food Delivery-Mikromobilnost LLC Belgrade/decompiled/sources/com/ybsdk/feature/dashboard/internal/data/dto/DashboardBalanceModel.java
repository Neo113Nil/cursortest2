package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBalanceModel;", "", "title", "Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceItem;", "value", "subtitle", "<init>", "(Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceItem;Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceItem;Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceItem;)V", "getTitle", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceItem;", "getValue", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardBalanceModel {
    private final BalanceItem subtitle;
    private final BalanceItem title;
    private final BalanceItem value;

    public DashboardBalanceModel(@Json(name = "title") BalanceItem balanceItem, @Json(name = "value") BalanceItem balanceItem2, @Json(name = "subtitle") BalanceItem balanceItem3) {
        this.title = balanceItem;
        this.value = balanceItem2;
        this.subtitle = balanceItem3;
    }

    public static /* synthetic */ DashboardBalanceModel copy$default(DashboardBalanceModel dashboardBalanceModel, BalanceItem balanceItem, BalanceItem balanceItem2, BalanceItem balanceItem3, int i, Object obj) {
        if ((i & 1) != 0) {
            balanceItem = dashboardBalanceModel.title;
        }
        if ((i & 2) != 0) {
            balanceItem2 = dashboardBalanceModel.value;
        }
        if ((i & 4) != 0) {
            balanceItem3 = dashboardBalanceModel.subtitle;
        }
        return dashboardBalanceModel.copy(balanceItem, balanceItem2, balanceItem3);
    }

    /* renamed from: component1, reason: from getter */
    public final BalanceItem getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BalanceItem getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final BalanceItem getSubtitle() {
        return this.subtitle;
    }

    public final DashboardBalanceModel copy(@Json(name = "title") BalanceItem title, @Json(name = "value") BalanceItem value, @Json(name = "subtitle") BalanceItem subtitle) {
        return new DashboardBalanceModel(title, value, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardBalanceModel)) {
            return false;
        }
        DashboardBalanceModel dashboardBalanceModel = (DashboardBalanceModel) other;
        return jl40.l(this.title, dashboardBalanceModel.title) && jl40.l(this.value, dashboardBalanceModel.value) && jl40.l(this.subtitle, dashboardBalanceModel.subtitle);
    }

    public final BalanceItem getSubtitle() {
        return this.subtitle;
    }

    public final BalanceItem getTitle() {
        return this.title;
    }

    public final BalanceItem getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = (this.value.hashCode() + (this.title.hashCode() * 31)) * 31;
        BalanceItem balanceItem = this.subtitle;
        return hashCode + (balanceItem == null ? 0 : balanceItem.hashCode());
    }

    public String toString() {
        return "DashboardBalanceModel(title=" + this.title + ", value=" + this.value + ", subtitle=" + this.subtitle + Extension.C_BRAKE;
    }
}
