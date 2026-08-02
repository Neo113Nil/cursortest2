package xsna;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.R;
import java.util.Map;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: VoipMediaSettingDialog.kt */
/* loaded from: classes7.dex */
public final class msw0 extends dw20 {
    public d f1;
    public b g1;
    public Object h1;
    public c i1;

    /* compiled from: VoipMediaSettingDialog.kt */
    public interface a {
        void b(c cVar);

        void c(c cVar);
    }

    /* compiled from: VoipMediaSettingDialog.kt */
    public interface b {
        boolean a(c cVar);

        String b(c cVar);

        String c(c cVar);

        String d(c cVar);

        Drawable getIcon();
    }

    /* compiled from: VoipMediaSettingDialog.kt */
    public static final class c {
        public final MediaOption a;
        public final MediaOptionState b;

        public c(MediaOption mediaOption, MediaOptionState mediaOptionState) {
            this.a = mediaOption;
            this.b = mediaOptionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "State(mediaOption=" + this.a + ", mediaOptionState=" + this.b + ')';
        }
    }

    /* compiled from: VoipMediaSettingDialog.kt */
    public static final class d {
        public final View a;
        public final ImageView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;

        public d(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
            this.a = view;
            this.b = imageView;
            this.c = textView;
            this.d = textView2;
            this.e = textView3;
        }
    }

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
        c cVar = this.i1;
        if (cVar == null) {
            cVar = null;
        }
        d dVar = this.f1;
        if (dVar == null) {
            dVar = null;
        }
        ImageView imageView = dVar.b;
        b bVar = this.g1;
        if (bVar == null) {
            bVar = null;
        }
        imageView.setImageDrawable(bVar.getIcon());
        d dVar2 = this.f1;
        if (dVar2 == null) {
            dVar2 = null;
        }
        TextView textView = dVar2.c;
        b bVar2 = this.g1;
        if (bVar2 == null) {
            bVar2 = null;
        }
        textView.setText(bVar2.b(cVar));
        d dVar3 = this.f1;
        if (dVar3 == null) {
            dVar3 = null;
        }
        TextView textView2 = dVar3.d;
        b bVar3 = this.g1;
        if (bVar3 == null) {
            bVar3 = null;
        }
        textView2.setText(bVar3.c(cVar));
        d dVar4 = this.f1;
        if (dVar4 == null) {
            dVar4 = null;
        }
        TextView textView3 = dVar4.e;
        b bVar4 = this.g1;
        if (bVar4 == null) {
            bVar4 = null;
        }
        bwt0.p0(textView3, bVar4.a(cVar));
        d dVar5 = this.f1;
        if (dVar5 == null) {
            dVar5 = null;
        }
        TextView textView4 = dVar5.e;
        b bVar5 = this.g1;
        if (bVar5 == null) {
            bVar5 = null;
        }
        textView4.setText(bVar5.d(cVar));
        d dVar6 = this.f1;
        if (dVar6 == null) {
            dVar6 = null;
        }
        bwt0.i0(dVar6.d, new uwi0(8, this, cVar));
        d dVar7 = this.f1;
        bwt0.i0((dVar7 != null ? dVar7 : null).e, new np5(27, this, cVar));
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        b psw0Var;
        MediaOptionState videoState;
        Map<CallMemberId, MediaOptionState> map;
        Map<CallMemberId, MediaOptionState> map2;
        Map<CallMemberId, MediaOptionState> map3;
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CallMemberId callMemberId = (CallMemberId) arguments.getParcelable("participant_id");
        String string = arguments.getString("participant_name");
        MediaOption mediaOption = (MediaOption) arguments.getSerializable("media_option");
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_media_setting_dialog, (ViewGroup) null, false);
        this.f1 = new d(inflate, (ImageView) inflate.findViewById(R.id.media_setting_dialog_icon), (TextView) inflate.findViewById(R.id.media_setting_dialog_title), (TextView) inflate.findViewById(R.id.media_setting_dialog_button_primary), (TextView) inflate.findViewById(R.id.media_setting_dialog_button_secondary));
        if (callMemberId != null && string != null && mediaOption == MediaOption.AUDIO) {
            psw0Var = new rsw0(requireContext(), string);
        } else if (callMemberId != null && string != null && mediaOption == MediaOption.VIDEO) {
            psw0Var = new ssw0(requireContext(), string);
        } else if (callMemberId != null && string != null && mediaOption == MediaOption.MOVIE_SHARING) {
            psw0Var = new tsw0(requireContext(), string);
        } else if (mediaOption == MediaOption.AUDIO) {
            psw0Var = new osw0(requireContext());
        } else {
            if (mediaOption != MediaOption.VIDEO) {
                throw new IllegalStateException("Illegal args: participantId = " + callMemberId + ", participantName = " + string + ", mediaOption = " + mediaOption);
            }
            psw0Var = new psw0(requireContext());
        }
        this.g1 = psw0Var;
        pdw0 qsw0Var = callMemberId != null ? new qsw0(com.vk.voip.ui.c.b, callMemberId) : new nsw0(com.vk.voip.ui.c.b);
        hg1.a(io.reactivex.rxjava3.kotlin.c.f(3, qsw0Var.a(), null, null, new rqs(((VoipAnalyticsInternalComponent) m7m.d(this).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df(), 1)), this);
        this.h1 = qsw0Var;
        if (callMemberId != null && mediaOption == MediaOption.AUDIO) {
            dhw0 L = com.vk.voip.ui.c.b.L();
            if (L == null || (map3 = L.s) == null || (videoState = map3.get(callMemberId)) == null) {
                videoState = MediaOptionState.UNMUTED;
            }
        } else if (callMemberId != null && mediaOption == MediaOption.VIDEO) {
            dhw0 L2 = com.vk.voip.ui.c.b.L();
            if (L2 == null || (map2 = L2.t) == null || (videoState = map2.get(callMemberId)) == null) {
                videoState = MediaOptionState.UNMUTED;
            }
        } else if (callMemberId != null && mediaOption == MediaOption.MOVIE_SHARING) {
            dhw0 L3 = com.vk.voip.ui.c.b.L();
            if (L3 == null || (map = L3.u) == null || (videoState = map.get(callMemberId)) == null) {
                videoState = MediaOptionState.UNMUTED;
            }
        } else if (mediaOption == MediaOption.AUDIO) {
            OKVoipEngine.b.getClass();
            videoState = OKVoipEngine.A().getAudioState();
        } else {
            if (mediaOption != MediaOption.VIDEO) {
                throw new IllegalStateException("Illegal args: participantId = " + callMemberId + ", mediaOption = " + mediaOption);
            }
            OKVoipEngine.b.getClass();
            videoState = OKVoipEngine.A().getVideoState();
        }
        this.i1 = new c(mediaOption, videoState);
        d dVar = this.f1;
        dw20.Rn(this, (dVar != null ? dVar : null).a, 6);
        return super.yn(bundle);
    }
}
