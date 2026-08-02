package defpackage;

import android.util.Range;
import androidx.camera.core.impl.StreamUseCase;

/* loaded from: classes10.dex */
public final class cl31 {
    public static final el31 a;
    public static final Range b;
    public static final Range c;

    static {
        StreamUseCase streamUseCase = StreamUseCase.VIDEO_RECORD;
        bl31 bl31Var = new bl31();
        b = new Range(30, 30);
        c = new Range(120, 120);
        al31 al31Var = new al31(bl31Var);
        x34 x34Var = xi21.n4;
        yy40 yy40Var = al31Var.a;
        yy40Var.w(x34Var, 5);
        yy40Var.w(xi21.y4, streamUseCase);
        yy40Var.w(el31.c, tl31.w);
        yy40Var.w(eav.l2, q8n.d);
        a = new el31(ug70.a(yy40Var));
    }
}
