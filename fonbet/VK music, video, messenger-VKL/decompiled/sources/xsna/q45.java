package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.log.L;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.cse;
import xsna.cv70;
import xsna.hv70;
import xsna.ikv0;
import xsna.kqe;
import xsna.t5e;
import xsna.vyh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class q45 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q45(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                Context context = (Context) this.d;
                VkAuthMetaInfo vkAuthMetaInfo = (VkAuthMetaInfo) this.e;
                String str2 = (String) obj;
                l55 l55Var = l55.a;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                return l55.i(l55Var, vdx0Var.e().h(str, str2), context, vkAuthMetaInfo, null, 28).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            case 1:
                u5e u5eVar = (u5e) this.c;
                ikv0.a aVar = (ikv0.a) this.d;
                t5e.b bVar = (t5e.b) this.e;
                ikv0 ikv0Var = (ikv0) obj;
                u5eVar.getClass();
                Activity b = c63.b();
                FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                    u5eVar.a.a(new ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo(dhr0.a.c(aVar.a), bVar.a, bVar.b), supportFragmentManager);
                }
                ikv0Var.a();
                return s3q0.a;
            case 2:
                List list = (List) this.c;
                ClipsPlaylist clipsPlaylist = (ClipsPlaylist) this.d;
                com.vk.clips.playlists.di.a aVar2 = (com.vk.clips.playlists.di.a) this.e;
                ClipsPlaylist clipsPlaylist2 = (ClipsPlaylist) obj;
                int i = clipsPlaylist.b;
                String str3 = clipsPlaylist.c;
                List<String> list2 = clipsPlaylist.d;
                UserId userId = clipsPlaylist.f;
                ClipsDraftablePlaylist d = aVar2.d.d(new SdkClipsDraftablePlaylist(i, str3, list2, userId));
                List<Parcelable> list3 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (Parcelable parcelable : list3) {
                    if (parcelable instanceof ClipVideoFile) {
                        ClipVideoFile clipVideoFile = (ClipVideoFile) parcelable;
                        parcelable = ClipVideoFile.Kb(clipVideoFile, false, null, j5g.v0(d, clipVideoFile.M1), null, null, null, null, 8372223);
                    }
                    arrayList.add(parcelable);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    VideoFile videoFile = (VideoFile) it.next();
                    if (videoFile instanceof ClipVideoFile) {
                        wjs0.a(new fyr0(videoFile));
                    }
                }
                iqe.a.onNext(new kqe.a(userId));
                aVar2.a.a(new cse.a.C2680a(clipsPlaylist2, arrayList));
                return s3q0.a;
            case 3:
                i8f i8fVar = (i8f) this.c;
                Integer num = (Integer) this.d;
                z7f z7fVar = (z7f) this.e;
                int intValue = num.intValue();
                i8fVar.getClass();
                ArrayList d2 = z7fVar.d(intValue);
                Iterator it2 = d2.iterator();
                ArrayList arrayList2 = new ArrayList();
                for (ClipsProcessedItem clipsProcessedItem : (List) obj) {
                    if (it2.hasNext()) {
                        arrayList2.add(i8f.u7(clipsProcessedItem, (n7f) it2.next(), null));
                    }
                }
                L.e("ClipsTemplateEditorRequestsHandlerImpl", "insertPositions = " + d2 + " res = " + arrayList2);
                return arrayList2;
            case 4:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b bVar2 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b) this.c;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b.d((wk50.a) this.d, false, (vzh) this.e);
                bVar2.b.b(new vyh.f(tq.h(tlo0.Companion, R.string.default_network_error)));
                return s3q0.a;
            case 5:
                MarketFavable marketFavable = (MarketFavable) this.c;
                ot00 ot00Var = (ot00) this.d;
                Good good = (Good) this.e;
                gmq gmqVar = (gmq) obj;
                if (gmqVar.equals(marketFavable)) {
                    d9a d9aVar = ot00Var.g;
                    d9aVar.b(new c9a(d9aVar, good.b, gmqVar.X()));
                }
                return s3q0.a;
            case 6:
                hv70.a aVar3 = (hv70.a) this.c;
                wh50 wh50Var = (wh50) this.d;
                izs izsVar = (izs) this.e;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, "headerItem", null, new jai(-705190600, new jrc(2, aVar3, wh50Var), true), 2);
                List<hv70.c> list4 = aVar3.d;
                nvyVar.e(list4.size(), new cv70.a(new zsw(11), list4), new cv70.b(list4), new jai(802480018, new cv70.c(list4, izsVar), true));
                return s3q0.a;
            default:
                com.vk.voip.ui.sessionrooms.dialog.model.a aVar4 = (com.vk.voip.ui.sessionrooms.dialog.model.a) this.c;
                f.a.b bVar3 = (f.a.b) this.d;
                Pair pair = (Pair) obj;
                return aVar4.d(bVar3.c, (a.c) this.e, Collections.singletonList(bVar3), new Pair<>(on00.f(new Pair(bVar3.a, pair.i())), pair.j()), null);
        }
    }
}
