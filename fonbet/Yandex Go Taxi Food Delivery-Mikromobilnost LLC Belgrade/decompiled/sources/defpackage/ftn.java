package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes.dex */
public final class ftn {
    public static final Object m = new Object();
    public static volatile ftn n;
    public final ReentrantReadWriteLock a;
    public final j63 b;
    public volatile int c;
    public final h32 d;
    public final dtn e;
    public final atn f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final ach l;

    public ftn(zsn zsnVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.g = zsnVar.b;
        this.h = zsnVar.c;
        this.i = zsnVar.d;
        this.j = DebugGraphView.DEFAULT_GRAPH_COLOR;
        dtn dtnVar = zsnVar.a;
        this.e = dtnVar;
        int i = zsnVar.e;
        this.k = i;
        this.l = zsnVar.f;
        this.b = new j63();
        this.f = new atn();
        h32 h32Var = new h32(this);
        this.d = h32Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                dtnVar.a(new ysn(h32Var));
            } catch (Throwable th2) {
                h(th2);
            }
        }
    }

    public static ftn a() {
        ftn ftnVar;
        synchronized (m) {
            ftnVar = n;
            d6z.y("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", ftnVar != null);
        }
        return ftnVar;
    }

    public static void d(zsn zsnVar) {
        if (n == null) {
            synchronized (m) {
                try {
                    if (n == null) {
                        n = new ftn(zsnVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean e() {
        return n != null;
    }

    public final int b(int i, CharSequence charSequence) {
        d6z.y("Not initialized yet", f());
        d6z.v(charSequence, "charSequence cannot be null");
        return ((b) this.d.a).b(i, charSequence);
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final boolean f() {
        return c() == 1;
    }

    public final void g() {
        d6z.y("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.k == 1);
        if (f()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            h32 h32Var = this.d;
            ftn ftnVar = (ftn) h32Var.b;
            try {
                ftnVar.e.a(new ysn(h32Var));
            } catch (Throwable th) {
                ftnVar.h(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void h(Throwable th) {
        j63 j63Var = this.b;
        ArrayList arrayList = new ArrayList(j63Var.c);
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(j63Var);
            j63Var.clear();
            this.a.writeLock().unlock();
            for (int i = 0; i < arrayList.size(); i++) {
                ctn ctnVar = (ctn) arrayList.get(i);
                ctnVar.b.execute(new wqj(20, ctnVar, th));
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence i(int i, int i2, CharSequence charSequence, int i3, int i4) {
        boolean z;
        d6z.y("Not initialized yet", f());
        if (i < 0) {
            ny61.g("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            ny61.g("end cannot be negative");
            return null;
        }
        if (i3 < 0) {
            ny61.g("maxEmojiCount cannot be negative");
            return null;
        }
        d6z.m("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        d6z.m("start should be < than charSequence length", i <= charSequence.length());
        d6z.m("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.g : false;
        } else {
            z = true;
        }
        return ((b) this.d.a).f(charSequence, i, i2, i3, z);
    }

    public final CharSequence j(CharSequence charSequence) {
        return i(0, charSequence == null ? 0 : charSequence.length(), charSequence, Integer.MAX_VALUE, 0);
    }

    public final void k(btn btnVar) {
        Handler createAsync = Handler.createAsync(Looper.getMainLooper());
        Objects.requireNonNull(createAsync);
        rlf rlfVar = new rlf(0, createAsync);
        d6z.v(btnVar, "initCallback cannot be null");
        ctn ctnVar = new ctn();
        ctnVar.a = btnVar;
        ctnVar.b = rlfVar;
        this.a.writeLock().lock();
        try {
            if (this.c == 1) {
                rlfVar.execute(new uhm(19, ctnVar));
            } else if (this.c == 2) {
                rlfVar.execute(new wqj(20, ctnVar, new IllegalStateException("Initialization failed prior to registering this callback, please add an initialization callback to the EmojiCompat.Config instead to see the cause.")));
            } else {
                this.b.add(ctnVar);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void l(btn btnVar) {
        j63 j63Var = this.b;
        d6z.v(btnVar, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            ArrayList arrayList = new ArrayList();
            j63Var.getClass();
            r53 r53Var = new r53(j63Var);
            while (r53Var.hasNext()) {
                ctn ctnVar = (ctn) r53Var.next();
                if (ctnVar.a == btnVar) {
                    arrayList.add(ctnVar);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j63Var.remove((ctn) it.next());
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    public final void m(EditorInfo editorInfo) {
        if (!f() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        h32 h32Var = this.d;
        h32Var.getClass();
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", ((wjm) h32Var.c).o());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", ((ftn) h32Var.b).g);
    }
}
