package com.yandex.messaging.internal.view.timeline;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import defpackage.f3c;
import defpackage.jcz0;
import defpackage.llt0;

/* loaded from: classes15.dex */
public final class l implements llt0 {
    public final jcz0 a;
    public final f3c b;
    public int c;

    public l(jcz0 jcz0Var, f3c f3cVar) {
        this.a = jcz0Var;
        this.b = f3cVar;
    }

    @Override // defpackage.llt0
    public final Object d(final String str) {
        return new ClickableSpan() { // from class: com.yandex.messaging.internal.view.timeline.MessageSpanCreator$createMentionClickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                l.this.a.n(str);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                textPaint.setColor(l.this.c);
            }
        };
    }

    @Override // defpackage.llt0
    public final Object f(String str) {
        return new MessageSpanCreator$createBotCommandClickableSpan$1(this, str);
    }

    @Override // defpackage.llt0
    public final Object x(Uri uri, boolean z) {
        return new MessageSpanCreator$UrlSpan(this, uri, z);
    }
}
