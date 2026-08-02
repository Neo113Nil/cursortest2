package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/LayoutSuggestButtons;", "", "rows", "", "Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;", "<init>", "([Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;)V", "getRows", "()[Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;", "[Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;", "component1", "copy", "([Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;)Lcom/yandex/messaging/core/net/entities/proto/message/LayoutSuggestButtons;", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LayoutSuggestButtons {

    @xuf0(tag = 1)
    private final SuggestButtons[] rows;

    public /* synthetic */ LayoutSuggestButtons(SuggestButtons[] suggestButtonsArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : suggestButtonsArr);
    }

    public static /* synthetic */ LayoutSuggestButtons copy$default(LayoutSuggestButtons layoutSuggestButtons, SuggestButtons[] suggestButtonsArr, int i, Object obj) {
        if ((i & 1) != 0) {
            suggestButtonsArr = layoutSuggestButtons.rows;
        }
        return layoutSuggestButtons.copy(suggestButtonsArr);
    }

    /* renamed from: component1, reason: from getter */
    public final SuggestButtons[] getRows() {
        return this.rows;
    }

    public final LayoutSuggestButtons copy(@Json(name = "ButtonRows") SuggestButtons[] rows) {
        return new LayoutSuggestButtons(rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LayoutSuggestButtons) && jl40.l(this.rows, ((LayoutSuggestButtons) other).rows);
    }

    public final SuggestButtons[] getRows() {
        return this.rows;
    }

    public int hashCode() {
        SuggestButtons[] suggestButtonsArr = this.rows;
        if (suggestButtonsArr == null) {
            return 0;
        }
        return Arrays.hashCode(suggestButtonsArr);
    }

    public String toString() {
        return oyr.p("LayoutSuggestButtons(rows=", Arrays.toString(this.rows), Extension.C_BRAKE);
    }

    public LayoutSuggestButtons(@Json(name = "ButtonRows") SuggestButtons[] suggestButtonsArr) {
        this.rows = suggestButtonsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutSuggestButtons() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
