package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.JsonMap;
import defpackage.b64;
import defpackage.cex;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.x4e;
import defpackage.xra1;
import defpackage.xuf0;
import io.appmetrica.analytics.BuildConfig;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u000bklmnopqrstuB\u0081\u0002\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0015\u0012\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0003\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u001e\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0003\u0010 \u001a\u00020\u001e\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$\u0012\u0010\b\u0003\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0017¢\u0006\u0004\b'\u0010(J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010X\u001a\u00020\u0013HÆ\u0003J\t\u0010Y\u001a\u00020\u0015HÆ\u0003J\u0016\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010>J\u000b\u0010[\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0016\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010]\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010^\u001a\u00020\u001eHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010`\u001a\u00020\u001eHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010$HÆ\u0003J\u0016\u0010c\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010NJ\u0088\u0002\u0010d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u00152\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0003\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00172\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010\u001d\u001a\u00020\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\b\u0003\u0010 \u001a\u00020\u001e2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010$2\u0010\b\u0003\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010eJ\u0013\u0010f\u001a\u00020\u001e2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020iHÖ\u0001J\t\u0010j\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR \u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010:R\u0016\u0010 \u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010GR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR \u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010N¨\u0006v"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage;", "", "text", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Text;", "image", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;", "file", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File;", "sticker", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Sticker;", "card", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;", "gallery", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Gallery;", "voice", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Voice;", "poll", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Poll;", "chatId", "", ClidProvider.TIMESTAMP, "", "forwardedMessageRefs", "", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "customPayload", "Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload;", "mentionedUserIds", "payloadId", "urlPreviewDisabled", "", "notificationText", "isStarred", "aiBotActionsHolder", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActions;", "suggestsHolder", "Lcom/yandex/messaging/core/net/entities/proto/message/Suggests;", "forwardedMessageStyles", "Lcom/yandex/messaging/core/net/entities/proto/message/ForwardedMessageStyle;", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Text;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Sticker;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Gallery;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Voice;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Poll;Ljava/lang/String;J[Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload;[Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/yandex/messaging/core/net/entities/proto/message/AiBotActions;Lcom/yandex/messaging/core/net/entities/proto/message/Suggests;[Lcom/yandex/messaging/core/net/entities/proto/message/ForwardedMessageStyle;)V", "getText", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Text;", "getImage", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;", "getFile", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File;", "getSticker", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Sticker;", "getCard", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;", "getGallery", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Gallery;", "getVoice", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Voice;", "getPoll", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Poll;", "getChatId", "()Ljava/lang/String;", "getTimestamp", "()J", "getForwardedMessageRefs", "()[Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "[Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "getCustomPayload", "()Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload;", "getMentionedUserIds", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getPayloadId", "getUrlPreviewDisabled", "()Z", "getNotificationText", "getAiBotActionsHolder", "()Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActions;", "getSuggestsHolder", "()Lcom/yandex/messaging/core/net/entities/proto/message/Suggests;", "getForwardedMessageStyles", "()[Lcom/yandex/messaging/core/net/entities/proto/message/ForwardedMessageStyle;", "[Lcom/yandex/messaging/core/net/entities/proto/message/ForwardedMessageStyle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Text;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Sticker;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Gallery;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Voice;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Poll;Ljava/lang/String;J[Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload;[Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/yandex/messaging/core/net/entities/proto/message/AiBotActions;Lcom/yandex/messaging/core/net/entities/proto/message/Suggests;[Lcom/yandex/messaging/core/net/entities/proto/message/ForwardedMessageStyle;)Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage;", "equals", "other", "hashCode", "", "toString", "Text", "Image", "Gallery", "Item", "File", "FileInfo", "Card", "Sticker", "Voice", "Poll", "PollResult", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PlainMessage {

    @xuf0(tag = BuildConfig.API_LEVEL)
    private final AiBotActions aiBotActionsHolder;

    @xuf0(tag = 5)
    private final Card card;

    @cex
    @xuf0(tag = 101)
    private final String chatId;

    @xuf0(encoding = 1, tag = 105)
    private final CustomPayload customPayload;

    @xuf0(tag = 3)
    private final File file;

    @xuf0(tag = 103)
    private final MessageRef[] forwardedMessageRefs;

    @xuf0(tag = HProv.PP_INFO)
    private final ForwardedMessageStyle[] forwardedMessageStyles;

    @xuf0(tag = 7)
    private final Gallery gallery;

    @xuf0(tag = 2)
    private final Image image;

    @xuf0(tag = 114)
    private final boolean isStarred;

    @xuf0(tag = 106)
    private final String[] mentionedUserIds;

    @xuf0(tag = 113)
    private final String notificationText;

    @xuf0(tag = HProv.PP_SET_PIN)
    private final String payloadId;

    @xuf0(tag = 9)
    private final Poll poll;

    @xuf0(tag = 4)
    private final Sticker sticker;

    @xuf0(tag = HProv.PP_NK_SYNC)
    private final Suggests suggestsHolder;

    @xuf0(tag = 1)
    private final Text text;

    @xuf0(tag = 102)
    private final long timestamp;

    @xuf0(tag = 108)
    private final boolean urlPreviewDisabled;

    @xuf0(tag = 8)
    private final Voice voice;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\b\u0001\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0003\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;", "", "card", "", "", "<init>", "(Ljava/util/Map;)V", "getCard", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card {

        @cex
        @xuf0(encoding = 1, tag = 1)
        private final Map<String, ?> card;

        public Card(@JsonMap @Json(name = "Card") Map<String, ?> map) {
            this.card = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Card copy$default(Card card, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = card.card;
            }
            return card.copy(map);
        }

        public final Map<String, ?> component1() {
            return this.card;
        }

        public final Card copy(@JsonMap @Json(name = "Card") Map<String, ?> card) {
            return new Card(card);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Card) && jl40.l(this.card, ((Card) other).card);
        }

        public final Map<String, ?> getCard() {
            return this.card;
        }

        public int hashCode() {
            return this.card.hashCode();
        }

        public String toString() {
            return nnm.j("Card(card=", Extension.C_BRAKE, this.card);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;", "", "image", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;)V", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        @cex
        @xuf0(tag = 1)
        public final Image image;

        public Item(@Json(name = "Image") Image image) {
            this.image = image;
        }

        public static /* synthetic */ Item copy$default(Item item, Image image, int i, Object obj) {
            if ((i & 1) != 0) {
                image = item.image;
            }
            return item.copy(image);
        }

        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        public final Item copy(@Json(name = "Image") Image image) {
            return new Item(image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Item) && jl40.l(this.image, ((Item) other).image);
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        public String toString() {
            return "Item(image=" + this.image + Extension.C_BRAKE;
        }
    }

    public /* synthetic */ PlainMessage(Text text, Image image, File file, Sticker sticker, Card card, Gallery gallery, Voice voice, Poll poll, String str, long j, MessageRef[] messageRefArr, CustomPayload customPayload, String[] strArr, String str2, boolean z, String str3, boolean z2, AiBotActions aiBotActions, Suggests suggests, ForwardedMessageStyle[] forwardedMessageStyleArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : text, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : file, (i & 8) != 0 ? null : sticker, (i & 16) != 0 ? null : card, (i & 32) != 0 ? null : gallery, (i & 64) != 0 ? null : voice, (i & 128) != 0 ? null : poll, str, (i & 512) != 0 ? 0L : j, (i & 1024) != 0 ? null : messageRefArr, (i & 2048) != 0 ? null : customPayload, (i & 4096) != 0 ? null : strArr, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? false : z, (32768 & i) != 0 ? null : str3, (65536 & i) != 0 ? false : z2, (131072 & i) != 0 ? null : aiBotActions, (262144 & i) != 0 ? null : suggests, (i & 524288) != 0 ? null : forwardedMessageStyleArr);
    }

    public static /* synthetic */ PlainMessage copy$default(PlainMessage plainMessage, Text text, Image image, File file, Sticker sticker, Card card, Gallery gallery, Voice voice, Poll poll, String str, long j, MessageRef[] messageRefArr, CustomPayload customPayload, String[] strArr, String str2, boolean z, String str3, boolean z2, AiBotActions aiBotActions, Suggests suggests, ForwardedMessageStyle[] forwardedMessageStyleArr, int i, Object obj) {
        ForwardedMessageStyle[] forwardedMessageStyleArr2;
        Suggests suggests2;
        Text text2 = (i & 1) != 0 ? plainMessage.text : text;
        Image image2 = (i & 2) != 0 ? plainMessage.image : image;
        File file2 = (i & 4) != 0 ? plainMessage.file : file;
        Sticker sticker2 = (i & 8) != 0 ? plainMessage.sticker : sticker;
        Card card2 = (i & 16) != 0 ? plainMessage.card : card;
        Gallery gallery2 = (i & 32) != 0 ? plainMessage.gallery : gallery;
        Voice voice2 = (i & 64) != 0 ? plainMessage.voice : voice;
        Poll poll2 = (i & 128) != 0 ? plainMessage.poll : poll;
        String str4 = (i & 256) != 0 ? plainMessage.chatId : str;
        long j2 = (i & 512) != 0 ? plainMessage.timestamp : j;
        MessageRef[] messageRefArr2 = (i & 1024) != 0 ? plainMessage.forwardedMessageRefs : messageRefArr;
        CustomPayload customPayload2 = (i & 2048) != 0 ? plainMessage.customPayload : customPayload;
        String[] strArr2 = (i & 4096) != 0 ? plainMessage.mentionedUserIds : strArr;
        Text text3 = text2;
        String str5 = (i & 8192) != 0 ? plainMessage.payloadId : str2;
        boolean z3 = (i & 16384) != 0 ? plainMessage.urlPreviewDisabled : z;
        String str6 = (i & 32768) != 0 ? plainMessage.notificationText : str3;
        boolean z4 = (i & 65536) != 0 ? plainMessage.isStarred : z2;
        AiBotActions aiBotActions2 = (i & 131072) != 0 ? plainMessage.aiBotActionsHolder : aiBotActions;
        Suggests suggests3 = (i & 262144) != 0 ? plainMessage.suggestsHolder : suggests;
        if ((i & 524288) != 0) {
            suggests2 = suggests3;
            forwardedMessageStyleArr2 = plainMessage.forwardedMessageStyles;
        } else {
            forwardedMessageStyleArr2 = forwardedMessageStyleArr;
            suggests2 = suggests3;
        }
        return plainMessage.copy(text3, image2, file2, sticker2, card2, gallery2, voice2, poll2, str4, j2, messageRefArr2, customPayload2, strArr2, str5, z3, str6, z4, aiBotActions2, suggests2, forwardedMessageStyleArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component11, reason: from getter */
    public final MessageRef[] getForwardedMessageRefs() {
        return this.forwardedMessageRefs;
    }

    /* renamed from: component12, reason: from getter */
    public final CustomPayload getCustomPayload() {
        return this.customPayload;
    }

    /* renamed from: component13, reason: from getter */
    public final String[] getMentionedUserIds() {
        return this.mentionedUserIds;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPayloadId() {
        return this.payloadId;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getUrlPreviewDisabled() {
        return this.urlPreviewDisabled;
    }

    /* renamed from: component16, reason: from getter */
    public final String getNotificationText() {
        return this.notificationText;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsStarred() {
        return this.isStarred;
    }

    /* renamed from: component18, reason: from getter */
    public final AiBotActions getAiBotActionsHolder() {
        return this.aiBotActionsHolder;
    }

    /* renamed from: component19, reason: from getter */
    public final Suggests getSuggestsHolder() {
        return this.suggestsHolder;
    }

    /* renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: component20, reason: from getter */
    public final ForwardedMessageStyle[] getForwardedMessageStyles() {
        return this.forwardedMessageStyles;
    }

    /* renamed from: component3, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* renamed from: component4, reason: from getter */
    public final Sticker getSticker() {
        return this.sticker;
    }

    /* renamed from: component5, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    /* renamed from: component6, reason: from getter */
    public final Gallery getGallery() {
        return this.gallery;
    }

    /* renamed from: component7, reason: from getter */
    public final Voice getVoice() {
        return this.voice;
    }

    /* renamed from: component8, reason: from getter */
    public final Poll getPoll() {
        return this.poll;
    }

    /* renamed from: component9, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final PlainMessage copy(@Json(name = "Text") Text text, @Json(name = "Image") Image image, @Json(name = "MiscFile") File file, @Json(name = "Sticker") Sticker sticker, @Json(name = "Card") Card card, @Json(name = "Gallery") Gallery gallery, @Json(name = "Voice") Voice voice, @Json(name = "Poll") Poll poll, @Json(name = "ChatId") String chatId, @Json(name = "Timestamp") long timestamp, @Json(name = "ForwardedMessageRefs") MessageRef[] forwardedMessageRefs, @Json(name = "CustomPayload") CustomPayload customPayload, @Json(name = "MentionedUserIds") String[] mentionedUserIds, @Json(name = "PayloadId") String payloadId, @Json(name = "UrlPreviewDisabled") boolean urlPreviewDisabled, @Json(name = "NotificationText") String notificationText, @Json(name = "IsImportant") boolean isStarred, @Json(name = "ActionButtonsHolder") AiBotActions aiBotActionsHolder, @Json(name = "SuggestButtonsHolder") Suggests suggestsHolder, @Json(name = "ForwardedMessageStyles") ForwardedMessageStyle[] forwardedMessageStyles) {
        return new PlainMessage(text, image, file, sticker, card, gallery, voice, poll, chatId, timestamp, forwardedMessageRefs, customPayload, mentionedUserIds, payloadId, urlPreviewDisabled, notificationText, isStarred, aiBotActionsHolder, suggestsHolder, forwardedMessageStyles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlainMessage)) {
            return false;
        }
        PlainMessage plainMessage = (PlainMessage) other;
        return jl40.l(this.text, plainMessage.text) && jl40.l(this.image, plainMessage.image) && jl40.l(this.file, plainMessage.file) && jl40.l(this.sticker, plainMessage.sticker) && jl40.l(this.card, plainMessage.card) && jl40.l(this.gallery, plainMessage.gallery) && jl40.l(this.voice, plainMessage.voice) && jl40.l(this.poll, plainMessage.poll) && jl40.l(this.chatId, plainMessage.chatId) && this.timestamp == plainMessage.timestamp && jl40.l(this.forwardedMessageRefs, plainMessage.forwardedMessageRefs) && jl40.l(this.customPayload, plainMessage.customPayload) && jl40.l(this.mentionedUserIds, plainMessage.mentionedUserIds) && jl40.l(this.payloadId, plainMessage.payloadId) && this.urlPreviewDisabled == plainMessage.urlPreviewDisabled && jl40.l(this.notificationText, plainMessage.notificationText) && this.isStarred == plainMessage.isStarred && jl40.l(this.aiBotActionsHolder, plainMessage.aiBotActionsHolder) && jl40.l(this.suggestsHolder, plainMessage.suggestsHolder) && jl40.l(this.forwardedMessageStyles, plainMessage.forwardedMessageStyles);
    }

    public final AiBotActions getAiBotActionsHolder() {
        return this.aiBotActionsHolder;
    }

    public final Card getCard() {
        return this.card;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final CustomPayload getCustomPayload() {
        return this.customPayload;
    }

    public final File getFile() {
        return this.file;
    }

    public final MessageRef[] getForwardedMessageRefs() {
        return this.forwardedMessageRefs;
    }

    public final ForwardedMessageStyle[] getForwardedMessageStyles() {
        return this.forwardedMessageStyles;
    }

    public final Gallery getGallery() {
        return this.gallery;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String[] getMentionedUserIds() {
        return this.mentionedUserIds;
    }

    public final String getNotificationText() {
        return this.notificationText;
    }

    public final String getPayloadId() {
        return this.payloadId;
    }

    public final Poll getPoll() {
        return this.poll;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public final Suggests getSuggestsHolder() {
        return this.suggestsHolder;
    }

    public final Text getText() {
        return this.text;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean getUrlPreviewDisabled() {
        return this.urlPreviewDisabled;
    }

    public final Voice getVoice() {
        return this.voice;
    }

    public int hashCode() {
        Text text = this.text;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Image image = this.image;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        File file = this.file;
        int hashCode3 = (hashCode2 + (file == null ? 0 : file.hashCode())) * 31;
        Sticker sticker = this.sticker;
        int hashCode4 = (hashCode3 + (sticker == null ? 0 : sticker.hashCode())) * 31;
        Card card = this.card;
        int hashCode5 = (hashCode4 + (card == null ? 0 : card.hashCode())) * 31;
        Gallery gallery = this.gallery;
        int hashCode6 = (hashCode5 + (gallery == null ? 0 : gallery.hashCode())) * 31;
        Voice voice = this.voice;
        int hashCode7 = (hashCode6 + (voice == null ? 0 : voice.hashCode())) * 31;
        Poll poll = this.poll;
        int c = qv10.c(unr0.b((hashCode7 + (poll == null ? 0 : poll.hashCode())) * 31, 31, this.chatId), 31, this.timestamp);
        MessageRef[] messageRefArr = this.forwardedMessageRefs;
        int hashCode8 = (c + (messageRefArr == null ? 0 : Arrays.hashCode(messageRefArr))) * 31;
        CustomPayload customPayload = this.customPayload;
        int hashCode9 = (hashCode8 + (customPayload == null ? 0 : customPayload.hashCode())) * 31;
        String[] strArr = this.mentionedUserIds;
        int hashCode10 = (hashCode9 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String str = this.payloadId;
        int e = unr0.e((hashCode10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.urlPreviewDisabled);
        String str2 = this.notificationText;
        int e2 = unr0.e((e + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isStarred);
        AiBotActions aiBotActions = this.aiBotActionsHolder;
        int hashCode11 = (e2 + (aiBotActions == null ? 0 : aiBotActions.hashCode())) * 31;
        Suggests suggests = this.suggestsHolder;
        int hashCode12 = (hashCode11 + (suggests == null ? 0 : suggests.hashCode())) * 31;
        ForwardedMessageStyle[] forwardedMessageStyleArr = this.forwardedMessageStyles;
        return hashCode12 + (forwardedMessageStyleArr != null ? Arrays.hashCode(forwardedMessageStyleArr) : 0);
    }

    public final boolean isStarred() {
        return this.isStarred;
    }

    public String toString() {
        Text text = this.text;
        Image image = this.image;
        File file = this.file;
        Sticker sticker = this.sticker;
        Card card = this.card;
        Gallery gallery = this.gallery;
        Voice voice = this.voice;
        Poll poll = this.poll;
        String str = this.chatId;
        long j = this.timestamp;
        String arrays = Arrays.toString(this.forwardedMessageRefs);
        CustomPayload customPayload = this.customPayload;
        String arrays2 = Arrays.toString(this.mentionedUserIds);
        String str2 = this.payloadId;
        boolean z = this.urlPreviewDisabled;
        String str3 = this.notificationText;
        boolean z2 = this.isStarred;
        AiBotActions aiBotActions = this.aiBotActionsHolder;
        Suggests suggests = this.suggestsHolder;
        String arrays3 = Arrays.toString(this.forwardedMessageStyles);
        StringBuilder sb = new StringBuilder("PlainMessage(text=");
        sb.append(text);
        sb.append(", image=");
        sb.append(image);
        sb.append(", file=");
        sb.append(file);
        sb.append(", sticker=");
        sb.append(sticker);
        sb.append(", card=");
        sb.append(card);
        sb.append(", gallery=");
        sb.append(gallery);
        sb.append(", voice=");
        sb.append(voice);
        sb.append(", poll=");
        sb.append(poll);
        sb.append(", chatId=");
        ly3.y(j, str, ", timestamp=", sb);
        sb.append(", forwardedMessageRefs=");
        sb.append(arrays);
        sb.append(", customPayload=");
        sb.append(customPayload);
        g8e.D(sb, ", mentionedUserIds=", arrays2, ", payloadId=", str2);
        sb.append(", urlPreviewDisabled=");
        sb.append(z);
        sb.append(", notificationText=");
        sb.append(str3);
        sb.append(", isStarred=");
        sb.append(z2);
        sb.append(", aiBotActionsHolder=");
        sb.append(aiBotActions);
        sb.append(", suggestsHolder=");
        sb.append(suggests);
        sb.append(", forwardedMessageStyles=");
        sb.append(arrays3);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File;", "", "fileInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "previewHint", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$PreviewHint;", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$PreviewHint;)V", "getFileInfo", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "getPreviewHint", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$PreviewHint;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PreviewHint", "VideoPreview", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class File {

        @cex
        @xuf0(tag = 1)
        private final FileInfo fileInfo;
        private final PreviewHint previewHint;

        public /* synthetic */ File(FileInfo fileInfo, PreviewHint previewHint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fileInfo, (i & 2) != 0 ? null : previewHint);
        }

        public static /* synthetic */ File copy$default(File file, FileInfo fileInfo, PreviewHint previewHint, int i, Object obj) {
            if ((i & 1) != 0) {
                fileInfo = file.fileInfo;
            }
            if ((i & 2) != 0) {
                previewHint = file.previewHint;
            }
            return file.copy(fileInfo, previewHint);
        }

        /* renamed from: component1, reason: from getter */
        public final FileInfo getFileInfo() {
            return this.fileInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final PreviewHint getPreviewHint() {
            return this.previewHint;
        }

        public final File copy(@Json(name = "FileInfo") FileInfo fileInfo, @Json(name = "PreviewHint") PreviewHint previewHint) {
            return new File(fileInfo, previewHint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof File)) {
                return false;
            }
            File file = (File) other;
            return jl40.l(this.fileInfo, file.fileInfo) && jl40.l(this.previewHint, file.previewHint);
        }

        public final FileInfo getFileInfo() {
            return this.fileInfo;
        }

        public final PreviewHint getPreviewHint() {
            return this.previewHint;
        }

        public int hashCode() {
            int hashCode = this.fileInfo.hashCode() * 31;
            PreviewHint previewHint = this.previewHint;
            return hashCode + (previewHint == null ? 0 : previewHint.hashCode());
        }

        public String toString() {
            return "File(fileInfo=" + this.fileInfo + ", previewHint=" + this.previewHint + Extension.C_BRAKE;
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$PreviewHint;", "", "videoPreview", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$VideoPreview;", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$VideoPreview;)V", "getVideoPreview", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$VideoPreview;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PreviewHint {

            @xuf0(tag = 1)
            private final VideoPreview videoPreview;

            public /* synthetic */ PreviewHint(VideoPreview videoPreview, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : videoPreview);
            }

            public static /* synthetic */ PreviewHint copy$default(PreviewHint previewHint, VideoPreview videoPreview, int i, Object obj) {
                if ((i & 1) != 0) {
                    videoPreview = previewHint.videoPreview;
                }
                return previewHint.copy(videoPreview);
            }

            /* renamed from: component1, reason: from getter */
            public final VideoPreview getVideoPreview() {
                return this.videoPreview;
            }

            public final PreviewHint copy(@Json(name = "VideoPreview") VideoPreview videoPreview) {
                return new PreviewHint(videoPreview);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PreviewHint) && jl40.l(this.videoPreview, ((PreviewHint) other).videoPreview);
            }

            public final VideoPreview getVideoPreview() {
                return this.videoPreview;
            }

            public int hashCode() {
                VideoPreview videoPreview = this.videoPreview;
                if (videoPreview == null) {
                    return 0;
                }
                return videoPreview.hashCode();
            }

            public String toString() {
                return "PreviewHint(videoPreview=" + this.videoPreview + Extension.C_BRAKE;
            }

            public PreviewHint(@Json(name = "VideoPreview") VideoPreview videoPreview) {
                this.videoPreview = videoPreview;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public PreviewHint() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        public File(@Json(name = "FileInfo") FileInfo fileInfo, @Json(name = "PreviewHint") PreviewHint previewHint) {
            this.fileInfo = fileInfo;
            this.previewHint = previewHint;
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File$VideoPreview;", "", "width", "", "height", "durationMs", "", "blurHash", "", "<init>", "(IIJ[B)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class VideoPreview {

            @xuf0(tag = 4)
            public final byte[] blurHash;

            @xuf0(tag = 3)
            public final long durationMs;

            @xuf0(tag = 2)
            public final int height;

            @xuf0(tag = 1)
            public final int width;

            public /* synthetic */ VideoPreview(int i, int i2, long j, byte[] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? null : bArr);
            }

            public static /* synthetic */ VideoPreview copy$default(VideoPreview videoPreview, int i, int i2, long j, byte[] bArr, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = videoPreview.width;
                }
                if ((i3 & 2) != 0) {
                    i2 = videoPreview.height;
                }
                if ((i3 & 4) != 0) {
                    j = videoPreview.durationMs;
                }
                if ((i3 & 8) != 0) {
                    bArr = videoPreview.blurHash;
                }
                byte[] bArr2 = bArr;
                return videoPreview.copy(i, i2, j, bArr2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getWidth() {
                return this.width;
            }

            /* renamed from: component2, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            /* renamed from: component3, reason: from getter */
            public final long getDurationMs() {
                return this.durationMs;
            }

            /* renamed from: component4, reason: from getter */
            public final byte[] getBlurHash() {
                return this.blurHash;
            }

            public final VideoPreview copy(@Json(name = "Width") int width, @Json(name = "Height") int height, @Json(name = "DurationMs") long durationMs, @Json(name = "BlurHash") byte[] blurHash) {
                return new VideoPreview(width, height, durationMs, blurHash);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoPreview)) {
                    return false;
                }
                VideoPreview videoPreview = (VideoPreview) other;
                return this.width == videoPreview.width && this.height == videoPreview.height && this.durationMs == videoPreview.durationMs && jl40.l(this.blurHash, videoPreview.blurHash);
            }

            public int hashCode() {
                int c = qv10.c(oyr.b(this.height, Integer.hashCode(this.width) * 31, 31), 31, this.durationMs);
                byte[] bArr = this.blurHash;
                return c + (bArr == null ? 0 : Arrays.hashCode(bArr));
            }

            public String toString() {
                int i = this.width;
                int i2 = this.height;
                long j = this.durationMs;
                String arrays = Arrays.toString(this.blurHash);
                StringBuilder s = b64.s(i, i2, "VideoPreview(width=", ", height=", ", durationMs=");
                uw51.v(j, ", blurHash=", arrays, s);
                s.append(Extension.C_BRAKE);
                return s.toString();
            }

            public VideoPreview(@Json(name = "Width") int i, @Json(name = "Height") int i2, @Json(name = "DurationMs") long j, @Json(name = "BlurHash") byte[] bArr) {
                this.width = i;
                this.height = i2;
                this.durationMs = j;
                this.blurHash = bArr;
            }

            public VideoPreview() {
                this(0, 0, 0L, null, 15, null);
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Gallery;", "", "text", "", "items", "", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;", "<init>", "(Ljava/lang/String;[Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;)V", "getText", "()Ljava/lang/String;", "getItems", "()[Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;", "[Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;", "component1", "component2", "copy", "(Ljava/lang/String;[Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Item;)Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Gallery;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Gallery {

        @cex
        @xuf0(tag = 2)
        private final Item[] items;

        @xuf0(tag = 1)
        private final String text;

        public /* synthetic */ Gallery(String str, Item[] itemArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, itemArr);
        }

        public static /* synthetic */ Gallery copy$default(Gallery gallery, String str, Item[] itemArr, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gallery.text;
            }
            if ((i & 2) != 0) {
                itemArr = gallery.items;
            }
            return gallery.copy(str, itemArr);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Item[] getItems() {
            return this.items;
        }

        public final Gallery copy(@Json(name = "Text") String text, @Json(name = "Items") Item[] items) {
            return new Gallery(text, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gallery)) {
                return false;
            }
            Gallery gallery = (Gallery) other;
            return jl40.l(this.text, gallery.text) && jl40.l(this.items, gallery.items);
        }

        public final Item[] getItems() {
            return this.items;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            return Arrays.hashCode(this.items) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return unr0.p("Gallery(text=", this.text, ", items=", Arrays.toString(this.items), Extension.C_BRAKE);
        }

        public Gallery(@Json(name = "Text") String str, @Json(name = "Items") Item[] itemArr) {
            this.text = str;
            this.items = itemArr;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Sticker;", "", "id", "", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSetId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Sticker {

        @xuf0(tag = 3)
        private final String id;

        @xuf0(tag = 4)
        private final String setId;

        public /* synthetic */ Sticker(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Sticker copy$default(Sticker sticker, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sticker.id;
            }
            if ((i & 2) != 0) {
                str2 = sticker.setId;
            }
            return sticker.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSetId() {
            return this.setId;
        }

        public final Sticker copy(@Json(name = "Id") String id, @Json(name = "SetId") String setId) {
            return new Sticker(id, setId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sticker)) {
                return false;
            }
            Sticker sticker = (Sticker) other;
            return jl40.l(this.id, sticker.id) && jl40.l(this.setId, sticker.setId);
        }

        public final String getId() {
            return this.id;
        }

        public final String getSetId() {
            return this.setId;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.setId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return unr0.p("Sticker(id=", this.id, ", setId=", this.setId, Extension.C_BRAKE);
        }

        public Sticker(@Json(name = "Id") String str, @Json(name = "SetId") String str2) {
            this.id = str;
            this.setId = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sticker() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Text;", "", "text", "", "card", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;)V", "getText", "()Ljava/lang/String;", "getCard", "()Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {

        @xuf0(tag = 2)
        private final Card card;

        @xuf0(tag = 1)
        private final String text;

        public /* synthetic */ Text(String str, Card card, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : card);
        }

        public static /* synthetic */ Text copy$default(Text text, String str, Card card, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            if ((i & 2) != 0) {
                card = text.card;
            }
            return text.copy(str, card);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        public final Text copy(@Json(name = "MessageText") String text, @Json(name = "Card") Card card) {
            return new Text(text, card);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return jl40.l(this.text, text.text) && jl40.l(this.card, text.card);
        }

        public final Card getCard() {
            return this.card;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Card card = this.card;
            return hashCode + (card != null ? card.hashCode() : 0);
        }

        public String toString() {
            return "Text(text=" + this.text + ", card=" + this.card + Extension.C_BRAKE;
        }

        public Text(@Json(name = "MessageText") String str, @Json(name = "Card") Card card) {
            this.text = str;
            this.card = card;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Text() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J1\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;", "", "fileInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "width", "", "height", "animated", "", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;IIZ)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image {

        @xuf0(tag = 4)
        public final boolean animated;

        @cex
        @xuf0(tag = 1)
        public final FileInfo fileInfo;

        @xuf0(tag = 3)
        public final int height;

        @xuf0(tag = 2)
        public final int width;

        public /* synthetic */ Image(FileInfo fileInfo, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(fileInfo, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z);
        }

        public static /* synthetic */ Image copy$default(Image image, FileInfo fileInfo, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                fileInfo = image.fileInfo;
            }
            if ((i3 & 2) != 0) {
                i = image.width;
            }
            if ((i3 & 4) != 0) {
                i2 = image.height;
            }
            if ((i3 & 8) != 0) {
                z = image.animated;
            }
            return image.copy(fileInfo, i, i2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final FileInfo getFileInfo() {
            return this.fileInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAnimated() {
            return this.animated;
        }

        public final Image copy(@Json(name = "FileInfo") FileInfo fileInfo, @Json(name = "Width") int width, @Json(name = "Height") int height, @Json(name = "Animated") boolean animated) {
            return new Image(fileInfo, width, height, animated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return jl40.l(this.fileInfo, image.fileInfo) && this.width == image.width && this.height == image.height && this.animated == image.animated;
        }

        public int hashCode() {
            return Boolean.hashCode(this.animated) + oyr.b(this.height, oyr.b(this.width, this.fileInfo.hashCode() * 31, 31), 31);
        }

        public String toString() {
            return "Image(fileInfo=" + this.fileInfo + ", width=" + this.width + ", height=" + this.height + ", animated=" + this.animated + Extension.C_BRAKE;
        }

        public Image(@Json(name = "FileInfo") FileInfo fileInfo, @Json(name = "Width") int i, @Json(name = "Height") int i2, @Json(name = "Animated") boolean z) {
            this.fileInfo = fileInfo;
            this.width = i;
            this.height = i2;
            this.animated = z;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\rHÆ\u0003JT\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Poll;", "", "title", "", "answers", "", "isAnonymous", "", "maxChoices", "", "pollResults", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;", "myChoices", "", "<init>", "(Ljava/lang/String;[Ljava/lang/String;ZILcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;[I)V", "[Ljava/lang/String;", "component1", "component2", "()[Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;[Ljava/lang/String;ZILcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;[I)Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Poll;", "equals", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Poll {

        @xuf0(tag = 2)
        public final String[] answers;

        @xuf0(tag = 3)
        public final boolean isAnonymous;

        @xuf0(tag = 4)
        public final int maxChoices;

        @xuf0(tag = 6)
        public final int[] myChoices;

        @xuf0(tag = 5)
        public final PollResult pollResults;

        @cex
        @xuf0(tag = 1)
        public final String title;

        public /* synthetic */ Poll(String str, String[] strArr, boolean z, int i, PollResult pollResult, int[] iArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, strArr, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : pollResult, iArr);
        }

        public static /* synthetic */ Poll copy$default(Poll poll, String str, String[] strArr, boolean z, int i, PollResult pollResult, int[] iArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = poll.title;
            }
            if ((i2 & 2) != 0) {
                strArr = poll.answers;
            }
            if ((i2 & 4) != 0) {
                z = poll.isAnonymous;
            }
            if ((i2 & 8) != 0) {
                i = poll.maxChoices;
            }
            if ((i2 & 16) != 0) {
                pollResult = poll.pollResults;
            }
            if ((i2 & 32) != 0) {
                iArr = poll.myChoices;
            }
            PollResult pollResult2 = pollResult;
            int[] iArr2 = iArr;
            return poll.copy(str, strArr, z, i, pollResult2, iArr2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String[] getAnswers() {
            return this.answers;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAnonymous() {
            return this.isAnonymous;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxChoices() {
            return this.maxChoices;
        }

        /* renamed from: component5, reason: from getter */
        public final PollResult getPollResults() {
            return this.pollResults;
        }

        /* renamed from: component6, reason: from getter */
        public final int[] getMyChoices() {
            return this.myChoices;
        }

        public final Poll copy(@Json(name = "Title") String title, @Json(name = "Answers") String[] answers, @Json(name = "IsAnonynmous") boolean isAnonymous, @Json(name = "MaxChoices") int maxChoices, @Json(name = "Results") PollResult pollResults, @Json(name = "MyChoices") int[] myChoices) {
            return new Poll(title, answers, isAnonymous, maxChoices, pollResults, myChoices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Poll)) {
                return false;
            }
            Poll poll = (Poll) other;
            return jl40.l(this.title, poll.title) && jl40.l(this.answers, poll.answers) && this.isAnonymous == poll.isAnonymous && this.maxChoices == poll.maxChoices && jl40.l(this.pollResults, poll.pollResults) && jl40.l(this.myChoices, poll.myChoices);
        }

        public int hashCode() {
            int b = oyr.b(this.maxChoices, unr0.e(((this.title.hashCode() * 31) + Arrays.hashCode(this.answers)) * 31, 31, this.isAnonymous), 31);
            PollResult pollResult = this.pollResults;
            int hashCode = (b + (pollResult == null ? 0 : pollResult.hashCode())) * 31;
            int[] iArr = this.myChoices;
            return hashCode + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }

        public String toString() {
            String str = this.title;
            String arrays = Arrays.toString(this.answers);
            boolean z = this.isAnonymous;
            int i = this.maxChoices;
            PollResult pollResult = this.pollResults;
            String arrays2 = Arrays.toString(this.myChoices);
            StringBuilder v = b64.v("Poll(title=", str, ", answers=", arrays, ", isAnonymous=");
            v.append(z);
            v.append(", maxChoices=");
            v.append(i);
            v.append(", pollResults=");
            v.append(pollResult);
            v.append(", myChoices=");
            v.append(arrays2);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public Poll(@Json(name = "Title") String str, @Json(name = "Answers") String[] strArr, @Json(name = "IsAnonynmous") boolean z, @Json(name = "MaxChoices") int i, @Json(name = "Results") PollResult pollResult, @Json(name = "MyChoices") int[] iArr) {
            this.title = str;
            this.answers = strArr;
            this.isAnonymous = z;
            this.maxChoices = i;
            this.pollResults = pollResult;
            this.myChoices = iArr;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0003\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003JG\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Voice;", "", "fileInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "duration", "", "text", "", "wasRecognized", "", "waveform", "", "disableRecognition", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;ILjava/lang/String;Z[BZ)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Voice {

        @xuf0(tag = 6)
        public final boolean disableRecognition;

        @xuf0(tag = 2)
        public final int duration;

        @cex
        @xuf0(tag = 1)
        public final FileInfo fileInfo;

        @xuf0(tag = 3)
        public final String text;

        @xuf0(tag = 4)
        public final boolean wasRecognized;

        @xuf0(tag = 5)
        public final byte[] waveform;

        public /* synthetic */ Voice(FileInfo fileInfo, int i, String str, boolean z, byte[] bArr, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(fileInfo, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? false : z, bArr, (i2 & 32) != 0 ? false : z2);
        }

        public static /* synthetic */ Voice copy$default(Voice voice, FileInfo fileInfo, int i, String str, boolean z, byte[] bArr, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fileInfo = voice.fileInfo;
            }
            if ((i2 & 2) != 0) {
                i = voice.duration;
            }
            if ((i2 & 4) != 0) {
                str = voice.text;
            }
            if ((i2 & 8) != 0) {
                z = voice.wasRecognized;
            }
            if ((i2 & 16) != 0) {
                bArr = voice.waveform;
            }
            if ((i2 & 32) != 0) {
                z2 = voice.disableRecognition;
            }
            byte[] bArr2 = bArr;
            boolean z3 = z2;
            return voice.copy(fileInfo, i, str, z, bArr2, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final FileInfo getFileInfo() {
            return this.fileInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getWasRecognized() {
            return this.wasRecognized;
        }

        /* renamed from: component5, reason: from getter */
        public final byte[] getWaveform() {
            return this.waveform;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getDisableRecognition() {
            return this.disableRecognition;
        }

        public final Voice copy(@Json(name = "FileInfo") FileInfo fileInfo, @Json(name = "Duration") int duration, @Json(name = "Text") String text, @Json(name = "WasRecognized") boolean wasRecognized, @Json(name = "Waveform") byte[] waveform, @Json(name = "DisableRecognition") boolean disableRecognition) {
            return new Voice(fileInfo, duration, text, wasRecognized, waveform, disableRecognition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Voice)) {
                return false;
            }
            Voice voice = (Voice) other;
            return jl40.l(this.fileInfo, voice.fileInfo) && this.duration == voice.duration && jl40.l(this.text, voice.text) && this.wasRecognized == voice.wasRecognized && jl40.l(this.waveform, voice.waveform) && this.disableRecognition == voice.disableRecognition;
        }

        public int hashCode() {
            int b = oyr.b(this.duration, this.fileInfo.hashCode() * 31, 31);
            String str = this.text;
            return Boolean.hashCode(this.disableRecognition) + ((Arrays.hashCode(this.waveform) + unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.wasRecognized)) * 31);
        }

        public String toString() {
            FileInfo fileInfo = this.fileInfo;
            int i = this.duration;
            String str = this.text;
            boolean z = this.wasRecognized;
            String arrays = Arrays.toString(this.waveform);
            boolean z2 = this.disableRecognition;
            StringBuilder sb = new StringBuilder("Voice(fileInfo=");
            sb.append(fileInfo);
            sb.append(", duration=");
            sb.append(i);
            sb.append(", text=");
            tse0.y(str, ", wasRecognized=", ", waveform=", sb, z);
            return nnm.i(arrays, ", disableRecognition=", Extension.C_BRAKE, sb, z2);
        }

        public Voice(@Json(name = "FileInfo") FileInfo fileInfo, @Json(name = "Duration") int i, @Json(name = "Text") String str, @Json(name = "WasRecognized") boolean z, @Json(name = "Waveform") byte[] bArr, @Json(name = "DisableRecognition") boolean z2) {
            this.fileInfo = fileInfo;
            this.duration = i;
            this.text = str;
            this.wasRecognized = z;
            this.waveform = bArr;
            this.disableRecognition = z2;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "", "id", "", "name", "", "size", "id2", "source", "", "<init>", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/Integer;)Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$FileInfo;", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FileInfo {

        @xuf0(tag = 1)
        public final long id;

        @xuf0(tag = 4)
        public final String id2;

        @xuf0(tag = 2)
        public final String name;

        @xuf0(tag = 3)
        public final long size;

        @xuf0(tag = 6)
        public final Integer source;

        public /* synthetic */ FileInfo(long j, String str, long j2, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num);
        }

        public static /* synthetic */ FileInfo copy$default(FileInfo fileInfo, long j, String str, long j2, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fileInfo.id;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                str = fileInfo.name;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                j2 = fileInfo.size;
            }
            long j4 = j2;
            if ((i & 8) != 0) {
                str2 = fileInfo.id2;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                num = fileInfo.source;
            }
            return fileInfo.copy(j3, str3, j4, str4, num);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: component4, reason: from getter */
        public final String getId2() {
            return this.id2;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getSource() {
            return this.source;
        }

        public final FileInfo copy(@Json(name = "Id") long id, @Json(name = "Name") String name, @Json(name = "Size") long size, @Json(name = "Id2") String id2, @Json(name = "Source") Integer source) {
            return new FileInfo(id, name, size, id2, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileInfo)) {
                return false;
            }
            FileInfo fileInfo = (FileInfo) other;
            return this.id == fileInfo.id && jl40.l(this.name, fileInfo.name) && this.size == fileInfo.size && jl40.l(this.id2, fileInfo.id2) && jl40.l(this.source, fileInfo.source);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.name;
            int c = qv10.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.size);
            String str2 = this.id2;
            int hashCode2 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.source;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            long j = this.id;
            String str = this.name;
            long j2 = this.size;
            String str2 = this.id2;
            Integer num = this.source;
            StringBuilder k = x4e.k("FileInfo(id=", j, ", name=", str);
            x4e.A(j2, ", size=", ", id2=", k);
            k.append(str2);
            k.append(", source=");
            k.append(num);
            k.append(Extension.C_BRAKE);
            return k.toString();
        }

        public FileInfo(@Json(name = "Id") long j, @Json(name = "Name") String str, @Json(name = "Size") long j2, @Json(name = "Id2") String str2, @Json(name = "Source") Integer num) {
            this.id = j;
            this.name = str;
            this.size = j2;
            this.id2 = str2;
            this.source = num;
        }

        public FileInfo() {
            this(0L, null, 0L, null, null, 31, null);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\fHÆ\u0003JJ\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0003\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;", "", "version", "", "voteCount", "", "answers", "", "recentVoters", "", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "isCompleted", "", "<init>", "(JI[I[Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;Z)V", "[Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "component1", "component2", "component3", "component4", "()[Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "component5", "copy", "(JI[I[Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;Z)Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$PollResult;", "equals", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PollResult {

        @xuf0(tag = 3)
        public final int[] answers;

        @xuf0(tag = 5)
        public final boolean isCompleted;

        @xuf0(tag = 4)
        public final ReducedUserInfo[] recentVoters;

        @xuf0(tag = 1)
        public final long version;

        @xuf0(tag = 2)
        public final int voteCount;

        public /* synthetic */ PollResult(long j, int i, int[] iArr, ReducedUserInfo[] reducedUserInfoArr, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : iArr, (i2 & 8) != 0 ? null : reducedUserInfoArr, (i2 & 16) != 0 ? false : z);
        }

        public static /* synthetic */ PollResult copy$default(PollResult pollResult, long j, int i, int[] iArr, ReducedUserInfo[] reducedUserInfoArr, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = pollResult.version;
            }
            long j2 = j;
            if ((i2 & 2) != 0) {
                i = pollResult.voteCount;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                iArr = pollResult.answers;
            }
            int[] iArr2 = iArr;
            if ((i2 & 8) != 0) {
                reducedUserInfoArr = pollResult.recentVoters;
            }
            ReducedUserInfo[] reducedUserInfoArr2 = reducedUserInfoArr;
            if ((i2 & 16) != 0) {
                z = pollResult.isCompleted;
            }
            return pollResult.copy(j2, i3, iArr2, reducedUserInfoArr2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getVersion() {
            return this.version;
        }

        /* renamed from: component2, reason: from getter */
        public final int getVoteCount() {
            return this.voteCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int[] getAnswers() {
            return this.answers;
        }

        /* renamed from: component4, reason: from getter */
        public final ReducedUserInfo[] getRecentVoters() {
            return this.recentVoters;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsCompleted() {
            return this.isCompleted;
        }

        public final PollResult copy(@Json(name = "Version") long version, @Json(name = "VotedCount") int voteCount, @Json(name = "Answers") int[] answers, @Json(name = "RecentVoters") ReducedUserInfo[] recentVoters, @Json(name = "Completed") boolean isCompleted) {
            return new PollResult(version, voteCount, answers, recentVoters, isCompleted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollResult)) {
                return false;
            }
            PollResult pollResult = (PollResult) other;
            return this.version == pollResult.version && this.voteCount == pollResult.voteCount && jl40.l(this.answers, pollResult.answers) && jl40.l(this.recentVoters, pollResult.recentVoters) && this.isCompleted == pollResult.isCompleted;
        }

        public int hashCode() {
            int b = oyr.b(this.voteCount, Long.hashCode(this.version) * 31, 31);
            int[] iArr = this.answers;
            int hashCode = (b + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
            ReducedUserInfo[] reducedUserInfoArr = this.recentVoters;
            return Boolean.hashCode(this.isCompleted) + ((hashCode + (reducedUserInfoArr != null ? Arrays.hashCode(reducedUserInfoArr) : 0)) * 31);
        }

        public String toString() {
            long j = this.version;
            int i = this.voteCount;
            String arrays = Arrays.toString(this.answers);
            String arrays2 = Arrays.toString(this.recentVoters);
            boolean z = this.isCompleted;
            StringBuilder sb = new StringBuilder("PollResult(version=");
            sb.append(j);
            sb.append(", voteCount=");
            sb.append(i);
            g8e.D(sb, ", answers=", arrays, ", recentVoters=", arrays2);
            return xra1.a(sb, ", isCompleted=", z, Extension.C_BRAKE);
        }

        public PollResult(@Json(name = "Version") long j, @Json(name = "VotedCount") int i, @Json(name = "Answers") int[] iArr, @Json(name = "RecentVoters") ReducedUserInfo[] reducedUserInfoArr, @Json(name = "Completed") boolean z) {
            this.version = j;
            this.voteCount = i;
            this.answers = iArr;
            this.recentVoters = reducedUserInfoArr;
            this.isCompleted = z;
        }

        public PollResult() {
            this(0L, 0, null, null, false, 31, null);
        }
    }

    public PlainMessage(@Json(name = "Text") Text text, @Json(name = "Image") Image image, @Json(name = "MiscFile") File file, @Json(name = "Sticker") Sticker sticker, @Json(name = "Card") Card card, @Json(name = "Gallery") Gallery gallery, @Json(name = "Voice") Voice voice, @Json(name = "Poll") Poll poll, @Json(name = "ChatId") String str, @Json(name = "Timestamp") long j, @Json(name = "ForwardedMessageRefs") MessageRef[] messageRefArr, @Json(name = "CustomPayload") CustomPayload customPayload, @Json(name = "MentionedUserIds") String[] strArr, @Json(name = "PayloadId") String str2, @Json(name = "UrlPreviewDisabled") boolean z, @Json(name = "NotificationText") String str3, @Json(name = "IsImportant") boolean z2, @Json(name = "ActionButtonsHolder") AiBotActions aiBotActions, @Json(name = "SuggestButtonsHolder") Suggests suggests, @Json(name = "ForwardedMessageStyles") ForwardedMessageStyle[] forwardedMessageStyleArr) {
        this.text = text;
        this.image = image;
        this.file = file;
        this.sticker = sticker;
        this.card = card;
        this.gallery = gallery;
        this.voice = voice;
        this.poll = poll;
        this.chatId = str;
        this.timestamp = j;
        this.forwardedMessageRefs = messageRefArr;
        this.customPayload = customPayload;
        this.mentionedUserIds = strArr;
        this.payloadId = str2;
        this.urlPreviewDisabled = z;
        this.notificationText = str3;
        this.isStarred = z2;
        this.aiBotActionsHolder = aiBotActions;
        this.suggestsHolder = suggests;
        this.forwardedMessageStyles = forwardedMessageStyleArr;
    }
}
