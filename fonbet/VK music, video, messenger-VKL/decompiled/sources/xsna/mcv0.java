package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;

/* compiled from: VkPermissionBottomSheetDialog.kt */
/* loaded from: classes4.dex */
public final class mcv0 extends smu0 {
    public static final /* synthetic */ int o1 = 0;
    public Context l1;
    public boolean n1;
    public int j1 = R.string.vk_permission_dialog_ok;
    public int k1 = R.string.vk_permission_dialog_cancel;
    public final boolean m1 = true;

    /* compiled from: VkPermissionBottomSheetDialog.kt */
    public static final class a {
        public static mcv0 a(int i, String str, String str2) {
            int i2 = mcv0.o1;
            Bundle bundle = new Bundle();
            bundle.putInt("arg_icon", i);
            bundle.putString("arg_title", str);
            bundle.putString("arg_subtitle", str2);
            mcv0 mcv0Var = new mcv0();
            mcv0Var.setArguments(bundle);
            return mcv0Var;
        }

        public static mcv0 b(int i, String str, String str2, String str3) {
            int i2 = mcv0.o1;
            float f = (i & 16) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 14.0f;
            Bundle b = qr.b("arg_photo", str, "arg_title", str2);
            b.putString("arg_subtitle", str3);
            b.putFloat("arg_photo_corners_radius", f);
            mcv0 mcv0Var = new mcv0();
            mcv0Var.setArguments(b);
            return mcv0Var;
        }
    }

    @Override // xsna.smu0
    public final View Zn(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        String string;
        View inflate = layoutInflater.cloneInContext(this.l1).inflate(R.layout.vk_bottom_sheet_permissions, (ViewGroup) frameLayout, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        Bundle arguments = getArguments();
        textView.setText(arguments != null ? arguments.getString("arg_title") : null);
        TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle);
        Bundle arguments2 = getArguments();
        textView2.setText(arguments2 != null ? arguments2.getString("arg_subtitle") : null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        Bundle arguments3 = getArguments();
        imageView.setImageResource(arguments3 != null ? arguments3.getInt("arg_icon") : 0);
        Bundle arguments4 = getArguments();
        float f = arguments4 != null ? arguments4.getFloat("arg_photo_corners_radius", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : 0.0f;
        boolean z = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string = arguments5.getString("arg_photo")) != null) {
            imageView.setVisibility(8);
            VkImage vkImage = (VkImage) inflate.findViewById(R.id.photo);
            vkImage.setVisibility(0);
            vkImage.setCornerRadius(f);
            vkImage.setRound(z);
            vkImage.o0(string, null);
        }
        return inflate;
    }

    @Override // xsna.smu0
    public final String ao() {
        return getString(this.j1);
    }

    @Override // xsna.smu0
    public final String co() {
        return getString(this.k1);
    }

    @Override // xsna.smu0
    public final boolean fo() {
        return this.m1;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return this.l1;
    }

    @Override // xsna.smu0
    public final boolean ho() {
        return this.n1;
    }

    public final void io(int i) {
        this.j1 = i;
    }

    public final void jo(int i) {
        this.k1 = i;
    }

    public final void ko() {
        this.n1 = true;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.l1 = this.A0 == -1 ? hnj.a(context) : new ContextThemeWrapper(context, this.A0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.l1 = null;
    }
}
