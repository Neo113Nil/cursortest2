package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.roundabout.c0;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.wj91;
import defpackage.x4h0;

/* loaded from: classes2.dex */
public final class b extends t2y {
    public final TextView c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Activity activity) {
        super(activity);
        View view = (View) AccountListBottomButtonUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (this instanceof lzx) {
            ((lzx) this).addToParent(view);
        }
        TextView textView = (TextView) view;
        textView.setBackgroundResource(R.drawable.passport_roundabout_account);
        textView.setId(R.id.passport_roundabout_add_new_title);
        c0.c.getClass();
        textView.setTextSize(16.0f);
        li91.l(textView, R.color.passport_roundabout_text_primary);
        li91.k(textView, x4h0.ys_text_medium);
        textView.setGravity(17);
        this.c = textView;
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        frameLayoutBuilder.invoke(this.c, new a(frameLayoutBuilder, 0));
        return frameLayoutBuilder;
    }
}
