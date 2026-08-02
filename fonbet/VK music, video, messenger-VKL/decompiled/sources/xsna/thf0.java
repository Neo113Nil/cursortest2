package xsna;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.HandleState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import xsna.hio0;
import xsna.k1z;

/* compiled from: RecordingInputConnection.android.kt */
/* loaded from: classes11.dex */
public final class thf0 implements InputConnection {
    public final k1z.a a;
    public final boolean b;
    public final j1z c;
    public final gho0 d;
    public final rut0 e;
    public int f;
    public tho0 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public thf0(tho0 tho0Var, k1z.a aVar, boolean z, j1z j1zVar, gho0 gho0Var, rut0 rut0Var) {
        this.a = aVar;
        this.b = z;
        this.c = j1zVar;
        this.d = gho0Var;
        this.e = rut0Var;
        this.g = tho0Var;
    }

    public final void b(pzo pzoVar) {
        this.f++;
        try {
            this.j.add(pzoVar);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final boolean c() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                k1z.this.c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        k1z k1zVar = k1z.this;
        int size = k1zVar.j.size();
        for (int i = 0; i < size; i++) {
            if (epx.f(((WeakReference) k1zVar.j.get(i)).get(), this)) {
                k1zVar.j.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            b(new pgg(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        b(new ivl(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        b(new jvl(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        b(new jhr());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        tho0 tho0Var = this.g;
        return TextUtils.getCapsMode(tho0Var.a.c, qko0.f(tho0Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ahn.f(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (qko0.c(this.g.b)) {
            return null;
        }
        return x1o0.k(this.g).c;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return x1o0.l(this.g, i).c;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return x1o0.m(this.g, i).c;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    b(new bzi0(0, this.g.a.c.length()));
                    break;
                case R.id.cut:
                    d(277);
                    return false;
                case R.id.copy:
                    d(278);
                    return false;
                case R.id.paste:
                    d(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                }
                k1z.this.d.invoke(new qnw(i2));
            }
            i2 = 1;
            k1z.this.d.invoke(new qnw(i2));
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e7  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        us2 us2Var;
        PointF startPoint;
        PointF endPoint;
        long j;
        int i;
        PointF insertionPoint;
        mjo0 d;
        String textToInsert;
        ljo0 ljo0Var;
        PointF joinOrSplitPoint;
        mjo0 d2;
        ljo0 ljo0Var2;
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        ljo0 ljo0Var3;
        kjo0 kjo0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            o440 o440Var = new o440(this, 22);
            j1z j1zVar = this.c;
            int i2 = 3;
            if (j1zVar != null && (us2Var = j1zVar.j) != null) {
                mjo0 d3 = j1zVar.d();
                if (us2Var.equals((d3 == null || (ljo0Var3 = d3.a) == null || (kjo0Var = ljo0Var3.a) == null) ? null : kjo0Var.a)) {
                    boolean l = w81.l(handwritingGesture);
                    gho0 gho0Var = this.d;
                    if (l) {
                        SelectGesture f = h91.f(handwritingGesture);
                        selectionArea = f.getSelectionArea();
                        zhf0 p = zjq.p(selectionArea);
                        granularity4 = f.getGranularity();
                        long f2 = ttu.f(j1zVar, p, granularity4 != 1 ? 0 : 1);
                        if (qko0.c(f2)) {
                            i2 = rtu.a(m91.j(f), o440Var);
                        } else {
                            o440Var.invoke(new bzi0((int) (f2 >> 32), (int) (f2 & 4294967295L)));
                            if (gho0Var != null) {
                                gho0Var.j(true);
                            }
                            i2 = 1;
                        }
                    } else if (s91.m(handwritingGesture)) {
                        DeleteGesture h = u91.h(handwritingGesture);
                        granularity3 = h.getGranularity();
                        int i3 = granularity3 != 1 ? 0 : 1;
                        deletionArea = h.getDeletionArea();
                        long f3 = ttu.f(j1zVar, zjq.p(deletionArea), i3);
                        if (qko0.c(f3)) {
                            i2 = rtu.a(m91.j(h), o440Var);
                        } else {
                            rtu.b(f3, us2Var, i3 == 1, o440Var);
                            i2 = 1;
                        }
                    } else if (v91.k(handwritingGesture)) {
                        SelectRangeGesture b = d92.b(handwritingGesture);
                        selectionStartArea = b.getSelectionStartArea();
                        zhf0 p2 = zjq.p(selectionStartArea);
                        selectionEndArea = b.getSelectionEndArea();
                        zhf0 p3 = zjq.p(selectionEndArea);
                        granularity2 = b.getGranularity();
                        long b2 = ttu.b(j1zVar, p2, p3, granularity2 != 1 ? 0 : 1);
                        if (qko0.c(b2)) {
                            i2 = rtu.a(m91.j(b), o440Var);
                        } else {
                            o440Var.invoke(new bzi0((int) (b2 >> 32), (int) (b2 & 4294967295L)));
                            if (gho0Var != null) {
                                gho0Var.j(true);
                            }
                            i2 = 1;
                        }
                    } else if (x91.i(handwritingGesture)) {
                        DeleteRangeGesture f4 = y91.f(handwritingGesture);
                        granularity = f4.getGranularity();
                        int i4 = granularity != 1 ? 0 : 1;
                        deletionStartArea = f4.getDeletionStartArea();
                        zhf0 p4 = zjq.p(deletionStartArea);
                        deletionEndArea = f4.getDeletionEndArea();
                        long b3 = ttu.b(j1zVar, p4, zjq.p(deletionEndArea), i4);
                        if (qko0.c(b3)) {
                            i2 = rtu.a(m91.j(f4), o440Var);
                        } else {
                            rtu.b(b3, us2Var, i4 == 1, o440Var);
                            i2 = 1;
                        }
                    } else {
                        boolean l2 = tu5.l(handwritingGesture);
                        rut0 rut0Var = this.e;
                        if (l2) {
                            JoinOrSplitGesture g = l91.g(handwritingGesture);
                            if (rut0Var == null) {
                                i2 = rtu.a(m91.j(g), o440Var);
                            } else {
                                joinOrSplitPoint = g.getJoinOrSplitPoint();
                                int a = ttu.a(j1zVar, ttu.d(joinOrSplitPoint), rut0Var);
                                if (a == -1 || !((d2 = j1zVar.d()) == null || (ljo0Var2 = d2.a) == null || !ttu.c(ljo0Var2, a))) {
                                    i2 = rtu.a(m91.j(g), o440Var);
                                } else {
                                    int i5 = a;
                                    while (i5 > 0) {
                                        int codePointBefore = Character.codePointBefore(us2Var, i5);
                                        if (!ttu.h(codePointBefore)) {
                                            break;
                                        } else {
                                            i5 -= Character.charCount(codePointBefore);
                                        }
                                    }
                                    while (a < us2Var.c.length()) {
                                        int codePointAt = Character.codePointAt(us2Var, a);
                                        if (!ttu.h(codePointAt)) {
                                            break;
                                        } else {
                                            a += Character.charCount(codePointAt);
                                        }
                                    }
                                    long c = jgz.c(i5, a);
                                    if (qko0.c(c)) {
                                        int i6 = (int) (c >> 32);
                                        o440Var.invoke(new stu(new pzo[]{new bzi0(i6, i6), new pgg(" ", 1)}));
                                    } else {
                                        rtu.b(c, us2Var, false, o440Var);
                                    }
                                    i2 = 1;
                                }
                            }
                        } else if (f91.l(handwritingGesture)) {
                            InsertGesture g2 = g91.g(handwritingGesture);
                            if (rut0Var == null) {
                                i2 = rtu.a(m91.j(g2), o440Var);
                            } else {
                                insertionPoint = g2.getInsertionPoint();
                                int a2 = ttu.a(j1zVar, ttu.d(insertionPoint), rut0Var);
                                if (a2 == -1 || !((d = j1zVar.d()) == null || (ljo0Var = d.a) == null || !ttu.c(ljo0Var, a2))) {
                                    i2 = rtu.a(m91.j(g2), o440Var);
                                } else {
                                    textToInsert = g2.getTextToInsert();
                                    o440Var.invoke(new stu(new pzo[]{new bzi0(a2, a2), new pgg(textToInsert, 1)}));
                                    i2 = 1;
                                }
                            }
                        } else if (i91.j(handwritingGesture)) {
                            RemoveSpaceGesture e = j91.e(handwritingGesture);
                            mjo0 d4 = j1zVar.d();
                            ljo0 ljo0Var4 = d4 != null ? d4.a : null;
                            startPoint = e.getStartPoint();
                            long d5 = ttu.d(startPoint);
                            endPoint = e.getEndPoint();
                            long d6 = ttu.d(endPoint);
                            tny c2 = j1zVar.c();
                            if (ljo0Var4 != null) {
                                m540 m540Var = ljo0Var4.b;
                                if (c2 != null) {
                                    long p5 = c2.p(d5);
                                    long p6 = c2.p(d6);
                                    int e2 = ttu.e(m540Var, p5, rut0Var);
                                    int e3 = ttu.e(m540Var, p6, rut0Var);
                                    if (e2 != -1) {
                                        if (e3 != -1) {
                                            e2 = Math.min(e2, e3);
                                        }
                                        e3 = e2;
                                    } else if (e3 == -1) {
                                        j = qko0.b;
                                        if (qko0.c(j)) {
                                            i2 = rtu.a(m91.j(e), o440Var);
                                        } else {
                                            Ref$IntRef ref$IntRef = new Ref$IntRef();
                                            ref$IntRef.element = -1;
                                            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                            ref$IntRef2.element = -1;
                                            String h2 = new Regex("\\s+").h(us2Var.subSequence(qko0.f(j), qko0.e(j)).c, new h1(18, ref$IntRef, ref$IntRef2));
                                            int i7 = ref$IntRef.element;
                                            if (i7 == -1 || (i = ref$IntRef2.element) == -1) {
                                                i2 = rtu.a(m91.j(e), o440Var);
                                            } else {
                                                int i8 = (int) (j >> 32);
                                                o440Var.invoke(new stu(new pzo[]{new bzi0(i8 + i7, i8 + i), new pgg(h2.substring(i7, h2.length() - (qko0.d(j) - ref$IntRef2.element)), 1)}));
                                                i2 = 1;
                                            }
                                        }
                                    }
                                    float b4 = (m540Var.b(e3) + m540Var.g(e3)) / 2;
                                    int i9 = (int) (p5 >> 32);
                                    int i10 = (int) (p6 >> 32);
                                    j = m540Var.i(new zhf0(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), b4 - 0.1f, Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), b4 + 0.1f), 0, hio0.a.a);
                                    if (qko0.c(j)) {
                                    }
                                }
                            }
                            j = qko0.b;
                            if (qko0.c(j)) {
                            }
                        } else {
                            i2 = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new xw2(intConsumer, i2, 0));
            } else {
                intConsumer.accept(i2);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        j1z j1zVar;
        us2 us2Var;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        RectF deletionArea;
        int granularity3;
        RectF selectionArea;
        int granularity4;
        ljo0 ljo0Var;
        kjo0 kjo0Var;
        if (Build.VERSION.SDK_INT >= 34 && (j1zVar = this.c) != null && (us2Var = j1zVar.j) != null) {
            mjo0 d = j1zVar.d();
            if (us2Var.equals((d == null || (ljo0Var = d.a) == null || (kjo0Var = ljo0Var.a) == null) ? null : kjo0Var.a)) {
                boolean l = w81.l(previewableHandwritingGesture);
                final gho0 gho0Var = this.d;
                if (l) {
                    SelectGesture f = h91.f(previewableHandwritingGesture);
                    if (gho0Var != null) {
                        selectionArea = f.getSelectionArea();
                        zhf0 p = zjq.p(selectionArea);
                        granularity4 = f.getGranularity();
                        long f2 = ttu.f(j1zVar, p, granularity4 != 1 ? 0 : 1);
                        j1z j1zVar2 = gho0Var.d;
                        if (j1zVar2 != null) {
                            j1zVar2.f(f2);
                        }
                        j1z j1zVar3 = gho0Var.d;
                        if (j1zVar3 != null) {
                            j1zVar3.e(qko0.b);
                        }
                        if (!qko0.c(f2)) {
                            gho0Var.v(false);
                            gho0Var.s(HandleState.None);
                        }
                    }
                } else if (s91.m(previewableHandwritingGesture)) {
                    DeleteGesture h = u91.h(previewableHandwritingGesture);
                    if (gho0Var != null) {
                        deletionArea = h.getDeletionArea();
                        zhf0 p2 = zjq.p(deletionArea);
                        granularity3 = h.getGranularity();
                        long f3 = ttu.f(j1zVar, p2, granularity3 != 1 ? 0 : 1);
                        j1z j1zVar4 = gho0Var.d;
                        if (j1zVar4 != null) {
                            j1zVar4.e(f3);
                        }
                        j1z j1zVar5 = gho0Var.d;
                        if (j1zVar5 != null) {
                            j1zVar5.f(qko0.b);
                        }
                        if (!qko0.c(f3)) {
                            gho0Var.v(false);
                            gho0Var.s(HandleState.None);
                        }
                    }
                } else if (v91.k(previewableHandwritingGesture)) {
                    SelectRangeGesture b = d92.b(previewableHandwritingGesture);
                    if (gho0Var != null) {
                        selectionStartArea = b.getSelectionStartArea();
                        zhf0 p3 = zjq.p(selectionStartArea);
                        selectionEndArea = b.getSelectionEndArea();
                        zhf0 p4 = zjq.p(selectionEndArea);
                        granularity2 = b.getGranularity();
                        long b2 = ttu.b(j1zVar, p3, p4, granularity2 != 1 ? 0 : 1);
                        j1z j1zVar6 = gho0Var.d;
                        if (j1zVar6 != null) {
                            j1zVar6.f(b2);
                        }
                        j1z j1zVar7 = gho0Var.d;
                        if (j1zVar7 != null) {
                            j1zVar7.e(qko0.b);
                        }
                        if (!qko0.c(b2)) {
                            gho0Var.v(false);
                            gho0Var.s(HandleState.None);
                        }
                    }
                } else if (x91.i(previewableHandwritingGesture)) {
                    DeleteRangeGesture f4 = y91.f(previewableHandwritingGesture);
                    if (gho0Var != null) {
                        deletionStartArea = f4.getDeletionStartArea();
                        zhf0 p5 = zjq.p(deletionStartArea);
                        deletionEndArea = f4.getDeletionEndArea();
                        zhf0 p6 = zjq.p(deletionEndArea);
                        granularity = f4.getGranularity();
                        long b3 = ttu.b(j1zVar, p5, p6, granularity != 1 ? 0 : 1);
                        j1z j1zVar8 = gho0Var.d;
                        if (j1zVar8 != null) {
                            j1zVar8.e(b3);
                        }
                        j1z j1zVar9 = gho0Var.d;
                        if (j1zVar9 != null) {
                            j1zVar9.f(qko0.b);
                        }
                        if (!qko0.c(b3)) {
                            gho0Var.v(false);
                            gho0Var.s(HandleState.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: xsna.qtu
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            gho0 gho0Var2 = gho0.this;
                            if (gho0Var2 != null) {
                                j1z j1zVar10 = gho0Var2.d;
                                if (j1zVar10 != null) {
                                    j1zVar10.e(qko0.b);
                                }
                                j1z j1zVar11 = gho0Var2.d;
                                if (j1zVar11 != null) {
                                    j1zVar11.f(qko0.b);
                                }
                            }
                        }
                    });
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        t0z t0zVar;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
                t0zVar = k1z.this.m;
                synchronized (t0zVar.c) {
                    try {
                        t0zVar.f = z2;
                        t0zVar.g = z3;
                        t0zVar.h = z5;
                        t0zVar.i = z;
                        if (z6) {
                            t0zVar.e = true;
                            if (t0zVar.j != null) {
                                t0zVar.a();
                            }
                        }
                        t0zVar.d = z7;
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z5 = true;
            } else {
                z = z5;
                z5 = true;
            }
            z2 = z5;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        t0zVar = k1z.this.m;
        synchronized (t0zVar.c) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) k1z.this.k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            b(new jyi0(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            b(new kyi0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        b(new bzi0(i, i2));
        return true;
    }
}
