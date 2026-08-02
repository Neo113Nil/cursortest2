package xsna;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.VideoFile;
import com.vk.friends.impl.birthdays.presentation.BirthdaysListFragment;
import com.vk.im.reactions.impl.set_reaction.SetReactionViewHolderDelegate;
import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetState;
import com.vk.log.L;
import com.vk.music.playlist.display.domain.a;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.photoviewer.PhotoViewer;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.profile.community.impl.ui.trust_mark.c;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.toggle.b;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vkontakte.android.BirthdayBroadcastReceiver;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.fpc;
import xsna.i6w;
import xsna.il90;
import xsna.l6w;
import xsna.lab0;
import xsna.oig0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dp0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dp0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v30, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r5v16, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.gzs
    public final Object invoke() {
        sns0 sns0Var;
        PostingUserMessage postingUserMessage;
        int i = this.b;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                i0q0.a().post(new ep0((hp0) obj2, (Throwable) obj));
                return s3q0.a;
            case 1:
                return "addSubtitlesListener() - count= " + ((BaseVideoPlayer) obj2).p.size() + " listener= " + ((OneVideoPlayer.e) obj);
            case 2:
                Context context = (Context) obj2;
                int i2 = BirthdayBroadcastReceiver.a;
                String string = context.getResources().getString(R.string.birthday_today_short, TextUtils.join(", ", (ArrayList) obj));
                Intent n = new BirthdaysListFragment.a().n(context);
                n.setAction("birthday" + new Random().nextInt());
                PendingIntent a = t2i0.a(context, 0, n, 301989888);
                x870 x870Var = x870.a;
                NotificationCompat.h hVar = new NotificationCompat.h(context, "default_ver2");
                hVar.k = -2;
                hVar.e = NotificationCompat.h.d(context.getString(R.string.reminder));
                hVar.f = NotificationCompat.h.d(string);
                hVar.I.icon = R.drawable.vk_icon_gift_24;
                hVar.g = a;
                NotificationCompat.f fVar = new NotificationCompat.f();
                fVar.d(hVar);
                fVar.b = NotificationCompat.h.d(context.getString(R.string.reminder));
                fVar.e = NotificationCompat.h.d(string);
                NotificationCompat.h hVar2 = fVar.a;
                Notification c = hVar2 != null ? hVar2.c() : null;
                c.flags |= 16;
                c.color = context.getResources().getColor(R.color.vk_blue_400);
                ((NotificationManager) context.getSystemService("notification")).notify(4, c);
                return s3q0.a;
            case 3:
                f78 f78Var = (f78) obj;
                BottomSheetState bottomSheetState = (BottomSheetState) ((gzs) obj2).invoke();
                return bottomSheetState == null ? new BottomSheetState(f78Var.d()) : bottomSheetState;
            case 4:
                ((izs) obj2).invoke(new fpc.d(((xjk) obj).a));
                return s3q0.a;
            case 5:
                nhd nhdVar = (nhd) obj2;
                b.a aVar = (b.a) obj;
                if (nhdVar.c.b()) {
                    z = puq.c(aVar, 3);
                } else if (nhdVar.d) {
                    z = puq.c(nhdVar.e.invoke(aVar), 3);
                }
                return Boolean.valueOf(z);
            case 6:
                ((izs) obj2).invoke(new c.a(((CommunityTrustMarksArgs.ActionButton) obj).b));
                return s3q0.a;
            case 7:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) obj2;
                bVar.o.onNext(gdj.a(bVar.d(), null, null, null, null, (Throwable) obj, false, null, 1919));
                return s3q0.a;
            case 8:
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) obj;
                Iterator<OneVideoPlayer.c> it = ((one.video.player.j) obj2).b.iterator();
                while (it.hasNext()) {
                    it.next().w(baseVideoPlayer);
                }
                return s3q0.a;
            case 9:
                ((com.vk.core.fragments.e) obj2).e.c.Qb((ArrayList) obj);
                return s3q0.a;
            case 10:
                ((p7w) obj2).d.invoke(new i6w.a0(((l6w.b.o) ((l6w.b) obj)).a));
                return s3q0.a;
            case 11:
                return new p7y((r6y) obj2, (fvv0) obj);
            case 12:
                ((k150) obj2).m.a.invoke(new a.f.c(((lab0.a) obj).a));
                return s3q0.a;
            case 13:
                il90.b bVar2 = (il90.b) obj;
                StringBuilder sb = new StringBuilder("participantsListeners: ");
                CopyOnWriteArraySet<il90> copyOnWriteArraySet = ((kl90) obj2).b;
                L.e("ParticipantListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<il90> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().x(bVar2);
                }
                return s3q0.a;
            case 14:
                o6a0 o6a0Var = (o6a0) obj2;
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(o6a0Var.c(), o6a0Var.b.a(), null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent) obj, null, 49144, null);
            case 15:
                PhotoViewer.AnimationState animationState = (PhotoViewer.AnimationState) obj;
                ((FunctionReferenceImpl) obj2).invoke();
                if (animationState.c == PhotoViewer.AnimationState.VideoGifState.PLAY_ON_FINISH_ANIMATION && (sns0Var = animationState.b) != null) {
                    sns0Var.d();
                }
                return s3q0.a;
            case 16:
                izs izsVar = (izs) obj2;
                ActionsAvailabilityState.Availability availability = ((ActionsAvailabilityState.AttachmentState) obj).b;
                PostingAction.Navigation.OpenInCurrentStep openInCurrentStep = new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.ProductsPicker.b);
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(openInCurrentStep);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, openInCurrentStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 17:
                ((izs) obj2).invoke(new oig0.b((String) obj));
                return s3q0.a;
            case 18:
                SetReactionViewHolderDelegate.a aVar2 = (SetReactionViewHolderDelegate.a) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                if (aVar2 != null && aVar2.e) {
                    while (viewGroup.getChildCount() > 1) {
                        viewGroup.removeViewAt(viewGroup.getChildCount() - 1);
                    }
                }
                return s3q0.a;
            case 19:
                ((izs) obj2).invoke(new ShortVideoListView.d.b(((ShortVideoListView.e) obj).b));
                return s3q0.a;
            case 20:
                maz.c(xwk.d().e(), ((RecyclerView.e0) obj2).itemView.getContext(), ((ActionLink) obj).e, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 21:
                wh50 wh50Var = (wh50) obj;
                cxl0 cxl0Var = (cxl0) StoryArchiveFragment.this.S;
                if (cxl0Var != null) {
                    cxl0Var.W6();
                }
                wh50Var.setValue(Boolean.FALSE);
                return s3q0.a;
            case 22:
                mtp0 mtp0Var = (mtp0) obj2;
                mtp0Var.b0.bi(((iag) obj).getId(), mtp0Var.itemView.getContext());
                return s3q0.a;
            case 23:
                ((UserProfileDialogs) obj2).a.a(new UserProfileAction.s.a.b.C1691a((ProfileAction) obj));
                return s3q0.a;
            case 24:
                ((VideoItemListLargeVh) obj2).b0.a((VideoFile) obj);
                return s3q0.a;
            case 25:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj2;
                ?? r4 = (FunctionReferenceImpl) obj;
                if (mVar.c() == DiscoveryScreenMotionStates$Landscape.Fullscreen) {
                    r4.invoke();
                    mVar.r(DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar);
                }
                return s3q0.a;
            case 26:
                Context context2 = (Context) obj2;
                int i3 = VkCellButton.l;
                riu0 riu0Var = new riu0(context2, (AttributeSet) obj, 0);
                com.vk.core.view.components.cell.h hVar3 = new com.vk.core.view.components.cell.h(context2);
                hVar3.setId(R.id.ds_internal_sexy_cell);
                hVar3.setSize(Slot.Size.M);
                riu0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                riu0Var.addView(hVar3);
                riu0Var.b = hVar3;
                riu0Var.setBackground(e3m.e(R.attr.selectableItemBackground, context2));
                riu0Var.setMinimumHeight(hbh0.b(48, context2));
                return riu0Var;
            default:
                xlv0 xlv0Var = (xlv0) obj2;
                pur purVar = (pur) obj;
                if (xlv0Var.e.get()) {
                    L.G("VkStatImpl", "Cannot flush, VkStat is shutdown");
                } else if (!xlv0Var.c.get()) {
                    L.G("VkStatImpl", "Cannot flush, VkStat not initialized");
                } else if (!xlv0Var.f.get()) {
                    xlv0Var.i.submit(new i6k(7, xlv0Var, purVar));
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dp0(com.vk.video.ui.discovery.minimizable.m mVar, gzs gzsVar) {
        this.b = 25;
        this.c = mVar;
        this.d = (FunctionReferenceImpl) gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dp0(gzs gzsVar, PhotoViewer.AnimationState animationState) {
        this.b = 15;
        this.c = (FunctionReferenceImpl) gzsVar;
        this.d = animationState;
    }
}
