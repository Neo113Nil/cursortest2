package yads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class pc0 implements p30 {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final p30 c;
    public dv0 d;
    public zi e;
    public pz f;
    public p30 g;
    public eb3 h;
    public m30 i;
    public cn2 j;
    public p30 k;

    public pc0(Context context, p30 p30Var) {
        this.a = context.getApplicationContext();
        this.c = (p30) ni.a(p30Var);
    }

    public final void a(p30 p30Var) {
        for (int i = 0; i < this.b.size(); i++) {
            p30Var.a((v93) this.b.get(i));
        }
    }

    @Override // yads.p30
    public final void close() {
        p30 p30Var = this.k;
        if (p30Var != null) {
            try {
                p30Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        p30 p30Var = this.k;
        return p30Var == null ? Collections.EMPTY_MAP : p30Var.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        p30 p30Var = this.k;
        if (p30Var == null) {
            return null;
        }
        return p30Var.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        p30 p30Var = this.k;
        p30Var.getClass();
        return p30Var.read(bArr, i, i2);
    }

    @Override // yads.p30
    public final void a(v93 v93Var) {
        v93Var.getClass();
        this.c.a(v93Var);
        this.b.add(v93Var);
        dv0 dv0Var = this.d;
        if (dv0Var != null) {
            dv0Var.a(v93Var);
        }
        zi ziVar = this.e;
        if (ziVar != null) {
            ziVar.a(v93Var);
        }
        pz pzVar = this.f;
        if (pzVar != null) {
            pzVar.a(v93Var);
        }
        p30 p30Var = this.g;
        if (p30Var != null) {
            p30Var.a(v93Var);
        }
        eb3 eb3Var = this.h;
        if (eb3Var != null) {
            eb3Var.a(v93Var);
        }
        m30 m30Var = this.i;
        if (m30Var != null) {
            m30Var.a(v93Var);
        }
        cn2 cn2Var = this.j;
        if (cn2Var != null) {
            cn2Var.a(v93Var);
        }
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        if (this.k == null) {
            String scheme = u30Var.a.getScheme();
            Uri uri = u30Var.a;
            int i = mc3.a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !X3.i.b.equals(scheme2)) {
                if ("asset".equals(scheme)) {
                    if (this.e == null) {
                        zi ziVar = new zi(this.a);
                        this.e = ziVar;
                        a(ziVar);
                    }
                    this.k = this.e;
                } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
                    if (this.f == null) {
                        pz pzVar = new pz(this.a);
                        this.f = pzVar;
                        a(pzVar);
                    }
                    this.k = this.f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.g == null) {
                        try {
                            p30 p30Var = (p30) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.g = p30Var;
                            a(p30Var);
                        } catch (ClassNotFoundException unused) {
                            ji1.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.g == null) {
                            this.g = this.c;
                        }
                    }
                    this.k = this.g;
                } else if ("udp".equals(scheme)) {
                    if (this.h == null) {
                        eb3 eb3Var = new eb3(0);
                        this.h = eb3Var;
                        a(eb3Var);
                    }
                    this.k = this.h;
                } else if ("data".equals(scheme)) {
                    if (this.i == null) {
                        m30 m30Var = new m30();
                        this.i = m30Var;
                        a(m30Var);
                    }
                    this.k = this.i;
                } else if (!RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) && !"android.resource".equals(scheme)) {
                    this.k = this.c;
                } else {
                    if (this.j == null) {
                        cn2 cn2Var = new cn2(this.a);
                        this.j = cn2Var;
                        a(cn2Var);
                    }
                    this.k = this.j;
                }
            } else {
                String path = u30Var.a.getPath();
                if (path != null && path.startsWith("/android_asset/")) {
                    if (this.e == null) {
                        zi ziVar2 = new zi(this.a);
                        this.e = ziVar2;
                        a(ziVar2);
                    }
                    this.k = this.e;
                } else {
                    if (this.d == null) {
                        dv0 dv0Var = new dv0();
                        this.d = dv0Var;
                        a(dv0Var);
                    }
                    this.k = this.d;
                }
            }
            return this.k.a(u30Var);
        }
        throw new IllegalStateException();
    }
}
