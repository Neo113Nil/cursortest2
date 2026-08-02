package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import java.util.UUID;

/* compiled from: CatalogMviLegacyLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class gba implements fba {
    public final lpg0 a;

    public gba(lpg0 lpg0Var) {
        this.a = lpg0Var;
    }

    @Override // xsna.fba
    public final void a(Context context, String str, String str2) {
        StringBuilder b = v1v.b(VideoCatalogRootVh.class.getCanonicalName(), '_');
        b.append(UUID.randomUUID());
        String sb = b.toString();
        CatalogShowAllFragment.b bVar = new CatalogShowAllFragment.b();
        iw50 iw50Var = bVar.b;
        iw50Var.a.putString("entry_point", sb);
        iw50Var.a.putString("title", str2);
        iw50Var.a.putString("section", str);
        this.a.a(context, bVar);
    }
}
