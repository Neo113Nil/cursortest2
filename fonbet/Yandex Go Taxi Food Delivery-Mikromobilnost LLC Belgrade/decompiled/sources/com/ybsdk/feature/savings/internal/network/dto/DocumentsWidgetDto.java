package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DocumentsWidgetDto;", "", "layoutId", "", "title", "buttons", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DocumentButtonDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLayoutId", "()Ljava/lang/String;", "getTitle", "getButtons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocumentsWidgetDto {
    private final List<DocumentButtonDto> buttons;
    private final String layoutId;
    private final String title;

    public DocumentsWidgetDto(@Json(name = "layout_id") String str, @Json(name = "title") String str2, @Json(name = "data") List<DocumentButtonDto> list) {
        this.layoutId = str;
        this.title = str2;
        this.buttons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentsWidgetDto copy$default(DocumentsWidgetDto documentsWidgetDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = documentsWidgetDto.layoutId;
        }
        if ((i & 2) != 0) {
            str2 = documentsWidgetDto.title;
        }
        if ((i & 4) != 0) {
            list = documentsWidgetDto.buttons;
        }
        return documentsWidgetDto.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLayoutId() {
        return this.layoutId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<DocumentButtonDto> component3() {
        return this.buttons;
    }

    public final DocumentsWidgetDto copy(@Json(name = "layout_id") String layoutId, @Json(name = "title") String title, @Json(name = "data") List<DocumentButtonDto> buttons) {
        return new DocumentsWidgetDto(layoutId, title, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentsWidgetDto)) {
            return false;
        }
        DocumentsWidgetDto documentsWidgetDto = (DocumentsWidgetDto) other;
        return jl40.l(this.layoutId, documentsWidgetDto.layoutId) && jl40.l(this.title, documentsWidgetDto.title) && jl40.l(this.buttons, documentsWidgetDto.buttons);
    }

    public final List<DocumentButtonDto> getButtons() {
        return this.buttons;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttons.hashCode() + unr0.b(this.layoutId.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        String str = this.layoutId;
        String str2 = this.title;
        return ly3.s(b64.v("DocumentsWidgetDto(layoutId=", str, ", title=", str2, ", buttons="), this.buttons, Extension.C_BRAKE);
    }
}
