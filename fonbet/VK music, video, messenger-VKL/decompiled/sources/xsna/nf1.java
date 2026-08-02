package xsna;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.collections.EmptyList;
import xsna.leg;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nf1 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nf1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        RecyclerView recyclerView;
        int i = this.b;
        int i2 = 3;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((za) obj2).invoke(obj);
                break;
            case 1:
                ((l22) obj2).invoke(obj);
                break;
            case 2:
                ((yx0) obj2).invoke(obj);
                break;
            case 3:
                AttachDocumentsFragment attachDocumentsFragment = (AttachDocumentsFragment) obj2;
                int i3 = AttachDocumentsFragment.R0;
                if (!(obj instanceof paq0)) {
                    if (obj instanceof abq0) {
                        cvk.u(R.string.error, false);
                        break;
                    }
                } else {
                    Parcelable parcelable = ((paq0) obj).b;
                    if (parcelable instanceof DocumentAttachment) {
                        Document Jb = ((DocumentAttachment) parcelable).Jb();
                        Jb.c = (int) (System.currentTimeMillis() / 1000);
                        awu awuVar = attachDocumentsFragment.a0;
                        if (awuVar != null) {
                            ListDataSet listDataSet = (ListDataSet) awuVar.c;
                            listDataSet.j(0);
                            listDataSet.d.add(0, Jb);
                            listDataSet.f(0);
                        }
                        VkRecyclerPaginatedView vkRecyclerPaginatedView = attachDocumentsFragment.Z;
                        if (vkRecyclerPaginatedView != null && (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) != null) {
                            recyclerView.scrollToPosition(0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                ((yx0) obj2).invoke(obj);
                break;
            case 5:
                rul rulVar = (rul) obj2;
                Peer peer = rulVar.h;
                if (((Boolean) obj).booleanValue()) {
                    b25 b25Var = rulVar.c;
                    a1w a1wVar = rulVar.a;
                    int i4 = 1;
                    int i5 = 2;
                    if (o25.b(b25Var)) {
                        rulVar.h(a1wVar.C(rulVar, new wt(peer, Source.ACTUAL)).l(new mj1(new oj(i5), i4)).o(EmptyList.b).q(asu0.a.c()).subscribe(new j22((io.reactivex.rxjava3.subjects.d) rulVar.p.getValue(), 6), new gf0(new gl6(L.a, 0), i2)));
                    }
                    if (o25.b(b25Var)) {
                        e43.l(com.vk.dto.common.a.a(b25Var.c()), peer);
                        u6p ue = ((EduCommonComponent) ((k7m) m7m.f(new hl6())).mo408a(fpf0.a(EduCommonComponent.class))).ue();
                        rulVar.h(new io.reactivex.rxjava3.internal.operators.flowable.k0(io.reactivex.rxjava3.core.x.e(ue.a(), ue.a()), new a.r(jgp.b)).m(asu0.a.c()).subscribe(new is1((io.reactivex.rxjava3.subjects.d) rulVar.q.getValue(), 4), new xn(new wg1(L.a, 1), i5)));
                    }
                    cau0 cau0Var = a1wVar.r().h;
                    break;
                }
                break;
            case 6:
                ((t50) obj2).invoke(obj);
                break;
            case 7:
                ((yx0) obj2).invoke(obj);
                break;
            case 8:
                int i6 = BonusCatalogFragment.f0;
                ((yx0) obj2).invoke(obj);
                break;
            case 9:
                ((com.vk.channels.impl.comments.b) obj2).q(new ol(7));
                break;
            case 10:
                ((yp1) obj2).invoke(obj);
                break;
            case 11:
                ((t6) obj2).invoke(obj);
                break;
            case 12:
                ((g1e) obj2).invoke(obj);
                break;
            case 13:
                ((l22) obj2).invoke(obj);
                break;
            case 14:
                int i7 = ClipsInterestsFragment.Y;
                ((t9e) obj2).invoke(obj);
                break;
            case 15:
                ((xye) obj2).invoke(obj);
                break;
            case 16:
                ((l22) obj2).invoke(obj);
                break;
            case 17:
                ((ci3) obj2).invoke(obj);
                break;
            case 18:
                ((t9e) obj2).invoke(obj);
                break;
            case 19:
                ((leg.f) obj2).invoke(obj);
                break;
            case 20:
                ((ci3) obj2).invoke(obj);
                break;
            case 21:
                ((l22) obj2).invoke(obj);
                break;
            case 22:
                ((t9e) obj2).invoke(obj);
                break;
            case 23:
                ((t9e) obj2).invoke(obj);
                break;
            case 24:
                ((t9e) obj2).invoke(obj);
                break;
            case 25:
                ((g15) obj2).invoke(obj);
                break;
            case 26:
                ((e89) obj2).invoke(obj);
                break;
            case 27:
                ((hwm) obj2).q(new u6k((io8) obj, i2));
                break;
            case 28:
                ((e4n) obj2).e(new i4n(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            default:
                ((h8n) obj2).e((j8n) obj);
                break;
        }
    }
}
