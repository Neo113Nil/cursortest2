package xsna;

import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.kro0;

/* compiled from: ThreadShowMoreHolder.kt */
/* loaded from: classes16.dex */
public final class jro0 extends vfz<kro0> {
    public final a l;
    public final ProgressBar m;
    public final TextView n;
    public kro0 o;

    /* compiled from: ThreadShowMoreHolder.kt */
    public interface a {
        void j(int i);
    }

    public jro0(View view, e.a aVar) {
        super(view);
        this.l = aVar;
        jjc.g(this.itemView, new l850(this, 20));
        this.m = (ProgressBar) view.findViewById(R.id.im_thread_show_more_progress);
        this.n = (TextView) view.findViewById(R.id.im_thread_show_more_text);
    }

    @Override // xsna.vfz
    public final void W5(kro0 kro0Var) {
        kro0 kro0Var2 = kro0Var;
        this.o = kro0Var2;
        boolean z = kro0Var2 instanceof kro0.b;
        ProgressBar progressBar = this.m;
        TextView textView = this.n;
        if (z) {
            Resources b6 = b6();
            int i = ((kro0.b) kro0Var2).d;
            textView.setText(b6.getQuantityString(R.plurals.vkim_post_comments_thread_show_more, i, Integer.valueOf(i)));
            textView.setVisibility(0);
            progressBar.setVisibility(8);
            return;
        }
        if (kro0Var2 instanceof kro0.a) {
            textView.setVisibility(8);
            progressBar.setVisibility(0);
        } else {
            if (!(kro0Var2 instanceof kro0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            textView.setText(((kro0.c) kro0Var2).d);
            textView.setVisibility(0);
            progressBar.setVisibility(8);
        }
    }
}
