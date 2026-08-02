package xsna;

import android.app.Dialog;
import android.view.View;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.screen.p;
import com.vk.feed.design.view.newsfeed.debug.VkFeedDebugInfoView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.money.MoneyTransfersFragment;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.sharing.core.view.l;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import xsna.vkw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class w16 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w16(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ww50<?> ww50Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                n16 n16Var = ((z16) obj).A;
                if (n16Var != null) {
                    n16Var.d();
                    break;
                }
                break;
            case 1:
                ((oq6) obj).invoke();
                break;
            case 2:
                ((s0e) obj).d.K(null);
                break;
            case 3:
                y5l y5lVar = (y5l) obj;
                VkFeedDebugInfoView vkFeedDebugInfoView = y5lVar.E;
                boolean z = !(vkFeedDebugInfoView.c.getVisibility() == 0);
                z5l z5lVar = (z5l) y5lVar.C;
                vkFeedDebugInfoView.setDescriptionText(z5lVar != null ? z5lVar.i : null);
                vkFeedDebugInfoView.setDescriptionVisible(z);
                break;
            case 4:
                jmm jmmVar = (jmm) obj;
                jmmVar.l.v(jmmVar.t);
                break;
            case 5:
                ntx presenter = ((stx) obj).getPresenter();
                if (presenter != null) {
                    presenter.p7();
                    break;
                }
                break;
            case 6:
                ((dw20) obj).hide();
                break;
            case 7:
                com.vk.newsfeed.common.recycler.holders.g gVar = (com.vk.newsfeed.common.recycler.holders.g) obj;
                gVar.r.clearFocus();
                gVar.n.invoke(LeadFormHolder.ButtonAction.NEXT_PAGE);
                break;
            case 8:
                LegoStickersBottomSheetDialog legoStickersBottomSheetDialog = (LegoStickersBottomSheetDialog) obj;
                int i2 = LegoStickersBottomSheetDialog.d0;
                Dialog dialog = legoStickersBottomSheetDialog.s;
                if (dialog != null) {
                    dialog.dismiss();
                }
                LegoStickersBottomSheetDialog.a aVar = legoStickersBottomSheetDialog.b0;
                if (aVar != null && (ww50Var = aVar.b) != null) {
                    ww50Var.H(aVar);
                    break;
                }
                break;
            case 9:
                MoneyTransfersFragment moneyTransfersFragment = (MoneyTransfersFragment) obj;
                if (moneyTransfersFragment.N0.b == 0) {
                    moneyTransfersFragment.U0 = true;
                    moneyTransfersFragment.Mo(moneyTransfersFragment.Y0);
                    break;
                } else {
                    moneyTransfersFragment.Lo();
                    break;
                }
            case 10:
                int i3 = PhotoVideoAttachActivity.g0;
                ((PhotoVideoAttachActivity) obj).V1();
                break;
            case 11:
                l.a aVar2 = ((com.vk.sharing.core.view.f) obj).D;
                if (aVar2 != null) {
                    aVar2.g2();
                    break;
                }
                break;
            case 12:
                gzs<s3q0> gzsVar = ((ToolBottomView) obj).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 13:
                bst0 bst0Var = (bst0) obj;
                bst0Var.p = bst0Var.e();
                bst0Var.f.setVisibility(8);
                bst0Var.h.setVisibility(0);
                bst0Var.g.setPlayWhenReady(true);
                bst0Var.o.postDelayed(new d0(bst0Var, 14), 16L);
                break;
            case 14:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) obj;
                pxo0 pxo0Var = pVar.y;
                if (!pxo0Var.c()) {
                    pxo0Var.d();
                    MediaStoreEntry L = pVar.L();
                    if (L != null) {
                        com.vk.attachpicker.screen.t tVar = pVar.S;
                        com.vk.attachpicker.b bVar = pVar.G;
                        if (bVar.q(L)) {
                            p.c cVar = pVar.F;
                            if (cVar != null) {
                                cVar.ig(pVar, L);
                            } else {
                                pVar.J(L);
                            }
                        } else {
                            pVar.Q(L);
                        }
                        if (!pVar.I) {
                            tVar.Z(bVar.k() == 0 || (pVar.O() && !(L instanceof MediaStoreVideoEntry) && (bVar.b().size() < bVar.v() || bVar.q(L))) || pVar.J, true);
                            break;
                        } else {
                            tVar.C();
                            break;
                        }
                    }
                }
                break;
            default:
                ((olw0) obj).d.invoke(vkw0.d.b);
                break;
        }
    }
}
