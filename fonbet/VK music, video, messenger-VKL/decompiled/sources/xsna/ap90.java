package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;
import xsna.xo90;

/* compiled from: PastCallDialogCallsBlockPastCallViewHolder.kt */
/* loaded from: classes7.dex */
public final class ap90 extends vfz<xo90.b.c> {

    @SuppressLint({"SimpleDateFormat"})
    public final SimpleDateFormat l;
    public final v49 m;
    public final TextView n;
    public final TextView o;
    public final TextView p;

    public ap90(ViewGroup viewGroup) {
        super(R.layout.voip_history_past_call_details_calls_block_call_item, viewGroup);
        this.l = new SimpleDateFormat("H:mm");
        this.m = new v49(this.itemView.getContext());
        this.n = (TextView) this.itemView.findViewById(R.id.past_call_details_calls_block_call_time);
        this.o = (TextView) this.itemView.findViewById(R.id.past_call_details_calls_block_call_state);
        this.p = (TextView) this.itemView.findViewById(R.id.past_call_details_calls_block_call_duration);
    }

    @Override // xsna.vfz
    public final void W5(xo90.b.c cVar) {
        String format;
        int i;
        a59.f fVar = cVar.b.a;
        boolean z = fVar instanceof a59.f.c;
        SimpleDateFormat simpleDateFormat = this.l;
        if (z) {
            format = simpleDateFormat.format(Long.valueOf(((a59.f.c) fVar).b));
        } else if (fVar instanceof a59.f.b) {
            format = simpleDateFormat.format(Long.valueOf(((a59.f.b) fVar).b));
        } else if (fVar instanceof a59.f.d) {
            format = simpleDateFormat.format(Long.valueOf(((a59.f.d) fVar).b));
        } else if (fVar instanceof a59.f.e) {
            format = simpleDateFormat.format(Long.valueOf(((a59.f.e) fVar).a));
        } else {
            if (!(fVar instanceof a59.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            format = simpleDateFormat.format(Long.valueOf(((a59.f.a) fVar).a));
        }
        this.n.setText(format);
        int f = e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext());
        TextView textView = this.o;
        textView.setTextColor(f);
        Context context = this.itemView.getContext();
        boolean z2 = fVar instanceof a59.f.c;
        if (z2) {
            i = ((a59.f.c) fVar).a ? R.string.voip_history_past_call_details_past_call_state_p2p_completed_incoming : R.string.voip_history_past_call_details_past_call_state_p2p_completed_outgoing;
        } else if (fVar instanceof a59.f.b) {
            i = R.string.voip_history_past_call_details_past_call_state_group_completed;
        } else if (fVar instanceof a59.f.d) {
            i = R.string.voip_history_past_call_details_past_call_state_declined;
        } else if (fVar instanceof a59.f.e) {
            i = R.string.voip_history_past_call_details_past_call_state_missed;
        } else {
            if (!(fVar instanceof a59.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.voip_history_past_call_details_past_call_state_cancalled;
        }
        textView.setText(context.getString(i));
        v49 v49Var = this.m;
        TextView textView2 = this.p;
        if (z2) {
            a59.f.c cVar2 = (a59.f.c) fVar;
            textView2.setText(v49Var.a(cVar2.c));
            textView2.setContentDescription(((coo) v49Var.c).c((int) TimeUnit.MILLISECONDS.toSeconds(cVar2.c)));
            bwt0.p0(textView2, true);
        } else if (fVar instanceof a59.f.b) {
            a59.f.b bVar = (a59.f.b) fVar;
            textView2.setText(v49Var.a(bVar.c));
            textView2.setContentDescription(((coo) v49Var.c).c((int) TimeUnit.MILLISECONDS.toSeconds(bVar.c)));
            bwt0.p0(textView2, true);
        } else if (fVar instanceof a59.f.d) {
            bwt0.p0(textView2, false);
        } else if (fVar instanceof a59.f.e) {
            bwt0.p0(textView2, false);
        } else {
            if (!(fVar instanceof a59.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(textView2, false);
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
