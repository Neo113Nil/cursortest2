package xsna;

import com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics;
import com.vk.di.component.DiScopedComponent;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class scb0 implements wb0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ DiScopedComponent c;

    public /* synthetic */ scb0(DiScopedComponent diScopedComponent, int i) {
        this.b = i;
        this.c = diScopedComponent;
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.b;
        return invoke((sj50) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wb0
    /* renamed from: j */
    public final qj50 invoke(sj50 sj50Var) {
        int i = this.b;
        DiScopedComponent diScopedComponent = this.c;
        switch (i) {
            case 0:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) diScopedComponent;
                PlaylistScreenFragmentInternalComponent.a aVar = PlaylistScreenFragmentInternalComponent.x;
                CatalogPerformanceMetrics Df = playlistScreenFragmentInternalComponent.Df();
                nwy nwyVar = playlistScreenFragmentInternalComponent.w;
                qcy<Object>[] qcyVarArr = PlaylistScreenFragmentInternalComponent.y;
                qcy<Object> qcyVar = qcyVarArr[13];
                bdb0 bdb0Var = (bdb0) nwyVar.c();
                m7a z0 = playlistScreenFragmentInternalComponent.e.z0();
                nwy nwyVar2 = playlistScreenFragmentInternalComponent.m;
                qcy<Object> qcyVar2 = qcyVarArr[3];
                b25 b25Var = (b25) nwyVar2.c();
                cea Ef = playlistScreenFragmentInternalComponent.Ef();
                nwy nwyVar3 = playlistScreenFragmentInternalComponent.v;
                qcy<Object> qcyVar3 = qcyVarArr[12];
                return new vcb0(Df, bdb0Var, z0, b25Var, Ef, (s0a) nwyVar3.c(), sj50Var);
            default:
                SettingsFragmentInternalComponent settingsFragmentInternalComponent = (SettingsFragmentInternalComponent) diScopedComponent;
                SettingsArguments settingsArguments = settingsFragmentInternalComponent.a.a;
                nwy nwyVar4 = settingsFragmentInternalComponent.e;
                qcy<Object>[] qcyVarArr2 = SettingsFragmentInternalComponent.k;
                qcy<Object> qcyVar4 = qcyVarArr2[0];
                n2j0 n2j0Var = (n2j0) nwyVar4.c();
                nwy nwyVar5 = settingsFragmentInternalComponent.f;
                qcy<Object> qcyVar5 = qcyVarArr2[1];
                return new m2j0(settingsArguments, n2j0Var, (com.vk.core.utils.newtork.b) nwyVar5.c(), settingsFragmentInternalComponent.c, sj50Var);
        }
    }
}
