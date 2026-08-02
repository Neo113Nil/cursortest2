package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JB\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButton;", "", "text", "", "callbackData", "directives", "", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "elementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getCallbackData", "getDirectives", "()[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "getElementId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;Ljava/lang/String;)Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButton;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SuggestButton {

    @xuf0(tag = 2)
    private final String callbackData;

    @xuf0(tag = 3)
    private final AiBotDirective[] directives;

    @xuf0(tag = 4)
    private final String elementId;

    @xuf0(tag = 1)
    private final String text;

    public /* synthetic */ SuggestButton(String str, String str2, AiBotDirective[] aiBotDirectiveArr, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : aiBotDirectiveArr, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ SuggestButton copy$default(SuggestButton suggestButton, String str, String str2, AiBotDirective[] aiBotDirectiveArr, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestButton.text;
        }
        if ((i & 2) != 0) {
            str2 = suggestButton.callbackData;
        }
        if ((i & 4) != 0) {
            aiBotDirectiveArr = suggestButton.directives;
        }
        if ((i & 8) != 0) {
            str3 = suggestButton.elementId;
        }
        return suggestButton.copy(str, str2, aiBotDirectiveArr, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCallbackData() {
        return this.callbackData;
    }

    /* renamed from: component3, reason: from getter */
    public final AiBotDirective[] getDirectives() {
        return this.directives;
    }

    /* renamed from: component4, reason: from getter */
    public final String getElementId() {
        return this.elementId;
    }

    public final SuggestButton copy(@Json(name = "Text") String text, @Json(name = "CallbackData") String callbackData, @Json(name = "Directives") AiBotDirective[] directives, @Json(name = "Id") String elementId) {
        return new SuggestButton(text, callbackData, directives, elementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestButton)) {
            return false;
        }
        SuggestButton suggestButton = (SuggestButton) other;
        return jl40.l(this.text, suggestButton.text) && jl40.l(this.callbackData, suggestButton.callbackData) && jl40.l(this.directives, suggestButton.directives) && jl40.l(this.elementId, suggestButton.elementId);
    }

    public final String getCallbackData() {
        return this.callbackData;
    }

    public final AiBotDirective[] getDirectives() {
        return this.directives;
    }

    public final String getElementId() {
        return this.elementId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.callbackData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AiBotDirective[] aiBotDirectiveArr = this.directives;
        int hashCode3 = (hashCode2 + (aiBotDirectiveArr == null ? 0 : Arrays.hashCode(aiBotDirectiveArr))) * 31;
        String str2 = this.elementId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.callbackData;
        return g8e.r(b64.v("SuggestButton(text=", str, ", callbackData=", str2, ", directives="), Arrays.toString(this.directives), ", elementId=", this.elementId, Extension.C_BRAKE);
    }

    public SuggestButton(@Json(name = "Text") String str, @Json(name = "CallbackData") String str2, @Json(name = "Directives") AiBotDirective[] aiBotDirectiveArr, @Json(name = "Id") String str3) {
        this.text = str;
        this.callbackData = str2;
        this.directives = aiBotDirectiveArr;
        this.elementId = str3;
    }
}
