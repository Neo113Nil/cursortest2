package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrScannerGuidelinesWidgetSchema;", "", "title", "Lcom/ybsdk/core/utils/text/Text;", "items", "", "Lcom/ybsdk/rconfig/configs/QrScannerGuidelineItemSchema;", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Ljava/util/List;)V", "getTitle", "()Lcom/ybsdk/core/utils/text/Text;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrScannerGuidelinesWidgetSchema {

    @Json(name = "items")
    private final List<QrScannerGuidelineItemSchema> items;

    @Json(name = "title")
    private final Text title;

    public QrScannerGuidelinesWidgetSchema(Text text, List<QrScannerGuidelineItemSchema> list) {
        this.title = text;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QrScannerGuidelinesWidgetSchema copy$default(QrScannerGuidelinesWidgetSchema qrScannerGuidelinesWidgetSchema, Text text, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            text = qrScannerGuidelinesWidgetSchema.title;
        }
        if ((i & 2) != 0) {
            list = qrScannerGuidelinesWidgetSchema.items;
        }
        return qrScannerGuidelinesWidgetSchema.copy(text, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    public final List<QrScannerGuidelineItemSchema> component2() {
        return this.items;
    }

    public final QrScannerGuidelinesWidgetSchema copy(Text title, List<QrScannerGuidelineItemSchema> items) {
        return new QrScannerGuidelinesWidgetSchema(title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrScannerGuidelinesWidgetSchema)) {
            return false;
        }
        QrScannerGuidelinesWidgetSchema qrScannerGuidelinesWidgetSchema = (QrScannerGuidelinesWidgetSchema) other;
        return jl40.l(this.title, qrScannerGuidelinesWidgetSchema.title) && jl40.l(this.items, qrScannerGuidelinesWidgetSchema.items);
    }

    public final List<QrScannerGuidelineItemSchema> getItems() {
        return this.items;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "QrScannerGuidelinesWidgetSchema(title=" + this.title + ", items=" + this.items + Extension.C_BRAKE;
    }
}
