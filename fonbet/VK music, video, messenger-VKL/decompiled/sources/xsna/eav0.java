package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: VkOrderConfirmSheetDialog.kt */
/* loaded from: classes6.dex */
public final class eav0 {
    public final Context a;
    public final b b;
    public dw20 c;

    /* compiled from: VkOrderConfirmSheetDialog.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AutoBuyInfo(isCheckBoxVisible=");
            sb.append(this.a);
            sb.append(", isChecked=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VkOrderConfirmSheetDialog.kt */
    public interface b {
        void a(Boolean bool);

        void onDismiss();
    }

    /* compiled from: VkOrderConfirmSheetDialog.kt */
    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final a d;

        public c(String str, String str2, String str3, a aVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.d;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "OrderParams(title=" + this.a + ", description=" + this.b + ", imageUrl=" + this.c + ", autoBuy=" + this.d + ')';
        }
    }

    public eav0(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }

    public final void a(c cVar) {
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_order_box_confirm_dialog, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.mini_app_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.order_description);
        TextView textView2 = (TextView) inflate.findViewById(R.id.your_balance);
        Button button = (Button) inflate.findViewById(R.id.dismiss_button);
        Button button2 = (Button) inflate.findViewById(R.id.buy_button);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) inflate.findViewById(R.id.auto_buy_checkbox);
        View findViewById = inflate.findViewById(R.id.description_container);
        View findViewById2 = inflate.findViewById(R.id.auto_buy_check_container);
        String str = cVar.c;
        a aVar = cVar.d;
        if (aVar == null || !aVar.a) {
            int f = e3m.f(R.attr.vk_ui_background_modal, context);
            findViewById.setBackgroundColor(f);
            findViewById.setBackgroundTintList(ColorStateList.valueOf(f));
            f4m.j(findViewById2);
        } else {
            appCompatCheckBox.setChecked(aVar.b);
            findViewById2.setOnClickListener(new pi6(appCompatCheckBox, 8));
        }
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(context);
        if (str != null && !drm0.N(str)) {
            frameLayout.addView(((com.vk.core.ui.image.c) create).getView());
            create.f(str, new VKImageController.b(14.0f, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65534));
        }
        textView.setText(cVar.a);
        textView2.setText(cVar.b);
        button.setOnClickListener(new zh0(this, 12));
        button2.setOnClickListener(new dav0(aVar, this, appCompatCheckBox, 0));
        frameLayout.setVisibility((str == null || drm0.N(str)) ? 8 : 0);
        this.c = new dw20.b(context, null).D0(inflate, false).P0().X(new mlf0(this, 24)).I0("");
    }
}
