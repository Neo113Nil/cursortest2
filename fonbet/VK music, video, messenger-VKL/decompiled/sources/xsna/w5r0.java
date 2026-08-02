package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.uxpolls.presentation.js.model.UxPollsTheme;
import com.vk.uxpolls.presentation.view.PollsWebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: UxPollsViewPool.kt */
/* loaded from: classes4.dex */
public final class w5r0 {

    @SuppressLint({"UseSparseArrays"})
    public final HashMap<String, PollsWebView> a = new HashMap<>(2);
    public final HashSet<String> b = new HashSet<>();

    public final void a() {
        this.b.clear();
        this.a.clear();
    }

    public final PollsWebView b(Context context, String str) {
        HashMap<String, PollsWebView> hashMap = this.a;
        PollsWebView pollsWebView = hashMap.get(str);
        if (pollsWebView == null) {
            PollsWebView pollsWebView2 = new PollsWebView(context, null, 0, 14, 0);
            pollsWebView2.l(Collections.singletonList(str));
            pollsWebView2.f(dhr0.M() ? UxPollsTheme.DARK : UxPollsTheme.LIGHT);
            hashMap.put(str, pollsWebView2);
            pollsWebView = pollsWebView2;
        }
        return pollsWebView;
    }

    public final void c() {
        HashSet<String> hashSet = this.b;
        if (hashSet.isEmpty()) {
            return;
        }
        Iterator<T> it = hashSet.iterator();
        while (it.hasNext()) {
            PollsWebView pollsWebView = this.a.get((String) it.next());
            if (pollsWebView != null && !pollsWebView.h()) {
                pollsWebView.i();
            }
        }
        hashSet.clear();
    }
}
