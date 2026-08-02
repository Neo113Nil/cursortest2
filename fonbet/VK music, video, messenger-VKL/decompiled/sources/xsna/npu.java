package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.ArrayList;

/* compiled from: GroupsForCommentsImpersonation.java */
/* loaded from: classes5.dex */
public final class npu {
    public static npu d;
    public VKList a;
    public UserId b;
    public long c;

    /* compiled from: GroupsForCommentsImpersonation.java */
    public class a implements hx2<VKList<Group>> {
        public final /* synthetic */ hx2 b;

        public a(hx2 hx2Var) {
            this.b = hx2Var;
        }

        @Override // xsna.hx2
        public final void b(VKList<Group> vKList) {
            npu npuVar = npu.this;
            npuVar.a = vKList;
            npuVar.b = o25.a().c();
            npuVar.c = System.currentTimeMillis();
            this.b.b(npuVar.a);
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            this.b.e(vKApiExecutionException);
        }
    }

    public static npu a() {
        if (d == null) {
            npu npuVar = new npu();
            npuVar.a = null;
            npuVar.b = UserId.d;
            d = npuVar;
        }
        return d;
    }

    public final void b(hx2<ArrayList<Group>> hx2Var) {
        if (!o25.a().c().equals(this.b) || System.currentTimeMillis() - this.c > 43200000) {
            this.a = null;
        }
        VKList vKList = this.a;
        if (vKList != null) {
            hx2Var.b(vKList);
        } else {
            new jx2(new fo(), new a(hx2Var)).a();
        }
    }
}
