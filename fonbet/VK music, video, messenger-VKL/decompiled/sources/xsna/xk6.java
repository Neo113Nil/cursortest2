package xsna;

import android.content.DialogInterface;
import androidx.compose.runtime.a;
import com.vk.api.generated.market.dto.MarketGetFavesForAttachResponseDto;
import com.vk.api.generated.market.dto.MarketGroupForAttachDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment;
import com.vk.fullscreenvideo.design.view.bottom.FullscreenBottomControlsView;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.stickers.keyboard.StickersView;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModalInternalComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dwh;
import xsna.eeu0;
import xsna.osh;
import xsna.p810;
import xsna.zsc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class xk6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xk6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        if (r5 != (-1)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
    
        r4 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [xsna.nlu] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.vk.ecomm.products_multipicker.api.model.MultipickerProduct$Owner] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.vk.ecomm.products_multipicker.api.model.MultipickerProduct$Owner] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        boolean z;
        ?? r18;
        vbf0 vbf0Var;
        List<StickerPackPreviewModel> list;
        List<StickerPackPreviewModel> list2;
        int i = this.b;
        Integer num2 = null;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                final zk6 zk6Var = (zk6) obj3;
                final List list3 = (List) obj;
                final int intValue = ((Integer) obj2).intValue();
                eeu0.a aVar = new eeu0.a(zk6Var.requireContext());
                aVar.B(R.string.vk_auth_remove_user_title);
                aVar.q(R.string.vk_auth_remove_user_message);
                aVar.setPositiveButton(R.string.vk_auth_remove_accept, new DialogInterface.OnClickListener() { // from class: xsna.yk6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        Object obj4 = zk6.this.o;
                        if (obj4 == null) {
                            obj4 = null;
                        }
                        ((oud0) obj4).V(intValue, list3);
                    }
                });
                aVar.setNegativeButton(R.string.vk_auth_remove_cancel, null);
                aVar.m();
                return s3q0.a;
            case 1:
                osh.a aVar2 = (osh.a) obj;
                ((osh) obj3).f.invoke(new d.n.c.a.f(aVar2.a, aVar2.c, aVar2.f));
                return s3q0.a;
            case 2:
                dwh.a aVar3 = (dwh.a) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1255110866, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.rebooking.CommunityReBookingBannerItem.ViewHolder.<anonymous>.<anonymous> (CommunityReBookingBannerItem.kt:52)");
                    }
                    wye0.a((ewh) ((zak0) aVar3.o).getValue(), null, aVar3.n, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 3:
                ((sti) obj).a(new q1m(((DescriptionModalInternalComponent) obj3).a.a, (sl50) obj2));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                int i3 = FullscreenBottomControlsView.o;
                ((FullscreenBottomControlsView) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                aft.c((mkx0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                f810 f810Var = (f810) obj3;
                MarketGetFavesForAttachResponseDto marketGetFavesForAttachResponseDto = (MarketGetFavesForAttachResponseDto) obj2;
                List list4 = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                int i4 = 0;
                for (Object obj4 : list4) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        ?? r21 = num2;
                        e43.t();
                        throw r21;
                    }
                    MarketGroupForAttachDto marketGroupForAttachDto = (MarketGroupForAttachDto) obj4;
                    UserId g = marketGroupForAttachDto.g();
                    Image t = bu00.t(marketGroupForAttachDto.i());
                    String title = marketGroupForAttachDto.getTitle();
                    ?? r16 = i4 == 0 ? r6 : i2;
                    Boolean j = marketGroupForAttachDto.j();
                    Boolean valueOf = Boolean.valueOf((boolean) (j != null ? j.booleanValue() : i2));
                    Boolean k = marketGroupForAttachDto.k();
                    Boolean f = marketGroupForAttachDto.f();
                    Boolean d = marketGroupForAttachDto.d();
                    String e = marketGroupForAttachDto.e();
                    if (k == null || f == null || d == null || e == null) {
                        num = num2;
                        z = r6;
                        r18 = num;
                    } else {
                        z = r6;
                        num = num2;
                        r18 = new nlu(e, k.booleanValue(), f.booleanValue(), d.booleanValue());
                    }
                    arrayList.add(new glu(g, t, title, r16, valueOf, r18));
                    i4 = i5;
                    r6 = z;
                    num2 = num;
                    i2 = 0;
                }
                Integer num3 = num2;
                List<MarketMarketItemDto> e2 = marketGetFavesForAttachResponseDto.e();
                ArrayList arrayList2 = new ArrayList(c5g.u(e2, 10));
                for (MarketMarketItemDto marketMarketItemDto : e2) {
                    List<MarketGroupForAttachDto> d2 = marketGetFavesForAttachResponseDto.d();
                    arrayList2.add(new ha10(fno.a(marketMarketItemDto, f810Var.k, d2 != null ? gno.a(marketMarketItemDto.q(), d2) : num3)));
                }
                return new p810.k(arrayList, arrayList2, marketGetFavesForAttachResponseDto.f(), f810Var.f, f810Var.g, 14);
            case 7:
                ((Integer) obj2).getClass();
                ((wg40) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((fgb0) obj3).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                ((y8c0) obj3).g.invoke(new mbg(((Boolean) obj2).booleanValue()));
                return s3q0.a;
            case 10:
                ftc0 ftc0Var = (ftc0) obj3;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a = ruiVar.a(new isc0(ftc0Var, nn50Var));
                qn60 qn60Var = ftc0Var.a;
                pn60 pn60Var = ftc0Var.b;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = ftc0Var.j;
                mo60 mo60Var = ftc0Var.e;
                ?? r12 = mo60Var.m;
                ?? r13 = mo60Var.j;
                ?? r14 = mo60Var.i;
                esc0 esc0Var = ftc0Var.i;
                final f64 a2 = ruiVar.a(new bsc0(qn60Var, pn60Var, cVar, r12, r13, r14, esc0Var, nn50Var));
                final f64 a3 = ruiVar.a(new zrc0(qn60Var, pn60Var, r13, esc0Var, nn50Var));
                final f64 a4 = ruiVar.a(new gsc0(cVar, r13, r12, mo60Var.D, mo60Var.K, esc0Var, nn50Var));
                es60 es60Var = ftc0Var.k;
                final f64 a5 = ruiVar.a(new y5o0(es60Var, esc0Var, nn50Var));
                final f64 a6 = ruiVar.a(new dtc0(qn60Var, pn60Var, esc0Var, nn50Var));
                final f64 a7 = ruiVar.a(new v5o0(es60Var, esc0Var, nn50Var));
                final f64 a8 = ruiVar.a(new ssc0(qn60Var, pn60Var, esc0Var, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.psc0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj5, Object obj6) {
                        qk50 qk50Var = (qk50) obj5;
                        zsc0 zsc0Var = (zsc0) obj6;
                        if (zsc0Var instanceof zsc0.a) {
                            return qk50Var.a(f64.this, zsc0Var);
                        }
                        if (zsc0Var instanceof vsc0) {
                            return qk50Var.a(a2, zsc0Var);
                        }
                        if (zsc0Var instanceof xsc0) {
                            return qk50Var.a(a4, zsc0Var);
                        }
                        if (zsc0Var instanceof usc0) {
                            return qk50Var.a(a3, zsc0Var);
                        }
                        if (zsc0Var instanceof wsc0) {
                            return qk50Var.a(a5, zsc0Var);
                        }
                        if (zsc0Var instanceof ysc0) {
                            return qk50Var.a(a6, zsc0Var);
                        }
                        if (zsc0Var instanceof tsc0) {
                            return qk50Var.a(a7, zsc0Var);
                        }
                        if (zsc0Var instanceof zsc0.b.a) {
                            return qk50Var.a(a8, zsc0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                int i6 = ProfileFabView.r;
                ((ProfileFabView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                StickersView stickersView = (StickersView) obj3;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                int i7 = stickerStockItem.b;
                com.vk.stickers.keyboard.navigation.a aVar5 = stickersView.v;
                Iterator<? extends hfz> it = aVar5.h.iterator();
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i8 = -1;
                    } else if (!(it.next() instanceof kgy)) {
                        i8++;
                    }
                }
                aVar5.J0(i8, Collections.singletonList(new kgy(stickerStockItem, true, false)));
                ral0 ral0Var = stickersView.z;
                ArrayList arrayList3 = ral0Var.d;
                if (arrayList3 != null) {
                    arrayList3.add(0, stickerStockItem);
                }
                vbf0 vbf0Var2 = ral0Var.i;
                if (vbf0Var2 != null && (list2 = vbf0Var2.a) != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                            break;
                        } else {
                            Object next = it2.next();
                            if (i2 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (((StickerPackPreviewModel) next).e() == i7) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                if (num2 != null && num2.intValue() >= 0 && (vbf0Var = ral0Var.i) != null && (list = vbf0Var.a) != null) {
                    rdi.A(num2.intValue(), list);
                }
                sal0 sal0Var = ral0Var.c;
                if (sal0Var != null) {
                    ral0Var.d(sal0Var);
                }
                if (stickerStockItem.m || stickerStockItem.n.Db() != 0) {
                    y9l0.a(new s1l0(i7));
                } else {
                    y9l0.a(new q1l0(i7));
                }
                return s3q0.a;
            case 13:
                StorefrontFragment storefrontFragment = (StorefrontFragment) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = StorefrontFragment.S;
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1344378648, intValue3, -1, "com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment.onCreateView.<anonymous>.<anonymous> (StorefrontFragment.kt:118)");
                    }
                    nzw nzwVar = storefrontFragment.P;
                    qcy<Object> qcyVar = StorefrontFragment.S[0];
                    cpl0 cpl0Var = (cpl0) nzwVar.getValue();
                    yll0 yll0Var = (yll0) storefrontFragment.R.getValue();
                    boolean y = aVar6.y(yll0Var);
                    Object x = aVar6.x();
                    if (y || x == a.C0011a.a) {
                        StorefrontFragment.d dVar = new StorefrontFragment.d(1, yll0Var, yll0.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/storefront/impl/community/presentation/feature/event/StorefrontEvent;)V", 0);
                        aVar6.R(dVar);
                        x = dVar;
                    }
                    uml0.a(cpl0Var, (izs) ((fcy) x), aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 14:
                tet0 tet0Var = (tet0) obj3;
                int intValue4 = ((Integer) obj).intValue();
                wh50<set0> wh50Var = tet0Var.m;
                VideoSearchFiltersImpl copy = ((set0) ((zak0) wh50Var).getValue()).copy();
                copy.g = intValue4;
                copy.n = String.valueOf(intValue4);
                ((zak0) wh50Var).setValue(copy);
                tet0Var.B();
                return s3q0.a;
            default:
                ((Integer) obj).intValue();
                return Boolean.valueOf(epx.f(((UIBlock) obj2).b, ((UIBlockList) obj3).b));
        }
    }

    public /* synthetic */ xk6(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
