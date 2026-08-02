package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.d030;

/* compiled from: ModalMapBottomSheet.kt */
/* loaded from: classes15.dex */
public final class c030 extends oeu0 implements arf0 {
    public e030 C;
    public ProgressBar D;
    public LinearLayout E;
    public Button F;
    public final int G = R.layout.vk_fragment_qr_map;

    @Override // xsna.oeu0
    public final int Gn() {
        return this.G;
    }

    public final void Mn(d030 d030Var) {
        if (d030Var instanceof d030.a) {
            LinearLayout linearLayout = this.E;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            ProgressBar progressBar = this.D;
            if (progressBar != null) {
                progressBar.setVisibility(4);
                return;
            }
            return;
        }
        if (d030Var.equals(d030.b.a)) {
            ProgressBar progressBar2 = this.D;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(4);
                return;
            }
            return;
        }
        if (!d030Var.equals(d030.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ProgressBar progressBar3 = this.D;
        if (progressBar3 != null) {
            progressBar3.setVisibility(4);
        }
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(4);
        }
    }

    @Override // xsna.oeu0, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        String str;
        String string;
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        SchemeStatSak$EventScreen u5 = u5();
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("auth_id")) == null) {
            str = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("app_id")) != null) {
            str2 = string;
        }
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, u5, com.vk.registration.funnels.b.c(bVar, str, u5, str2, false, 8), null, null, 28);
        super.onAttach(context);
    }

    @Override // xsna.oeu0, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        String str;
        String string;
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        SchemeStatSak$EventScreen u5 = u5();
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("auth_id")) == null) {
            str = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("app_id")) != null) {
            str2 = string;
        }
        bVar.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.g(u5, null, com.vk.registration.funnels.b.c(bVar, str, u5, str2, false, 8), null, 8);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) view.findViewById(R.id.toolbar);
        r55 r55Var = r55.a;
        vkAuthToolbar.setPicture(r55.i().b(requireContext()));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.qr_map_place_holder);
        ((TextView) linearLayout.findViewById(R.id.vk_qr_map_item_title)).setText(getString(R.string.vk_qr_auth_location));
        TextView textView = (TextView) linearLayout.findViewById(R.id.vk_qr_map_item_description);
        Bundle arguments = getArguments();
        textView.setText(arguments != null ? arguments.getString("location_name") : null);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.qr_map_ip_holder);
        ((TextView) linearLayout2.findViewById(R.id.vk_qr_map_item_title)).setText(getString(R.string.vk_qr_auth_ip_address));
        TextView textView2 = (TextView) linearLayout2.findViewById(R.id.vk_qr_map_item_description);
        Bundle arguments2 = getArguments();
        textView2.setText(arguments2 != null ? arguments2.getString("ip_address") : null);
        VKReplacerView vKReplacerView = (VKReplacerView) view.findViewById(R.id.qr_map);
        this.D = (ProgressBar) view.findViewById(R.id.qr_map_loading_progress);
        this.E = (LinearLayout) view.findViewById(R.id.qr_map_loading_error_container);
        this.F = (Button) view.findViewById(R.id.qr_map_loading_reload_button);
        requireContext();
        this.C = new e030(this);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(requireContext());
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        Bundle arguments3 = getArguments();
        String string = arguments3 != null ? arguments3.getString("map_url") : null;
        e030 e030Var = this.C;
        if (e030Var != null) {
            e030Var.a(create, string);
        }
        Button button = this.F;
        if (button != null) {
            button.setOnClickListener(new b030(this, create, string, 0));
        }
        super.onViewCreated(view, bundle);
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        Bundle arguments = getArguments();
        return (arguments == null || !arguments.getBoolean("is_qr_flow")) ? SchemeStatSak$EventScreen.ENTRY_MAP : SchemeStatSak$EventScreen.QR_CODE_MAP;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkIdBottomSheetTheme;
    }
}
