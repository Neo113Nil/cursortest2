package xsna;

import android.content.SharedPreferences;
import android.view.View;
import com.ironsource.Wd;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.writebar.WriteBar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import ru.ok.call_effects.internal.CallEffectsRenderer;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class w29 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w29(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                CallEffectsRenderer.m392disableBeautyFilter$lambda3((CallEffectsRenderer) this.c);
                return;
            case 1:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) this.c;
                ClipsDraftPersistentStore.b.getClass();
                ClipsDraftPersistentStore.f(clipsDraftVk, true);
                return;
            case 2:
                ((u7v0) this.c).invoke();
                return;
            case 3:
                ((nqj) this.c).a(false);
                return;
            case 4:
                ((l1t) this.c).a.b();
                return;
            case 5:
                ((h1u) this.c).n();
                return;
            case 6:
                ((n3w) this.c).o.m("shutdownServices");
                return;
            case 7:
                sf20 sf20Var = (sf20) this.c;
                sf20Var.s.removeCallbacksAndMessages(sf20.y);
                sf20Var.g.d();
                return;
            case 8:
                raj0 raj0Var = (raj0) this.c;
                synchronized (raj0Var.d) {
                    SharedPreferences.Editor edit = raj0Var.a.edit();
                    String str = raj0Var.b;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = raj0Var.d.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(raj0Var.c);
                    }
                    edit.putString(str, sb.toString()).commit();
                }
                return;
            case 9:
                StoryGalleryActivity storyGalleryActivity = (StoryGalleryActivity) this.c;
                WeakReference<View> weakReference = StoryGalleryActivity.F;
                storyGalleryActivity.V1();
                return;
            case 10:
                ((skm0.a) this.c).k();
                return;
            case 11:
                m5p0 m5p0Var = (m5p0) this.c;
                m5p0Var.a.b.removeView(m5p0Var.c);
                m5p0Var.c = null;
                m5p0Var.d = null;
                return;
            case 12:
                yws0 yws0Var = (yws0) this.c;
                int i = yws0Var.d + 50;
                yws0Var.d = i;
                yws0Var.b.invoke(Integer.valueOf(i), Integer.valueOf(yws0Var.a));
                yws0Var.a();
                return;
            case 13:
                ((vtt0) this.c).e(false);
                return;
            case 14:
                ((e07) this.c).invoke();
                return;
            case 15:
                Wd.b((Wd) this.c);
                return;
            default:
                WriteBar.k((WriteBar) this.c);
                return;
        }
    }
}
