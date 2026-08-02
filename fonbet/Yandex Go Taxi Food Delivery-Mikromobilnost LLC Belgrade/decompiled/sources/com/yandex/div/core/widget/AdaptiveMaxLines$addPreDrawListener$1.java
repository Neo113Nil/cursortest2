package com.yandex.div.core.widget;

import android.text.TextUtils;
import defpackage.o80;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdaptiveMaxLines$addPreDrawListener$1 extends Lambda implements sls {
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveMaxLines$addPreDrawListener$1(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = this.this$0;
        o80 o80Var = aVar.e;
        if (o80Var != null && !TextUtils.isEmpty(aVar.a.getText())) {
            a aVar2 = this.this$0;
            boolean z = false;
            if (aVar2.f) {
                aVar2.b();
                this.this$0.f = false;
                return Boolean.TRUE;
            }
            int lineCount = this.this$0.a.getLineCount();
            int i = o80Var.a;
            Integer num = lineCount > o80Var.b + i ? null : Integer.MAX_VALUE;
            if (num != null) {
                i = num.intValue();
            }
            int maxLines = this.this$0.a.getMaxLines();
            a aVar3 = this.this$0;
            if (i != maxLines) {
                aVar3.a.setMaxLines(i);
                this.this$0.f = true;
            } else {
                aVar3.b();
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.TRUE;
    }
}
