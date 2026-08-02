package xsna;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: ContentCaptureSessionCompat.java */
/* loaded from: classes11.dex */
public final class wfj implements xfj {
    public final Object a;
    public final View b;

    /* compiled from: ContentCaptureSessionCompat.java */
    public static class a {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        public static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
            contentCaptureSession.notifyViewTextChanged(autofillId, str);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    public wfj(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    @Override // xsna.xfj
    public final AutofillId a(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a(vfj.b(this.a), this.b.getAutofillId(), j);
        }
        return null;
    }

    @Override // xsna.xfj
    public final b1u0 b(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new b1u0(a.b(vfj.b(this.a), autofillId, j));
        }
        return null;
    }

    @Override // xsna.xfj
    public final void c(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(vfj.b(this.a), autofillId);
        }
    }

    @Override // xsna.xfj
    public final void d(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.e(vfj.b(this.a), autofillId, str);
        }
    }

    @Override // xsna.xfj
    public final void e(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.c(vfj.b(this.a), viewStructure);
        }
    }

    @Override // xsna.xfj
    public final void flush() {
        if (Build.VERSION.SDK_INT >= 29) {
            a.f(vfj.b(this.a), this.b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }
}
