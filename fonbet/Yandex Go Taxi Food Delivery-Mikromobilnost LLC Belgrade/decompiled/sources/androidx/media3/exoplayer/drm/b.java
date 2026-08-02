package androidx.media3.exoplayer.drm;

import com.google.common.collect.ImmutableList;
import defpackage.lno;
import defpackage.piv;
import defpackage.tw21;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class b {
    public final HashSet a = new HashSet();
    public a b;

    public final void a(Exception exc, boolean z) {
        this.b = null;
        HashSet hashSet = this.a;
        ImmutableList l = ImmutableList.l(hashSet);
        hashSet.clear();
        piv listIterator = l.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            aVar.getClass();
            aVar.l(z ? 1 : 3, exc);
        }
    }

    public final void b(a aVar) {
        this.a.add(aVar);
        if (this.b != null) {
            return;
        }
        this.b = aVar;
        lno provisionRequest = aVar.b.getProvisionRequest();
        aVar.y = provisionRequest;
        DefaultDrmSession$RequestHandler defaultDrmSession$RequestHandler = aVar.s;
        int i = tw21.a;
        provisionRequest.getClass();
        defaultDrmSession$RequestHandler.post(1, provisionRequest, true);
    }
}
