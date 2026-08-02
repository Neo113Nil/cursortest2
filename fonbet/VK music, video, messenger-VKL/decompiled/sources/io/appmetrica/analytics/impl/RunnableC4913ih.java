package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.jsonwebtoken.JwtParser;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;
import xsna.pn00;

/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4913ih implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C4937jf y = C5342za.I.y();
        if (timePassedChecker.didTimePassMillis(y.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pair = new Pair("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pair2 = new Pair("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pair3 = new Pair("patch", Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(kotlinVersion.getMinor());
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(kotlinVersion.getPatch());
            Map k = pn00.k(pair, pair2, pair3, new Pair("version", sb.toString()));
            C4710ak c4710ak = AbstractC5326yj.a;
            c4710ak.getClass();
            c4710ak.a(new Zj("kotlin_version", k));
            y.c(systemTimeProvider.currentTimeMillis()).b();
        }
    }
}
