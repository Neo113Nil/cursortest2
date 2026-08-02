package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.lightside.cookies.android.views.SimpleViewStub;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.roundabout.CustomLogoSlab$ui$lambda$0$$inlined$imageView$default$1;
import com.yandex.passport.internal.ui.bouncer.roundabout.WhiteLabelLogoSlab$ui$lambda$1$$inlined$textView$default$1;

/* loaded from: classes2.dex */
public final class nns0 extends t2y {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nns0(Context context, int i) {
        super(context);
        this.c = i;
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        switch (this.c) {
            case 0:
                SimpleViewStub simpleViewStub = new SimpleViewStub(kp31Var.getCtx(), null, 0, 6, null);
                simpleViewStub.setVisibility(8);
                return simpleViewStub;
            case 1:
                FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
                if (kp31Var instanceof lzx) {
                    ((lzx) kp31Var).addToParent(frameLayoutBuilder);
                }
                frameLayoutBuilder.setBackgroundColor(0);
                return frameLayoutBuilder;
            case 2:
                View view = (View) CustomLogoSlab$ui$lambda$0$$inlined$imageView$default$1.b.invoke(wj91.e(0, kp31Var.getCtx()), 0, 0);
                if (kp31Var instanceof lzx) {
                    ((lzx) kp31Var).addToParent(view);
                }
                return (ImageView) view;
            default:
                View view2 = (View) WhiteLabelLogoSlab$ui$lambda$1$$inlined$textView$default$1.b.invoke(wj91.e(0, kp31Var.getCtx()), 0, 0);
                if (kp31Var instanceof lzx) {
                    ((lzx) kp31Var).addToParent(view2);
                }
                TextView textView = (TextView) view2;
                textView.setTextSize(24.0f);
                li91.l(textView, R.color.passport_roundabout_text_primary);
                li91.k(textView, e5h0.ya_bold);
                textView.setText(R.string.passport_accounts);
                return textView;
        }
    }
}
