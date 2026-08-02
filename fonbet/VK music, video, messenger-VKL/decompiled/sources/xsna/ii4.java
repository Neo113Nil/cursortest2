package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonHeaderVh;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import ru.ok.android.webrtc.RTCStatsObserver;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.dto.MusicTrackInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ii4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ii4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebImageSize f;
        switch (this.b) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) this.c;
                AudioBookPersonHeaderVh audioBookPersonHeaderVh = (AudioBookPersonHeaderVh) this.d;
                Context context = appBarLayout.getContext();
                Activity h = context != null ? e3m.h(context) : null;
                if (h != null) {
                    mnh0.w(h.getWindow().getDecorView(), !audioBookPersonHeaderVh.f);
                    break;
                }
                break;
            case 1:
                ((RecyclerView) this.c).setLayoutParams((ViewGroup.LayoutParams) this.d);
                break;
            case 2:
                xk9 xk9Var = (xk9) this.c;
                List list = (List) this.d;
                com.vk.media.ok.b bVar = xk9Var.B;
                if (bVar != null) {
                    List<cc50> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (cc50 cc50Var : list2) {
                        arrayList.add(new MusicTrackInfo(cc50Var.a, cc50Var.b, cc50Var.c, cc50Var.d));
                    }
                    EffectHolder effectHolder = bVar.H;
                    if (effectHolder.getEffectRegistry().inputMusicTracksMetaRequired(bVar.p())) {
                        effectHolder.setTracksInfo(arrayList);
                        break;
                    }
                }
                break;
            case 3:
                String str = (String) this.c;
                String str2 = (String) this.d;
                com.vkontakte.android.data.b.h().a.getClass();
                try {
                    com.vkontakte.android.data.b.h().b.submit(new a0m(0, str, str2)).get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                }
                b.i iVar = com.vkontakte.android.data.b.h().a;
                iVar.getClass();
                com.vkontakte.android.data.b.h().b.execute(new xzl(iVar));
                break;
            case 4:
                en50 en50Var = ((ul50) this.c).f;
                if (en50Var != null) {
                    en50Var.clear();
                    break;
                }
                break;
            case 5:
                StatListenerManager.b((StatListenerManager) this.c, (RTCStatsObserver) this.d);
                break;
            case 6:
                owl0 owl0Var = (owl0) this.c;
                Runnable runnable = (Runnable) this.d;
                if (owl0Var.c == null) {
                    owl0Var.b.add(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                VkImage vkImage = (VkImage) this.c;
                WebImage webImage = (WebImage) this.d;
                int measuredWidth = vkImage.getMeasuredWidth();
                if (measuredWidth > 0) {
                    vkImage.o0((webImage == null || (f = webImage.f(measuredWidth)) == null) ? null : f.b, null);
                    break;
                }
                break;
        }
    }
}
