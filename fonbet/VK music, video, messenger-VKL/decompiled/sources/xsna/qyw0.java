package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: VoipScheduledCallVideoSettingView.kt */
@SuppressLint({"InflateParams"})
/* loaded from: classes7.dex */
public final class qyw0 {
    public final Context a;
    public final ScheduledVideoMuteOption b;
    public final izs<ScheduledVideoMuteOption, s3q0> c;
    public final tzp0.c d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public dw20 i;

    public qyw0(Context context, ScheduledVideoMuteOption scheduledVideoMuteOption, izs izsVar) {
        tzp0.c a = tzp0.a(null, 3);
        this.a = context;
        this.b = scheduledVideoMuteOption;
        this.c = izsVar;
        this.d = a;
        i6m0 i6m0Var = new i6m0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, i6m0Var);
        this.f = msy.a(lazyThreadSafetyMode, new nid0(this, 29));
        this.g = msy.a(lazyThreadSafetyMode, new nbt0(this, 2));
        this.h = msy.a(lazyThreadSafetyMode, new jcf0(this, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        ?? r0 = this.g;
        ((TextView) r0.getValue()).setText(R.string.voip_call_by_link_setting_media_state_disabled_on_join_camera);
        if (this.i == null) {
            tzp0.c cVar = this.d;
            Context context = this.a;
            this.i = ((dw20.b) new dw20.b(context, cVar).D0((View) this.e.getValue(), false).J()).A(cn70.b(12)).w0(context.getString(R.string.voip_call_by_link_setting_media_video_title)).c(new cpo(false, cn70.b(200), 3)).I0("qyw0");
        }
        ?? r1 = this.f;
        TextView textView = (TextView) r1.getValue();
        ScheduledVideoMuteOption scheduledVideoMuteOption = ScheduledVideoMuteOption.Enabled;
        int i = R.drawable.vk_icon_check_circle_on_24;
        ScheduledVideoMuteOption scheduledVideoMuteOption2 = this.b;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, scheduledVideoMuteOption2 == scheduledVideoMuteOption ? R.drawable.vk_icon_check_circle_on_24 : 0, 0);
        ((TextView) r1.getValue()).setOnClickListener(new s01(this, 16));
        ((TextView) r0.getValue()).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, scheduledVideoMuteOption2 == ScheduledVideoMuteOption.DisabledOnJoin ? R.drawable.vk_icon_check_circle_on_24 : 0, 0);
        ((TextView) r0.getValue()).setOnClickListener(new xz5(this, 18));
        ?? r02 = this.h;
        TextView textView2 = (TextView) r02.getValue();
        if (scheduledVideoMuteOption2 != ScheduledVideoMuteOption.DisabledPermanent) {
            i = 0;
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
        ((TextView) r02.getValue()).setOnClickListener(new t01(this, 13));
    }
}
