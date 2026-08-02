package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.files.a;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import xsna.gfc0;

/* compiled from: PostingFilesCopierImpl.kt */
/* loaded from: classes4.dex */
public final class hfc0 implements gfc0 {
    public final ConcurrentHashMap<String, io.reactivex.rxjava3.core.q<gfc0.b>> a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, io.reactivex.rxjava3.disposables.c> b = new ConcurrentHashMap<>();

    /* compiled from: PostingFilesCopierImpl.kt */
    public static final class a implements a.b.InterfaceC0765a {
        public final /* synthetic */ Uri a;
        public final /* synthetic */ Uri b;

        public a(Uri uri, Uri uri2) {
            this.a = uri;
            this.b = uri2;
        }

        @Override // com.vk.core.files.a.b.InterfaceC0765a
        public final void onComplete() {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"Copying of " + this.a + " to " + this.b + " complete"});
        }

        @Override // com.vk.core.files.a.b.InterfaceC0765a
        public final void onError(Throwable th) {
            L.F(new kfg(this.a, this.b, th, 2));
        }

        @Override // com.vk.core.files.a.b.InterfaceC0765a
        public final void onStart() {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"Copying of " + this.a + " to " + this.b + " started"});
        }
    }

    @Override // xsna.gfc0
    public final Uri a(Uri uri) {
        PrivateFiles.a b;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String name = com.vk.core.files.a.i(context, uri).getName();
        b = e8r.a.b(r3, PrivateSubdir.POSTING_FILE_COPIES.h(), true);
        Uri fromFile = Uri.fromFile(new File(new File(b.a, name).getAbsolutePath()));
        String uri2 = fromFile.toString();
        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.observable.s0(new gdd(3, uri, fromFile)).e().r0(asu0.a.c()), new u5(new eo3(uri2, uri, fromFile, 10), 28));
        this.a.put(uri2, p1Var);
        this.b.put(uri2, p1Var.subscribe(new tmz(new h1(28, uri, fromFile), 10)));
        return fromFile;
    }

    @Override // xsna.gfc0
    public final io.reactivex.rxjava3.core.q<s3q0> b() {
        return new io.reactivex.rxjava3.internal.operators.observable.q0(new ek5(this, 4)).r0(asu0.a.c());
    }

    @Override // xsna.gfc0
    public final io.reactivex.rxjava3.core.q<gfc0.b> c(String str) {
        return this.a.get(str);
    }
}
