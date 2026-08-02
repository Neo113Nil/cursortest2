package androidx.core.text;

import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import defpackage.d6z;
import defpackage.ghe0;
import defpackage.hhe0;
import defpackage.ihe0;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes10.dex */
public class PrecomputedTextCompat implements Spannable {
    private static final char LINE_FEED = '\n';
    private static Executor sExecutor;
    private static final Object sLock = new Object();
    private final int[] mParagraphEnds;
    private final ghe0 mParams;
    private final Spannable mText;
    private final PrecomputedText mWrapped;

    private PrecomputedTextCompat(CharSequence charSequence, ghe0 ghe0Var, int[] iArr) {
        this.mText = new SpannableString(charSequence);
        this.mParams = ghe0Var;
        this.mParagraphEnds = iArr;
        this.mWrapped = null;
    }

    public static PrecomputedTextCompat create(CharSequence charSequence, ghe0 ghe0Var) {
        charSequence.getClass();
        ghe0Var.getClass();
        try {
            Trace.beginSection("PrecomputedText");
            PrecomputedText.Params params = ghe0Var.e;
            if (params != null) {
                return new PrecomputedTextCompat(PrecomputedText.create(charSequence, params), ghe0Var);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                i = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), ghe0Var.a, Integer.MAX_VALUE).setBreakStrategy(ghe0Var.c).setHyphenationFrequency(ghe0Var.d).setTextDirection(ghe0Var.b).build();
            return new PrecomputedTextCompat(charSequence, ghe0Var, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public static Future<PrecomputedTextCompat> getTextFuture(CharSequence charSequence, ghe0 ghe0Var, Executor executor) {
        hhe0 hhe0Var = new hhe0();
        hhe0Var.b = ghe0Var;
        hhe0Var.c = charSequence;
        ihe0 ihe0Var = new ihe0(hhe0Var);
        if (executor == null) {
            synchronized (sLock) {
                try {
                    if (sExecutor == null) {
                        sExecutor = Executors.newFixedThreadPool(1);
                    }
                    executor = sExecutor;
                } finally {
                }
            }
        }
        executor.execute(ihe0Var);
        return ihe0Var;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.mText.charAt(i);
    }

    public int getParagraphCount() {
        return this.mWrapped.getParagraphCount();
    }

    public int getParagraphEnd(int i) {
        d6z.p(i, 0, getParagraphCount(), "paraIndex");
        return this.mWrapped.getParagraphEnd(i);
    }

    public int getParagraphStart(int i) {
        d6z.p(i, 0, getParagraphCount(), "paraIndex");
        return this.mWrapped.getParagraphStart(i);
    }

    public ghe0 getParams() {
        return this.mParams;
    }

    public PrecomputedText getPrecomputedText() {
        Spannable spannable = this.mText;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.mText.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.mText.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.mText.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.mWrapped.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mText.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.mText.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            ny61.g("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else {
            this.mWrapped.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            ny61.g("MetricAffectingSpan can not be set to PrecomputedText.");
        } else {
            this.mWrapped.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.mText.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.mText.toString();
    }

    private PrecomputedTextCompat(PrecomputedText precomputedText, ghe0 ghe0Var) {
        this.mText = precomputedText;
        this.mParams = ghe0Var;
        this.mParagraphEnds = null;
        this.mWrapped = precomputedText;
    }
}
