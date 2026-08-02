package xsna;

import com.vk.core.fragments.FragmentEntry;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Peer;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImInvitationCardRejectAction;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.ify;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class brb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ify.a d;
    public final /* synthetic */ Serializer.StreamParcelableAdapter e;

    public /* synthetic */ brb(ify.a aVar, Serializer.StreamParcelableAdapter streamParcelableAdapter, boolean z, int i) {
        this.b = i;
        this.d = aVar;
        this.e = streamParcelableAdapter;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa A[LOOP:2: B:43:0x00a4->B:45:0x00aa, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Iterator<WeakReference<fcn>> it;
        Iterator<bkm> it2;
        int i = this.b;
        boolean z = this.c;
        Serializer.StreamParcelableAdapter streamParcelableAdapter = this.e;
        ify.a aVar = this.d;
        switch (i) {
            case 0:
                ChatFragment chatFragment = (ChatFragment) aVar;
                Peer peer = (Peer) streamParcelableAdapter;
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.L1(peer, z);
                Peer a = chatFragment.ko().a();
                MobileOfficialAppsImStat$TypeImInvitationCardRejectAction.EventType eventType = MobileOfficialAppsImStat$TypeImInvitationCardRejectAction.EventType.REJECT_REQUEST_DIALOG_CONFIRM;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImInvitationCardRejectAction(a.b, peer.b, eventType), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                break;
            default:
                nx50 nx50Var = (nx50) aVar;
                FragmentEntry fragmentEntry = (FragmentEntry) streamParcelableAdapter;
                if (nx50.Q0.keySet().contains(fragmentEntry.b)) {
                    if (!z) {
                        Set<String> keySet = fragmentEntry.c.keySet();
                        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                            for (String str : keySet) {
                                if (brm0.B(str, "_fragment_impl_key", false) || str.equals("performance_track_id")) {
                                }
                            }
                        }
                    }
                    nx50Var.y0().k(fragmentEntry, z);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    CopyOnWriteArrayList<WeakReference<fcn>> copyOnWriteArrayList = nx50Var.d;
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        WeakReference<fcn> next = it.next();
                        fcn fcnVar = next.get();
                        if (fcnVar != null && fcnVar.v6()) {
                            fcn fcnVar2 = next.get();
                            if (fcnVar2 != null) {
                                fcnVar2.b(true);
                            }
                            linkedHashSet.add(next);
                        }
                    }
                    copyOnWriteArrayList.removeAll(linkedHashSet);
                    it2 = nx50Var.e.iterator();
                    while (it2.hasNext()) {
                        it2.next().bb(copyOnWriteArrayList.size());
                    }
                    nx50Var.z0.b(((mxa0) nx50Var.J0.getValue()).a().subscribe());
                    break;
                }
                nx50Var.y0().q(fragmentEntry);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                CopyOnWriteArrayList<WeakReference<fcn>> copyOnWriteArrayList2 = nx50Var.d;
                it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                }
                copyOnWriteArrayList2.removeAll(linkedHashSet2);
                it2 = nx50Var.e.iterator();
                while (it2.hasNext()) {
                }
                nx50Var.z0.b(((mxa0) nx50Var.J0.getValue()).a().subscribe());
                break;
        }
        return s3q0.a;
    }
}
