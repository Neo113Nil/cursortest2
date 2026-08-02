package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public abstract class s30 {
    public static void a(p30 p30Var) {
        if (p30Var != null) {
            try {
                p30Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
