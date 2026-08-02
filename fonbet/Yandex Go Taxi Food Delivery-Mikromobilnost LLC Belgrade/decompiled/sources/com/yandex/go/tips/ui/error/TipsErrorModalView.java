package com.yandex.go.tips.ui.error;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.dlh0;
import defpackage.e230;
import defpackage.ii3;
import defpackage.mqg0;
import defpackage.n2v0;
import defpackage.oew0;
import defpackage.qu;
import defpackage.rp31;
import defpackage.sfz0;
import defpackage.t8h0;
import defpackage.xw31;
import defpackage.y130;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0018B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/tips/ui/error/TipsErrorModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lsfz0;", "callback", "<init>", "(Landroid/content/Context;Lsfz0;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "Lsfz0;", "content", "Landroid/view/View;", "Landroid/widget/TextView;", "error", "Landroid/widget/TextView;", "done", "tfz0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsErrorModalView extends ModalView {
    private final sfz0 callback;
    private final View content;
    private final View done;
    private final TextView error;

    public TipsErrorModalView(Context context, sfz0 sfz0Var) {
        super(context);
        this.callback = sfz0Var;
        c.q(this, dlh0.fragment_error_deeplink, true);
        int i = t8h0.content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        this.error = (TextView) ((View) rp31.d(this, t8h0.error_text));
        this.done = (View) rp31.d(this, t8h0.done);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1$0(TipsErrorModalView tipsErrorModalView) {
        ((ii3) ((n2v0) tipsErrorModalView.callback).b).r(new qu(9));
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(3, null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        TextView textView = this.error;
        Context context = textView.getContext();
        Drawable drawable = textView.getCompoundDrawablesRelative()[1];
        Rect rect = xw31.a;
        if (drawable != null) {
            drawable.setColorFilter(context.getColor(mqg0.component_accent_color), PorterDuff.Mode.MULTIPLY);
        }
        c.z(new oew0(29, this), this.done);
    }
}
