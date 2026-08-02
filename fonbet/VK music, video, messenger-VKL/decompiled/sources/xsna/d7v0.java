package xsna;

import android.util.Pair;
import android.view.View;
import com.vk.log.L;
import com.vk.richcontent.api.MimeType;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Result;

/* compiled from: VkOnReceiveContentListenerImpl.kt */
/* loaded from: classes5.dex */
public final class d7v0 implements oa80 {
    public final Set<MimeType> a;
    public final Set<xjg0> b;
    public final ExecutorService c;

    public d7v0(HashSet hashSet, HashSet hashSet2) {
        this.a = hashSet;
        this.b = hashSet2;
        asu0.a.getClass();
        this.c = asu0.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.Result$Failure] */
    @Override // xsna.oa80
    public final chj a(View view, chj chjVar) {
        chj chjVar2;
        try {
            Pair e = chjVar.e(new rmm0(this, view));
            kotlin.Pair pair = new kotlin.Pair(e.first, e.second);
            chj chjVar3 = (chj) pair.d();
            chj chjVar4 = (chj) pair.g();
            this.c.execute(new y63(this, view.getContext(), chjVar3, 3));
            chjVar2 = chjVar4;
        } catch (Throwable th) {
            chjVar2 = new Result.Failure(th);
        }
        Throwable a = Result.a(chjVar2);
        if (a != null) {
            L.j(a, "Failed while receiving rich content");
        }
        if (!(chjVar2 instanceof Result.Failure)) {
            chjVar = chjVar2;
        }
        return chjVar;
    }
}
