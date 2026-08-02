package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.ui.carousel.UserCarouselView;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ExchangeLoginFragment.kt */
/* loaded from: classes15.dex */
public class b2q extends zk6<d2q> implements e2q {
    public TextView A;
    public View B;
    public View v;
    public Group w;
    public mg6 x;
    public TextView y;
    public View z;

    public final void An() {
        dnp0 dnp0Var = new dnp0();
        dnp0Var.c(new biq());
        UserCarouselView userCarouselView = this.t;
        if (userCarouselView == null) {
            userCarouselView = null;
        }
        vlp0 excludeTarget = dnp0Var.excludeTarget((View) userCarouselView, true);
        UserCarouselView userCarouselView2 = this.t;
        zmp0.a((ViewGroup) getView(), excludeTarget.excludeChildren((View) (userCarouselView2 != null ? userCarouselView2 : null), true));
    }

    @Override // xsna.zk6, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_auth_exchange_login_fragment, viewGroup, false);
    }

    @Override // xsna.zk6, xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        mg6 mg6Var = this.x;
        if (mg6Var == null) {
            mg6Var = null;
        }
        ((oao0) mg6Var.e).b();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zk6, xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        CharSequence text;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.use_another_account);
        this.y = textView;
        jjc.g(textView, new wcj(this, 11));
        TextView textView2 = (TextView) view.findViewById(R.id.register);
        this.A = textView2;
        if (textView2 != null) {
            jjc.g(textView2, new srg(this, 13));
        }
        View findViewById = view.findViewById(R.id.settings);
        this.z = findViewById;
        findViewById.setOnClickListener(new ne3(this, 3));
        View findViewById2 = view.findViewById(R.id.settings_done);
        this.v = findViewById2;
        findViewById2.setOnClickListener(new isk(this, 2));
        this.w = (Group) view.findViewById(R.id.disabled_settings_buttons);
        TextView textView3 = (TextView) view.findViewById(R.id.exchange_login_legal_notes);
        Object obj = this.o;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        nao0 nao0Var = (nao0) obj2;
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton == null || (text = vkLoadingButton.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        this.x = new mg6(nao0Var, textView3, str, 0, null, 120);
        View findViewById3 = view.findViewById(R.id.logo);
        if (findViewById3 != null) {
            jjc.g(findViewById3, new bjk(this, 7));
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.content_info_button);
        if (viewStub != null) {
            Bn(viewStub);
        }
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        return new d2q(EmptyList.b, bundle);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.START_PROCEED_AS;
    }

    @Override // xsna.zk6, xsna.x65
    public final void wm(boolean z) {
        super.wm(z);
        TextView textView = this.y;
        if (textView == null) {
            textView = null;
        }
        textView.setEnabled(!z);
        TextView textView2 = this.A;
        if (textView2 != null) {
            textView2.setEnabled(!z);
        }
        View view = this.z;
        (view != null ? view : null).setEnabled(!z);
    }

    @Override // xsna.zk6
    public final void yn() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        d2q d2qVar = (d2q) obj;
        d2qVar.y0(this);
        d2qVar.N();
    }

    @Override // xsna.zk6
    public final void zn(int i, List list) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setText(list.size() > 1 ? getString(R.string.vk_auth_account_continue_as, ((UserItem) list.get(i)).d) : getString(R.string.vk_auth_account_continue));
        }
    }

    public void Bn(ViewStub viewStub) {
    }
}
