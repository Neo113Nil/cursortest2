package xsna;

import com.vk.music.offline.ui.presentation.entity.MusicDownloadsSettingsState;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.lj40;

/* compiled from: MusicDownloadsSettingsStateMapper.kt */
/* loaded from: classes3.dex */
public final class fj40 implements izs<MusicDownloadsSettingsState, lj40> {
    @Override // xsna.izs
    public final lj40 invoke(MusicDownloadsSettingsState musicDownloadsSettingsState) {
        MusicDownloadsSettingsState musicDownloadsSettingsState2 = musicDownloadsSettingsState;
        boolean z = musicDownloadsSettingsState2.b;
        lar larVar = lar.a;
        long j = musicDownloadsSettingsState2.c;
        larVar.getClass();
        String y = brm0.y(lar.a(j), ".", StringUtils.COMMA);
        return new lj40(z, j > 0 ? new lj40.a.b(y) : new lj40.a.C3270a(y));
    }
}
