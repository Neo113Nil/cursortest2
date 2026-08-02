package xsna;

import android.content.Context;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import java.io.File;

/* compiled from: ReverseDelegate.kt */
/* loaded from: classes16.dex */
public final class vfg0 {
    public final Context a;
    public final szd b;
    public final c9d c;
    public final e2e d;
    public final ClipsEditorFragment.b e;
    public final lxd f;
    public io.reactivex.rxjava3.disposables.c g;
    public wdt0 h;

    /* compiled from: ReverseDelegate.kt */
    public static abstract class a {

        /* compiled from: ReverseDelegate.kt */
        /* renamed from: xsna.vfg0$a$a, reason: collision with other inner class name */
        public static final class C3887a extends a {
            public static final C3887a a = new C3887a();
        }

        /* compiled from: ReverseDelegate.kt */
        public static final class b extends a {
        }

        /* compiled from: ReverseDelegate.kt */
        public static final class c extends a {
            public final File a;

            public c(File file) {
                this.a = file;
            }
        }
    }

    public vfg0(Context context, szd szdVar, c9d c9dVar, e2e e2eVar, ClipsEditorFragment.b bVar, lxd lxdVar) {
        this.a = context;
        this.b = szdVar;
        this.c = c9dVar;
        this.d = e2eVar;
        this.e = bVar;
        this.f = lxdVar;
    }
}
