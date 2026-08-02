package com.yandex.quark.webchat.params;

import defpackage.b64;
import defpackage.be41;
import defpackage.ce41;
import defpackage.de41;
import defpackage.ee41;
import defpackage.fe41;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class WebChatParams {
    public final boolean a;
    public final String b;
    public final fe41 c;
    public final ee41 d;
    public final be41 e;
    public final DialogSessionMode f;
    public final ce41 g;
    public final de41 h;
    public final a i;
    public final Set j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/webchat/params/WebChatParams$DialogSessionMode;", "", "WEB", "SPLIT", "NATIVE", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DialogSessionMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DialogSessionMode[] $VALUES;
        public static final DialogSessionMode NATIVE;
        public static final DialogSessionMode SPLIT;
        public static final DialogSessionMode WEB;

        static {
            DialogSessionMode dialogSessionMode = new DialogSessionMode("WEB", 0);
            WEB = dialogSessionMode;
            DialogSessionMode dialogSessionMode2 = new DialogSessionMode("SPLIT", 1);
            SPLIT = dialogSessionMode2;
            DialogSessionMode dialogSessionMode3 = new DialogSessionMode("NATIVE", 2);
            NATIVE = dialogSessionMode3;
            DialogSessionMode[] dialogSessionModeArr = {dialogSessionMode, dialogSessionMode2, dialogSessionMode3};
            $VALUES = dialogSessionModeArr;
            $ENTRIES = kotlin.enums.a.a(dialogSessionModeArr);
        }

        public static DialogSessionMode valueOf(String str) {
            return (DialogSessionMode) Enum.valueOf(DialogSessionMode.class, str);
        }

        public static DialogSessionMode[] values() {
            return (DialogSessionMode[]) $VALUES.clone();
        }
    }

    public WebChatParams(int i) {
        fe41 fe41Var = new fe41();
        ee41 ee41Var = new ee41();
        DialogSessionMode dialogSessionMode = DialogSessionMode.WEB;
        de41 de41Var = new de41();
        a aVar = new a(0);
        this.a = true;
        this.b = null;
        this.c = fe41Var;
        this.d = ee41Var;
        this.e = be41.a;
        this.f = dialogSessionMode;
        this.g = ce41.a;
        this.h = de41Var;
        this.i = aVar;
        this.j = EmptySet.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebChatParams)) {
            return false;
        }
        WebChatParams webChatParams = (WebChatParams) obj;
        return this.a == webChatParams.a && jl40.l(this.b, webChatParams.b) && jl40.l(this.c, webChatParams.c) && jl40.l(this.d, webChatParams.d) && jl40.l(this.e, webChatParams.e) && this.f == webChatParams.f && jl40.l(this.g, webChatParams.g) && jl40.l(this.h, webChatParams.h) && jl40.l(this.i, webChatParams.i) && jl40.l(this.j, webChatParams.j);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, false);
        String str = this.b;
        int e2 = unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 961)) * 31)) * 31, 31, false);
        this.e.getClass();
        int hashCode = (this.f.hashCode() + ((e2 - 975879839) * 31)) * 31;
        this.g.getClass();
        int e3 = unr0.e((hashCode + 1848078239) * 31, 31, false);
        this.h.getClass();
        return Boolean.hashCode(false) + unr0.e(unr0.e(unr0.e(g8e.e(this.j, unr0.e(unr0.e(unr0.e(unr0.e((this.i.hashCode() + ((Boolean.hashCode(false) + e3) * 31)) * 31, 31, false), 31, false), 31, false), 31, false), 31), 31, false), 31, false), 31, false);
    }

    public final String toString() {
        StringBuilder v = ly3.v("WebChatParams(shouldWaitAuthorizationBeforeInitialPageLoad=", ", unauthorizedUserAllowed=false, defaultUrl=", this.b, ", customSessionId=null, smartCookieRefresh=", this.a);
        v.append(this.c);
        v.append(", sharingParams=");
        v.append(this.d);
        v.append(", isScreenshotDetectionEnabled=false, idleRefreshConfiguration=");
        v.append(this.e);
        v.append(", dialogSessionMode=");
        v.append(this.f);
        v.append(", offlineConfig=");
        v.append(this.g);
        v.append(", allowCommunicationWithWebViaProtobuf=false, serverPermissionsCapabilityParams=");
        v.append(this.h);
        v.append(", authInvalidBridgeParams=");
        v.append(this.i);
        v.append(", fileAttachByCapability=false, multiFileInputEnabled=false, useComposeCompatWebView=false, useCapabilityLifecycleOwner=false, promisedFeaturesCapabilities=");
        v.append(this.j);
        v.append(", enableChatDeeplinkFix=false, isJsLoggingEnabled=false, shouldHandleAudioFocus=false, shouldSyncSessionIdCookie=false)");
        return v.toString();
    }

    public static final class a {
        public final int a;
        public final int b;
        public final double c;
        public final int d;

        public a(int i) {
            this.a = 2000;
            this.b = 8000;
            this.c = 2.0d;
            this.d = 5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Double.compare(this.c, aVar.c) == 0 && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + unr0.a(oyr.b(this.b, oyr.b(this.a, Boolean.hashCode(false) * 31, 31), 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder s = b64.s(this.a, this.b, "AuthInvalidBridgeParams(isEnabled=false, backoffMinIntervalMs=", ", backoffMaxDelayMs=", ", backoffFailureMultiplier=");
            s.append(this.c);
            s.append(", backoffMaxRetries=");
            s.append(this.d);
            s.append(Extension.C_BRAKE);
            return s.toString();
        }

        public a() {
            this(0);
        }
    }

    public WebChatParams() {
        this(4194303);
    }
}
