package xsna;

import android.app.Activity;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ih40(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((vh40) this.c).i((Activity) this.d, (PodcastInfo) this.e, (MusicTrack) this.f);
                break;
            case 1:
                a9o0 a9o0Var = (a9o0) this.c;
                View view = (View) this.d;
                y8o0 y8o0Var = (y8o0) this.e;
                List list = (List) this.f;
                xwt0.a(iah0.f().widthPixels, (int) (iah0.f().widthPixels / 0.5625f), (ViewGroup) a9o0Var.a);
                y8o0Var.getClass();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f = measuredHeight;
                float f2 = measuredWidth;
                float f3 = (f * 0.5625f) / f2;
                float f4 = (f2 / 0.5625f) / f;
                Size size = f4 < f3 ? new Size(measuredWidth, (int) (f * f4)) : new Size((int) (f2 * f3), measuredHeight);
                xwt0.a(size.getWidth(), size.getHeight(), view);
                view.addOnLayoutChangeListener(new mwt0(view, new z8o0(size, a9o0Var, view, y8o0Var, list, 0)));
                break;
            default:
                VideoPlaylistBottomSheetRedesign videoPlaylistBottomSheetRedesign = (VideoPlaylistBottomSheetRedesign) this.c;
                wh50 wh50Var = (wh50) this.d;
                ViewGroup viewGroup = (ViewGroup) this.e;
                ComposeView composeView = (ComposeView) this.f;
                tzp0.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.ALBUM, Long.valueOf(r0.b), Long.valueOf(videoPlaylistBottomSheetRedesign.a.a.c.b), null, null, null, 56, null), 2).c();
                wh50Var.setValue(Boolean.FALSE);
                viewGroup.removeView(composeView);
                break;
        }
        return s3q0.a;
    }
}
