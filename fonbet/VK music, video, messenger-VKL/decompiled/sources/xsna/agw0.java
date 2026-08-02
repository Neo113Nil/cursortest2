package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vk.voip.ui.call_by_link.ui.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: VoipCallByLinkContentSettingViewHolder.kt */
/* loaded from: classes7.dex */
public final class agw0 extends vfz<VoipCallByLinkViewState.ContentDialog.Item.Setting> {
    public final kgw0<a.AbstractC2032a.c> l;
    public final ImageView m;
    public final TextView n;
    public final TextView o;
    public final SwitchCompat p;

    /* compiled from: VoipCallByLinkContentSettingViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.values().length];
            try {
                iArr[VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.WAITING_HALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.ANONYMOUS_JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.FEEDBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.MEDIA_MICROPHONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.MEDIA_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoipCallByLinkViewState.ContentDialog.Item.Setting.Type.WATCH_TOGETHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public agw0(ViewGroup viewGroup, kgw0<? super a.AbstractC2032a.c> kgw0Var) {
        super(R.layout.voip_call_by_link_setting_item, viewGroup);
        this.l = kgw0Var;
        this.m = (ImageView) this.itemView.findViewById(R.id.call_by_link_setting_icon);
        this.n = (TextView) this.itemView.findViewById(R.id.call_by_link_setting_title);
        this.o = (TextView) this.itemView.findViewById(R.id.call_by_link_setting_subtitle);
        this.p = (SwitchCompat) this.itemView.findViewById(R.id.call_by_link_setting_switch);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(VoipCallByLinkViewState.ContentDialog.Item.Setting setting) {
        VoipCallByLinkViewState.ContentDialog.Item.Setting setting2 = setting;
        Context context = this.itemView.getContext();
        int i = setting2.c;
        e3m.a aVar = e3m.a;
        this.m.setImageDrawable(m33.a(i, context));
        this.n.setText(this.itemView.getContext().getString(setting2.d));
        this.o.setText(this.itemView.getContext().getString(setting2.e));
        VoipCallByLinkViewState.ContentDialog.Item.Setting.a aVar2 = setting2.f;
        final VoipCallByLinkViewState.ContentDialog.Item.Setting.Type type = setting2.b;
        boolean z = aVar2 instanceof VoipCallByLinkViewState.ContentDialog.Item.Setting.a.b;
        SwitchCompat switchCompat = this.p;
        if (z) {
            bwt0.p0(switchCompat, false);
        } else if (aVar2 instanceof VoipCallByLinkViewState.ContentDialog.Item.Setting.a.C2030a) {
            bwt0.p0(switchCompat, true);
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(true);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.zfw0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    agw0.this.h6(type);
                }
            });
        } else {
            if (!(aVar2 instanceof VoipCallByLinkViewState.ContentDialog.Item.Setting.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(switchCompat, true);
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(false);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.zfw0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    agw0.this.h6(type);
                }
            });
        }
        bwt0.i0(this.itemView, new x7t0(5, this, setting2));
    }

    public final void h6(VoipCallByLinkViewState.ContentDialog.Item.Setting.Type type) {
        a.AbstractC2032a.c cVar;
        switch (a.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                cVar = a.AbstractC2032a.c.e.a;
                break;
            case 2:
                cVar = a.AbstractC2032a.c.C2034a.a;
                break;
            case 3:
                cVar = a.AbstractC2032a.c.b.a;
                break;
            case 4:
                cVar = a.AbstractC2032a.c.C2035c.a;
                break;
            case 5:
                cVar = a.AbstractC2032a.c.d.a;
                break;
            case 6:
                cVar = a.AbstractC2032a.c.f.a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.l.a(cVar);
    }
}
