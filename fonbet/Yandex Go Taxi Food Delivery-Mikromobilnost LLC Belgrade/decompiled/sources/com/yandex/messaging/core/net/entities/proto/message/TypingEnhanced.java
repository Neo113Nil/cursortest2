package com.yandex.messaging.core.net.entities.proto.message;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced;", "", "chatId", "", "text", "actionId", Constants.REFERRER_API_META, "Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced$Meta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced$Meta;)V", "getChatId", "()Ljava/lang/String;", "getText", "getActionId", "getMeta", "()Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced$Meta;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Meta", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TypingEnhanced {

    @xuf0(tag = 3)
    private final String actionId;

    @xuf0(tag = 1)
    private final String chatId;

    @xuf0(tag = 4)
    private final Meta meta;

    @xuf0(tag = 2)
    private final String text;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/TypingEnhanced$Meta;", "", "locale", "", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocale", "()Ljava/lang/String;", "getContext", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Meta {

        @xuf0(tag = 2)
        private final String context;

        @xuf0(tag = 1)
        private final String locale;

        public Meta(@Json(name = "Locale") String str, @Json(name = "Context") String str2) {
            this.locale = str;
            this.context = str2;
        }

        public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = meta.locale;
            }
            if ((i & 2) != 0) {
                str2 = meta.context;
            }
            return meta.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Meta copy(@Json(name = "Locale") String locale, @Json(name = "Context") String context) {
            return new Meta(locale, context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) other;
            return jl40.l(this.locale, meta.locale) && jl40.l(this.context, meta.context);
        }

        public final String getContext() {
            return this.context;
        }

        public final String getLocale() {
            return this.locale;
        }

        public int hashCode() {
            int hashCode = this.locale.hashCode() * 31;
            String str = this.context;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return unr0.p("Meta(locale=", this.locale, ", context=", this.context, Extension.C_BRAKE);
        }
    }

    public TypingEnhanced(@Json(name = "ChatId") String str, @Json(name = "Text") String str2, @Json(name = "ActionId") String str3, @Json(name = "Meta") Meta meta) {
        this.chatId = str;
        this.text = str2;
        this.actionId = str3;
        this.meta = meta;
    }

    public static /* synthetic */ TypingEnhanced copy$default(TypingEnhanced typingEnhanced, String str, String str2, String str3, Meta meta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = typingEnhanced.chatId;
        }
        if ((i & 2) != 0) {
            str2 = typingEnhanced.text;
        }
        if ((i & 4) != 0) {
            str3 = typingEnhanced.actionId;
        }
        if ((i & 8) != 0) {
            meta = typingEnhanced.meta;
        }
        return typingEnhanced.copy(str, str2, str3, meta);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component4, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    public final TypingEnhanced copy(@Json(name = "ChatId") String chatId, @Json(name = "Text") String text, @Json(name = "ActionId") String actionId, @Json(name = "Meta") Meta meta) {
        return new TypingEnhanced(chatId, text, actionId, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingEnhanced)) {
            return false;
        }
        TypingEnhanced typingEnhanced = (TypingEnhanced) other;
        return jl40.l(this.chatId, typingEnhanced.chatId) && jl40.l(this.text, typingEnhanced.text) && jl40.l(this.actionId, typingEnhanced.actionId) && jl40.l(this.meta, typingEnhanced.meta);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.meta.hashCode() + unr0.b(unr0.b(this.chatId.hashCode() * 31, 31, this.text), 31, this.actionId);
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.text;
        String str3 = this.actionId;
        Meta meta = this.meta;
        StringBuilder v = b64.v("TypingEnhanced(chatId=", str, ", text=", str2, ", actionId=");
        v.append(str3);
        v.append(", meta=");
        v.append(meta);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
