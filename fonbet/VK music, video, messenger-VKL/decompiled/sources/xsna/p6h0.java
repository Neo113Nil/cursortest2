package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vkontakte.android.R;
import xsna.u7h0;

/* compiled from: ScheduledCallStickyHolder.kt */
/* loaded from: classes7.dex */
public final class p6h0 extends mj8 {
    public final k59<q6h0> m;
    public final TextView n;

    public p6h0(ViewGroup viewGroup, VoipScheduledCallsFragment.c cVar) {
        super(viewGroup, R.layout.voip_call_list_scheduled_sticky_header, 1);
        this.m = cVar;
        this.n = (TextView) this.itemView.findViewById(R.id.scheduled_call_header_selector_button);
    }

    @Override // xsna.mj8
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public final void i6(u7h0.a aVar) {
        boolean z = aVar.b;
        TextView textView = this.n;
        if (z) {
            textView.setText(aVar.d);
            bwt0.i0(textView, new ju(22, this, aVar));
        }
        textView.setVisibility(z ? 0 : 8);
    }
}
