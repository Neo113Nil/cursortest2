package xsna;

import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.recomSettings.dto.RecomSettingsRecomThemeDto;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbarComposeVh;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.log.L;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import xsna.bsm;
import xsna.ded;
import xsna.f6x0;
import xsna.giw0;
import xsna.n4n0;
import xsna.pnn0;
import xsna.ptw0;
import xsna.tqr0;
import xsna.xaf;
import xsna.xju0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wgm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wgm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.vk.im.engine.internal.storage.delegates.dialogs.b] */
    /* JADX WARN: Type inference failed for: r0v56, types: [xsna.umu0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.voip.ui.sessionrooms.c cVar;
        int i = this.b;
        int i2 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tnm0 tnm0Var = (tnm0) obj;
                if (((LoadStrategy) obj2) != LoadStrategy.CACHE_FIRST || !tnm0Var.a.isEmpty()) {
                    break;
                } else {
                    break;
                }
            case 1:
                r4n0 r4n0Var = (r4n0) obj2;
                List<ol60> list = ((v4n0) r4n0Var.b.getCurrentState()).c.b.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof z1c0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList4.add(x9v0Var);
                    }
                }
                r4n0Var.c(new n4n0.a(new yo60.i.a(arrayList4)));
                break;
            case 2:
                g7n0 g7n0Var = (g7n0) obj2;
                Pair f = g7n0.f((RecyclerView.e0) obj);
                if (f == null) {
                    break;
                } else {
                    g7n0Var.g(((Number) f.g()).intValue(), (String) f.d(), false);
                    break;
                }
            case 3:
                p820 p820Var = (p820) obj;
                int i3 = x9n0.p1;
                w9n0 w9n0Var = (w9n0) ((x9n0) obj2).f1;
                if (w9n0Var != null) {
                    w9n0Var.Q5(p820Var);
                }
                break;
            case 4:
                ((zak0) ((pnn0) obj2).d).setValue((pnn0.a) obj);
                break;
            case 5:
                e5q0 e5q0Var = (e5q0) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                Boolean bool = e5q0Var.f;
                int i4 = e5q0Var.i;
                if (bool != null) {
                    boolean z = o25.a().i().Q.b;
                    boolean z2 = !bool.booleanValue();
                    if (z != z2) {
                        o25.a().l(z2);
                        e5q0Var.n = true;
                    }
                }
                ?? a = xgl0Var.b().a();
                int d = xgl0Var.system().d();
                ArrayList o = e43.o(new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.UNREAD, e5q0Var.d, d), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.UNREAD_UNMUTED, e5q0Var.e, d), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.BUSINESS_NOTIFY_UNREAD, e5q0Var.g, d), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.ARCHIVE_UNREAD, i4, d), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.ARCHIVE_MENTIONS, e5q0Var.k, d), new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.ARCHIVE_UNREAD_UNMUTED, e5q0Var.j, d));
                int i5 = e5q0Var.h;
                if (i5 != -1) {
                    o.add(new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.BUSINESS_NOTIFY_TOTAL, i5, d));
                }
                int i6 = e5q0Var.l;
                if (i6 != -1) {
                    o.add(new com.vk.im.engine.models.dialogs.d(DialogsCounters.Type.ARCHIVE_TOTAL, i6, d));
                } else if (i4 > 0) {
                    DialogsCounters.Type type = DialogsCounters.Type.ARCHIVE_TOTAL;
                    com.vk.im.engine.models.dialogs.d b = a.b(type);
                    if ((b != null ? b.b : 0) < i4) {
                        o.add(new com.vk.im.engine.models.dialogs.d(type, i4, -1));
                    }
                }
                ArrayList arrayList5 = e5q0Var.m;
                ArrayList arrayList6 = new ArrayList(c5g.u(o, 10));
                Iterator it4 = o.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((com.vk.im.engine.models.dialogs.d) it4.next()).a);
                }
                arrayList5.addAll(arrayList6);
                a.h(o);
                break;
            case 6:
                ymq0 ymq0Var = (ymq0) obj2;
                for (Pair pair : (List) obj) {
                    ded dedVar = (ded) pair.j();
                    if (dedVar instanceof ded.c) {
                        Integer num = ((ClipUploadJob) pair.i()).f;
                        if (num != null && num.intValue() == 0) {
                            ymq0Var.M(xaf.f.a);
                        }
                    } else if (dedVar instanceof ded.h) {
                        Integer num2 = ((ClipUploadJob) pair.i()).f;
                        if (num2 != null && num2.intValue() == 0) {
                            ymq0Var.M(xaf.f.a);
                        } else {
                            ymq0Var.M(xaf.e.a);
                        }
                    }
                }
                break;
            case 7:
                zwq0 zwq0Var = (zwq0) obj2;
                Throwable th = (Throwable) obj;
                com.vk.lists.b<u1c0> bVar = zwq0Var.c;
                pxq0 pxq0Var = zwq0Var.d0;
                if (bVar.d.isEmpty()) {
                    pxq0Var.V1();
                }
                pxq0Var.g3();
                L.e(th);
                break;
            case 8:
                Set set = (Set) obj2;
                RecomSettingsRecomThemeDto recomSettingsRecomThemeDto = (RecomSettingsRecomThemeDto) obj;
                if (set.contains(Integer.valueOf(recomSettingsRecomThemeDto.getId()))) {
                    break;
                } else {
                    break;
                }
            case 9:
                b2r0 b2r0Var = (b2r0) obj2;
                List singletonList = Collections.singletonList((UserStorageModel) obj);
                if (!singletonList.isEmpty()) {
                    b2r0Var.b.b().h(new qm90(13, b2r0Var, singletonList));
                }
                break;
            case 10:
                tqr0.a aVar = (tqr0.a) obj2;
                if (aVar != null) {
                    aVar.d();
                }
                break;
            case 11:
                ((bsm.j) obj2).g();
                break;
            case 12:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj2;
                List list2 = (List) obj;
                int i7 = VideoOfflineFragment.f1;
                m.d a2 = androidx.recyclerview.widget.m.a(new vys0(videoOfflineFragment.v0, list2), true);
                ArrayList arrayList7 = videoOfflineFragment.v0;
                arrayList7.clear();
                arrayList7.addAll(list2);
                VideoOfflineFragment.a aVar2 = videoOfflineFragment.V0;
                a2.b(aVar2 != null ? aVar2 : null);
                break;
            case 13:
                VideoPlaylistToolbarComposeVh videoPlaylistToolbarComposeVh = (VideoPlaylistToolbarComposeVh) obj2;
                jwr0 jwr0Var = (jwr0) obj;
                videoPlaylistToolbarComposeVh.i = jwr0Var.a;
                com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.b bVar2 = videoPlaylistToolbarComposeVh.j;
                if (bVar2 != null) {
                    ((zak0) bVar2.m).setValue(g5t0.a(bVar2.getViewState().getValue(), jwr0Var.a.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, false, null, 62));
                }
                break;
            case 14:
                dw20 dw20Var = ((xht0) obj2).b;
                if (dw20Var != null) {
                    String str = dw20.d1;
                    dw20Var.Sn(null);
                }
                break;
            case 15:
                kkt0 kkt0Var = (kkt0) obj2;
                L.i((Throwable) obj);
                kkt0Var.e.invoke();
                kkt0Var.i.cancel();
                break;
            case 16:
                xju0.a aVar3 = (xju0.a) obj2;
                CharSequence charSequence = (CharSequence) obj;
                ?? r0 = r55.g;
                (r0 != 0 ? r0 : null).getClass();
                aVar3.l.a(aVar3.getLayoutPosition(), charSequence.toString(), false);
                break;
            case 17:
                ((fwv0) obj2).d();
                break;
            case 18:
                com.vk.superapp.verification.account.d dVar = ((wyv0) obj2).e;
                if (dVar != null) {
                    dVar.e0();
                }
                break;
            case 19:
                lcw0 lcw0Var = (lcw0) obj2;
                FragmentManager parentFragmentManager = lcw0Var.a.getParentFragmentManager();
                if (parentFragmentManager != null) {
                    cVar = new com.vk.voip.ui.sessionrooms.b(parentFragmentManager);
                } else {
                    com.vk.voip.ui.c.b.getClass();
                    cVar = com.vk.voip.ui.c.B0;
                }
                cVar.e(null);
                lcw0Var.c.invoke();
                break;
            case 20:
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                ((zhw0) obj2).T(new giw0.b(th2));
                break;
            case 21:
                ((cuw0) obj2).c.invoke(ptw0.j.b);
                break;
            case 22:
                break;
            case 23:
                int i8 = y5x0.l1;
                ((f6x0) obj2).n.onNext(f6x0.b.LOADING);
                break;
            default:
                xkx0 xkx0Var = (xkx0) obj2;
                tkx0 tkx0Var = (tkx0) xkx0Var.a;
                if (tkx0Var != null) {
                    tkx0Var.wa(xkx0Var.y.getString(R.string.vk_auth_internal_server_error_text), null, null);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wgm0(ymq0 ymq0Var, Clips clips) {
        this.b = 6;
        this.c = ymq0Var;
    }
}
