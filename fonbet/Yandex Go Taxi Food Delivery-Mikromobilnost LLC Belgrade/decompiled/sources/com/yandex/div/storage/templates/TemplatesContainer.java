package com.yandex.div.storage.templates;

import android.os.Build;
import android.os.SystemClock;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.c;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.templates.b;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.eg90;
import defpackage.egy0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.glu;
import defpackage.gw00;
import defpackage.hlu;
import defpackage.i3y;
import defpackage.j73;
import defpackage.j7o;
import defpackage.le7;
import defpackage.lfy0;
import defpackage.sey0;
import defpackage.sls;
import defpackage.u2l;
import defpackage.uza;
import defpackage.v3c;
import defpackage.w53;
import defpackage.xel;
import defpackage.yvf0;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0012¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0011H\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u0011H\u0012¢\u0006\u0004\b!\u0010\"J+\u0010(\u001a\u0016\u0012\b\u0012\u00060\u0011j\u0002`&\u0012\b\u0012\u00060\u0011j\u0002`'0%2\u0006\u0010$\u001a\u00020#H\u0012¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010$\u001a\u00020#H\u0012¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u001fJ)\u00100\u001a\u00020/2\b\u0010-\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0011H\u0017¢\u0006\u0004\b0\u00101J/\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b4\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b*\u00109R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u0016\u0010>\u001a\u00020<8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b0\u0010=R\u0016\u0010A\u001a\u0004\u0018\u00010\u00118\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010H\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`F\u0012\u0004\u0012\u00020 0%8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b,\u0010GR$\u0010J\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`F\u0012\u0004\u0012\u00020\u001d0%8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u001d\u0010N\u001a\u0004\u0018\u00010K8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b!\u0010L\u001a\u0004\bI\u0010M¨\u0006O"}, d2 = {"Lcom/yandex/div/storage/templates/TemplatesContainer;", "", "Lcom/yandex/div/storage/c;", "divStorage", "Leg90;", "errorLogger", "Lhlu;", "histogramRecorder", "Lyvf0;", "Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "parsingHistogramProxy", "Lglu;", "histogramNameProvider", "<init>", "(Lcom/yandex/div/storage/c;Leg90;Lhlu;Lyvf0;Lglu;)V", "Lle7;", "Lxel;", "", "m", "(Lle7;)Ljava/lang/String;", "baseName", "sourceType", "", "n", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;", "Lzy11;", "l", "()V", "groupId", "Lu2l;", "e", "(Ljava/lang/String;)Lu2l;", "Lcom/yandex/div/storage/templates/TemplateReferenceResolver;", "k", "(Ljava/lang/String;)Lcom/yandex/div/storage/templates/TemplateReferenceResolver;", "Lorg/json/JSONObject;", "json", "", "Lcom/yandex/div/storage/templates/TemplateId;", "Lcom/yandex/div/storage/templates/TemplateHash;", "d", "(Lorg/json/JSONObject;)Ljava/util/Map;", "c", "(Lorg/json/JSONObject;)Ljava/lang/String;", CoreConstants.PushMessage.SERVICE_TYPE, "cardId", "templateId", "Lj7o;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lj7o;", "", "Lsey0;", "b", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;", "a", "Lcom/yandex/div/storage/c;", "Leg90;", "Lhlu;", "Lyvf0;", "Lglu;", "", "Z", "templateReferencesLoaded", "g", "Ljava/lang/String;", "histogramComponentName", "Lcom/yandex/div/storage/templates/a;", "h", "Lcom/yandex/div/storage/templates/a;", "templatesPool", "Lcom/yandex/div/storage/templates/GroupId;", "Ljava/util/Map;", "groupTemplateReferences", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "templateEnvironments", "Ljava/security/MessageDigest;", "Li3y;", "()Ljava/security/MessageDigest;", "messageDigest", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class TemplatesContainer {

    /* renamed from: a, reason: from kotlin metadata */
    private final c divStorage;

    /* renamed from: b, reason: from kotlin metadata */
    private final eg90 errorLogger;

    /* renamed from: c, reason: from kotlin metadata */
    private final hlu histogramRecorder;

    /* renamed from: d, reason: from kotlin metadata */
    private final yvf0 parsingHistogramProxy;

    /* renamed from: e, reason: from kotlin metadata */
    private final glu histogramNameProvider;

    /* renamed from: f, reason: from kotlin metadata */
    private boolean templateReferencesLoaded;

    /* renamed from: g, reason: from kotlin metadata */
    private final String histogramComponentName;

    /* renamed from: h, reason: from kotlin metadata */
    private final a templatesPool;

    /* renamed from: i, reason: from kotlin metadata */
    private final Map<String, TemplateReferenceResolver> groupTemplateReferences;

    /* renamed from: j, reason: from kotlin metadata */
    private final Map<String, u2l> templateEnvironments;

    /* renamed from: k, reason: from kotlin metadata */
    private final i3y messageDigest;

    public TemplatesContainer(c cVar, eg90 eg90Var, hlu hluVar, yvf0 yvf0Var, glu gluVar) {
        this.divStorage = cVar;
        this.errorLogger = eg90Var;
        this.histogramRecorder = hluVar;
        this.parsingHistogramProxy = yvf0Var;
        this.histogramNameProvider = gluVar;
        String d = gluVar != null ? gluVar.d() : null;
        this.histogramComponentName = d;
        this.templatesPool = new a(cVar, eg90Var, d, hluVar, yvf0Var);
        this.groupTemplateReferences = new LinkedHashMap();
        this.templateEnvironments = new LinkedHashMap();
        this.messageDigest = kotlin.a.a(new sls() { // from class: com.yandex.div.storage.templates.TemplatesContainer$messageDigest$2
            {
                super(0);
            }

            @Override // defpackage.sls
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final MessageDigest invoke() {
                eg90 eg90Var2;
                try {
                    return MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e) {
                    eg90Var2 = TemplatesContainer.this.errorLogger;
                    eg90Var2.a(new IllegalStateException("Storage cannot work with templates!", e));
                    return null;
                }
            }
        });
    }

    private String c(JSONObject json2) {
        byte[] digest;
        byte[] bytes = json2.toString().getBytes(uza.a);
        synchronized (this) {
            MessageDigest j = j();
            digest = j != null ? j.digest(bytes) : null;
        }
        if (digest == null) {
            return null;
        }
        return evu0.N(MoneyInputEditView.DEFAULT_VALUE, 32, new BigInteger(1, digest).toString(16));
    }

    private Map<String, String> d(JSONObject json2) {
        String c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = json2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = json2.get(next);
            if ((obj instanceof JSONObject) && (c = c((JSONObject) obj)) != null) {
                linkedHashMap.put(next, c);
            }
        }
        return linkedHashMap;
    }

    private u2l e(String groupId) {
        u2l b;
        Map g;
        eg90 eg90Var;
        u2l b2;
        TemplateReferenceResolver k = k(groupId);
        if (k == null) {
            b2 = egy0.b(this.errorLogger);
            return b2;
        }
        Map<String, xel> a = this.templatesPool.a(k);
        b = egy0.b(this.errorLogger);
        HashMap hashMap = new HashMap(a.size());
        for (Map.Entry entry : ((LinkedHashMap) a).entrySet()) {
            String str = (String) entry.getKey();
            xel xelVar = (xel) entry.getValue();
            g = k.g();
            b bVar = (b) g.get(str);
            if (bVar instanceof b.a) {
                Iterator it = ((b.a) bVar).getIds().iterator();
                while (it.hasNext()) {
                    hashMap.put((String) it.next(), xelVar);
                }
            } else if (bVar instanceof b.C0037b) {
                hashMap.put(((b.C0037b) bVar).h(), xelVar);
            } else if (bVar == null) {
                eg90Var = k.logger;
                eg90Var.a(new IllegalStateException("No template id was found for hash!"));
            }
        }
        b.w.c(hashMap);
        return b;
    }

    private static final boolean g(String str, TemplatesContainer templatesContainer, String str2, List<DivStorageErrorException> list) {
        if (str == null) {
            return false;
        }
        try {
            return templatesContainer.divStorage.k(str, str2);
        } catch (DivStorageErrorException e) {
            list.add(e);
            return false;
        }
    }

    private static final boolean h(String str, TemplatesContainer templatesContainer, List<DivStorageErrorException> list) {
        if (str == null) {
            return false;
        }
        try {
            return templatesContainer.divStorage.h(str);
        } catch (DivStorageErrorException e) {
            list.add(e);
            return false;
        }
    }

    private MessageDigest j() {
        return (MessageDigest) this.messageDigest.getValue();
    }

    private TemplateReferenceResolver k(String groupId) {
        l();
        return this.groupTemplateReferences.get(groupId);
    }

    private void l() {
        if (this.templateReferencesLoaded) {
            return;
        }
        this.templateReferencesLoaded = true;
        c.a<c.d> e = this.divStorage.e();
        Iterator<T> it = e.e().iterator();
        while (it.hasNext()) {
            this.errorLogger.a((StorageException) it.next());
        }
        for (c.d dVar : e.f()) {
            Map<String, TemplateReferenceResolver> map = this.groupTemplateReferences;
            String f = dVar.f();
            TemplateReferenceResolver templateReferenceResolver = map.get(f);
            if (templateReferenceResolver == null) {
                templateReferenceResolver = new TemplateReferenceResolver(this.errorLogger);
                map.put(f, templateReferenceResolver);
            }
            templateReferenceResolver.d(dVar);
        }
    }

    private String m(le7 le7Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(le7Var.a.a);
        return "in-memory templates count: " + linkedHashMap.size();
    }

    private Set<String> n(String baseName, String sourceType) {
        if (baseName == null) {
            return EmptySet.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(1));
        j73.Z(new String[]{baseName}, linkedHashSet);
        if (sourceType != null) {
            linkedHashSet.add(baseName + '.' + sourceType);
        }
        return linkedHashSet;
    }

    public final List<sey0> b(String groupId, JSONObject json2, String sourceType) {
        lfy0 c;
        glu gluVar = this.histogramNameProvider;
        String g = gluVar != null ? gluVar.g() : null;
        Map<String, String> d = d(json2);
        u2l i = i(groupId);
        if (g != null) {
            Set<String> n = n(g, sourceType);
            v3c.a.getClass();
            int i2 = Build.VERSION.SDK_INT;
            long nanoTime = (i2 < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000;
            c = ((DivParsingHistogramProxy) this.parsingHistogramProxy.get()).c(i, json2, this.histogramComponentName);
            this.histogramRecorder.h(n, ((i2 < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000) - nanoTime);
        } else {
            c = ((DivParsingHistogramProxy) this.parsingHistogramProxy.get()).c(i, json2, this.histogramComponentName);
        }
        le7 le7Var = i.w;
        w53 w53Var = c.a;
        le7Var.c(w53Var);
        ArrayList arrayList = new ArrayList(w53Var.c);
        for (Map.Entry entry : w53Var.entrySet()) {
            String str = (String) entry.getKey();
            xel xelVar = (xel) entry.getValue();
            String str2 = (String) ((LinkedHashMap) d).get(str);
            if (str2 == null) {
                this.errorLogger.a(new IllegalStateException(g8e.o("No corresponding template was found for templateId = ", str)));
            } else {
                this.templatesPool.c(str2, xelVar);
                JSONObject optJSONObject = json2.optJSONObject(str);
                if (optJSONObject != null) {
                    arrayList.add(new sey0(str, str2, optJSONObject));
                } else {
                    this.errorLogger.a(new IllegalStateException(g8e.o("No raw template found for templateId = ", str)));
                }
            }
        }
        this.templateEnvironments.put(groupId, i);
        this.groupTemplateReferences.put(groupId, new TemplateReferenceResolver(this.errorLogger));
        return arrayList;
    }

    public final j7o f(String cardId, String groupId, String templateId) {
        String str;
        String str2;
        TemplateReferenceResolver templateReferenceResolver = this.groupTemplateReferences.get(groupId);
        String h = templateReferenceResolver != null ? templateReferenceResolver.h(templateId) : null;
        u2l u2lVar = this.templateEnvironments.get(groupId);
        le7 le7Var = u2lVar != null ? u2lVar.w : null;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if ((le7Var != null ? (xel) le7Var.get(templateId) : null) != null) {
            str2 = "unknown, template is loaded";
        } else if (!h(h, this, arrayList)) {
            sb.append("supported responses: ".concat(kotlin.collections.a.X(this.groupTemplateReferences.keySet(), null, null, null, null, 63)));
            if (this.groupTemplateReferences.keySet().contains(groupId)) {
                StringBuilder sb2 = new StringBuilder(" ");
                sb2.append(le7Var != null ? m(le7Var) : null);
                sb.append(sb2.toString());
                str2 = "cached, but loaded partially";
            } else {
                str2 = "cached, but not loaded into memory";
            }
        } else if (g(cardId, this, groupId, arrayList)) {
            if (arrayList.isEmpty()) {
                str = "not present in original response";
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(((DivStorageErrorException) it.next()).getMessage() + ";\n");
                }
                str = "fatal exception when explaining reason";
            }
            if (le7Var != null) {
                sb.append(m(le7Var));
            }
            str2 = str;
        } else {
            str2 = "access templates ahead of time";
        }
        return new j7o(str2, sb.toString());
    }

    public final u2l i(String groupId) {
        l();
        Map<String, u2l> map = this.templateEnvironments;
        u2l u2lVar = map.get(groupId);
        if (u2lVar == null) {
            u2lVar = e(groupId);
            map.put(groupId, u2lVar);
        }
        return u2lVar;
    }

    public /* synthetic */ TemplatesContainer(c cVar, eg90 eg90Var, hlu hluVar, yvf0 yvf0Var, glu gluVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, eg90Var, hluVar, yvf0Var, (i & 16) != 0 ? null : gluVar);
    }
}
