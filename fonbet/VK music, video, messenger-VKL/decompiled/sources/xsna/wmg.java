package xsna;

import android.util.TypedValue;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.video.VideoAlbum;
import com.vk.fullscreenvideo.design.view.top.TopControlsView;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stickers.bridge.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import xsna.ij20;
import xsna.mnr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wmg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wmg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        List u0;
        UIBlockList uIBlockList;
        ArrayList<UIBlock> arrayList;
        VideoAlbum videoAlbum;
        VideoAlbum videoAlbum2;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                StickerStockItem stickerStockItem = (StickerStockItem) obj2;
                return new b.a(stickerStockItem, com.vk.stickers.bridge.b.I(stickerStockItem.b, (UserId) obj3, (List) obj));
            case 1:
                ((Integer) obj2).getClass();
                com.vk.community.design.compose.onboarding.a.d((CommunityCreationOnboardingBlock) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                lto ltoVar = (lto) obj3;
                String str = (String) obj;
                int intValue = ((Integer) obj2).intValue();
                dto dtoVar = ltoVar.E;
                ero eroVar = (ero) ltoVar.C;
                dtoVar.c(intValue, str, eroVar != null ? eroVar.k : null);
                ltoVar.X6(new NewsfeedExternalAction.Navigation.i(ltoVar.itemView.getContext(), str));
                return s3q0.a;
            case 3:
                f910 f910Var = (f910) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1669438838, intValue2, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.MarketMultiSelectPickerView.configureErrorStateView.<anonymous> (MarketMultiSelectPickerView.kt:151)");
                    }
                    TypedValue typedValue = krv0.a;
                    rrv0.e(epx.f(krv0.i(f910Var.c), Boolean.TRUE), null, null, null, null, null, kai.c(-1421054393, new y6c(f910Var, 7), aVar), aVar, 1572864, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                av20 av20Var = (av20) obj3;
                int intValue3 = ((Integer) obj).intValue();
                if (obj2 != null) {
                    av20Var.notifyItemChanged(intValue3, obj2);
                } else {
                    av20Var.notifyItemChanged(intValue3);
                }
                return s3q0.a;
            case 5:
                ibk0 ibk0Var = (ibk0) obj3;
                Set set = (Set) obj;
                AtomicReference<Object> atomicReference = ibk0Var.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        u0 = set;
                    } else if (obj4 instanceof Set) {
                        u0 = e43.l(obj4, set);
                    } else {
                        if (!(obj4 instanceof List)) {
                            throw at.b("Unexpected notification");
                        }
                        u0 = j5g.u0(Collections.singletonList(set), (Collection) obj4);
                    }
                    while (!atomicReference.compareAndSet(obj4, u0)) {
                        if (atomicReference.get() != obj4) {
                            break;
                        }
                    }
                    if (ibk0Var.c()) {
                        ibk0Var.a.invoke(new in60(ibk0Var, 16));
                    }
                    return s3q0.a;
                    break;
                }
            case 6:
                ij20.a aVar2 = (ij20.a) obj3;
                String str2 = (String) obj;
                if (obj2 != null) {
                    aVar2.f.put(str2, obj2.toString());
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                int i2 = TopControlsView.p;
                ((TopControlsView) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                mnr0 mnr0Var = (mnr0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1635365099, intValue4, -1, "com.vk.ecomm.verifiedseller.impl.screens.status.VerificationStatusFragment.ThemedContent.<anonymous> (VerificationStatusFragment.kt:60)");
                    }
                    aVar3.K(1347845387);
                    boolean booleanValue = ((Boolean) mnr0Var.i1.getValue()).booleanValue();
                    boolean y = aVar3.y(mnr0Var);
                    Object x = aVar3.x();
                    if (y || x == a.C0011a.a) {
                        mnr0.c cVar = new mnr0.c(0, mnr0Var, mnr0.class, "onActionClick", "onActionClick()V", 0);
                        aVar3.R(cVar);
                        x = cVar;
                    }
                    onr0.a(0, aVar3, (gzs) ((fcy) x), null, booleanValue);
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                VideoAlbumVh videoAlbumVh = (VideoAlbumVh) obj3;
                UIBlockList uIBlockList2 = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList2 = uIBlockList2.y;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                for (UIBlock uIBlock : arrayList2) {
                    if ((uIBlock instanceof UIBlockList) && ((arrayList = (uIBlockList = (UIBlockList) uIBlock).y) == null || !arrayList.isEmpty())) {
                        for (UIBlock uIBlock2 : arrayList) {
                            UIBlockVideoAlbum uIBlockVideoAlbum = uIBlock2 instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) uIBlock2 : null;
                            Integer valueOf = (uIBlockVideoAlbum == null || (videoAlbum2 = uIBlockVideoAlbum.y) == null) ? null : Integer.valueOf(videoAlbum2.b);
                            UIBlockVideoAlbum uIBlockVideoAlbum2 = videoAlbumVh.z;
                            if (epx.f(valueOf, (uIBlockVideoAlbum2 == null || (videoAlbum = uIBlockVideoAlbum2.y) == null) ? null : Integer.valueOf(videoAlbum.b)) && videoAlbumVh.z != null) {
                                ArrayList<UIBlock> arrayList4 = uIBlockList.y;
                                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                                for (UIBlock uIBlock3 : arrayList4) {
                                    if (epx.f(uIBlock3, videoAlbumVh.z)) {
                                        uIBlock3 = uIBlock3.zb();
                                        UIBlockVideoAlbum uIBlockVideoAlbum3 = uIBlock3 instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) uIBlock3 : null;
                                        if (uIBlockVideoAlbum3 != null) {
                                            uIBlockVideoAlbum3.A = false;
                                        }
                                    }
                                    arrayList5.add(uIBlock3);
                                }
                                uIBlock = new UIBlockList(uIBlockList, arrayList5);
                                arrayList3.add(uIBlock);
                            }
                        }
                    }
                    if (epx.f(uIBlock, videoAlbumVh.z) && videoAlbumVh.z != null) {
                        uIBlock = uIBlock.zb();
                        UIBlockVideoAlbum uIBlockVideoAlbum4 = uIBlock instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) uIBlock : null;
                        if (uIBlockVideoAlbum4 != null) {
                            uIBlockVideoAlbum4.A = false;
                        }
                    }
                    arrayList3.add(uIBlock);
                }
                return new UIBlockList(uIBlockList2, arrayList3);
        }
    }

    public /* synthetic */ wmg(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
