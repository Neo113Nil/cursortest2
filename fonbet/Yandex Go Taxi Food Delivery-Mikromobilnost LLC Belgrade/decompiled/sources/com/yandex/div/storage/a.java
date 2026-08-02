package com.yandex.div.storage;

import android.os.Build;
import android.os.SystemClock;
import com.yandex.div.json.ParsingException;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivDataRepositoryException;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.c;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import defpackage.c9i0;
import defpackage.eg90;
import defpackage.fu11;
import defpackage.glu;
import defpackage.gw00;
import defpackage.hlu;
import defpackage.kju0;
import defpackage.ngd0;
import defpackage.omk;
import defpackage.qv10;
import defpackage.sey0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.u2l;
import defpackage.v3c;
import defpackage.v4r0;
import defpackage.wmk;
import defpackage.yvf0;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010$\u001a\u00020#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020'2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u0002¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u0017*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u001dH\u0002¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020301*\b\u0012\u0004\u0012\u00020201H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020#2\u0006\u00107\u001a\u000206H\u0017¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020#H\u0017¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001101H\u0017¢\u0006\u0004\b<\u0010=J#\u0010C\u001a\u00020B2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>H\u0017¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010GR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010JR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010MR\u0016\u0010P\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010OR(\u0010R\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010M¨\u0006S"}, d2 = {"Lcom/yandex/div/storage/a;", "Lcom/yandex/div/storage/DivDataRepository;", "Lcom/yandex/div/storage/c;", "divStorage", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "templateContainer", "Lhlu;", "histogramRecorder", "Lglu;", "histogramNameProvider", "Lyvf0;", "Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "divParsingHistogramProxy", "Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;", "cardErrorFactory", "<init>", "(Lcom/yandex/div/storage/c;Lcom/yandex/div/storage/templates/TemplatesContainer;Lhlu;Lglu;Lyvf0;Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;)V", "", "f", "()Ljava/lang/String;", "Lu2l;", "cardId", "groupId", "Lorg/json/JSONObject;", kju0.j, "g", "(Lu2l;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lu2l;", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "", "e", "(Ljava/util/Map;)Ljava/util/Map;", "", "ids", "idsToExclude", "Lcom/yandex/div/storage/b;", "h", "(Ljava/util/Set;Ljava/util/Set;)Lcom/yandex/div/storage/b;", "deletedRecords", "Lzy11;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "(Ljava/util/Set;)V", "rawDivData", "parsingEnvironment", "Lomk;", CoreConstants.PushMessage.SERVICE_TYPE, "(Lorg/json/JSONObject;Lu2l;Ljava/lang/String;)Lomk;", "d", "(Ljava/util/Map;)Lorg/json/JSONObject;", "", "Lcom/yandex/div/storage/database/StorageException;", "Lcom/yandex/div/storage/DivDataRepositoryException$StorageException;", "k", "(Ljava/util/List;)Ljava/util/List;", "Lcom/yandex/div/storage/DivDataRepository$b;", "payload", "c", "(Lcom/yandex/div/storage/DivDataRepository$b;)Lcom/yandex/div/storage/b;", "getAll", "()Lcom/yandex/div/storage/b;", "b", "(Ljava/util/List;)Lcom/yandex/div/storage/b;", "Lkotlin/Function1;", "Lc9i0;", "", "predicate", "Lwmk;", "a", "(Ltls;)Lwmk;", "Lcom/yandex/div/storage/c;", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "Lhlu;", "Lglu;", "Lyvf0;", "Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;", "", "Lcom/yandex/div/storage/DivDataRepository$a;", "Ljava/util/Map;", "inMemoryData", "Z", "areCardsSynchronizedWithInMemory", "Lcom/yandex/div/storage/DivDataRepositoryException;", "cardsWithErrors", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements DivDataRepository {

    /* renamed from: a, reason: from kotlin metadata */
    private final c divStorage;

    /* renamed from: b, reason: from kotlin metadata */
    private final TemplatesContainer templateContainer;

    /* renamed from: c, reason: from kotlin metadata */
    private final hlu histogramRecorder;

    /* renamed from: d, reason: from kotlin metadata */
    private final glu histogramNameProvider;

    /* renamed from: e, reason: from kotlin metadata */
    private final yvf0 divParsingHistogramProxy;

    /* renamed from: f, reason: from kotlin metadata */
    private final CardErrorLoggerFactory cardErrorFactory;

    /* renamed from: h, reason: from kotlin metadata */
    private boolean areCardsSynchronizedWithInMemory;

    /* renamed from: g, reason: from kotlin metadata */
    private final Map<String, DivDataRepository.a> inMemoryData = new LinkedHashMap();

    /* renamed from: i, reason: from kotlin metadata */
    private Map<String, ? extends List<? extends DivDataRepositoryException>> cardsWithErrors = kotlin.collections.b.f();

    public a(c cVar, TemplatesContainer templatesContainer, hlu hluVar, glu gluVar, yvf0 yvf0Var, CardErrorLoggerFactory cardErrorLoggerFactory) {
        this.divStorage = cVar;
        this.templateContainer = templatesContainer;
        this.histogramRecorder = hluVar;
        this.histogramNameProvider = gluVar;
        this.divParsingHistogramProxy = yvf0Var;
        this.cardErrorFactory = cardErrorLoggerFactory;
    }

    private final JSONObject d(Map<String, ? extends JSONObject> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends JSONObject> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    private final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key != null) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    private final String f() {
        return "group-" + Calendar.getInstance().getTime().toString() + LicenseUtility.SEPARATOR + new Object().hashCode();
    }

    private final u2l g(u2l u2lVar, String str, String str2, JSONObject jSONObject) {
        CardErrorLoggerFactory cardErrorLoggerFactory = this.cardErrorFactory;
        eg90 eg90Var = u2lVar.a;
        cardErrorLoggerFactory.getClass();
        return new u2l(new CardErrorLoggerFactory.a(str, str2, jSONObject, cardErrorLoggerFactory, eg90Var), u2lVar.w);
    }

    private final b h(Set<String> ids, Set<String> idsToExclude) {
        ArrayList arrayList = new ArrayList();
        c.a<c.C0035c> d = this.divStorage.d(kotlin.collections.a.J0(ids), kotlin.collections.a.J0(idsToExclude));
        List<c.C0035c> a = d.a();
        arrayList.addAll(k(d.b()));
        List<c.C0035c> list = a;
        int d2 = gw00.d(tcc.n(list, 10));
        if (d2 < 16) {
            d2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
        for (Object obj : list) {
            linkedHashMap.put(((c.C0035c) obj).h(), obj);
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.templateContainer.i((String) it.next());
        }
        v3c.a.getClass();
        long nanoTime = (Build.VERSION.SDK_INT < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000;
        ArrayList arrayList2 = new ArrayList(ids.size());
        for (c.C0035c c0035c : list) {
            u2l g = g(this.templateContainer.i(c0035c.h()), c0035c.i(), c0035c.h(), c0035c.j());
            try {
                arrayList2.add(new DivDataRepository.a(c0035c.i(), i(c0035c.g(), g, c0035c.i()), c0035c.j()));
            } catch (ParsingException e) {
                g.a.a(e);
                arrayList.add(new DivDataRepositoryException.JsonParsingException("Error parsing DivData", e, c0035c.i(), null));
            }
        }
        hlu hluVar = this.histogramRecorder;
        v3c.a.getClass();
        hlu.c(hluVar, ((Build.VERSION.SDK_INT < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000) - nanoTime, null, 2, null);
        return new b(arrayList2, arrayList);
    }

    private final omk i(JSONObject rawDivData, u2l parsingEnvironment, String cardId) throws ParsingException {
        glu gluVar = this.histogramNameProvider;
        return ((DivParsingHistogramProxy) this.divParsingHistogramProxy.get()).a(parsingEnvironment, rawDivData, gluVar != null ? gluVar.e(cardId) : null);
    }

    private final void j(Set<String> deletedRecords) {
        Iterator<T> it = deletedRecords.iterator();
        while (it.hasNext()) {
            this.inMemoryData.remove((String) it.next());
        }
    }

    private final List<DivDataRepositoryException.StorageException> k(List<? extends StorageException> list) {
        List<? extends StorageException> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivDataRepositoryException.StorageException((StorageException) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.div.storage.DivDataRepository
    public final wmk a(tls predicate) {
        c.b a = this.divStorage.a(predicate);
        Set<String> a2 = a.a();
        List<DivDataRepositoryException.StorageException> k = k(a.b());
        j(a2);
        return new wmk(a2, k);
    }

    @Override // com.yandex.div.storage.DivDataRepository
    public final b b(List<String> ids) {
        if (ids.isEmpty()) {
            b.INSTANCE.getClass();
            return b.d;
        }
        List<String> list = ids;
        Set<String> M0 = kotlin.collections.a.M0(list);
        ArrayList arrayList = new ArrayList(ids.size());
        for (String str : list) {
            DivDataRepository.a aVar = this.inMemoryData.get(str);
            if (aVar != null) {
                arrayList.add(aVar);
                M0.remove(str);
            }
        }
        if (M0.isEmpty()) {
            return new b(arrayList, EmptyList.a);
        }
        b h = h(M0, EmptySet.a);
        for (DivDataRepository.a aVar2 : h.h()) {
            this.inMemoryData.put(aVar2.getId(), aVar2);
        }
        return h.b(arrayList);
    }

    @Override // com.yandex.div.storage.DivDataRepository
    public final b c(DivDataRepository.b payload) {
        long j;
        ArrayList arrayList = new ArrayList();
        String f = f();
        List<sey0> b = !payload.j().isEmpty() ? this.templateContainer.b(f, d(payload.j()), payload.i()) : EmptyList.a;
        v3c.a.getClass();
        long j2 = 1000;
        long nanoTime = (Build.VERSION.SDK_INT < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000;
        ArrayList arrayList2 = new ArrayList(payload.h().size());
        ArrayList arrayList3 = new ArrayList(payload.h().size());
        for (c9i0 c9i0Var : payload.h()) {
            u2l g = g(this.templateContainer.i(f), c9i0Var.getId(), f, c9i0Var.getKju0.j java.lang.String());
            try {
                omk i = i(c9i0Var.getDivData(), g, c9i0Var.getId());
                arrayList3.add(c9i0Var);
                arrayList2.add(new DivDataRepository.a(c9i0Var.getId(), i, c9i0Var.getKju0.j java.lang.String()));
                j = j2;
            } catch (ParsingException e) {
                g.a.a(e);
                j = j2;
                arrayList.add(new DivDataRepositoryException.JsonParsingException("Error parsing DivData", e, c9i0Var.getId(), null));
            }
            j2 = j;
        }
        long j3 = j2;
        ngd0.G.p();
        if (fu11.a.a()) {
            hlu hluVar = this.histogramRecorder;
            v3c.a.getClass();
            hlu.c(hluVar, ((Build.VERSION.SDK_INT < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / j3) - nanoTime, null, 2, null);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            DivDataRepository.a aVar = (DivDataRepository.a) it.next();
            this.inMemoryData.put(aVar.getId(), aVar);
        }
        arrayList.addAll(k(this.divStorage.g(f, (arrayList3.size() == payload.h().size() ? payload : DivDataRepository.b.f(payload, arrayList3, null, null, null, 14, null)).h(), b, payload.g()).a()));
        return new b(arrayList2, arrayList);
    }

    @Override // com.yandex.div.storage.DivDataRepository
    public final b getAll() {
        if (this.areCardsSynchronizedWithInMemory && this.cardsWithErrors.isEmpty()) {
            return new b(kotlin.collections.a.J0(this.inMemoryData.values()), EmptyList.a);
        }
        boolean z = this.areCardsSynchronizedWithInMemory;
        EmptySet emptySet = EmptySet.a;
        Pair pair = z ? new Pair(this.cardsWithErrors.keySet(), emptySet) : new Pair(emptySet, v4r0.g(this.inMemoryData.keySet(), this.cardsWithErrors.keySet()));
        b h = h((Set) pair.getFirst(), (Set) pair.getSecond());
        b b = h.b(this.inMemoryData.values());
        for (DivDataRepository.a aVar : h.h()) {
            this.inMemoryData.put(aVar.getId(), aVar);
        }
        this.areCardsSynchronizedWithInMemory = true;
        List<DivDataRepositoryException> g = h.g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : g) {
            String cardId = ((DivDataRepositoryException) obj).getCardId();
            Object obj2 = linkedHashMap.get(cardId);
            if (obj2 == null) {
                obj2 = qv10.w(cardId, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        this.cardsWithErrors = e(linkedHashMap);
        return b;
    }
}
