package com.yandex.plus.home.plaque.repository.graphql.formatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import defpackage.g49;
import defpackage.gds0;
import defpackage.i3y;
import defpackage.n39;
import defpackage.vfd;
import defpackage.we8;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/yandex/plus/home/plaque/repository/graphql/formatter/CashbackSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Ln39;", "drawDelegate$delegate", "Li3y;", "getDrawDelegate", "()Ln39;", "drawDelegate", "Companion", "g49", "plus-home-plaque-repository-graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CashbackSpan extends ReplacementSpan {
    private static final g49 Companion = new g49();

    @Deprecated
    public static final int MAX_ALPHA = 255;
    private final Rect rect = new Rect();

    /* renamed from: drawDelegate$delegate, reason: from kotlin metadata */
    private final i3y drawDelegate = a.a(new we8(18));

    /* JADX INFO: Access modifiers changed from: private */
    public static final n39 drawDelegate_delegate$lambda$0() {
        PlusSdkBrandType plusSdkBrandType = PlusSdkBrandType.YANDEX;
        return plusSdkBrandType == PlusSdkBrandType.YANGO ? new vfd() : new gds0(plusSdkBrandType);
    }

    private final n39 getDrawDelegate() {
        return (n39) this.drawDelegate.getValue();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        if (this.rect.isEmpty()) {
            paint.getTextBounds(text.toString(), start, end, this.rect);
            n39 drawDelegate = getDrawDelegate();
            Rect rect = this.rect;
            drawDelegate.a(rect.left, rect.top, rect.right, rect.bottom);
        }
        paint.setAlpha(255);
        getDrawDelegate().b(canvas, text, start, end, x, y, this.rect.top + y, paint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return CashbackSpan.class.equals(other != null ? other.getClass() : null);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        if (fm != null) {
            paint.getFontMetricsInt(fm);
        }
        return (int) Math.ceil(paint.measureText(text, start, end));
    }

    public int hashCode() {
        return CashbackSpan.class.hashCode();
    }
}
