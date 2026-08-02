package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ScheduledCallHolder.kt */
/* loaded from: classes7.dex */
public final class e6h0 extends mj8 {
    public final k59<j59> m;
    public final AvatarView n;
    public final TextView o;
    public final View p;
    public final TextView q;
    public final TextView r;
    public final ImageView s;
    public boolean t;

    /* compiled from: ScheduledCallHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScheduledCallViewItem.ScheduledCall.BackgroundType.values().length];
            try {
                iArr[ScheduledCallViewItem.ScheduledCall.BackgroundType.CONTENT_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScheduledCallViewItem.ScheduledCall.BackgroundType.CONTENT_COLOR_WITH_ROUNDED_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e6h0(ViewGroup viewGroup, VoipScheduledCallsFragment.c cVar) {
        super(viewGroup, R.layout.voip_call_list_scheduled_call, 1);
        this.m = cVar;
        this.n = (AvatarView) this.itemView.findViewById(R.id.scheduled_call_avatar);
        this.o = (TextView) this.itemView.findViewById(R.id.scheduled_call_title);
        this.p = this.itemView.findViewById(R.id.scheduled_call_recurring_icon);
        this.q = (TextView) this.itemView.findViewById(R.id.scheduled_call_subtitle);
        this.r = (TextView) this.itemView.findViewById(R.id.scheduled_call_primary_button);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.scheduled_call_menu);
        this.s = imageView;
        imageView.setImageResource(R.drawable.vk_icon_more_vertical_16);
    }

    @Override // xsna.mj8
    /* renamed from: j6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void i6(ScheduledCallViewItem.ScheduledCall scheduledCall) {
        x5h0 x5h0Var = scheduledCall.f;
        boolean z = false;
        this.t = x5h0Var.i.length() > 0;
        ScheduledCallViewItem.ScheduledCall.a aVar = scheduledCall.b;
        AvatarView avatarView = this.n;
        if (aVar != null) {
            avatarView.T0(aVar.a, new com.vk.im.ui.views.avatars.a(this.itemView.getContext(), aVar.b, 2));
        }
        this.o.setText(x5h0Var.b);
        bwt0.p0(this.p, scheduledCall.d);
        this.q.setText(scheduledCall.c);
        if (scheduledCall.e && this.t) {
            z = true;
        }
        TextView textView = this.r;
        bwt0.p0(textView, z);
        bwt0.i0(textView, new gb(29, this, scheduledCall));
        boolean z2 = x5h0Var.r;
        ImageView imageView = this.s;
        bwt0.p0(imageView, z2);
        bwt0.i0(imageView, new mz80(11, this, scheduledCall));
        int i = a.$EnumSwitchMapping$0[scheduledCall.g.ordinal()];
        if (i == 1) {
            f4m.q(cn70.b(12), avatarView);
            this.itemView.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_content));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.q(cn70.b(24), avatarView);
            this.itemView.setBackgroundResource(R.drawable.voip_call_list_rounded_sticky_bottom);
        }
    }
}
