package androidx.print;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import defpackage.b3f0;
import defpackage.c3f0;
import java.io.FileNotFoundException;

/* loaded from: classes10.dex */
class PrintHelper$PrintUriAdapter extends PrintDocumentAdapter {
    PrintAttributes mAttributes;
    Bitmap mBitmap = null;
    final b3f0 mCallback;
    final int mFittingMode;
    final Uri mImageFile;
    final String mJobName;
    AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;
    final /* synthetic */ c3f0 this$0;

    public PrintHelper$PrintUriAdapter(c3f0 c3f0Var, String str, Uri uri, b3f0 b3f0Var, int i) {
        this.mJobName = str;
        this.mImageFile = uri;
        this.mFittingMode = i;
    }

    public void cancelLoad() {
        throw null;
    }

    @Override // android.print.PrintDocumentAdapter
    public void onFinish() {
        super.onFinish();
        cancelLoad();
        AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.mLoadBitmap;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mBitmap = null;
        }
    }

    @Override // android.print.PrintDocumentAdapter
    public void onLayout(final PrintAttributes printAttributes, final PrintAttributes printAttributes2, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        synchronized (this) {
            try {
                this.mAttributes = printAttributes2;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
        } else if (this.mBitmap != null) {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
        } else {
            this.mLoadBitmap = new AsyncTask<Uri, Boolean, Bitmap>() { // from class: androidx.print.PrintHelper$PrintUriAdapter.1
                @Override // android.os.AsyncTask
                public Bitmap doInBackground(Uri... uriArr) {
                    try {
                        PrintHelper$PrintUriAdapter.this.getClass();
                        Uri uri = PrintHelper$PrintUriAdapter.this.mImageFile;
                        throw null;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                public void onCancelled(Bitmap bitmap) {
                    layoutResultCallback.onLayoutCancelled();
                    PrintHelper$PrintUriAdapter.this.mLoadBitmap = null;
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Bitmap bitmap) {
                    super.onPostExecute((AnonymousClass1) bitmap);
                    PrintHelper$PrintUriAdapter printHelper$PrintUriAdapter = PrintHelper$PrintUriAdapter.this;
                    if (bitmap != null) {
                        printHelper$PrintUriAdapter.getClass();
                        throw null;
                    }
                    printHelper$PrintUriAdapter.mBitmap = bitmap;
                    if (bitmap != null) {
                        layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(PrintHelper$PrintUriAdapter.this.mJobName).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
                    } else {
                        layoutResultCallback.onLayoutFailed(null);
                    }
                    PrintHelper$PrintUriAdapter.this.mLoadBitmap = null;
                }

                @Override // android.os.AsyncTask
                public void onPreExecute() {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1.1
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public void onCancel() {
                            PrintHelper$PrintUriAdapter.this.cancelLoad();
                            cancel(false);
                        }
                    });
                }
            }.execute(new Uri[0]);
        }
    }

    @Override // android.print.PrintDocumentAdapter
    public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        throw null;
    }
}
