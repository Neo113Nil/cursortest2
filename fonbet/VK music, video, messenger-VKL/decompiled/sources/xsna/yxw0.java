package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.kyw0;

/* compiled from: VoipScheduledCallSettingViewHolder.kt */
/* loaded from: classes7.dex */
public final class yxw0 extends vfz<VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting> {
    public final rxw0<kyw0> l;
    public final TextView m;
    public final TextView n;
    public final SwitchCompat o;
    public final View p;

    /* compiled from: VoipScheduledCallSettingViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.values().length];
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.WAITING_HALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.ANONYMOUS_JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.FEEDBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.AUDIO_MUTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.VIDEO_MUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.WATCH_TOGETHER_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.SCREEN_SHARING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.RECORD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.SHOULD_SHOW_CHAT_HISTORY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yxw0(ViewGroup viewGroup, rxw0<? super kyw0> rxw0Var) {
        super(R.layout.voip_scheduled_call_setting_item, viewGroup);
        this.l = rxw0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.call_by_link_setting_title);
        this.n = (TextView) this.itemView.findViewById(R.id.call_by_link_setting_subtitle);
        this.o = (SwitchCompat) this.itemView.findViewById(R.id.call_by_link_setting_switch);
        this.p = this.itemView.findViewById(R.id.call_by_link_chevron);
    }

    @Override // xsna.vfz
    public final void W5(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting) {
        VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting setting2 = setting;
        final VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type type = setting2.b;
        String string = this.itemView.getContext().getString(setting2.c);
        TextView textView = this.m;
        textView.setText(string);
        Integer num = setting2.e;
        TextView textView2 = this.n;
        if (num != null) {
            bwt0.p0(textView2, true);
            textView2.setText(this.itemView.getContext().getString(num.intValue()));
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = cn70.b(0);
            textView.setLayoutParams(marginLayoutParams);
        } else {
            bwt0.p0(textView2, false);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = cn70.b(10);
            textView.setLayoutParams(marginLayoutParams2);
        }
        VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a aVar = setting2.d;
        boolean z = aVar instanceof VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.b;
        View view = this.p;
        SwitchCompat switchCompat = this.o;
        if (z) {
            bwt0.p0(view, true);
            bwt0.p0(switchCompat, false);
        } else if (aVar instanceof VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.C2074a) {
            bwt0.p0(view, false);
            bwt0.p0(switchCompat, true);
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(true);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.xxw0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    yxw0.this.h6(type);
                }
            });
        } else {
            if (!(aVar instanceof VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(view, false);
            bwt0.p0(switchCompat, true);
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(false);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.xxw0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    yxw0.this.h6(type);
                }
            });
        }
        this.itemView.setOnClickListener(new com.vk.im.video.c(5, this, setting2));
        if (type == VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type.SHOULD_SHOW_CHAT_HISTORY) {
            textView.setLines(2);
        }
    }

    public final void h6(VoipScheduledCallSettingsContentViewState$ScreenState$Item.Setting.Type type) {
        kyw0.a aVar;
        switch (a.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                aVar = kyw0.a.h.a;
                break;
            case 2:
                aVar = kyw0.a.C3219a.a;
                break;
            case 3:
                aVar = kyw0.a.c.a;
                break;
            case 4:
                aVar = kyw0.a.b.a;
                break;
            case 5:
                aVar = kyw0.a.g.a;
                break;
            case 6:
                aVar = kyw0.a.i.a;
                break;
            case 7:
                aVar = kyw0.a.e.a;
                break;
            case 8:
                aVar = kyw0.a.d.a;
                break;
            case 9:
                aVar = kyw0.a.f.a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.l.a(aVar);
    }
}
