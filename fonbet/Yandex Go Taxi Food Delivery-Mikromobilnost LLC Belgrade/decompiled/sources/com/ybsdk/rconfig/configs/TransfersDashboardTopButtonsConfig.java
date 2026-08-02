package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsConfig;", "", "", "Lcom/ybsdk/rconfig/configs/TransfersDashboardQrButton;", "buttons", "", "tokenizationAction", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getButtons", "Ljava/lang/String;", "getTokenizationAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransfersDashboardTopButtonsConfig {

    @Json(name = "buttons")
    private final List<TransfersDashboardQrButton> buttons;

    @Json(name = "tokenization_action")
    private final String tokenizationAction;

    public TransfersDashboardTopButtonsConfig(List<TransfersDashboardQrButton> list, String str) {
        this.buttons = list;
        this.tokenizationAction = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransfersDashboardTopButtonsConfig copy$default(TransfersDashboardTopButtonsConfig transfersDashboardTopButtonsConfig, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transfersDashboardTopButtonsConfig.buttons;
        }
        if ((i & 2) != 0) {
            str = transfersDashboardTopButtonsConfig.tokenizationAction;
        }
        return transfersDashboardTopButtonsConfig.copy(list, str);
    }

    public final List<TransfersDashboardQrButton> component1() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenizationAction() {
        return this.tokenizationAction;
    }

    public final TransfersDashboardTopButtonsConfig copy(List<TransfersDashboardQrButton> buttons, String tokenizationAction) {
        return new TransfersDashboardTopButtonsConfig(buttons, tokenizationAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersDashboardTopButtonsConfig)) {
            return false;
        }
        TransfersDashboardTopButtonsConfig transfersDashboardTopButtonsConfig = (TransfersDashboardTopButtonsConfig) other;
        return jl40.l(this.buttons, transfersDashboardTopButtonsConfig.buttons) && jl40.l(this.tokenizationAction, transfersDashboardTopButtonsConfig.tokenizationAction);
    }

    public final List<TransfersDashboardQrButton> getButtons() {
        return this.buttons;
    }

    public final String getTokenizationAction() {
        return this.tokenizationAction;
    }

    public int hashCode() {
        int hashCode = this.buttons.hashCode() * 31;
        String str = this.tokenizationAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return xvz.i("TransfersDashboardTopButtonsConfig(buttons=", ", tokenizationAction=", this.tokenizationAction, Extension.C_BRAKE, this.buttons);
    }
}
