package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.fob1;
import defpackage.hfg0;
import defpackage.jl40;
import defpackage.lo01;
import defpackage.mo01;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001#B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006$"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesConfigSchema;", "", "", "isEnabled", "", "minScreenHeightToShow", "Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchema;", "widget", "<init>", "(ZLjava/lang/Integer;Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchema;)V", "Lmo01;", "toEntity", "()Lmo01;", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchema;", "copy", "(ZLjava/lang/Integer;Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchema;)Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesConfigSchema;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/Integer;", "getMinScreenHeightToShow", "Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchema;", "getWidget", "Companion", "hfg0", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrScannerGuidelinesConfigSchema {
    public static final hfg0 Companion = new hfg0();
    public static final int MIN_SCREEN_HEIGHT_TO_SHOW_GUIDELINES = 680;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "min_screen_height_to_show")
    private final Integer minScreenHeightToShow;

    @Json(name = "widget")
    private final QrScannerGuidelinesWidgetSchema widget;

    public QrScannerGuidelinesConfigSchema(boolean z, Integer num, QrScannerGuidelinesWidgetSchema qrScannerGuidelinesWidgetSchema) {
        this.isEnabled = z;
        this.minScreenHeightToShow = num;
        this.widget = qrScannerGuidelinesWidgetSchema;
    }

    public static /* synthetic */ QrScannerGuidelinesConfigSchema copy$default(QrScannerGuidelinesConfigSchema qrScannerGuidelinesConfigSchema, boolean z, Integer num, QrScannerGuidelinesWidgetSchema qrScannerGuidelinesWidgetSchema, int i, Object obj) {
        if ((i & 1) != 0) {
            z = qrScannerGuidelinesConfigSchema.isEnabled;
        }
        if ((i & 2) != 0) {
            num = qrScannerGuidelinesConfigSchema.minScreenHeightToShow;
        }
        if ((i & 4) != 0) {
            qrScannerGuidelinesWidgetSchema = qrScannerGuidelinesConfigSchema.widget;
        }
        return qrScannerGuidelinesConfigSchema.copy(z, num, qrScannerGuidelinesWidgetSchema);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMinScreenHeightToShow() {
        return this.minScreenHeightToShow;
    }

    /* renamed from: component3, reason: from getter */
    public final QrScannerGuidelinesWidgetSchema getWidget() {
        return this.widget;
    }

    public final QrScannerGuidelinesConfigSchema copy(boolean isEnabled, Integer minScreenHeightToShow, QrScannerGuidelinesWidgetSchema widget) {
        return new QrScannerGuidelinesConfigSchema(isEnabled, minScreenHeightToShow, widget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrScannerGuidelinesConfigSchema)) {
            return false;
        }
        QrScannerGuidelinesConfigSchema qrScannerGuidelinesConfigSchema = (QrScannerGuidelinesConfigSchema) other;
        return this.isEnabled == qrScannerGuidelinesConfigSchema.isEnabled && jl40.l(this.minScreenHeightToShow, qrScannerGuidelinesConfigSchema.minScreenHeightToShow) && jl40.l(this.widget, qrScannerGuidelinesConfigSchema.widget);
    }

    public final Integer getMinScreenHeightToShow() {
        return this.minScreenHeightToShow;
    }

    public final QrScannerGuidelinesWidgetSchema getWidget() {
        return this.widget;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Integer num = this.minScreenHeightToShow;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        QrScannerGuidelinesWidgetSchema qrScannerGuidelinesWidgetSchema = this.widget;
        return hashCode2 + (qrScannerGuidelinesWidgetSchema != null ? qrScannerGuidelinesWidgetSchema.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final mo01 toEntity() {
        if (!this.isEnabled || this.widget == null) {
            return null;
        }
        Integer num = this.minScreenHeightToShow;
        int intValue = num != null ? num.intValue() : MIN_SCREEN_HEIGHT_TO_SHOW_GUIDELINES;
        Text title = this.widget.getTitle();
        List<QrScannerGuidelineItemSchema> items = this.widget.getItems();
        ArrayList arrayList = new ArrayList(tcc.n(items, 10));
        for (QrScannerGuidelineItemSchema qrScannerGuidelineItemSchema : items) {
            arrayList.add(new lo01(fob1.b(qrScannerGuidelineItemSchema.getImage()), qrScannerGuidelineItemSchema.getText(), qrScannerGuidelineItemSchema.getAction(), qrScannerGuidelineItemSchema.getGuidelineType()));
        }
        return new mo01(intValue, title, arrayList);
    }

    public String toString() {
        return "QrScannerGuidelinesConfigSchema(isEnabled=" + this.isEnabled + ", minScreenHeightToShow=" + this.minScreenHeightToShow + ", widget=" + this.widget + Extension.C_BRAKE;
    }
}
