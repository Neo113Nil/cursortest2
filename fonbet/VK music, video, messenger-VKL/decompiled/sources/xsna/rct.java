package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;

/* compiled from: GamesCatalogNavigatorProviderImpl.kt */
/* loaded from: classes.dex */
public final class rct implements qct {
    @Override // xsna.qct
    public final Class<? extends FragmentImpl> a() {
        return GamesCatalogFragment.class;
    }

    @Override // xsna.qct
    public final oz50 b() {
        return new GamesCatalogFragment.a();
    }

    @Override // xsna.qct
    public final oz50 c(GamesHeaderSectionInfo gamesHeaderSectionInfo, String str) {
        return new GamesCatalogDetailFragment.a(gamesHeaderSectionInfo, str);
    }
}
