package xsna;

import android.graphics.Bitmap;
import com.vk.log.L;

/* compiled from: CustomDominantColorPostProcessor.kt */
/* loaded from: classes4.dex */
public final class zmk extends mk6 {
    public final bwn c = new bwn();
    public final io.reactivex.rxjava3.subjects.f<Integer> d = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.mk6
    public final void d(Bitmap bitmap) {
        int a = this.c.a(bitmap);
        if (a != -1) {
            this.d.onNext(Integer.valueOf(a));
        } else {
            L.l("Error picking dominant color");
        }
    }
}
