package com.ybsdk.core.utils.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ReplacementSpan;
import defpackage.b64;
import defpackage.evu0;
import defpackage.jx81;
import defpackage.ny61;
import defpackage.rxy0;
import defpackage.scc;
import defpackage.tls;
import defpackage.uiy0;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/utils/text/ThousandSeparatorTextWatcher;", "Landroid/text/TextWatcher;", "Lkotlin/Function1;", "Landroid/text/Editable;", "Lzy11;", "actionAfterTextChanged", "<init>", "(Ltls;)V", "", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "Ltls;", "", "isFormattingNow", "Z", "Companion", "SpaceSpan", "rxy0", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThousandSeparatorTextWatcher implements TextWatcher {
    private static final rxy0 Companion = new rxy0();

    @Deprecated
    public static final int DIVISION_CATEGORY_LENGTH = 3;

    @Deprecated
    public static final int MAX_NOT_FORMAT_NUMBER_LENGTH = 4;

    @Deprecated
    public static final String SPACE_CHARACTER = " ";
    private final tls actionAfterTextChanged;
    private boolean isFormattingNow;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/core/utils/text/ThousandSeparatorTextWatcher$SpaceSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SpaceSpan extends ReplacementSpan {
        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
            canvas.drawText(b64.j(text.subSequence(start, end).toString(), " "), x, y, paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
            return (int) paint.measureText(text.subSequence(start, end).toString() + " ");
        }
    }

    public /* synthetic */ ThousandSeparatorTextWatcher(tls tlsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new uiy0(22) : tlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(Editable editable) {
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.isFormattingNow) {
            return;
        }
        this.isFormattingNow = true;
        SpaceSpan[] spaceSpanArr = (SpaceSpan[]) editable.getSpans(0, editable.length(), SpaceSpan.class);
        int i = 0;
        while (i < spaceSpanArr.length) {
            int i2 = i + 1;
            try {
                editable.removeSpan(spaceSpanArr[i]);
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                w511.i(e.getMessage());
                return;
            }
        }
        List g = scc.g(Integer.valueOf(evu0.H(editable, Extension.DOT_CHAR, 0, false, 6)), Integer.valueOf(evu0.H(editable, ",", 0, false, 6)), Integer.valueOf(editable.length()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            if (((Number) obj).intValue() != -1) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        int intValue = ((Number) comparable).intValue();
        if (intValue <= 4) {
            this.isFormattingNow = false;
            this.actionAfterTextChanged.invoke(editable);
            return;
        }
        int i3 = intValue - 3;
        int v = jx81.v(i3, 1, -3);
        if (v <= i3) {
            while (true) {
                editable.setSpan(new SpaceSpan(), i3 - 1, i3, 17);
                if (i3 == v) {
                    break;
                } else {
                    i3 -= 3;
                }
            }
        }
        this.isFormattingNow = false;
        this.actionAfterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    public ThousandSeparatorTextWatcher(tls tlsVar) {
        this.actionAfterTextChanged = tlsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThousandSeparatorTextWatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
