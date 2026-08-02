package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.InterfaceC4319fe;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionsViewHolder;
import com.vk.catalog2.feature.music.holders.ComposeMusicCuratorVh;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.clips.music.MusicCatalogInfoEditor;
import com.vk.dto.group.Group;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ListIterator;
import xsna.cri;
import xsna.dt1;
import xsna.hv70;
import xsna.ibi;
import xsna.phw;
import xsna.q630;
import xsna.wkj;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xx9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xx9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.b;
        int i2 = 18;
        q630.a aVar = q630.a.a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i3 = 2;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ay9.g((CartItem.d.b) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                oyd oydVar = (oyd) obj4;
                Context context = (Context) obj3;
                ClipsEditorMusicTrack clipsEditorMusicTrack = (ClipsEditorMusicTrack) obj;
                MusicCatalogInfoEditor musicCatalogInfoEditor = (MusicCatalogInfoEditor) obj2;
                String str = clipsEditorMusicTrack.g;
                if (str == null) {
                    str = "";
                }
                ClipsEditorMusicInfo clipsEditorMusicInfo = new ClipsEditorMusicInfo(clipsEditorMusicTrack, str, 0, 0, 0, null, 0, false, false, musicCatalogInfoEditor, false, InterfaceC4319fe.c.g, null);
                e2e e2eVar = oydVar.a;
                io.reactivex.rxjava3.disposables.c cVar = oydVar.d;
                if (cVar != null) {
                    cVar.dispose();
                }
                oydVar.d = hg1.i((!clipsEditorMusicInfo.j ? cug0.c(gcd0.j(e2eVar.c, context, clipsEditorMusicInfo), context, new gtl(5), io.reactivex.rxjava3.internal.operators.observable.g0.b, new lk(9), 16) : io.reactivex.rxjava3.core.x.k(clipsEditorMusicInfo)).q(e2eVar.i.e().f()).m(e2eVar.i.e().d()), new com.vk.voip.ui.menu.feature.a(oydVar, 24));
                return s3q0.a;
            case 2:
                te4 te4Var = (te4) obj4;
                z37 z37Var = (z37) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1101874331, intValue, -1, "com.vk.music.bottomsheets.audiobook.chapter.presentation.compose.ComposableSingletons$AudioBookChapterMviComposeComponentKt.lambda$301274880.<anonymous>.<anonymous> (AudioBookChapterMviComposeComponent.kt:55)");
                    }
                    boolean J = aVar2.J(z37Var);
                    Object x = aVar2.x();
                    if (J || x == c0012a) {
                        ibi.a aVar3 = new ibi.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar2.R(aVar3);
                        x = aVar3;
                    }
                    oe4.b(te4Var, (izs) ((fcy) x), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                Group group = ((UIBlockGroup) obj4).y;
                ComposeMusicCuratorVh composeMusicCuratorVh = (ComposeMusicCuratorVh) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(427810931, intValue2, -1, "com.vk.catalog2.feature.music.holders.ComposeMusicCuratorVh.bindData.<anonymous>.<anonymous> (ComposeMusicCuratorVh.kt:77)");
                    }
                    q630 j = txj0.j(104, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar, 1.0f));
                    phw a = phw.a.a(fwu0.l(null, js5.a(480, group.f), null, null, aVar4, 0, 61), null, wkj.a.a, null, null, aVar4, 197000, 26);
                    float f = 80;
                    Object x2 = aVar4.x();
                    if (x2 == c0012a) {
                        x2 = new gv3(13);
                        aVar4.R(x2);
                    }
                    com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.e.b(a, f, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar4, 100663344, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), null, aVar4, 2);
                    String str2 = group.d;
                    Object x3 = aVar4.x();
                    if (x3 == c0012a) {
                        x3 = new oa(i2);
                        aVar4.R(x3);
                    }
                    com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(str2, null, null, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, aVar4, 12610560, 70);
                    boolean y = aVar4.y(composeMusicCuratorVh);
                    Object x4 = aVar4.x();
                    if (y || x4 == c0012a) {
                        ComposeMusicCuratorVh.a aVar5 = new ComposeMusicCuratorVh.a(0, composeMusicCuratorVh, ComposeMusicCuratorVh.class, "handleButtonClick", "handleButtonClick()V", 0);
                        aVar4.R(aVar5);
                        x4 = aVar5;
                    }
                    wiu0.b(j, false, a2, new flk(a3, (gzs) ((fcy) x4)), null, null, null, aVar4, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                wqs.d((xvy) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                GenreActionsViewHolder genreActionsViewHolder = (GenreActionsViewHolder) obj4;
                u4a u4aVar = genreActionsViewHolder.c;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1103491101, intValue3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionsViewHolder.createView.<anonymous>.<anonymous>.<anonymous> (GenreActionsViewHolder.kt:64)");
                    }
                    q630 F = s200.F(u4aVar.b.c ? 32 : kqu0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    a.j g = androidx.compose.foundation.layout.a.g(u4aVar.b.c ? 18 : kqu0.v);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, aVar6, 0);
                    int hashCode = Long.hashCode(n34.n(aVar6));
                    sy90 D = aVar6.D();
                    q630 c = qri.c(aVar6, F);
                    cri.h7.getClass();
                    LayoutNode.a aVar7 = cri.a.b;
                    if (aVar6.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar6.H();
                    if (aVar6.L()) {
                        aVar6.I(aVar7);
                    } else {
                        aVar6.f();
                    }
                    k9q0.w(aVar6, a4, cri.a.f);
                    k9q0.w(aVar6, D, cri.a.e);
                    k9q0.w(aVar6, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar6, cri.a.h);
                    k9q0.w(aVar6, c, cri.a.d);
                    aVar6.K(963322576);
                    ListIterator<GenreActionsViewHolder.a> listIterator = genreActionsViewHolder.e.listIterator();
                    while (true) {
                        duk0 duk0Var = (duk0) listIterator;
                        if (duk0Var.hasNext()) {
                            GenreActionsViewHolder.a aVar8 = (GenreActionsViewHolder.a) duk0Var.next();
                            boolean J2 = aVar6.J(aVar8) | aVar6.J(genreActionsViewHolder) | aVar6.y(composeView);
                            Object x5 = aVar6.x();
                            if (J2 || x5 == c0012a) {
                                x5 = new com.vk.movika.sdk.base.ui.u0(aVar8, genreActionsViewHolder, composeView, i3);
                                aVar6.R(x5);
                            }
                            genreActionsViewHolder.a(aVar8, (gzs) x5, aVar6, 0);
                        } else if (gp.d(aVar6)) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                t110.d((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                com.vk.profile.community.members.impl.ui.d.d(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj4, (q630) obj3);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                cv70.c((hv70.a) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 9:
                com.vk.ecomm.market.good.ui.c cVar2 = (com.vk.ecomm.market.good.ui.c) obj4;
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(600369383, intValue4, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderImpl.updateCartQuantityControl.<anonymous>.<anonymous> (ProductButtonsBinderImpl.kt:307)");
                    }
                    int i4 = cVar2.a;
                    Integer num = cVar2.c;
                    if (num != null) {
                        z = cVar2.a < num.intValue();
                    } else {
                        z = true;
                    }
                    boolean y2 = aVar9.y(eVar);
                    Object x6 = aVar9.x();
                    if (y2 || x6 == c0012a) {
                        x6 = new ko00(eVar, 26);
                        aVar9.R(x6);
                    }
                    gzs gzsVar = (gzs) x6;
                    boolean y3 = aVar9.y(eVar);
                    Object x7 = aVar9.x();
                    if (y3 || x7 == c0012a) {
                        x7 = new b1z(eVar, 16);
                        aVar9.R(x7);
                    }
                    jjd0.a(i4, z, gzsVar, (gzs) x7, false, null, aVar9, 24576, 32);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 10:
                j5k0 j5k0Var = (j5k0) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar10.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(172502894, intValue5, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.SmartCropScreen.<anonymous> (SmartCropScreen.kt:66)");
                    }
                    l5k0.a(j5k0Var.i, izsVar, null, aVar10, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
            default:
                ((izs) obj4).invoke(new wqs0.l.a((BlockId.CompositeId) obj3, (ViewGroup) obj, (yjk0) obj2));
                return s3q0.a;
        }
    }

    public /* synthetic */ xx9(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ xx9(q630 q630Var, gzs gzsVar, int i) {
        this.b = 7;
        this.d = q630Var;
        this.c = gzsVar;
    }
}
