package xsna;

import com.vk.clips.upload.model.TrendingHashtagData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsTrendingHashtagRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class paf implements com.vk.clips.upload.vk.ui.api.a {
    public final raf a;
    public Object b = EmptyList.b;
    public final wi50 c = bay.a();

    public paf(raf rafVar) {
        this.a = rafVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.vk.clips.upload.model.TrendingHashtagData>] */
    @Override // com.vk.clips.upload.vk.ui.api.a
    public final List<TrendingHashtagData> R0() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:12:0x0034, B:13:0x009d, B:14:0x00ad, B:16:0x00b3, B:19:0x00c2, B:24:0x00c6, B:25:0x00d1), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #1 {all -> 0x00cb, blocks: (B:37:0x0076, B:39:0x0080), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [xsna.ui50] */
    @Override // com.vk.clips.upload.vk.ui.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        oaf oafVar;
        int i;
        wi50 wi50Var;
        int i2;
        int i3;
        ui50 ui50Var;
        Throwable th;
        Collection collection;
        paf pafVar;
        Collection collection2;
        try {
            if (continuationImpl instanceof oaf) {
                oafVar = (oaf) continuationImpl;
                int i4 = oafVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    oafVar.label = i4 - Integer.MIN_VALUE;
                    Object obj = oafVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = oafVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        Collection collection3 = (Collection) this.b;
                        if (!collection3.isEmpty()) {
                            return collection3;
                        }
                        wi50Var = this.c;
                        oafVar.L$0 = wi50Var;
                        oafVar.L$1 = null;
                        oafVar.I$0 = 0;
                        oafVar.I$1 = 0;
                        oafVar.label = 1;
                        if (wi50Var.b(oafVar) != coroutineSingletons) {
                            i2 = 0;
                            i3 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pafVar = (paf) oafVar.L$2;
                        ui50Var = (ui50) oafVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : (Iterable) obj) {
                                if (hashSet.add(((TrendingHashtagData) obj2).b)) {
                                    arrayList.add(obj2);
                                }
                            }
                            pafVar.b = arrayList;
                            collection2 = this.b;
                            List list = (List) collection2;
                            ui50Var.c(null);
                            return list;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    i2 = oafVar.I$1;
                    i3 = oafVar.I$0;
                    ?? r7 = (ui50) oafVar.L$0;
                    kotlin.a.a(obj);
                    wi50Var = r7;
                    collection = (Collection) this.b;
                    if (collection.isEmpty()) {
                        ui50Var = wi50Var;
                        collection2 = collection;
                        List list2 = (List) collection2;
                        ui50Var.c(null);
                        return list2;
                    }
                    raf rafVar = this.a;
                    oafVar.L$0 = wi50Var;
                    oafVar.L$1 = null;
                    oafVar.L$2 = this;
                    oafVar.I$0 = i3;
                    oafVar.I$1 = i2;
                    oafVar.I$2 = 0;
                    oafVar.I$3 = 0;
                    oafVar.label = 2;
                    Serializable a = rafVar.a(oafVar);
                    if (a != coroutineSingletons) {
                        ui50Var = wi50Var;
                        obj = a;
                        pafVar = this;
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        while (r11.hasNext()) {
                        }
                        pafVar.b = arrayList2;
                        collection2 = this.b;
                        List list22 = (List) collection2;
                        ui50Var.c(null);
                        return list22;
                    }
                    return coroutineSingletons;
                }
            }
            collection = (Collection) this.b;
            if (collection.isEmpty()) {
            }
        } catch (Throwable th3) {
            ui50Var = wi50Var;
            th = th3;
            ui50Var.c(null);
            throw th;
        }
        oafVar = new oaf(this, continuationImpl);
        Object obj3 = oafVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oafVar.label;
        if (i != 0) {
        }
    }
}
