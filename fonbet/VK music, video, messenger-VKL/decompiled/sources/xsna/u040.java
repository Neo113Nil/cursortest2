package xsna;

import android.content.Context;
import com.vk.im.ui.views.msg.MsgStatus;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MsgTimeWithStatusIndicatorWidthCalculator.kt */
/* loaded from: classes2.dex */
public final class u040 {
    public final Context a;
    public final t040 b;
    public final bpn0 c = new bpn0(new qfj(this, 21));
    public final bpn0 d = new bpn0(new w4u(this, 14));
    public final ConcurrentHashMap<MsgStatus, Integer> e = new ConcurrentHashMap<>();
    public final StringBuilder f = new StringBuilder();

    public u040(Context context, t040 t040Var) {
        this.a = context;
        this.b = t040Var;
    }
}
