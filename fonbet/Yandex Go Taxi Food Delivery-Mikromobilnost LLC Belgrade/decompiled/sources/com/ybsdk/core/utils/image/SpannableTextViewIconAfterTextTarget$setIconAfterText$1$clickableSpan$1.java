package com.ybsdk.core.utils.image;

import android.text.style.ClickableSpan;
import android.view.View;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/core/utils/image/SpannableTextViewIconAfterTextTarget$setIconAfterText$1$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "Lzy11;", "onClick", "(Landroid/view/View;)V", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SpannableTextViewIconAfterTextTarget$setIconAfterText$1$clickableSpan$1 extends ClickableSpan {
    final /* synthetic */ sls $action;

    public SpannableTextViewIconAfterTextTarget$setIconAfterText$1$clickableSpan$1(sls slsVar) {
        this.$action = slsVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        this.$action.invoke();
    }
}
