package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ironsource.C4382j6;
import com.vk.attachpicker.screen.m;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistHeaderVh;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.navigation.SwipableTabsView;
import com.vkontakte.android.ChangePasswordActivity;
import java.io.File;
import java.util.Iterator;
import ru.ok.face.morphing.FaceMorphingProcessor;
import ru.ok.media.StreamingLaunchScheduler;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class z27 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z27(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Object obj = ((a37) this.c).o;
                if (obj == null) {
                    obj = null;
                }
                ((x27) obj).F();
                break;
            case 1:
                ChangePasswordActivity changePasswordActivity = ((msa) this.c).d;
                changePasswordActivity.setResult(-1);
                changePasswordActivity.finish();
                break;
            case 2:
                ((fum) this.c).T();
                break;
            case 3:
                ((FaceMorphingProcessor) this.c).lambda$initGPUResources$5();
                break;
            case 4:
                ((Runnable) this.c).run();
                break;
            case 5:
                f8u f8uVar = (f8u) this.c;
                ((ivd0) f8uVar.q.getValue()).b(f8uVar.r.getCurrentItem());
                break;
            case 6:
                ((nlk) this.c).getClass();
                nlk.c();
                break;
            case 7:
                yv50 yv50Var = (yv50) this.c;
                if (yv50Var.b != null) {
                    yv50Var.A().setVisibility(8);
                    break;
                }
                break;
            case 8:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                com.vk.media.ok.a aVar = bVar.h;
                if (aVar != null) {
                    aVar.r(1.0f);
                }
                com.vk.media.ok.a aVar2 = bVar.h;
                if (aVar2 != null) {
                    aVar2.m();
                    break;
                }
                break;
            case 9:
                mhy.j(((hpb0) this.c).n());
                break;
            case 10:
                ((cse0) this.c).q.countDown();
                break;
            case 11:
                try {
                    ((File) this.c).delete();
                    break;
                } catch (Exception e) {
                    par0.a.getClass();
                    par0.c("Couldn't delete tmp file.", e);
                    return;
                }
            case 12:
                ((gzs) this.c).invoke();
                break;
            case 13:
                ((skm0.a) this.c).M0();
                break;
            case 14:
                ((StreamingLaunchScheduler) this.c).onRetryDelayTimeout();
                break;
            case 15:
                SwipableTabsView swipableTabsView = (SwipableTabsView) this.c;
                swipableTabsView.scrollTo(swipableTabsView.getWidth() * swipableTabsView.k, 0);
                break;
            case 16:
                com.vk.attachpicker.screen.m mVar = ((com.vk.attachpicker.screen.n) this.c).b;
                super/*xsna.em6*/.c();
                m.k kVar = mVar.i;
                if (kVar != null) {
                    kVar.b();
                    break;
                }
                break;
            case 17:
                CollapsingToolbarLayout collapsingToolbarLayout = ((VideoPlaylistHeaderVh) this.c).c;
                if (collapsingToolbarLayout == null) {
                    collapsingToolbarLayout = null;
                }
                collapsingToolbarLayout.setScrimAnimationDuration(300L);
                break;
            case 18:
                dbw0 dbw0Var = (dbw0) this.c;
                ebw0 ebw0Var = dbw0Var.e;
                View view = dbw0Var.c;
                LinearLayout linearLayout = dbw0Var.d;
                Iterator<StickerStockItem> it = ebw0Var.a.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!epx.f(it.next(), dbw0Var.e.b)) {
                        i++;
                    }
                }
                View childAt = (i < 0 || i >= linearLayout.getChildCount()) ? null : linearLayout.getChildAt(i);
                float x = childAt != null ? childAt.getX() : -1.0f;
                if (view.getTranslationX() != x) {
                    view.animate().translationX(x);
                    break;
                }
                break;
            case 19:
                ((com.vk.superapp.widget_settings.p004new.b) this.c).p();
                break;
            case 20:
                yads.f53.a((yads.g53) this.c);
                break;
            default:
                C4382j6.c((C4382j6) this.c);
                break;
        }
    }
}
