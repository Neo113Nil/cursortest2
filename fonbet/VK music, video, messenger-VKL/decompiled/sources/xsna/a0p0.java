package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vkontakte.android.R;

/* compiled from: TitlesController.kt */
/* loaded from: classes15.dex */
public final class a0p0 {
    public final String a;
    public final String b;
    public final l5 c;
    public final ImageView d;
    public final VkSpinner e;
    public final FrameLayout f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final Context k;
    public final Resources l;
    public final bpn0 m;
    public final int n;

    public a0p0(View view, String str, String str2, CheckPresenterInfo checkPresenterInfo, boolean z, l5 l5Var) {
        this.a = str;
        this.b = str2;
        this.c = l5Var;
        this.d = (ImageView) view.findViewById(R.id.icon);
        this.e = (VkSpinner) view.findViewById(R.id.messenger_icon_loader);
        this.f = (FrameLayout) view.findViewById(R.id.icon_container);
        this.g = (TextView) view.findViewById(R.id.title);
        this.h = (TextView) view.findViewById(R.id.first_subtitle);
        this.i = (TextView) view.findViewById(R.id.second_subtitle);
        this.j = (TextView) view.findViewById(R.id.code_edit_text);
        Context context = view.getContext();
        this.k = context;
        this.l = context.getResources();
        this.m = new bpn0(new fd90(11));
        boolean z2 = checkPresenterInfo instanceof CheckPresenterInfo.SignUp;
        int i = R.string.vk_auth_confirm_enter;
        if (z2 && z) {
            i = R.string.vk_auth_confirm_number;
        }
        this.n = i;
    }

    public final pou0 a() {
        return (pou0) this.m.getValue();
    }

    public final void b() {
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
    }
}
