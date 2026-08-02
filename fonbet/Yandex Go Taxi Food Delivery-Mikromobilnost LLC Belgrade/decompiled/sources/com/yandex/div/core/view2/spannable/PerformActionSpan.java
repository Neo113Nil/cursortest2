package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.yandex.div.core.view2.divs.c;
import defpackage.aw5;
import defpackage.v3k;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/view2/spannable/PerformActionSpan;", "Landroid/text/style/ClickableSpan;", "Law5;", "bindingContext", "", "Lv3k;", "actions", "<init>", "(Law5;Ljava/util/List;)V", "Landroid/view/View;", "view", "Lzy11;", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "paint", "updateDrawState", "(Landroid/text/TextPaint;)V", "Law5;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/yandex/div/core/view2/divs/c;", "getActionBinder", "()Lcom/yandex/div/core/view2/divs/c;", "actionBinder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PerformActionSpan extends ClickableSpan {
    private final List<v3k> actions;
    private final aw5 bindingContext;

    public PerformActionSpan(aw5 aw5Var, List<v3k> list) {
        this.bindingContext = aw5Var;
        this.actions = list;
    }

    private final c getActionBinder() {
        return this.bindingContext.a.getDiv2Component().o();
    }

    public final List<v3k> getActions() {
        return this.actions;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        getActionBinder().a(this.bindingContext, view, this.actions);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
    }
}
