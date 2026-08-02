package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ogj implements Runnable {
    public final /* synthetic */ FragmentImpl b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ View d;
    public final /* synthetic */ pgj e;

    public /* synthetic */ ogj(Activity activity, View view, FragmentImpl fragmentImpl, pgj pgjVar) {
        this.b = fragmentImpl;
        this.c = activity;
        this.d = view;
        this.e = pgjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentImpl fragmentImpl = this.b;
        if (fragmentImpl == null || (fragmentImpl instanceof ies)) {
            return;
        }
        VkTooltip.a aVar = new VkTooltip.a(this.c);
        aVar.b = fragmentImpl.getString(R.string.content_info_tooltip);
        aVar.e = VkTooltip.Appearance.Inversion;
        aVar.g = false;
        aVar.f = VkTooltip.TooltipGravity.TOP;
        aVar.a(f4m.c(this.d));
        long currentTimeMillis = System.currentTimeMillis();
        this.e.a = currentTimeMillis;
        Preference.F(currentTimeMillis, "content_info_hint", "content_info_hint_show_time");
    }
}
