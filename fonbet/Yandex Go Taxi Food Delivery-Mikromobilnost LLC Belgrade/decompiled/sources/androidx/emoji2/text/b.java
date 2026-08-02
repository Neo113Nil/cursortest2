package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import defpackage.ach;
import defpackage.atn;
import defpackage.g920;
import defpackage.jp11;
import defpackage.jun;
import defpackage.kun;
import defpackage.la90;
import defpackage.lun;
import defpackage.m920;
import defpackage.mf1;
import defpackage.wjm;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public final class b {
    public final atn a;
    public final wjm b;
    public final ach c;
    public final boolean d;
    public final int[] e;

    public b(wjm wjmVar, atn atnVar, ach achVar, boolean z, int[] iArr, Set set) {
        this.a = atnVar;
        this.b = wjmVar;
        this.c = achVar;
        this.d = z;
        this.e = iArr;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            String str = new String(iArr2, 0, iArr2.length);
            g(str, 0, str.length(), 1, true, new mf1((byte) 0, 9, str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        EmojiSpan[] emojiSpanArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, min, EmojiSpan.class);
                if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                    for (EmojiSpan emojiSpan : emojiSpanArr) {
                        int spanStart = editable.getSpanStart(emojiSpan);
                        int spanEnd = editable.getSpanEnd(emojiSpan);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    InputConnectionWrapper inputConnectionWrapper = (InputConnectionWrapper) inputConnection;
                    inputConnectionWrapper.beginBatchEdit();
                    editable.delete(max3, min2);
                    inputConnectionWrapper.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public final int b(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, i + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((kun) g(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new kun(i))).b;
    }

    public final boolean e(CharSequence charSequence, int i, int i2, jp11 jp11Var) {
        if ((jp11Var.c & 3) == 0) {
            ach achVar = this.c;
            g920 d = jp11Var.d();
            int a = d.a(8);
            if (a != 0) {
                d.b.getShort(a + d.a);
            }
            achVar.getClass();
            ThreadLocal threadLocal = ach.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = achVar.a;
            String sb2 = sb.toString();
            int i3 = la90.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i4 = jp11Var.c & 4;
            jp11Var.c = hasGlyph ? i4 | 2 : i4 | 1;
        }
        return (jp11Var.c & 3) == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:64:0x000e, B:67:0x0013, B:69:0x0017, B:71:0x0024, B:10:0x003c, B:12:0x0044, B:14:0x0047, B:16:0x004b, B:18:0x0057, B:19:0x005a, B:29:0x0078), top: B:63:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence f(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        SpannableBuilder spannableBuilder;
        EmojiSpan[] emojiSpanArr;
        boolean z2 = charSequence instanceof SpannableBuilder;
        if (z2) {
            ((SpannableBuilder) charSequence).beginBatchEdit();
        }
        try {
            if (!z2) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        unprecomputeTextOnModificationSpannable = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, EmojiSpan.class) > i2) ? null : new UnprecomputeTextOnModificationSpannable(charSequence);
                        if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(i, i2, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                            for (EmojiSpan emojiSpan : emojiSpanArr) {
                                int spanStart = unprecomputeTextOnModificationSpannable.getSpanStart(emojiSpan);
                                int spanEnd = unprecomputeTextOnModificationSpannable.getSpanEnd(emojiSpan);
                                if (spanStart != i2) {
                                    unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
                            }
                        }
                        i4 = i;
                        i5 = i2;
                        if (i4 != i5 || i4 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (z2) {
                                return charSequence2;
                            }
                            spannableBuilder = (SpannableBuilder) charSequence2;
                        } else {
                            if (i3 != Integer.MAX_VALUE && unprecomputeTextOnModificationSpannable != null) {
                                i3 -= ((EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), EmojiSpan.class)).length;
                            }
                            charSequence2 = charSequence;
                            try {
                                UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) g(charSequence2, i4, i5, i3, z, new a(unprecomputeTextOnModificationSpannable, this.a));
                                if (unprecomputeTextOnModificationSpannable2 == null) {
                                    if (z2) {
                                        spannableBuilder = (SpannableBuilder) charSequence2;
                                    }
                                    return charSequence2;
                                }
                                Spannable unwrappedSpannable = unprecomputeTextOnModificationSpannable2.getUnwrappedSpannable();
                                if (z2) {
                                    ((SpannableBuilder) charSequence2).endBatchEdit();
                                }
                                return unwrappedSpannable;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (!z2) {
                                }
                            }
                        }
                        spannableBuilder.endBatchEdit();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (!z2) {
                    }
                }
            }
            unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
            if (unprecomputeTextOnModificationSpannable != null) {
                while (r6 < r5) {
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
            }
            charSequence2 = charSequence;
            if (z2) {
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
            th = th;
            if (!z2) {
                throw th;
            }
            ((SpannableBuilder) charSequence2).endBatchEdit();
            throw th;
        }
    }

    public final Object g(CharSequence charSequence, int i, int i2, int i3, boolean z, jun junVar) {
        int i4;
        lun lunVar = new lun((m920) this.b.w, this.d, this.e);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        loop0: while (true) {
            int i6 = codePointAt;
            while (true) {
                i4 = i;
                while (i < i2 && i5 < i3 && z2) {
                    int a = lunVar.a(i6);
                    if (a == 1) {
                        i = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (i < i2) {
                            break;
                        }
                    } else if (a == 2) {
                        int charCount = Character.charCount(i6) + i;
                        if (charCount < i2) {
                            i6 = Character.codePointAt(charSequence, charCount);
                        }
                        i = charCount;
                    } else if (a == 3) {
                        if (z || !e(charSequence, i4, i, ((m920) lunVar.z).b)) {
                            z2 = junVar.c(charSequence, i4, i, ((m920) lunVar.z).b);
                            i5++;
                        }
                    }
                }
            }
            codePointAt = Character.codePointAt(charSequence, i);
        }
        if (lunVar.a == 2 && ((m920) lunVar.y).b != null && ((lunVar.c > 1 || lunVar.l()) && i5 < i3 && z2 && (z || !e(charSequence, i4, i, ((m920) lunVar.y).b)))) {
            junVar.c(charSequence, i4, i, ((m920) lunVar.y).b);
        }
        return junVar.getResult();
    }
}
