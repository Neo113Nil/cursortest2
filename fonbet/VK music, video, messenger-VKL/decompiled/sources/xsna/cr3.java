package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.mr3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cr3(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                fr3 fr3Var = (fr3) this.d;
                izs<? super br3, s3q0> izsVar = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(347155107, intValue, -1, "com.vk.music.bottomsheets.artistlist.presentation.ArtistListBottomSheetContentView.ThemedContent.<anonymous> (ArtistListBottomSheetContentView.kt:34)");
                    }
                    fr3Var.h((mr3.a) mtk0Var.getValue(), izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                dou.b((dlv0) this.d, (xh70) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 2:
                q630 q630Var = (q630) this.d;
                String str = (String) this.e;
                izs izsVar2 = (izs) this.c;
                ((Integer) obj2).getClass();
                ksx.b(ne7.I(1), (androidx.compose.runtime.a) obj, str, izsVar2, q630Var);
                break;
            case 3:
                nk40 nk40Var = (nk40) this.d;
                Playlist playlist = (Playlist) this.c;
                Playlist playlist2 = (Playlist) this.e;
                UIBlockList uIBlockList = (UIBlockList) obj;
                nk40Var.getClass();
                ArrayList c = k5a.c(uIBlockList, new ma(19, playlist, nk40Var));
                ArrayList arrayList = new ArrayList();
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    UIBlock uIBlock = (UIBlock) it.next();
                    UIBlockMusicPlaylist uIBlockMusicPlaylist = uIBlock instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) uIBlock : null;
                    if (uIBlockMusicPlaylist != null) {
                        arrayList.add(uIBlockMusicPlaylist);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    UIBlockMusicPlaylist uIBlockMusicPlaylist2 = (UIBlockMusicPlaylist) it2.next();
                    Playlist playlist3 = uIBlockMusicPlaylist2.z;
                    if (playlist2.G == null) {
                        playlist2.G = playlist3.G;
                    }
                    uIBlockMusicPlaylist2.z = playlist2;
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                l5k0.a((m5k0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((lrq0) this.d).e((List) this.c, (qvm0) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cr3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ cr3(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }
}
