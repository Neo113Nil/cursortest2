package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import one.video.ad.ux.motion.view.OneVideoMotionHeaderView;
import xsna.cs00;
import xsna.e8x;
import xsna.v1z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class naj implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ naj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sws0 a;
        rvu rvuVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                oaj oajVar = (oaj) obj;
                t8j t8jVar = oajVar.s;
                i8j i8jVar = oajVar.l;
                if (!(t8jVar == null ? null : t8jVar).g) {
                    if (!(t8jVar == null ? null : t8jVar).f) {
                        i8jVar.c(t8jVar != null ? t8jVar : null);
                        break;
                    } else {
                        i8jVar.h(t8jVar != null ? t8jVar : null);
                        break;
                    }
                }
                break;
            case 1:
                int i2 = ImCreateChatFragment.d0;
                ((ImCreateChatFragment) obj).Mf(0, null);
                break;
            case 2:
                ((AppCompatCheckBox) obj).toggle();
                break;
            case 3:
                bt00 bt00Var = (bt00) obj;
                at00 at00Var = bt00Var.p;
                if (at00Var != null) {
                    bt00Var.l.a(new cs00.b(at00Var.b));
                    break;
                }
                break;
            case 4:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.performClick();
                    break;
                }
                break;
            case 5:
                xws0 xws0Var = ((OneVideoMotionHeaderView) obj).z;
                if (xws0Var != null && (a = xws0Var.a()) != null) {
                    rws0 rws0Var = a.a;
                    e8x.a aVar = rws0Var.b;
                    Context context = rws0Var.a;
                    n0z0 n0z0Var = (n0z0) aVar;
                    bsz0 bsz0Var = n0z0Var.d;
                    if (bsz0Var != null && (rvuVar = bsz0Var.y0) != null) {
                        q7z0 q7z0Var = (q7z0) rvuVar.b;
                        h8z0.e(q7z0Var.f, "click", 2, null);
                        n0z0Var.a.f(bsz0Var, q7z0Var.h, q7z0Var.i, q7z0Var.g, context);
                        break;
                    }
                }
                break;
            case 6:
                y4a0 y4a0Var = (y4a0) obj;
                x64 x64Var = y4a0Var.o;
                if (x64Var != null) {
                    x64Var.c(y4a0Var.d);
                    break;
                }
                break;
            case 7:
                ((nhn0) obj).kn().finish();
                break;
            case 8:
                VideoRelatedVideosFragment.fo((VideoRelatedVideosFragment) obj);
                break;
            case 9:
                VkAuthPasswordView vkAuthPasswordView = (VkAuthPasswordView) obj;
                vkAuthPasswordView.d.toggle();
                vkAuthPasswordView.a(true);
                break;
            default:
                v1z0.a aVar2 = ((ydz0) obj).v;
                if (aVar2 != null) {
                    aVar2.b();
                    break;
                }
                break;
        }
    }
}
