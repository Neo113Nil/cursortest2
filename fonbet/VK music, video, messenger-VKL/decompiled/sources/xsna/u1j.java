package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.r2j;

/* compiled from: ConfigureRoomsViewRenderer.kt */
/* loaded from: classes7.dex */
public final class u1j extends ConstraintLayout implements gm50 {
    public static final /* synthetic */ int G = 0;
    public final Object A;
    public final Object B;
    public androidx.appcompat.app.d C;
    public final Object D;
    public final Object E;
    public r2j.h F;
    public final n1j t;
    public final a2j u;
    public final wg1 v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public u1j(n1j n1jVar, a2j a2jVar, wg1 wg1Var) {
        super(n1jVar.requireContext());
        this.t = n1jVar;
        this.u = a2jVar;
        this.v = wg1Var;
        bu1 bu1Var = new bu1(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, bu1Var);
        this.x = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.h(this, 26));
        this.y = msy.a(lazyThreadSafetyMode, new tbh(this, 3));
        this.z = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.e(this, 26));
        this.A = msy.a(lazyThreadSafetyMode, new bb(this, 28));
        this.B = msy.a(lazyThreadSafetyMode, new cb(this, 29));
        this.D = msy.a(lazyThreadSafetyMode, new ey0(this, 25));
        this.E = msy.a(lazyThreadSafetyMode, new eb(this, 27));
        LayoutInflater.from(getContext()).inflate(R.layout.voip_session_rooms_admin_configure_rooms_dialog_configure, (ViewGroup) this, true);
        bwt0.i0(getBackButtonView(), new fre(this, 13));
    }

    public static d2j P4(u1j u1jVar) {
        nvg nvgVar = new nvg(u1jVar, 7);
        d2j d2jVar = new d2j();
        d2jVar.x0(g2j.class, new wcg(nvgVar, 5));
        d2jVar.x0(e2j.class, new lz0(nvgVar, 23));
        d2jVar.x0(i2j.class, new l5(nvgVar, 29));
        d2jVar.x0(h2j.class, new tr0(12));
        u1jVar.getRecyclerView().setAdapter(d2jVar);
        return d2jVar;
    }

    public static hfz Q4(u1j u1jVar, int i) {
        return (hfz) j5g.b0(i, u1jVar.getRoomsListAdapter().h.f);
    }

    public static final void T4(u1j u1jVar, r2j.h hVar) {
        String str;
        View openRoomsButton = u1jVar.getOpenRoomsButton();
        boolean z = hVar.b;
        int i = hVar.a;
        boolean z2 = hVar.c;
        boolean z3 = hVar.e;
        boolean z4 = false;
        openRoomsButton.setEnabled(z && !z2);
        View recreateRoomsButton = u1jVar.getRecreateRoomsButton();
        if (z && !z2) {
            z4 = true;
        }
        recreateRoomsButton.setEnabled(z4);
        r2j.h hVar2 = u1jVar.F;
        if (hVar2 == null || hVar2.a != i) {
            u1jVar.getToolBar().setTitle(i);
        }
        bwt0.p0(u1jVar.getAddRoomButton(), z);
        bwt0.p0(u1jVar.getRecreateRoomsButton(), z);
        bwt0.p0(u1jVar.getOpenRoomsButton(), hVar.d);
        bwt0.p0(u1jVar.getCloseRoomsButton(), z3);
        r2j.h hVar3 = u1jVar.F;
        if (hVar3 == null || hVar3.e != z3) {
            u1jVar.getRecyclerView().setMinimumHeight(z3 ? cn70.b(152) : cn70.b(96));
        }
        d2j roomsListAdapter = u1jVar.getRoomsListAdapter();
        roomsListAdapter.getClass();
        ArrayList arrayList = new ArrayList();
        r2j.i iVar = hVar.f;
        if (iVar instanceof r2j.i.a) {
            r2j.i.a aVar = (r2j.i.a) iVar;
            arrayList.add(new e2j(aVar.b, aVar.a));
        } else if (iVar instanceof r2j.i.b) {
            List<SessionRoomParticipantModel> list = ((r2j.i.b) iVar).a;
            arrayList.add(new h2j(list.size()));
            List<SessionRoomParticipantModel> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (SessionRoomParticipantModel sessionRoomParticipantModel : list2) {
                ParticipantId participantId = sessionRoomParticipantModel.a;
                wk90 wk90Var = sessionRoomParticipantModel.g;
                if (wk90Var == null || (str = wk90Var.b) == null) {
                    str = "";
                }
                arrayList2.add(new i2j(participantId, wk90Var != null ? wk90Var.c : null, str));
            }
            arrayList.addAll(arrayList2);
        }
        List<lvi0> list3 = hVar.g;
        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList3.add(new g2j((lvi0) it.next()));
        }
        arrayList.addAll(arrayList3);
        roomsListAdapter.setItems(arrayList);
        u1jVar.F = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getAddRoomButton() {
        return (View) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getBackButtonView() {
        return (View) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getCloseRoomsButton() {
        return (View) this.B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getOpenRoomsButton() {
        return (View) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getRecreateRoomsButton() {
        return (View) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final d2j getRoomsListAdapter() {
        return (d2j) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Toolbar getToolBar() {
        return (Toolbar) this.D.getValue();
    }

    @Override // xsna.gm50
    public f5z getViewOwner() {
        return this.t;
    }
}
