package com.yandex.xplat.common;

import com.yandex.xplat.common.NetworkError;
import defpackage.al7;
import defpackage.ddf;
import defpackage.eoh;
import defpackage.fms;
import defpackage.gw00;
import defpackage.hz50;
import defpackage.j0g;
import defpackage.kfh;
import defpackage.kvj0;
import defpackage.ofh;
import defpackage.rvj0;
import defpackage.uza;
import defpackage.wg10;
import defpackage.yf7;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class b implements al7 {
    public final /* synthetic */ eoh a;
    public final /* synthetic */ kfh b;
    public final /* synthetic */ hz50 c;

    public b(eoh eohVar, kfh kfhVar, hz50 hz50Var) {
        this.a = eohVar;
        this.b = kfhVar;
        this.c = hz50Var;
    }

    @Override // defpackage.al7
    public final void onFailure(yf7 yf7Var, IOException iOException) {
        this.a.a(new NetworkError.NetworkErrorTransportFailure("Error communicating with the server: " + iOException, iOException));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: IOException -> 0x001f, TryCatch #0 {IOException -> 0x001f, blocks: (B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0027, B:13:0x002d, B:33:0x0022), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[LOOP:0: B:15:0x0059->B:17:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002c  */
    @Override // defpackage.al7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        Charset charset;
        String h;
        String h2;
        eoh eohVar = this.a;
        boolean z = kvj0Var.J;
        int i = kvj0Var.w;
        rvj0 rvj0Var = kvj0Var.z;
        try {
            if (rvj0Var != null) {
                wg10 contentType = rvj0Var.contentType();
                if (contentType != null) {
                    charset = contentType.a(uza.a);
                    if (charset == null) {
                    }
                    Pair pair = new Pair(charset, rvj0Var == null ? rvj0Var.bytes() : null);
                    Charset charset2 = (Charset) pair.getFirst();
                    byte[] bArr = (byte[]) pair.getSecond();
                    TreeMap e = kvj0Var.y.e();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(e.size()));
                    for (Map.Entry entry : e.entrySet()) {
                        linkedHashMap.put(entry.getKey(), kotlin.collections.a.X((Iterable) entry.getValue(), Extension.FIX_SPACE, null, null, null, 62));
                    }
                    eohVar.b(new ofh(i, new LinkedHashMap(linkedHashMap), z, bArr != null ? new j0g(charset2, new ddf(20, bArr)) : null));
                    kfh kfhVar = this.b;
                    fms fmsVar = kfhVar.e;
                    hz50 hz50Var = this.c;
                    String c = hz50Var.c();
                    Boolean valueOf = Boolean.valueOf(z);
                    h = hz50Var.d().h("X-Request-ID");
                    if (h == null) {
                        h = "";
                    }
                    h2 = hz50Var.d().h("traceparent");
                    if (h2 == null) {
                        h2 = "";
                    }
                    fmsVar.h(c, valueOf, h, h2, kfhVar.a(hz50Var).a.d, Long.valueOf(kvj0Var.F - kvj0Var.E), Integer.valueOf(i));
                }
            }
            charset = uza.a;
            Pair pair2 = new Pair(charset, rvj0Var == null ? rvj0Var.bytes() : null);
            Charset charset22 = (Charset) pair2.getFirst();
            byte[] bArr2 = (byte[]) pair2.getSecond();
            TreeMap e2 = kvj0Var.y.e();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(e2.size()));
            while (r7.hasNext()) {
            }
            eohVar.b(new ofh(i, new LinkedHashMap(linkedHashMap2), z, bArr2 != null ? new j0g(charset22, new ddf(20, bArr2)) : null));
            kfh kfhVar2 = this.b;
            fms fmsVar2 = kfhVar2.e;
            hz50 hz50Var2 = this.c;
            String c2 = hz50Var2.c();
            Boolean valueOf2 = Boolean.valueOf(z);
            h = hz50Var2.d().h("X-Request-ID");
            if (h == null) {
            }
            h2 = hz50Var2.d().h("traceparent");
            if (h2 == null) {
            }
            fmsVar2.h(c2, valueOf2, h, h2, kfhVar2.a(hz50Var2).a.d, Long.valueOf(kvj0Var.F - kvj0Var.E), Integer.valueOf(i));
        } catch (IOException e3) {
            eohVar.a(new NetworkError.NetworkErrorTransportFailure("Error obtaining response body string", e3));
        }
    }
}
