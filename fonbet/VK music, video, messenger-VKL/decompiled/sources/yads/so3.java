package yads;

/* loaded from: classes10.dex */
public abstract class so3 {
    public static boolean a(ld0 ld0Var) {
        kc2 kc2Var = new kc2(8);
        int i = ro3.a(ld0Var, kc2Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ld0Var.b(kc2Var.a, 0, 4, false);
        kc2Var.e(0);
        int b = kc2Var.b();
        if (b == 1463899717) {
            return true;
        }
        ji1.b("WavHeaderReader", "Unsupported form type: " + b);
        return false;
    }

    public static ro3 a(int i, ld0 ld0Var, kc2 kc2Var) {
        ro3 a = ro3.a(ld0Var, kc2Var);
        while (a.a != i) {
            ji1.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a.a);
            long j = a.b + 8;
            if (j <= 2147483647L) {
                ld0Var.a((int) j);
                a = ro3.a(ld0Var, kc2Var);
            } else {
                throw pc2.b("Chunk is too large (~2GB+) to skip; id: " + a.a);
            }
        }
        return a;
    }
}
