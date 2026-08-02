package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/AiBotAction;", "", "title", "", "icon", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActionIcon;", "directives", "", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "buttonId", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActionIcon;[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActionIcon;", "getDirectives", "()[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "getButtonId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActionIcon;[Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;Ljava/lang/String;)Lcom/yandex/messaging/core/net/entities/proto/message/AiBotAction;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AiBotAction {

    @xuf0(tag = 4)
    private final String buttonId;

    @xuf0(tag = 3)
    private final AiBotDirective[] directives;

    @xuf0(tag = 2)
    private final AiBotActionIcon icon;

    @xuf0(tag = 1)
    private final String title;

    public AiBotAction(@Json(name = "Title") String str, @Json(name = "Icon") AiBotActionIcon aiBotActionIcon, @Json(name = "Directives") AiBotDirective[] aiBotDirectiveArr, @Json(name = "Id") String str2) {
        this.title = str;
        this.icon = aiBotActionIcon;
        this.directives = aiBotDirectiveArr;
        this.buttonId = str2;
    }

    public static /* synthetic */ AiBotAction copy$default(AiBotAction aiBotAction, String str, AiBotActionIcon aiBotActionIcon, AiBotDirective[] aiBotDirectiveArr, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiBotAction.title;
        }
        if ((i & 2) != 0) {
            aiBotActionIcon = aiBotAction.icon;
        }
        if ((i & 4) != 0) {
            aiBotDirectiveArr = aiBotAction.directives;
        }
        if ((i & 8) != 0) {
            str2 = aiBotAction.buttonId;
        }
        return aiBotAction.copy(str, aiBotActionIcon, aiBotDirectiveArr, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final AiBotActionIcon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final AiBotDirective[] getDirectives() {
        return this.directives;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonId() {
        return this.buttonId;
    }

    public final AiBotAction copy(@Json(name = "Title") String title, @Json(name = "Icon") AiBotActionIcon icon, @Json(name = "Directives") AiBotDirective[] directives, @Json(name = "Id") String buttonId) {
        return new AiBotAction(title, icon, directives, buttonId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiBotAction)) {
            return false;
        }
        AiBotAction aiBotAction = (AiBotAction) other;
        return jl40.l(this.title, aiBotAction.title) && jl40.l(this.icon, aiBotAction.icon) && jl40.l(this.directives, aiBotAction.directives) && jl40.l(this.buttonId, aiBotAction.buttonId);
    }

    public final String getButtonId() {
        return this.buttonId;
    }

    public final AiBotDirective[] getDirectives() {
        return this.directives;
    }

    public final AiBotActionIcon getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.icon.hashCode() + (this.title.hashCode() * 31)) * 31;
        AiBotDirective[] aiBotDirectiveArr = this.directives;
        return this.buttonId.hashCode() + ((hashCode + (aiBotDirectiveArr == null ? 0 : Arrays.hashCode(aiBotDirectiveArr))) * 31);
    }

    public String toString() {
        String str = this.title;
        AiBotActionIcon aiBotActionIcon = this.icon;
        String arrays = Arrays.toString(this.directives);
        String str2 = this.buttonId;
        StringBuilder sb = new StringBuilder("AiBotAction(title=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(aiBotActionIcon);
        sb.append(", directives=");
        return g8e.r(sb, arrays, ", buttonId=", str2, Extension.C_BRAKE);
    }

    public /* synthetic */ AiBotAction(String str, AiBotActionIcon aiBotActionIcon, AiBotDirective[] aiBotDirectiveArr, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aiBotActionIcon, (i & 4) != 0 ? null : aiBotDirectiveArr, str2);
    }
}
