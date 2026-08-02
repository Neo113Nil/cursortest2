package xsna;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vk.dto.newsfeed.entries.Html5Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Html5ViewPool.kt */
/* loaded from: classes4.dex */
public final class jhv {

    @SuppressLint({"UseSparseArrays"})
    public final HashMap<String, ihv> a = new HashMap<>();
    public final HashSet<Html5Entry> b = new HashSet<>();

    static {
        new bpn0(new com.vk.movika.sdk.base.ui.o0(20));
    }

    public final void a(Html5Entry html5Entry) {
        this.b.add(html5Entry);
    }

    public final void b() {
        HashSet<Html5Entry> hashSet = this.b;
        if (hashSet.isEmpty()) {
            return;
        }
        Iterator<Html5Entry> it = hashSet.iterator();
        while (it.hasNext()) {
            Html5Entry next = it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(next.i);
            sb.append('_');
            sb.append(next.j);
            ihv ihvVar = this.a.get(sb.toString());
            if (ihvVar != null) {
                ihvVar.e(next);
            }
        }
        hashSet.clear();
    }

    public final void c() {
        this.b.clear();
        HashMap<String, ihv> hashMap = this.a;
        Iterator<T> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ihv ihvVar = (ihv) ((Map.Entry) it.next()).getValue();
            khv khvVar = ihvVar.g;
            if (khvVar != null) {
                try {
                    WebSettings settings = khvVar.getSettings();
                    if (settings != null) {
                        settings.setJavaScriptEnabled(false);
                    }
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
            }
            if (khvVar != null) {
                khvVar.stopLoading();
                khvVar.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                khvVar.loadDataWithBaseURL(null, "", "text/html", "uft-8", null);
                khvVar.clearHistory();
            }
            ViewParent parent = khvVar != null ? khvVar.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(ihvVar);
            }
            if (khvVar != null) {
                khvVar.removeAllViews();
            }
            if (khvVar != null) {
                khvVar.destroy();
            }
        }
        hashMap.clear();
    }
}
