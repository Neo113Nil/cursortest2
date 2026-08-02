package com.yandex.messaging.internal.view.timeline;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import defpackage.lhc;
import defpackage.ulz;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"com/yandex/messaging/internal/view/timeline/MessageSpanCreator$createBotCommandClickableSpan$1", "Landroid/text/style/ClickableSpan;", "Lulz;", "Landroid/view/View;", "widget", "Lzy11;", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "textPaint", "updateDrawState", "(Landroid/text/TextPaint;)V", "", "getHighlightColor", "()I", "onLongClick", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageSpanCreator$createBotCommandClickableSpan$1 extends ClickableSpan implements ulz {
    final /* synthetic */ String $command;
    final /* synthetic */ l this$0;

    public MessageSpanCreator$createBotCommandClickableSpan$1(l lVar, String str) {
        this.this$0 = lVar;
        this.$command = str;
    }

    @Override // defpackage.ulz
    public int getHighlightColor() {
        return lhc.f(this.this$0.c, 51);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        this.this$0.a.e(this.$command);
    }

    @Override // defpackage.ulz
    public void onLongClick(View widget) {
        this.this$0.a.h(this.$command);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.this$0.c);
    }
}
