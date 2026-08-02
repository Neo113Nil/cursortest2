package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.bricks.BrickSlotView;
import com.yandex.dsl.views.TextViewKt$textView$$inlined$view$1;
import com.yandex.dsl.views.a;
import com.yandex.dsl.views.layouts.FrameLayoutBuilder;
import com.yandex.messaging.input.InputDispatcherBrick$BrickUi$special$$inlined$brickSlotView$default$1;
import com.yandex.messaging.ui.auth.ProgressUi$layout$lambda$2$$inlined$imageView$default$1;

/* loaded from: classes15.dex */
public final class nyv extends a {
    public final /* synthetic */ int c;
    public final Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nyv(Activity activity, int i) {
        super(activity);
        this.c = i;
        switch (i) {
            case 1:
                super(activity);
                this.w = AnimatedVectorDrawableCompat.create(activity, wwg0.msg_ic_connection_progress_chat_list);
                break;
            default:
                int i2 = e9h0.chat_input_slot;
                View view = (View) InputDispatcherBrick$BrickUi$special$$inlined$brickSlotView$default$1.b.invoke(jh91.e(0, activity), 0, 0);
                if (i2 != -1) {
                    view.setId(i2);
                }
                if (this instanceof kzx) {
                    ((kzx) this).addToParent(view);
                }
                this.w = (BrickSlotView) view;
                break;
        }
    }

    @Override // com.yandex.dsl.views.a
    public final View a(jp31 jp31Var) {
        int i = this.c;
        Object obj = this.w;
        switch (i) {
            case 0:
                FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
                if (jp31Var instanceof kzx) {
                    ((kzx) jp31Var).addToParent(frameLayoutBuilder);
                }
                frameLayoutBuilder.invoke((BrickSlotView) obj, new myv(frameLayoutBuilder, 0));
                return frameLayoutBuilder;
            case 1:
                FrameLayoutBuilder frameLayoutBuilder2 = new FrameLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
                if (jp31Var instanceof kzx) {
                    ((kzx) jp31Var).addToParent(frameLayoutBuilder2);
                }
                frameLayoutBuilder2.setBackgroundColor(fxa1.c(jng0.messagingCommonBackgroundColor, frameLayoutBuilder2.getContext()).data);
                View view = (View) ProgressUi$layout$lambda$2$$inlined$imageView$default$1.b.invoke(jh91.e(0, frameLayoutBuilder2.getCtx()), 0, 0);
                frameLayoutBuilder2.addToParent(view);
                ImageView imageView = (ImageView) view;
                ViewGroup.LayoutParams generateLayoutParams = frameLayoutBuilder2.generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
                layoutParams.width = kjs0.b(48);
                layoutParams.height = kjs0.b(48);
                layoutParams.gravity = 17;
                Drawable drawable = (AnimatedVectorDrawableCompat) obj;
                if (drawable == null) {
                    drawable = new EmptyDrawable(0, 0);
                }
                imageView.setImageDrawable(drawable);
                imageView.setLayoutParams(generateLayoutParams);
                return frameLayoutBuilder2;
            default:
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                View view2 = (View) TextViewKt$textView$$inlined$view$1.b.invoke(jh91.e(0, jp31Var.getCtx()), 0, 0);
                if (jp31Var instanceof kzx) {
                    ((kzx) jp31Var).addToParent(view2);
                }
                TextView textView = (TextView) view2;
                String message = illegalArgumentException.getMessage();
                if (message == null) {
                    message = illegalArgumentException.toString();
                }
                textView.setText(message);
                textView.setGravity(16);
                textView.setTextColor(-16776961);
                int b = kjs0.b(16);
                textView.setPadding(b, b, b, b);
                textView.setTextSize(24.0f);
                return textView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyv(Context context, IllegalArgumentException illegalArgumentException) {
        super(context);
        this.c = 2;
        this.w = illegalArgumentException;
    }
}
