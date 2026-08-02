package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4267cg;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.service.AudioMsgPlayerNotificationService;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.contacts.ContactsManager;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.view.seek.VideoFastSeekView;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
import com.vk.tabbar.settings.impl.suggests.TabbarSuggestActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import one.video.player.OneVideoPlayer;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.media.PublisherImpl;
import ru.ok.segmentation_full.segmentation.SegmenterRecurrent;
import xsna.fkz0;
import xsna.u9j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class or4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ or4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OneVideoPlayer player;
        RecyclerView recyclerView;
        UserId userId;
        efc0 mo;
        switch (this.b) {
            case 0:
                AudioMsgPlayerNotificationService audioMsgPlayerNotificationService = (AudioMsgPlayerNotificationService) this.c;
                int i = AudioMsgPlayerNotificationService.k;
                nr4 nr4Var = nr4.a;
                if (nr4.d) {
                    synchronized (nr4Var) {
                        nr4.k = 0;
                        nr4.d = false;
                    }
                    audioMsgPlayerNotificationService.stopSelf();
                    return;
                }
                return;
            case 1:
                ClipsEditorVoiceOverRecordButton.Q4((ClipsEditorVoiceOverRecordButton) this.c);
                return;
            case 2:
                ClipsPersistentStore.PersistedUpload persistedUpload = (ClipsPersistentStore.PersistedUpload) this.c;
                ClipsPersistentStore clipsPersistentStore = com.vk.clips.upload.vk.impl.uploader.c.e;
                synchronized (clipsPersistentStore) {
                    clipsPersistentStore.a.remove(persistedUpload.Bb());
                    clipsPersistentStore.a();
                    s3q0 s3q0Var = s3q0.a;
                }
                return;
            case 3:
                player = com.vk.clips.editor.templates.impl.player.a.this.getPlayer();
                if (player != null) {
                    player.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                }
                return;
            case 4:
                try {
                    int i2 = u9j.a.$EnumSwitchMapping$0[((ContactsManager.b) ((Future) this.c).get()).a.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        u9j.a(new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.EventType.MODAL_SYNC_CONTACTS_IMPORT_CONTACTS_SUCCESS, null));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    L.j(e, "Contact sync cold start: enableSyncAndStart stat");
                    return;
                }
            case 5:
                ((androidx.media3.exoplayer.l) this.c).release();
                return;
            case 6:
                FrescoImageView frescoImageView = (FrescoImageView) this.c;
                int i3 = FrescoImageView.R;
                frescoImageView.i();
                frescoImageView.z = false;
                return;
            case 7:
                ((vsw) this.c).invoke();
                return;
            case 8:
                ((PeerConnectionClient) this.c).k();
                return;
            case 9:
                ((PublisherImpl) this.c).checkedClose();
                return;
            case 10:
                ((clh0) this.c).a().add(-1L, clh0.m);
                return;
            case 11:
                ((SegmenterRecurrent) this.c).lambda$initGPUResources$1();
                return;
            case 12:
                RecyclerPaginatedView recyclerPaginatedView = ((afi0) this.c).j;
                if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
                    return;
                }
                recyclerView.scrollToPosition(0);
                return;
            case 13:
                ((erk0) this.c).f();
                return;
            case 14:
                ((TabbarSuggestActivity) this.c).finish();
                return;
            case 15:
                ThreadStuckAnalyzer threadStuckAnalyzer = (ThreadStuckAnalyzer) this.c;
                threadStuckAnalyzer.h = true;
                threadStuckAnalyzer.i = false;
                return;
            case 16:
                VideoDialog videoDialog = (VideoDialog) this.c;
                int i4 = VideoDialog.P0;
                videoDialog.zo(true);
                videoDialog.b(false);
                return;
            case 17:
                VideoFastSeekView videoFastSeekView = (VideoFastSeekView) this.c;
                int i5 = VideoFastSeekView.C;
                videoFastSeekView.hide();
                return;
            case 18:
                VkPhotoPickerFragment vkPhotoPickerFragment = (VkPhotoPickerFragment) this.c;
                mha0 mha0Var = vkPhotoPickerFragment.m0;
                if (mha0Var == null || (userId = mha0Var.g) == null || (mo = vkPhotoPickerFragment.mo()) == null) {
                    return;
                }
                mo.C(new PostingAction.Navigation.OpenInCurrentStep(new PostingStepScreen.VkPhotoAlbumsList(userId)));
                return;
            case 19:
                try {
                    SQLiteDatabase writableDatabase = ((qlv0) this.c).getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        writableDatabase.execSQL("\n                        DELETE\n                        FROM vk_stat_events\n                        WHERE sentStatus='SENT'\n                    ");
                        s3q0 s3q0Var2 = s3q0.a;
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        return;
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                } catch (Exception e2) {
                    L.g("VkDBStorage", e2);
                    return;
                }
            case 20:
                C4267cg.b.a((C4267cg.b) this.c);
                return;
            default:
                fkz0.c cVar = (fkz0.c) this.c;
                if (!cVar.e) {
                    cVar.c.h(cVar.d);
                    return;
                }
                int i6 = 0;
                for (WeakReference weakReference : cVar.b.keySet()) {
                    if (weakReference != null && weakReference.get() != null) {
                        View view = (View) weakReference.get();
                        Rect rect = new Rect();
                        boolean c = j8z0.c(view);
                        view.getGlobalVisibleRect(rect);
                        i6 += c ? 0 : rect.width() * rect.height();
                    }
                }
                cVar.f.put(Integer.valueOf(i6), Long.valueOf(SystemClock.uptimeMillis()));
                gu8.c("ViewSizeTracker", "View Sizes Tick " + cVar.a.getId());
                if (b920.b(i6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 1) {
                    cVar.b();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ or4(Future future, t9j t9jVar) {
        this.b = 4;
        this.c = future;
    }
}
