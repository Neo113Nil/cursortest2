package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.api.generated.photos.dto.PhotosVerticalizeResponseDto;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.stickers.UIBlockStickerPackPreview;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackHorizontalPreviewListItemVh;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerTopBarBonusBalanceVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.folders.impl.configure.d;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.translate.impl.models.SupportedTranslateLanguage;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aop0;
import xsna.gop0;
import xsna.onp0;
import xsna.t310;
import xsna.v5a0;
import xsna.w9z;
import xsna.wk50;
import xsna.wnp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class n15 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n15(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.n9z] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gop0 bVar;
        int i = this.b;
        int i2 = 1;
        int i3 = 25;
        int i4 = 3;
        int i5 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((p15) obj4).b((UserId) obj3, (UserId) obj2);
                return s3q0.a;
            case 1:
                UIBlock uIBlock = (UIBlock) obj4;
                d2a d2aVar = (d2a) obj3;
                StickerTopBarBonusBalanceVh stickerTopBarBonusBalanceVh = (StickerTopBarBonusBalanceVh) obj2;
                n3a n3aVar = (n3a) obj;
                if ((n3aVar instanceof oon0) && uIBlock.h.contains(((oon0) n3aVar).a)) {
                    d2aVar.a.d(uIBlock.b, null, uIBlock.Kb(), false, null).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new gn0(new bi0(i4, d2aVar, stickerTopBarBonusBalanceVh), 6), kwg0.b());
                }
                return s3q0.a;
            case 2:
                owt owtVar = (owt) obj4;
                ?? r9 = (FunctionReferenceImpl) obj3;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj2;
                NewsComment newsComment = (NewsComment) ((it80) obj).a;
                if (newsComment != null) {
                    int i6 = newsComment.i;
                    Integer num = owtVar.d;
                    if (num != null && i6 == num.intValue()) {
                        r9.invoke(newsComment);
                    }
                }
                return qVar;
            case 3:
                pir0.a(((vop) obj4).L, (String) obj3, (VkAuthValidateAccountResponse) obj, (List) obj2, 2);
                return s3q0.a;
            case 4:
                com.vk.folders.impl.configure.d dVar = (com.vk.folders.impl.configure.d) obj2;
                ayr ayrVar = (ayr) obj;
                Set<Long> set = ayrVar.h;
                Set S0 = j5g.S0((List) obj4);
                Set S02 = j5g.S0((List) obj3);
                Map<Long, wt90> map = ayrVar.e;
                Set<Long> keySet = map.keySet();
                Set<Long> set2 = ayrVar.i;
                Set g = izi0.g(S0, izi0.j(keySet, set2));
                Set set3 = g;
                if (!set3.isEmpty()) {
                    m0s m0sVar = dVar.i;
                    List O0 = j5g.O0(g);
                    a1w a1wVar = m0sVar.a;
                    List list = O0;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Number) it.next()).longValue();
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        arrayList.add(Peer.a.b(longValue));
                    }
                    di6.l(dVar, a1wVar.C(m0sVar, new tqm(new sqm(arrayList, null, false, null, 0, 30))).q(m0sVar.b).l(new e7(new nyq(2), i3)).m(dVar.n), new oz(dVar, 16), 1);
                }
                Set<Long> set4 = set;
                Set g2 = izi0.g(j5g.T0(set4, izi0.g(S0, set2)), S02);
                Set g3 = izi0.g(j5g.T0(set2, izi0.g(S02, set4)), S0);
                return ayr.a(ayrVar, d.a.a(ayrVar.e, ayrVar.f, g3, g2, ayrVar.a, Boolean.valueOf(!set3.isEmpty()), null, ayrVar.d, com.vk.folders.impl.configure.b.a(dVar.h), ayrVar.g, dVar.m, dVar.p), dVar.s(ayrVar.d, ayrVar.c, com.vk.folders.impl.configure.d.u(map, ayrVar.f, g3, g2), com.vk.folders.impl.configure.d.v(g2, g3)), false, null, null, null, null, g2, g3, null, false, 15996);
            case 5:
                final View view = (View) obj4;
                final Rect rect = (Rect) obj3;
                final wh50 wh50Var = (wh50) obj2;
                ?? r1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.n9z
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        View view2 = view;
                        Rect rect2 = rect;
                        view2.getWindowVisibleDisplayFrame(rect2);
                        int height = view2.getRootView().getHeight();
                        wh50Var.setValue(Boolean.valueOf(((double) (height - rect2.bottom)) > ((double) height) * 0.5d));
                    }
                };
                view.getViewTreeObserver().addOnGlobalLayoutListener(r1);
                return new w9z.c(view, r1);
            case 6:
                r210.e((wk50.a) obj3, false, (x410) obj2);
                ((r210) obj4).b.b(new t310.e(tq.h(tlo0.Companion, R.string.market_all_reviews_delete_and_restore_error)));
                return s3q0.a;
            case 7:
                ec20 ec20Var = (ec20) obj4;
                yi30 yi30Var = (yi30) obj3;
                wnp0 wnp0Var = (wnp0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return io.reactivex.rxjava3.core.x.k(new aop0.b(onp0.d.a));
                }
                a1w a1wVar2 = ec20Var.a;
                if (wnp0Var instanceof wnp0.a) {
                    bVar = new gop0.a(ec20Var.b.i().getLanguage());
                } else {
                    if (!(wnp0Var instanceof wnp0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wnp0.b bVar2 = (wnp0.b) wnp0Var;
                    bVar = new gop0.b(bVar2.a.getLanguage(), bVar2.b.getLanguage());
                }
                Set b = ec20Var.c.b();
                if (bVar instanceof gop0.a) {
                    Iterator it2 = b.iterator();
                    while (it2.hasNext()) {
                        if (epx.f(((gop0.a) bVar).a, ((SupportedTranslateLanguage) it2.next()).d())) {
                            io.reactivex.rxjava3.subjects.a aVar = new io.reactivex.rxjava3.subjects.a();
                            Peer peer = yi30Var.a;
                            int i7 = yi30Var.b;
                            final io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar2.l.a(), new nu0(new pf4(peer, i7, i4), 29)).f(lc80.class).K().l(new mm6(new j4x(ec20Var, 11), i3)), new cfz(new y8m(ec20Var), i4)).subscribe(new dc20(i5, ec20Var, aVar));
                            final io.reactivex.rxjava3.disposables.c subscribe2 = new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.r(a1wVar2.C(ec20Var, new lmp(yi30Var.a, i7, bVar)), new l8(new u620(ec20Var, i2), 28)).q(asu0.a.c()).h(new f2u(new xht(8), 4)), new zb20(subscribe, 0)), new ac20(new q8w(ec20Var, i4), 0)).subscribe(new dc20(i5, ec20Var, aVar));
                            return new io.reactivex.rxjava3.internal.operators.single.k(aVar.m0(), new io.reactivex.rxjava3.functions.a() { // from class: xsna.bc20
                                @Override // io.reactivex.rxjava3.functions.a
                                public final void run() {
                                    io.reactivex.rxjava3.disposables.c.this.dispose();
                                    subscribe2.dispose();
                                }
                            });
                        }
                    }
                    return io.reactivex.rxjava3.core.x.k(new aop0.b(onp0.b.a));
                }
                if (!(bVar instanceof gop0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it3 = b.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        gop0.b bVar3 = (gop0.b) bVar;
                        if (epx.f(bVar3.a, ((SupportedTranslateLanguage) it3.next()).d())) {
                            Iterator it4 = b.iterator();
                            while (it4.hasNext()) {
                                if (epx.f(bVar3.b, ((SupportedTranslateLanguage) it4.next()).d())) {
                                }
                            }
                        }
                    }
                }
                return io.reactivex.rxjava3.core.x.k(new aop0.b(onp0.b.a));
            case 8:
                List list2 = (List) obj4;
                v5a0.a aVar2 = (v5a0.a) obj3;
                v5a0 v5a0Var = (v5a0) obj2;
                VKList vKList = (VKList) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it5 = vKList.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(new PhotoAttachment((Photo) it5.next()));
                }
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    list2.add(new EntryAttachment((PhotoAttachment) it6.next(), null, null, null, 14, null));
                }
                if (vKList.isEmpty()) {
                    aVar2.c = Integer.valueOf(list2.size());
                }
                ImageViewer.c<AttachmentWithMedia> cVar2 = v5a0Var.b;
                if (cVar2 != null) {
                    cVar2.c(arrayList2);
                }
                return s3q0.a;
            case 9:
                ((StickerPackHorizontalPreviewListItemVh) obj4).a(((StickerPackPreview) obj2).b, (UIBlockStickerPackPreview) obj3);
                return s3q0.a;
            default:
                eqr0 eqr0Var = (eqr0) obj4;
                eqr0Var.b(((PhotosVerticalizeResponseDto) obj).d(), ((Number) eqr0Var.h.getValue()).longValue(), (e9i0) obj3, (u5p0) obj2);
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n15(owt owtVar, izs izsVar, io.reactivex.rxjava3.core.q qVar) {
        this.b = 2;
        this.c = owtVar;
        this.d = (FunctionReferenceImpl) izsVar;
        this.e = qVar;
    }
}
