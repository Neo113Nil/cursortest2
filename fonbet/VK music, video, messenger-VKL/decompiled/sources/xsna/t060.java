package xsna;

import com.vk.dto.common.DownloadingState;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: Recomposer.kt */
/* loaded from: classes11.dex */
public final class t060 implements gc40 {
    public final Object b;
    public final Object c;

    public /* synthetic */ t060(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.gc40
    public List a() {
        DownloadingState downloadingState = (DownloadingState) this.c;
        if (downloadingState instanceof DownloadingState.Downloading) {
            return Collections.singletonList(new ec40(R.id.music_action_cancel_download, this.b, R.string.music_action_cancel_download, R.string.music_talkback_cancel_download, 0, 0, 0, 1008));
        }
        if (!(downloadingState instanceof DownloadingState.PendingDownload) && !(downloadingState instanceof DownloadingState.PartlyDownloaded)) {
            return Collections.singletonList(new ec40(R.id.music_action_remove_from_storage, this.b, R.string.music_action_remove_from_storage_description, R.string.music_talkback_remove_from_storage, R.drawable.vk_icon_download_cancel_outline_28, R.attr.vk_ui_icon_negative, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
        }
        Object obj = this.b;
        return e43.l(new ec40(R.id.music_action_continue_downloading, obj, R.string.music_action_download_remaining_tracks, R.string.music_talkback_download_remaining_tracks, R.drawable.vk_icon_download_outline_28, 0, 0, 992), new ec40(R.id.music_action_remove_from_storage, obj, R.string.music_action_remove_from_storage_description, R.string.music_talkback_remove_from_storage, R.drawable.vk_icon_download_cancel_outline_28, R.attr.vk_ui_icon_negative, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(ic30 ic30Var) {
        ph50 ph50Var = (ph50) this.b;
        V d = ((ph50) this.c).d(ic30Var);
        if (d != 0) {
            if (!(d instanceof fh50)) {
                s640.d(ph50Var, (fc30) d, new bzw(ic30Var, 11));
                return;
            }
            rp70 rp70Var = (rp70) d;
            Object[] objArr = rp70Var.a;
            int i = rp70Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                s640.d(ph50Var, (fc30) objArr[i2], new bzw(ic30Var, 11));
            }
        }
    }

    @Override // xsna.gc40
    public EmptyList c() {
        return EmptyList.b;
    }

    public t060() {
        this.b = s640.b();
        this.c = s640.b();
    }
}
