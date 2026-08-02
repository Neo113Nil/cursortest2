package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.clips.edit.editor.ClipsChoosePreviewActivity;
import com.vk.clips.favorites.impl.ui.folders.renaming.ClipsFavoritesFolderRenamingState;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.posting.action_button.presentation.ActionButtonsFragment;
import com.vk.notifications.common.NotificationCSatRate;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ClickAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.view.VideoView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.OneVideoPlayer;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.ghc0;
import xsna.j4e;
import xsna.li70;
import xsna.xn50;

/* compiled from: ActionButtonsFragment.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class gy extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Context context;
        MobileOfficialAppsClipsStat$ChangePreview.PreviewType previewType;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        OneVideoPlayer a;
        boolean z = false;
        switch (this.b) {
            case 0:
                ActionButtonsFragment actionButtonsFragment = (ActionButtonsFragment) this.receiver;
                actionButtonsFragment.getClass();
                xn50.a.c(actionButtonsFragment, (nw) obj);
                return s3q0.a;
            case 1:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 2:
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj;
                com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d dVar = (com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d) this.receiver;
                RecyclerView recyclerView = dVar.h;
                if (recyclerView != null && (context = recyclerView.getContext()) != null) {
                    mhy.b(context);
                }
                com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b bVar = dVar.g;
                if (bVar != null) {
                    fhc0 fhc0Var = bVar.e;
                    if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
                        ghc0.b h = fhc0Var.h();
                        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = bVar.k;
                        h.getClass();
                        h.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.SELECT_VIDEO_CARD, postingMetricsCreationEntryPoint);
                    } else {
                        ghc0.b h2 = fhc0Var.h();
                        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint2 = bVar.k;
                        h2.getClass();
                        h2.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.SELECT_PHOTO_CARD, postingMetricsCreationEntryPoint2);
                    }
                    bVar.b.cf(mediaStoreEntry);
                }
                return s3q0.a;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ke8 ke8Var = (ke8) this.receiver;
                bfw0 bfw0Var = ke8Var.d;
                Group group = ke8Var.q;
                bwt0.p0(group, bfw0Var.b() && booleanValue);
                View view = ke8Var.p;
                if (bwt0.K(ke8Var.o) && bwt0.K(group)) {
                    z = true;
                }
                bwt0.p0(view, z);
                return s3q0.a;
            case 4:
                L.i((Throwable) obj);
                return s3q0.a;
            case 5:
                ClipsChoosePreviewResult clipsChoosePreviewResult = (ClipsChoosePreviewResult) obj;
                ClipsChoosePreviewActivity clipsChoosePreviewActivity = (ClipsChoosePreviewActivity) this.receiver;
                int i = ClipsChoosePreviewActivity.y;
                clipsChoosePreviewActivity.getClass();
                Intent intent = new Intent();
                intent.putExtra("clip_preview_edit_result_key", clipsChoosePreviewResult);
                if (clipsChoosePreviewResult != null) {
                    clipsChoosePreviewActivity.setResult(-1, intent);
                    kbk context2 = ((lbk) clipsChoosePreviewActivity.x.getValue()).getContext();
                    int i2 = nwe.$EnumSwitchMapping$0[clipsChoosePreviewResult.e.ordinal()];
                    if (i2 == 1) {
                        previewType = MobileOfficialAppsClipsStat$ChangePreview.PreviewType.FIRST_FRAME;
                    } else if (i2 == 2) {
                        previewType = MobileOfficialAppsClipsStat$ChangePreview.PreviewType.GALLERY;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        previewType = MobileOfficialAppsClipsStat$ChangePreview.PreviewType.ORIGINAL;
                    }
                    MobileOfficialAppsClipsStat$ChangePreview mobileOfficialAppsClipsStat$ChangePreview = new MobileOfficialAppsClipsStat$ChangePreview(previewType);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.CHANGE_PREVIEW;
                    int i3 = context2 != null ? context2.b : -1;
                    if (context2 == null || (creationEntryPoint = context2.a) == null) {
                        creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
                    }
                    new kze(c, new MobileOfficialAppsClipsStat$TypeClipPublishItem(eventType, new MobileOfficialAppsClipsStat$ClipsCreateContext(i3, creationEntryPoint), null, null, mobileOfficialAppsClipsStat$ChangePreview, null, null, null, null, null, null, 2028, null)).q();
                }
                clipsChoosePreviewActivity.finish();
                return s3q0.a;
            case 6:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ClipsControlsView clipsControlsView = (ClipsControlsView) this.receiver;
                int i4 = ClipsControlsView.P;
                gm9 gm9Var = clipsControlsView.u;
                if (gm9Var != null) {
                    gm9Var.getState().m(booleanValue2);
                    gm9Var.d();
                }
                return s3q0.a;
            case 7:
                ((j4e) this.receiver).getClass();
                int i5 = j4e.a.$EnumSwitchMapping$0[((ClipsFavoritesFolderRenamingState) obj).c.ordinal()];
                if (i5 == 1) {
                    return null;
                }
                if (i5 == 2) {
                    return SpinnerState.Loading;
                }
                if (i5 == 3) {
                    return SpinnerState.Done;
                }
                if (i5 == 4) {
                    return SpinnerState.Error;
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                bre breVar = (bre) this.receiver;
                breVar.getClass();
                xn50.a.c(breVar, (zqe) obj);
                return s3q0.a;
            case 9:
                ((iqf) this.receiver).T((ttf) obj);
                return s3q0.a;
            case 10:
                int intValue = ((Number) obj).intValue();
                lwh lwhVar = ((u0g) this.receiver).c;
                if (lwhVar != null) {
                    lwhVar.invoke(Integer.valueOf(intValue));
                }
                return s3q0.a;
            case 11:
                GamesCatalogDetailFragment gamesCatalogDetailFragment = (GamesCatalogDetailFragment) this.receiver;
                gamesCatalogDetailFragment.getClass();
                xn50.a.c(gamesCatalogDetailFragment, (mat) obj);
                return s3q0.a;
            case 12:
                NotificationCSatRate notificationCSatRate = (NotificationCSatRate) obj;
                li70 li70Var = (li70) this.receiver;
                li70.b bVar2 = li70.R;
                li70Var.b(true);
                c970 c970Var = li70Var.N;
                if (c970Var != null) {
                    li70Var.getContext();
                    c970Var.f(notificationCSatRate);
                }
                i0q0.d(700L, new gv2(li70Var, 11));
                return s3q0.a;
            case 13:
                ((v4a0) this.receiver).de((Throwable) obj);
                return s3q0.a;
            case 14:
                cjk0 cjk0Var = (cjk0) obj;
                VideoView videoView = ((eka0) this.receiver).n;
                CallMemberId callMemberId = cjk0Var.a;
                boolean z2 = cjk0Var.b;
                ParticipantId H = callMemberId != null ? mnh0.H(callMemberId) : null;
                if (H == null || !(z2 || cjk0Var.d)) {
                    bwt0.p0(videoView, false);
                    videoView.b();
                } else {
                    bwt0.p0(videoView, true);
                    com.vk.voip.ui.c.b.getClass();
                    videoView.a(com.vk.voip.ui.c.r.getVideoController(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(H).setType(z2 ? VideoTrackType.VIDEO : VideoTrackType.ANIMOJI).build());
                }
                return s3q0.a;
            case 15:
                long longValue = ((Number) obj).longValue();
                d3b0 v0 = ((m4b0) this.receiver).b.v0();
                if (v0 != null && (a = v0.a()) != null) {
                    a.seekTo(longValue);
                }
                return s3q0.a;
            case 16:
                Boolean bool = (Boolean) obj;
                boolean booleanValue3 = bool.booleanValue();
                qrh0 qrh0Var = (qrh0) this.receiver;
                e15 e15Var = qrh0Var.d;
                if (e15Var != null) {
                    e15Var.invoke(bool);
                }
                View view2 = qrh0Var.f;
                if (view2 != null) {
                    bwt0.p0(view2, booleanValue3);
                }
                return s3q0.a;
            case 17:
                ((dqn0) this.receiver).getClass();
                cvk.u(R.string.picker_loading_error, false);
                return s3q0.a;
            default:
                l5v0.a((l5v0) this.receiver, (Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(Object obj, int i) {
        super(1, obj, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d.class, "clickAttachListener", "clickAttachListener(Lcom/vk/mediastore/system/MediaStoreEntry;)V", 0);
                break;
            case 4:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
                super(1, obj, ClipsControlsView.class, "syncTipsWithUI", "syncTipsWithUI(Z)V", 0);
                break;
            case 7:
                super(1, obj, j4e.class, "mapScreenSpinnerState", "mapScreenSpinnerState(Lcom/vk/clips/favorites/impl/ui/folders/renaming/ClipsFavoritesFolderRenamingState;)Lcom/vk/core/compose/component/defaults/SpinnerState;", 0);
                break;
            case 17:
                super(1, obj, dqn0.class, "onResultError", "onResultError(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
