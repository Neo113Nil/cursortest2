package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.users.UsersSearch;
import com.vk.balance.BalanceFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.products_selection.api.di.ProductsSelectionComponent;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.TopVideoBottomSheetCallback;
import com.vk.libvideo.bottomsheet.about.a.c;
import com.vk.lists.ListDataSet;
import com.vk.music.bottomsheets.audiobook.di.AudioBookBottomSheetComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.voip.OkApiDomain;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.r2f.a;
import xsna.t53;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 3;
        int i3 = 7;
        Set set = null;
        int i4 = 6;
        int i5 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                com.vk.libvideo.bottomsheet.about.a aVar = (com.vk.libvideo.bottomsheet.about.a) obj;
                o6s0 o6s0Var = new o6s0(new TopVideoBottomSheetCallback(new e1(aVar, i5)));
                Context context = aVar.b;
                dw20 dw20Var = aVar.c;
                return new p6s0(o6s0Var, new o6s0(aVar.new c(new l6s0[]{m6s0.a(context, dw20Var instanceof fcn ? (fcn) dw20Var : null)})));
            case 1:
                return new si((ti) obj);
            case 2:
                final ow0 ow0Var = (ow0) obj;
                return new sjt0() { // from class: xsna.nw0
                    @Override // xsna.sjt0
                    public final tjt0 create(Context context2) {
                        return new tjt0(context2, new mw0(ow0.this));
                    }
                };
            case 3:
                int i6 = AlbumDetailsFragment.p0;
                return ((AlbumDetailsFragment) obj).ho().p7().a();
            case 4:
                q53 q53Var = (q53) ((t53.b) obj).l;
                if (q53Var != null) {
                    return q53Var.b;
                }
                return null;
            case 5:
                AttachedClipsState attachedClipsState = (AttachedClipsState) obj;
                List<VideoFile> j = attachedClipsState.j();
                ArrayList arrayList = new ArrayList(c5g.u(j, 10));
                Iterator<T> it = j.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoFile) it.next()).a1());
                }
                Set S0 = j5g.S0(arrayList);
                List<VideoFile> list = attachedClipsState.b;
                if (list != null) {
                    List<VideoFile> list2 = list;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((VideoFile) it2.next()).a1());
                    }
                    set = j5g.S0(arrayList2);
                }
                return Boolean.valueOf(!epx.f(S0, set));
            case 6:
                AudioBookBottomSheetComponentImpl audioBookBottomSheetComponentImpl = (AudioBookBottomSheetComponentImpl) obj;
                qcy<Object>[] qcyVarArr = AudioBookBottomSheetComponentImpl.e;
                return new hh4(new tj4(new dl4(), new qxi()), new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(audioBookBottomSheetComponentImpl, i4)), new bpn0(new f1(audioBookBottomSheetComponentImpl, i4)), new bpn0(new ng1(audioBookBottomSheetComponentImpl, i2)));
            case 7:
                int i7 = BalanceFragment.i0;
                ((BalanceFragment) obj).finish();
                return s3q0.a;
            case 8:
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CHANGE_NUMBER_TO_VERIFY, null, null, null, null, null, null, 254);
                FragmentActivity activity = ((wa6) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 9:
                id6 id6Var = (id6) obj;
                jd6 jd6Var = id6Var.a;
                UserId userId = jd6Var.b;
                if (userId == null) {
                    userId = (UserId) id6Var.i.getValue();
                }
                UserId userId2 = userId;
                boolean z = jd6Var.d;
                ListDataSet<nqs> listDataSet = id6Var.e;
                com.vk.newsfeed.posting.mediapicker.photovk.base.a aVar2 = new com.vk.newsfeed.posting.mediapicker.photovk.base.a(id6Var, i3);
                UsersSearch.Entrypoint entrypoint = id6Var.c;
                if (entrypoint == null) {
                    entrypoint = UsersSearch.Entrypoint.OtherPersonFriends;
                }
                return new oa90(userId2, z, listDataSet, aVar2, entrypoint);
            case 10:
                int i8 = BasePhotoListFragment.m0;
                return ((NewsFeedComponent) m7m.d((BasePhotoListFragment) obj).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 11:
                int i9 = BlacklistFragment.V;
                return ((BridgeComponent) m7m.d((BlacklistFragment) obj).a(fpf0.a(BridgeComponent.class))).F();
            case 12:
                BookingStartScreenFragment bookingStartScreenFragment = (BookingStartScreenFragment) obj;
                qcy<Object>[] qcyVarArr2 = BookingStartScreenFragment.S;
                ?? r3 = bookingStartScreenFragment.P;
                return new c08(new az7(((OnlineBookingInternalComponent) r3.getValue()).Mf(), ((OnlineBookingInternalComponent) r3.getValue()).Jf(), ((OnlineBookingInternalComponent) r3.getValue()).Kf()), (BookingScreenParams) bookingStartScreenFragment.O.getValue(), bookingStartScreenFragment.J, new l9(i2));
            case 13:
                ((h19) obj).getClass();
                return OkApiDomain.PROD.h();
            case 14:
                return (CameraClipsComponent) ((nmg0) obj).a(fpf0.a(CameraClipsComponent.class));
            case 15:
                return Boolean.valueOf(!((z9a) obj).q());
            case 16:
                i5b i5bVar = (i5b) obj;
                return new lxa(i5bVar.k, i5bVar.i);
            case 17:
                int i10 = q7b.l1;
                ((q7b) obj).dismiss();
                return s3q0.a;
            case 18:
                ChatFragment chatFragment = (ChatFragment) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                return new v1o(chatFragment.requireContext(), ((DonutPriceComponent) m7m.d(chatFragment).a(fpf0.a(DonutPriceComponent.class))).kf());
            case 19:
                return Boolean.valueOf(((ClipEndOverlayView) obj).r);
            case 20:
                int i11 = ClipFeedListFragment.a2;
                return ((ProductsSelectionComponent) m7m.d((ClipFeedListFragment) obj).a(fpf0.a(ProductsSelectionComponent.class))).a();
            case 21:
                w6d w6dVar = (w6d) obj;
                return new d6z(w6dVar.a.getContext(), w6dVar);
            case 22:
                return (BridgeComponent) ((k7m) m7m.f((ekd) obj)).a(fpf0.a(BridgeComponent.class));
            case 23:
                return ((nnd) obj).a.Df();
            case 24:
                int i12 = ClipsEditorVoiceOverRecordButton.B;
                return ((ClipsEditorVoiceOverRecordButton) obj).findViewById(R.id.clips_editor_voiceover_view_button_record_center_shape);
            case 25:
                ((r8e) obj).e.invoke();
                return s3q0.a;
            case 26:
                int i13 = ClipsGridDraftsListFragment.l0;
                return new mzc(R.string.my_clips_drafts_empty_stub_subtitle, ((ClipsGridDraftsListFragment) obj).requireArguments().getBoolean("ClipsGridListFragment.force_dark_theme", false));
            case 27:
                ClipsInterestsComponentImpl clipsInterestsComponentImpl = (ClipsInterestsComponentImpl) obj;
                nwy nwyVar = clipsInterestsComponentImpl.g;
                qcy<Object>[] qcyVarArr3 = ClipsInterestsComponentImpl.o;
                qcy<Object> qcyVar = qcyVarArr3[6];
                fhe fheVar = (fhe) nwyVar.c();
                nwy nwyVar2 = clipsInterestsComponentImpl.h;
                qcy<Object> qcyVar2 = qcyVarArr3[7];
                phe pheVar = (phe) nwyVar2.c();
                ewy ewyVar = clipsInterestsComponentImpl.j;
                qcy<Object> qcyVar3 = qcyVarArr3[9];
                yhe yheVar = (yhe) ewyVar.c();
                nwy nwyVar3 = clipsInterestsComponentImpl.l;
                qcy<Object> qcyVar4 = qcyVarArr3[11];
                return new uhe(fheVar, pheVar, yheVar, (ix3) nwyVar3.c());
            case 28:
                return ((asu0) obj).A(1, "vk-clips-interests-data-thread");
            default:
                return ((r2f) obj).new a();
        }
    }
}
