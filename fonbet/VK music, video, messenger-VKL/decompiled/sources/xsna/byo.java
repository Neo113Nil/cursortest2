package xsna;

import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.sharing.api.dto.Target;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.i;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.kx30;
import xsna.v7h0;
import xsna.vn20;
import xsna.w9i0;
import xsna.ycu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class byo implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ byo(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                xxo xxoVar = ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h) obj).c;
                return new i.a.C1898a(xxoVar.d, xxoVar.e);
            case 1:
                return Boolean.valueOf(((a1s) obj) instanceof l580);
            case 2:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 3:
                return ((FStack) obj).zb();
            case 4:
                cdu cduVar = (cdu) obj;
                return new ycu.a(cduVar.d, cduVar.f, cduVar.e.b);
            case 5:
                return Boolean.valueOf(R.id.music_device_restriction_notification == ((wqw) obj).b.c);
            case 6:
                VideoLargeListState videoLargeListState = (VideoLargeListState) obj;
                return VideoLargeListState.a(videoLargeListState, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, videoLargeListState.A + 1, 33554431);
            case 7:
                oxz.a.set((Location) obj);
                return s3q0.a;
            case 8:
                return new r540(R.layout.products_multipicker_item_loading, (ViewGroup) obj);
            case 9:
                ((zak0) vn20.i).setValue((vn20.a) obj);
                return s3q0.a;
            case 10:
                AttachWithDownload attachWithDownload = (AttachWithDownload) obj;
                return Boolean.valueOf((attachWithDownload instanceof AttachVideo) && !((AttachVideo) attachWithDownload).j());
            case 11:
                return g5g.E(((PeersSearchBlock.d) obj).b, a.b.C1153a.class);
            case 12:
                return (List) obj;
            case 13:
                qgi0.r((tgi0) obj, "AudioTrackSelection");
                return s3q0.a;
            case 14:
                return ((oh70) obj).g;
            case 15:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
            case 16:
                par0.a.getClass();
                par0.e("[PhoneActualizationRouterImpl] phone changed successfuly]");
                return s3q0.a;
            case 17:
                qgi0.r((tgi0) obj, "PostingSettingsRemovePollDialogRemoveButton");
                return s3q0.a;
            case 18:
                return ((QuickMessageItem) obj).d;
            case 19:
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 20:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return ((j5f0) obj).b.c;
            case 21:
                qof0 qof0Var = (qof0) obj;
                qof0Var.getClass();
                som0 som0Var = qof0.M;
                if (som0Var == null) {
                    qof0.N.getClass();
                    som0Var = new som0();
                    qof0.M = som0Var;
                }
                hnf0 hnf0Var = (hnf0) qof0.s.getValue();
                fnf0 a = qof0Var.a();
                aof0 b = qof0Var.b();
                bof0 bof0Var = qof0Var.h;
                if (bof0Var == null) {
                    bof0Var = qof0Var.i.invoke();
                    qof0Var.h = bof0Var;
                }
                return new anf0(som0Var, hnf0Var, a, b, bof0Var, qof0Var.e());
            case 22:
                return v7h0.d.a;
            case 23:
                return w9i0.a.a;
            case 24:
                kx30.a aVar = (kx30.a) obj;
                List<zpp<Dialog>> list = aVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Dialog) ((zpp) obj2).a).Gb()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Dialog dialog = (Dialog) ((zpp) it.next()).a;
                    arrayList2.add(new Target(dialog, aVar.d, c4g0.t(dialog.hc())));
                }
                return p4g.q(arrayList2);
            case 25:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, true, false, null, 1791);
            case 26:
                return Float.valueOf(((View) obj).getX());
            case 27:
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((nov) obj) instanceof r4g0);
            default:
                return s3q0.a;
        }
    }
}
