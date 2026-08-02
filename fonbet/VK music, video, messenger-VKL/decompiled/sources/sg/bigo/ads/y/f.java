package sg.bigo.ads.y;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.core.player.b;
import sg.bigo.ads.dh.p;

/* loaded from: classes9.dex */
public final class f<T extends Ad> {

    @NonNull
    T a;

    @NonNull
    Context b;

    @NonNull
    sg.bigo.ads.cp.a c;
    p d;

    @NonNull
    d.a<T> e;
    final sg.bigo.ads.dk.c f;
    b.a g;
    sg.bigo.ads.cz.d h;

    /* renamed from: sg.bigo.ads.y.f$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ int a;

        public AnonymousClass1(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.a;
            if (i != 0) {
                f fVar = f.this;
                fVar.e.a(fVar.a, 1006, i, "Invalid VPAID media files.");
                return;
            }
            f.this.g = new b.a() { // from class: sg.bigo.ads.y.f.1.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i2) {
                    f fVar2 = f.this;
                    fVar2.e.a(fVar2.a, 1006, i2, "Failed to download VPAID.");
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i2) {
                    f fVar2 = f.this;
                    if (fVar2.d == null) {
                        fVar2.e.a(fVar2.a, 1006, 10075, "VPAID video config is empty.");
                    } else {
                        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.y.f.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.ak.b b = sg.bigo.ads.ak.b.b(f.this.c.y());
                                b.c = false;
                                f fVar3 = f.this;
                                p pVar = fVar3.d;
                                int i3 = pVar.x;
                                int i4 = pVar.w;
                                f fVar4 = f.this;
                                fVar3.h = new sg.bigo.ads.cz.d(fVar4.b, i3, i4, b, fVar4.c);
                                f fVar5 = f.this;
                                fVar5.h.setOnEventListener(fVar5.f);
                            }
                        });
                    }
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.ay.a aVar) {
                }
            };
            sg.bigo.ads.core.player.b a = sg.bigo.ads.core.player.b.a();
            f fVar2 = f.this;
            a.a(fVar2.b, fVar2.c, fVar2.g);
        }
    }

    public f(@NonNull Context context, sg.bigo.ads.dk.c cVar, @NonNull sg.bigo.ads.cp.a aVar, p pVar, @NonNull d.a<T> aVar2, @NonNull T t) {
        this.b = context;
        this.f = cVar;
        this.c = aVar;
        this.d = pVar;
        this.e = aVar2;
        this.a = t;
    }

    public final boolean a() {
        return this.c.au() == 1;
    }
}
