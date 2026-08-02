package com.yandex.div.storage.templates;

import android.os.Build;
import android.os.SystemClock;
import com.yandex.div.storage.c;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.templates.b;
import defpackage.cai0;
import defpackage.eg90;
import defpackage.egy0;
import defpackage.g8e;
import defpackage.hlu;
import defpackage.oyr;
import defpackage.u2l;
import defpackage.uza;
import defpackage.v3c;
import defpackage.xel;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00152\n\u0010\u001d\u001a\u00060\u0006j\u0002`\u00192\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010)\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0019\u0012\u0004\u0012\u00020\u001a0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/div/storage/templates/a;", "", "Lcom/yandex/div/storage/c;", "divStorage", "Leg90;", "logger", "", "histogramComponent", "Lhlu;", "histogramRecorder", "Lyvf0;", "Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "parsingHistogramProxy", "<init>", "(Lcom/yandex/div/storage/c;Leg90;Ljava/lang/String;Lhlu;Lyvf0;)V", "Lu2l;", "env", "Lcom/yandex/div/storage/templates/TemplateReferenceResolver;", "templateReferences", "", "templateHashes", "Lzy11;", "b", "(Lu2l;Lcom/yandex/div/storage/templates/TemplateReferenceResolver;Ljava/util/Set;)V", "", "Lcom/yandex/div/storage/templates/TemplateHash;", "Lxel;", "a", "(Lcom/yandex/div/storage/templates/TemplateReferenceResolver;)Ljava/util/Map;", "templateHash", "template", "c", "(Ljava/lang/String;Lxel;)V", "Lcom/yandex/div/storage/c;", "Ljava/lang/String;", "Lhlu;", "d", "Lyvf0;", "Ljava/util/concurrent/ConcurrentHashMap;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "commonTemplates", "f", "Lu2l;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a {

    /* renamed from: a, reason: from kotlin metadata */
    private final c divStorage;

    /* renamed from: b, reason: from kotlin metadata */
    private final String histogramComponent;

    /* renamed from: c, reason: from kotlin metadata */
    private final hlu histogramRecorder;

    /* renamed from: d, reason: from kotlin metadata */
    private final yvf0 parsingHistogramProxy;

    /* renamed from: e, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, xel> commonTemplates = new ConcurrentHashMap<>();

    /* renamed from: f, reason: from kotlin metadata */
    private final u2l env;

    public a(c cVar, eg90 eg90Var, String str, hlu hluVar, yvf0 yvf0Var) {
        u2l b;
        this.divStorage = cVar;
        this.histogramComponent = str;
        this.histogramRecorder = hluVar;
        this.parsingHistogramProxy = yvf0Var;
        b = egy0.b(eg90Var);
        this.env = b;
    }

    private final void b(u2l env, TemplateReferenceResolver templateReferences, Set<String> templateHashes) {
        Object obj;
        Map g;
        eg90 eg90Var;
        v3c v3cVar = v3c.a;
        v3cVar.getClass();
        int i = Build.VERSION.SDK_INT;
        long nanoTime = (i < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000;
        c.a<cai0> l = this.divStorage.l(templateHashes);
        hlu hluVar = this.histogramRecorder;
        v3cVar.getClass();
        hlu.g(hluVar, ((i < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000) - nanoTime, null, 2, null);
        JSONObject jSONObject = new JSONObject();
        for (cai0 cai0Var : l.f()) {
            String hash = cai0Var.getHash();
            try {
                obj = new JSONObject(new String(cai0Var.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String(), uza.a));
            } catch (JSONException e) {
                env.a.a(new IllegalStateException(oyr.p("Template deserialization failed (hash: ", hash, ")!"), e));
                obj = zy11.a;
            }
            g = templateReferences.g();
            b bVar = (b) g.get(hash);
            if (bVar instanceof b.a) {
                for (String str : ((b.a) bVar).getIds()) {
                    try {
                        jSONObject.put(str, obj);
                    } catch (JSONException e2) {
                        env.a.a(new IllegalStateException(oyr.p("Template '", str, "' adding to json failed!"), e2));
                    }
                }
            } else if (bVar instanceof b.C0037b) {
                String h = ((b.C0037b) bVar).h();
                try {
                    jSONObject.put(h, obj);
                } catch (JSONException e3) {
                    env.a.a(new IllegalStateException(oyr.p("Template '", h, "' adding to json failed!"), e3));
                }
            } else if (bVar == null) {
                eg90Var = templateReferences.logger;
                eg90Var.a(new IllegalStateException("No template id was found for hash!"));
            }
        }
        Iterator<T> it = l.e().iterator();
        while (it.hasNext()) {
            env.a.a((StorageException) it.next());
        }
        for (Map.Entry entry : ((DivParsingHistogramProxy) this.parsingHistogramProxy.get()).c(env, jSONObject, this.histogramComponent).a.entrySet()) {
            String str2 = (String) entry.getKey();
            xel xelVar = (xel) entry.getValue();
            String h2 = templateReferences.h(str2);
            if (h2 == null) {
                env.a.a(new IllegalStateException(g8e.o("Failed to resolve template hash for id: ", str2)));
            } else {
                this.commonTemplates.put(h2, xelVar);
            }
        }
    }

    public final Map<String, xel> a(TemplateReferenceResolver templateReferences) {
        Set<String> f = templateReferences.f();
        Set<String> M0 = kotlin.collections.a.M0(f);
        M0.removeAll(this.commonTemplates.keySet());
        if (!M0.isEmpty()) {
            b(this.env, templateReferences, M0);
        }
        ConcurrentHashMap<String, xel> concurrentHashMap = this.commonTemplates;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, xel> entry : concurrentHashMap.entrySet()) {
            if (f.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void c(String templateHash, xel template) {
        this.commonTemplates.put(templateHash, template);
    }
}
