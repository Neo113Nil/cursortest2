package xsna;

import android.os.Bundle;
import com.vk.folders.impl.configure.FolderConfigurationFragment;
import com.vk.folders.impl.show.FoldersShowFragment;
import com.vk.im.mvicomponent.MviComponentFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.m2s;

/* compiled from: FoldersShowRouter.kt */
/* loaded from: classes18.dex */
public final class n2s implements hm50<m2s> {
    public final MviComponentFragment a;

    public n2s(FoldersShowFragment foldersShowFragment) {
        this.a = foldersShowFragment;
    }

    @Override // xsna.hm50
    public final void a(m2s m2sVar) {
        m2s m2sVar2 = m2sVar;
        boolean equals = m2sVar2.equals(m2s.b.a);
        MviComponentFragment mviComponentFragment = this.a;
        if (equals) {
            new FolderConfigurationFragment.a().k(mviComponentFragment.requireContext());
            return;
        }
        if (m2sVar2.equals(m2s.a.a)) {
            mviComponentFragment.finish();
            return;
        }
        if (!(m2sVar2 instanceof m2s.c)) {
            throw new NoWhenBranchMatchedException();
        }
        FolderConfigurationFragment.a aVar = new FolderConfigurationFragment.a();
        yyr yyrVar = ((m2s.c) m2sVar2).a;
        int id = yyrVar.getId();
        Bundle bundle = aVar.j;
        bundle.putInt("configuration_data_id", id);
        bundle.putString("configuration_data_name", yyrVar.getName().toString());
        bundle.putString("configuration_data_type", yyrVar.getType().j());
        aVar.k(mviComponentFragment.requireContext());
    }
}
