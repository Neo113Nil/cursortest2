package xsna;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.ext.VideoEncoderSettings;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Thread;
import kotlin.text.Regex;
import xsna.abt0;

/* compiled from: UploadCompressStrategy.kt */
/* loaded from: classes6.dex */
public final class ewi extends kaq0 {
    public final Context c;
    public final VideoEncoderSettings d;
    public final VideoUploadTaskNew.b e;
    public Thread f;
    public Uri g;
    public String h;

    public ewi(Context context, VideoEncoderSettings videoEncoderSettings, VideoUploadTaskNew.b bVar) {
        this.c = context;
        this.d = videoEncoderSettings;
        this.e = bVar;
    }

    public final void a() {
        Thread thread = this.f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f = null;
        String str = this.h;
        if (str != null) {
            Regex regex = com.vk.core.files.a.a;
            vhk0.c(str);
        }
        this.h = null;
        String b = r9r.b(this.c, this.g);
        if (b != null && b.length() > 0 && drm0.D(b, ".vkontakte/TEMP_TRIM_", false)) {
            File file = new File(b);
            Regex regex2 = com.vk.core.files.a.a;
            vhk0.b(file);
        }
    }

    public final String b(Uri uri) {
        String b;
        String scheme;
        if (!oeq0.e(uri) && ((scheme = uri.getScheme()) == null || scheme.length() == 0)) {
            uri = uri.buildUpon().scheme(X3.i.b).build();
        }
        this.g = uri;
        this.h = PrivateFiles.e(e8r.a, PrivateSubdir.LARGE_TEMP_UPLOADS, "temp_upload_" + this.a, "mp4", 24).getAbsolutePath();
        try {
            Uri uri2 = this.g;
            MediaUtils.f d = (uri2 == null || (b = r9r.b(this.c, uri2)) == null) ? null : MediaUtils.a.d(b);
            if (d == null || Math.max(d.a, d.b) > this.d.b) {
                Thread thread = new Thread(new a());
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: xsna.dwi
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread2, Throwable th) {
                        L.g("Fatal error while encoding, this might be invalid format or bug in engine or Android.", th);
                        ewi ewiVar = ewi.this;
                        String str = ewiVar.h;
                        if (str != null) {
                            Regex regex = com.vk.core.files.a.a;
                            vhk0.c(str);
                        }
                        ewiVar.h = null;
                    }
                });
                thread.start();
                this.f = thread;
                thread.join();
                this.f = null;
                String str = this.h;
                if (str != null) {
                    if (new File(str).exists()) {
                        return str;
                    }
                }
            }
            return null;
        } catch (InterruptedException e) {
            L.G("Encoding process was interrupted");
            throw e;
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
            return null;
        }
    }

    /* compiled from: UploadCompressStrategy.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ewi ewiVar = ewi.this;
            String str = ewiVar.h;
            if (str == null) {
                throw new FileNotFoundException("outputFilePath is null");
            }
            Uri uri = ewiVar.g;
            if (uri == null) {
                throw new FileNotFoundException("input uri is null");
            }
            String b = r9r.b(ewiVar.c, uri);
            if (b == null) {
                throw new FileNotFoundException(i6n0.a(uri, "Source not exists: "));
            }
            VideoEncoderSettings videoEncoderSettings = ewiVar.d;
            abt0 abt0Var = new abt0(b, str, videoEncoderSettings.b, videoEncoderSettings.c, new C2839a(ewiVar));
            abt0Var.a();
            abt0Var.b();
        }

        /* compiled from: UploadCompressStrategy.kt */
        /* renamed from: xsna.ewi$a$a, reason: collision with other inner class name */
        public static final class C2839a implements abt0.a {
            public final /* synthetic */ ewi a;

            public C2839a(ewi ewiVar) {
                this.a = ewiVar;
            }

            @Override // xsna.abt0.a
            public final void onProgress(float f) {
                VideoUploadTaskNew.b bVar = this.a.e;
                if (bVar != null) {
                    bVar.a((int) f);
                }
            }

            @Override // xsna.abt0.a
            public final void onSuccess() {
                VideoUploadTaskNew.b bVar = this.a.e;
                if (bVar != null) {
                    bVar.a(100);
                }
            }

            @Override // xsna.abt0.a
            public final void onFailure(Throwable th) {
                throw th;
            }
        }
    }
}
