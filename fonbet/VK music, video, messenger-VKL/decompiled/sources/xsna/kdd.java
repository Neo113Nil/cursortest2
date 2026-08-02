package xsna;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.media.MediaUtils;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.hg1;

/* compiled from: ClipToStoryRepostInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class kdd implements bdd {
    public final scd a;
    public final b25 b;
    public final uvl0 c;
    public final mny d;
    public final n2m0 e;
    public final p870 f;
    public final pam0 g;

    public kdd(scd scdVar, b25 b25Var, uvl0 uvl0Var, mny mnyVar, n2m0 n2m0Var, p870 p870Var, pam0 pam0Var) {
        this.a = scdVar;
        this.b = b25Var;
        this.c = uvl0Var;
        this.d = mnyVar;
        this.e = n2m0Var;
        this.f = p870Var;
        this.g = pam0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, android.graphics.Bitmap] */
    public static Pair c(ClipVideoFile clipVideoFile, String str) {
        ImageSize imageSize;
        Image w2 = clipVideoFile.w2();
        if (w2 == null || (imageSize = Image.Bb(iah0.f().widthPixels, w2.b, true, false, true)) == null) {
            imageSize = ImageSize.f;
        }
        MediaUtils.d dVar = new MediaUtils.d(1080, 1920);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            ref$ObjectRef.element = MediaUtils.a.i(0L, mediaMetadataRetriever, dVar);
            s3q0 s3q0Var = s3q0.a;
        } catch (Exception unused) {
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
        mediaMetadataRetriever.release();
        Bitmap bitmap = (Bitmap) ref$ObjectRef.element;
        if (bitmap == null) {
            bitmap = (Bitmap) mcr0.e(20000L, jeq0.g(imageSize.d.d)).K().c();
        }
        File s = com.vk.core.files.a.s();
        kd7.m(bitmap, s);
        return new Pair(s, bitmap);
    }

    @Override // xsna.bdd
    public final void a(int i, String str, String str2) {
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.x.t(1L, TimeUnit.MINUTES).subscribe(new x8(new sd4(9), 10));
        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
        hg1.j0 j0Var = new hg1.j0();
        fVar.getClass();
        itg0.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, j0Var).U(new hg1.i0()), new z8(new ddd(i), 3)).K(), new defpackage.p(new ec(subscribe, 27), 11)).m(asu0.a.c()), new edd(this, str, str2, 0), null, 2);
    }

    public final void b(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.f.g((bd70) it.next());
        }
        itg0.j(io.reactivex.rxjava3.core.a.l(new cdd(str, 0)).o(asu0.a.c()), new tr0(2), 1);
    }
}
