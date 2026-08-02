package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes10.dex */
public final class cw41 implements b5p {
    public final ef90 a = new ef90(4);
    public final vhs0 b = new vhs0(-1, -1, GlideBitmapDownloader.ACCEPT_WEBP);

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        this.b.a(j, j2);
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.b.e(d5pVar);
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        return this.b.g(c5pVar, xde0Var);
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        ef90 ef90Var = this.a;
        ef90Var.H(4);
        kbh kbhVar = (kbh) c5pVar;
        kbhVar.H(ef90Var.a, 0, 4, false);
        if (ef90Var.A() == 1380533830) {
            kbhVar.a(4, false);
            ef90Var.H(4);
            kbhVar.H(ef90Var.a, 0, 4, false);
            if (ef90Var.A() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
