package com.yandex.go.dto.response;

import defpackage.ar;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/dto/response/Action$WebApp", "Lcom/yandex/go/dto/response/q1;", "Companion", "WebAppType", "$serializer", "com/yandex/go/dto/response/n1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$WebApp extends q1 {
    public static final n1 Companion = new n1();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(5)), null};
    public final WebAppType a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/Action$WebApp$WebAppType;", "", "Companion", "com/yandex/go/dto/response/o1", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class WebAppType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ WebAppType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final o1 Companion;
        public static final WebAppType UNKNOWN;

        static {
            WebAppType webAppType = new WebAppType("UNKNOWN", 0);
            UNKNOWN = webAppType;
            WebAppType[] webAppTypeArr = {webAppType};
            $VALUES = webAppTypeArr;
            $ENTRIES = kotlin.enums.a.a(webAppTypeArr);
            Companion = new o1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(11));
        }

        public static WebAppType valueOf(String str) {
            return (WebAppType) Enum.valueOf(WebAppType.class, str);
        }

        public static WebAppType[] values() {
            return (WebAppType[]) $VALUES.clone();
        }
    }

    public Action$WebApp(int i, WebAppType webAppType, String str) {
        this.a = (i & 1) == 0 ? WebAppType.UNKNOWN : webAppType;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.WEB_APP_ACTION;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$WebApp)) {
            return false;
        }
        Action$WebApp action$WebApp = (Action$WebApp) obj;
        return this.a == action$WebApp.a && jl40.l(this.b, action$WebApp.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebApp(webAppType=" + this.a + ", url=" + this.b + Extension.C_BRAKE;
    }

    public Action$WebApp() {
        this.a = WebAppType.UNKNOWN;
        this.b = "";
    }
}
