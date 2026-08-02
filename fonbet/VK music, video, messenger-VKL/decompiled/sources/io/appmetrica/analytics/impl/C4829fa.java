package io.appmetrica.analytics.impl;

import androidx.credentials.provider.CredentialEntry;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4829fa {
    public final C4790dm a = new C4790dm();
    public C4881ha b = new C4881ha();

    public final synchronized void a(C4881ha c4881ha) {
        this.b = c4881ha;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (epx.f((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.b.a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C4881ha c4881ha = this.b;
                    IdentifierStatus identifierStatus = c4881ha.b;
                    String str2 = c4881ha.c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = CredentialEntry.FALSE_STRING;
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
