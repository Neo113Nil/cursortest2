package xsna;

import android.content.Context;
import com.vk.api.sdk.utils.clientagent.model.ClientAgentKey;
import com.vk.api.sdk.utils.clientagent.model.Net;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.knet.core.http.metric.HttpMetrics;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import com.vk.knet.cornet.KnetCronetProvider;
import com.vk.log.L;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.json.JSONObject;
import xsna.elc;
import xsna.sek;
import xsna.wdk;
import xsna.wjy;
import xsna.ydk;
import xsna.zjv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vjy implements gzs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ qjq c;
    public final /* synthetic */ vsj d;
    public final /* synthetic */ egq0 e;
    public final /* synthetic */ wjy.a f;
    public final /* synthetic */ d200 g;
    public final /* synthetic */ hn30 h;
    public final /* synthetic */ m7y0 i;
    public final /* synthetic */ asu j;
    public final /* synthetic */ wdp0 k;

    public /* synthetic */ vjy(Context context, qjq qjqVar, vsj vsjVar, egq0 egq0Var, wjy.a aVar, d200 d200Var, hn30 hn30Var, m7y0 m7y0Var, asu asuVar, wdp0 wdp0Var) {
        this.b = context;
        this.c = qjqVar;
        this.d = vsjVar;
        this.e = egq0Var;
        this.f = aVar;
        this.g = d200Var;
        this.h = hn30Var;
        this.i = m7y0Var;
        this.j = asuVar;
        this.k = wdp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        Object remove;
        Context context = this.b;
        final qjq qjqVar = this.c;
        final vsj vsjVar = this.d;
        final egq0 egq0Var = this.e;
        final wjy.a aVar = this.f;
        final d200 d200Var = this.g;
        final hn30 hn30Var = this.h;
        final m7y0 m7y0Var = this.i;
        final asu asuVar = this.j;
        final wdp0 wdp0Var = this.k;
        izs izsVar = new izs() { // from class: xsna.njy
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                sek.a aVar2 = (sek.a) obj;
                wjy.a aVar3 = aVar;
                new gyu(aVar3, 2).invoke(aVar2.a);
                qjq qjqVar2 = qjq.this;
                if (qjqVar2 != null) {
                    aVar2.a(qjqVar2);
                }
                aVar2.a(vsjVar);
                aVar2.a(egq0Var);
                q360 q360Var = aVar3.g;
                if (q360Var != null) {
                    elc.a a = q360Var.a();
                    a.a.put(ClientAgentKey.NET, Net.CRONET);
                    aVar2.a(new flc((String) a.a((String) com.vk.core.apps.a.q.getValue()).a.getValue()));
                }
                aVar2.a(d200Var);
                if (aVar3.t) {
                    aVar2.a(hn30Var);
                }
                m7y0 m7y0Var2 = m7y0Var;
                if (m7y0Var2 != null) {
                    aVar2.a(new i7y0(m7y0Var2));
                }
                KnetExecutorType knetExecutorType = (KnetExecutorType) aVar3.h.invoke();
                knetExecutorType.getClass();
                aVar2.a(new c4y0(aVar3.p.c, knetExecutorType == KnetExecutorType.CRONET_QUIC));
                aVar2.a(asuVar);
                wdp0 wdp0Var2 = wdp0Var;
                if (wdp0Var2 != null) {
                    qz80.a(aVar2, wdp0Var2);
                }
                return s3q0.a;
            }
        };
        sek.a aVar2 = new sek.a(context);
        izsVar.invoke(aVar2);
        final ydk.a aVar3 = aVar2.a;
        yek yekVar = aVar3.b;
        boolean z2 = aVar3.f;
        boolean z3 = aVar3.o;
        long j = aVar3.g;
        long j2 = aVar3.i;
        long j3 = aVar3.h;
        int i = aVar3.j;
        int i2 = aVar3.k;
        boolean z4 = aVar3.l;
        boolean z5 = aVar3.m;
        boolean z6 = aVar3.n;
        fek fekVar = new fek(yekVar, z2, z3, j, j3, j2, i, i2, z4, z5, z6, aVar3.r, aVar3.u, aVar3.v);
        Context context2 = aVar3.a;
        iek iekVar = new iek(context2);
        if (z6) {
            iekVar.d = true;
        }
        if (z2) {
            iekVar.e = true;
        }
        v1v v1vVar = aVar3.c;
        if (v1vVar != null) {
            iekVar.c = v1vVar;
        }
        if (yekVar != null) {
            iekVar.g = yekVar;
        }
        if (z3) {
            iekVar.f = true;
        }
        iekVar.b = aVar3.d;
        if (iekVar.d) {
            File file = new File(context2.getFilesDir(), "network_internal/cronet/prefs/local_prefs.json");
            try {
                Charset charset = emb.b;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
                try {
                    String b = a0a.b(bufferedReader);
                    bufferedReader.close();
                    JSONObject jSONObject = new JSONObject(b);
                    JSONObject optJSONObject = jSONObject.optJSONObject("net");
                    if (optJSONObject != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("http_server_properties");
                        if (optJSONObject2 == null || (remove = optJSONObject2.remove("broken_alternative_services")) == null) {
                            z = false;
                        } else {
                            Object[] objArr = {cqi.c(remove, "Startup QUIC executor found broken hosts: ")};
                            qek qekVar = vek.a;
                            if (qekVar != null) {
                                qekVar.b(Arrays.copyOf(objArr, 1));
                            }
                            z = true;
                        }
                        Object remove2 = optJSONObject.remove("broken_alternative_services");
                        if (remove2 != null) {
                            Object[] objArr2 = {cqi.c(remove2, "Startup QUIC executor found broken hosts: ")};
                            qek qekVar2 = vek.a;
                            if (qekVar2 != null) {
                                qekVar2.b(Arrays.copyOf(objArr2, 1));
                            }
                            z = true;
                        }
                        if (z) {
                            nbr.w(file, jSONObject.toString(), charset);
                        }
                    }
                } finally {
                }
            } catch (FileNotFoundException unused) {
            } catch (Throwable th) {
                Object[] objArr3 = {th};
                qek qekVar3 = vek.a;
                if (qekVar3 != null) {
                    qekVar3.b(Arrays.copyOf(objArr3, 1));
                }
                try {
                    file.delete();
                } catch (Throwable th2) {
                    Object[] objArr4 = {th2};
                    qek qekVar4 = vek.a;
                    if (qekVar4 != null) {
                        qekVar4.b(Arrays.copyOf(objArr4, 1));
                    }
                }
            }
        }
        ExperimentalCronetEngine.Builder createBuilder = new KnetCronetProvider(iekVar.a).createBuilder();
        wdk wdkVar = iekVar.b;
        if (wdkVar != null) {
            if (wdkVar instanceof wdk.a) {
                try {
                    ((wdk.a) wdkVar).a.mkdirs();
                    createBuilder.setStoragePath(((wdk.a) wdkVar).a.getAbsolutePath());
                    createBuilder.enableHttpCache(2, ((wdk.a) wdkVar).b);
                } catch (Exception unused2) {
                    s3q0 s3q0Var = s3q0.a;
                }
            } else if (wdkVar instanceof wdk.c) {
                createBuilder.enableHttpCache(1, 0L);
            } else if (!(wdkVar instanceof wdk.b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (iekVar.c != null) {
            createBuilder.setLibraryLoader((CronetEngine.Builder.LibraryLoader) new hek(iekVar));
        }
        createBuilder.enableHttp2(iekVar.e);
        createBuilder.enableBrotli(iekVar.f);
        yek yekVar2 = iekVar.g;
        boolean z7 = yekVar2 != null;
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_BUILDER;
        Object[] objArr5 = {"[cronet] QuicOptions - " + yekVar2};
        qek qekVar5 = vek.a;
        if (qekVar5 != null) {
            qekVar5.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr5, 1));
        }
        createBuilder.enableQuic(z7);
        if (yekVar2 != null) {
            Iterator<T> it = yekVar2.e().iterator();
            while (it.hasNext()) {
                createBuilder.addQuicHint(((zfv) it.next()).a(), 443, 443);
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("max_server_configs_stored_in_properties", yekVar2.g());
            jSONObject3.put("idle_connection_timeout_seconds", yekVar2.f());
            jSONObject3.put("reduced_ping_timeout_seconds", yekVar2.l());
            jSONObject3.put("close_sessions_on_ip_change", yekVar2.b());
            jSONObject3.put("goaway_sessions_on_ip_change", yekVar2.d());
            jSONObject3.put("migrate_sessions_on_network_change_v2", yekVar2.j());
            jSONObject3.put("migrate_sessions_early_v2", yekVar2.i());
            jSONObject3.put("migrate_idle_sessions", yekVar2.h());
            jSONObject3.put("origins_to_force_quic_on", yekVar2.k());
            jSONObject3.put("enable_socket_recv_optimization", yekVar2.k());
            jSONObject3.put("disable_tls_zero_rtt", yekVar2.c());
            jSONObject3.put("retry_on_alternate_network_before_handshake", yekVar2.m());
            jSONObject3.put("quic_version", yekVar2.n());
            Iterator<T> it2 = yekVar2.a().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                jSONObject3.put((String) entry.getKey(), entry.getValue().toString());
            }
            s3q0 s3q0Var2 = s3q0.a;
            jSONObject2.put("QUIC", jSONObject3);
            createBuilder.setExperimentalOptions(jSONObject2.toString());
        }
        ExperimentalCronetEngine build = createBuilder.build();
        wek wekVar = (wek) wek.c.getValue();
        rt8 rt8Var = rt8.c;
        uek uekVar = new uek(aVar3.e, build);
        wvb0 wvb0Var = new wvb0(wekVar, rt8Var);
        gti gtiVar = null;
        xdk xdkVar = aVar3.p.isEmpty() ? 0 : new wjv() { // from class: xsna.xdk
            @Override // xsna.wjv
            public final void a(HttpMetrics httpMetrics, ckv ckvVar, pkv pkvVar) {
                Iterator it3 = ydk.a.this.p.iterator();
                while (it3.hasNext()) {
                    ((wjv) it3.next()).a(httpMetrics, ckvVar, pkvVar);
                }
            }
        };
        if (!aVar3.q.isEmpty()) {
            gkv[] gkvVarArr = (gkv[]) aVar3.q.toArray(new gkv[0]);
            gtiVar = new gti((gkv[]) Arrays.copyOf(gkvVarArr, gkvVarArr.length));
        }
        final ydk ydkVar = new ydk(build, fekVar, wvb0Var, uekVar, xdkVar, gtiVar, aVar3.s, aVar3.t);
        aVar2.a(new ojv() { // from class: xsna.rek
            @Override // xsna.ojv
            public final mkv a(zjv.a aVar4) {
                try {
                    return ydk.this.c(aVar4.b());
                } finally {
                }
            }
        });
        sek sekVar = new sek(ydkVar, aVar2.b);
        wjy.d = uekVar;
        L.e("KNET-INIT", "Cronet config built");
        return sekVar;
    }
}
