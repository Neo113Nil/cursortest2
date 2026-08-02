package com.ybsdk.rconfig.configs;

import android.net.Uri;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$DashboardTopButton$Type;
import com.ybsdk.rconfig.model.ThemedImage;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.ccv;
import defpackage.dcv;
import defpackage.fob1;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jo01;
import defpackage.kv01;
import defpackage.pbv;
import defpackage.rbv;
import defpackage.rev;
import defpackage.unr0;
import defpackage.vfv;
import defpackage.w511;
import defpackage.zp01;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J<\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersDashboardQrButton;", "", "Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsType;", "type", "Lcom/ybsdk/rconfig/model/ThemedImage;", "image", "", "text", "action", "<init>", "(Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsType;Lcom/ybsdk/rconfig/model/ThemedImage;Ljava/lang/String;Ljava/lang/String;)V", "tokenizationAction", "Ljo01;", "toEntity", "(Ljava/lang/String;)Ljo01;", "component1", "()Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsType;", "component2", "()Lcom/ybsdk/rconfig/model/ThemedImage;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsType;Lcom/ybsdk/rconfig/model/ThemedImage;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/TransfersDashboardQrButton;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsType;", "getType", "Lcom/ybsdk/rconfig/model/ThemedImage;", "getImage", "Ljava/lang/String;", "getText", "getAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransfersDashboardQrButton {

    @Json(name = "action")
    private final String action;

    @Json(name = "image")
    private final ThemedImage image;

    @Json(name = "text")
    private final String text;

    @Json(name = "type")
    private final TransfersDashboardTopButtonsType type;

    public TransfersDashboardQrButton(TransfersDashboardTopButtonsType transfersDashboardTopButtonsType, ThemedImage themedImage, String str, String str2) {
        this.type = transfersDashboardTopButtonsType;
        this.image = themedImage;
        this.text = str;
        this.action = str2;
    }

    public static /* synthetic */ TransfersDashboardQrButton copy$default(TransfersDashboardQrButton transfersDashboardQrButton, TransfersDashboardTopButtonsType transfersDashboardTopButtonsType, ThemedImage themedImage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            transfersDashboardTopButtonsType = transfersDashboardQrButton.type;
        }
        if ((i & 2) != 0) {
            themedImage = transfersDashboardQrButton.image;
        }
        if ((i & 4) != 0) {
            str = transfersDashboardQrButton.text;
        }
        if ((i & 8) != 0) {
            str2 = transfersDashboardQrButton.action;
        }
        return transfersDashboardQrButton.copy(transfersDashboardTopButtonsType, themedImage, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbv toEntity$lambda$0(String str) {
        return new pbv(str, (ccv) null, rev.i, (dcv) null, (vfv) null, 58);
    }

    /* renamed from: component1, reason: from getter */
    public final TransfersDashboardTopButtonsType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedImage getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final TransfersDashboardQrButton copy(TransfersDashboardTopButtonsType type, ThemedImage image, String text, String action) {
        return new TransfersDashboardQrButton(type, image, text, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersDashboardQrButton)) {
            return false;
        }
        TransfersDashboardQrButton transfersDashboardQrButton = (TransfersDashboardQrButton) other;
        return this.type == transfersDashboardQrButton.type && jl40.l(this.image, transfersDashboardQrButton.image) && jl40.l(this.text, transfersDashboardQrButton.text) && jl40.l(this.action, transfersDashboardQrButton.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final ThemedImage getImage() {
        return this.image;
    }

    public final String getText() {
        return this.text;
    }

    public final TransfersDashboardTopButtonsType getType() {
        return this.type;
    }

    public int hashCode() {
        TransfersDashboardTopButtonsType transfersDashboardTopButtonsType = this.type;
        int hashCode = (transfersDashboardTopButtonsType == null ? 0 : transfersDashboardTopButtonsType.hashCode()) * 31;
        ThemedImage themedImage = this.image;
        return this.action.hashCode() + unr0.b((hashCode + (themedImage != null ? themedImage.hashCode() : 0)) * 31, 31, this.text);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jo01 toEntity(String tokenizationAction) {
        Uri uri;
        int i;
        Text.Constant i2 = g8e.i(Text.Companion, this.text);
        ThemedImage themedImage = this.image;
        TransferRemoteConfig$DashboardTopButton$Type transferRemoteConfig$DashboardTopButton$Type = null;
        String light = themedImage != null ? themedImage.getLight() : null;
        ThemedImage themedImage2 = this.image;
        YbButtonView.a aVar = new YbButtonView.a(i2, null, fob1.c(light, themedImage2 != null ? themedImage2.getDark() : null, new zp01(11)), null, null, null, null, false, false, null, 4090);
        Uri parse = Uri.parse(this.action);
        if (tokenizationAction != null) {
            if (this.type != TransfersDashboardTopButtonsType.NFC) {
                tokenizationAction = null;
            }
            if (tokenizationAction != null) {
                uri = Uri.parse(tokenizationAction);
                TransfersDashboardTopButtonsType transfersDashboardTopButtonsType = this.type;
                i = transfersDashboardTopButtonsType != null ? -1 : kv01.a[transfersDashboardTopButtonsType.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        transferRemoteConfig$DashboardTopButton$Type = TransferRemoteConfig$DashboardTopButton$Type.NFC;
                    } else {
                        if (i != 2) {
                            w511.b();
                            return null;
                        }
                        transferRemoteConfig$DashboardTopButton$Type = TransferRemoteConfig$DashboardTopButton$Type.REVERSE_QR;
                    }
                }
                return new jo01(aVar, parse, uri, transferRemoteConfig$DashboardTopButton$Type);
            }
        }
        uri = null;
        TransfersDashboardTopButtonsType transfersDashboardTopButtonsType2 = this.type;
        if (transfersDashboardTopButtonsType2 != null) {
        }
        if (i != -1) {
        }
        return new jo01(aVar, parse, uri, transferRemoteConfig$DashboardTopButton$Type);
    }

    public String toString() {
        TransfersDashboardTopButtonsType transfersDashboardTopButtonsType = this.type;
        ThemedImage themedImage = this.image;
        String str = this.text;
        String str2 = this.action;
        StringBuilder sb = new StringBuilder("TransfersDashboardQrButton(type=");
        sb.append(transfersDashboardTopButtonsType);
        sb.append(", image=");
        sb.append(themedImage);
        sb.append(", text=");
        return g8e.r(sb, str, ", action=", str2, Extension.C_BRAKE);
    }
}
