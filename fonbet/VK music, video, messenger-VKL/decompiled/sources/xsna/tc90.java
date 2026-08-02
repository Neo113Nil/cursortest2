package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.attachpicker.screen.r;
import com.vk.media.player.video.view.SystemVideoView;

/* compiled from: PagerVideoPlayer.java */
/* loaded from: classes15.dex */
public final class tc90 implements View.OnClickListener {
    public final /* synthetic */ com.vk.attachpicker.widget.c b;

    public tc90(com.vk.attachpicker.widget.c cVar) {
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.vk.attachpicker.widget.c cVar = this.b;
        r.a aVar = cVar.h;
        if (cVar.g == null) {
            cVar.g = new SystemVideoView(cVar.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            cVar.f.addView(cVar.g, layoutParams);
            cVar.g.setVideoPath(cVar.c);
            cVar.g.setOnPreparedListener(new com.vk.attachpicker.widget.b(cVar));
            cVar.g.setOnCompletionListener(new uc90(cVar));
        }
        SystemVideoView systemVideoView = cVar.g;
        if (systemVideoView == null) {
            return;
        }
        if (systemVideoView.b()) {
            cVar.g.d();
            cVar.e.setVisibility(0);
            p870.f().e(5, Integer.valueOf(cVar.d));
            if (aVar != null) {
                com.vk.attachpicker.screen.r.this.d.l(false);
                return;
            }
            return;
        }
        cVar.g.i();
        cVar.e.setVisibility(4);
        cVar.b();
        if (aVar != null) {
            com.vk.attachpicker.screen.r.this.d.l(true);
        }
    }
}
