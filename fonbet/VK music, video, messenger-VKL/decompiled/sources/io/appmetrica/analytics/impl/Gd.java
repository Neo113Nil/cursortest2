package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes8.dex */
public final class Gd {
    public final Context a;
    public final Wa b;
    public final J9 c;
    public final Le d;
    public final zo e;
    public volatile IdentifiersResult f;

    public Gd(Context context, Wa wa) {
        this(context, wa, Hd.a(context), new Le(context), new zo());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            zo zoVar = this.e;
            String str = identifiersResult.id;
            zoVar.getClass();
            if (zo.a(str)) {
                return identifiersResult;
            }
        }
        try {
            J9 j9 = this.c;
            j9.a.lock();
            j9.b.a();
            identifiersResult = this.f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            zo zoVar2 = this.e;
            String str2 = identifiersResult.id;
            zoVar2.getClass();
            if (zo.a(str2)) {
                J9 j92 = this.c;
                j92.b.b();
                j92.a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a = Va.a(FileUtils.getFileFromSdkStorage(this.d.a, "uuid.dat"));
        this.e.getClass();
        if (!zo.a(a)) {
            a = this.d.a(this.b.a(this.a));
        }
        this.e.getClass();
        if (zo.a(a)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a, IdentifierStatus.OK, null);
            try {
                this.f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        J9 j922 = this.c;
        j922.b.b();
        j922.a.unlock();
        if (identifiersResult == null) {
        }
    }

    public Gd(Context context, Wa wa, J9 j9, Le le, zo zoVar) {
        this.a = context;
        this.b = wa;
        this.c = j9;
        this.d = le;
        this.e = zoVar;
        try {
            j9.a();
            le.a();
            j9.b();
        } catch (Throwable unused) {
            this.c.b();
        }
    }
}
