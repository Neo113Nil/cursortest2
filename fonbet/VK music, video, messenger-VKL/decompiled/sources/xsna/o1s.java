package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.folders.impl.configure.FolderConfigurationFragment;
import com.vk.folders.impl.show.FoldersShowFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.l2s;
import xsna.n1s;

/* compiled from: FoldersPagerRouter.kt */
/* loaded from: classes18.dex */
public final class o1s implements hm50<n1s> {
    public final Context a;

    public o1s(Context context) {
        this.a = context;
    }

    @Override // xsna.hm50
    public final void a(n1s n1sVar) {
        n1s n1sVar2 = n1sVar;
        boolean z = n1sVar2 instanceof n1s.a;
        Context context = this.a;
        if (!z) {
            if (!n1sVar2.equals(n1s.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            new FoldersShowFragment.a(l2s.a.a).k(context);
            return;
        }
        FolderConfigurationFragment.a aVar = new FolderConfigurationFragment.a();
        n1s.a aVar2 = (n1s.a) n1sVar2;
        int i = aVar2.a;
        Bundle bundle = aVar.j;
        bundle.putInt("configuration_data_id", i);
        bundle.putString("configuration_data_name", aVar2.b);
        bundle.putString("configuration_data_type", aVar2.c.j());
        aVar.k(context);
    }
}
