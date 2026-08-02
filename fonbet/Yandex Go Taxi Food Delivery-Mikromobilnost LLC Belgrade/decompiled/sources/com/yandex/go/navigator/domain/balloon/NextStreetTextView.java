package com.yandex.go.navigator.domain.balloon;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.mapkit.styling.automotivenavigation.R;
import defpackage.evu0;
import defpackage.m760;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/go/navigator/domain/balloon/NextStreetTextView;", "Lcom/yandex/go/navigator/domain/balloon/TightTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateTextSize", "()V", "", "newText", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "value", "maximumWidth", CA20Status.STATUS_USER_I, "getMaximumWidth", "()I", "setMaximumWidth", "(I)V", "maximumLines", "getMaximumLines", "setMaximumLines", "", "minTextSize", "F", "maxTextSize", "", "", "words", "Ljava/util/List;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NextStreetTextView extends TightTextView {
    public static final int $stable = 8;
    private final float maxTextSize;
    private int maximumLines;
    private int maximumWidth;
    private final float minTextSize;
    private List<String> words;

    public NextStreetTextView(Context context) {
        super(context);
        this.maximumLines = 1;
        this.minTextSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_textsize_nextstreet_min);
        this.maxTextSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_textsize_nextstreet_max);
        setIncludeFontPadding(false);
    }

    private static final zy11 onMeasure$lambda$0(NextStreetTextView nextStreetTextView, int i, int i2) {
        nextStreetTextView.setSingleLine(true);
        super.onMeasure(i, i2);
        return zy11.a;
    }

    private final void updateTextSize() {
        CharSequence text = getText();
        if (text != null) {
            setTextSize(0, this.maxTextSize);
            if (getPaint().measureText(text.toString()) > this.maximumWidth) {
                setTextSize(0, this.minTextSize);
            }
        }
    }

    public final int getMaximumLines() {
        return this.maximumLines;
    }

    public final int getMaximumWidth() {
        return this.maximumWidth;
    }

    @Override // com.yandex.go.navigator.domain.balloon.TightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = this.maximumLines;
        if (i > 1) {
            setMaxLines(i);
        } else {
            setSingleLine(true);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int lineCount = getLayout().getLineCount();
        if (lineCount > 1) {
            List<String> list = this.words;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (getPaint().measureText((String) it.next()) > getLayout().getWidth()) {
                        onMeasure$lambda$0(this, widthMeasureSpec, heightMeasureSpec);
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < lineCount; i2++) {
                if (getLayout().getLineWidth(i2) / this.maximumWidth < 0.5d) {
                    onMeasure$lambda$0(this, widthMeasureSpec, heightMeasureSpec);
                    return;
                }
            }
        }
    }

    public final void setMaximumLines(int i) {
        if (this.maximumLines != i) {
            this.maximumLines = i;
            requestLayout();
        }
    }

    public final void setMaximumWidth(int i) {
        this.maximumWidth = i;
        setMaxWidth(i);
        updateTextSize();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence newText, TextView.BufferType type) {
        CharSequence k0;
        super.setText(newText, type);
        CharSequence text = getText();
        this.words = (text == null || (k0 = evu0.k0(text)) == null) ? null : m760.a.l(0, k0);
        updateTextSize();
    }

    public NextStreetTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.maximumLines = 1;
        this.minTextSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_textsize_nextstreet_min);
        this.maxTextSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_textsize_nextstreet_max);
        setIncludeFontPadding(false);
    }

    public NextStreetTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maximumLines = 1;
        this.minTextSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_textsize_nextstreet_min);
        this.maxTextSize = getContext().getResources().getDimension(R.dimen.mapkit_styling_automotive_textsize_nextstreet_max);
        setIncludeFontPadding(false);
    }
}
