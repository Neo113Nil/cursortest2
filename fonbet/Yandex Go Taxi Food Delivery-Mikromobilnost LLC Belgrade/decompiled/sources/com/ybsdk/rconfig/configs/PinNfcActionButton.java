package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/rconfig/configs/PinNfcActionButton;", "", "", "title", "action", "Lcom/ybsdk/rconfig/model/ThemedImage;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/rconfig/model/ThemedImage;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/rconfig/model/ThemedImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/rconfig/model/ThemedImage;)Lcom/ybsdk/rconfig/configs/PinNfcActionButton;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getAction", "Lcom/ybsdk/rconfig/model/ThemedImage;", "getIcon", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PinNfcActionButton {

    @Json(name = "action")
    private final String action;

    @Json(name = "icon")
    private final ThemedImage icon;

    @Json(name = "title")
    private final String title;

    public PinNfcActionButton(String str, String str2, ThemedImage themedImage) {
        this.title = str;
        this.action = str2;
        this.icon = themedImage;
    }

    public static /* synthetic */ PinNfcActionButton copy$default(PinNfcActionButton pinNfcActionButton, String str, String str2, ThemedImage themedImage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinNfcActionButton.title;
        }
        if ((i & 2) != 0) {
            str2 = pinNfcActionButton.action;
        }
        if ((i & 4) != 0) {
            themedImage = pinNfcActionButton.icon;
        }
        return pinNfcActionButton.copy(str, str2, themedImage);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImage getIcon() {
        return this.icon;
    }

    public final PinNfcActionButton copy(String title, String action, ThemedImage icon) {
        return new PinNfcActionButton(title, action, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinNfcActionButton)) {
            return false;
        }
        PinNfcActionButton pinNfcActionButton = (PinNfcActionButton) other;
        return jl40.l(this.title, pinNfcActionButton.title) && jl40.l(this.action, pinNfcActionButton.action) && jl40.l(this.icon, pinNfcActionButton.icon);
    }

    public final String getAction() {
        return this.action;
    }

    public final ThemedImage getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.icon.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.action);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.action;
        ThemedImage themedImage = this.icon;
        StringBuilder v = b64.v("PinNfcActionButton(title=", str, ", action=", str2, ", icon=");
        v.append(themedImage);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
