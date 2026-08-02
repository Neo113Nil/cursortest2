package xsna;

import android.util.DisplayMetrics;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionStateFlow;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.playlist.playlistscreen.domain.PlaylistButtonDo;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.NotificationsState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenData;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3p0;
import xsna.pbx0;

/* compiled from: PlaylistScreenViewStateMapper.kt */
/* loaded from: classes6.dex */
public final class aeb0 implements izs<PlaylistScreenState, zdb0> {
    public static final Set<CatalogBlockVariant> e = rl3.y0(new CatalogBlockVariant[]{CatalogBlockVariant.PlaceholderChannel, CatalogBlockVariant.PlaceHolderBig});
    public final tga b;
    public final b1y c;
    public final g7s0 d;

    public aeb0(tga tgaVar, b1y b1yVar, g7s0 g7s0Var) {
        this.b = tgaVar;
        this.c = b1yVar;
        this.d = g7s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b3, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zdb0 invoke(PlaylistScreenState playlistScreenState) {
        boolean z;
        Iterator<T> it;
        Object obj;
        PlaylistScreenInfoDataState playlistScreenInfoDataState;
        e3p0 e3p0Var;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        w7b0 w7b0Var;
        ttk0 a;
        boolean z2;
        CatalogSectionState catalogSectionState;
        List<CatalogBlockData> list;
        List<CatalogBlockData> list2;
        Iterator<T> it2;
        PlaylistScreenState playlistScreenState2 = playlistScreenState;
        PlaylistScreenData playlistScreenData = playlistScreenState2.f;
        List<PlaylistButtonDo> list3 = playlistScreenState2.j;
        PlaylistDataDo j = playlistScreenState2.j();
        VideoAlbum videoAlbum = j != null ? j.h : null;
        if (videoAlbum != null) {
            bpn0 bpn0Var = xg5.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            if (((cpu) bpn0Var.getValue()).a(videoAlbum.c) && sua.p(videoAlbum)) {
                z = true;
                it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((PlaylistButtonDo) obj).c instanceof CatalogLinkButtonActionDo.ToggleAlbumSubscription) {
                        break;
                    }
                }
                boolean z3 = ((PlaylistButtonDo) obj) == null;
                playlistScreenInfoDataState = playlistScreenState2.d;
                if (!(playlistScreenInfoDataState instanceof PlaylistScreenInfoDataState.Failed)) {
                    e3p0Var = e3p0.a.a;
                } else if (playlistScreenInfoDataState instanceof PlaylistScreenInfoDataState.Loading) {
                    e3p0Var = e3p0.b.a;
                } else {
                    if (!(playlistScreenInfoDataState instanceof PlaylistScreenInfoDataState.Loaded)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Image image = ((PlaylistScreenInfoDataState.Loaded) playlistScreenInfoDataState).b.f;
                    if (image != null) {
                        DisplayMetrics displayMetrics = (DisplayMetrics) this.c.c;
                        ImageSize Cb = image.Cb(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels), true, false);
                        e3p0Var = (Cb == null || (str = Cb.d.d) == null) ? e3p0.a.a : new e3p0.c(str);
                    } else {
                        e3p0Var = e3p0.a.a;
                    }
                }
                keb0 keb0Var = new keb0(j == null ? j.g : null, z, z3, j == null ? j.d : false, e3p0Var);
                if (list3.isEmpty()) {
                    boolean r = this.d.J().r();
                    List<PlaylistButtonDo> list4 = list3;
                    Iterator<T> it3 = list4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (((PlaylistButtonDo) obj2).c instanceof CatalogLinkButtonActionDo.PlayVideosFromBlock) {
                            break;
                        }
                    }
                    PlaylistButtonDo playlistButtonDo = (PlaylistButtonDo) obj2;
                    Iterator<T> it4 = list4.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it4.next();
                        if (((PlaylistButtonDo) obj3).c instanceof CatalogLinkButtonActionDo.OpenAddVideosToAlbum) {
                            break;
                        }
                    }
                    PlaylistButtonDo playlistButtonDo2 = (PlaylistButtonDo) obj3;
                    Iterator<T> it5 = list4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it5.next();
                        if (((PlaylistButtonDo) obj4).c instanceof CatalogLinkButtonActionDo.OpenUploadVideo) {
                            break;
                        }
                    }
                    PlaylistButtonDo playlistButtonDo3 = (PlaylistButtonDo) obj4;
                    Iterator<T> it6 = list4.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj5 = null;
                            break;
                        }
                        obj5 = it6.next();
                        if (((PlaylistButtonDo) obj5).c instanceof CatalogLinkButtonActionDo.ToggleAlbumShuffle) {
                            break;
                        }
                    }
                    PlaylistButtonDo playlistButtonDo4 = (PlaylistButtonDo) obj5;
                    if (playlistButtonDo4 == null || !r) {
                        playlistButtonDo4 = null;
                    }
                    Iterator<T> it7 = list4.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj6 = null;
                            break;
                        }
                        obj6 = it7.next();
                        if (((PlaylistButtonDo) obj6).c instanceof CatalogLinkButtonActionDo.ToggleAlbumSubscription) {
                            break;
                        }
                    }
                    PlaylistButtonDo playlistButtonDo5 = (PlaylistButtonDo) obj6;
                    boolean z4 = (playlistButtonDo2 == null && playlistButtonDo3 == null) ? false : true;
                    pbx0 cVar = playlistButtonDo == null ? pbx0.a.a : playlistButtonDo != null && z4 ? pbx0.b.a : new pbx0.c(playlistButtonDo.b);
                    boolean z5 = playlistButtonDo4 != null;
                    boolean z6 = playlistButtonDo5 != null;
                    PlaylistDataDo j2 = playlistScreenState2.j();
                    w7b0Var = new w7b0(cVar, z5, z6, z4, j2 != null ? j2.d : false, true, r);
                } else {
                    w7b0Var = null;
                }
                x3g x3gVar = new x3g(keb0Var, w7b0Var);
                if (playlistScreenData != null) {
                    CatalogSectionStateFlow catalogSectionStateFlow = playlistScreenData.c;
                    if (catalogSectionStateFlow.d == null) {
                        catalogSectionStateFlow.d = new xm00(catalogSectionStateFlow.b, new s55(this.b, 12));
                    }
                    a = catalogSectionStateFlow.d;
                }
                a = vtk0.a(null);
                ttk0 ttk0Var = a;
                NotificationsState notificationsState = playlistScreenState2.g;
                boolean z7 = playlistScreenState2.h;
                boolean z8 = playlistScreenState2.i;
                if (playlistScreenData != null && (catalogSectionState = (CatalogSectionState) playlistScreenData.c.b.getValue()) != null && (list = catalogSectionState.d) != null) {
                    list2 = list;
                    if ((list2 instanceof Collection) || !list2.isEmpty()) {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (e.contains(((CatalogBlockData) it2.next()).g().M7())) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                z2 = false;
                return new zdb0(x3gVar, ttk0Var, notificationsState, z7, z8, z2);
            }
        }
        z = false;
        it = list3.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (((PlaylistButtonDo) obj) == null) {
        }
        playlistScreenInfoDataState = playlistScreenState2.d;
        if (!(playlistScreenInfoDataState instanceof PlaylistScreenInfoDataState.Failed)) {
        }
        keb0 keb0Var2 = new keb0(j == null ? j.g : null, z, z3, j == null ? j.d : false, e3p0Var);
        if (list3.isEmpty()) {
        }
        x3g x3gVar2 = new x3g(keb0Var2, w7b0Var);
        if (playlistScreenData != null) {
        }
        a = vtk0.a(null);
        ttk0 ttk0Var2 = a;
        NotificationsState notificationsState2 = playlistScreenState2.g;
        boolean z72 = playlistScreenState2.h;
        boolean z82 = playlistScreenState2.i;
        if (playlistScreenData != null) {
            list2 = list;
            if (list2 instanceof Collection) {
            }
            it2 = list2.iterator();
            while (it2.hasNext()) {
            }
        }
        z2 = false;
        return new zdb0(x3gVar2, ttk0Var2, notificationsState2, z72, z82, z2);
    }
}
