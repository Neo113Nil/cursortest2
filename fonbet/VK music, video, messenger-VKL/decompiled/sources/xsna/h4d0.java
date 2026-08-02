package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.feed.design.view.posting.preview.image.attach.PostingPreviewImage;
import java.lang.reflect.Field;

/* compiled from: PreviewImageHolderStrategy.kt */
/* loaded from: classes4.dex */
public final class h4d0 {
    public final ykw a;
    public final PostingPreviewImage b;
    public final int c;
    public final boolean d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public boolean f;

    public h4d0(ykw ykwVar, PostingPreviewImage postingPreviewImage, int i, boolean z) {
        this.a = ykwVar;
        this.b = postingPreviewImage;
        this.c = i;
        this.d = z;
        postingPreviewImage.setCropImageListener(ykwVar);
        postingPreviewImage.setEditOnboardingListener(ykwVar);
        postingPreviewImage.setCropImageDetachListener(new vv20(this, 16));
    }

    public final void a(Uri uri, izs<? super Bitmap, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        String uri2 = uri.toString();
        Bitmap bitmap = null;
        if (uri2 == null) {
            Field field = mcr0.a;
        } else {
            nb7 nb7Var = mcr0.c.get(uri2);
            if (nb7Var != null) {
                Bitmap bitmap2 = nb7Var.a;
                if (!bitmap2.isRecycled()) {
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            izsVar.invoke(bitmap);
            return;
        }
        miw a = liw.a();
        a.a = true;
        liw liwVar = new liw(a);
        int i = this.c;
        io.reactivex.rxjava3.core.q d = mcr0.d(i, i, 94848, uri, liwVar, null, null, false, false);
        asu0 asu0Var = asu0.a;
        this.e.b(d.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new ksb0(new qc70(izsVar, 2), 3), new t520(new p0(izsVar2, 5), 13)));
    }
}
