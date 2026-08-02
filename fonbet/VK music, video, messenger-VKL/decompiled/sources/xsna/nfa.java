package xsna;

import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenArguments;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;

/* compiled from: CatalogSectionScreenLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class nfa implements com.vk.catalog.mvi.section.screen.api.a {
    @Override // com.vk.catalog.mvi.section.screen.api.a
    public final void a(bc6 bc6Var, CatalogSectionScreenArguments catalogSectionScreenArguments) {
        CatalogSectionScreenFragment.a aVar = new CatalogSectionScreenFragment.a(CatalogSectionScreenFragment.class, null, null);
        aVar.j.putParcelable("arguments", catalogSectionScreenArguments);
        aVar.m(bc6Var);
    }
}
