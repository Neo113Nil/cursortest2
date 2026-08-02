package xsna;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.screen.p;
import com.vk.avatarpicker.a;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage;
import com.vk.core.simplescreen.ScreenContainer;
import com.vk.dto.common.id.UserId;
import com.vk.feed.design.view.newsfeed.topbar.FeedTopBar;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.ui.VideoPlayerAdsPanel;
import com.vk.media.MediaUtils;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.photo.editor.views.ToolButton;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import xsna.q4a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x16 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x16(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionSearchMode uIBlockActionSearchMode;
        UserId userId;
        AdsDataProvider adsDataProvider;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                z16 z16Var = (z16) obj;
                n16 n16Var = z16Var.A;
                if (n16Var != null) {
                    n16Var.a(z16Var);
                    break;
                }
                break;
            case 1:
                gzs<s3q0> gzsVar = ((CatalogErrorViewWithImage) obj).i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 2:
                ((usb) obj).a.a();
                break;
            case 3:
                ((nzb) obj).i.F1();
                break;
            case 4:
                nic nicVar = (nic) obj;
                EditText editText = nicVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    nicVar.q();
                    break;
                }
                break;
            case 5:
                com.vk.avatarpicker.a aVar = ((com.vk.avatarpicker.b) obj).i;
                a.InterfaceC0422a interfaceC0422a = (aVar != null ? aVar : null).a;
                if (interfaceC0422a != null) {
                    interfaceC0422a.J();
                    break;
                }
                break;
            case 6:
                e9m e9mVar = (e9m) obj;
                if (e9mVar.isVisible()) {
                    e9mVar.a(true);
                    break;
                }
                break;
            case 7:
                iio iioVar = ((wio) obj).e.c;
                (iioVar != null ? iioVar : null).a(d02.p);
                break;
            case 8:
                opp oppVar = (opp) obj;
                kpp kppVar = opp.T;
                otu0 un = oppVar.un();
                Context requireContext = oppVar.requireContext();
                SchemeStatSak$EventScreen u5 = oppVar.u5();
                un.getClass();
                otu0.b(requireContext, u5);
                break;
            case 9:
                RecyclerView recyclerView = ((EntriesListFragment) obj).d0.y.c;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                    break;
                }
                break;
            case 10:
                int i2 = FeedTopBar.p;
                gzs<s3q0> gzsVar2 = ((FeedTopBar.a.C1056a) ((FeedTopBar.a) obj)).c;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            case 11:
                q4a0.b bVar = ((fzt) obj).e;
                if (bVar != null) {
                    bVar.a();
                    break;
                }
                break;
            case 12:
                wet0 wet0Var = (wet0) obj;
                izs<Boolean, s3q0> izsVar = wet0Var.f;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.TRUE);
                }
                wet0Var.b();
                wet0Var.a.invoke(wet0Var.g);
                break;
            case 13:
                ((dk90) obj).m.C();
                break;
            case 14:
                int i3 = PhotoVideoAttachActivity.g0;
                ((PhotoVideoAttachActivity) obj).finish();
                break;
            case 15:
                akk0 akk0Var = (akk0) obj;
                vjk0 vjk0Var = akk0Var.k;
                if (vjk0Var != null && vjk0Var.G()) {
                    akk0Var.k.x();
                    break;
                }
                break;
            case 16:
                kxl0 kxl0Var = (kxl0) obj;
                exl0 exl0Var = kxl0Var.m;
                if (exl0Var != null && !kxl0Var.u) {
                    Object obj2 = kxl0Var.l;
                    exl0Var.invoke(((lxl0) (obj2 != null ? obj2 : null)).a);
                    break;
                } else {
                    kxl0Var.t.toggle();
                    break;
                }
                break;
            case 17:
                ToolButton toolButton = (ToolButton) obj;
                izs<? super ToolButton, s3q0> izsVar2 = toolButton.b;
                if (izsVar2 != null) {
                    izsVar2.invoke(toolButton);
                    break;
                }
                break;
            case 18:
                ToolbarVh toolbarVh = (ToolbarVh) obj;
                izs<Long, s3q0> izsVar3 = toolbarVh.l;
                UIBlockList uIBlockList = toolbarVh.z;
                izsVar3.invoke(Long.valueOf((uIBlockList == null || (uIBlockActionSearchMode = uIBlockList.I) == null || (userId = uIBlockActionSearchMode.g) == null) ? 0L : userId.b));
                break;
            case 19:
                VideoPlayerAdsPanel videoPlayerAdsPanel = (VideoPlayerAdsPanel) obj;
                int i4 = VideoPlayerAdsPanel.i;
                if (!jjc.b()) {
                    Context context = view.getContext();
                    if (context != null && (adsDataProvider = videoPlayerAdsPanel.d) != null) {
                        adsDataProvider.a8(context);
                    }
                    View.OnClickListener onClickListener = videoPlayerAdsPanel.b;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    }
                }
                break;
            default:
                final com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) obj;
                com.vk.attachpicker.b bVar2 = pVar.G;
                final MediaStoreEntry L = pVar.L();
                if (L != null) {
                    if (!pVar.L) {
                        if (bVar2.k() != 0) {
                            if (r34.a(pVar.d(), bVar2.b(), pVar.N, pVar.M)) {
                                p.c cVar = pVar.F;
                                if (cVar != null) {
                                    cVar.N7(L);
                                }
                                pVar.V2(bVar2.w());
                                break;
                            }
                        } else {
                            io.reactivex.rxjava3.disposables.c cVar2 = pVar.h0;
                            if (cVar2 != null && !cVar2.h()) {
                                pVar.h0.dispose();
                                pVar.h0 = null;
                            }
                            pVar.h0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new thc(3, pVar, L)).r0(io.reactivex.rxjava3.schedulers.a.a()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.g3u0
                                @Override // io.reactivex.rxjava3.functions.f
                                public final void accept(Object obj3) {
                                    com.vk.attachpicker.screen.p.this.M(L, (MediaUtils.f) obj3);
                                }
                            }, new io.reactivex.rxjava3.functions.f() { // from class: xsna.h3u0
                                @Override // io.reactivex.rxjava3.functions.f
                                public final void accept(Object obj3) {
                                    com.vk.attachpicker.screen.p.this.M(L, null);
                                }
                            });
                            break;
                        }
                    } else {
                        rp5 rp5Var = new rp5(L);
                        ScreenContainer screenContainer = pVar.f;
                        if (screenContainer != null) {
                            screenContainer.d(rp5Var);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
