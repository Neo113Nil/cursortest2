package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.emb;

/* renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4917il {
    public final InterfaceC5259w2 a;

    public C4917il(InterfaceC5259w2 interfaceC5259w2) {
        this.a = interfaceC5259w2;
    }

    public final ArrayList a(Iterable iterable) {
        String str;
        String a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                a = this.a.a(str2);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (a == null || (str = StringUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(a.getBytes(emb.b)))) == null) {
                PublicLogger.Companion.getAnonymousInstance().info("Input " + str2 + " is not a valid data", new Object[0]);
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
