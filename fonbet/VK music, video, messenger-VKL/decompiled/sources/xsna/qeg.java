package xsna;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.channels.api.CommentsHistory;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommentsHeaderHolder.kt */
/* loaded from: classes16.dex */
public final class qeg extends vfz<reg> {
    public final TextView l;
    public final TextView m;
    public final ProgressBar n;
    public reg o;

    /* compiled from: CommentsHeaderHolder.kt */
    public interface a {
        void g(CommentsHistory.Order order);
    }

    /* compiled from: CommentsHeaderHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommentsHistory.Order.values().length];
            try {
                iArr[CommentsHistory.Order.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentsHistory.Order.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qeg(View view, e.a aVar) {
        super(view);
        this.l = (TextView) view.findViewById(R.id.im_comments_count);
        TextView textView = (TextView) view.findViewById(R.id.im_comments_order);
        this.m = textView;
        this.n = (ProgressBar) view.findViewById(R.id.im_order_progress);
        bwt0.i0(textView, new com.vk.im.engine.commands.messages.a(13, this, aVar));
    }

    @Override // xsna.vfz
    public final void W5(reg regVar) {
        int i;
        reg regVar2 = regVar;
        this.o = regVar2;
        int i2 = regVar2.b;
        this.l.setText(b6().getQuantityString(R.plurals.vkim_comments_count, i2, uqm0.o(i2)));
        boolean z = regVar2.d;
        ProgressBar progressBar = this.n;
        TextView textView = this.m;
        if (z) {
            progressBar.setVisibility(0);
            textView.setVisibility(4);
            return;
        }
        progressBar.setVisibility(8);
        textView.setVisibility(0);
        int i3 = b.$EnumSwitchMapping$0[regVar2.c.ordinal()];
        if (i3 == 1) {
            i = R.string.vkim_channel_comments_order_acs;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.vkim_channel_comments_order_desc;
        }
        textView.setText(i);
    }
}
