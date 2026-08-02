package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.dto.common.Peer;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.photo.editor.features.filter.d;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.voip.ui.calls.presentation.base.view.components.VoipBanner;
import xsna.atn0;
import xsna.g650;
import xsna.p1n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class oyt implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oyt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView.o layoutManager;
        wty0 wty0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                pyt pytVar = (pyt) obj;
                x64 x64Var = pytVar.O;
                if (x64Var != null) {
                    x64Var.c(pytVar.C);
                    break;
                }
                break;
            case 1:
                ((com.vk.catalog2.common.ui.holders.group.a) obj).b();
                break;
            case 2:
                int i2 = LocalMediaPickerFragmentOld.c0;
                efc0 fo = ((LocalMediaPickerFragmentOld) obj).fo();
                if (fo != null) {
                    fo.C(new PostingAction.Permissions.Grant(PermissionType.GalleryView));
                    break;
                }
                break;
            case 3:
                ((j650) obj).c.invoke(g650.b.a.b);
                break;
            case 4:
                ((awk0) obj).a.a(axk0.b);
                break;
            case 5:
                int i3 = StickersRouletteFragment.o0;
                ocl0 ocl0Var = (ocl0) ((StickersRouletteFragment) obj).S;
                if (ocl0Var != null) {
                    ocl0Var.e();
                    break;
                }
                break;
            case 6:
                rtm0 rtm0Var = (rtm0) obj;
                d.e eVar = rtm0Var.m;
                if (eVar != null) {
                    eVar.invoke(rtm0Var);
                    break;
                }
                break;
            case 7:
                View view2 = (View) obj;
                Uri parse = Uri.parse("");
                rex0 rex0Var = e370.j;
                (rex0Var != null ? rex0Var : null).b(view2.getContext(), parse);
                break;
            case 8:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                RecyclerView recyclerView = ((SuggestedPostsFragment) obj).b0;
                RecyclerView.o layoutManager2 = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(0, 0);
                    break;
                }
                break;
            case 9:
                TabsRecycler tabsRecycler = (TabsRecycler) obj;
                RecyclerView.o layoutManager3 = tabsRecycler.getLayoutManager();
                if (layoutManager3 != null) {
                    int position = layoutManager3.getPosition(view);
                    atn0 tabSnapHelper$ui_release = tabsRecycler.getTabSnapHelper$ui_release();
                    RecyclerView recyclerView2 = tabSnapHelper$ui_release.c;
                    if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                        atn0.a aVar = tabSnapHelper$ui_release.d;
                        aVar.setTargetPosition(position);
                        layoutManager.startSmoothScroll(aVar);
                        break;
                    }
                }
                break;
            case 10:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) obj;
                pk30 pk30Var = aVar2.J;
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = aVar2.p.k;
                Peer peer = cVar != null ? cVar.j : null;
                if (pk30Var != null && peer != null) {
                    pk30Var.L(peer);
                    break;
                }
                break;
            case 11:
                ((gbt0) obj).invoke();
                break;
            case 12:
                int i4 = VoipBanner.d;
                ((gzs) obj).invoke();
                break;
            default:
                cwy0 cwy0Var = (cwy0) obj;
                nxy0 nxy0Var = cwy0Var.m;
                if (nxy0Var != null && (wty0Var = nxy0Var.L) != null) {
                    fvy0 fvy0Var = cwy0Var.p;
                    if (fvy0Var == null || !fvy0Var.c()) {
                        Context context = cwy0Var.f.getContext();
                        if (fvy0Var != null) {
                            fvy0Var.b(context);
                            break;
                        } else {
                            de.L(wty0Var.b, null, null, null, context);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ oyt(p1n0.a aVar, View view) {
        this.b = 7;
        this.c = view;
    }
}
