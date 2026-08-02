package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vkontakte.android.attachments.ShitAttachment;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdHolder.kt */
/* loaded from: classes4.dex */
public abstract class wf0 extends qi6<ShitAttachment> implements w8i {
    public final Object C;
    public final Object D;

    public wf0(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        ka0 ka0Var = new ka0(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.C = msy.a(lazyThreadSafetyMode, ka0Var);
        this.D = msy.a(lazyThreadSafetyMode, new vf0(this, 0));
    }

    public final void R6(AdClickContext adClickContext) {
        Context context = this.itemView.getContext();
        ShitAttachment q6 = q6();
        if (q6 == null) {
            return;
        }
        u1c0 J0 = J0();
        hd60.a().r0(context, q6, J0 != null ? J0.k : -1, adClickContext);
    }
}
