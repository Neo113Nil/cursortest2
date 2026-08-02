package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.ChatEventTypes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.kju0;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.x4e;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001qB¿\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0003\u0010$\u001a\u00020\n\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010'J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\fHÆ\u0003J\u0016\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010X\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00109J\u0014\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010\\\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010]\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010`\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010a\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010f\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010#HÆ\u0003J\t\u0010h\u001a\u00020\nHÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010<JÆ\u0002\u0010j\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0003\u0010$\u001a\u00020\n2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010kJ\u0013\u0010l\u001a\u00020\n2\b\u0010m\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010n\u001a\u00020oHÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010/R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001b\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\n\n\u0002\u00104\u001a\u0004\b;\u00103R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010=\u001a\u0004\b\u0014\u0010<R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010=\u001a\u0004\b>\u0010<R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010B\u001a\u0004\bC\u0010AR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010=\u001a\u0004\b\u001f\u0010<R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010$\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bN\u0010/R\u0015\u0010%\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010=\u001a\u0004\bO\u0010<¨\u0006r"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChatData;", "", "chatId", "", "version", "", "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "avatarId", "isPrivate", "", "createTimestamp", "", "members", "", "roles", "Lcom/yandex/messaging/core/net/entities/ChatData$Roles;", "role", "roleVersion", "rights", "isPublic", "channelPublicity", "inviteHash", "latitude", "longitude", "interlocutor", "Lcom/yandex/messaging/core/net/entities/UserData;", kju0.j, "Lcom/yandex/messaging/core/net/entities/Metadata;", "alias", "currentProfileId", "isTransient", "organizationIds", "", "supportedEvents", "Lcom/yandex/messaging/core/net/entities/proto/ChatEventTypes;", "hasGuests", "federative", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZD[Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/ChatData$Roles;Ljava/lang/String;Ljava/lang/Long;[Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/yandex/messaging/core/net/entities/UserData;Lcom/yandex/messaging/core/net/entities/Metadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;[JLcom/yandex/messaging/core/net/entities/proto/ChatEventTypes;ZLjava/lang/Boolean;)V", "getChatId", "()Ljava/lang/String;", "getVersion", "()J", "getName", "getDescription", "getAvatarId", "()Z", "getCreateTimestamp", "()D", "getMembers", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getRoles", "()Lcom/yandex/messaging/core/net/entities/ChatData$Roles;", "getRole", "getRoleVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRights", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannelPublicity", "getInviteHash", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getInterlocutor", "()Lcom/yandex/messaging/core/net/entities/UserData;", "getMetadata", "()Lcom/yandex/messaging/core/net/entities/Metadata;", "getAlias", "getCurrentProfileId", "getOrganizationIds", "()[J", "getSupportedEvents", "()Lcom/yandex/messaging/core/net/entities/proto/ChatEventTypes;", "getHasGuests", "getFederative", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZD[Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/ChatData$Roles;Ljava/lang/String;Ljava/lang/Long;[Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/yandex/messaging/core/net/entities/UserData;Lcom/yandex/messaging/core/net/entities/Metadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;[JLcom/yandex/messaging/core/net/entities/proto/ChatEventTypes;ZLjava/lang/Boolean;)Lcom/yandex/messaging/core/net/entities/ChatData;", "equals", "other", "hashCode", "", "toString", "Roles", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChatData {
    private final String alias;
    private final String avatarId;
    private final Boolean channelPublicity;
    private final String chatId;
    private final double createTimestamp;
    private final String currentProfileId;
    private final String description;
    private final Boolean federative;
    private final boolean hasGuests;
    private final UserData interlocutor;
    private final String inviteHash;
    private final boolean isPrivate;
    private final Boolean isPublic;
    private final Boolean isTransient;
    private final Double latitude;
    private final Double longitude;
    private final String[] members;
    private final Metadata metadata;
    private final String name;
    private final long[] organizationIds;
    private final String[] rights;
    private final String role;
    private final Long roleVersion;
    private final Roles roles;
    private final ChatEventTypes supportedEvents;
    private final long version;

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ChatData$Roles;", "", "admin", "", "", "<init>", "([Ljava/lang/String;)V", "getAdmin", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "copy", "([Ljava/lang/String;)Lcom/yandex/messaging/core/net/entities/ChatData$Roles;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Roles {
        private final String[] admin;

        public Roles(@Json(name = "admin") String[] strArr) {
            this.admin = strArr;
        }

        public static /* synthetic */ Roles copy$default(Roles roles, String[] strArr, int i, Object obj) {
            if ((i & 1) != 0) {
                strArr = roles.admin;
            }
            return roles.copy(strArr);
        }

        /* renamed from: component1, reason: from getter */
        public final String[] getAdmin() {
            return this.admin;
        }

        public final Roles copy(@Json(name = "admin") String[] admin) {
            return new Roles(admin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Roles) && jl40.l(this.admin, ((Roles) other).admin);
        }

        public final String[] getAdmin() {
            return this.admin;
        }

        public int hashCode() {
            String[] strArr = this.admin;
            if (strArr == null) {
                return 0;
            }
            return Arrays.hashCode(strArr);
        }

        public String toString() {
            return oyr.p("Roles(admin=", Arrays.toString(this.admin), Extension.C_BRAKE);
        }
    }

    public /* synthetic */ ChatData(String str, long j, String str2, String str3, String str4, boolean z, double d, String[] strArr, Roles roles, String str5, Long l, String[] strArr2, Boolean bool, Boolean bool2, String str6, Double d2, Double d3, UserData userData, Metadata metadata, String str7, String str8, Boolean bool3, long[] jArr, ChatEventTypes chatEventTypes, boolean z2, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? 0.0d : d, (i & 128) != 0 ? new String[0] : strArr, (i & 256) != 0 ? null : roles, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? new String[0] : strArr2, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : bool2, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : d2, (i & 65536) != 0 ? null : d3, (i & 131072) != 0 ? null : userData, (i & 262144) != 0 ? null : metadata, (i & 524288) != 0 ? null : str7, (i & 1048576) != 0 ? null : str8, (i & 2097152) != 0 ? null : bool3, (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? null : jArr, (i & SelfTester_JCP.ENCRYPT_CNT) != 0 ? null : chatEventTypes, (i & 16777216) != 0 ? false : z2, (i & SelfTester_JCP.DECRYPT_CFB) != 0 ? null : bool4);
    }

    public static /* synthetic */ ChatData copy$default(ChatData chatData, String str, long j, String str2, String str3, String str4, boolean z, double d, String[] strArr, Roles roles, String str5, Long l, String[] strArr2, Boolean bool, Boolean bool2, String str6, Double d2, Double d3, UserData userData, Metadata metadata, String str7, String str8, Boolean bool3, long[] jArr, ChatEventTypes chatEventTypes, boolean z2, Boolean bool4, int i, Object obj) {
        Boolean bool5;
        boolean z3;
        String str9 = (i & 1) != 0 ? chatData.chatId : str;
        long j2 = (i & 2) != 0 ? chatData.version : j;
        String str10 = (i & 4) != 0 ? chatData.name : str2;
        String str11 = (i & 8) != 0 ? chatData.description : str3;
        String str12 = (i & 16) != 0 ? chatData.avatarId : str4;
        boolean z4 = (i & 32) != 0 ? chatData.isPrivate : z;
        double d4 = (i & 64) != 0 ? chatData.createTimestamp : d;
        String[] strArr3 = (i & 128) != 0 ? chatData.members : strArr;
        Roles roles2 = (i & 256) != 0 ? chatData.roles : roles;
        String str13 = (i & 512) != 0 ? chatData.role : str5;
        Long l2 = (i & 1024) != 0 ? chatData.roleVersion : l;
        String[] strArr4 = (i & 2048) != 0 ? chatData.rights : strArr2;
        String str14 = str9;
        Boolean bool6 = (i & 4096) != 0 ? chatData.isPublic : bool;
        Boolean bool7 = (i & 8192) != 0 ? chatData.channelPublicity : bool2;
        String str15 = (i & 16384) != 0 ? chatData.inviteHash : str6;
        Double d5 = (i & 32768) != 0 ? chatData.latitude : d2;
        Double d6 = (i & 65536) != 0 ? chatData.longitude : d3;
        UserData userData2 = (i & 131072) != 0 ? chatData.interlocutor : userData;
        Metadata metadata2 = (i & 262144) != 0 ? chatData.metadata : metadata;
        String str16 = (i & 524288) != 0 ? chatData.alias : str7;
        String str17 = (i & 1048576) != 0 ? chatData.currentProfileId : str8;
        Boolean bool8 = (i & 2097152) != 0 ? chatData.isTransient : bool3;
        long[] jArr2 = (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? chatData.organizationIds : jArr;
        ChatEventTypes chatEventTypes2 = (i & SelfTester_JCP.ENCRYPT_CNT) != 0 ? chatData.supportedEvents : chatEventTypes;
        boolean z5 = (i & 16777216) != 0 ? chatData.hasGuests : z2;
        if ((i & SelfTester_JCP.DECRYPT_CFB) != 0) {
            z3 = z5;
            bool5 = chatData.federative;
        } else {
            bool5 = bool4;
            z3 = z5;
        }
        return chatData.copy(str14, j2, str10, str11, str12, z4, d4, strArr3, roles2, str13, l2, strArr4, bool6, bool7, str15, d5, d6, userData2, metadata2, str16, str17, bool8, jArr2, chatEventTypes2, z3, bool5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getRoleVersion() {
        return this.roleVersion;
    }

    /* renamed from: component12, reason: from getter */
    public final String[] getRights() {
        return this.rights;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getIsPublic() {
        return this.isPublic;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getChannelPublicity() {
        return this.channelPublicity;
    }

    /* renamed from: component15, reason: from getter */
    public final String getInviteHash() {
        return this.inviteHash;
    }

    /* renamed from: component16, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component17, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component18, reason: from getter */
    public final UserData getInterlocutor() {
        return this.interlocutor;
    }

    /* renamed from: component19, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component20, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* renamed from: component21, reason: from getter */
    public final String getCurrentProfileId() {
        return this.currentProfileId;
    }

    /* renamed from: component22, reason: from getter */
    public final Boolean getIsTransient() {
        return this.isTransient;
    }

    /* renamed from: component23, reason: from getter */
    public final long[] getOrganizationIds() {
        return this.organizationIds;
    }

    /* renamed from: component24, reason: from getter */
    public final ChatEventTypes getSupportedEvents() {
        return this.supportedEvents;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getHasGuests() {
        return this.hasGuests;
    }

    /* renamed from: component26, reason: from getter */
    public final Boolean getFederative() {
        return this.federative;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* renamed from: component7, reason: from getter */
    public final double getCreateTimestamp() {
        return this.createTimestamp;
    }

    /* renamed from: component8, reason: from getter */
    public final String[] getMembers() {
        return this.members;
    }

    /* renamed from: component9, reason: from getter */
    public final Roles getRoles() {
        return this.roles;
    }

    public final ChatData copy(@Json(name = "chat_id") String chatId, @Json(name = "version") long version, @Json(name = "name") String name, @Json(name = "description") String description, @Json(name = "avatar_id") String avatarId, @Json(name = "private") boolean isPrivate, @Json(name = "create_timestamp") double createTimestamp, @Json(name = "members") String[] members, @Json(name = "roles") Roles roles, @Json(name = "role") String role, @Json(name = "role_version") Long roleVersion, @Json(name = "rights") String[] rights, @Json(name = "public") Boolean isPublic, @Json(name = "is_public") Boolean channelPublicity, @Json(name = "invite_hash") String inviteHash, @Json(name = "latitude") Double latitude, @Json(name = "longitude") Double longitude, @Json(name = "user") UserData interlocutor, @Json(name = "metadata") Metadata metadata, @Json(name = "alias") String alias, @Json(name = "current_profile_id") String currentProfileId, @Json(name = "is_transient") Boolean isTransient, @Json(name = "organization_ids") long[] organizationIds, @Json(name = "supported_events") ChatEventTypes supportedEvents, @Json(name = "has_guests") boolean hasGuests, @Json(name = "federative") Boolean federative) {
        return new ChatData(chatId, version, name, description, avatarId, isPrivate, createTimestamp, members, roles, role, roleVersion, rights, isPublic, channelPublicity, inviteHash, latitude, longitude, interlocutor, metadata, alias, currentProfileId, isTransient, organizationIds, supportedEvents, hasGuests, federative);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatData)) {
            return false;
        }
        ChatData chatData = (ChatData) other;
        return jl40.l(this.chatId, chatData.chatId) && this.version == chatData.version && jl40.l(this.name, chatData.name) && jl40.l(this.description, chatData.description) && jl40.l(this.avatarId, chatData.avatarId) && this.isPrivate == chatData.isPrivate && Double.compare(this.createTimestamp, chatData.createTimestamp) == 0 && jl40.l(this.members, chatData.members) && jl40.l(this.roles, chatData.roles) && jl40.l(this.role, chatData.role) && jl40.l(this.roleVersion, chatData.roleVersion) && jl40.l(this.rights, chatData.rights) && jl40.l(this.isPublic, chatData.isPublic) && jl40.l(this.channelPublicity, chatData.channelPublicity) && jl40.l(this.inviteHash, chatData.inviteHash) && jl40.l(this.latitude, chatData.latitude) && jl40.l(this.longitude, chatData.longitude) && jl40.l(this.interlocutor, chatData.interlocutor) && jl40.l(this.metadata, chatData.metadata) && jl40.l(this.alias, chatData.alias) && jl40.l(this.currentProfileId, chatData.currentProfileId) && jl40.l(this.isTransient, chatData.isTransient) && jl40.l(this.organizationIds, chatData.organizationIds) && jl40.l(this.supportedEvents, chatData.supportedEvents) && this.hasGuests == chatData.hasGuests && jl40.l(this.federative, chatData.federative);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getAvatarId() {
        return this.avatarId;
    }

    public final Boolean getChannelPublicity() {
        return this.channelPublicity;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final double getCreateTimestamp() {
        return this.createTimestamp;
    }

    public final String getCurrentProfileId() {
        return this.currentProfileId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getFederative() {
        return this.federative;
    }

    public final boolean getHasGuests() {
        return this.hasGuests;
    }

    public final UserData getInterlocutor() {
        return this.interlocutor;
    }

    public final String getInviteHash() {
        return this.inviteHash;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String[] getMembers() {
        return this.members;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final long[] getOrganizationIds() {
        return this.organizationIds;
    }

    public final String[] getRights() {
        return this.rights;
    }

    public final String getRole() {
        return this.role;
    }

    public final Long getRoleVersion() {
        return this.roleVersion;
    }

    public final Roles getRoles() {
        return this.roles;
    }

    public final ChatEventTypes getSupportedEvents() {
        return this.supportedEvents;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int c = qv10.c(this.chatId.hashCode() * 31, 31, this.version);
        String str = this.name;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarId;
        int a = unr0.a(unr0.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isPrivate), 31, this.createTimestamp);
        String[] strArr = this.members;
        int hashCode3 = (a + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        Roles roles = this.roles;
        int hashCode4 = (hashCode3 + (roles == null ? 0 : roles.hashCode())) * 31;
        String str4 = this.role;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.roleVersion;
        int hashCode6 = (((hashCode5 + (l == null ? 0 : l.hashCode())) * 31) + Arrays.hashCode(this.rights)) * 31;
        Boolean bool = this.isPublic;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.channelPublicity;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.inviteHash;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.latitude;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.longitude;
        int hashCode11 = (hashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        UserData userData = this.interlocutor;
        int hashCode12 = (hashCode11 + (userData == null ? 0 : userData.hashCode())) * 31;
        Metadata metadata = this.metadata;
        int hashCode13 = (hashCode12 + (metadata == null ? 0 : metadata.hashCode())) * 31;
        String str6 = this.alias;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currentProfileId;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.isTransient;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        long[] jArr = this.organizationIds;
        int hashCode17 = (hashCode16 + (jArr == null ? 0 : Arrays.hashCode(jArr))) * 31;
        ChatEventTypes chatEventTypes = this.supportedEvents;
        int e = unr0.e((hashCode17 + (chatEventTypes == null ? 0 : chatEventTypes.hashCode())) * 31, 31, this.hasGuests);
        Boolean bool4 = this.federative;
        return e + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final Boolean isPublic() {
        return this.isPublic;
    }

    public final Boolean isTransient() {
        return this.isTransient;
    }

    public String toString() {
        String str = this.chatId;
        long j = this.version;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.avatarId;
        boolean z = this.isPrivate;
        double d = this.createTimestamp;
        String arrays = Arrays.toString(this.members);
        Roles roles = this.roles;
        String str5 = this.role;
        Long l = this.roleVersion;
        String arrays2 = Arrays.toString(this.rights);
        Boolean bool = this.isPublic;
        Boolean bool2 = this.channelPublicity;
        String str6 = this.inviteHash;
        Double d2 = this.latitude;
        Double d3 = this.longitude;
        UserData userData = this.interlocutor;
        Metadata metadata = this.metadata;
        String str7 = this.alias;
        String str8 = this.currentProfileId;
        Boolean bool3 = this.isTransient;
        String arrays3 = Arrays.toString(this.organizationIds);
        ChatEventTypes chatEventTypes = this.supportedEvents;
        boolean z2 = this.hasGuests;
        Boolean bool4 = this.federative;
        StringBuilder l2 = x4e.l("ChatData(chatId=", str, ", version=", j);
        g8e.D(l2, ", name=", str2, ", description=", str3);
        uw51.x(", avatarId=", str4, ", isPrivate=", l2, z);
        nzs.o(l2, ", createTimestamp=", d, ", members=");
        l2.append(arrays);
        l2.append(", roles=");
        l2.append(roles);
        l2.append(", role=");
        l2.append(str5);
        l2.append(", roleVersion=");
        l2.append(l);
        l2.append(", rights=");
        tse0.A(l2, arrays2, ", isPublic=", bool, ", channelPublicity=");
        l2.append(bool2);
        l2.append(", inviteHash=");
        l2.append(str6);
        l2.append(", latitude=");
        l2.append(d2);
        l2.append(", longitude=");
        l2.append(d3);
        l2.append(", interlocutor=");
        l2.append(userData);
        l2.append(", metadata=");
        l2.append(metadata);
        l2.append(", alias=");
        g8e.D(l2, str7, ", currentProfileId=", str8, ", isTransient=");
        l2.append(bool3);
        l2.append(", organizationIds=");
        l2.append(arrays3);
        l2.append(", supportedEvents=");
        l2.append(chatEventTypes);
        l2.append(", hasGuests=");
        l2.append(z2);
        l2.append(", federative=");
        return nzs.d(l2, bool4, Extension.C_BRAKE);
    }

    public ChatData(@Json(name = "chat_id") String str, @Json(name = "version") long j, @Json(name = "name") String str2, @Json(name = "description") String str3, @Json(name = "avatar_id") String str4, @Json(name = "private") boolean z, @Json(name = "create_timestamp") double d, @Json(name = "members") String[] strArr, @Json(name = "roles") Roles roles, @Json(name = "role") String str5, @Json(name = "role_version") Long l, @Json(name = "rights") String[] strArr2, @Json(name = "public") Boolean bool, @Json(name = "is_public") Boolean bool2, @Json(name = "invite_hash") String str6, @Json(name = "latitude") Double d2, @Json(name = "longitude") Double d3, @Json(name = "user") UserData userData, @Json(name = "metadata") Metadata metadata, @Json(name = "alias") String str7, @Json(name = "current_profile_id") String str8, @Json(name = "is_transient") Boolean bool3, @Json(name = "organization_ids") long[] jArr, @Json(name = "supported_events") ChatEventTypes chatEventTypes, @Json(name = "has_guests") boolean z2, @Json(name = "federative") Boolean bool4) {
        this.chatId = str;
        this.version = j;
        this.name = str2;
        this.description = str3;
        this.avatarId = str4;
        this.isPrivate = z;
        this.createTimestamp = d;
        this.members = strArr;
        this.roles = roles;
        this.role = str5;
        this.roleVersion = l;
        this.rights = strArr2;
        this.isPublic = bool;
        this.channelPublicity = bool2;
        this.inviteHash = str6;
        this.latitude = d2;
        this.longitude = d3;
        this.interlocutor = userData;
        this.metadata = metadata;
        this.alias = str7;
        this.currentProfileId = str8;
        this.isTransient = bool3;
        this.organizationIds = jArr;
        this.supportedEvents = chatEventTypes;
        this.hasGuests = z2;
        this.federative = bool4;
    }
}
