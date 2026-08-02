package defpackage;

import android.os.Handler;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final /* synthetic */ class pkv0 implements Runnable {
    public final /* synthetic */ sls a;
    public final /* synthetic */ eh2 b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    public /* synthetic */ pkv0(sls slsVar, eh2 eh2Var, Handler handler, String str, String str2, int i) {
        this.a = slsVar;
        this.b = eh2Var;
        this.c = handler;
        this.w = str;
        this.x = str2;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = (View) this.a.invoke();
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(lfh0.requirements_recycler_view);
        boolean z = findViewById instanceof RecyclerView;
        eh2 eh2Var = this.b;
        Handler handler = this.c;
        String str = this.w;
        String str2 = this.x;
        int i = this.y;
        if (z) {
            View findViewById2 = view.findViewById(xfh0.tariff_card_scroll_view);
            if (findViewById2 != null) {
                OneShotPreDrawListener.add(findViewById2, new skv0(findViewById2, findViewById2, eh2Var, handler, (RecyclerView) findViewById, str, str2, i));
                return;
            }
            return;
        }
        View findViewById3 = view.findViewById(xfh0.tariff_card_content);
        RecyclerView recyclerView = findViewById3 instanceof RecyclerView ? (RecyclerView) findViewById3 : null;
        if (recyclerView != null) {
            ukv0.b(eh2Var, handler, recyclerView, str, str2, i);
        }
    }
}
