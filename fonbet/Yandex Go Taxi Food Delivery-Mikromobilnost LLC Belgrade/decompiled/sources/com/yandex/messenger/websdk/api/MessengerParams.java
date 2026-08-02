package com.yandex.messenger.websdk.api;

import defpackage.evu0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.y220;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/messenger/websdk/api/MessengerParams;", "", "y220", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MessengerParams {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final MessengerEnvironment e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final y220 i;

    public MessengerParams(String str, long j, String str2, String str3, MessengerEnvironment messengerEnvironment, boolean z, boolean z2, boolean z3, y220 y220Var) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = messengerEnvironment;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = y220Var;
    }

    public final String a() {
        String str = this.c;
        if (evu0.J(str)) {
            str = null;
        }
        return str != null ? "android_".concat(str) : ConstantDeviceInfo.APP_PLATFORM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessengerParams)) {
            return false;
        }
        MessengerParams messengerParams = (MessengerParams) obj;
        return this.a.equals(messengerParams.a) && this.b == messengerParams.b && jl40.l(this.c, messengerParams.c) && jl40.l(this.d, messengerParams.d) && this.e.equals(messengerParams.e) && this.f == messengerParams.f && this.g == messengerParams.g && this.h == messengerParams.h && jl40.l(this.i, messengerParams.i);
    }

    public final int hashCode() {
        int b = unr0.b(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int e = unr0.e(unr0.e(unr0.e(unr0.e((this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 961, 31, false), 31, this.f), 31, this.g), 31, this.h);
        y220 y220Var = this.i;
        return unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((e + (y220Var == null ? 0 : y220Var.hashCode())) * 31, 31, false), 31, false), 31, true), 31, false), 31, true), 31, false), 29791, false), 31, false);
    }

    public final String toString() {
        StringBuilder l = x4e.l("MessengerParams(serviceId=", this.a, ", originService=", this.b);
        g8e.D(l, ", workspace=", this.c, ", uuid=", this.d);
        l.append(", environment=");
        l.append(this.e);
        l.append(", locale=null, autoCreateAnonymousAccount=false, disableStikers=");
        l.append(this.f);
        n.z(", disableDisplayRestriction=", ", voice=", l, this.g, this.h);
        l.append(", translatorParams=");
        l.append(this.i);
        l.append(", enableChatList=false, backNavigationEnabled=false, enableChatListSync=true, waitChatHistory=false, allowHttpCounters=true, detailedCounters=false, enableImportantMessages=false, themeParams=null, customWebParams=null, useWebViewPageApi=false, debugConfiguration=null)");
        return l.toString();
    }
}
