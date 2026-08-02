package xsna;

import android.content.Intent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.folders.impl.select.FolderPeersSelectFragment;
import com.vk.im.mvicomponent.MviComponentFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.qzr;

/* compiled from: FolderPeersSelectRouter.kt */
/* loaded from: classes18.dex */
public final class rzr implements hm50<qzr> {
    public final MviComponentFragment a;

    public rzr(FolderPeersSelectFragment folderPeersSelectFragment) {
        this.a = folderPeersSelectFragment;
    }

    @Override // xsna.hm50
    public final void a(qzr qzrVar) {
        qzr qzrVar2 = qzrVar;
        boolean z = qzrVar2 instanceof qzr.a;
        MviComponentFragment mviComponentFragment = this.a;
        if (z) {
            qzr.a aVar = (qzr.a) qzrVar2;
            mviComponentFragment.Mf(-1, new Intent().putExtra("included_peers", j5g.P0(aVar.a)).putExtra("excluded_peers", j5g.P0(aVar.b)));
        } else {
            if (!qzrVar2.equals(qzr.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            qcy<Object>[] qcyVarArr = FragmentImpl.M;
            mviComponentFragment.Mf(0, null);
        }
    }
}
