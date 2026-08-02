package xsna;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;

/* compiled from: MediaStoreLoader.kt */
/* loaded from: classes3.dex */
public interface hz10 {
    static io.reactivex.rxjava3.core.q a(final yz10 yz10Var, final int i, final int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        final int i6 = i3;
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        final int i7 = i4;
        int i8 = (i5 & 16) != 0 ? 100 : 1;
        return new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.lz10
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                rq10 rq10Var = yz10.this.a;
                u9e u9eVar = new u9e(1, rVar, io.reactivex.rxjava3.core.r.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 4);
                xz10 xz10Var = new xz10(1, rVar, io.reactivex.rxjava3.core.r.class, "tryOnError", "tryOnError(Ljava/lang/Throwable;)Z", 8);
                rx4 rx4Var = new rx4(0, rVar, io.reactivex.rxjava3.core.r.class, "onComplete", "onComplete()V", 0, 4);
                pro0.b();
                ContentResolver contentResolver = rq10Var.a.getContentResolver();
                Uri a = rq10Var.a();
                String[] strArr = rq10.f;
                int i9 = i;
                String str = i9 == 111 ? "(media_type = ? OR media_type = ?)" : "media_type = ?";
                int i10 = i2;
                if (i10 != -2 && i10 != -1) {
                    str = str.concat(" AND bucket_id=?");
                }
                Cursor b = vkj.b(contentResolver, a, strArr, str, rq10.e(i9, i10), (Build.VERSION.SDK_INT >= 29 ? "date_modified" : "datetaken").concat(" DESC"), i7, i6, 128);
                if (b != null) {
                    try {
                        try {
                            qq10 qq10Var = new qq10(b);
                            while (b.moveToNext()) {
                                cz10 b2 = rq10Var.b(rq10Var.a(), b, qq10Var);
                                if (b2 != null) {
                                    u9eVar.invoke(b2.a);
                                }
                            }
                        } finally {
                            s3q0 s3q0Var = s3q0.a;
                            b.close();
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                        b.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ro.e(b, th);
                        }
                    }
                }
                rx4Var.invoke();
            }
        }).b(i8, i8).r0(asu0.a.c());
    }

    io.reactivex.rxjava3.internal.operators.observable.m1 b(int i, String str);
}
