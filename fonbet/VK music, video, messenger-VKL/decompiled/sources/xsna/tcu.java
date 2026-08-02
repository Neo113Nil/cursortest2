package xsna;

import android.content.Context;
import android.hardware.SensorEvent;
import android.location.Location;
import android.net.Uri;
import android.view.View;
import android.widget.CheckBox;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.core.view.components.group.footer.VkGroupFooter;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.log.L;
import com.vk.mvi.core.internal.executors.ThreadType;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.sdk.SDKInviteDialog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.sew0;
import xsna.tj50;
import xsna.u6x;
import xsna.v7h0;
import xsna.w9i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class tcu implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ tcu(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        String l;
        boolean _init_$lambda$0;
        AttachWithDownload attachWithDownload;
        File i1;
        int i = 29;
        int i2 = 28;
        int i3 = 10;
        int i4 = 1;
        switch (this.b) {
            case 0:
                tj50.a aVar = (tj50.a) obj;
                h0u0 e = aVar.e(ucu.b);
                h0u0 e2 = aVar.e(new cj1(i));
                byo byoVar = new byo(4);
                ThreadType.a aVar2 = ThreadType.Companion;
                ThreadType[] threadTypeArr = {ThreadType.STATE};
                aVar2.getClass();
                ThreadType.a.a(threadTypeArr);
                return new ycu(e, e2, aVar.e(new pe1(i2)), aVar.f(q5h0.b, tj50.a.b, new izs[]{byoVar}, new pey(i3)), aVar.e(new u4u(i4)), aVar.e(vcu.b), aVar.e(wcu.b));
            case 1:
                Map map = (Map) obj;
                L.e("loaded " + map.size() + " call members");
                for (whr0 whr0Var : map.values()) {
                    jzi0 jzi0Var = GroupCallViewModel.i;
                    ((HashMap) jzi0Var.b).put(whr0Var.a, whr0Var);
                    Iterable iterable = (Set) ((HashMap) jzi0Var.a).get(whr0Var.a);
                    if (iterable == null) {
                        iterable = EmptySet.b;
                    }
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        kiu kiuVar = GroupCallViewModel.h.get((CallMemberId) it.next());
                        if (kiuVar != null) {
                            kiuVar.d(whr0Var);
                        }
                    }
                }
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                List O0 = j5g.O0(map.values());
                if (!cVar.s0()) {
                    y4x0 y4x0Var = com.vk.voip.ui.c.u;
                    CallMemberId c0 = cVar.c0();
                    y4x0Var.getClass();
                    Iterator it2 = O0.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (epx.f(c0 != null ? c0.b : null, ((whr0) obj2).a)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    whr0 whr0Var2 = (whr0) obj2;
                    if (whr0Var2 != null) {
                        sew0 sew0Var = whr0Var2.b;
                        String str = "";
                        String a = sew0Var instanceof sew0.b ? ((sew0.b) sew0Var).a() : "";
                        dhw0 dhw0Var = com.vk.voip.ui.c.O;
                        if (!epx.f(dhw0Var != null ? dhw0Var.e : null, a)) {
                            dhw0 dhw0Var2 = com.vk.voip.ui.c.O;
                            if (dhw0Var2 != null) {
                                y4x0Var.a.invoke(dhw0.a(dhw0Var2, null, 0L, null, null, a, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, null, kr5.a(dhw0Var2.N, null, new b7r0(a, i4), 7), -17, 255));
                            }
                            io.reactivex.rxjava3.subjects.f<Object> fVar = y4x0Var.e;
                            kr5 a2 = y4x0Var.a();
                            dhw0 dhw0Var3 = com.vk.voip.ui.c.O;
                            if (dhw0Var3 != null && (l = dhw0Var3.l()) != null) {
                                str = l;
                            }
                            fVar.onNext(new et80(a2, str, y4x0Var.b()));
                        }
                    }
                }
                return s3q0.a;
            case 2:
                return new VkGroupFooter((Context) obj, null, 6);
            case 3:
                return s3q0.a;
            case 4:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.j);
            case 5:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, 0, 67100671);
            case 6:
                return u6x.b.a((u6x.b) obj, u6x.c.RUNNING, null, null, false, null, 510);
            case 7:
                _init_$lambda$0 = LocalGalleryProvider._init_$lambda$0((q4t) obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 8:
                Location location = (Location) obj;
                Location location2 = oxz.a.get();
                location.setBearing(location2 != null ? location2.bearingTo(location) : location.getBearing());
                return location;
            case 9:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((Map.Entry) obj).getValue() != null);
            case 11:
                Attach attach = (Attach) obj;
                if ((attach instanceof AttachWithDownload) && ((i1 = (attachWithDownload = (AttachWithDownload) attach).i1()) == null || !i1.exists() || i1.length() == 0 || attachWithDownload.X6())) {
                    r6 = true;
                }
                return Boolean.valueOf(r6);
            case 12:
                return g5g.E(((PeersSearchBlock.d) obj).b, a.b.C1154b.class);
            case 13:
                return (Post) j5g.Y((List) obj);
            case 14:
                qgi0.r((tgi0) obj, "NotificationsAppBarBack");
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                gg70 gg70Var = ((oh70) obj).d;
                return Integer.valueOf(gg70Var != null ? gg70Var.f : -1);
            case 17:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 18:
                qgi0.r((tgi0) obj, "playlistTopBarBackIcon");
                return s3q0.a;
            case 19:
                return Boolean.valueOf(((ib50) obj).a.Vb());
            case 20:
                return Boolean.valueOf(((View) obj) instanceof CheckBox);
            case 21:
                qgi0.r((tgi0) obj, "filter_dialog_title");
                return s3q0.a;
            case 22:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return ((j5f0) obj).b.b;
            case 23:
                return String.valueOf(((UserId) obj).b);
            case 24:
                SensorEvent sensorEvent = (SensorEvent) obj;
                float[] fArr = sensorEvent.values;
                if (fArr == null || fArr.length < 3) {
                    return null;
                }
                return new kyo0(sensorEvent.timestamp, new vkr0(fArr[0], fArr[1], fArr[2]));
            case 25:
                int i5 = SDKInviteDialog.X;
                return mcr0.h(Uri.parse((String) obj));
            case 26:
                return new v7h0.b(((tj50.a) obj).a(n7h0.b, ao8.d));
            case 27:
                tj50.a aVar3 = (tj50.a) obj;
                u4u u4uVar = new u4u(i2);
                ao8 ao8Var = ao8.d;
                return new w9i0.c(aVar3.a(u4uVar, ao8Var), aVar3.a(new xmz(i), ao8Var), aVar3.a(new h2w(24), ao8Var));
            case 28:
                List<IPersistingStoryUpload> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (IPersistingStoryUpload iPersistingStoryUpload : list) {
                    iPersistingStoryUpload.V7().i = true;
                    arrayList.add(iPersistingStoryUpload);
                }
                return arrayList;
            default:
                qgi0.r((tgi0) obj, "delete_button");
                return s3q0.a;
        }
    }
}
