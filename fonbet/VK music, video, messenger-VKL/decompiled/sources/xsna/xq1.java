package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentEntry;
import com.vk.dto.common.Peer;
import com.vk.dto.hints.HintId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.lists.ListDataSet;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import xsna.b3q0;
import xsna.mat;
import xsna.mue;
import xsna.nue;
import xsna.sx40;
import xsna.ugf;
import xsna.yc1;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xq1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xq1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new yc1.c(((wq1) this.d).b));
                return s3q0.a;
            case 1:
                ChatFragment chatFragment = (ChatFragment) this.c;
                List list = (List) this.d;
                DialogHeaderController dialogHeaderController = chatFragment.K0;
                mem memVar = (dialogHeaderController != null ? dialogHeaderController : null).h;
                a1w a1wVar = memVar.j;
                String str = memVar.m;
                Peer peer = memVar.r.c;
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Msg) it.next()).b));
                }
                io.reactivex.rxjava3.internal.operators.single.c C = a1wVar.C(str, new rh30(peer, arrayList));
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                io.reactivex.rxjava3.internal.operators.single.b0 m = new io.reactivex.rxjava3.internal.operators.single.r(C.q(asu0.i()).m(asu0Var.d()), new n7(new ij8(8, memVar, list), 21)).m(asu0Var.d());
                lem lemVar = new lem(new a60(24), 0);
                int i = kwg0.a;
                memVar.I0(m.subscribe(lemVar, new jwg0(str)));
                return s3q0.a;
            case 2:
                return o1d.w((o1d) this.c, this.d);
            case 3:
                ((izs) this.c).invoke(new nue.d(((mue.a) this.d).a));
                return s3q0.a;
            case 4:
                q7v0 q7v0Var = (q7v0) this.c;
                wcf wcfVar = (wcf) this.d;
                VkOnboardingCampaign e = q7v0Var.e(HintId.CLIPS_OPEN_CHANNEL_BUTTON_ONBOARDING.getId());
                if (e != null && q7v0Var.d(e)) {
                    z = q7v0Var.b(e, false);
                }
                wcfVar.e(new ugf.g.f(z));
                wcfVar.e(new ugf.g.C3803g(z));
                return s3q0.a;
            case 5:
                w3n w3nVar = (w3n) this.c;
                yo60.j jVar = (yo60.j) this.d;
                i3n i3nVar = (i3n) w3nVar.e.getValue();
                pn0 pn0Var = w3nVar.c;
                i3nVar.getClass();
                fq60 fq60Var = (fq60) ((Lazy) pn0Var.a).getValue();
                gq60 gq60Var = (gq60) pn0Var.b;
                fq60Var.getClass();
                fq60.c(jVar, gq60Var);
                return s3q0.a;
            case 6:
                com.vk.core.fragments.b bVar = (com.vk.core.fragments.b) this.c;
                FragmentEntry fragmentEntry = (FragmentEntry) this.d;
                boolean Nb = bVar.e.c.Nb(fragmentEntry.e);
                bVar.e.c.b.getFirst().Bb(fragmentEntry);
                vbs vbsVar = bVar.a;
                vbsVar.c();
                bVar.d(fragmentEntry, null);
                bVar.f(vbsVar);
                if (Nb) {
                    bVar.b.b(bVar.e.c.Ob().b);
                }
                bVar.e();
                return s3q0.a;
            case 7:
                ((izs) this.c).invoke(new mat.b((h8t) this.d));
                return s3q0.a;
            case 8:
                jnf jnfVar = (jnf) this.c;
                my70 my70Var = (my70) this.d;
                okhttp3.o oVar = (okhttp3.o) jnfVar.invoke();
                qcn qcnVar = oVar.b;
                ov ovVar = new ov(my70Var, 11);
                synchronized (qcnVar) {
                    qcnVar.c = ovVar;
                }
                return oVar;
            case 9:
                lv90 lv90Var = (lv90) this.c;
                return ((VkPeopleSearchParams) ((zak0) lv90Var.l1).getValue()).f.a((Context) this.d, ((Boolean) lv90Var.o1.getValue()).booleanValue());
            case 10:
                vtu vtuVar = (vtu) this.d;
                izs izsVar = (izs) this.c;
                vtuVar.a(0);
                izsVar.invoke(sx40.j.b);
                return s3q0.a;
            case 11:
                ((yab0) this.c).V((ibb0) this.d);
                return s3q0.a;
            case 12:
                return ((nol0) this.c).invoke(((ool0) this.d).getCurrentState());
            case 13:
                mtk0 mtk0Var = (mtk0) this.c;
                TimelineViewState.d dVar = (TimelineViewState.d) this.d;
                return dVar.f.get(((Number) mtk0Var.getValue()).intValue() / dVar.g);
            case 14:
                b3q0 b3q0Var = (b3q0) this.c;
                b3q0.a aVar = (b3q0.a) this.d;
                b3q0Var.d = b3q0.b.UNDO_HIDE_ENABLED;
                b3q0Var.b(aVar);
                b3q0Var.b.invoke(MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType.HIDE_CREATOR_FROM_SUBSCRIPTIONS);
                return s3q0.a;
            case 15:
                com.vk.profile.user.impl.ui.i iVar = (com.vk.profile.user.impl.ui.i) this.c;
                List list3 = (List) this.d;
                ListDataSet<UserProfileAdapterItem> listDataSet = iVar.o.a;
                if (!list3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(list3);
                    ListDataSet.ArrayListImpl<UserProfileAdapterItem> arrayListImpl = listDataSet.d;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayListImpl.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((UserProfileAdapterItem) next) instanceof UserProfileAdapterItem.t) {
                            arrayList3.add(next);
                        }
                    }
                    arrayList2.addAll(arrayList3);
                    listDataSet.setItems(arrayList2);
                }
                return s3q0.a;
            case 16:
                return Integer.valueOf(((ecr) ((nuz) this.c).d.a.get(((set0) ((zak0) ((tet0) this.d).m).getValue()).B())).a());
            case 17:
                return "VkAuthBridge Trying to logout non-existent session - " + ((t200) this.c).d + ", current sessions state - " + j5g.g0(((tbu0) this.d).a.d(), null, null, null, 0, null, 63);
            default:
                ((izs) this.c).invoke((buv0) this.d);
                return s3q0.a;
        }
    }

    public /* synthetic */ xq1(vtu vtuVar, izs izsVar) {
        this.b = 10;
        this.d = vtuVar;
        this.c = izsVar;
    }
}
