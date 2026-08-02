package xsna;

import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zlr implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zlr(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                ((FirstPinnedTabLayoutVh) obj2).d((VkOnboardingHighlighter) obj, i2);
                break;
            default:
                jkv jkvVar = (jkv) obj;
                Reef m = ((hwl0) obj2).m();
                if (m != null) {
                    m.a(new ReefEvent.i(ine0.r(jkvVar, i2)));
                    break;
                }
                break;
        }
    }
}
