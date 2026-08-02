package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.channels.api.Channel;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.notifications.CommunityGroupedNotificationsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.profile.community.suggestions.impl.ui.suggestions.d;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.miniapps.impl.b;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.aue;
import xsna.b4;
import xsna.e4g0;
import xsna.ise;
import xsna.j0j;
import xsna.jqe;
import xsna.k36;
import xsna.qv4;
import xsna.ta7;
import xsna.wmb;
import xsna.xn50;
import xsna.xo3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r0 < r2) goto L34;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Collection collection;
        int i;
        int i2 = this.b;
        boolean z = true;
        char c = 1;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ((com.vk.libvideo.bottomsheet.about.delegate.g) obj2).a.d(new b4.h0(((Long) obj).longValue()));
                break;
            case 1:
                fq1 fq1Var = ((ja) obj2).a.n0;
                if (fq1Var != null) {
                    fq1Var.a();
                }
                break;
            case 2:
                ((Photo) obj2).w = (String) obj;
                break;
            case 3:
                ((af1) obj2).n.P7(new a.e((View) obj));
                break;
            case 4:
                int i3 = AppsCatalogFragment.W;
                pro0.f(new ie3(r4, (AppsCatalogFragment) obj2, (b.a) obj));
                break;
            case 5:
                wo3 wo3Var = (wo3) obj2;
                wia0 wia0Var = (wia0) obj;
                wo3Var.T(new xo3.a.c(wia0Var));
                wo3Var.i.d(wia0Var.b);
                break;
            case 6:
                pv4 pv4Var = (pv4) obj2;
                qv4.b bVar = (qv4.b) obj;
                long j = bVar.e;
                float f = bVar.f;
                TextView textView = pv4Var.m;
                if (textView == null) {
                    textView = null;
                }
                long j2 = (long) (f * j);
                long j3 = 60;
                textView.setText(String.format(Locale.ENGLISH, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2)));
                TextView textView2 = pv4Var.m;
                (textView2 != null ? textView2 : null).setContentDescription(new coo(pv4Var.a).c((int) j2));
                break;
            case 7:
                ((wh50) obj2).setValue((k36.b) obj);
                break;
            case 8:
                break;
            case 9:
                qa7 qa7Var = (qa7) obj;
                ((ma7) obj2).T(new ta7.a.b(new la7(qa7Var.a, qa7Var.b)));
                break;
            case 10:
                kbj0.e(nr4.b(), ((View) obj).getContext(), (DocumentAttachment) obj2, false, null, false, null, 60);
                break;
            case 11:
                int i4 = BroadcastConfigFragment.U;
                ((BroadcastConfigFragment) obj2).tn();
                break;
            case 12:
                hi8 hi8Var = (hi8) obj2;
                hi8Var.f = true;
                hi8Var.g = (String) obj;
                hi8Var.b();
                break;
            case 13:
                lxa lxaVar = (lxa) obj2;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof r280) {
                    r280 r280Var = (r280) sxpVar;
                    long j4 = lxaVar.a;
                    if (lxaVar.b.r().h.n()) {
                        Channel channel = (Channel) r280Var.b.c.get(Long.valueOf(j4));
                        if (channel != null) {
                            io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new p68(c == true ? 1 : 0, channel, lxaVar)).r0(asu0.a.c());
                            int i5 = kwg0.a;
                            lxaVar.c.b(io.reactivex.rxjava3.kotlin.c.f(2, r0, null, new nu2("ChannelDataSourceImpl", 2), new tl0(lxaVar, 23)));
                        }
                    } else {
                        Channel channel2 = (Channel) r280Var.b.c.get(Long.valueOf(j4));
                        if (channel2 != null) {
                            lxaVar.d.onNext(channel2);
                        }
                    }
                } else if (sxpVar instanceof OnChannelsCacheInvalidateEvent) {
                    lxaVar.c();
                } else if (sxpVar instanceof p680) {
                    lxaVar.c();
                }
                break;
            case 14:
                ((m8b) obj2).r = (List) obj;
                break;
            case 15:
                ChannelsCounters channelsCounters = (ChannelsCounters) obj;
                int intValue = ((Integer) obj2).intValue();
                Integer a = channelsCounters.c().a();
                int intValue2 = a != null ? a.intValue() : 0;
                Integer a2 = channelsCounters.b().a();
                break;
            case 16:
                ynb ynbVar = (ynb) obj2;
                e4g0.a aVar = e4g0.b;
                if (aVar != null) {
                    xn50.a.c(ynbVar, new wmb.m(aVar.a, aVar.b));
                }
                break;
            case 17:
                Map<String, String> map = (Map) obj;
                com.vk.im.ui.components.msg_list.a aVar2 = ((ChatFragment) obj2).H0;
                (aVar2 != null ? aVar2 : null).j2(map);
                break;
            case 18:
                ((ftb) obj2).e.x0();
                break;
            case 19:
                Throwable th = (Throwable) obj;
                xyb.C.a(th);
                if (((xyb) obj2).A != null) {
                    zk70.e(th);
                }
                break;
            case 20:
                break;
            case 21:
                qgi0.r((tgi0) obj, "ClipsCoauthorsAuthorName" + ((ClipCoauthorListVS.Owner) obj2).b);
                break;
            case 22:
                lyd.a.b((Throwable) obj);
                ((defpackage.f) obj2).invoke();
                break;
            case 23:
                ((com.vk.clips.viewer.impl.grid.b) obj2).e2(false);
                break;
            case 24:
                bue bueVar = (bue) obj2;
                aue.b bVar2 = (aue.b) obj;
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType = bVar2.b;
                if (foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder) {
                    collection = EmptyList.b;
                } else {
                    if (!(foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder)) {
                        int i6 = bVar2.d;
                        Integer num = bVar2.g;
                        if (num == null) {
                            i = 0;
                            break;
                        } else {
                            i = num.intValue();
                            break;
                        }
                    }
                    z = false;
                    collection = Collections.singletonList(new ise.a(z));
                }
                Collection collection2 = collection;
                List<Pair<mqe, Boolean>> list = bVar2.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    mqe mqeVar = (mqe) pair.d();
                    boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                    Object obj3 = lqe.a;
                    arrayList.add(new ise.b(mqeVar.a, lqe.b(mqeVar.b), oq.d(tlo0.Companion, mqeVar.c), epx.f(bueVar.a, ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder.b) ? jqe.a.a : new jqe.b(booleanValue)));
                }
                break;
            case 25:
                break;
            case 26:
                n2k0 n2k0Var = (n2k0) obj;
                izs<? super n2k0, s3q0> izsVar = ((k3g) obj2).f;
                if (izsVar != null) {
                    izsVar.invoke(n2k0Var);
                }
                break;
            case 27:
                CommunityGroupedNotificationsFragment communityGroupedNotificationsFragment = (CommunityGroupedNotificationsFragment) obj2;
                int i7 = CommunityGroupedNotificationsFragment.i0;
                if (communityGroupedNotificationsFragment.isVisible()) {
                    com.vk.lists.c cVar = communityGroupedNotificationsFragment.X;
                    if (cVar != null) {
                        cVar.p(false);
                    }
                } else {
                    communityGroupedNotificationsFragment.h0 = false;
                }
                break;
            case 28:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.b) obj2).T(d.C1637d.b);
                break;
            default:
                ((i1j) obj2).e.invoke(j0j.b.b);
                break;
        }
        return s3q0.a;
    }
}
