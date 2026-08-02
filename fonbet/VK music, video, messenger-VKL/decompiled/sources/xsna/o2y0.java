package xsna;

import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.Peer;
import com.vk.im.chat.restriction.impl.domain.WriteRestrictionAction;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WriteRestrictionActionController.kt */
/* loaded from: classes2.dex */
public final class o2y0 {
    public final long a;
    public final Peer b;
    public final w2y0 c;
    public final v2y0 d;
    public final bzb0 e;
    public WriteRestrictionAction f;
    public final hpj g;

    /* compiled from: WriteRestrictionActionController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteRestrictionAction.values().length];
            try {
                iArr[WriteRestrictionAction.DISABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteRestrictionAction.ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o2y0(long j, Peer peer, w2y0 w2y0Var, v2y0 v2y0Var, bzb0 bzb0Var) {
        this.a = j;
        this.b = peer;
        this.c = w2y0Var;
        this.d = v2y0Var;
        this.e = bzb0Var;
        bdn bdnVar = bdn.a;
        hpj a2 = zvj.a(ie00.a.plus(whn0.a()));
        this.g = a2;
        myc0.h(a2, null, null, new p2y0(this, null), 3);
    }

    public static final void a(o2y0 o2y0Var, WriteRestrictionAction writeRestrictionAction) {
        w2y0 w2y0Var = o2y0Var.c;
        ShimmerFrameLayout shimmerFrameLayout = w2y0Var.a;
        shimmerFrameLayout.setVisibility(8);
        shimmerFrameLayout.e();
        ImageView imageView = w2y0Var.b;
        imageView.setVisibility(0);
        TextView textView = w2y0Var.c;
        textView.setVisibility(0);
        o2y0Var.f = writeRestrictionAction;
        int i = a.$EnumSwitchMapping$0[writeRestrictionAction.ordinal()];
        if (i == 1) {
            imageView.setImageDrawable(krv0.f(R.drawable.vk_icon_message_cross_outline_28, R.attr.vk_ui_icon_accent, imageView.getContext()));
            textView.setText(R.string.vkim_msg_ban_user);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setImageDrawable(krv0.f(R.drawable.vk_icon_message_check_outline_28, R.attr.vk_ui_icon_accent, imageView.getContext()));
            textView.setText(R.string.vkim_msg_unban_user);
        }
    }
}
