package xsna;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.webapp.fragments.VkPayFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ivs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ivs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                c.r0.C1978c c1978c = c.r0.C1978c.b;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, c1978c);
                return s3q0.a;
            case 1:
                mys0 mys0Var = (mys0) obj;
                Bitmap bitmap = mys0Var.D;
                CharSequence charSequence = mys0Var.n;
                CharSequence charSequence2 = mys0Var.p;
                Bitmap bitmap2 = mys0Var.E;
                if (bitmap == null || bitmap2 == null) {
                    if (bitmap2 != null) {
                        NotificationCompat.e eVar = new NotificationCompat.e();
                        eVar.e = IconCompat.c(bitmap2);
                        return eVar;
                    }
                    if ((charSequence2 != null ? charSequence2.length() : 0) <= 30) {
                        return null;
                    }
                    NotificationCompat.f fVar = new NotificationCompat.f();
                    fVar.b = NotificationCompat.h.d(charSequence);
                    fVar.e = NotificationCompat.h.d(charSequence2);
                    return fVar;
                }
                String str = o25.a().o().b;
                j1a0 j1a0Var = new j1a0();
                j1a0Var.a = str;
                j1a0Var.b = null;
                j1a0Var.c = null;
                j1a0Var.d = null;
                j1a0Var.e = false;
                j1a0Var.f = false;
                NotificationCompat.l lVar = new NotificationCompat.l(j1a0Var);
                IconCompat c = bitmap != null ? IconCompat.c(bitmap) : null;
                j1a0 j1a0Var2 = new j1a0();
                j1a0Var2.a = charSequence2;
                j1a0Var2.b = c;
                j1a0Var2.c = null;
                j1a0Var2.d = null;
                j1a0Var2.e = false;
                j1a0Var2.f = false;
                NotificationCompat.l.d dVar = new NotificationCompat.l.d(charSequence2, System.currentTimeMillis(), j1a0Var2);
                abq.a(dVar, mys0Var.J);
                lVar.f(dVar);
                lVar.h = charSequence;
                return lVar;
            case 2:
                return new x1n((m2c0) obj);
            case 3:
                return new p9t0(((com.vk.video.profile.presentation.c) obj).e);
            case 4:
                return VideoSkippablePartView.a((VideoSkippablePartView) obj);
            case 5:
                int i3 = VkPayFragment.g0;
                return ((VkPayFragment) obj).jo();
            case 6:
                aiv0 aiv0Var = (aiv0) obj;
                VkSearchView vkSearchView = aiv0Var.a;
                vkSearchView.requestFocus();
                vkSearchView.a5();
                aiv0Var.e = false;
                return s3q0.a;
            default:
                int i4 = WriteBar.h0;
                return (ViewGroup) ((WriteBar) obj).findViewById(R.id.writebar_text_area);
        }
    }
}
