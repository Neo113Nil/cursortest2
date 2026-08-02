package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.vk.log.L;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.t99;

/* compiled from: CallSoundsPlayerImpl.kt */
/* loaded from: classes7.dex */
public final class z99 {
    public final Context a;
    public final t99 b;
    public MediaPlayer c;
    public boolean d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: CallSoundsPlayerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public z99(Context context, t99 t99Var) {
        this.a = context;
        this.b = t99Var;
    }

    public static void a(final z99 z99Var, final t99.b bVar, ml7 ml7Var, int i) {
        final boolean z = (i & 2) != 0;
        final ml7 ml7Var2 = (i & 8) != 0 ? null : ml7Var;
        L.e("play sound=" + bVar);
        final int i2 = 0;
        io.reactivex.rxjava3.internal.operators.completable.l l = io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.w99
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                final z99 z99Var2 = z99.this;
                t99.b bVar2 = bVar;
                boolean z2 = z;
                int i3 = i2;
                final gzs gzsVar = ml7Var2;
                synchronized (z99Var2) {
                    L.e("playInternal sound=" + bVar2);
                    z99Var2.e();
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    z99Var2.c(mediaPlayer, bVar2);
                    mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(i3).build());
                    mediaPlayer.setLooping(z2);
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: xsna.x99
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer2) {
                            gzs gzsVar2 = gzs.this;
                            if (gzsVar2 != null) {
                                gzsVar2.invoke();
                            }
                            z99Var2.d();
                        }
                    });
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                    z99Var2.c = mediaPlayer;
                }
            }
        });
        asu0.a.getClass();
        z99Var.e.b(io.reactivex.rxjava3.kotlin.c.g(l.q(asu0.w()), new y99(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), null, 2));
    }

    public final void b(MediaPlayer mediaPlayer, int i, Resources resources) {
        File file = new File(this.a.getCacheDir(), "/voipSounds/");
        file.mkdirs();
        File file2 = new File(file, l6g.a(i, ".mp3"));
        if (!file2.exists()) {
            InputStream openRawResource = resources.openRawResource(i);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    i7o0.b(openRawResource, fileOutputStream, 8192);
                    fileOutputStream.close();
                    ro.e(openRawResource, null);
                } finally {
                }
            } finally {
            }
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            mediaPlayer.setDataSource(fileInputStream.getFD());
            s3q0 s3q0Var = s3q0.a;
            fileInputStream.close();
        } finally {
        }
    }

    public final void c(MediaPlayer mediaPlayer, t99.b bVar) {
        boolean z = bVar instanceof t99.b.a;
        Context context = this.a;
        if (!z) {
            if (!(bVar instanceof t99.b.C3728b)) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                ((t99.b.C3728b) bVar).getClass();
                mediaPlayer.setDataSource(context, null);
                return;
            } catch (Throwable unused) {
                ((t99.b.C3728b) bVar).getClass();
                L.l("Failed to play sound from null");
                return;
            }
        }
        Resources resources = context.getResources();
        int i = ((t99.b.a) bVar).a;
        if (this.d) {
            b(mediaPlayer, i, resources);
            return;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            try {
                mediaPlayer.setDataSource(openRawResourceFd);
                s3q0 s3q0Var = s3q0.a;
                ro.e(openRawResourceFd, null);
            } finally {
            }
        } catch (IOException unused2) {
            this.d = true;
            b(mediaPlayer, i, resources);
        }
    }

    public final void d() {
        L.e("stop");
        io.reactivex.rxjava3.internal.operators.completable.l l = io.reactivex.rxjava3.core.a.l(new uu4(this, 1));
        asu0.a.getClass();
        this.e.b(io.reactivex.rxjava3.kotlin.c.g(l.q(asu0.w()), new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), null, 2));
    }

    public final synchronized void e() {
        L.e("stopInternal");
        MediaPlayer mediaPlayer = this.c;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
            } catch (IllegalStateException unused) {
            }
            mediaPlayer.release();
        }
        this.c = null;
    }
}
