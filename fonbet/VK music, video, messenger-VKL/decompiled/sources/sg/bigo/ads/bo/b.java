package sg.bigo.ads.bo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.bs.c;
import sg.bigo.ads.bt.c;

/* loaded from: classes9.dex */
public abstract class b<Req extends sg.bigo.ads.bs.c, Res extends sg.bigo.ads.bt.c> {
    public static b<sg.bigo.ads.bs.c, sg.bigo.ads.bt.a> d = new a();

    public static class a<Req extends sg.bigo.ads.bs.c> extends b<Req, sg.bigo.ads.bt.a> {
        Req a;
        sg.bigo.ads.bt.a b;
        h c;

        @Override // sg.bigo.ads.bo.b
        public final /* bridge */ /* synthetic */ sg.bigo.ads.bt.a a(@NonNull sg.bigo.ads.bt.a aVar) {
            return aVar;
        }

        @Override // sg.bigo.ads.bo.b
        public final void a(@NonNull Req req, @NonNull h hVar) {
            this.a = req;
            this.c = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.bo.b
        public final /* bridge */ /* synthetic */ void a(@NonNull sg.bigo.ads.bs.c cVar, @NonNull sg.bigo.ads.bt.a aVar) {
            this.a = cVar;
            this.b = aVar;
        }
    }

    public abstract Res a(@NonNull sg.bigo.ads.bt.a aVar);

    public void a(@NonNull Req req) {
    }

    public abstract void a(@NonNull Req req, @NonNull h hVar);

    public abstract void a(@NonNull Req req, @NonNull Res res);

    public void a(@NonNull Req req, @Nullable String str, int i) {
    }

    public boolean a(@NonNull Req req, int i) {
        return i >= 200 && i < 300;
    }
}
