package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.chip.ChipGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vkontakte.android.R;
import xsna.l310;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q210 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q210(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                wk50.a aVar = (wk50.a) this.c;
                x410 x410Var = (x410) this.d;
                l310.q.k.b bVar = (l310.q.k.b) this.e;
                r210.f(aVar, x410Var, bVar.c, bVar.b, new j60(28));
                break;
            case 1:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.e;
                wh50Var.setValue(this.d);
                wh50Var2.setValue(Boolean.FALSE);
                break;
            case 2:
                ((izs) this.c).invoke(new a.c((qg80) this.d, ((mc90) this.e).r(), true));
                break;
            default:
                Context context = (Context) this.c;
                DonutSettingsDialogConfig donutSettingsDialogConfig = (DonutSettingsDialogConfig) this.d;
                dmc0 dmc0Var = (dmc0) this.e;
                r2o r2oVar = new r2o(context);
                emc0 emc0Var = new emc0(dmc0Var);
                Context context2 = r2oVar.e;
                View inflate = LayoutInflater.from(context2).inflate(R.layout.view_posting_donut, (ViewGroup) null, false);
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate.findViewById(R.id.posting_donut_privacy_group);
                ?? r8 = r2oVar.f;
                linearLayoutCompat.addView((View) r8.getValue());
                ?? r9 = r2oVar.g;
                linearLayoutCompat.addView((View) r9.getValue());
                if (donutSettingsDialogConfig.d) {
                    bwt0.i0((View) r9.getValue(), new jp5(9, emc0Var, r2oVar));
                    bwt0.i0((View) r8.getValue(), new b1a(15, emc0Var, r2oVar));
                }
                ChipGroup chipGroup = (ChipGroup) inflate.findViewById(R.id.posting_donut_duration_chips);
                for (DonutPostingSettings.Duration duration : donutSettingsDialogConfig.c) {
                    Integer num = donutSettingsDialogConfig.b;
                    boolean z = num != null && num.intValue() == duration.b;
                    yd6 yd6Var = new yd6(donutSettingsDialogConfig, r2oVar, emc0Var, 1);
                    TextView textView = (TextView) LayoutInflater.from(context2).inflate(R.layout.view_donut_duration_item, (ViewGroup) null, false);
                    textView.setId(duration.b);
                    textView.setText(duration.c);
                    bwt0.i0(textView, new d50(12, yd6Var, duration));
                    textView.setElevation(cn70.a() * (dhr0.M() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 4.0f));
                    textView.setOutlineSpotShadowColor(textView.getContext().getColor(R.color.vk_black_alpha35));
                    int i = z ? R.drawable.bg_donut_duration_item_selected : R.drawable.bg_donut_duration_item;
                    int i2 = z ? R.attr.vk_ui_text_contrast_themed : R.attr.vk_ui_text_primary;
                    textView.setBackground(textView.getContext().getDrawable(i));
                    textView.setTextColor(krv0.l(i2));
                    chipGroup.addView(textView);
                }
                r2oVar.h = chipGroup;
                r2oVar.i = (TextView) inflate.findViewById(R.id.posting_donut_duration_description);
                r2oVar.j = inflate.findViewById(R.id.posting_donut_duration_separator);
                r2oVar.S0(donutSettingsDialogConfig.a);
                inflate.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(0, 1073741823)), 0), tr.a(0, 1073741823, 0, 0));
                r2oVar.v0(R.string.newsfeed_settings_donut_title);
                r2oVar.D0(inflate, false);
                r2oVar.c(new cpo(false, 0, 3));
                r2oVar.k = r2oVar.I0(null);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q210(r210 r210Var, wk50.a aVar, x410 x410Var, l310.q.k.b bVar) {
        this.b = 0;
        this.c = aVar;
        this.d = x410Var;
        this.e = bVar;
    }
}
