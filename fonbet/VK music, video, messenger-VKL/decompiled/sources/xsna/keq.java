package xsna;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import com.vk.file_picker.external.a;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.eeu0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class keq implements ua0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Fragment c;

    public /* synthetic */ keq(Fragment fragment, int i) {
        this.b = i;
        this.c = fragment;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ua0
    public final void onActivityResult(Object obj) {
        String host;
        int i = this.b;
        Fragment fragment = this.c;
        switch (i) {
            case 0:
                ExternalFilePickerFragment externalFilePickerFragment = (ExternalFilePickerFragment) fragment;
                Uri uri = (Uri) obj;
                int i2 = ExternalFilePickerFragment.R;
                if (uri != null) {
                    xn50.a.c(externalFilePickerFragment, new a.C1066a(uri.toString()));
                    break;
                } else {
                    externalFilePickerFragment.fo(EmptyList.b);
                    break;
                }
            default:
                final joe0 joe0Var = (joe0) fragment;
                ActivityResult activityResult = (ActivityResult) obj;
                if (activityResult.b != -1) {
                    joe0Var.tn();
                    break;
                } else {
                    Intent intent = activityResult.c;
                    String stringExtra = intent != null ? intent.getStringExtra("CODE_READER_RESULT") : null;
                    par0.a.getClass();
                    par0.a("Qr result: " + stringExtra);
                    if (stringExtra != null) {
                        Uri parse = Uri.parse(stringExtra);
                        m0g0 m0g0Var = joe0Var.k;
                        m0g0Var.getClass();
                        int i3 = 1;
                        if (parse != null && (host = parse.getHost()) != null && ((Regex) m0g0Var.b.getValue()).f(host) && epx.f(parse.getPath(), "/w2a") && parse.getQueryParameter(CampaignEx.JSON_KEY_AD_Q) != null) {
                            koe0 koe0Var = joe0Var.i;
                            if (koe0Var != null) {
                                koe0Var.a(joe0Var.requireContext(), Uri.parse(stringExtra), false);
                            }
                            joe0Var.tn();
                            break;
                        } else {
                            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILE_QR_INCORRECT_QR_SCANNED, null, null, null, null, null, null, 254);
                            FragmentActivity kn = joe0Var.kn();
                            String string = joe0Var.getString(R.string.vk_qr_web_to_app_wrong_qr_scanned_error_title);
                            String string2 = joe0Var.getString(R.string.vk_qr_web_to_app_wrong_qr_scanned_error_message);
                            eeu0.a aVar = new eeu0.a(kn);
                            aVar.c = false;
                            aVar.setTitle(string);
                            AlertController.b bVar = aVar.a;
                            bVar.f = string2;
                            aVar.f(kn.getString(R.string.vk_qr_web_to_app_error_dialog_close), new izo(joe0Var, i3));
                            bVar.n = new DialogInterface.OnCancelListener() { // from class: xsna.ioe0
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILE_QR_CLOSE_ALERT_TAP, null, null, null, null, null, null, 254);
                                    joe0.this.un();
                                }
                            };
                            aVar.m();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
