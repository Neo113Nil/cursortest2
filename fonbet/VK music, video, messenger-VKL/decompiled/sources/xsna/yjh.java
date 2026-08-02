package xsna;

import android.view.View;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;

/* compiled from: CommunityProfileContentPagerViewHolder.kt */
/* loaded from: classes5.dex */
public final class yjh implements View.OnAttachStateChangeListener {
    public final /* synthetic */ wjh<CommunityProfileContentItem> b;

    public yjh(wjh<CommunityProfileContentItem> wjhVar) {
        this.b = wjhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        klh klhVar = this.b.A;
        if (klhVar != null) {
            klhVar.a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        klh klhVar = this.b.A;
        if (klhVar != null) {
            klhVar.b();
        }
    }
}
