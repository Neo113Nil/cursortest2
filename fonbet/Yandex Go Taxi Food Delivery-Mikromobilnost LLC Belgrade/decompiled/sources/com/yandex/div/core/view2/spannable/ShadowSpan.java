package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import defpackage.kgr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/view2/spannable/ShadowSpan;", "Landroid/text/style/CharacterStyle;", "Lkgr0;", "shadow", "<init>", "(Lkgr0;)V", "Landroid/text/TextPaint;", "tp", "Lzy11;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lkgr0;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShadowSpan extends CharacterStyle {
    private final kgr0 shadow;

    public ShadowSpan(kgr0 kgr0Var) {
        this.shadow = kgr0Var;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        kgr0 kgr0Var = this.shadow;
        if (tp != null) {
            tp.setShadowLayer(kgr0Var.c, kgr0Var.a, kgr0Var.b, kgr0Var.d);
        }
    }
}
