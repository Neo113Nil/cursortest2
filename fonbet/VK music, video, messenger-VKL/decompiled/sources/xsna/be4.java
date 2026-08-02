package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k840;

/* compiled from: AudioBookChapterDownloadingStateListenerImpl.kt */
/* loaded from: classes3.dex */
public final class be4 implements jb50 {
    public final hfp0 a;

    /* compiled from: AudioBookChapterDownloadingStateListenerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<yj40, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(yj40 yj40Var) {
            ((be4) this.receiver).getClass();
            i0q0.f(new kd(yj40Var, 7));
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public be4(AudioBook audioBook, AudioBookChapter audioBookChapter, gco gcoVar) {
        MusicTrack d = com.vk.dto.music.audiobook.a.d(audioBook, audioBookChapter);
        a aVar = new a(1, this, be4.class, "post", "post(Lcom/vk/music/events/MusicEvent;)V", 0);
        s750 s750Var = k840.a.e;
        hfp0 hfp0Var = new hfp0(d, gcoVar, aVar, s750Var == null ? null : s750Var);
        this.a = hfp0Var;
        MusicTrack b = kq40.b(d);
        hfp0Var.b.invoke(new ib50(hfp0Var.d, b));
        hfp0Var.d = b;
    }

    @Override // xsna.jb50
    public final synchronized void a(float f) {
        hfp0.b(this.a, f);
    }

    @Override // xsna.jb50
    public final synchronized void b() {
        hfp0.c(this.a, null, 3);
    }

    @Override // xsna.jb50
    public final synchronized void c() {
        hfp0.a(this.a);
    }

    @Override // xsna.jb50
    public final synchronized void e(Exception exc) {
        hfp0.c(this.a, exc, 2);
    }

    @Override // xsna.jb50
    public final void d() {
    }
}
