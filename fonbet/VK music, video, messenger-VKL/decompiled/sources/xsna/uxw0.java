package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: VoipScheduledCallMicrophoneSettingView.kt */
@SuppressLint({"InflateParams"})
/* loaded from: classes7.dex */
public final class uxw0 {
    public final Context a;
    public final ScheduledAudioMuteOption b;
    public final izs<ScheduledAudioMuteOption, s3q0> c;
    public final tzp0.c d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public dw20 i;

    public uxw0(Context context, ScheduledAudioMuteOption scheduledAudioMuteOption, izs izsVar) {
        tzp0.c a = tzp0.a(null, 3);
        this.a = context;
        this.b = scheduledAudioMuteOption;
        this.c = izsVar;
        this.d = a;
        uho0 uho0Var = new uho0(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, uho0Var);
        this.f = msy.a(lazyThreadSafetyMode, new avj0(this, 29));
        this.g = msy.a(lazyThreadSafetyMode, new ksq0(this, 17));
        this.h = msy.a(lazyThreadSafetyMode, new cck0(this, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        ?? r0 = this.g;
        ((TextView) r0.getValue()).setText(R.string.voip_call_by_link_setting_media_state_disabled_on_join_microphone);
        if (this.i == null) {
            tzp0.c cVar = this.d;
            Context context = this.a;
            this.i = ((dw20.b) new dw20.b(context, cVar).D0((View) this.e.getValue(), false).J()).A(cn70.b(14)).w0(context.getString(R.string.voip_call_by_link_setting_media_microphones_title)).c(new cpo(false, cn70.b(200), 3)).I0("uxw0");
        }
        ?? r1 = this.f;
        TextView textView = (TextView) r1.getValue();
        ScheduledAudioMuteOption scheduledAudioMuteOption = ScheduledAudioMuteOption.Enabled;
        int i = R.drawable.vk_icon_check_circle_on_24;
        ScheduledAudioMuteOption scheduledAudioMuteOption2 = this.b;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, scheduledAudioMuteOption2 == scheduledAudioMuteOption ? R.drawable.vk_icon_check_circle_on_24 : 0, 0);
        ((TextView) r1.getValue()).setOnClickListener(new tg(this, 11));
        ((TextView) r0.getValue()).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, scheduledAudioMuteOption2 == ScheduledAudioMuteOption.MutedOnJoin ? R.drawable.vk_icon_check_circle_on_24 : 0, 0);
        ((TextView) r0.getValue()).setOnClickListener(new vg(this, 12));
        ?? r02 = this.h;
        TextView textView2 = (TextView) r02.getValue();
        if (scheduledAudioMuteOption2 != ScheduledAudioMuteOption.MutedPermanent) {
            i = 0;
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
        ((TextView) r02.getValue()).setOnClickListener(new ug(this, 12));
    }
}
