package androidx.print;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.util.Log;
import defpackage.c3f0;

/* loaded from: classes10.dex */
class PrintHelper$1 extends AsyncTask<Void, Void, Throwable> {
    final /* synthetic */ c3f0 this$0;
    final /* synthetic */ PrintAttributes val$attributes;
    final /* synthetic */ Bitmap val$bitmap;
    final /* synthetic */ CancellationSignal val$cancellationSignal;
    final /* synthetic */ ParcelFileDescriptor val$fileDescriptor;
    final /* synthetic */ int val$fittingMode;
    final /* synthetic */ PrintAttributes val$pdfAttributes;
    final /* synthetic */ PrintDocumentAdapter.WriteResultCallback val$writeResultCallback;

    public PrintHelper$1(c3f0 c3f0Var, CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        this.val$cancellationSignal = cancellationSignal;
        this.val$pdfAttributes = printAttributes;
        this.val$bitmap = bitmap;
        this.val$attributes = printAttributes2;
        this.val$fittingMode = i;
        this.val$fileDescriptor = parcelFileDescriptor;
        this.val$writeResultCallback = writeResultCallback;
    }

    @Override // android.os.AsyncTask
    public Throwable doInBackground(Void... voidArr) {
        try {
            if (this.val$cancellationSignal.isCanceled()) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Throwable th) {
        if (this.val$cancellationSignal.isCanceled()) {
            this.val$writeResultCallback.onWriteCancelled();
        } else if (th == null) {
            this.val$writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
        } else {
            Log.e("PrintHelper", "Error writing printed content", th);
            this.val$writeResultCallback.onWriteFailed(null);
        }
    }
}
