package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.plus.log.api.LogPriority;
import defpackage.ftb;
import defpackage.g8e;
import defpackage.hzk;
import defpackage.jl40;
import defpackage.pgz;
import defpackage.w511;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class c {
    public final hzk a;
    public final ftb b;
    public final pgz c;

    public c(hzk hzkVar, ftb ftbVar, pgz pgzVar) {
        this.a = hzkVar;
        this.b = ftbVar;
        this.c = pgzVar;
    }

    public static boolean b(String str) {
        Object failure;
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            return false;
        }
        Uri uri = (Uri) failure;
        if (!jl40.l(uri.getScheme(), Constants.SCHEME)) {
            CounterOffersLinkInteractor$InternalAction.Companion.getClass();
            if (a.a(uri) == null) {
                return false;
            }
        }
        return true;
    }

    public final void a(String str) {
        Object failure;
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        pgz pgzVar = this.c;
        if (a != null) {
            LogPriority logPriority = LogPriority.ERROR;
            if (pgzVar.e(logPriority)) {
                pgzVar.b(logPriority, "CounterOffersLinkInteractor", "Could not parse URI in handleLink method", a);
                return;
            }
            return;
        }
        Uri uri = (Uri) failure;
        if (jl40.l(uri.getScheme(), Constants.SCHEME)) {
            LogPriority logPriority2 = LogPriority.DEBUG;
            if (pgzVar.e(logPriority2)) {
                pgzVar.a(logPriority2, "CounterOffersLinkInteractor", g8e.m(uri, "Uri ", " is handled as web action"));
            }
            this.a.k(str);
            return;
        }
        LogPriority logPriority3 = LogPriority.DEBUG;
        if (pgzVar.e(logPriority3)) {
            pgzVar.a(logPriority3, "CounterOffersLinkInteractor", g8e.m(uri, "Uri ", " is handled as internal action"));
        }
        CounterOffersLinkInteractor$InternalAction.Companion.getClass();
        CounterOffersLinkInteractor$InternalAction a2 = a.a(uri);
        int i = a2 == null ? -1 : b.a[a2.ordinal()];
        if (i == -1) {
            LogPriority logPriority4 = LogPriority.WARNING;
            if (pgzVar.e(logPriority4)) {
                pgzVar.a(logPriority4, "CounterOffersLinkInteractor", g8e.m(uri, "Unexpected internal action ", " is ignored"));
                return;
            }
            return;
        }
        if (i == 1 || i == 2) {
            this.b.b();
        } else {
            w511.b();
        }
    }
}
