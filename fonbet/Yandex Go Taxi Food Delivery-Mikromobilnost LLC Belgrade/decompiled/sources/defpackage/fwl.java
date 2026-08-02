package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class fwl extends fnr0 {
    public final sul a;
    public final zjr b;
    public final i3y c;
    public final qul d;
    public final String e;
    public final String f;
    public final ReentrantLock g;

    public fwl(sul sulVar) {
        super(new gnr0(true));
        this.a = sulVar;
        zjr zjrVar = new zjr(xfz.b(fwl.class.getSimpleName()));
        this.b = zjrVar;
        this.c = a.a(new tvl(2));
        this.d = new qul(1, zjrVar);
        this.e = "divkitTemplates";
        this.f = "DivkitTemplatesSharedDataParser";
        this.g = new ReentrantLock();
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.e;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:8:0x0027, B:10:0x003a, B:13:0x0079, B:15:0x00a3, B:18:0x00b6, B:19:0x00c5, B:21:0x00cb, B:24:0x00dd, B:29:0x00e9, B:30:0x00ee, B:32:0x00f6, B:34:0x00ff, B:35:0x0110, B:40:0x0042, B:42:0x005c, B:43:0x0060), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:8:0x0027, B:10:0x003a, B:13:0x0079, B:15:0x00a3, B:18:0x00b6, B:19:0x00c5, B:21:0x00cb, B:24:0x00dd, B:29:0x00e9, B:30:0x00ee, B:32:0x00f6, B:34:0x00ff, B:35:0x0110, B:40:0x0042, B:42:0x005c, B:43:0x0060), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:8:0x0027, B:10:0x003a, B:13:0x0079, B:15:0x00a3, B:18:0x00b6, B:19:0x00c5, B:21:0x00cb, B:24:0x00dd, B:29:0x00e9, B:30:0x00ee, B:32:0x00f6, B:34:0x00ff, B:35:0x0110, B:40:0x0042, B:42:0x005c, B:43:0x0060), top: B:7:0x0027 }] */
    @Override // defpackage.fnr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        u2l u2lVar;
        c cVar;
        String str;
        i3y i3yVar = this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
        if (nezVar != null && (str = nezVar.a) != null) {
            this.b.f(str);
        }
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            xtl xtlVar = (xtl) bvf0.A(sbxVar).c(qoi0.a(xtl.class));
            int i = 0;
            if (xtlVar != null) {
                u2lVar = xtlVar.a;
                if (u2lVar == null) {
                }
                le7 le7Var = u2lVar.w;
                le7Var.c(new LinkedHashMap(((gwl) i3yVar.getValue()).b));
                cVar = (c) bVar;
                if (Boolean.FALSE.booleanValue()) {
                    Set keySet = ((gwl) i3yVar.getValue()).b.keySet();
                    if (!keySet.isEmpty()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : cVar.a.entrySet()) {
                            if (!keySet.contains((String) entry.getKey())) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        cVar = new c(linkedHashMap2);
                    }
                }
                if (!cVar.a.isEmpty()) {
                    u2lVar.e(gwk0.E(cVar));
                }
                if (xtlVar == null) {
                    bvf0.A(sbxVar).e(new xtl(u2lVar));
                }
                linkedHashMap.putAll(le7Var.a.a);
                ((gwl) i3yVar.getValue()).a.putAll(linkedHashMap);
                reentrantLock.unlock();
                return new ewl(linkedHashMap);
            }
            sul sulVar = this.a;
            qul qulVar = this.d;
            e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
            u2lVar = new u2l(new qul(i, a.a(new in2(3, sulVar, new zr50[]{new zr50(e7j0Var != null ? e7j0Var.a : null)}, qulVar))));
            le7 le7Var2 = u2lVar.w;
            le7Var2.c(new LinkedHashMap(((gwl) i3yVar.getValue()).b));
            cVar = (c) bVar;
            if (Boolean.FALSE.booleanValue()) {
            }
            if (!cVar.a.isEmpty()) {
            }
            if (xtlVar == null) {
            }
            linkedHashMap.putAll(le7Var2.a.a);
            ((gwl) i3yVar.getValue()).a.putAll(linkedHashMap);
            reentrantLock.unlock();
            return new ewl(linkedHashMap);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
