package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Button;", "", "text", "", "actions", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getActions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2Button {
    private final List<String> actions;
    private final String text;

    public AutoTopupSettingsV2Button(@Json(name = "text") String str, @Json(name = "actions") List<String> list) {
        this.text = str;
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoTopupSettingsV2Button copy$default(AutoTopupSettingsV2Button autoTopupSettingsV2Button, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupSettingsV2Button.text;
        }
        if ((i & 2) != 0) {
            list = autoTopupSettingsV2Button.actions;
        }
        return autoTopupSettingsV2Button.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<String> component2() {
        return this.actions;
    }

    public final AutoTopupSettingsV2Button copy(@Json(name = "text") String text, @Json(name = "actions") List<String> actions) {
        return new AutoTopupSettingsV2Button(text, actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2Button)) {
            return false;
        }
        AutoTopupSettingsV2Button autoTopupSettingsV2Button = (AutoTopupSettingsV2Button) other;
        return jl40.l(this.text, autoTopupSettingsV2Button.text) && jl40.l(this.actions, autoTopupSettingsV2Button.actions);
    }

    public final List<String> getActions() {
        return this.actions;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        List<String> list = this.actions;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return nnm.h("AutoTopupSettingsV2Button(text=", this.text, ", actions=", Extension.C_BRAKE, this.actions);
    }
}
