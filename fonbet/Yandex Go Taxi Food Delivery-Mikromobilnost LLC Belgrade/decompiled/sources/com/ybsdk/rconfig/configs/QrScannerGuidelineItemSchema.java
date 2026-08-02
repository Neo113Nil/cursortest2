package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.text.Text;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrScannerGuidelineItemSchema;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "text", "Lcom/ybsdk/core/utils/text/Text;", "action", "guidelineType", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getText", "()Lcom/ybsdk/core/utils/text/Text;", "getAction", "()Ljava/lang/String;", "getGuidelineType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrScannerGuidelineItemSchema {

    @Json(name = "action")
    private final String action;

    @Json(name = "guideline_type")
    private final String guidelineType;

    @Json(name = "image")
    private final ThemedParameter<String> image;

    @Json(name = "text")
    private final Text text;

    public QrScannerGuidelineItemSchema(ThemedParameter<String> themedParameter, Text text, String str, String str2) {
        this.image = themedParameter;
        this.text = text;
        this.action = str;
        this.guidelineType = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QrScannerGuidelineItemSchema copy$default(QrScannerGuidelineItemSchema qrScannerGuidelineItemSchema, ThemedParameter themedParameter, Text text, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = qrScannerGuidelineItemSchema.image;
        }
        if ((i & 2) != 0) {
            text = qrScannerGuidelineItemSchema.text;
        }
        if ((i & 4) != 0) {
            str = qrScannerGuidelineItemSchema.action;
        }
        if ((i & 8) != 0) {
            str2 = qrScannerGuidelineItemSchema.guidelineType;
        }
        return qrScannerGuidelineItemSchema.copy(themedParameter, text, str, str2);
    }

    public final ThemedParameter<String> component1() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getGuidelineType() {
        return this.guidelineType;
    }

    public final QrScannerGuidelineItemSchema copy(ThemedParameter<String> image, Text text, String action, String guidelineType) {
        return new QrScannerGuidelineItemSchema(image, text, action, guidelineType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrScannerGuidelineItemSchema)) {
            return false;
        }
        QrScannerGuidelineItemSchema qrScannerGuidelineItemSchema = (QrScannerGuidelineItemSchema) other;
        return jl40.l(this.image, qrScannerGuidelineItemSchema.image) && jl40.l(this.text, qrScannerGuidelineItemSchema.text) && jl40.l(this.action, qrScannerGuidelineItemSchema.action) && jl40.l(this.guidelineType, qrScannerGuidelineItemSchema.guidelineType);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getGuidelineType() {
        return this.guidelineType;
    }

    public final ThemedParameter<String> getImage() {
        return this.image;
    }

    public final Text getText() {
        return this.text;
    }

    public int hashCode() {
        int b = unr0.b(n.c(this.text, this.image.hashCode() * 31, 31), 31, this.action);
        String str = this.guidelineType;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ThemedParameter<String> themedParameter = this.image;
        Text text = this.text;
        String str = this.action;
        String str2 = this.guidelineType;
        StringBuilder sb = new StringBuilder("QrScannerGuidelineItemSchema(image=");
        sb.append(themedParameter);
        sb.append(", text=");
        sb.append(text);
        sb.append(", action=");
        return g8e.r(sb, str, ", guidelineType=", str2, Extension.C_BRAKE);
    }
}
