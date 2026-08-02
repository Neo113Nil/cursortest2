package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistViewItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Collections;
import java.util.List;
import xsna.hzp0;
import xsna.vha;

/* compiled from: ArtistBioCatalogUiViewTracker.kt */
/* loaded from: classes16.dex */
public final class kq3 extends z160 {
    public final boolean f;
    public final s1v g;

    public kq3(s1v s1vVar, dha dhaVar) {
        super(s1vVar, dhaVar, 4);
        this.f = true;
        this.g = s1vVar;
    }

    @Override // xsna.vha, xsna.d680
    public final List<hzp0> j(Object obj) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        if (!this.f) {
            return null;
        }
        if (!(obj instanceof vha.b)) {
            return super.j(obj);
        }
        vha.b bVar = (vha.b) obj;
        UIBlock uIBlock = bVar.a;
        UIBlockArtistBio uIBlockArtistBio = uIBlock instanceof UIBlockArtistBio ? (UIBlockArtistBio) uIBlock : null;
        if (uIBlockArtistBio == null) {
            return super.j(obj);
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, this.g.e(uIBlockArtistBio), null, 46, null);
        String str = uIBlockArtistBio.A;
        if (str == null) {
            str = "";
        }
        CommonAudioStat$TypeAudioArtistViewItem commonAudioStat$TypeAudioArtistViewItem = new CommonAudioStat$TypeAudioArtistViewItem(new CommonStat$TypeTrackCodeItem(str), CommonAudioStat$TypeAudioArtistViewItem.RefSource.ARTIST_BIO);
        dha dhaVar = this.c;
        if (dhaVar == null || (mobileOfficialAppsCoreNavStat$EventScreen = dhaVar.a()) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        return Collections.singletonList(new hzp0.b(schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, commonAudioStat$TypeAudioArtistViewItem, bVar.b));
    }
}
