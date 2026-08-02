package xsna;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.interop.components.image.InteropPicture;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import xsna.snx;
import xsna.tlo0;

/* compiled from: MusicDownloadInProgressVh.kt */
/* loaded from: classes16.dex */
public final class vg40 extends RecyclerView.e0 {
    public final lq40 l;
    public final oc40 m;
    public final kco n;
    public final VkBanner o;
    public final View p;
    public Playlist q;
    public int r;
    public ValueAnimator s;
    public io.reactivex.rxjava3.disposables.c t;

    public vg40(View view, lq40 lq40Var, oc40 oc40Var, kco kcoVar) {
        super(view);
        this.l = lq40Var;
        this.m = oc40Var;
        this.n = kcoVar;
        this.o = (VkBanner) view.findViewById(R.id.downloads_banner);
        View findViewById = view.findViewById(R.id.loading_progress_bar);
        ProgressBar progressBar = (ProgressBar) findViewById;
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setTint(e3m.f(R.attr.vk_ui_icon_contrast, progressBar.getContext()));
        }
        this.p = findViewById;
    }

    public static boolean a6(DownloadingState downloadingState) {
        return (downloadingState instanceof DownloadingState.Downloading) && ((DownloadingState.Downloading) downloadingState).b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void V5(Playlist playlist) {
        String str;
        DownloadingState downloadingState = playlist.H;
        Thumb thumb = playlist.m;
        if (thumb != null) {
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            str = thumb.Ab(48, false);
        } else {
            str = null;
        }
        int ceil = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 48);
        snx.b cVar2 = str != null ? new snx.b.c(new vlw(str, null), null, null, 14) : new snx.b.C3683b(new gko(R.drawable.vk_icon_music_outline_20), null, 6);
        boolean f = epx.f(downloadingState, DownloadingState.PartlyDownloaded.b);
        VkBanner vkBanner = this.o;
        vkBanner.setBefore(new VkBanner.b.c(ceil, new InteropPicture(cVar2, f ? new snx.c.a(new gko(R.drawable.vk_icon_download_dashed_outline_24), new a8g(VkColorToken.IconContrast)) : ((downloadingState instanceof DownloadingState.Downloading) && a6(downloadingState)) ? new snx.c.a(new gko(R.drawable.vk_icon_spinner_24), new b8g(vkBanner.getContext().getColor(android.R.color.transparent))) : null, null, 10), com.vk.core.compose.component.semantics.b.a(null, new d37(28), 3)));
        bwt0.p0(this.p, a6(downloadingState));
        W5(playlist);
        this.q = playlist;
        DownloadingState downloadingState2 = playlist.H;
        if (downloadingState2 instanceof DownloadingState.Downloading) {
            this.r = (int) Math.abs(((DownloadingState.Downloading) downloadingState2).b * 100);
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            b6(playlist);
        }
        if (this.t == null) {
            this.t = this.m.a().b0(n8b0.class).subscribe(new cc20(new ugm(this, 26), 4));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        if (((com.vk.dto.common.DownloadingState.Downloading) r1).b == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (((com.vk.dto.common.DownloadingState.Downloading) r4).b == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W5(Playlist playlist) {
        String string;
        tlo0.a aVar = tlo0.Companion;
        DownloadingState downloadingState = playlist.H;
        boolean z = downloadingState instanceof DownloadingState.Downloading;
        int i = R.string.music_offline_download_status_downloading;
        if (!z) {
            if (!epx.f(downloadingState, DownloadingState.PendingDownload.b) && !epx.f(downloadingState, DownloadingState.NotLoaded.b)) {
                if (epx.f(downloadingState, DownloadingState.PartlyDownloaded.b)) {
                    i = R.string.music_offline_download_status_paused;
                }
            }
            i = R.string.music_offline_download_status_in_queue;
        }
        tlo0.f h = tq.h(aVar, i);
        DownloadingState downloadingState2 = playlist.H;
        boolean z2 = downloadingState2 instanceof DownloadingState.Downloading;
        int i2 = R.string.music_offline_download_playlist_type;
        VkBanner vkBanner = this.o;
        if (!z2) {
            Resources resources = vkBanner.getResources();
            if (playlist.Eb()) {
                i2 = R.string.music_offline_download_album_type;
            } else if (playlist.b == -1) {
                i2 = R.string.music_offline_download_my_tracks;
            }
            string = resources.getString(i2);
        } else if (((DownloadingState.Downloading) downloadingState2).b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Resources resources2 = vkBanner.getResources();
            if (playlist.Eb()) {
                i2 = R.string.music_offline_download_album_type;
            } else if (playlist.b == -1) {
                i2 = R.string.music_offline_download_my_tracks;
            }
            string = resources2.getString(i2);
        } else {
            string = vkBanner.getResources().getString(playlist.Eb() ? R.string.music_offline_download_album_type_with_percent : playlist.b == -1 ? R.string.music_offline_download_my_tracks_with_percent : R.string.music_offline_download_playlist_type_with_percent, Integer.valueOf(this.r));
        }
        tlo0.h hVar = new tlo0.h(string);
        DownloadingState downloadingState3 = playlist.H;
        boolean z3 = downloadingState3 instanceof DownloadingState.Downloading;
        int i3 = R.string.music_offline_stop_downloading;
        if (!z3) {
            if (!epx.f(downloadingState3, DownloadingState.PendingDownload.b) && !epx.f(downloadingState3, DownloadingState.NotLoaded.b)) {
                if (epx.f(downloadingState3, DownloadingState.PartlyDownloaded.b)) {
                    i3 = R.string.music_offline_continue_downloading;
                }
            }
            i3 = R.string.music_offline_remove_from_downloads_queue;
        }
        vkBanner.setMiddle(new VkBanner.e(h, hVar, null, new VkBanner.c(new tlo0.f(i3), new Cnew(this, 11), VkButton.Mode.Link, VkButton.Appearance.Neutral, VkButton.Size.Small, null, com.vk.core.compose.component.semantics.b.a(null, new rvq(12), 3), 480), null, com.vk.core.compose.component.semantics.b.a(null, new svz(7), 3), 52));
    }

    public final void b6(Playlist playlist) {
        DownloadingState downloadingState = playlist.H;
        DownloadingState.Downloading downloading = downloadingState instanceof DownloadingState.Downloading ? (DownloadingState.Downloading) downloadingState : null;
        Float valueOf = downloading != null ? Float.valueOf(downloading.b) : null;
        ValueAnimator duration = ValueAnimator.ofInt(this.r, (int) Math.abs((valueOf != null ? valueOf.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 100)).setDuration(1000L);
        duration.addUpdateListener(new oex(this, 1));
        duration.start();
        this.s = duration;
    }
}
