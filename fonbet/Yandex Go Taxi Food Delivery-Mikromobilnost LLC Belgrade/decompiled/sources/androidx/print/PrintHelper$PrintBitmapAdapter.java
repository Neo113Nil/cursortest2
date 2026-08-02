package androidx.print;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import defpackage.b3f0;
import defpackage.c3f0;

/* loaded from: classes10.dex */
class PrintHelper$PrintBitmapAdapter extends PrintDocumentAdapter {
    private PrintAttributes mAttributes;
    private final Bitmap mBitmap;
    private final b3f0 mCallback;
    private final int mFittingMode;
    private final String mJobName;
    final /* synthetic */ c3f0 this$0;

    public PrintHelper$PrintBitmapAdapter(c3f0 c3f0Var, String str, int i, Bitmap bitmap, b3f0 b3f0Var) {
        this.mJobName = str;
        this.mFittingMode = i;
        this.mBitmap = bitmap;
    }

    @Override // android.print.PrintDocumentAdapter
    public void onFinish() {
    }

    @Override // android.print.PrintDocumentAdapter
    public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        this.mAttributes = printAttributes2;
        layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
    }

    @Override // android.print.PrintDocumentAdapter
    public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        throw null;
    }
}
