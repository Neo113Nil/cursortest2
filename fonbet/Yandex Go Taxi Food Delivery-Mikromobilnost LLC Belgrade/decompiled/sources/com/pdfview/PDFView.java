package com.pdfview;

import android.content.Context;
import android.util.AttributeSet;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.evu0;
import defpackage.rzo;
import defpackage.swc;
import defpackage.yev;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/pdfview/PDFView;", "Lcom/pdfview/subsamplincscaleimageview/SubsamplingScaleImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "assetFileName", "fromAsset", "(Ljava/lang/String;)Lcom/pdfview/PDFView;", "Ljava/io/File;", "file", "fromFile", "(Ljava/io/File;)Lcom/pdfview/PDFView;", "filePath", "", "scale", "(F)Lcom/pdfview/PDFView;", "Lzy11;", "show", "()V", "onDetachedFromWindow", "mfile", "Ljava/io/File;", "mScale", "F", "pdfview-library_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes11.dex */
public final class PDFView extends SubsamplingScaleImageView {
    private float mScale;
    private File mfile;

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScale = 8.0f;
        setMinimumTileDpi(120);
        setMinimumScaleType(4);
    }

    public final PDFView fromAsset(String assetFileName) {
        Context context = getContext();
        File file = new File(context.getCacheDir(), assetFileName.concat("-pdfview.pdf"));
        if (evu0.y(assetFileName, "/", false)) {
            file.getParentFile().mkdirs();
        }
        rzo.l(context.getAssets().open(assetFileName), new FileOutputStream(file));
        this.mfile = file;
        return this;
    }

    public final PDFView fromFile(String filePath) {
        this.mfile = new File(filePath);
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        recycle();
    }

    public final PDFView scale(float scale) {
        this.mScale = scale;
        return this;
    }

    public final void show() {
        yev a = yev.a(this.mfile.getPath());
        setRegionDecoderFactory(new swc(1, this));
        setImage(a);
    }

    public final PDFView fromFile(File file) {
        this.mfile = file;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PDFView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PDFView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
