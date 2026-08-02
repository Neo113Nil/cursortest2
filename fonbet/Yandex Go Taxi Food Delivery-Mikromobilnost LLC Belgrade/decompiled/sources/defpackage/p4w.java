package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.instructions.data.a;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

/* loaded from: classes4.dex */
public final class p4w {
    public final h9e a;
    public final u3u b;
    public final IKeyStorage c;
    public final IFileManager d;
    public final l4w e;

    public p4w(h9e h9eVar, u3u u3uVar, IKeyStorage iKeyStorage, IFileManager iFileManager, l4w l4wVar) {
        this.a = h9eVar;
        this.b = u3uVar;
        this.c = iKeyStorage;
        this.d = iFileManager;
        this.e = l4wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r10v5, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                Object obj = aVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.c;
                if (i != 0) {
                    b.b(obj);
                    aVar.c = 1;
                    obj = ((qwu) this.a.b).d(new xwu(HttpsMethod.GET, new axu(str), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), null, new ArrayList()), aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return rzo.R(((ywu) obj).e);
            }
        }
        aVar = new a(this, continuationImpl);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
        if (i != 0) {
        }
        return rzo.R(((ywu) obj2).e);
    }
}
