package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/rconfig/configs/CustomInsetsHandlingConfig;", "", "", "isNewFragmentInsetsHandlingEnabled", "", "", "newFragmentInsetsHandlingBlackList", "isNewBottomSheetInsetsHandlingEnabled", "<init>", "(ZLjava/util/List;Z)V", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "copy", "(ZLjava/util/List;Z)Lcom/ybsdk/rconfig/configs/CustomInsetsHandlingConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/util/List;", "getNewFragmentInsetsHandlingBlackList", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CustomInsetsHandlingConfig {

    @Json(name = "is_new_bottom_sheet_insets_handling_enabled")
    private final boolean isNewBottomSheetInsetsHandlingEnabled;

    @Json(name = "is_new_fragment_insets_handling_enabled")
    private final boolean isNewFragmentInsetsHandlingEnabled;

    @Json(name = "new_fragment_insets_handling_black_list")
    private final List<String> newFragmentInsetsHandlingBlackList;

    public CustomInsetsHandlingConfig(boolean z, List<String> list, boolean z2) {
        this.isNewFragmentInsetsHandlingEnabled = z;
        this.newFragmentInsetsHandlingBlackList = list;
        this.isNewBottomSheetInsetsHandlingEnabled = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomInsetsHandlingConfig copy$default(CustomInsetsHandlingConfig customInsetsHandlingConfig, boolean z, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = customInsetsHandlingConfig.isNewFragmentInsetsHandlingEnabled;
        }
        if ((i & 2) != 0) {
            list = customInsetsHandlingConfig.newFragmentInsetsHandlingBlackList;
        }
        if ((i & 4) != 0) {
            z2 = customInsetsHandlingConfig.isNewBottomSheetInsetsHandlingEnabled;
        }
        return customInsetsHandlingConfig.copy(z, list, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNewFragmentInsetsHandlingEnabled() {
        return this.isNewFragmentInsetsHandlingEnabled;
    }

    public final List<String> component2() {
        return this.newFragmentInsetsHandlingBlackList;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNewBottomSheetInsetsHandlingEnabled() {
        return this.isNewBottomSheetInsetsHandlingEnabled;
    }

    public final CustomInsetsHandlingConfig copy(boolean isNewFragmentInsetsHandlingEnabled, List<String> newFragmentInsetsHandlingBlackList, boolean isNewBottomSheetInsetsHandlingEnabled) {
        return new CustomInsetsHandlingConfig(isNewFragmentInsetsHandlingEnabled, newFragmentInsetsHandlingBlackList, isNewBottomSheetInsetsHandlingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomInsetsHandlingConfig)) {
            return false;
        }
        CustomInsetsHandlingConfig customInsetsHandlingConfig = (CustomInsetsHandlingConfig) other;
        return this.isNewFragmentInsetsHandlingEnabled == customInsetsHandlingConfig.isNewFragmentInsetsHandlingEnabled && jl40.l(this.newFragmentInsetsHandlingBlackList, customInsetsHandlingConfig.newFragmentInsetsHandlingBlackList) && this.isNewBottomSheetInsetsHandlingEnabled == customInsetsHandlingConfig.isNewBottomSheetInsetsHandlingEnabled;
    }

    public final List<String> getNewFragmentInsetsHandlingBlackList() {
        return this.newFragmentInsetsHandlingBlackList;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNewBottomSheetInsetsHandlingEnabled) + unr0.c(Boolean.hashCode(this.isNewFragmentInsetsHandlingEnabled) * 31, 31, this.newFragmentInsetsHandlingBlackList);
    }

    public final boolean isNewBottomSheetInsetsHandlingEnabled() {
        return this.isNewBottomSheetInsetsHandlingEnabled;
    }

    public final boolean isNewFragmentInsetsHandlingEnabled() {
        return this.isNewFragmentInsetsHandlingEnabled;
    }

    public String toString() {
        boolean z = this.isNewFragmentInsetsHandlingEnabled;
        List<String> list = this.newFragmentInsetsHandlingBlackList;
        boolean z2 = this.isNewBottomSheetInsetsHandlingEnabled;
        StringBuilder sb = new StringBuilder("CustomInsetsHandlingConfig(isNewFragmentInsetsHandlingEnabled=");
        sb.append(z);
        sb.append(", newFragmentInsetsHandlingBlackList=");
        sb.append(list);
        sb.append(", isNewBottomSheetInsetsHandlingEnabled=");
        return x4e.i(sb, z2, Extension.C_BRAKE);
    }
}
