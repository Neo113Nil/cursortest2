package com.yandex.div.storage.templates;

import com.yandex.div.storage.c;
import com.yandex.div.storage.templates.b;
import defpackage.eg90;
import defpackage.i3y;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u001b\u001a\u0016\u0012\b\u0012\u00060\u000bj\u0002`\u0017\u0012\b\u0012\u00060\u000bj\u0002`\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR!\u0010#\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\u00180 8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010\"R+\u0010)\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\u0018\u0012\u0004\u0012\u00020%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/yandex/div/storage/templates/TemplateReferenceResolver;", "", "Leg90;", "logger", "<init>", "(Leg90;)V", "Lcom/yandex/div/storage/c$d;", "templateReference", "Lzy11;", "d", "(Lcom/yandex/div/storage/c$d;)V", "", "hash", "Lkotlin/Function1;", "block", "e", "(Ljava/lang/String;Ltls;)V", "id", "h", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Leg90;", "", "Lcom/yandex/div/storage/templates/TemplateId;", "Lcom/yandex/div/storage/templates/TemplateHash;", "b", "Ljava/util/Map;", "templateHashRefs", "", "c", "Ljava/util/Set;", "_templateHashes", "", "f", "()Ljava/util/Set;", "templateHashes", "", "Lcom/yandex/div/storage/templates/b;", "Li3y;", "g", "()Ljava/util/Map;", "templateIdRefs", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TemplateReferenceResolver {

    /* renamed from: a, reason: from kotlin metadata */
    private final eg90 logger;

    /* renamed from: b, reason: from kotlin metadata */
    private final Map<String, String> templateHashRefs = new LinkedHashMap();

    /* renamed from: c, reason: from kotlin metadata */
    private final Set<String> _templateHashes;

    /* renamed from: d, reason: from kotlin metadata */
    private final Set<String> templateHashes;

    /* renamed from: e, reason: from kotlin metadata */
    private final i3y templateIdRefs;

    public TemplateReferenceResolver(eg90 eg90Var) {
        this.logger = eg90Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this._templateHashes = linkedHashSet;
        this.templateHashes = linkedHashSet;
        this.templateIdRefs = kotlin.a.a(new sls() { // from class: com.yandex.div.storage.templates.TemplateReferenceResolver$templateIdRefs$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final HashMap<String, b> invoke() {
                Map map;
                Map map2;
                map = TemplateReferenceResolver.this.templateHashRefs;
                HashMap<String, b> hashMap = new HashMap<>(map.size());
                map2 = TemplateReferenceResolver.this.templateHashRefs;
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    b bVar = hashMap.get(str2);
                    if (bVar == null) {
                        bVar = b.C0037b.a(str);
                    } else if (bVar instanceof b.C0037b) {
                        bVar = b.a.a(scc.i(((b.C0037b) bVar).h(), str));
                    } else {
                        if (!(bVar instanceof b.a)) {
                            w511.b();
                            return null;
                        }
                        ((b.a) bVar).getIds().add(str);
                    }
                    hashMap.put(str2, bVar);
                }
                return hashMap;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, b> g() {
        return (Map) this.templateIdRefs.getValue();
    }

    public final void d(c.d templateReference) {
        this.templateHashRefs.put(templateReference.h(), templateReference.g());
        this._templateHashes.add(templateReference.g());
    }

    public final void e(String hash, tls block) {
        b bVar = g().get(hash);
        if (bVar instanceof b.a) {
            Iterator it = ((b.a) bVar).getIds().iterator();
            while (it.hasNext()) {
                block.invoke((String) it.next());
            }
        } else if (bVar instanceof b.C0037b) {
            block.invoke(((b.C0037b) bVar).h());
        } else if (bVar == null) {
            this.logger.a(new IllegalStateException("No template id was found for hash!"));
        }
    }

    public final Set<String> f() {
        return this.templateHashes;
    }

    public final String h(String id) {
        return this.templateHashRefs.get(id);
    }
}
