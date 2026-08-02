package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.channels.api.CommentsHistory;
import com.vk.clips.entrypoints.feature.a;
import com.vk.clips.favorites.impl.ui.folders.content.d;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.internal.BottomSheetBehaviourExt;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.libvideo.bottomsheet.about.delegate.a0;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.b4;
import xsna.ca9;
import xsna.chd;
import xsna.cwb0;
import xsna.d4e;
import xsna.dhd;
import xsna.dob;
import xsna.dw20;
import xsna.ea9;
import xsna.f29;
import xsna.fi3;
import xsna.gm50;
import xsna.iwa;
import xsna.knb;
import xsna.m99;
import xsna.mwa;
import xsna.n7b;
import xsna.nye;
import xsna.xd4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        int i4 = 3;
        int i5 = 1;
        Object obj2 = null;
        Object obj3 = null;
        r5 = null;
        String str2 = null;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((a0.a) obj4).l.d(b4.y.a);
                return s3q0.a;
            case 1:
                ModalActionSheetListItem modalActionSheetListItem = (ModalActionSheetListItem) obj;
                Iterator<T> it = ((f11) obj4).c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((vu0) next).a == modalActionSheetListItem.a) {
                            obj2 = next;
                        }
                    }
                }
                vu0 vu0Var = (vu0) obj2;
                if (vu0Var != null) {
                    vu0Var.b();
                }
                return s3q0.a;
            case 2:
                xh3 xh3Var = (xh3) obj4;
                m0g0 m0g0Var = xh3Var.m;
                fi3.d dVar = xh3Var.n;
                m0g0Var.e((dVar != null ? dVar : null).b);
                return s3q0.a;
            case 3:
                oo3 oo3Var = (oo3) obj4;
                if (((gmq) obj).equals((ArticleAttachment) oo3Var.C)) {
                    oo3Var.Y6();
                }
                return s3q0.a;
            case 4:
                nh4 nh4Var = (nh4) obj4;
                int i6 = nh4.n1;
                gm50.a.a(nh4Var, ((xd4.a) obj).a, new pd(nh4Var, 7));
                return s3q0.a;
            case 5:
                ((d06) obj4).c.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 6:
                ya6 ya6Var = (ya6) obj4;
                AuthExternalFlowOutResponseDto authExternalFlowOutResponseDto = (AuthExternalFlowOutResponseDto) obj;
                SignUpDataHolder signUpDataHolder = ya6Var.p;
                Bundle bundle = (signUpDataHolder != null ? signUpDataHolder : null).K;
                if (bundle != null) {
                    m63.m(bundle, authExternalFlowOutResponseDto.d());
                }
                q0c q0cVar = (q0c) ya6Var.a;
                if (q0cVar != null) {
                    q0cVar.e();
                }
                return s3q0.a;
            case 7:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj4;
                int i7 = BasePhotoListFragment.l0;
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    basePhotoListFragment.lo().notifyItemChanged(((Number) ((Pair) it2.next()).i()).intValue());
                }
                return s3q0.a;
            case 8:
                return new ra7((ViewGroup) obj, ((ja7) obj4).i);
            case 9:
                d98 d98Var = (d98) obj4;
                Rect rect = (Rect) obj;
                Rect rect2 = d98Var.h;
                BottomSheetBehaviourExt<View> bottomSheetBehaviourExt = d98Var.g;
                View view = d98Var.c;
                rect2.set(rect);
                FrameLayout frameLayout = d98Var.e;
                f4m.y(rect.top, frameLayout);
                FrameLayout frameLayout2 = d98Var.f;
                f4m.y(rect.top, frameLayout2);
                if ((((WindowManager.LayoutParams) view.getLayoutParams()).flags & 131072) == 0 || !d98Var.b()) {
                    f4m.v(rect.bottom, frameLayout2);
                    f4m.v(rect.bottom, frameLayout);
                }
                if (!d98Var.b()) {
                    bottomSheetBehaviourExt.j0 = d98Var.a.H0();
                    view.requestFocus();
                } else if (view.isAttachedToWindow()) {
                    bottomSheetBehaviourExt.j0 = true;
                }
                return s3q0.a;
            case 10:
                dg8 dg8Var = (dg8) obj4;
                PrivacySetting privacySetting = (PrivacySetting) obj;
                dg8Var.l = privacySetting;
                dg8Var.f(privacySetting);
                return s3q0.a;
            case 11:
                ((dt8) obj4).B();
                return s3q0.a;
            case 12:
                z19 z19Var = (z19) obj4;
                ea9.a aVar = (ea9.a) obj;
                if (aVar instanceof ea9.a.C2789a) {
                    z19Var.T(new f29.a(((ea9.a.C2789a) aVar).a));
                }
                return s3q0.a;
            case 13:
                r480 r480Var = (r480) obj;
                ca9 ca9Var = ((m99) obj4).j().c;
                ca9.c cVar = ca9Var instanceof ca9.c ? (ca9.c) ca9Var : null;
                Dialog dialog = cVar != null ? cVar.c : null;
                if (dialog == null) {
                    return new m99.a(null);
                }
                Dialog dialog2 = (Dialog) r480Var.c.c.get(dialog.Sb());
                if (dialog2 == null) {
                    return new m99.a(null);
                }
                ChatSettings Hb = dialog2.Hb();
                return new m99.a(Hb != null ? Boolean.valueOf(Hb.k) : null);
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                yaa0 yaa0Var = ((tam0) obj4).a;
                if (yaa0Var != null) {
                    yaa0Var.b = bitmap;
                }
                return s3q0.a;
            case 15:
                ((com.vk.cameraui.impl.a) obj4).c.p = (String) obj;
                return s3q0.a;
            case 16:
                iwa.a aVar2 = (iwa.a) obj;
                mwa.a a = ((mwa) obj4).a();
                CommentsHistory commentsHistory = a.b;
                CommentsHistory commentsHistory2 = aVar2.a;
                return mwa.a.a(a, CommentsHistory.a(commentsHistory, rbg.b(commentsHistory.a, commentsHistory2.a), commentsHistory2.b, commentsHistory2.c, commentsHistory2.e, commentsHistory2.f, commentsHistory2.g, 8), a.c.Ib(aVar2.b), 1);
            case 17:
                ((f8b) obj4).d.invoke(n7b.d.b);
                return s3q0.a;
            case 18:
                nnb nnbVar = (nnb) obj4;
                knb.c cVar2 = (knb.c) obj;
                Msg msg = cVar2.c;
                if (msg.i && !cVar2.i) {
                    str2 = cVar2.f;
                }
                return new dob.f(msg.d, str2, cVar2.b.b.Bb(msg.getFrom()), cVar2.b, nnbVar.d.get());
            case 19:
                azb azbVar = ((xyb) obj4).A;
                if (azbVar != null) {
                    bzb0 a2 = azbVar.a();
                    ryb rybVar = azbVar.h;
                    rybVar.getClass();
                    a2.c(new cwb0.g0(new DialogExt(rybVar.j, rybVar.k)), new com.vk.movika.sdk.base.logic.processor.h(azbVar, 11));
                }
                return s3q0.a;
            case 20:
                return new ot9((ViewGroup) obj, ((y5c) obj4).i);
            case 21:
                ((x6d) obj4).e.a.a(w5d.b);
                return s3q0.a;
            case 22:
                thd thdVar = (thd) obj4;
                List list = (List) obj;
                List list2 = list;
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    xg5.a().D().h0((Group) it3.next());
                }
                thdVar.b.getClass();
                io.reactivex.rxjava3.internal.operators.single.x k = io.reactivex.rxjava3.core.x.k(Optional.of(new Pair(new dhd.c(new chd.d(o25.a().o())), list)));
                chd f = thdVar.f();
                if (f == null || !(f instanceof chd.b)) {
                    return k;
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next2 = it4.next();
                        Group group = (Group) next2;
                        UserId userId = ((chd.b) f).c;
                        if (userId != null) {
                            if (Math.abs(group.c.b) == Math.abs(userId.b)) {
                                obj3 = next2;
                            }
                        }
                    }
                }
                Group group2 = (Group) obj3;
                return group2 == null ? k : io.reactivex.rxjava3.core.x.k(Optional.of(new Pair(new dhd.a((chd.b) f, group2), list)));
            case 23:
                lsd lsdVar = (lsd) obj4;
                if (lsdVar.d.e().isEmpty()) {
                    ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                    pd pdVar = new pd(lsdVar, 27);
                    clipsDraftPersistentStore.getClass();
                    ClipsDraftPersistentStore.o(pdVar);
                    jpd jpdVar = lsdVar.d;
                    jpdVar.q(false);
                    zd9 camera1View = jpdVar.c.getCamera1View();
                    if (camera1View != null) {
                        camera1View.C();
                    }
                } else {
                    CameraUIView cameraUIView = lsdVar.b;
                    if (lsdVar.g == null) {
                        cameraUIView.m();
                        lsdVar.g = ((dw20.b) dw20.a.k(new dw20.b(cameraUIView.getContext(), null), lsdVar.i, 6)).a0(new w40(lsdVar, 20)).I0(null);
                    }
                }
                return s3q0.a;
            case 24:
                ((com.vk.clips.entrypoints.feature.b) obj4).g.b(new a.b((List) obj));
                return s3q0.a;
            case 25:
                com.vk.clips.favorites.impl.ui.folders.content.b bVar = (com.vk.clips.favorites.impl.ui.folders.content.b) obj4;
                FavoriteFolderId favoriteFolderId = ((d4e.a.C2703a) obj).a;
                com.vk.clips.favorites.impl.ui.folders.content.c cVar3 = bVar.f;
                if (epx.f(favoriteFolderId, cVar3.b())) {
                    bVar.U();
                }
                if (epx.f(cVar3.b(), FavoriteFolderId.Alias.AllClips.c)) {
                    bVar.T(d.InterfaceC0593d.a.b);
                }
                return s3q0.a;
            case 26:
                tgi0 tgi0Var = (tgi0) obj;
                int i8 = nye.d.$EnumSwitchMapping$0[((lvd0) obj4).b.ordinal()];
                if (i8 == 1) {
                    str = "authorClipsRatingCounterDescription";
                } else if (i8 == 2) {
                    str = "authorClipsViewCounterDescription";
                } else if (i8 == 3) {
                    str = "authorClipsSubscriptionCounterDescription";
                } else {
                    if (i8 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "authorClipsFollowerCounterDescription";
                }
                qgi0.r(tgi0Var, str);
                return s3q0.a;
            case 27:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj4;
                String str3 = (String) obj;
                String str4 = ClipsUploadFragmentImpl.a0;
                Context mo2getContext = clipsUploadFragmentImpl.mo2getContext();
                if (mo2getContext != null) {
                    maz e = clipsUploadFragmentImpl.fo().g().e();
                    LaunchContext.a aVar3 = new LaunchContext.a();
                    aVar3.o = Boolean.TRUE;
                    maz.c(e, mo2getContext, str3, aVar3.a(), null, null, 24);
                }
                return s3q0.a;
            case 28:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "priority_block_header_add_item_btn");
                qgi0.h(tgi0Var2, (String) obj4);
                return s3q0.a;
            default:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) obj4;
                CommunityProfileViewState.Data data = (CommunityProfileViewState.Data) obj;
                int i9 = 26;
                gm50.a.a(fVar, data.a, new po1(fVar, i9));
                gm50.a.a(fVar, data.b, new ifg(fVar, i4));
                gm50.a.a(fVar, data.c, new s53(13, data, fVar));
                gm50.a.a(fVar, data.d, new rlh(fVar, i5));
                gm50.a.a(fVar, data.e, new cvh(fVar, i3));
                gm50.a.a(fVar, data.f, new bhh(fVar, i2));
                gm50.a.a(fVar, data.g, new qqe(fVar, 5));
                gm50.a.a(fVar, data.h, new r3h(fVar, i5));
                gm50.a.a(fVar, data.i, new w5(fVar, i9));
                return s3q0.a;
        }
    }
}
