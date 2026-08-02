package com.yandex.messaging.action;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.ui.timeline.ChatOpenTarget;
import defpackage.hqr0;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction;", "", "NoAction", "OpenSettings", "OpenLastUnread", "OpenChatList", "OpenChat", "OpenChatFromShortcut", "Sharing", "Profile", "NotificationSettings", "ChatInfo", "ContactInfo", "ChannelInfo", "ChannelParticipants", "OpenMeeting", "OpenCallList", "ResolveInviteLink", "OpenTelemessengerOnboarding", "Lcom/yandex/messaging/action/MessagingAction$ChannelInfo;", "Lcom/yandex/messaging/action/MessagingAction$ChannelParticipants;", "Lcom/yandex/messaging/action/MessagingAction$ChatInfo;", "Lcom/yandex/messaging/action/MessagingAction$ContactInfo;", "Lcom/yandex/messaging/action/MessagingAction$NoAction;", "Lcom/yandex/messaging/action/MessagingAction$NotificationSettings;", "Lcom/yandex/messaging/action/MessagingAction$OpenCallList;", "Lcom/yandex/messaging/action/MessagingAction$OpenChat;", "Lcom/yandex/messaging/action/MessagingAction$OpenChatFromShortcut;", "Lcom/yandex/messaging/action/MessagingAction$OpenChatList;", "Lcom/yandex/messaging/action/MessagingAction$OpenLastUnread;", "Lcom/yandex/messaging/action/MessagingAction$OpenMeeting;", "Lcom/yandex/messaging/action/MessagingAction$OpenSettings;", "Lcom/yandex/messaging/action/MessagingAction$OpenTelemessengerOnboarding;", "Lcom/yandex/messaging/action/MessagingAction$Profile;", "Lcom/yandex/messaging/action/MessagingAction$ResolveInviteLink;", "Lcom/yandex/messaging/action/MessagingAction$Sharing;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MessagingAction {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$ChannelInfo;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChannelInfo extends MessagingAction {
        public final String a;

        public ChannelInfo(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChannelInfo) && this.a.equals(((ChannelInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("ChannelInfo(chatId=", this.a, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$ChannelParticipants;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChannelParticipants extends MessagingAction {
        public final String a;

        public ChannelParticipants(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChannelParticipants) && this.a.equals(((ChannelParticipants) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("ChannelParticipants(chatId=", this.a, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$ChatInfo;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatInfo extends MessagingAction {
        public final String a;

        public ChatInfo(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChatInfo) && this.a.equals(((ChatInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("ChatInfo(chatId=", this.a, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$ContactInfo;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContactInfo extends MessagingAction {
        public final String a;

        public ContactInfo(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactInfo) && this.a.equals(((ContactInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("ContactInfo(userId=", this.a, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$NoAction;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoAction extends MessagingAction {
        public static final NoAction a = new NoAction();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$NotificationSettings;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotificationSettings extends MessagingAction {
        public static final NotificationSettings a = new NotificationSettings();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$OpenChat;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenChat extends MessagingAction {
        public final ChatRequest a;
        public final String b;
        public final String c;
        public final ServerMessageRef d;
        public final boolean e;
        public final boolean f;
        public final String g;
        public final boolean h;
        public final ChatOpenTarget i;
        public final boolean j;
        public final String k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final String o;

        public OpenChat(ChatRequest chatRequest, String str, String str2, ServerMessageRef serverMessageRef, boolean z, boolean z2, String str3, boolean z3, ChatOpenTarget chatOpenTarget, boolean z4, String str4, boolean z5, boolean z6, String str5, int i) {
            String str6 = (i & 2) != 0 ? null : str;
            String str7 = (i & 4) != 0 ? null : str2;
            ServerMessageRef serverMessageRef2 = (i & 8) != 0 ? null : serverMessageRef;
            boolean z7 = (i & 16) != 0 ? false : z;
            boolean z8 = (i & 32) != 0 ? false : z2;
            String str8 = (i & 64) != 0 ? null : str3;
            boolean z9 = (i & 128) != 0 ? false : z3;
            ChatOpenTarget chatOpenTarget2 = (i & 256) != 0 ? null : chatOpenTarget;
            boolean z10 = (i & 512) != 0 ? false : z4;
            String str9 = (i & 1024) != 0 ? null : str4;
            boolean z11 = (i & 2048) != 0 ? false : z5;
            boolean z12 = (i & 4096) != 0 ? false : z6;
            boolean z13 = (i & 8192) == 0;
            String str10 = (i & 16384) != 0 ? null : str5;
            this.a = chatRequest;
            this.b = str6;
            this.c = str7;
            this.d = serverMessageRef2;
            this.e = z7;
            this.f = z8;
            this.g = str8;
            this.h = z9;
            this.i = chatOpenTarget2;
            this.j = z10;
            this.k = str9;
            this.l = z11;
            this.m = z12;
            this.n = z13;
            this.o = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenChat)) {
                return false;
            }
            OpenChat openChat = (OpenChat) obj;
            return this.a.equals(openChat.a) && jl40.l(this.b, openChat.b) && jl40.l(this.c, openChat.c) && jl40.l(this.d, openChat.d) && this.e == openChat.e && this.f == openChat.f && jl40.l(this.g, openChat.g) && this.h == openChat.h && this.i == openChat.i && this.j == openChat.j && jl40.l(this.k, openChat.k) && this.l == openChat.l && this.m == openChat.m && this.n == openChat.n && jl40.l(this.o, openChat.o);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ServerMessageRef serverMessageRef = this.d;
            int e = unr0.e(unr0.e((hashCode3 + (serverMessageRef == null ? 0 : serverMessageRef.hashCode())) * 31, 31, this.e), 31, this.f);
            String str3 = this.g;
            int e2 = unr0.e((e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h);
            ChatOpenTarget chatOpenTarget = this.i;
            int e3 = unr0.e((e2 + (chatOpenTarget == null ? 0 : chatOpenTarget.hashCode())) * 31, 31, this.j);
            String str4 = this.k;
            int e4 = unr0.e(unr0.e(unr0.e((e3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n);
            String str5 = this.o;
            return e4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenChat(chatRequest=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", payload=");
            sb.append(this.c);
            sb.append(", messageRef=");
            sb.append(this.d);
            sb.append(", invite=");
            nnm.v(", join=", ", botRequest=", sb, this.e, this.f);
            tse0.y(this.g, ", openSearch=", ", chatOpenTarget=", sb, this.h);
            sb.append(this.i);
            sb.append(", fromNotification=");
            sb.append(this.j);
            sb.append(", supportContextJson=");
            tse0.y(this.k, ", openKeyboard=", ", isFromPersonalInviteLink=", sb, this.l);
            nnm.v(", considerJoinWall=", ", action=", sb, this.m, this.n);
            return oyr.t(sb, this.o, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$OpenChatFromShortcut;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenChatFromShortcut extends MessagingAction {
        public final ChatRequest a;

        public OpenChatFromShortcut(ChatRequest chatRequest) {
            this.a = chatRequest;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenChatFromShortcut) && this.a.equals(((OpenChatFromShortcut) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenChatFromShortcut(chatRequest=" + this.a + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$OpenChatList;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenChatList extends MessagingAction {
        public static final OpenChatList a = new OpenChatList();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$OpenLastUnread;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenLastUnread extends MessagingAction {
        public static final OpenLastUnread a = new OpenLastUnread();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$OpenMeeting;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenMeeting extends MessagingAction {
        public final String a;

        public OpenMeeting(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenMeeting) && this.a.equals(((OpenMeeting) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("OpenMeeting(meetingId=", this.a, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$OpenSettings;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenSettings extends MessagingAction {
        public static final OpenSettings a = new OpenSettings();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$OpenTelemessengerOnboarding;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenTelemessengerOnboarding extends MessagingAction {
        public static final OpenTelemessengerOnboarding a = new OpenTelemessengerOnboarding();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenTelemessengerOnboarding);
        }

        public final int hashCode() {
            return 315724936;
        }

        public final String toString() {
            return "OpenTelemessengerOnboarding";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$Profile;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Profile extends MessagingAction {
        public static final Profile a = new Profile();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$ResolveInviteLink;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ResolveInviteLink extends MessagingAction {
        public final String a;

        public ResolveInviteLink(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolveInviteLink) && jl40.l(this.a, ((ResolveInviteLink) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("ResolveInviteLink(token=", this.a, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$Sharing;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Sharing extends MessagingAction {
        public final hqr0 a;

        public Sharing(hqr0 hqr0Var) {
            this.a = hqr0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Sharing) && this.a.equals(((Sharing) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Sharing(data=" + this.a + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/action/MessagingAction$OpenCallList;", "Lcom/yandex/messaging/action/MessagingAction;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenCallList extends MessagingAction {
        public final boolean a;

        public OpenCallList(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenCallList) && this.a == ((OpenCallList) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return nzs.b("OpenCallList(clearNavigationStack=", Extension.C_BRAKE, this.a);
        }

        public OpenCallList() {
            this(false);
        }
    }
}
