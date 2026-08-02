package xsna;

import android.content.Context;
import android.view.View;
import com.ironsource.sdk.controller.v;
import com.vk.core.files.a;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.articles.Article;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vk.stories.design.view.HashtagHintsView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.ProxyChangeListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class rm3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rm3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ImageSize Fb;
        Map<n2k0, CollageSlotView> slots;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                sm3 sm3Var = (sm3) this.c;
                Article article = (Article) this.d;
                VkImage vkImage = sm3Var.m;
                Photo photo = article.l;
                vkImage.o0((photo == null || (Fb = photo.Fb(vkImage.getWidth(), false)) == null) ? null : Fb.d.d, null);
                return;
            case 1:
                k3g k3gVar = (k3g) this.c;
                Map map = (Map) this.d;
                l1g l1gVar = k3gVar.u;
                if (l1gVar != null && (slots = l1gVar.getSlots()) != null) {
                    for (Map.Entry<n2k0, CollageSlotView> entry : slots.entrySet()) {
                        n2k0 key = entry.getKey();
                        CollageSlotView value = entry.getValue();
                        Boolean bool = (Boolean) map.get(key);
                        value.setLoading(bool != null ? bool.booleanValue() : false);
                    }
                }
                izs<? super Map<n2k0, Boolean>, s3q0> izsVar = k3gVar.g;
                if (izsVar != null) {
                    izsVar.invoke(map);
                    return;
                }
                return;
            case 2:
                ((a.C0764a) this.c).a((ArrayList) this.d);
                return;
            case 3:
                List<View> list = (List) this.c;
                HashtagHintsView hashtagHintsView = (HashtagHintsView) this.d;
                int i = HashtagHintsView.d;
                for (View view : list) {
                    hashtagHintsView.getClass();
                    if (view != null) {
                        view.clearAnimation();
                        view.animate().alpha(1.0f).setInterpolator(new hlq()).setDuration(200L).start();
                    }
                }
                return;
            case 4:
                gm80 gm80Var = (gm80) this.c;
                o7o o7oVar = (o7o) this.d;
                HashMap f = gm80Var.a.f();
                HashMap hashMap = f != null ? f : null;
                if (hashMap != null) {
                    return;
                }
                return;
            case 5:
                ((rxa0) this.c).b.v("actual_tracks_order", i7o0.a((List) this.d));
                return;
            case 6:
                ((ProxyChangeListener) this.c).lambda$setDelegateForTesting$0((ProxyChangeListener.Delegate) this.d);
                return;
            case 7:
                tvh0 tvh0Var = (tvh0) this.c;
                List list2 = (List) this.d;
                synchronized (tvh0Var.b) {
                    try {
                        try {
                            tvh0Var.c.clear();
                            tvh0Var.c.addAll(list2);
                            tvh0Var.d.clear();
                            Iterator it = tvh0Var.c.iterator();
                            while (it.hasNext()) {
                                wtw wtwVar = (wtw) it.next();
                                if (wtwVar != null) {
                                    tvh0Var.a(wtwVar);
                                }
                            }
                        } catch (Exception e) {
                            com.vk.metrics.eventtracking.b.a.a(e);
                            tvh0Var.d.clear();
                        }
                    } finally {
                        tvh0Var.a = null;
                    }
                }
                return;
            case 8:
                z9r0 z9r0Var = (z9r0) this.c;
                String str = (String) this.d;
                z9r0Var.onAttachedToWindow();
                z9r0Var.o0(str, null);
                return;
            case 9:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.e) this.c).b((Context) this.d);
                return;
            default:
                ((v.s) this.c).n((String) this.d);
                return;
        }
    }
}
