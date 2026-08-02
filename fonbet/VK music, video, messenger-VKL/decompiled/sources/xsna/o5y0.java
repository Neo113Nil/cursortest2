package xsna;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.vk.libvideo.embedded_players.youtube.PlayerConstants$PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: YouTubePlayerImpl.kt */
/* loaded from: classes14.dex */
public final class o5y0 implements s5y0 {
    public final WebView a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final LinkedHashSet c = new LinkedHashSet();

    public o5y0(WebView webView) {
        this.a = webView;
    }

    @Override // xsna.s5y0
    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((s5y0) it.next()).a();
        }
    }

    @Override // xsna.s5y0
    public final void b(PlayerConstants$PlayerState playerConstants$PlayerState) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((s5y0) it.next()).b(playerConstants$PlayerState);
        }
    }

    public final void c(WebView webView, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj instanceof String ? ho8.a(new StringBuilder("'"), (String) obj, '\'') : obj.toString());
        }
        this.b.post(new dzb0(webView, str, arrayList, 1));
    }
}
