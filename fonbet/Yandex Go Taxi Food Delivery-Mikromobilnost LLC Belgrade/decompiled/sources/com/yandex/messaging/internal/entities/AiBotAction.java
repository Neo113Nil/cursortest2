package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006#"}, d2 = {"Lcom/yandex/messaging/internal/entities/AiBotAction;", "", "title", "", "icon", "Lcom/yandex/messaging/internal/entities/AiBotAction$Icon;", "directives", "", "Lcom/yandex/messaging/core/net/entities/directives/Directive;", "errorsOnParsing", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "buttonId", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/internal/entities/AiBotAction$Icon;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()Lcom/yandex/messaging/internal/entities/AiBotAction$Icon;", "getDirectives", "()Ljava/util/List;", "getErrorsOnParsing", "getButtonId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Icon", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AiBotAction {

    @Json(name = "buttonId")
    private final String buttonId;

    @Json(name = "directives")
    private final List<Directive> directives;

    @Json(name = "errors_on_parsing")
    private final List<BotRequest.Error> errorsOnParsing;

    @Json(name = "icon")
    private final Icon icon;

    @Json(name = "title")
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/internal/entities/AiBotAction$Icon;", "", "type", "", "value", "<init>", "(II)V", "getType", "()I", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        @Json(name = "type")
        private final int type;

        @Json(name = "value")
        private final int value;

        public Icon(int i, int i2) {
            this.type = i;
            this.value = i2;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = icon.type;
            }
            if ((i3 & 2) != 0) {
                i2 = icon.value;
            }
            return icon.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final Icon copy(int type, int value) {
            return new Icon(type, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return this.type == icon.type && this.value == icon.value;
        }

        public final int getType() {
            return this.type;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value) + (Integer.hashCode(this.type) * 31);
        }

        public String toString() {
            return b64.d(this.type, this.value, "Icon(type=", ", value=", Extension.C_BRAKE);
        }
    }

    public /* synthetic */ AiBotAction(String str, Icon icon, List list, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, icon, list, (i & 8) != 0 ? null : list2, str2);
    }

    public static /* synthetic */ AiBotAction copy$default(AiBotAction aiBotAction, String str, Icon icon, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiBotAction.title;
        }
        if ((i & 2) != 0) {
            icon = aiBotAction.icon;
        }
        if ((i & 4) != 0) {
            list = aiBotAction.directives;
        }
        if ((i & 8) != 0) {
            list2 = aiBotAction.errorsOnParsing;
        }
        if ((i & 16) != 0) {
            str2 = aiBotAction.buttonId;
        }
        String str3 = str2;
        List list3 = list;
        return aiBotAction.copy(str, icon, list3, list2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    public final List<Directive> component3() {
        return this.directives;
    }

    public final List<BotRequest.Error> component4() {
        return this.errorsOnParsing;
    }

    /* renamed from: component5, reason: from getter */
    public final String getButtonId() {
        return this.buttonId;
    }

    public final AiBotAction copy(String title, Icon icon, List<? extends Directive> directives, List<BotRequest.Error> errorsOnParsing, String buttonId) {
        return new AiBotAction(title, icon, directives, errorsOnParsing, buttonId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiBotAction)) {
            return false;
        }
        AiBotAction aiBotAction = (AiBotAction) other;
        return jl40.l(this.title, aiBotAction.title) && jl40.l(this.icon, aiBotAction.icon) && jl40.l(this.directives, aiBotAction.directives) && jl40.l(this.errorsOnParsing, aiBotAction.errorsOnParsing) && jl40.l(this.buttonId, aiBotAction.buttonId);
    }

    public final String getButtonId() {
        return this.buttonId;
    }

    public final List<Directive> getDirectives() {
        return this.directives;
    }

    public final List<BotRequest.Error> getErrorsOnParsing() {
        return this.errorsOnParsing;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = unr0.c((this.icon.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.directives);
        List<BotRequest.Error> list = this.errorsOnParsing;
        return this.buttonId.hashCode() + ((c + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        Icon icon = this.icon;
        List<Directive> list = this.directives;
        List<BotRequest.Error> list2 = this.errorsOnParsing;
        String str2 = this.buttonId;
        StringBuilder sb = new StringBuilder("AiBotAction(title=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", directives=");
        nnm.w(sb, list, ", errorsOnParsing=", list2, ", buttonId=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiBotAction(String str, Icon icon, List<? extends Directive> list, List<BotRequest.Error> list2, String str2) {
        this.title = str;
        this.icon = icon;
        this.directives = list;
        this.errorsOnParsing = list2;
        this.buttonId = str2;
    }
}
