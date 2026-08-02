package com.yandex.go.safety.center.api;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.mkr0;
import defpackage.unr0;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/api/ShareRequestParam;", "", "Companion", "NotificationType", "$serializer", "com/yandex/go/safety/center/api/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShareRequestParam {
    public static final i Companion = new i();
    public static final i3y[] g;
    public final NotificationType a;
    public final List b;
    public final String c;
    public final String d;
    public final Float e;
    public final zzs f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/safety/center/api/ShareRequestParam$NotificationType;", "", "Companion", "com/yandex/go/safety/center/api/j", "SHARE_LOCATION", "EMERGENCY", "INSTRUCTION", "CONTACT_REQUEST", "CRASH_DETECTION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NotificationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ NotificationType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final NotificationType CONTACT_REQUEST;
        public static final NotificationType CRASH_DETECTION;
        public static final j Companion;
        public static final NotificationType EMERGENCY;
        public static final NotificationType INSTRUCTION;
        public static final NotificationType SHARE_LOCATION;

        static {
            NotificationType notificationType = new NotificationType("SHARE_LOCATION", 0);
            SHARE_LOCATION = notificationType;
            NotificationType notificationType2 = new NotificationType("EMERGENCY", 1);
            EMERGENCY = notificationType2;
            NotificationType notificationType3 = new NotificationType("INSTRUCTION", 2);
            INSTRUCTION = notificationType3;
            NotificationType notificationType4 = new NotificationType("CONTACT_REQUEST", 3);
            CONTACT_REQUEST = notificationType4;
            NotificationType notificationType5 = new NotificationType("CRASH_DETECTION", 4);
            CRASH_DETECTION = notificationType5;
            NotificationType[] notificationTypeArr = {notificationType, notificationType2, notificationType3, notificationType4, notificationType5};
            $VALUES = notificationTypeArr;
            $ENTRIES = kotlin.enums.a.a(notificationTypeArr);
            Companion = new j();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(2));
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new mkr0(0)), kotlin.a.b(lazyThreadSafetyMode, new mkr0(1)), null, null, null, null};
    }

    public /* synthetic */ ShareRequestParam(int i, NotificationType notificationType, List list, String str, String str2, Float f, zzs zzsVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = notificationType;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = zzsVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareRequestParam)) {
            return false;
        }
        ShareRequestParam shareRequestParam = (ShareRequestParam) obj;
        return this.a == shareRequestParam.a && jl40.l(this.b, shareRequestParam.b) && jl40.l(this.c, shareRequestParam.c) && jl40.l(this.d, shareRequestParam.d) && jl40.l(this.e, shareRequestParam.e) && jl40.l(this.f, shareRequestParam.f);
    }

    public final int hashCode() {
        NotificationType notificationType = this.a;
        int c = unr0.c((notificationType == null ? 0 : notificationType.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.e;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        zzs zzsVar = this.f;
        return hashCode3 + (zzsVar != null ? zzsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareRequestParam(notificationType=");
        sb.append(this.a);
        sb.append(", recipients=");
        sb.append(this.b);
        sb.append(", idempotencyKey=");
        g8e.D(sb, this.c, ", orderId=", this.d, ", accuracy=");
        sb.append(this.e);
        sb.append(", coordinates=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public ShareRequestParam(NotificationType notificationType, List list, String str, String str2, Float f, zzs zzsVar) {
        this.a = notificationType;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = f;
        this.f = zzsVar;
    }

    public ShareRequestParam() {
        this(null, EmptyList.a, null, null, null, null);
    }
}
