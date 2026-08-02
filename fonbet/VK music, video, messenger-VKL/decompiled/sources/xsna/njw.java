package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.lists.ListDataSet;

/* compiled from: CoverCropActivity.kt */
/* loaded from: classes5.dex */
public final class njw implements rfz {
    public final Object a;
    public final Object b;
    public final Object c;

    public /* synthetic */ njw(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // xsna.rfz
    public void a(final gkq0 gkq0Var, final jav javVar, final izs izsVar) {
        final hg6 hg6Var = (hg6) ((gzs) this.a).invoke();
        if (hg6Var == null) {
            return;
        }
        final izs izsVar2 = (izs) this.b;
        final gzs gzsVar = (gzs) this.c;
        ((ListDataSet) hg6Var).u(new wzs() { // from class: xsna.tfz
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                gkq0 gkq0Var2 = gkq0.this;
                UserId userId = gkq0Var2.a;
                String str = gkq0Var2.b;
                izs izsVar3 = izsVar2;
                if (n34.c(obj2, userId, str, izsVar3)) {
                    RequestUserProfile requestUserProfile = (RequestUserProfile) izsVar3.invoke(obj2);
                    if (requestUserProfile != null) {
                        izsVar.invoke(requestUserProfile);
                    }
                    RecyclerView recyclerView = (RecyclerView) gzsVar.invoke();
                    if (recyclerView != null) {
                        wjf0.c(recyclerView, new ufz(hg6Var, num, obj2, javVar, 0));
                    }
                }
                return s3q0.a;
            }
        });
    }
}
