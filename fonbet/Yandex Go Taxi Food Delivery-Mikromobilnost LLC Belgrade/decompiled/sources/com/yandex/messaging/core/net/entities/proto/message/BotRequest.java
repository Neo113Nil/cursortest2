package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.cex;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xuf0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004./01B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jf\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest;", "", "chatId", "", "customPayload", "actionId", "messageContext", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageContext;", "errors", "", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "textSuggest", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggest;", "serverAction", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$ServerAction;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/message/MessageContext;[Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggest;Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$ServerAction;)V", "getChatId", "()Ljava/lang/String;", "getCustomPayload", "()Ljava/lang/Object;", "getActionId", "getMessageContext", "()Lcom/yandex/messaging/core/net/entities/proto/message/MessageContext;", "getErrors", "()[Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "[Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "getTextSuggest", "()Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggest;", "getServerAction", "()Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$ServerAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/message/MessageContext;[Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggest;Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$ServerAction;)Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest;", "equals", "", "other", "hashCode", "", "toString", "TextSuggest", "TextSuggestButton", "ServerAction", "Error", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BotRequest {

    @xuf0(tag = 4)
    private final String actionId;

    @cex
    @xuf0(tag = 1)
    private final String chatId;

    @xuf0(encoding = 1, tag = 2)
    private final Object customPayload;

    @xuf0(tag = 6)
    private final Error[] errors;

    @xuf0(tag = 5)
    private final MessageContext messageContext;

    @xuf0(tag = 101)
    private final ServerAction serverAction;

    @xuf0(tag = 100)
    private final TextSuggest textSuggest;

    public /* synthetic */ BotRequest(String str, Object obj, String str2, MessageContext messageContext, Error[] errorArr, TextSuggest textSuggest, ServerAction serverAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : messageContext, (i & 16) != 0 ? null : errorArr, (i & 32) != 0 ? null : textSuggest, (i & 64) != 0 ? null : serverAction);
    }

    public static /* synthetic */ BotRequest copy$default(BotRequest botRequest, String str, Object obj, String str2, MessageContext messageContext, Error[] errorArr, TextSuggest textSuggest, ServerAction serverAction, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = botRequest.chatId;
        }
        if ((i & 2) != 0) {
            obj = botRequest.customPayload;
        }
        if ((i & 4) != 0) {
            str2 = botRequest.actionId;
        }
        if ((i & 8) != 0) {
            messageContext = botRequest.messageContext;
        }
        if ((i & 16) != 0) {
            errorArr = botRequest.errors;
        }
        if ((i & 32) != 0) {
            textSuggest = botRequest.textSuggest;
        }
        if ((i & 64) != 0) {
            serverAction = botRequest.serverAction;
        }
        TextSuggest textSuggest2 = textSuggest;
        ServerAction serverAction2 = serverAction;
        Error[] errorArr2 = errorArr;
        String str3 = str2;
        return botRequest.copy(str, obj, str3, messageContext, errorArr2, textSuggest2, serverAction2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getCustomPayload() {
        return this.customPayload;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component4, reason: from getter */
    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    /* renamed from: component5, reason: from getter */
    public final Error[] getErrors() {
        return this.errors;
    }

    /* renamed from: component6, reason: from getter */
    public final TextSuggest getTextSuggest() {
        return this.textSuggest;
    }

    /* renamed from: component7, reason: from getter */
    public final ServerAction getServerAction() {
        return this.serverAction;
    }

    public final BotRequest copy(@Json(name = "ChatId") String chatId, @Json(name = "CustomPayload") Object customPayload, @Json(name = "ActionId") String actionId, @Json(name = "MessageContext") MessageContext messageContext, @Json(name = "Errors") Error[] errors, @Json(name = "Suggest") TextSuggest textSuggest, @Json(name = "ServerAction") ServerAction serverAction) {
        return new BotRequest(chatId, customPayload, actionId, messageContext, errors, textSuggest, serverAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotRequest)) {
            return false;
        }
        BotRequest botRequest = (BotRequest) other;
        return jl40.l(this.chatId, botRequest.chatId) && jl40.l(this.customPayload, botRequest.customPayload) && jl40.l(this.actionId, botRequest.actionId) && jl40.l(this.messageContext, botRequest.messageContext) && jl40.l(this.errors, botRequest.errors) && jl40.l(this.textSuggest, botRequest.textSuggest) && jl40.l(this.serverAction, botRequest.serverAction);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Object getCustomPayload() {
        return this.customPayload;
    }

    public final Error[] getErrors() {
        return this.errors;
    }

    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    public final ServerAction getServerAction() {
        return this.serverAction;
    }

    public final TextSuggest getTextSuggest() {
        return this.textSuggest;
    }

    public int hashCode() {
        int hashCode = this.chatId.hashCode() * 31;
        Object obj = this.customPayload;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.actionId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MessageContext messageContext = this.messageContext;
        int hashCode4 = (hashCode3 + (messageContext == null ? 0 : messageContext.hashCode())) * 31;
        Error[] errorArr = this.errors;
        int hashCode5 = (hashCode4 + (errorArr == null ? 0 : Arrays.hashCode(errorArr))) * 31;
        TextSuggest textSuggest = this.textSuggest;
        int hashCode6 = (hashCode5 + (textSuggest == null ? 0 : textSuggest.hashCode())) * 31;
        ServerAction serverAction = this.serverAction;
        return hashCode6 + (serverAction != null ? serverAction.hashCode() : 0);
    }

    public String toString() {
        return "BotRequest(chatId=" + this.chatId + ", customPayload=" + this.customPayload + ", actionId=" + this.actionId + ", messageContext=" + this.messageContext + ", errors=" + Arrays.toString(this.errors) + ", textSuggest=" + this.textSuggest + ", serverAction=" + this.serverAction + Extension.C_BRAKE;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$ServerAction;", "", "name", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPayload", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerAction {

        @xuf0(tag = 1)
        private final String name;

        @xuf0(tag = 2)
        private final String payload;

        public /* synthetic */ ServerAction(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ ServerAction copy$default(ServerAction serverAction, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverAction.name;
            }
            if ((i & 2) != 0) {
                str2 = serverAction.payload;
            }
            return serverAction.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        public final ServerAction copy(@Json(name = "Name") String name, @Json(name = "Payload") String payload) {
            return new ServerAction(name, payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerAction)) {
                return false;
            }
            ServerAction serverAction = (ServerAction) other;
            return jl40.l(this.name, serverAction.name) && jl40.l(this.payload, serverAction.payload);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPayload() {
            return this.payload;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.payload;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return unr0.p("ServerAction(name=", this.name, ", payload=", this.payload, Extension.C_BRAKE);
        }

        public ServerAction(@Json(name = "Name") String str, @Json(name = "Payload") String str2) {
            this.name = str;
            this.payload = str2;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggest;", "", "buttons", "", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggestButton;", "<init>", "([Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggestButton;)V", "getButtons", "()[Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggestButton;", "[Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggestButton;", "component1", "copy", "([Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggestButton;)Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggest;", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextSuggest {

        @xuf0(tag = 1)
        private final TextSuggestButton[] buttons;

        public /* synthetic */ TextSuggest(TextSuggestButton[] textSuggestButtonArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : textSuggestButtonArr);
        }

        public static /* synthetic */ TextSuggest copy$default(TextSuggest textSuggest, TextSuggestButton[] textSuggestButtonArr, int i, Object obj) {
            if ((i & 1) != 0) {
                textSuggestButtonArr = textSuggest.buttons;
            }
            return textSuggest.copy(textSuggestButtonArr);
        }

        /* renamed from: component1, reason: from getter */
        public final TextSuggestButton[] getButtons() {
            return this.buttons;
        }

        public final TextSuggest copy(@Json(name = "Buttons") TextSuggestButton[] buttons) {
            return new TextSuggest(buttons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextSuggest) && jl40.l(this.buttons, ((TextSuggest) other).buttons);
        }

        public final TextSuggestButton[] getButtons() {
            return this.buttons;
        }

        public int hashCode() {
            TextSuggestButton[] textSuggestButtonArr = this.buttons;
            if (textSuggestButtonArr == null) {
                return 0;
            }
            return Arrays.hashCode(textSuggestButtonArr);
        }

        public String toString() {
            return oyr.p("TextSuggest(buttons=", Arrays.toString(this.buttons), Extension.C_BRAKE);
        }

        public TextSuggest(@Json(name = "Buttons") TextSuggestButton[] textSuggestButtonArr) {
            this.buttons = textSuggestButtonArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TextSuggest() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$TextSuggestButton;", "", "text", "", "callbackData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getCallbackData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextSuggestButton {

        @xuf0(tag = 2)
        private final String callbackData;

        @cex
        @xuf0(tag = 1)
        private final String text;

        public /* synthetic */ TextSuggestButton(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ TextSuggestButton copy$default(TextSuggestButton textSuggestButton, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textSuggestButton.text;
            }
            if ((i & 2) != 0) {
                str2 = textSuggestButton.callbackData;
            }
            return textSuggestButton.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCallbackData() {
            return this.callbackData;
        }

        public final TextSuggestButton copy(@Json(name = "Text") String text, @Json(name = "CallbackData") String callbackData) {
            return new TextSuggestButton(text, callbackData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSuggestButton)) {
                return false;
            }
            TextSuggestButton textSuggestButton = (TextSuggestButton) other;
            return jl40.l(this.text, textSuggestButton.text) && jl40.l(this.callbackData, textSuggestButton.callbackData);
        }

        public final String getCallbackData() {
            return this.callbackData;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.callbackData;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return unr0.p("TextSuggestButton(text=", this.text, ", callbackData=", this.callbackData, Extension.C_BRAKE);
        }

        public TextSuggestButton(@Json(name = "Text") String str, @Json(name = "CallbackData") String str2) {
            this.text = str;
            this.callbackData = str2;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "", "unsupportedDirective", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$UnsupportedDirective;", "invalidDirectivePayload", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$InvalidDirectivePayload;", "clientError", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$ClientError;", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$UnsupportedDirective;Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$InvalidDirectivePayload;Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$ClientError;)V", "getUnsupportedDirective", "()Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$UnsupportedDirective;", "getInvalidDirectivePayload", "()Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$InvalidDirectivePayload;", "getClientError", "()Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$ClientError;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "UnsupportedDirective", "InvalidDirectivePayload", "ClientError", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error {

        @xuf0(tag = 102)
        private final ClientError clientError;

        @xuf0(tag = 101)
        private final InvalidDirectivePayload invalidDirectivePayload;

        @xuf0(tag = 100)
        private final UnsupportedDirective unsupportedDirective;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$ClientError;", "", Constants.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ClientError {

            @cex
            @xuf0(tag = 1)
            private final String message;

            public ClientError(@Json(name = "Message") String str) {
                this.message = str;
            }

            public static /* synthetic */ ClientError copy$default(ClientError clientError, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = clientError.message;
                }
                return clientError.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final ClientError copy(@Json(name = "Message") String message) {
                return new ClientError(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ClientError) && jl40.l(this.message, ((ClientError) other).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return oyr.p("ClientError(message=", this.message, Extension.C_BRAKE);
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$InvalidDirectivePayload;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class InvalidDirectivePayload {

            @cex
            @xuf0(tag = 1)
            private final String name;

            public InvalidDirectivePayload(@Json(name = "Name") String str) {
                this.name = str;
            }

            public static /* synthetic */ InvalidDirectivePayload copy$default(InvalidDirectivePayload invalidDirectivePayload, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = invalidDirectivePayload.name;
                }
                return invalidDirectivePayload.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final InvalidDirectivePayload copy(@Json(name = "Name") String name) {
                return new InvalidDirectivePayload(name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvalidDirectivePayload) && jl40.l(this.name, ((InvalidDirectivePayload) other).name);
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return oyr.p("InvalidDirectivePayload(name=", this.name, Extension.C_BRAKE);
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error$UnsupportedDirective;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UnsupportedDirective {

            @cex
            @xuf0(tag = 1)
            private final String name;

            public UnsupportedDirective(@Json(name = "Name") String str) {
                this.name = str;
            }

            public static /* synthetic */ UnsupportedDirective copy$default(UnsupportedDirective unsupportedDirective, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unsupportedDirective.name;
                }
                return unsupportedDirective.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final UnsupportedDirective copy(@Json(name = "Name") String name) {
                return new UnsupportedDirective(name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnsupportedDirective) && jl40.l(this.name, ((UnsupportedDirective) other).name);
            }

            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return oyr.p("UnsupportedDirective(name=", this.name, Extension.C_BRAKE);
            }
        }

        public /* synthetic */ Error(UnsupportedDirective unsupportedDirective, InvalidDirectivePayload invalidDirectivePayload, ClientError clientError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : unsupportedDirective, (i & 2) != 0 ? null : invalidDirectivePayload, (i & 4) != 0 ? null : clientError);
        }

        public static /* synthetic */ Error copy$default(Error error, UnsupportedDirective unsupportedDirective, InvalidDirectivePayload invalidDirectivePayload, ClientError clientError, int i, Object obj) {
            if ((i & 1) != 0) {
                unsupportedDirective = error.unsupportedDirective;
            }
            if ((i & 2) != 0) {
                invalidDirectivePayload = error.invalidDirectivePayload;
            }
            if ((i & 4) != 0) {
                clientError = error.clientError;
            }
            return error.copy(unsupportedDirective, invalidDirectivePayload, clientError);
        }

        /* renamed from: component1, reason: from getter */
        public final UnsupportedDirective getUnsupportedDirective() {
            return this.unsupportedDirective;
        }

        /* renamed from: component2, reason: from getter */
        public final InvalidDirectivePayload getInvalidDirectivePayload() {
            return this.invalidDirectivePayload;
        }

        /* renamed from: component3, reason: from getter */
        public final ClientError getClientError() {
            return this.clientError;
        }

        public final Error copy(@Json(name = "UnsupportedDirective") UnsupportedDirective unsupportedDirective, @Json(name = "InvalidDirectivePayload") InvalidDirectivePayload invalidDirectivePayload, @Json(name = "ClientError") ClientError clientError) {
            return new Error(unsupportedDirective, invalidDirectivePayload, clientError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return jl40.l(this.unsupportedDirective, error.unsupportedDirective) && jl40.l(this.invalidDirectivePayload, error.invalidDirectivePayload) && jl40.l(this.clientError, error.clientError);
        }

        public final ClientError getClientError() {
            return this.clientError;
        }

        public final InvalidDirectivePayload getInvalidDirectivePayload() {
            return this.invalidDirectivePayload;
        }

        public final UnsupportedDirective getUnsupportedDirective() {
            return this.unsupportedDirective;
        }

        public int hashCode() {
            UnsupportedDirective unsupportedDirective = this.unsupportedDirective;
            int hashCode = (unsupportedDirective == null ? 0 : unsupportedDirective.hashCode()) * 31;
            InvalidDirectivePayload invalidDirectivePayload = this.invalidDirectivePayload;
            int hashCode2 = (hashCode + (invalidDirectivePayload == null ? 0 : invalidDirectivePayload.hashCode())) * 31;
            ClientError clientError = this.clientError;
            return hashCode2 + (clientError != null ? clientError.hashCode() : 0);
        }

        public String toString() {
            return "Error(unsupportedDirective=" + this.unsupportedDirective + ", invalidDirectivePayload=" + this.invalidDirectivePayload + ", clientError=" + this.clientError + Extension.C_BRAKE;
        }

        public Error(@Json(name = "UnsupportedDirective") UnsupportedDirective unsupportedDirective, @Json(name = "InvalidDirectivePayload") InvalidDirectivePayload invalidDirectivePayload, @Json(name = "ClientError") ClientError clientError) {
            this.unsupportedDirective = unsupportedDirective;
            this.invalidDirectivePayload = invalidDirectivePayload;
            this.clientError = clientError;
        }

        public Error() {
            this(null, null, null, 7, null);
        }
    }

    public BotRequest(@Json(name = "ChatId") String str, @Json(name = "CustomPayload") Object obj, @Json(name = "ActionId") String str2, @Json(name = "MessageContext") MessageContext messageContext, @Json(name = "Errors") Error[] errorArr, @Json(name = "Suggest") TextSuggest textSuggest, @Json(name = "ServerAction") ServerAction serverAction) {
        this.chatId = str;
        this.customPayload = obj;
        this.actionId = str2;
        this.messageContext = messageContext;
        this.errors = errorArr;
        this.textSuggest = textSuggest;
        this.serverAction = serverAction;
    }
}
