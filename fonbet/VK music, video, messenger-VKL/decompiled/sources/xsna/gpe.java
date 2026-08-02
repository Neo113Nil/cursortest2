package xsna;

import java.util.ArrayList;
import java.util.List;
import xsna.fpe;

/* compiled from: ClipsOwnerSwipeViewStateMapper.kt */
/* loaded from: classes17.dex */
public final class gpe {
    public static fpe.b a(voe voeVar) {
        int i = 0;
        List I = rl3.I(new mme[]{voeVar.b.b, voeVar.e});
        if (voeVar.c && ((ArrayList) I).size() > 1) {
            i = 1;
        }
        return new fpe.b(I, i);
    }
}
