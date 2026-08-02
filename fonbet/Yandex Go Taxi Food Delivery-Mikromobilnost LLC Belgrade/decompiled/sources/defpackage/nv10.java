package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.input.voice.reply.a;
import com.yandex.messaging.internal.view.timeline.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class nv10 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv10 b;

    public /* synthetic */ nv10(pv10 pv10Var, int i) {
        this.a = i;
        this.b = pv10Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        pv10 pv10Var = this.b;
        switch (i) {
            case 0:
                return (BrickSlotView) ((ConstraintLayout) pv10Var.F.a()).findViewById(e9h0.reply_voice_slot);
            case 1:
                z83.i();
                ConstraintLayout constraintLayout = (ConstraintLayout) pv10Var.F.a();
                constraintLayout.setOnClickListener(new zgv(15, pv10Var));
                return new ov10((TextView) constraintLayout.findViewById(e9h0.reply_author), constraintLayout.findViewById(e9h0.reply_line), (TextView) constraintLayout.findViewById(e9h0.reply_text), (ImageView) constraintLayout.findViewById(e9h0.reply_image), (ImageView) constraintLayout.findViewById(e9h0.reply_quote_icon));
            case 2:
                return new u0r(pv10Var.a.getContext(), pv10Var.a().d, pv10Var.z);
            default:
                return (a) ((c) pv10Var.b.b).e0().h.get();
        }
    }
}
