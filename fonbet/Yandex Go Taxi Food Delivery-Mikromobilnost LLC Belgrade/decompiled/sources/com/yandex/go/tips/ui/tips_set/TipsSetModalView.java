package com.yandex.go.tips.ui.tips_set;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.tips.ui.TipsView;
import defpackage.bhz0;
import defpackage.chz0;
import defpackage.dlh0;
import defpackage.e230;
import defpackage.fga0;
import defpackage.jfz0;
import defpackage.n2v0;
import defpackage.rp31;
import defpackage.t8h0;
import defpackage.to31;
import defpackage.y130;
import defpackage.zgz0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lcom/yandex/go/tips/ui/tips_set/TipsSetModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lbhz0;", "Lchz0;", "presenter", "Landroid/content/Context;", "context", "<init>", "(Lchz0;Landroid/content/Context;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", "Ljfz0;", "tips", "renderTips", "(Ljava/util/List;)V", "onBackPressed", "Lchz0;", "content", "Landroid/view/View;", "Lcom/yandex/go/tips/ui/TipsView;", "tipsView", "Lcom/yandex/go/tips/ui/TipsView;", "doneButton", "ahz0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsSetModalView extends ModalView implements bhz0 {
    private final View content;
    private final View doneButton;
    private final chz0 presenter;
    private final TipsView tipsView;

    public TipsSetModalView(chz0 chz0Var, Context context) {
        super(context);
        this.presenter = chz0Var;
        c.q(this, dlh0.set_tips_after_card_fragment, true);
        int i = t8h0.content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        this.tipsView = (TipsView) ((View) rp31.d(this, t8h0.tips_view));
        this.doneButton = (View) rp31.d(this, t8h0.done);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(TipsSetModalView tipsSetModalView, jfz0 jfz0Var, boolean z) {
        chz0 chz0Var = tipsSetModalView.presenter;
        chz0Var.D = jfz0Var;
        int parseInt = Integer.parseInt(jfz0Var.f);
        ((bhz0) chz0Var.Dg()).renderTips(chz0Var.x.a(parseInt));
        ((fga0) chz0Var.y).D(parseInt);
        chz0Var.A.c(Integer.valueOf(Integer.parseInt(jfz0Var.f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(TipsSetModalView tipsSetModalView) {
        String str;
        chz0 chz0Var = tipsSetModalView.presenter;
        jfz0 jfz0Var = chz0Var.D;
        if (jfz0Var != null && (str = jfz0Var.f) != null) {
            chz0Var.A.a(Integer.valueOf(Integer.parseInt(str)));
        }
        chz0Var.C.d("deeplink_tips");
        chz0Var.Hg();
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
        chz0 chz0Var = this.presenter;
        chz0Var.Bg(this);
        chz0Var.C.i("deeplink_tips", false);
        to31 to31Var = chz0Var.B;
        to31Var.getClass();
        to31Var.a.a("view.tips", new HashMap(), 1, new HashMap());
        ((bhz0) chz0Var.Dg()).renderTips(chz0Var.x.a(((fga0) chz0Var.y).s()));
        this.tipsView.setButtonToggledListener(new n2v0(22, this));
        c.z(new zgz0(0, this), this.doneButton);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        chz0 chz0Var = this.presenter;
        chz0Var.A.b();
        chz0Var.Hg();
        super.onBackPressed();
    }

    @Override // defpackage.bhz0
    public void renderTips(List<jfz0> tips) {
        this.tipsView.setModelsGroup(tips);
    }
}
