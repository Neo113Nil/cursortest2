package com.yandex.messaging.internal.entities;

import defpackage.bvu0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.z83;
import java.util.UUID;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatId;", "", "PrivateChatId", "GeneralChatId", "ThreadId", "UnknownChatId", "Companion", "Lcom/yandex/messaging/internal/entities/ChatId$GeneralChatId;", "Lcom/yandex/messaging/internal/entities/ChatId$PrivateChatId;", "Lcom/yandex/messaging/internal/entities/ChatId$ThreadId;", "Lcom/yandex/messaging/internal/entities/ChatId$UnknownChatId;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ChatId {
    public final String a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatId$Companion;", "", "", "UUID_LENGTH", CA20Status.STATUS_USER_I, "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ChatId a(String str) {
            if (e(str)) {
                return new PrivateChatId(str);
            }
            if (f(str)) {
                return new ThreadId(str);
            }
            int d = d(str);
            return (d < 0 || d >= 100 || b(str) < 0) ? new UnknownChatId(str) : new GeneralChatId(str);
        }

        public static int b(String str) {
            Integer c = c(str);
            if (c != null) {
                return c.intValue();
            }
            return -1;
        }

        public static Integer c(String str) {
            if (evu0.G(str, '/', 0, 6) < 1) {
                return null;
            }
            return bvu0.l(10, evu0.f0('/', evu0.c0('/', str, ""), ""));
        }

        public static int d(String str) {
            Integer l = e(str) ? null : bvu0.l(10, evu0.f0('/', str, ""));
            if (l != null) {
                return l.intValue();
            }
            return -1;
        }

        public static boolean e(String str) {
            if (str.length() == 73 && str.charAt(36) == '_') {
                try {
                    UUID.fromString(str.substring(0, 36));
                    UUID.fromString(str.substring(37));
                    return true;
                } catch (IllegalArgumentException unused) {
                }
            }
            return false;
        }

        public static boolean f(String str) {
            return d(str) >= 100;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatId$GeneralChatId;", "Lcom/yandex/messaging/internal/entities/ChatId;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GeneralChatId extends ChatId {
        public final String b;
        public final int c;
        public final String d;

        public GeneralChatId(String str) {
            super(str);
            this.b = str;
            this.c = Companion.d(str);
            Companion.b(str);
            String str2 = null;
            if (evu0.G(str, '/', 0, 6) >= 1) {
                String e0 = evu0.e0('/', str, "");
                try {
                    UUID.fromString(e0);
                    str2 = e0;
                } catch (IllegalArgumentException unused) {
                }
            }
            this.d = str2;
            z83.i();
        }

        @Override // com.yandex.messaging.internal.entities.ChatId
        public final Integer a() {
            return Integer.valueOf(this.c);
        }

        @Override // com.yandex.messaging.internal.entities.ChatId
        public final ThreadId b(long j) {
            int i = this.c + 100;
            String str = this.b;
            return new ThreadId(i + "/" + evu0.c0('/', str, str) + "_" + j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GeneralChatId) && jl40.l(this.b, ((GeneralChatId) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oyr.p("GeneralChatId(slashedId=", this.b, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatId$ThreadId;", "Lcom/yandex/messaging/internal/entities/ChatId;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ThreadId extends ChatId {
        public final String b;
        public final int c;
        public final long d;

        public ThreadId(String str) {
            super(str);
            this.b = str;
            int d = Companion.d(str);
            this.c = d;
            Companion.b(str);
            Long m = bvu0.m(10, evu0.e0('_', str, ""));
            long longValue = m != null ? m.longValue() : -1L;
            this.d = longValue;
            if (d >= 100) {
                int i = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
            }
            z83.i();
        }

        @Override // com.yandex.messaging.internal.entities.ChatId
        public final Integer a() {
            return Integer.valueOf(this.c);
        }

        @Override // com.yandex.messaging.internal.entities.ChatId
        public final ThreadId b(long j) {
            throw new IllegalStateException("Inapplicable for threads");
        }

        public final ChatId c() {
            String str = this.b;
            String h0 = evu0.h0('_', str, str);
            if (cvu0.x(h0, "110/0/", false)) {
                return new PrivateChatId(evu0.d0(h0, "110/0/", h0));
            }
            if (cvu0.x(h0, "1000/0/", false)) {
                return new UnknownChatId(evu0.d0(h0, "1000/0/", h0));
            }
            int i = this.c;
            if (i < 100) {
                return Companion.a(h0);
            }
            return Companion.a((i - 100) + "/" + evu0.c0('/', h0, h0));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ThreadId) && jl40.l(this.b, ((ThreadId) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oyr.p("ThreadId(slashedIdWithTimestamp=", this.b, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatId$UnknownChatId;", "Lcom/yandex/messaging/internal/entities/ChatId;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnknownChatId extends ChatId {
        public final String b;
        public final int c;

        public UnknownChatId(String str) {
            super(str);
            this.b = str;
            this.c = Companion.d(str);
        }

        @Override // com.yandex.messaging.internal.entities.ChatId
        public final Integer a() {
            return Integer.valueOf(this.c);
        }

        @Override // com.yandex.messaging.internal.entities.ChatId
        public final ThreadId b(long j) {
            String str = this.b;
            int i = this.c;
            if (i < 0) {
                return new ThreadId("1000/0/" + str + "_" + j);
            }
            return new ThreadId((i + 100) + "/" + evu0.c0('/', str, str) + "_" + j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownChatId) && jl40.l(this.b, ((UnknownChatId) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oyr.p("UnknownChatId(textId=", this.b, Extension.C_BRAKE);
        }
    }

    public ChatId(String str) {
        this.a = str;
    }

    public abstract Integer a();

    public abstract ThreadId b(long j);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/ChatId$PrivateChatId;", "Lcom/yandex/messaging/internal/entities/ChatId;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrivateChatId extends ChatId {
        public final String b;

        public PrivateChatId(String str, String str2) {
            this(str.compareTo(str2) < 0 ? g8e.p(str, "_", str2) : g8e.p(str2, "_", str));
        }

        @Override // com.yandex.messaging.internal.entities.ChatId
        public final Integer a() {
            throw new IllegalStateException("Private chats have no type");
        }

        @Override // com.yandex.messaging.internal.entities.ChatId
        public final ThreadId b(long j) {
            return new ThreadId("110/0/" + this.b + "_" + j);
        }

        public final String c() {
            String str = this.a;
            return Companion.e(str) ? str.substring(0, 36) : "";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivateChatId) && jl40.l(this.b, ((PrivateChatId) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oyr.p("PrivateChatId(underscopedId=", this.b, Extension.C_BRAKE);
        }

        public PrivateChatId(String str) {
            super(str);
            this.b = str;
        }
    }
}
