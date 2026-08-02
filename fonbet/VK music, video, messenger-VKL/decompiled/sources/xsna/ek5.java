package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptySet;
import xsna.gfc0;
import xsna.uxd0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ek5 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ek5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ify.g((AutoSuggestStickersPopupWindow) this.c);
                break;
            case 1:
                i9b i9bVar = (i9b) this.c;
                h9k0 h9k0Var = i9bVar.i;
                Context context = i9bVar.f;
                h9k0Var.c(context.getString(R.string.vkim_channel_delete_success), null);
                if (!p1p0.a(com.vk.toggle.b.A.i(CoreFeatures.FIX_CLEAR_TOP_NAV))) {
                    i9bVar.t.onNext(new uxd0.b(0));
                    g2v.c().b().U(context, FolderType.CHANNELS);
                    break;
                } else {
                    g2v.c().b().H(context, FolderType.CHANNELS);
                    break;
                }
            case 2:
                psm psmVar = (psm) this.c;
                psmVar.A = null;
                psmVar.z.onNext(Boolean.TRUE);
                break;
            case 3:
                ((kr60) this.c).c(new yo60.g.c(R.string.newsfeed_doubt_category_success));
                break;
            case 4:
                hfc0 hfc0Var = (hfc0) this.c;
                ConcurrentHashMap<String, io.reactivex.rxjava3.disposables.c> concurrentHashMap = hfc0Var.b;
                ConcurrentHashMap<String, io.reactivex.rxjava3.core.q<gfc0.b>> concurrentHashMap2 = hfc0Var.a;
                Iterator<Map.Entry<String, io.reactivex.rxjava3.disposables.c>> it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().dispose();
                }
                hfc0Var.b.clear();
                Iterator<Map.Entry<String, io.reactivex.rxjava3.core.q<gfc0.b>>> it2 = concurrentHashMap2.entrySet().iterator();
                while (it2.hasNext()) {
                    vhk0.b(up2.u(Uri.parse(it2.next().getKey())));
                }
                concurrentHashMap2.clear();
                break;
            case 5:
                v2v0 v2v0Var = (v2v0) ((a3v0) this.c).a;
                if (v2v0Var != null) {
                    v2v0Var.cm();
                    break;
                }
                break;
            default:
                com.vk.voip.ui.hint.a aVar = (com.vk.voip.ui.hint.a) this.c;
                aVar.l = EmptySet.b;
                aVar.c();
                break;
        }
    }
}
