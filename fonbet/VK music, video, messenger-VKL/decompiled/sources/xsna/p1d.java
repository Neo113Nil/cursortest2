package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import kotlin.NoWhenBranchMatchedException;
import xsna.z830;

/* compiled from: ClipItemMviView.kt */
/* loaded from: classes17.dex */
public final class p1d implements h8d {
    public final /* synthetic */ o1d b;

    public p1d(o1d o1dVar) {
        this.b = o1dVar;
    }

    @Override // xsna.h8d
    public final void b(z830 z830Var) {
        ClipItemViewEvent clipItemViewEvent;
        o1d o1dVar = this.b;
        h3d h3dVar = o1dVar.k;
        if (z830Var instanceof z830.a) {
            clipItemViewEvent = m5d.b;
        } else if (z830Var instanceof z830.g) {
            clipItemViewEvent = t5d.b;
        } else if (z830Var instanceof z830.e) {
            clipItemViewEvent = s5d.b;
        } else if (z830Var instanceof z830.h) {
            clipItemViewEvent = u5d.b;
        } else {
            if (!(z830Var instanceof z830.d) && !(z830Var instanceof z830.b) && !(z830Var instanceof z830.f) && !(z830Var instanceof z830.c)) {
                if (z830Var instanceof a930) {
                    clipItemViewEvent = n5d.b;
                } else if (z830Var instanceof b930) {
                    clipItemViewEvent = o5d.b;
                } else if (z830Var instanceof c930) {
                    clipItemViewEvent = p5d.b;
                } else if (z830Var instanceof d930) {
                    clipItemViewEvent = q5d.b;
                } else if (z830Var instanceof h930) {
                    clipItemViewEvent = r5d.b;
                } else if (z830Var instanceof f930) {
                    f930 f930Var = (f930) z830Var;
                    h3dVar.Gm(f930Var.a, f930Var.b);
                    s3q0 s3q0Var = s3q0.a;
                } else if (z830Var instanceof e930) {
                    h3dVar.S9(((e930) z830Var).a);
                    s3q0 s3q0Var2 = s3q0.a;
                } else {
                    if (!(z830Var instanceof g930)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h3dVar.ah(((g930) z830Var).a);
                    s3q0 s3q0Var3 = s3q0.a;
                }
            }
            clipItemViewEvent = null;
        }
        if (clipItemViewEvent != null) {
            o1dVar.x0.a(clipItemViewEvent);
        }
    }
}
