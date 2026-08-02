package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Size;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.g;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderVh;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vkontakte.android.R;
import java.io.File;
import org.webrtc.PeerConnection;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.proto.okmp.OkmpPublisher;
import xsna.ikn0;
import xsna.pzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class od6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ od6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window;
        Window window2;
        File file = null;
        switch (this.b) {
            case 0:
                ((pd6) this.c).d.a(VideoFrameProcessingException.a(C.TIME_UNSET, (Exception) this.d));
                break;
            case 1:
                final DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                uek uekVar = (uek) this.d;
                String[] strArr = DebugDevSettingsFragment.t0;
                File file2 = uekVar.e;
                long g = file2 == null ? 0L : z4g.g(file2);
                if (file2 != null) {
                    file = new File(file2.getParentFile().getAbsolutePath() + '/' + file2.getName() + ".zip");
                }
                final float k = i35.k(((g + (file != null ? z4g.g(file) : 0L)) / 1024.0f) / 1024.0f, 2);
                pro0.c(new Runnable() { // from class: xsna.y3l
                    @Override // java.lang.Runnable
                    public final void run() {
                        String[] strArr2 = DebugDevSettingsFragment.t0;
                        DebugDevSettingsFragment.this.findPreference("__dbg_network_netlog_clear").I(k + " Mb");
                    }
                });
                break;
            case 2:
                AppBarLayout appBarLayout = (AppBarLayout) this.c;
                MusicPagePhoneHeaderVh musicPagePhoneHeaderVh = (MusicPagePhoneHeaderVh) this.d;
                Context context = appBarLayout.getContext();
                Activity h = context != null ? e3m.h(context) : null;
                if (h != null) {
                    mnh0.w(h.getWindow().getDecorView(), !musicPagePhoneHeaderVh.f);
                    break;
                }
                break;
            case 3:
                ((OkmpPublisher) this.c).lambda$stop$4((Runnable) this.d);
                break;
            case 4:
                ((PeerConnectionClient) this.c).b((PeerConnection.PeerConnectionState) this.d);
                break;
            case 5:
                ikn0 ikn0Var = (ikn0) this.c;
                zjn0 zjn0Var = (zjn0) this.d;
                ikn0.a aVar = ikn0Var.e;
                aVar.a();
                aVar.c = zjn0Var;
                Size size = zjn0Var.a;
                aVar.b = size;
                aVar.e = false;
                if (!aVar.b()) {
                    aVar.f.d.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    break;
                }
                break;
            case 6:
                ((View) this.c).getViewTreeObserver().removeOnDrawListener((pzp0.d) this.d);
                break;
            case 7:
                VideoCommentThreadFragment videoCommentThreadFragment = (VideoCommentThreadFragment) this.c;
                Context context2 = (Context) this.d;
                int i = VideoCommentThreadFragment.B0;
                FragmentActivity activity = videoCommentThreadFragment.getActivity();
                if (activity != null && (window2 = activity.getWindow()) != null) {
                    window2.setStatusBarColor(e3m.f(R.attr.vk_ui_background_content, context2));
                }
                FragmentActivity activity2 = videoCommentThreadFragment.getActivity();
                sp.u((activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView(), false);
                RecyclerPaginatedView recyclerPaginatedView = videoCommentThreadFragment.W;
                if (recyclerPaginatedView != null) {
                    recyclerPaginatedView.setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, context2)));
                }
                FragmentActivity activity3 = videoCommentThreadFragment.getActivity();
                dhr0.t0(activity3 != null ? activity3.getWindow() : null, e3m.f(R.attr.vk_ui_background_tertiary, context2));
                break;
            case 8:
                g.a aVar2 = (g.a) this.c;
                g8l g8lVar = (g8l) this.d;
                synchronized (g8lVar) {
                }
                androidx.media3.exoplayer.video.g gVar = aVar2.b;
                String str = y2r0.a;
                gVar.f(g8lVar);
                break;
            default:
                ((com.my.tracker.obfuscated.a1) this.c).a((String) this.d);
                break;
        }
    }
}
