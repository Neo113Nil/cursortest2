package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import java.util.ArrayList;
import java.util.List;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gh40(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final vh40 vh40Var = (vh40) this.d;
                final UserId userId = (UserId) this.e;
                final AudioBookChapter audioBookChapter = (AudioBookChapter) obj;
                final int i = this.c;
                return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.oh40
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        vh40 vh40Var2 = vh40.this;
                        fq40 fq40Var = vh40Var2.b;
                        int i2 = i;
                        UserId userId2 = userId;
                        int f = fq40Var.f(i2, userId2);
                        AudioBook y = fq40Var.y(i2, userId2);
                        if (y != null) {
                            if (f == 0) {
                                sg40 sg40Var = vh40Var2.c;
                                sg40Var.n.submit(new og40(sg40Var, userId2, y));
                            }
                            AudioBookChapter audioBookChapter2 = audioBookChapter;
                            if (audioBookChapter2 != null) {
                                MusicTrack d = com.vk.dto.music.audiobook.a.d(y, audioBookChapter2);
                                MusicTrack a = kq40.a(com.vk.dto.music.audiobook.a.d(y, audioBookChapter2));
                                r5v0 r5v0Var = k840.a.h;
                                if (r5v0Var == null) {
                                    r5v0Var = null;
                                }
                                r5v0Var.b(new ib50(d, a));
                            }
                        }
                    }
                });
            default:
                pa90 pa90Var = (pa90) this.d;
                com.vk.lists.c cVar = (com.vk.lists.c) this.e;
                ArrayList arrayList = pa90Var.i;
                int k = cVar.k();
                return pa90Var.a(this.c, k, arrayList, (List) obj);
        }
    }
}
