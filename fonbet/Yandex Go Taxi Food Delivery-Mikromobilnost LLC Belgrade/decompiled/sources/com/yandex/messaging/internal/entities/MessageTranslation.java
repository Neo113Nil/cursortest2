package com.yandex.messaging.internal.entities;

import defpackage.b64;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xyz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageTranslation;", "", "Message", "Forward", "Text", "Status", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MessageTranslation {
    public final Message a;
    public final Text b;
    public final List c;
    public final Status d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageTranslation$Forward;", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Forward {
        public final long a;
        public final Text b;

        public Forward(long j, Text text) {
            this.a = j;
            this.b = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Forward)) {
                return false;
            }
            Forward forward = (Forward) obj;
            return this.a == forward.a && this.b.equals(forward.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Forward(originalHistoryId=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageTranslation$Message;", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message {
        public final String a;
        public final long b;
        public final long c;
        public final String d;

        public Message(long j, String str, long j2, String str2) {
            this.a = str;
            this.b = j;
            this.c = j2;
            this.d = str2;
        }

        public static Message a(Message message, long j) {
            return new Message(j, message.a, message.c, message.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return jl40.l(this.a, message.a) && this.b == message.b && this.c == message.c && jl40.l(this.d, message.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder l = x4e.l("Message(chatId=", this.a, ", historyId=", this.b);
            x4e.A(this.c, ", translatedVersion=", ", translatedLang=", l);
            return oyr.t(l, this.d, Extension.C_BRAKE);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageTranslation$Status;", "", "PENDING", "DONE", "Lcom/yandex/messaging/internal/entities/MessageTranslation$Status$DONE;", "Lcom/yandex/messaging/internal/entities/MessageTranslation$Status$PENDING;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Status {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageTranslation$Status$DONE;", "Lcom/yandex/messaging/internal/entities/MessageTranslation$Status;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DONE extends Status {
            public static final DONE a = new DONE();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageTranslation$Status$PENDING;", "Lcom/yandex/messaging/internal/entities/MessageTranslation$Status;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PENDING extends Status {
            public static final PENDING a = new PENDING();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageTranslation$Text;", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {
        public final String a;
        public final String b;
        public final List c;
        public final i3y d = a.a(new xyz(27, this));

        public Text(String str, String str2, List list) {
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return this.a.equals(text.a) && this.b.equals(text.b) && jl40.l(this.c, text.c);
        }

        public final int hashCode() {
            int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
            List list = this.c;
            return b + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return ly3.s(b64.v("Text(originalLang=", this.a, ", translatedText=", this.b, ", translatedSuggests="), this.c, Extension.C_BRAKE);
        }
    }

    public MessageTranslation(Message message, Text text, ArrayList arrayList, Status status) {
        this.a = message;
        this.b = text;
        this.c = arrayList;
        this.d = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTranslation)) {
            return false;
        }
        MessageTranslation messageTranslation = (MessageTranslation) obj;
        return this.a.equals(messageTranslation.a) && jl40.l(this.b, messageTranslation.b) && jl40.l(this.c, messageTranslation.c) && this.d.equals(messageTranslation.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        List list = this.c;
        return this.d.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MessageTranslation(message=" + this.a + ", text=" + this.b + ", forwards=" + this.c + ", status=" + this.d + Extension.C_BRAKE;
    }
}
