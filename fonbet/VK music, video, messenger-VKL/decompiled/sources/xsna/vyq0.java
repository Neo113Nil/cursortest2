package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.auth.external.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryRootVh;
import com.vk.onboardingscreens.impl.recomthemes.presentation.fragment.UserRecomThemesFragment;
import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vk.voip.ui.qr.ui.a;
import com.vk.voip.ui.share.link.pager_new.view.VoipShareLinkPagerViewNew;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import xsna.azw0;
import xsna.e2x0;
import xsna.gm50;
import xsna.l1x0;
import xsna.m9t0;
import xsna.nbv0;
import xsna.qyq0;
import xsna.r2t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vyq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vyq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.vk.catalog2.common.dto.api.ui.UIBlock] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.vk.catalog2.common.dto.ui.UIBlockList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = false;
        CoordinatorLayout.c<View> cVar = null;
        int i2 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                UserRecomThemesFragment userRecomThemesFragment = (UserRecomThemesFragment) obj2;
                qyq0 qyq0Var = (qyq0) obj;
                int i3 = UserRecomThemesFragment.U;
                if (qyq0Var instanceof qyq0.b) {
                    userRecomThemesFragment.Mf(0, null);
                } else {
                    if (!(qyq0Var instanceof qyq0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userRecomThemesFragment.Mf(-1, null);
                }
                return s3q0.a;
            case 1:
                ((nrr0) obj2).l.e();
                return s3q0.a;
            case 2:
                VideoCategoryRootVh videoCategoryRootVh = (VideoCategoryRootVh) obj2;
                oyp0 oyp0Var = (oyp0) obj;
                UIBlockCatalog uIBlockCatalog = videoCategoryRootVh.v;
                if (uIBlockCatalog != null) {
                    ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ArrayList<UIBlock> arrayList2 = ((UIBlockList) ((UIBlock) it.next())).y;
                                if (arrayList2 == null || !arrayList2.isEmpty()) {
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        if (((UIBlock) it2.next()) instanceof UIBlockVideo) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ?? r7 = (UIBlock) it3.next();
                        if (epx.f(r7.b, oyp0Var.a.b)) {
                            r7 = oyp0Var.a;
                        }
                        arrayList3.add(r7);
                    }
                    UIBlockList uIBlockList = uIBlockCatalog.y;
                    videoCategoryRootVh.v = new UIBlockCatalog(uIBlockList, uIBlockList, arrayList3, uIBlockCatalog.B, uIBlockCatalog.D, uIBlockCatalog.j, uIBlockCatalog.g, uIBlockCatalog.E, null, 256, null);
                    UIBlockList uIBlockList2 = oyp0Var.a;
                    if (uIBlockList2 != null) {
                        videoCategoryRootVh.j0(uIBlockList2);
                    }
                    if (z) {
                        View view = videoCategoryRootVh.w;
                        CoordinatorLayout.f fVar = (CoordinatorLayout.f) (view != null ? view.getLayoutParams() : null);
                        ArrayList<UIBlock> arrayList4 = oyp0Var.a.y;
                        if (arrayList4 == null || !arrayList4.isEmpty()) {
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                if (((UIBlock) it4.next()) instanceof UIBlockPlaceholder) {
                                    fVar.c(cVar);
                                }
                            }
                        }
                        cVar = videoCategoryRootVh.x;
                        fVar.c(cVar);
                    }
                }
                return s3q0.a;
            case 3:
                btp btpVar = (btp) obj2;
                List<atp> list = btpVar.a;
                ((nvy) obj).e(list.size(), new ozi(i2, list, new yml0(7)), new pzi(list, 2), new jai(802480018, new qzi(i2, btpVar, list), true));
                return s3q0.a;
            case 4:
                nts0 nts0Var = (nts0) obj2;
                boolean z2 = nts0Var.t;
                nts0Var.t = !z2;
                ImageView imageView = nts0Var.l;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setImageResource(!z2 ? R.drawable.vk_icon_flash_outline_shadow_large_48 : R.drawable.vk_icon_flash_off_outline_shadow_large_48);
                ImageView imageView2 = nts0Var.l;
                (imageView2 != null ? imageView2 : null).setContentDescription(nts0Var.getContext().getString(nts0Var.t ? R.string.story_accessibility_turn_off_flash : R.string.story_accessibility_turn_on_flash));
                kew kewVar = nts0Var.b;
                if (kewVar != null) {
                    kewVar.c(nts0Var.t);
                }
                return s3q0.a;
            case 5:
                cys0 cys0Var = (cys0) obj2;
                m9t0.a aVar = (m9t0.a) obj;
                yzt0<k9t0> yzt0Var = aVar.b;
                q8i0 q8i0Var = new q8i0(cys0Var, 22);
                cys0Var.getClass();
                gm50.a.a(cys0Var, yzt0Var, q8i0Var);
                gm50.a.a(cys0Var, aVar.c, new r0r0(cys0Var, 9));
                int i4 = 13;
                gm50.a.a(cys0Var, aVar.d, new skj0(cys0Var, i4));
                gm50.a.a(cys0Var, aVar.e, new svk0(cys0Var, 18));
                gm50.a.a(cys0Var, aVar.f, new ptl0(cys0Var, i4));
                int i5 = 28;
                gm50.a.a(cys0Var, aVar.a, new pod0(cys0Var, i5));
                gm50.a.a(cys0Var, aVar.g, new u2k0(cys0Var, 21));
                gm50.a.a(cys0Var, aVar.h, new m360(cys0Var, i5));
                gm50.a.a(cys0Var, aVar.i, new hsc0(cys0Var, 27));
                return s3q0.a;
            case 6:
                l2t0 l2t0Var = (l2t0) obj2;
                e3t0 e3t0Var = (e3t0) obj;
                xf90 xf90Var = l2t0Var.g;
                int i6 = e3t0Var.b;
                com.vk.lists.c cVar2 = xf90Var.b;
                if (cVar2 != null) {
                    cVar2.l(i6);
                }
                l2t0Var.T(new r2t0.a.c(e3t0Var));
                return s3q0.a;
            case 7:
                ((yau0) obj2).i.setLoading(true);
                return s3q0.a;
            case 8:
                com.vk.auth.external.b bVar = (com.vk.auth.external.b) obj2;
                a.b bVar2 = a.b.a;
                bVar.f = bVar2;
                bVar.b.tn(bVar2);
                return s3q0.a;
            case 9:
                ((c7v0) obj2).b.finish();
                return s3q0.a;
            case 10:
                return new v1g0((ViewGroup) obj, (nbv0.a) obj2);
            case 11:
                vuv0 vuv0Var = (vuv0) obj2;
                View view2 = (View) obj;
                TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
                if (textView != null) {
                    textView.setText(vuv0Var.d.c());
                }
                return s3q0.a;
            case 12:
                hew0 hew0Var = ((few0) obj2).a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bpn0 bpn0Var = hew0Var.c;
                if (booleanValue) {
                    ((dew0) bpn0Var.getValue()).p();
                } else {
                    ((dew0) bpn0Var.getValue()).x0();
                }
                AsrOnlineManager asrOnlineManager = (AsrOnlineManager) hew0Var.a.invoke();
                if (asrOnlineManager == null) {
                    asrOnlineManager = hew0Var.b;
                }
                asrOnlineManager.enableAsrOnline(booleanValue);
                return s3q0.a;
            case 13:
                ((nrw0) obj2).K.c(MainMenuBroadcastFeature.Option.SCREENCAST);
                return s3q0.a;
            case 14:
                int i7 = VoipQrCodeScannerFragment.W;
                ((VoipQrCodeScannerFragment) obj2).fo((a.c) obj);
                return s3q0.a;
            case 15:
                return new lww0((ViewGroup) obj, (qxw0) obj2);
            case 16:
                azw0 azw0Var = (azw0) obj;
                ((zyw0) obj2).d.getClass();
                return !(azw0Var instanceof azw0.a) ? e2x0.a.C2774a.a : new e2x0.a.b(((azw0.a) azw0Var).b);
            default:
                int i8 = l1x0.k1;
                VoipShareLinkPagerViewNew voipShareLinkPagerViewNew = ((l1x0.b) obj2).b;
                voipShareLinkPagerViewNew.getClass();
                voipShareLinkPagerViewNew.x.b(io.reactivex.rxjava3.kotlin.c.f(3, ((com.vk.voip.ui.share.link.pager.view.b) obj).i, null, null, new tuw0(voipShareLinkPagerViewNew, i2)));
                voipShareLinkPagerViewNew.setVisibility(0);
                return s3q0.a;
        }
    }
}
