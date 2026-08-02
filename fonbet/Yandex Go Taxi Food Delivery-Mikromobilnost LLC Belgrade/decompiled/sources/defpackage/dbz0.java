package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.dsl.views.a;
import com.yandex.dsl.views.layouts.FrameLayoutBuilder;
import com.yandex.dsl.views.layouts.LinearLayoutBuilder;
import com.yandex.messaging.ui.timeline.TimelineErrorUi$layout$lambda$4$lambda$3$$inlined$textView$default$1;
import com.yandex.messaging.ui.timeline.TimelineErrorUi$layout$lambda$4$lambda$3$$inlined$textView$default$2;

/* loaded from: classes15.dex */
public final class dbz0 extends a {
    public int c;

    @Override // com.yandex.dsl.views.a
    public final View a(jp31 jp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
        if (jp31Var instanceof kzx) {
            ((kzx) jp31Var).addToParent(frameLayoutBuilder);
        }
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(jh91.e(0, frameLayoutBuilder.getCtx()), 0, 0);
        frameLayoutBuilder.addToParent(linearLayoutBuilder);
        linearLayoutBuilder.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        linearLayoutBuilder.setLayoutParams(layoutParams);
        View view = (View) TimelineErrorUi$layout$lambda$4$lambda$3$$inlined$textView$default$1.b.invoke(jh91.e(w0i0.Messaging_Text, linearLayoutBuilder.getCtx()), 0, 0);
        linearLayoutBuilder.addToParent(view);
        TextView textView = (TextView) view;
        textView.setText(oyh0.messaging_chat_open_fail_title);
        textView.setGravity(17);
        View view2 = (View) TimelineErrorUi$layout$lambda$4$lambda$3$$inlined$textView$default$2.b.invoke(jh91.e(w0i0.Messaging_Text_Body2, linearLayoutBuilder.getCtx()), 0, 0);
        linearLayoutBuilder.addToParent(view2);
        TextView textView2 = (TextView) view2;
        textView2.setText(this.c);
        textView2.setGravity(17);
        textView2.setPadding(textView2.getPaddingLeft(), kjs0.b(4), textView2.getPaddingRight(), textView2.getPaddingBottom());
        linearLayoutBuilder.setPadding(kjs0.b(32), linearLayoutBuilder.getPaddingTop(), linearLayoutBuilder.getPaddingRight(), linearLayoutBuilder.getPaddingBottom());
        linearLayoutBuilder.setPadding(linearLayoutBuilder.getPaddingLeft(), linearLayoutBuilder.getPaddingTop(), kjs0.b(33), linearLayoutBuilder.getPaddingBottom());
        return frameLayoutBuilder;
    }
}
