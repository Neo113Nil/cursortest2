package xsna;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.feature.music.dto.ui.UIBlockOfflinePodcastItem;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.lists.ListDataSet;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.music.player.PlayerTrack;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.posting.presentation.model.PickerAttachType;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vk.posting.presentation.video.search.SearchVideoPickerFragment;
import com.vk.search.params.api.SearchParams;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Interceptor;
import ru.ok.android.utils.Logger;
import xsna.aig;
import xsna.ay40;
import xsna.jia0;
import xsna.sx60;
import xsna.vk70;
import xsna.wed0;
import xsna.x7j0;
import xsna.xn50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ux40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ux40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.vk.music.onboarding.impl.a, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        ww50<?> Y;
        FragmentImpl u;
        MusicTrack musicTrack;
        String Fb;
        MusicTrack musicTrack2;
        Object obj3;
        MusicTrack musicTrack3;
        MusicTrack musicTrack4;
        MusicTrack musicTrack5;
        MusicTrack musicTrack6;
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                yx40 yx40Var = (yx40) obj4;
                return io.reactivex.rxjava3.core.q.q(yx40Var.a(true), yx40Var.a(false)).U(new b630(new wq20((ay40.a) obj, 6), 4));
            case 1:
                com.vk.music.onboarding.impl.b bVar = (com.vk.music.onboarding.impl.b) obj4;
                String str = (String) obj;
                MusicRecommendationOnboardingContract$Presenter musicRecommendationOnboardingContract$Presenter = bVar.c;
                ?? r4 = musicRecommendationOnboardingContract$Presenter.c;
                com.vk.lists.c cVar = bVar.m;
                musicRecommendationOnboardingContract$Presenter.h = str;
                if (str.length() == 0) {
                    MusicRecommendationOnboardingContract$Presenter.State state = musicRecommendationOnboardingContract$Presenter.g;
                    MusicRecommendationOnboardingContract$Presenter.State state2 = MusicRecommendationOnboardingContract$Presenter.State.CONTENT;
                    if (state != state2) {
                        r4.qe(state2);
                        musicRecommendationOnboardingContract$Presenter.g = state2;
                    }
                } else {
                    MusicRecommendationOnboardingContract$Presenter.State state3 = musicRecommendationOnboardingContract$Presenter.g;
                    MusicRecommendationOnboardingContract$Presenter.State state4 = MusicRecommendationOnboardingContract$Presenter.State.SEARCH;
                    if (state3 != state4) {
                        r4.qe(state4);
                        musicRecommendationOnboardingContract$Presenter.g = state4;
                    }
                    io.reactivex.rxjava3.disposables.b bVar2 = musicRecommendationOnboardingContract$Presenter.e;
                    io.reactivex.rxjava3.internal.operators.observable.m1 Q = musicRecommendationOnboardingContract$Presenter.d.Q(0, str);
                    qi00 qi00Var = new qi00(cVar, musicRecommendationOnboardingContract$Presenter);
                    int i2 = 14;
                    hms hmsVar = new hms(qi00Var, i2);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    bVar2.b(Q.E(hmsVar, lVar, kVar, kVar).U(new ct(new oqu(i2), 18)).subscribe(new afs(new ie8(r4, 7), 9), new kl6(new mea(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 1), 29)));
                }
                return s3q0.a;
            case 2:
                bi20 bi20Var = (bi20) obj4;
                return new UIBlockOfflinePodcastItem(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, bi20Var.u, 3072), (OfflinePodcast) obj);
            case 3:
                ListDataSet listDataSet = (ListDataSet) obj4;
                SparseArray sparseArray = (SparseArray) obj;
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    listDataSet.F(sparseArray.keyAt(i3), (u1c0) sparseArray.valueAt(i3));
                }
                return s3q0.a;
            case 4:
                dv60 dv60Var = (dv60) obj4;
                lu60 lu60Var = (lu60) obj;
                zz60 zz60Var = dv60Var.h;
                return odq.c(zz60Var.g, new xc3(lu60Var.a(), ((qz60) dv60Var.b.getCurrentState()).b.c, zz60Var.h, (NewsfeedDeduplicator) dv60Var.l.getValue(), epx.f(lu60Var.c(), Boolean.TRUE) ? (h6c0) dv60Var.j.getValue() : null, false, sua.m(lu60Var))).l(new ac20(new v4w(lu60Var, 12), 8));
            case 5:
                na10 na10Var = (na10) obj;
                ((p010) obj4).invoke(new ygc0(na10Var.a, na10Var.b));
                return s3q0.a;
            case 6:
                py60 py60Var = (py60) obj4;
                List<ol60> list = ((xx60) py60Var.b.getCurrentState()).l.b.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (obj5 instanceof z1c0) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList4.add(x9v0Var);
                    }
                }
                py60Var.c(new sx60.a(new yo60.i.a(arrayList4)));
                return s3q0.a;
            case 7:
                vk70 vk70Var = (vk70) obj4;
                vk70.a aVar = (vk70.a) obj;
                w2w w2wVar = vk70Var.d;
                Collection<Msg> collection = vk70Var.c;
                if (w2wVar == null) {
                    w2wVar = null;
                }
                if (!w2wVar.getExperiments().s()) {
                    ArrayList E = g5g.E(collection, MsgFromUser.class);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = E.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        MsgFromUser msgFromUser = (MsgFromUser) next2;
                        msgFromUser.getClass();
                        Iterator it5 = msgFromUser.m9(AttachImage.class, true, false).iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj2 = it5.next();
                                if (((AttachImage) obj2).u) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 != null) {
                            arrayList5.add(next2);
                        }
                    }
                    aVar.a.addAll(arrayList5);
                }
                Collection<Msg> collection2 = collection;
                ArrayList E2 = g5g.E(collection2, MsgFromUser.class);
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = E2.iterator();
                while (it6.hasNext()) {
                    Object next3 = it6.next();
                    MsgFromUser msgFromUser2 = (MsgFromUser) next3;
                    if (msgFromUser2.D3(AttachWall.class, false) || msgFromUser2.D3(AttachWallReply.class, false)) {
                        arrayList6.add(next3);
                    }
                }
                aVar.a.addAll(arrayList6);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj6 : collection2) {
                    if (obj6 instanceof MsgFromUser) {
                        arrayList7.add(obj6);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it7 = arrayList7.iterator();
                while (it7.hasNext()) {
                    Object next4 = it7.next();
                    if (((MsgFromUser) next4).D3(AttachChannelMessage.class, true)) {
                        arrayList8.add(next4);
                    }
                }
                aVar.a.addAll(arrayList8);
                return s3q0.a;
            case 8:
                Interceptor.a aVar2 = (Interceptor.a) obj4;
                return aVar2.a(aVar2.request());
            case 9:
                ((r990) obj4).m.a(aig.d.a);
                return s3q0.a;
            case 10:
                ((im90) obj4).a((vgg) obj, true);
                return s3q0.a;
            case 11:
                Throwable th = ((vgg) obj).a;
                ((wq20) obj4).invoke(th);
                par0.a.getClass();
                par0.d(th);
                return s3q0.a;
            case 12:
                ImageViewer.c<AttachmentWithMedia> cVar2 = ((v5a0) obj4).b;
                if (cVar2 != null) {
                    cVar2.a(true);
                }
                return s3q0.a;
            case 13:
                int i4 = PhotosRootFragment.X;
                ((PhotosRootFragment) obj4).getFeature().i.b((com.vk.photos.root.presentation.e) obj);
                return s3q0.a;
            case 14:
                PickerRootFragment pickerRootFragment = (PickerRootFragment) obj4;
                jia0 jia0Var = (jia0) obj;
                int i5 = PickerRootFragment.W;
                FragmentActivity activity = pickerRootFragment.getActivity();
                if (activity == 0) {
                    return s3q0.a;
                }
                pickerRootFragment.R.getClass();
                if (jia0Var.equals(jia0.a.a)) {
                    ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                    if (ey50Var != null && (Y = ey50Var.Y()) != null && (u = Y.u()) != null) {
                        h3p0.b(u);
                    }
                } else {
                    if (!(jia0Var instanceof jia0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jia0.b bVar3 = (jia0.b) jia0Var;
                    PickerAttachType pickerAttachType = bVar3.a;
                    UserId userId = bVar3.b;
                    if (pickerAttachType instanceof PickerAttachType.VideoVk) {
                        SearchVideoPickerFragment.a aVar3 = new SearchVideoPickerFragment.a(SearchVideoPickerFragment.class, null, null);
                        aVar3.j.putParcelable("user_id_video", userId);
                        aVar3.s(true);
                        aVar3.h(activity, 45);
                    }
                }
                return s3q0.a;
            case 15:
                com.vk.music.player.playback.c cVar3 = (com.vk.music.player.playback.c) obj4;
                eip0 eip0Var = cVar3.q;
                LinkedHashMap linkedHashMap = cVar3.m;
                yj40 yj40Var = (yj40) obj;
                if (yj40Var instanceof fa50) {
                    fa50 fa50Var = (fa50) yj40Var;
                    MusicTrack musicTrack7 = fa50Var.a;
                    xd50 xd50Var = (xd50) linkedHashMap.get(musicTrack7.Fb());
                    if (xd50Var != null) {
                        linkedHashMap.put(musicTrack7.Fb(), new xd50(musicTrack7, xd50Var.b));
                    }
                    int size2 = eip0Var.a.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        PlayerTrack a = eip0Var.a(i6);
                        if (epx.f((a == null || (musicTrack6 = a.b) == null) ? null : musicTrack6.Fb(), musicTrack7.Fb())) {
                            a.b = musicTrack7;
                        }
                        PlayerTrack a2 = eip0Var.a(i6);
                        MusicTrack musicTrack8 = a2 != null ? a2.b : null;
                        if (musicTrack8 != null && musicTrack8.b == fa50Var.b.b) {
                            musicTrack8.U = true;
                            musicTrack8.l = false;
                        }
                    }
                } else if (yj40Var instanceof yd50) {
                    yd50 yd50Var = (yd50) yj40Var;
                    MusicTrack musicTrack9 = yd50Var.a;
                    List<String> list2 = yd50Var.b;
                    xd50 xd50Var2 = (xd50) linkedHashMap.get(musicTrack9.Fb());
                    if (xd50Var2 != null) {
                        linkedHashMap.put(musicTrack9.Fb(), new xd50(musicTrack9, xd50Var2.b));
                    }
                    int size3 = eip0Var.a.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        PlayerTrack a3 = eip0Var.a(i7);
                        if (epx.f((a3 == null || (musicTrack5 = a3.b) == null) ? null : musicTrack5.Fb(), musicTrack9.Fb())) {
                            a3.b = musicTrack9;
                        }
                    }
                    int size4 = list2.size();
                    for (int i8 = 0; i8 < size4; i8++) {
                        String str2 = list2.get(i8);
                        String g0 = drm0.g0(str2, BundleUtil.UNDERLINE_TAG, str2);
                        Iterator it8 = Collections.unmodifiableList(eip0Var.a).iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                obj3 = it8.next();
                                if (((PlayerTrack) obj3).b.b == Integer.parseInt(g0)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        PlayerTrack playerTrack = (PlayerTrack) obj3;
                        if (playerTrack != null && (musicTrack4 = playerTrack.b) != null) {
                            musicTrack4.U = false;
                        }
                        if (playerTrack != null && (musicTrack3 = playerTrack.b) != null) {
                            musicTrack3.l = true;
                        }
                    }
                } else if (yj40Var instanceof ib50) {
                    MusicTrack musicTrack10 = ((ib50) yj40Var).a;
                    xd50 xd50Var3 = (xd50) linkedHashMap.get(musicTrack10.Fb());
                    if (xd50Var3 != null) {
                        linkedHashMap.put(musicTrack10.Fb(), new xd50(musicTrack10, xd50Var3.b));
                    }
                    int size5 = eip0Var.a.size();
                    for (int i9 = 0; i9 < size5; i9++) {
                        PlayerTrack a4 = eip0Var.a(i9);
                        if (epx.f((a4 == null || (musicTrack2 = a4.b) == null) ? null : musicTrack2.Fb(), musicTrack10.Fb())) {
                            a4.b = musicTrack10;
                        }
                    }
                } else if (yj40Var instanceof gc50) {
                    gc50 gc50Var = (gc50) yj40Var;
                    for (MusicTrack musicTrack11 : gc50Var.a.values()) {
                        xd50 xd50Var4 = (xd50) linkedHashMap.get(musicTrack11.Fb());
                        if (xd50Var4 != null) {
                            linkedHashMap.put(musicTrack11.Fb(), new xd50(musicTrack11, xd50Var4.b));
                        }
                    }
                    int size6 = eip0Var.a.size();
                    for (int i10 = 0; i10 < size6; i10++) {
                        PlayerTrack a5 = eip0Var.a(i10);
                        MusicTrack musicTrack12 = (a5 == null || (musicTrack = a5.b) == null || (Fb = musicTrack.Fb()) == null) ? null : (MusicTrack) gc50Var.a.get(Fb);
                        if (musicTrack12 != null) {
                            a5.b = musicTrack12;
                        }
                    }
                } else if (yj40Var instanceof hb50) {
                    cVar3.E(((hb50) yj40Var).b.b, true);
                } else if (yj40Var instanceof gb50) {
                    cVar3.E(((gb50) yj40Var).b.b, false);
                }
                return s3q0.a;
            case 16:
                j7c0 j7c0Var = (j7c0) obj;
                j7c0 a6 = j7c0.a(j7c0Var, ChannelMsgSendConfig.a(j7c0Var.a, null, false, false, false, false, null, null, null, null, false, false, false, !r7.B(), null, 24575), null, null, null, false, 30);
                ((com.vk.channels.impl.post_settings.b) obj4).s(a6.a, null);
                return a6;
            case 17:
                String str3 = (String) obj;
                z84 z84Var = ((scc0) obj4).f;
                if (z84Var != null) {
                    return z84Var.d0(str3);
                }
                return null;
            case 18:
                ((qkc0) obj4).d.getClass();
                return Boolean.valueOf(x19.G(((PostingState.Editing) obj).i.i));
            case 19:
                z9d0 z9d0Var = (z9d0) obj4;
                return new cbd0(z9d0Var.j, z9d0Var.k, z9d0Var.l, z9d0Var.m, (ViewGroup) obj);
            case 20:
                qcy<Object>[] qcyVarArr = cfd0.q1;
                ((cfd0) obj4).getFeature().C(new wed0.a((Date) obj));
                return s3q0.a;
            case 21:
                ((QrWithCodeAuthModal) obj4).b();
                return s3q0.a;
            case 22:
                h6f0 h6f0Var = (h6f0) obj4;
                if (h6f0Var != null) {
                    h6f0Var.L();
                }
                return s3q0.a;
            case 23:
                ((zak0) ((sjg0) obj4).x).setValue((String) obj);
                return s3q0.a;
            case 24:
                return new r990((ViewGroup) obj, ((u6h0) obj4).i);
            case 25:
                csh0 csh0Var = (csh0) obj4;
                SearchParams searchParams = (SearchParams) obj;
                if (searchParams != null) {
                    return csh0Var.e.a(searchParams);
                }
                return null;
            case 26:
                ((zak0) ((u4i0) obj4).d).setValue(Integer.valueOf((int) ((Float) obj).floatValue()));
                return s3q0.a;
            case 27:
                xn50.a.c((e8j0) obj4, new x7j0.f((List) obj));
                return s3q0.a;
            case 28:
                return com.vk.sharing.core.view.f.W0((com.vk.sharing.core.view.f) obj4);
            default:
                hmk0 hmk0Var = (hmk0) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                dmk0 H = hmk0Var.H();
                hmk0Var.c.s(new dmk0(H.a || booleanValue, booleanValue, H.c, H.d));
                VkCell vkCell = hmk0Var.i;
                if (vkCell != null) {
                    vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.f((gzs) hmk0Var.k, booleanValue, true), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ux40(w060 w060Var, bi20 bi20Var) {
        this.b = 2;
        this.c = bi20Var;
    }
}
