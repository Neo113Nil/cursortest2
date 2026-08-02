package xsna;

import androidx.preference.Preference;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogBannerVh;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import xsna.eda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i1a implements yyr0, eda.a, Preference.c, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1a(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.yyr0
    public void a() {
        CatalogBannerVh catalogBannerVh = (CatalogBannerVh) this.b;
        catalogBannerVh.c.b(new xxf0(((UIBlockPlaceholder) ((UIBlock) this.c)).z), false);
        catalogBannerVh.d.c(null);
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        return ((q9a) ((com.vk.catalog2.feature.music.configuration.a) this.b).J.getValue()).h(((qmk0) this.c).b(wbaVar, list, str));
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.b;
        qgq0 qgq0Var = (qgq0) this.c;
        int i = SettingsGeneralFragment.z0;
        qgq0Var.a(settingsGeneralFragment.kn(), new x620(23));
        return true;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }
}
