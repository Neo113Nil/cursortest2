package xsna;

import android.R;
import android.content.Context;
import android.view.View;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.a;
import xsna.av20;

/* compiled from: StoryStatisticsViewersPopupMenuDelegate.kt */
/* loaded from: classes6.dex */
public final class gim0 implements av20.b<iim0> {
    public final /* synthetic */ com.vk.stories.design.view.stats.tabs.viewers.mvi.c a;
    public final /* synthetic */ StoryUserViewer b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ him0 d;

    public gim0(com.vk.stories.design.view.stats.tabs.viewers.mvi.c cVar, StoryUserViewer storyUserViewer, Context context, him0 him0Var) {
        this.a = cVar;
        this.b = storyUserViewer;
        this.c = context;
        this.d = him0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        this.a.invoke(new a.d.C1824d((iim0) obj, this.b));
        view.postDelayed(new m52(this.d, 6), this.c.getResources().getInteger(R.integer.config_shortAnimTime));
    }
}
