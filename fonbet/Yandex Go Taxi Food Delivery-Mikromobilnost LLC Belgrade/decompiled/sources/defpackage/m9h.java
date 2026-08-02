package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.UdpDataSource;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class m9h implements kpg {
    public UdpDataSource A;
    public fpg B;
    public z9i0 C;
    public kpg D;
    public final Context a;
    public final ArrayList b;
    public final kpg c;
    public FileDataSource w;
    public c93 x;
    public nfe y;
    public kpg z;

    public m9h(Context context, kpg kpgVar) {
        this.a = context.getApplicationContext();
        kpgVar.getClass();
        this.c = kpgVar;
        this.b = new ArrayList();
    }

    public static void b(kpg kpgVar, cj01 cj01Var) {
        if (kpgVar != null) {
            kpgVar.addTransferListener(cj01Var);
        }
    }

    public final void a(kpg kpgVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            kpgVar.addTransferListener((cj01) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        cj01Var.getClass();
        this.c.addTransferListener(cj01Var);
        this.b.add(cj01Var);
        b(this.w, cj01Var);
        b(this.x, cj01Var);
        b(this.y, cj01Var);
        b(this.z, cj01Var);
        b(this.A, cj01Var);
        b(this.B, cj01Var);
        b(this.C, cj01Var);
    }

    @Override // defpackage.kpg
    public final void close() {
        kpg kpgVar = this.D;
        if (kpgVar != null) {
            try {
                kpgVar.close();
            } finally {
                this.D = null;
            }
        }
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        kpg kpgVar = this.D;
        return kpgVar == null ? Collections.EMPTY_MAP : kpgVar.getResponseHeaders();
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        kpg kpgVar = this.D;
        if (kpgVar == null) {
            return null;
        }
        return kpgVar.getInflatedUri();
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        d6z.x(this.D == null);
        Uri uri = npgVar.a;
        String scheme = uri.getScheme();
        int i = tw21.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.w == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.w = fileDataSource;
                    a(fileDataSource);
                }
                this.D = this.w;
            } else {
                if (this.x == null) {
                    c93 c93Var = new c93(context);
                    this.x = c93Var;
                    a(c93Var);
                }
                this.D = this.x;
            }
        } else if ("asset".equals(scheme)) {
            if (this.x == null) {
                c93 c93Var2 = new c93(context);
                this.x = c93Var2;
                a(c93Var2);
            }
            this.D = this.x;
        } else if ("content".equals(scheme)) {
            if (this.y == null) {
                nfe nfeVar = new nfe(context);
                this.y = nfeVar;
                a(nfeVar);
            }
            this.D = this.y;
        } else {
            boolean equals = "rtmp".equals(scheme);
            kpg kpgVar = this.c;
            if (equals) {
                if (this.z == null) {
                    try {
                        kpg kpgVar2 = (kpg) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.z = kpgVar2;
                        a(kpgVar2);
                    } catch (ClassNotFoundException unused) {
                        lk91.j("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        ny61.n("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.z == null) {
                        this.z = kpgVar;
                    }
                }
                this.D = this.z;
            } else if ("udp".equals(scheme)) {
                if (this.A == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.A = udpDataSource;
                    a(udpDataSource);
                }
                this.D = this.A;
            } else if (Constants.KEY_DATA.equals(scheme)) {
                if (this.B == null) {
                    fpg fpgVar = new fpg();
                    this.B = fpgVar;
                    a(fpgVar);
                }
                this.D = this.B;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.C == null) {
                    z9i0 z9i0Var = new z9i0(context);
                    this.C = z9i0Var;
                    a(z9i0Var);
                }
                this.D = this.C;
            } else {
                this.D = kpgVar;
            }
        }
        return this.D.open(npgVar);
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        kpg kpgVar = this.D;
        kpgVar.getClass();
        return kpgVar.read(bArr, i, i2);
    }
}
