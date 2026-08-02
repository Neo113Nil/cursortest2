package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.zt5;

/* compiled from: AvitoIntegrationBottomSheet.kt */
/* loaded from: classes18.dex */
public final class rt5 extends tl50<pt5, au5, nt5> {
    public static final /* synthetic */ int r1 = 0;
    public final bpn0 i1 = new bpn0(new ig(2));
    public final bpn0 j1 = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.g(this, 6));
    public VKImageView k1;
    public VkText l1;
    public VkText m1;
    public VkSimpleButton n1;
    public VkImageSimple o1;
    public Group p1;
    public FrameLayout q1;

    /* compiled from: AvitoIntegrationBottomSheet.kt */
    public static final class a extends dw20.b {
        public final UserId e;
        public final Integer f;

        public a(Context context, UserId userId, Integer num) {
            super(context, tzp0.a(null, 3));
            this.e = userId;
            this.f = num;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            rt5 rt5Var = new rt5();
            rt5Var.setArguments(yfb.b(new Pair("extra_user_id", this.e), new Pair("extra_status", this.f)));
            return rt5Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = e3m.b(requireContext()).inflate(R.layout.community_avito_bottom_sheet, (ViewGroup) null, false);
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new t0w0(6, this.A, false, false));
        this.p1 = (Group) inflate.findViewById(R.id.group);
        this.k1 = (VKImageView) inflate.findViewById(R.id.image);
        this.l1 = (VkText) inflate.findViewById(R.id.title);
        this.m1 = (VkText) inflate.findViewById(R.id.subtitle);
        this.n1 = (VkSimpleButton) inflate.findViewById(R.id.button);
        this.o1 = (VkImageSimple) inflate.findViewById(R.id.close_button);
        this.q1 = (FrameLayout) inflate.findViewById(R.id.progress_bar);
        VkImageSimple vkImageSimple = this.o1;
        jjc.g(vkImageSimple != null ? vkImageSimple : null, new m7(this, 7));
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((au5) ao50Var).a, new sa(this, 8));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((pt5) vk50Var).i.a(new qt5(0, ((BridgeComponent) this.j1.getValue()).p().e(), this), this);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int f = e3m.f(R.attr.vk_ui_background_content, this.A0 == -1 ? requireContext() : new lpj(requireContext(), this.A0));
        Window window = kn().getWindow();
        int[] iArr = u1u0.a;
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(f);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("extra_user_id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("extra_user_id");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            userId = (UserId) parcelable;
        } else {
            userId = null;
        }
        Bundle arguments2 = getArguments();
        return new pt5(new xt5(zt5.c.b), userId, arguments2 != null ? bo8.d(arguments2, "extra_status") : null, new vt5(new yt5((xd10) this.i1.getValue())));
    }
}
