package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.n7r0;
import xsna.qr9;

/* compiled from: SakCaptchaFragment.kt */
/* loaded from: classes15.dex */
public final class vzg0 extends dw20 {
    public static n7r0.c p1;
    public EditText f1;
    public LinearLayout g1;
    public View h1;
    public View i1;
    public boolean j1;
    public boolean k1;
    public qfk0 l1;
    public ofk0 m1;
    public mgw n1;
    public ogw o1;

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ogw ogwVar = this.o1;
        if (ogwVar != null) {
            double d = ogwVar.b.c;
            if (d > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                ogwVar.d(d, false);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ofk0 ofk0Var = this.m1;
        if (ofk0Var != null) {
            ofk0Var.a = null;
            ofk0Var.deactivate();
        }
        mgw mgwVar = this.n1;
        if (mgwVar != null) {
            mgwVar.a = null;
            mgwVar.deactivate();
        }
        super.onDestroyView();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.j1) {
            p1 = new n7r0.c(null, this.k1, false, false);
        }
        yhr0.b();
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ofk0 ofk0Var = this.m1;
        if (ofk0Var != null) {
            MediaPlayer mediaPlayer = ofk0Var.i;
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
                ofk0Var.b(new qr9.e(false, ofk0Var.b));
            }
        }
        super.onPause();
    }

    @Override // xsna.dw20, androidx.fragment.app.d
    public final int vn() {
        return R.style.VkIdBModalFloatingBottomSheetTheme;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Bundle arguments;
        View inflate = LayoutInflater.from(new lpj(requireContext(), R.style.VkIdBModalFloatingBottomSheetTheme)).inflate(R.layout.vk_sak_composite_captcha_fragment, (ViewGroup) null, false);
        dw20.Rn(this, inflate, 4);
        this.i1 = inflate.findViewById(R.id.switch_to_sound_captcha);
        this.f1 = (EditText) inflate.findViewById(R.id.captcha_code);
        this.g1 = (LinearLayout) inflate.findViewById(R.id.captcha_code_layout);
        this.h1 = inflate.findViewById(R.id.captcha_img_frame);
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("captcha_track") : null;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("captcha_token") : null;
        if (string != null && string.length() != 0) {
            FragmentActivity activity = getActivity();
            ofk0 ofk0Var = new ofk0((AudioManager) (activity != null ? activity.getSystemService("audio") : null), string, string2);
            this.m1 = ofk0Var;
            ofk0Var.a = new uzg0(this);
            this.l1 = new qfk0(inflate, this.m1);
            View view = this.i1;
            if (view != null) {
                view.setOnClickListener(new r4(this, 10));
                Bundle arguments4 = getArguments();
                view.setVisibility((arguments4 == null || !arguments4.getBoolean("is_sound_captcha_available", false)) ? 8 : 0);
            }
        }
        Bundle arguments5 = getArguments();
        String string3 = arguments5 != null ? arguments5.getString("url") : null;
        if (string3 != null && (!drm0.N(string3))) {
            lgw lgwVar = new lgw(string3, arguments5.getBoolean("is_refresh_enabled"), arguments5.getDouble("ratio"), arguments5.getInt("width"), arguments5.getInt("height"));
            mgw mgwVar = new mgw(new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new VKImageController.c(12.0f, 12.0f, 12.0f, 12.0f), false, 0, null, null, null, null, 2.0f, e3m.f(R.attr.vk_legacy_image_border, requireContext()), null, null, null, 55805), string3, new zf20(this, 28));
            this.n1 = mgwVar;
            mgwVar.a = new tzg0(this);
            this.o1 = new ogw(inflate, lgwVar, this.n1);
        }
        EditText editText = this.f1;
        if (editText != null) {
            editText.postDelayed(new o4(this, 18), 100L);
        }
        n7r0.c cVar = p1;
        if (cVar == null || !cVar.b || (arguments = getArguments()) == null || !arguments.getBoolean("is_sound_captcha_available", false)) {
            mgw mgwVar2 = this.n1;
            if (mgwVar2 != null) {
                Uri.Builder buildUpon = jeq0.g(mgwVar2.f).buildUpon();
                buildUpon.appendQueryParameter("first", "1");
                mgwVar2.c(buildUpon.build(), false);
            }
        } else {
            ofk0 ofk0Var2 = this.m1;
            if (ofk0Var2 != null) {
                Uri.Builder buildUpon2 = jeq0.g(ofk0Var2.f).buildUpon();
                buildUpon2.appendQueryParameter("first", "1");
                ofk0Var2.c(buildUpon2.build(), false);
            }
        }
        return super.yn(bundle);
    }
}
