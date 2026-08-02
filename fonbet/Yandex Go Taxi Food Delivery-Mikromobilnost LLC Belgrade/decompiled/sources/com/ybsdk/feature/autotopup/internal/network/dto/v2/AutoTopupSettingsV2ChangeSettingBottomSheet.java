package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ChangeSettingBottomSheet;", "", "title", "", "subtitle", "buttonsGroup", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ButtonsGroup;", "editFields", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2EditField;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ButtonsGroup;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getButtonsGroup", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ButtonsGroup;", "getEditFields", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2ChangeSettingBottomSheet {
    private final AutoTopupSettingsV2ButtonsGroup buttonsGroup;
    private final List<AutoTopupSettingsV2EditField> editFields;
    private final String subtitle;
    private final String title;

    public AutoTopupSettingsV2ChangeSettingBottomSheet(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "buttons_group") AutoTopupSettingsV2ButtonsGroup autoTopupSettingsV2ButtonsGroup, @Json(name = "edit_fields") List<AutoTopupSettingsV2EditField> list) {
        this.title = str;
        this.subtitle = str2;
        this.buttonsGroup = autoTopupSettingsV2ButtonsGroup;
        this.editFields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoTopupSettingsV2ChangeSettingBottomSheet copy$default(AutoTopupSettingsV2ChangeSettingBottomSheet autoTopupSettingsV2ChangeSettingBottomSheet, String str, String str2, AutoTopupSettingsV2ButtonsGroup autoTopupSettingsV2ButtonsGroup, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupSettingsV2ChangeSettingBottomSheet.title;
        }
        if ((i & 2) != 0) {
            str2 = autoTopupSettingsV2ChangeSettingBottomSheet.subtitle;
        }
        if ((i & 4) != 0) {
            autoTopupSettingsV2ButtonsGroup = autoTopupSettingsV2ChangeSettingBottomSheet.buttonsGroup;
        }
        if ((i & 8) != 0) {
            list = autoTopupSettingsV2ChangeSettingBottomSheet.editFields;
        }
        return autoTopupSettingsV2ChangeSettingBottomSheet.copy(str, str2, autoTopupSettingsV2ButtonsGroup, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupSettingsV2ButtonsGroup getButtonsGroup() {
        return this.buttonsGroup;
    }

    public final List<AutoTopupSettingsV2EditField> component4() {
        return this.editFields;
    }

    public final AutoTopupSettingsV2ChangeSettingBottomSheet copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "buttons_group") AutoTopupSettingsV2ButtonsGroup buttonsGroup, @Json(name = "edit_fields") List<AutoTopupSettingsV2EditField> editFields) {
        return new AutoTopupSettingsV2ChangeSettingBottomSheet(title, subtitle, buttonsGroup, editFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2ChangeSettingBottomSheet)) {
            return false;
        }
        AutoTopupSettingsV2ChangeSettingBottomSheet autoTopupSettingsV2ChangeSettingBottomSheet = (AutoTopupSettingsV2ChangeSettingBottomSheet) other;
        return jl40.l(this.title, autoTopupSettingsV2ChangeSettingBottomSheet.title) && jl40.l(this.subtitle, autoTopupSettingsV2ChangeSettingBottomSheet.subtitle) && jl40.l(this.buttonsGroup, autoTopupSettingsV2ChangeSettingBottomSheet.buttonsGroup) && jl40.l(this.editFields, autoTopupSettingsV2ChangeSettingBottomSheet.editFields);
    }

    public final AutoTopupSettingsV2ButtonsGroup getButtonsGroup() {
        return this.buttonsGroup;
    }

    public final List<AutoTopupSettingsV2EditField> getEditFields() {
        return this.editFields;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.editFields.hashCode() + ((this.buttonsGroup.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.subtitle)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AutoTopupSettingsV2ButtonsGroup autoTopupSettingsV2ButtonsGroup = this.buttonsGroup;
        List<AutoTopupSettingsV2EditField> list = this.editFields;
        StringBuilder v = b64.v("AutoTopupSettingsV2ChangeSettingBottomSheet(title=", str, ", subtitle=", str2, ", buttonsGroup=");
        v.append(autoTopupSettingsV2ButtonsGroup);
        v.append(", editFields=");
        v.append(list);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
