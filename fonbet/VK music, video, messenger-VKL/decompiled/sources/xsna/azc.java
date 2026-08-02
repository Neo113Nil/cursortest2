package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.view.components.text.VkText;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.concurrent.ThreadPoolExecutor;
import xsna.add;
import xsna.e3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class azc implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ azc(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                add.a aVar = (add.a) this.c;
                czc czcVar = (czc) this.d;
                View view = (View) this.e;
                String str = aVar.a;
                czcVar.getClass();
                RectF G = bwt0.G(view);
                float b = iah0.b(16.0f);
                Context context = view.getContext();
                RectF rectF = new RectF(G.left + b, G.centerY(), G.right - b, G.centerY());
                if (czcVar.c == null || czcVar.d == null) {
                    VkText vkText = new VkText(context, null, 6, 0);
                    vkText.setId(R.id.title);
                    vkText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    f4m.q(iah0.a(4), vkText);
                    vkText.setTextColor(-1);
                    com.vk.typography.b.k(vkText, FontFamily.REGULAR, Float.valueOf(14.0f), 4);
                    vkText.setGravity(17);
                    vkText.setText(str);
                    int a = iah0.a(12);
                    vkText.setPadding(a, a, a, a);
                    NavigationBarStyle navigationBarStyle = NavigationBarStyle.DARK;
                    e3m.a aVar2 = e3m.a;
                    int color = context.getColor(R.color.vk_white);
                    int color2 = context.getColor(R.color.vk_black_alpha60);
                    bzc bzcVar = new bzc(czcVar);
                    pla.e().b().getClass();
                    czcVar.c = Tooltip.l(new Tooltip(context, str, null, null, null, null, new b1y((String) null), color2, color, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 17, 0, true, navigationBarStyle, 0, true, new eb(vkText, 14), null, null, null, null, null, bzcVar, 3000L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -26438104, 15), context, rectF, false, false, false, false, 252);
                    return;
                }
                return;
            default:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.c;
                c.i iVar = (c.i) this.d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.e;
                try {
                    androidx.emoji2.text.f a2 = androidx.emoji2.text.a.a(bVar.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    f.b bVar2 = (f.b) a2.a;
                    synchronized (bVar2.d) {
                        bVar2.f = threadPoolExecutor;
                    }
                    a2.a.a(new androidx.emoji2.text.d(iVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    iVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
