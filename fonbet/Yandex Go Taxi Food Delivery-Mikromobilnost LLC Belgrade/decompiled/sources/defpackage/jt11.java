package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lightside.visum.TextViewKt$textView$$inlined$view$1;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.yandex.passport.internal.ui.bouncer.roundabout.YandexLogoSlab$ui$lambda$1$$inlined$imageView$default$1;
import com.yandex.passport.internal.ui.bouncer.roundabout.e0;
import com.yandex.passport.internal.ui.bouncer.roundabout.v;

/* loaded from: classes11.dex */
public final class jt11 extends t2y {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt11(Context context, int i, Object obj) {
        super(context);
        this.c = i;
        this.w = obj;
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        int i = this.c;
        Object obj = this.w;
        switch (i) {
            case 0:
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                View view = (View) TextViewKt$textView$$inlined$view$1.b.invoke(wj91.e(0, kp31Var.getCtx()), 0, 0);
                if (kp31Var instanceof lzx) {
                    ((lzx) kp31Var).addToParent(view);
                }
                TextView textView = (TextView) view;
                String message = illegalArgumentException.getMessage();
                if (message == null) {
                    message = illegalArgumentException.toString();
                }
                textView.setText(message);
                textView.setGravity(16);
                textView.setTextColor(-16776961);
                int i2 = (int) (16.0f * uc20.a.density);
                textView.setPadding(i2, i2, i2, i2);
                textView.setTextSize(24.0f);
                return textView;
            case 1:
                FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
                if (kp31Var instanceof lzx) {
                    ((lzx) kp31Var).addToParent(frameLayoutBuilder);
                }
                View view2 = ((v) obj).M.a;
                wj91.e(0, frameLayoutBuilder.getCtx());
                frameLayoutBuilder.addToParent(view2);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -1);
                }
                view2.setLayoutParams(layoutParams);
                return frameLayoutBuilder;
            default:
                View view3 = (View) YandexLogoSlab$ui$lambda$1$$inlined$imageView$default$1.b.invoke(wj91.e(0, kp31Var.getCtx()), 0, 0);
                if (kp31Var instanceof lzx) {
                    ((lzx) kp31Var).addToParent(view3);
                }
                ImageView imageView = (ImageView) view3;
                imageView.setImageResource(((e0) obj).m());
                return imageView;
        }
    }
}
