package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.ui.consent.ConsentScreenInfo;
import com.vk.auth.ui.consent.VkConsentView;
import com.vk.auth.ui.consent.g;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.cancellation.TargetSharingTask;
import com.vk.sharing.core.view.TargetSendActionView;
import com.vk.sharing.core.view.j;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vk.voip.ui.VoipViewBehaviour;
import com.vk.voip.ui.group_selector.ui.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.views.PlayerControlsView;
import xsna.zf00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i1f implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gzs<s3q0> gzsVar;
        g.b bVar;
        gzs<io.reactivex.rxjava3.core.q<List<VkAuthAppScope>>> gzsVar2;
        gzs<s3q0> gzsVar3;
        int i = this.b;
        Object obj = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = ClipsReportFragment.V;
                ((ClipsReportFragment) obj2).finish();
                return;
            case 1:
                ((pw10) obj2).dismiss();
                return;
            case 2:
                fv20 fv20Var = (fv20) obj2;
                int i3 = fv20.C1;
                ModalAuthInfo fo = fv20Var.fo();
                ConsentScreenInfo consentScreenInfo = fo.p;
                if (consentScreenInfo == null) {
                    throw new IllegalStateException("Modal Auth: ConsentScreenInfo must not be null");
                }
                String str = fo.l;
                com.vk.auth.ui.consent.b bVar2 = new com.vk.auth.ui.consent.b();
                Bundle bundle = new Bundle(2);
                bundle.putParcelable("consent_info", consentScreenInfo);
                bundle.putString("avatarUrl", str);
                bVar2.setArguments(bundle);
                bVar2.Td(fv20Var.kn().getSupportFragmentManager(), "consentFragment");
                return;
            case 3:
                AboutVideoItem.q.b bVar3 = (AboutVideoItem.q.b) obj2;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    bVar3.c.e(bwt0.u(b));
                    return;
                }
                return;
            case 4:
                ((as90) obj2).s.invoke();
                return;
            case 5:
                PhotoEditorView photoEditorView = (PhotoEditorView) obj2;
                j7a0 j7a0Var = photoEditorView.E;
                if (j7a0Var == null) {
                    j7a0Var = null;
                }
                com.vk.photo.editor.ivm.d dVar = j7a0Var.c;
                (dVar != null ? dVar : null).a(EditorMessage.c.a);
                photoEditorView.c.r.b(zf00.a.a);
                return;
            case 6:
                PlayerControlsView.b bVar4 = PlayerControlsView.O;
                gzs<s3q0> skipBackListener = ((PlayerControlsView) obj2).getSkipBackListener();
                if (skipBackListener != null) {
                    skipBackListener.invoke();
                    return;
                }
                return;
            case 7:
                tfb0 tfb0Var = (tfb0) obj2;
                tfb0Var.j.setAdapter(tfb0Var.o);
                tfb0Var.w.tn();
                return;
            case 8:
                gzs gzsVar4 = (gzs) obj2;
                if (gzsVar4 != null) {
                    gzsVar4.invoke();
                    return;
                }
                return;
            case 9:
                com.vk.sharing.core.view.j jVar = (com.vk.sharing.core.view.j) obj2;
                pq9 pq9Var = jVar.b;
                TargetSendActionView targetSendActionView = jVar.m;
                if (pq9Var == null) {
                    Target target = jVar.e;
                    if (target == null) {
                        return;
                    }
                    if (targetSendActionView.getCurrentState() != TargetSendActionView.State.SEND) {
                        izs<? super Target, s3q0> izsVar = jVar.d;
                        if (izsVar != null) {
                            izsVar.invoke(target);
                            return;
                        }
                        return;
                    }
                    izs<? super Target, s3q0> izsVar2 = jVar.c;
                    if (izsVar2 != null) {
                        izsVar2.invoke(target);
                    }
                    jVar.a();
                    targetSendActionView.b(new a4o0(target), TargetSendActionView.State.OPEN, null);
                    return;
                }
                Target target2 = jVar.e;
                if (target2 == null) {
                    return;
                }
                a4o0 a4o0Var = new a4o0(target2);
                io.reactivex.rxjava3.disposables.c cVar = jVar.o;
                if (cVar != null) {
                    cVar.dispose();
                }
                jVar.o = null;
                int i4 = com.vk.sharing.core.view.j.p;
                int i5 = j.c.$EnumSwitchMapping$0[j.a.a(target2, pq9Var).ordinal()];
                if (i5 == 1) {
                    cvk.r(new rk40(pq9Var, target2, jVar, a4o0Var, 1));
                    return;
                }
                if (i5 == 2) {
                    izs<? super Target, s3q0> izsVar3 = jVar.d;
                    if (izsVar3 != null) {
                        izsVar3.invoke(target2);
                        return;
                    }
                    return;
                }
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                TargetSharingTask targetSharingTask = (TargetSharingTask) pq9Var.c.remove(new icj0(target2.k, target2.c, target2.l));
                if (targetSharingTask != null) {
                    i0q0.g(targetSharingTask);
                }
                targetSendActionView.b(a4o0Var, TargetSendActionView.State.SEND, pq9Var);
                return;
            case 10:
                Toast.makeText(((b5p0) obj2).itemView.getContext(), "Click!", 0).show();
                return;
            case 11:
                VkCell.Right.e.b bVar5 = (VkCell.Right.e.b) obj2;
                int i6 = VkCellRight.z;
                if (!bVar5.e || (gzsVar = bVar5.f) == null) {
                    return;
                }
                gzsVar.invoke();
                return;
            case 12:
                com.vk.auth.ui.consent.i iVar = ((VkConsentView) obj2).j;
                Iterator it = ((Iterable) iVar.e).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((com.vk.auth.ui.consent.c) next).b) {
                            obj = next;
                        }
                    }
                }
                com.vk.auth.ui.consent.c cVar2 = (com.vk.auth.ui.consent.c) obj;
                if (cVar2 == null || (bVar = cVar2.a) == null) {
                    bVar = (g.b) j5g.a0(iVar.b.c);
                }
                if (bVar == null || (gzsVar2 = bVar.b) == null) {
                    return;
                }
                iVar.b(gzsVar2.invoke());
                return;
            case 13:
                ((sow0) obj2).c.a(a.i.C2044a.a);
                return;
            default:
                VoipViewBehaviour voipViewBehaviour = (VoipViewBehaviour) obj2;
                VoipViewBehaviour.a aVar = voipViewBehaviour.f;
                ArrayList arrayList = voipViewBehaviour.p;
                boolean z = aVar.a;
                if (z && arrayList.isEmpty()) {
                    voipViewBehaviour.h();
                }
                if (z || !arrayList.isEmpty() || (gzsVar3 = voipViewBehaviour.o) == null) {
                    return;
                }
                gzsVar3.invoke();
                return;
        }
    }
}
