package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: BaseMediaRequestDialog.kt */
/* loaded from: classes7.dex */
public abstract class ug6 extends dw20 {
    public static final /* synthetic */ int j1 = 0;
    public TextView g1;
    public TextView h1;
    public final bpn0 f1 = new bpn0(new ng1(this, 5));
    public final int i1 = R.string.voip_media_request_dialog_participants_title;

    public int Yn() {
        return this.i1;
    }

    public abstract void Zn();

    public abstract void ao();

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            return null;
        }
        dhr0.a.getClass();
        return new l7s(mo2getContext, dhr0.u().c);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        TextView textView = this.g1;
        if (textView == null) {
            textView = null;
        }
        bwt0.i0(textView, new e1(this, 9));
        TextView textView2 = this.h1;
        bwt0.i0(textView2 != null ? textView2 : null, new k9(this, 8));
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_media_request_dialog, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.media_request_dialog_title)).setText(Yn());
        this.g1 = (TextView) inflate.findViewById(R.id.voip_media_request_microphone_button);
        this.h1 = (TextView) inflate.findViewById(R.id.voip_media_request_microphone_and_video_button);
        dw20.Rn(this, inflate, 6);
        return super.yn(bundle);
    }
}
