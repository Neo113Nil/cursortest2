package xsna;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.VhMsgServiceChatOwnerUpdateItem;
import com.vk.instantjobs.services.JobsForegroundService;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.hfr;
import xsna.nsr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yyx implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yyx(Context context, int i, Notification notification, String str) {
        this.d = context;
        this.c = i;
        this.e = notification;
        this.f = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                Notification notification = (Notification) obj2;
                String str = (String) obj;
                boolean z = JobsForegroundService.f;
                JobsForegroundService.i.put(Integer.valueOf(i2), new JobsForegroundService.a(notification, str));
                int i3 = JobsForegroundService.j;
                if (i3 == 0 || i3 == i2) {
                    JobsForegroundService.b.b(context, i2, notification, str);
                    JobsForegroundService.j = i2;
                } else {
                    ((NotificationManager) context.getSystemService("notification")).notify(i2, notification);
                }
                return s3q0.a;
            default:
                List list = (List) obj3;
                ok30 ok30Var = (ok30) obj2;
                vrr0 vrr0Var = ok30Var.c;
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                if (list.isEmpty()) {
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = ok30Var.f.get(i2);
                    ub80 ub80Var = vrr0Var.i;
                    pk30 pk30Var = vrr0Var.h;
                    if (e0Var instanceof psr0) {
                        ((psr0) e0Var).a6((qsr0) gVar);
                    } else if (e0Var instanceof wqr0) {
                        ((wqr0) e0Var).a6((xqr0) gVar);
                    } else if (e0Var instanceof our0) {
                        lvr0 lvr0Var = (lvr0) gVar;
                        hh6 hh6Var = ((our0) e0Var).m;
                        hh6Var.setSkeletonConfig(lvr0Var.b);
                        hh6Var.setDialogUnreadMsgMediator(lvr0Var.g);
                        hh6Var.b();
                    } else if (e0Var instanceof qvr0) {
                        ((qvr0) e0Var).a6((rvr0) gVar);
                    } else if (e0Var instanceof vsr0) {
                        ((vsr0) e0Var).V5((wsr0) gVar, pk30Var);
                    } else if (e0Var instanceof tsr0) {
                        ((tsr0) e0Var).V5((usr0) gVar, pk30Var);
                    } else if (e0Var instanceof xsr0) {
                        ((xsr0) e0Var).V5((ysr0) gVar, pk30Var);
                    } else if (e0Var instanceof str0) {
                        ((str0) e0Var).V5((ttr0) gVar, pk30Var);
                    } else if (e0Var instanceof fsr0) {
                    } else if (e0Var instanceof btr0) {
                        ((btr0) e0Var).V5((gtr0) gVar, pk30Var);
                    } else if (e0Var instanceof ctr0) {
                        ((ctr0) e0Var).V5((dtr0) gVar, pk30Var);
                    } else if (e0Var instanceof etr0) {
                        ((etr0) e0Var).V5((ftr0) gVar, pk30Var);
                    } else if (e0Var instanceof ntr0) {
                        ((ntr0) e0Var).V5((otr0) gVar, pk30Var);
                    } else if (e0Var instanceof htr0) {
                        ((htr0) e0Var).V5((ktr0) gVar, pk30Var);
                    } else if (e0Var instanceof itr0) {
                        ((itr0) e0Var).V5((jtr0) gVar, pk30Var);
                    } else if (e0Var instanceof zsr0) {
                        ((zsr0) e0Var).a6((atr0) gVar);
                    } else if (e0Var instanceof ltr0) {
                        ((ltr0) e0Var).V5((mtr0) gVar, pk30Var);
                    } else if (e0Var instanceof eur0) {
                        ((eur0) e0Var).V5((fur0) gVar, pk30Var);
                    } else if (e0Var instanceof pur0) {
                        ((pur0) e0Var).V5((qur0) gVar, pk30Var);
                    } else if (e0Var instanceof aur0) {
                        ((aur0) e0Var).V5((bur0) gVar, pk30Var);
                    } else if (e0Var instanceof gur0) {
                        ((gur0) e0Var).V5((hur0) gVar, pk30Var);
                    } else if (e0Var instanceof ytr0) {
                        ((ytr0) e0Var).V5((ztr0) gVar, pk30Var);
                    } else if (e0Var instanceof brr0) {
                        ((brr0) e0Var).V5((crr0) gVar, pk30Var);
                    } else if (e0Var instanceof cur0) {
                        ((cur0) e0Var).V5((dur0) gVar, pk30Var);
                    } else if (e0Var instanceof qtr0) {
                        ((qtr0) e0Var).V5((rtr0) gVar, pk30Var);
                    } else if (e0Var instanceof mur0) {
                        ((mur0) e0Var).a6((nur0) gVar, ub80Var);
                    } else if (e0Var instanceof vur0) {
                        int i4 = osr0.l;
                        ((osr0) e0Var).V5((wur0) gVar, pk30Var);
                    } else if (e0Var instanceof vqr0) {
                        int i5 = osr0.l;
                        ((osr0) e0Var).V5((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.e) gVar, pk30Var);
                    } else if (e0Var instanceof ivr0) {
                        int i6 = osr0.l;
                        ((osr0) e0Var).V5((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h) gVar, pk30Var);
                    } else if (e0Var instanceof wtr0) {
                        int i7 = osr0.l;
                        ((osr0) e0Var).V5((lur0) gVar, pk30Var);
                    } else if (e0Var instanceof vtr0) {
                        int i8 = osr0.l;
                        ((osr0) e0Var).V5((kur0) gVar, pk30Var);
                    } else if (e0Var instanceof ptr0) {
                        int i9 = osr0.l;
                        ((osr0) e0Var).V5((VhMsgServiceChatOwnerUpdateItem) gVar, pk30Var);
                    } else if (e0Var instanceof rsr0) {
                        ((rsr0) e0Var).V5((ssr0) gVar, pk30Var);
                    } else if (e0Var instanceof com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) {
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) e0Var;
                        nsr0 nsr0Var = (nsr0) gVar;
                        vb80 vb80Var = vrr0Var.j;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = nsr0Var.b;
                        aVar.p = fVar;
                        ir30 ir30Var = nsr0Var.c;
                        aVar.J = pk30Var;
                        aVar.K = ub80Var;
                        aVar.L = vb80Var;
                        ev9 ev9Var = fVar.E;
                        if (ev9Var != null) {
                            ev9Var.b(aVar);
                            aVar.M = ev9Var;
                        }
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = fVar.k;
                        f5v f5vVar = fVar.O;
                        if (cVar != null && f5vVar != null) {
                            f5vVar.b(aVar);
                            aVar.N = f5vVar;
                        }
                        fmm fmmVar = fVar.P;
                        if (fmmVar != null) {
                            fmmVar.c(aVar);
                            aVar.O = fmmVar;
                        }
                        aVar.a6(fVar);
                        aVar.b6(ir30Var);
                        BubbleColors bubbleColors = dhr0.M() ? fVar.m : fVar.n;
                        if (!aVar.p.b0()) {
                            aVar.m.o(bubbleColors);
                        }
                    }
                } else {
                    vrr0Var.getClass();
                    if (e0Var instanceof com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) {
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) e0Var;
                        hr30<Attach, ir30> hr30Var = aVar2.m;
                        hfr.a aVar3 = new hfr.a(rli0.j(rli0.p(new i5g(list), new h3e0(13)), msr0.b));
                        while (aVar3.hasNext()) {
                            nsr0.a aVar4 = (nsr0.a) aVar3.next();
                            if (aVar4 instanceof nsr0.a.C3411a) {
                                nsr0.a.C3411a c3411a = (nsr0.a.C3411a) aVar4;
                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar2 = c3411a.a;
                                aVar2.p = fVar2;
                                aVar2.a6(fVar2);
                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar3 = c3411a.a;
                                fVar3.getClass();
                                BubbleColors bubbleColors2 = dhr0.M() ? fVar3.m : fVar3.n;
                                if (!aVar2.p.b0()) {
                                    hr30Var.o(bubbleColors2);
                                }
                            } else {
                                if (!(aVar4 instanceof nsr0.a.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.b6(((nsr0.a.b) aVar4).a);
                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar4 = aVar2.p;
                                fVar4.getClass();
                                BubbleColors bubbleColors3 = dhr0.M() ? fVar4.m : fVar4.n;
                                if (!aVar2.p.b0()) {
                                    hr30Var.o(bubbleColors3);
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ yyx(List list, ok30 ok30Var, RecyclerView.e0 e0Var, int i) {
        this.d = list;
        this.e = ok30Var;
        this.f = e0Var;
        this.c = i;
    }
}
