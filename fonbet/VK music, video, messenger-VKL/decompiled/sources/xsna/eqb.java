package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.spb;

/* compiled from: ChatControlsComponent.kt */
/* loaded from: classes2.dex */
public final class eqb extends j8i {
    public final a i;
    public final Peer j;
    public final iqb k;
    public ChatControls l;

    /* compiled from: ChatControlsComponent.kt */
    public interface a {
        void a();
    }

    public eqb(ChatControls chatControls, ImCreateChatControlParamsFragment.b bVar, Peer peer, int i) {
        bVar = (i & 2) != 0 ? null : bVar;
        iqb iqbVar = new iqb();
        this.i = bVar;
        this.j = peer;
        this.k = iqbVar;
        this.l = Z0(chatControls);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        qus qusVar = new qus(this);
        iqb iqbVar = this.k;
        iqbVar.f = qusVar;
        RecyclerView recyclerView = new RecyclerView(layoutInflater.getContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setAdapter(iqbVar.a);
        recyclerView.setItemAnimator(null);
        float f = 16;
        float f2 = 12;
        recyclerView.addItemDecoration(new prn(new int[]{8}, new Rect(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2))));
        recyclerView.setLayoutManager(new LinearLayoutManager());
        iqbVar.g = recyclerView;
        iqbVar.e = new bzb0(recyclerView.getContext());
        RecyclerView recyclerView2 = iqbVar.g;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        return null;
    }

    @Override // xsna.j8i
    public final void N0() {
        iqb iqbVar = this.k;
        bzb0 bzb0Var = iqbVar.e;
        if (bzb0Var != null) {
            bzb0Var.a();
        }
        iqbVar.e = null;
    }

    @Override // xsna.j8i
    public final void Q0() {
        ChatControls chatControls = this.l;
        Peer peer = this.j;
        peer.getClass();
        Y0(qh90.a(chatControls, peer.Ab(Peer.Type.GROUP)));
    }

    public final void X0(ChatControls chatControls) {
        ChatControls Z0 = Z0(chatControls);
        this.l = Z0;
        Peer peer = this.j;
        peer.getClass();
        Y0(qh90.a(Z0, peer.Ab(Peer.Type.GROUP)));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    public final void Y0(ArrayList arrayList) {
        Integer num;
        if (arrayList.isEmpty()) {
            return;
        }
        iqb iqbVar = this.k;
        iqbVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        iqbVar.d = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ph90 ph90Var = (ph90) it.next();
            spb spbVar = (spb) iqbVar.b.get(Integer.valueOf(ph90Var.a));
            if (spbVar != null && (num = (Integer) iqbVar.c.get(ph90Var.b)) != null) {
                int intValue = num.intValue();
                if (spbVar instanceof spb.a) {
                    ((spb.a) spbVar).e = intValue;
                } else {
                    if (!(spbVar instanceof spb.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    spb.b bVar = (spb.b) spbVar;
                    bVar.f = intValue;
                    bVar.c = epx.f(ph90Var.b, "enabled");
                }
                arrayList2.add(spbVar);
            }
        }
        iqbVar.a.setItems(arrayList2);
    }

    public final ChatControls Z0(ChatControls chatControls) {
        Peer peer = this.j;
        peer.getClass();
        return ChatControls.zb(chatControls, null, null, null, null, null, null, null, null, null, null, null, null, peer.Ab(Peer.Type.GROUP) ? 4062 : 4095);
    }
}
