package sg.bigo.ads.api.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.i;

/* loaded from: classes9.dex */
public interface o extends sg.bigo.ads.api.core.b {

    public interface a {
        int a();

        int b();

        String c();
    }

    public interface b {
        int a();

        long b();

        int c();

        long d();
    }

    public interface c {
        int a();

        int b();

        String c();
    }

    public interface d {
        long a();

        void a(long j);

        void a(boolean z);

        boolean b();

        int c();

        boolean d();
    }

    @NonNull
    String a(Context context);

    void a(Pair<Bitmap, String> pair);

    void a(n nVar);

    @Nullable
    a aD();

    @Nullable
    i.b aE();

    @Nullable
    a[] aF();

    @Nullable
    c aG();

    @Nullable
    String aH();

    @Nullable
    b aI();

    @Nullable
    d aJ();

    int aK();

    int aL();

    long aM();

    boolean aN();

    boolean aO();

    int aP();

    String aQ();

    String aR();

    String aS();

    long aT();

    int aU();

    String aV();

    boolean aW();

    @Nullable
    String aX();

    @Nullable
    String aY();

    boolean aZ();

    @NonNull
    String b(Context context);

    void b(long j);

    void bA();

    String bB();

    String bC();

    String bD();

    boolean ba();

    @Nullable
    String bb();

    long bc();

    @Nullable
    n bd();

    boolean be();

    void bf();

    String bg();

    boolean bh();

    void bi();

    boolean bj();

    void bk();

    int bl();

    int bm();

    int bn();

    int bo();

    int bp();

    Pair<Bitmap, String> bq();

    boolean br();

    void bs();

    void bt();

    boolean bu();

    int bv();

    int bw();

    int bx();

    int by();

    boolean bz();

    String c(Context context);

    void c(String str);

    boolean c(long j);

    void f(int i);

    void g(int i);

    void h(int i);

    void i(int i);

    void j(int i);

    void k(int i);

    void l(int i);

    void m(int i);

    void n(int i);

    void o(int i);

    void p(int i);
}
