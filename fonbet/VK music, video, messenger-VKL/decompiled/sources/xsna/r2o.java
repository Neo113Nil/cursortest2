package xsna;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.material.chip.ChipGroup;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;

/* compiled from: DonutSettingsBottomSheet.kt */
/* loaded from: classes4.dex */
public final class r2o extends dw20.b {
    public final Context e;
    public final Object f;
    public final Object g;
    public ChipGroup h;
    public TextView i;
    public View j;
    public dw20 k;

    public r2o(Context context) {
        super(context, tzp0.a(null, 3));
        this.e = context;
        dgm dgmVar = new dgm(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, dgmVar);
        this.g = msy.a(lazyThreadSafetyMode, new cfl(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void S0(DonutSettingsDialogConfig.Mode mode) {
        TextView textView = this.i;
        if (textView != null) {
            bwt0.p0(textView, mode == DonutSettingsDialogConfig.Mode.Dones);
        }
        View view = this.j;
        if (view != null) {
            bwt0.p0(view, mode == DonutSettingsDialogConfig.Mode.Dones);
        }
        ChipGroup chipGroup = this.h;
        if (chipGroup != null) {
            bwt0.p0(chipGroup, mode == DonutSettingsDialogConfig.Mode.Dones);
        }
        bwt0.p0((CheckBox) ((View) this.g.getValue()).findViewById(R.id.posting_donut_item_checkbox), mode == DonutSettingsDialogConfig.Mode.Dones);
        bwt0.p0((CheckBox) ((View) this.f.getValue()).findViewById(R.id.posting_donut_item_checkbox), mode == DonutSettingsDialogConfig.Mode.All);
    }
}
