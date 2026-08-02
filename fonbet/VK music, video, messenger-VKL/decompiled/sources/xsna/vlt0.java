package xsna;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.av20;
import xsna.dw20;

/* compiled from: VideoTrafficSavingBottomSheet.kt */
/* loaded from: classes2.dex */
public final class vlt0 extends kq6 {
    public final Activity c;
    public final d3b0 d;
    public final ebs0 e;
    public final dz20 f;
    public final boolean g;

    /* compiled from: VideoTrafficSavingBottomSheet.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final String c;
        public final boolean d;

        public a(int i, String str, String str2, boolean z) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = z;
        }
    }

    public vlt0(FragmentActivity fragmentActivity, d3b0 d3b0Var, ebs0 ebs0Var, dz20 dz20Var, boolean z) {
        this.c = fragmentActivity;
        this.d = d3b0Var;
        this.e = ebs0Var;
        this.f = dz20Var;
        this.g = z;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        av20.a aVar = new av20.a();
        Activity activity = this.c;
        dhr0.a.getClass();
        int i = dhr0.u().c;
        aVar.d(R.layout.actions_popup_double_checkable_item, LayoutInflater.from(new l7s(activity, dhr0.u().c)));
        aVar.d = new wlt0();
        aVar.c(new n0r(this, 3));
        av20 b = aVar.b();
        String string = activity.getString(R.string.video_traffic_saving_disabled);
        String string2 = activity.getString(R.string.video_traffic_saving_disabled_description);
        boolean z = this.g;
        b.setItems(e43.l(new a(R.id.video_traffic_saving_disabled, string, string2, !z), new a(R.id.video_traffic_saving_enabled, activity.getString(R.string.video_traffic_saving_enabled), activity.getString(R.string.video_traffic_saving_enabled_description), z)));
        dw20.b bVar = new dw20.b(activity, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) activity.getString(R.string.video_traffic_saving));
        spannableStringBuilder.append((CharSequence) "\n");
        FontFamily fontFamily = FontFamily.MEDIUM;
        int i2 = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 13.0f;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(13.0f);
        }
        Font.Companion.getClass();
        nik0.a(spannableStringBuilder, Font.a.a(fontFamily, f).k(activity), 0, spannableStringBuilder.length());
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder.length() - 1, 33);
        rik0.b(iah0.b(6.0f));
        return ((dw20.b) dw20.a.k(((dw20.b) dw20.a.R(bVar, spannableStringBuilder, 0, 8388627, 2)).a0(new pwh0(this, 27)).d0(new v5n0(this, 17)), b, 4)).f0(new whg0(this, 24)).I0("video_traffic_saving");
    }
}
