package xsna;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import one.video.calls.sdk_private.f;

/* compiled from: TranscriptHash.java */
/* loaded from: classes8.dex */
public final class g1t {
    public static final a[] d = {a.client_hello, a.server_hello, a.encrypted_extensions, a.certificate_request, a.server_certificate, a.server_certificate_verify, a.server_finished, a.client_certificate, a.client_certificate_verify, a.client_finished};
    public final MessageDigest a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    /* compiled from: TranscriptHash.java */
    public enum a {
        client_hello(1),
        server_hello(2),
        new_session_ticket(4),
        end_of_early_data(5),
        encrypted_extensions(8),
        certificate(11),
        certificate_request(13),
        certificate_verify(15),
        finished(20),
        key_update(24),
        server_certificate(249),
        server_certificate_verify(250),
        server_finished(251),
        client_certificate(252),
        client_certificate_verify(253),
        client_finished(254);

        private byte q;

        a(int i) {
            this.q = (byte) i;
        }
    }

    public g1t(int i) {
        String a2 = lhg.a(i << 3, "SHA-");
        try {
            this.a = MessageDigest.getInstance(a2);
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException(zr.a("Missing ", a2, " support"));
        }
    }

    public static a a(f.d dVar, boolean z) {
        return dVar == f.d.finished ? z ? a.client_finished : a.server_finished : dVar == f.d.certificate ? z ? a.client_certificate : a.server_certificate : dVar == f.d.certificate_verify ? z ? a.client_certificate_verify : a.server_certificate_verify : a.values()[dVar.ordinal()];
    }

    public static a f(f.d dVar) {
        Object[] objArr = {f.d.certificate, f.d.certificate_verify, f.d.finished};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        if (!Collections.unmodifiableList(arrayList).contains(dVar)) {
            return a.values()[dVar.ordinal()];
        }
        throw new IllegalArgumentException("cannot convert ambiguous type " + dVar);
    }

    public final void b(bdy0 bdy0Var) {
        Object[] objArr = {f.d.certificate, f.d.certificate_verify, f.d.finished};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        if (Collections.unmodifiableList(arrayList).contains(bdy0Var.c())) {
            throw new IllegalArgumentException();
        }
        this.b.put(f(bdy0Var.c()), bdy0Var.d());
    }

    public final byte[] c(a aVar) {
        MessageDigest messageDigest;
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(aVar)) {
            a[] aVarArr = d;
            int length = aVarArr.length;
            int i = 0;
            while (true) {
                messageDigest = this.a;
                if (i >= length) {
                    break;
                }
                a aVar2 = aVarArr[i];
                ConcurrentHashMap concurrentHashMap2 = this.b;
                if (concurrentHashMap2.containsKey(aVar2)) {
                    messageDigest.update((byte[]) concurrentHashMap2.get(aVar2));
                }
                if (aVar2 == aVar) {
                    break;
                }
                i++;
            }
            concurrentHashMap.put(aVar, messageDigest.digest());
        }
        return (byte[]) concurrentHashMap.get(aVar);
    }

    public final void d(bdy0 bdy0Var) {
        this.b.put(a(bdy0Var.c(), true), bdy0Var.d());
    }

    public final void e(bdy0 bdy0Var) {
        this.b.put(a(bdy0Var.c(), false), bdy0Var.d());
    }
}
