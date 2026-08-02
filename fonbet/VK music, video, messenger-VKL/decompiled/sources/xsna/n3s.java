package xsna;

import com.vk.dto.user.RequestUserProfile;
import com.vk.toggle.features.CatalogFeatures;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.g3s;
import xsna.ptf0;
import xsna.qf90;
import xsna.t3s;
import xsna.v3s;
import xsna.w3s;

/* compiled from: FollowersListReducer.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class n3s extends FunctionReferenceImpl implements izs<t3s.a, w3s.d> {
    @Override // xsna.izs
    public final w3s.d invoke(t3s.a aVar) {
        t3s.a aVar2 = aVar;
        ((i3s) this.receiver).getClass();
        qf90 qf90Var = aVar2.d;
        ListBuilder e = e43.e();
        g3s g3sVar = aVar2.b;
        if (g3sVar instanceof g3s.a) {
            g3s.a aVar3 = (g3s.a) g3sVar;
            int i = aVar3.a;
            if (i > 0) {
                e.add(new v3s.b(i));
                Iterator<T> it = aVar3.c.iterator();
                while (it.hasNext()) {
                    e.add(new v3s.a((RequestUserProfile) it.next()));
                }
            }
            CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
            catalogFeatures.getClass();
            if (!com.vk.toggle.b.A.a(catalogFeatures)) {
                e.add(new v3s.c(aVar3.b));
            }
            Iterator<T> it2 = aVar3.d.iterator();
            while (it2.hasNext()) {
                e.add(new v3s.a((RequestUserProfile) it2.next()));
            }
        } else if (!(g3sVar instanceof g3s.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (qf90Var instanceof qf90.c) {
            e.add(v3s.e.b);
        }
        if (qf90Var instanceof qf90.a) {
            e.add(new v3s.d(((qf90.a) qf90Var).a));
        }
        return new w3s.d(e.g(), aVar2.c instanceof ptf0.b);
    }
}
