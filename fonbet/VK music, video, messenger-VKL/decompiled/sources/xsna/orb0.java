package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.PhotoStripView;
import com.vk.dto.polls.Poll;
import com.vk.lists.ListDataSet;
import com.vk.poll.fragments.PollResultsFragment;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: PollResultsAdapter.kt */
/* loaded from: classes4.dex */
public final class orb0 extends zoj0<aqb0, RecyclerView.e0> {
    public final Poll e;
    public final PollResultsFragment.c f;
    public com.vk.dto.polls.a g;

    public orb0(Poll poll, PollResultsFragment.c cVar) {
        this.e = poll;
        this.f = cVar;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        uuk uukVar = this.c;
        if (((ListDataSet) uukVar).d.isEmpty()) {
            return 0;
        }
        return ((ListDataSet) uukVar).d.size() + 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 3;
        }
        uuk uukVar = this.c;
        if (i == ((ListDataSet) uukVar).d.size() + 2) {
            return 3;
        }
        return i - 2 < ((ListDataSet) uukVar).d.size() ? 1 : 2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, xsna.aqb0] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        zpb0 zpb0Var;
        boolean z;
        Set<Long> set;
        int i2 = i - 2;
        boolean z2 = e0Var instanceof irb0;
        Poll poll = this.e;
        if (!z2) {
            if (e0Var instanceof krb0) {
                ((krb0) e0Var).V5(poll);
                return;
            } else {
                if (e0Var instanceof jrb0) {
                    jrb0 jrb0Var = (jrb0) e0Var;
                    com.vk.dto.polls.a aVar = this.g;
                    jrb0Var.V5(aVar != null ? Integer.valueOf(aVar.a.a) : null);
                    return;
                }
                return;
            }
        }
        ?? r3 = (aqb0) j5g.b0(i2, ((ListDataSet) this.c).d);
        if (r3 != 0) {
            int i3 = r3.c;
            irb0 irb0Var = (irb0) e0Var;
            com.vk.dto.polls.a aVar2 = this.g;
            zpb0 zpb0Var2 = aVar2 != null ? aVar2.a : null;
            View view = irb0Var.p;
            AppCompatTextView appCompatTextView = irb0Var.o;
            TextView textView = irb0Var.r;
            PhotoStripView photoStripView = irb0Var.q;
            boolean z3 = poll.i;
            irb0Var.m = r3;
            float f = r3.d;
            boolean z4 = false;
            if (zpb0Var2 == null || (set = zpb0Var2.b) == null) {
                zpb0Var = zpb0Var2;
                z = false;
            } else {
                zpb0Var = zpb0Var2;
                z = set.contains(Long.valueOf(r3.a));
            }
            appCompatTextView.setText(String.format("%.0f\u2009%%", Arrays.copyOf(new Object[]{Float.valueOf(Math.round(f))}, 1)));
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(z ? uko.d(R.drawable.vk_icon_done_16, R.color.vk_blue_400, irb0Var.itemView.getContext()) : null, (Drawable) null, (Drawable) null, (Drawable) null);
            irb0Var.n.setText(r3.b);
            photoStripView.setPadding(iah0.a(2));
            photoStripView.setOverlapOffset(0.8f);
            if (i3 > 0) {
                photoStripView.setVisibility(0);
                textView.setVisibility(0);
                List A = rli0.A(rli0.y(rli0.m(new ulp0(new i5g(r3.e), new ekh(zpb0Var, 28))), 5));
                ViewGroup.LayoutParams layoutParams = photoStripView.getLayoutParams();
                f4m.s(A.isEmpty() ? 0 : iah0.a(8), textView);
                layoutParams.width = A.isEmpty() ? 0 : -2;
                photoStripView.setLayoutParams(layoutParams);
                photoStripView.l(-1, A);
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                textView.setText(enj.f(R.plurals.num_poll_votes, i3, context));
                if (!z3) {
                    hrb0 hrb0Var = new hrb0(new Drawable[]{m33.a(R.drawable.vk_icon_chevron_16, irb0Var.itemView.getContext())});
                    hrb0Var.setTint(dhr0.t.c(R.attr.vk_ui_icon_secondary));
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, hrb0Var, (Drawable) null);
                }
            } else {
                photoStripView.setVisibility(8);
                textView.setVisibility(8);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            Drawable background = view.getBackground();
            if (!(background instanceof mrb0)) {
                background = new mrb0();
            }
            int round = Math.round((f / 100) * 10000);
            mrb0 mrb0Var = (mrb0) background;
            if (mrb0Var.getLevel() != round) {
                mrb0Var.a(0, false);
            }
            mrb0Var.a(round, true);
            view.setBackground(background);
            View view2 = irb0Var.itemView;
            if (i3 > 0 && !z3) {
                z4 = true;
            }
            view2.setClickable(z4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new krb0(viewGroup);
        }
        if (i == 1) {
            return new irb0(viewGroup, this.f);
        }
        if (i == 2) {
            return new jrb0(viewGroup);
        }
        if (i == 3) {
            return new nrb0(viewGroup, R.layout.poll_result_space_view, 0);
        }
        throw new IllegalStateException(tgw.b(i, "Unsupported view type ", ", check it!"));
    }
}
