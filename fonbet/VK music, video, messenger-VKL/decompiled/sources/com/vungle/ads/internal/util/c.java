package com.vungle.ads.internal.util;

import android.content.Intent;
import java.lang.ref.WeakReference;
import xsna.epx;

/* loaded from: classes7.dex */
public final class c {
    public final WeakReference a;
    public final Intent b;
    public final Intent c;
    public final com.vungle.ads.internal.ui.m d;

    public c(WeakReference weakReference, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        this.a = weakReference;
        this.b = intent;
        this.c = intent2;
        this.d = mVar;
    }

    public final com.vungle.ads.internal.ui.m a() {
        return this.d;
    }

    public final WeakReference b() {
        return this.a;
    }

    public final Intent c() {
        return this.b;
    }

    public final Intent d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Intent intent = this.b;
        int hashCode2 = (hashCode + (intent == null ? 0 : intent.hashCode())) * 31;
        Intent intent2 = this.c;
        int hashCode3 = (hashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
        com.vungle.ads.internal.ui.m mVar = this.d;
        return hashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("TargetActivityInfo(context=");
        a.append(this.a);
        a.append(", deepLinkOverrideIntent=");
        a.append(this.b);
        a.append(", defaultIntent=");
        a.append(this.c);
        a.append(", adOpenCallback=");
        a.append(this.d);
        a.append(')');
        return a.toString();
    }
}
