package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.pxw0;

/* compiled from: VoipScheduleCallSettingViewHolder.kt */
/* loaded from: classes7.dex */
public final class dxw0 extends vfz<VoipScheduleCallViewState.ScreenState.Item.Setting> {
    public final qxw0<pxw0.p> l;
    public final ImageView m;
    public final TextView n;
    public final TextView o;
    public final SwitchCompat p;
    public final View q;

    /* compiled from: VoipScheduleCallSettingViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.values().length];
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.WAITING_HALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.ANONYMOUS_JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.FEEDBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.TIME_ZONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.REPEAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.REPEAT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.AUDIO_MUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.VIDEO_MUTE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.WATCH_TOGETHER_ITEM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VoipScheduleCallViewState.ScreenState.Item.Setting.Type.REMINDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dxw0(ViewGroup viewGroup, qxw0<? super pxw0.p> qxw0Var) {
        super(R.layout.voip_call_by_link_setting_item, viewGroup);
        this.l = qxw0Var;
        this.m = (ImageView) this.itemView.findViewById(R.id.call_by_link_setting_icon);
        this.n = (TextView) this.itemView.findViewById(R.id.call_by_link_setting_title);
        this.o = (TextView) this.itemView.findViewById(R.id.call_by_link_setting_subtitle);
        this.p = (SwitchCompat) this.itemView.findViewById(R.id.call_by_link_setting_switch);
        this.q = this.itemView.findViewById(R.id.call_by_link_chevron);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(VoipScheduleCallViewState.ScreenState.Item.Setting setting) {
        VoipScheduleCallViewState.ScreenState.Item.Setting setting2 = setting;
        Context context = this.itemView.getContext();
        int i = setting2.c;
        e3m.a aVar = e3m.a;
        this.m.setImageDrawable(m33.a(i, context));
        this.n.setText(this.itemView.getContext().getString(setting2.d));
        this.o.setText(setting2.e);
        VoipScheduleCallViewState.ScreenState.Item.Setting.a aVar2 = setting2.f;
        final VoipScheduleCallViewState.ScreenState.Item.Setting.Type type = setting2.b;
        boolean z = aVar2 instanceof VoipScheduleCallViewState.ScreenState.Item.Setting.a.b;
        View view = this.q;
        SwitchCompat switchCompat = this.p;
        if (z) {
            bwt0.p0(view, true);
            bwt0.p0(switchCompat, false);
        } else if (aVar2 instanceof VoipScheduleCallViewState.ScreenState.Item.Setting.a.C2072a) {
            bwt0.p0(view, false);
            bwt0.p0(switchCompat, true);
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(true);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.cxw0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    dxw0.this.h6(type);
                }
            });
        } else {
            if (!(aVar2 instanceof VoipScheduleCallViewState.ScreenState.Item.Setting.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(view, false);
            bwt0.p0(switchCompat, true);
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(false);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.cxw0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    dxw0.this.h6(type);
                }
            });
        }
        this.itemView.setOnClickListener(new ikc(4, this, setting2));
    }

    public final void h6(VoipScheduleCallViewState.ScreenState.Item.Setting.Type type) {
        pxw0.p pVar;
        switch (a.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                pVar = pxw0.p.i.a;
                break;
            case 2:
                pVar = pxw0.p.a.a;
                break;
            case 3:
                pVar = pxw0.p.c.a;
                break;
            case 4:
                pVar = pxw0.p.g.a;
                break;
            case 5:
                pVar = pxw0.p.e.a;
                break;
            case 6:
                pVar = pxw0.p.f.a;
                break;
            case 7:
                pVar = pxw0.p.b.a;
                break;
            case 8:
                pVar = pxw0.p.h.a;
                break;
            case 9:
                pVar = pxw0.p.j.a;
                break;
            case 10:
                pVar = pxw0.p.d.a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.l.a(pVar);
    }
}
