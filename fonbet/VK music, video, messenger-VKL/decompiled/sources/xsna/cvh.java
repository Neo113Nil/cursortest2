package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Curator;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.design.view.tile.b;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.log.L;
import com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState;
import com.vk.permission.PermissionHelper;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;
import ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;
import xsna.cwb0;
import xsna.eeu0;
import xsna.ij20;
import xsna.k840;
import xsna.niu;
import xsna.rdm0;
import xsna.x7j0;
import xsna.xn50;
import xsna.zw00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class cvh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cvh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String c;
        String a;
        UserId uid;
        List<? extends hfz> list;
        ArrayList arrayList;
        ImageSize imageSize;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.profile.community.impl.ui.profile.f) obj2).v.d((CommunityProfileViewState.Data.e) obj);
                return s3q0.a;
            case 1:
                return ((SignalingTransportBuilder) obj2).build((SignalingTransportAdapter.Params) obj);
            case 2:
                p1p.a(((lak) obj2).s, ((Integer) obj).intValue());
                return s3q0.a;
            case 3:
                return ((DirectCallTopology) obj2).a((StatsCallback) obj);
            case 4:
                ((com.vk.photos.ui.editalbum.domain.c) obj2).T(e.d.b);
                return s3q0.a;
            case 5:
                io.reactivex.rxjava3.subjects.d<List<EduAchievement>> dVar = ((r5p) obj2).c;
                List<EduAchievement> list2 = (List) ((xpp) obj).a();
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                dVar.onNext(list2);
                return s3q0.a;
            case 6:
                return v0r.p((v0r) obj2, (Context) obj, "Иваааааааааааааааааааааааааааааааааааааааааааааааан", "Очень длинный текст😀😄😁 комментария, который не помещается в одну строку и должен перенестись на следующую строку для проверки многострочного режима", true, 16);
            case 7:
                ((ij20.a) obj).l(((zrs) obj2).c);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((String) obj).length() > 0 && ((Boolean) ((fws) obj2).j.invoke()).booleanValue());
            case 9:
                tys tysVar = (tys) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    tysVar.u0(th);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 10:
                FrameLayout frameLayout = (FrameLayout) obj2;
                gy90 gy90Var = (gy90) obj;
                int i2 = GalleryFragmentImpl.R0;
                ArrayList arrayList2 = gy90Var.a;
                PermissionHelper.a.getClass();
                bwt0.p0(frameLayout, (arrayList2.containsAll(rl3.u0(PermissionHelper.e)) || gy90Var.a.containsAll(rl3.u0(PermissionHelper.f))) ? ihs.b.P0().booleanValue() : false);
                return s3q0.a;
            case 11:
                ((rg50) obj2).C(((ljo0) obj).b.f);
                return s3q0.a;
            case 12:
                Throwable th2 = (Throwable) obj;
                c95 c95Var = ((com.vk.ecomm.market.good.ui.restriction.a) obj2).l;
                if (c95Var != null) {
                    c95Var.invoke(th2);
                }
                return s3q0.a;
            case 13:
                ((piu) obj2).b.b.b.onNext(niu.a.a);
                return s3q0.a;
            case 14:
                hlu hluVar = (hlu) obj2;
                glu gluVar = hluVar.p;
                if (gluVar != null) {
                    hluVar.l.invoke(gluVar.b);
                }
                return s3q0.a;
            case 15:
                zxu zxuVar = (zxu) obj2;
                TextView textView = zxuVar.f;
                Context context = (textView != null ? textView : null).getContext();
                tpc0.a(context, new com.vk.movika.sdk.base.flow.binding.g(14, zxuVar, context));
                return s3q0.a;
            case 16:
                pqv pqvVar = (pqv) obj2;
                tdu tduVar = (tdu) obj;
                l5g l5gVar = (l5g) ((zak0) pqvVar.f).getValue();
                boolean d = pqvVar.d();
                boolean d2 = l5gVar != null ? l5g.d(l5gVar.a, l5g.k) : false;
                float f = 1.0f;
                if (d2 && !d) {
                    f = 0.64f;
                }
                tduVar.b(f);
                return s3q0.a;
            case 17:
                doz dozVar = (doz) obj2;
                L.g(dozVar.w, (Throwable) obj);
                dozVar.o1();
                return s3q0.a;
            case 18:
                krz krzVar = (krz) obj2;
                eeu0.a aVar = new eeu0.a(krzVar.requireContext());
                aVar.g = Integer.valueOf(R.layout.vk_qr_web_to_app_loader_dialog_layout);
                aVar.c = false;
                krzVar.i = aVar.m();
                return s3q0.a;
            case 19:
                a600 a600Var = (a600) obj2;
                x7j0 x7j0Var = (x7j0) obj;
                if (x7j0Var instanceof x7j0.a) {
                    Group group = ((x7j0.a) x7j0Var).b;
                    if (group == null || (c = group.d) == null) {
                        c = a600Var.a().c();
                    }
                    if (group == null || (a = group.e) == null) {
                        a = a600Var.a().a();
                    }
                    if (group == null || (uid = group.c) == null) {
                        uid = a600Var.a().getUid();
                    }
                    a600Var.d.invoke(c, a, uid);
                    a600Var.h = uid;
                    odm0 odm0Var = a600Var.g;
                    if (odm0Var != null) {
                        ListBuilder e = e43.e();
                        odm0 odm0Var2 = a600Var.g;
                        if (odm0Var2 != null && (list = odm0Var2.h) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : list) {
                                if (obj3 instanceof rdm0.b) {
                                    arrayList3.add(obj3);
                                }
                            }
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                rdm0.b bVar = (rdm0.b) it.next();
                                long j = a600Var.h.b;
                                long j2 = bVar.b;
                                e.add(new rdm0.b(j2, bVar.c, bVar.d, j == j2, bVar.f, bVar.g, bVar.h));
                            }
                        }
                        odm0Var.setItems(e.g());
                    }
                    a600Var.b.Hk();
                }
                return s3q0.a;
            case 20:
                ((dq00) obj2).b.a(br00.b);
                return s3q0.a;
            case 21:
                int i3 = MarketEditAlbumCoverFragment.c0;
                xn50.a.c((MarketEditAlbumCoverFragment) obj2, new zw00.a.b((Photo) obj));
                return s3q0.a;
            case 22:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (marketItemCommentsFragment.c0 == null) {
                    com.vk.core.view.components.spinner.c e2 = qv20.e(marketItemCommentsFragment.mo2getContext(), Integer.valueOf(R.string.loading));
                    marketItemCommentsFragment.c0 = e2;
                    e2.setCancelable(false);
                    com.vk.core.view.components.spinner.c cVar = marketItemCommentsFragment.c0;
                    if (cVar != null) {
                        cVar.setCanceledOnTouchOutside(false);
                    }
                }
                if (booleanValue) {
                    com.vk.core.view.components.spinner.c cVar2 = marketItemCommentsFragment.c0;
                    if (cVar2 != null) {
                        cVar2.show();
                    }
                } else {
                    com.vk.core.view.components.spinner.c cVar3 = marketItemCommentsFragment.c0;
                    if (cVar3 != null) {
                        cVar3.dismiss();
                    }
                }
                return s3q0.a;
            case 23:
                b.a aVar2 = (b.a) obj2;
                VkPicture vkPicture = (VkPicture) obj;
                VkPicture vkPicture2 = aVar2.b;
                Image image = aVar2.d;
                vkPicture2.o0((image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) ixj0.c(arrayList, vkPicture.getWidth(), vkPicture.getHeight())) == null) ? null : imageSize.d.d, null);
                return s3q0.a;
            case 24:
                bzb0 bzb0Var = ((MsgViewHeaderComponent) obj2).k;
                bzb0Var.getClass();
                bzb0Var.c(cwb0.j0.e, null);
                return s3q0.a;
            case 25:
                mq40 mq40Var = (mq40) obj2;
                List list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(mq40Var.a.c(((AudioBook) it2.next()).b));
                }
                return io.reactivex.rxjava3.core.a.m(arrayList4);
            case 26:
                Curator curator = (Curator) obj2;
                bn40.g("AudioUnfollowCurator", (Integer) obj);
                curator.g = false;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new elk(curator, false));
                return s3q0.a;
            case 27:
                int i4 = NewsfeedFilterListFragment2.X;
                ((zer) ((NewsfeedFilterListFragment2) obj2).V.getValue()).submitList(rdi.x((List) obj));
                return s3q0.a;
            case 28:
                return ((OfflineAudioBookChaptersMviState) obj).a((AudioBook) obj2);
            default:
                ((l880) obj2).M.f.b();
                return s3q0.a;
        }
    }
}
