package xsna;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.e;
import okhttp3.f;

/* compiled from: ConnectionSpecSelector.kt */
/* loaded from: classes11.dex */
public final class m4j {
    public final List<okhttp3.f> a;
    public int b;
    public boolean c;
    public boolean d;

    public m4j(List<okhttp3.f> list) {
        this.a = list;
    }

    public final okhttp3.f a(SSLSocket sSLSocket) throws IOException {
        okhttp3.f fVar;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        List<okhttp3.f> list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                fVar = null;
                break;
            }
            fVar = list.get(i2);
            if (fVar.b(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (fVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i3 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (list.get(i3).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        String[] strArr = fVar.d;
        String[] strArr2 = fVar.c;
        if (strArr2 != null) {
            enabledCipherSuites = x2r0.o(okhttp3.e.c, sSLSocket.getEnabledCipherSuites(), strArr2);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            enabledProtocols = x2r0.o(gw50.b, sSLSocket.getEnabledProtocols(), strArr);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        e.a aVar = okhttp3.e.c;
        byte[] bArr = x2r0.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (aVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            String str = supportedCipherSuites[i];
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        f.a aVar2 = new f.a();
        aVar2.a = fVar.a;
        aVar2.b = strArr2;
        aVar2.c = strArr;
        aVar2.d = fVar.b;
        aVar2.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        aVar2.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        okhttp3.f a = aVar2.a();
        if (a.c() != null) {
            sSLSocket.setEnabledProtocols(a.d);
        }
        if (a.a() != null) {
            sSLSocket.setEnabledCipherSuites(a.c);
        }
        return fVar;
    }
}
