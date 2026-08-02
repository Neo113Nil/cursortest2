package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.attachpicker.stat.models.VkStickerMeta;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.user.UserProfile;
import com.vk.fave.entities.FaveEntry;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.f;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.libvideo.design.view.spectators.SpectatorsCounterView;
import com.vk.log.L;
import com.vk.mvi.core.internal.executors.ThreadType;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.profile.questions.impl.d;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$StickerData;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$StickerEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.video.polls.di.UxPollsComponentImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.b4;
import xsna.fmc0;
import xsna.il90;
import xsna.rxp;
import xsna.wqs0;
import xsna.xn50;
import xsna.z6l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v58, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 1;
        switch (this.b) {
            case 0:
                ((f.a) this.d).l.d(new b4.b(((AboutVideoItem.h) this.c).k));
                break;
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.c;
                fh5 fh5Var = (fh5) this.d;
                SpectatorsCounterView spectatorsCounterView = fh5Var.N;
                if (viewGroup != null && spectatorsCounterView != null) {
                    yjk0 yjk0Var = new yjk0(spectatorsCounterView.getContext());
                    yjk0Var.setSpectatorsCounterView(spectatorsCounterView);
                    break;
                }
                break;
            case 2:
                o1d o1dVar = (o1d) this.c;
                o1dVar.i.b(new rxp.b((SdkClipVideoFile) this.d, true));
                xn50.a.c(o1dVar, new ClipItemAction.v(true, true));
                break;
            case 3:
                CommentsOutherFragment commentsOutherFragment = (CommentsOutherFragment) this.c;
                rdg rdgVar = (rdg) this.d;
                int i2 = CommentsOutherFragment.h0;
                break;
            case 4:
                ((trg) this.c).b.d((ArrayList) this.d);
                break;
            case 5:
                ((bsq) this.c).R6((FaveEntry) this.d);
                break;
            case 6:
                ((u9) this.c).invoke(((lwb0) this.d).f);
                break;
            case 7:
                ((com.vk.core.fragments.e) this.c).e.c.Qb((ArrayList) this.d);
                break;
            case 8:
                FriendsItemSearchListVh friendsItemSearchListVh = (FriendsItemSearchListVh) this.c;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) this.d;
                UserProfile userProfile = uIBlockProfile.A;
                friendsItemSearchListVh.g(uIBlockProfile, new FriendsAnalyticsInfo(FriendsAnalyticsInfo.ClickTarget.Call));
                SearchStatInfoProvider searchStatInfoProvider = friendsItemSearchListVh.e;
                MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = (searchStatInfoProvider == null || !searchStatInfoProvider.a()) ? MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST : MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST_SEARCH;
                UiTracker uiTracker = UiTracker.a;
                VoipCallSource voipCallSource = new VoipCallSource(source, UiTracker.c());
                zls a = ams.a();
                VkRichCell vkRichCell = friendsItemSearchListVh.g;
                a.i((vkRichCell != null ? vkRichCell : null).getContext(), userProfile, voipCallSource);
                break;
            case 9:
                gdu gduVar = (gdu) this.c;
                fmc0.c.a aVar = (fmc0.c.a) this.d;
                xn50.a.c(gduVar.a, new PostingAction.Permissions.PermissionGranted(aVar.a));
                if (aVar.b) {
                    gduVar.b.b(fmc0.j.f.a);
                }
                break;
            case 10:
                ((l7v) this.c).d.remove((String) this.d);
                break;
            case 11:
                kl90 kl90Var = (kl90) this.c;
                il90.c cVar = (il90.c) this.d;
                StringBuilder sb = new StringBuilder("participantsListeners: ");
                CopyOnWriteArraySet<il90> copyOnWriteArraySet = kl90Var.b;
                L.e("ParticipantListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<il90> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().h(cVar);
                }
                break;
            case 12:
                o6a0 o6a0Var = (o6a0) this.c;
                z6l0.b bVar = (z6l0.b) this.d;
                MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType c = o6a0Var.c();
                String a2 = o6a0Var.b.a();
                MobileOfficialAppsCorePhotoEditorStat$StickerEvent mobileOfficialAppsCorePhotoEditorStat$StickerEvent = MobileOfficialAppsCorePhotoEditorStat$StickerEvent.SAVE_STICKERS;
                ArrayList arrayList = bVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof VkStickerMeta) {
                        arrayList2.add(obj);
                    }
                }
                Boolean valueOf = Boolean.valueOf(!arrayList2.isEmpty());
                ArrayList arrayList3 = bVar.a;
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    MobileOfficialAppsCorePhotoEditorStat$StickerData a3 = a7l0.a((f5l0) it2.next());
                    if (a3 != null) {
                        arrayList4.add(a3);
                    }
                }
                break;
            case 13:
                break;
            case 14:
                yid0 yid0Var = (yid0) this.c;
                ((e8c) yid0Var.a.a.u0.getValue()).a((Context) this.d, fkq0.a(yid0Var.d), Long.valueOf(yid0Var.c));
                break;
            case 15:
                ((com.vk.profile.questions.impl.e) this.c).l.b((d.c) this.d);
                break;
            case 16:
                ?? r1 = this.c;
                com.vk.clips.sdk.shared.item.static_ads.c cVar2 = (com.vk.clips.sdk.shared.item.static_ads.c) this.d;
                break;
            case 17:
                ((slq0) this.c).a(new UserProfileAction.s.c.a.g(new wii0((olq0) this.d, 10)));
                break;
            case 18:
                ((izs) this.c).invoke((moq0) this.d);
                break;
            case 19:
                AuthBridgeComponent authBridgeComponent = (AuthBridgeComponent) this.c;
                UxPollsComponentImpl uxPollsComponentImpl = (UxPollsComponentImpl) this.d;
                qcy<Object>[] qcyVarArr = UxPollsComponentImpl.i;
                b25 s = authBridgeComponent.s();
                nwy nwyVar = uxPollsComponentImpl.d;
                qcy<Object> qcyVar = UxPollsComponentImpl.i[0];
                break;
            case 20:
                ((izs) this.c).invoke(new wqs0.d((BlockId.CompositeId) this.d));
                break;
            case 21:
                etv0 etv0Var = (etv0) this.c;
                VideoCellViewState.c cVar3 = (VideoCellViewState.c) this.d;
                etv0Var.b(false);
                kbe kbeVar = cVar3.a().c;
                if (kbeVar != null) {
                    kbeVar.invoke();
                }
                break;
            default:
                h0u0 h0u0Var = (h0u0) this.c;
                ?? r2 = this.d;
                ThreadType.a aVar2 = ThreadType.Companion;
                ThreadType[] threadTypeArr = {ThreadType.MAIN};
                aVar2.getClass();
                ThreadType.a.a(threadTypeArr);
                h0u0Var.c = null;
                h0u0Var.d = r2;
                h0u0Var.a.k(r2);
                break;
        }
        return s3q0.a;
    }
}
