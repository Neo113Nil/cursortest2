package defpackage;

import android.graphics.Outline;

/* loaded from: classes10.dex */
public final class ox80 {
    public static final ox80 a = new ox80();

    public final void a(Outline outline, rq90 rq90Var) {
        if (rq90Var instanceof jb2) {
            outline.setPath(((jb2) rq90Var).a);
        } else {
            w511.x("Unable to obtain android.graphics.Path");
        }
    }
}
