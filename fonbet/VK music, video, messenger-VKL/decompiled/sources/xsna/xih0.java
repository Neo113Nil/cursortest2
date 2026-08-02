package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.wih0;

/* compiled from: SdkClipsFeedItem.kt */
/* loaded from: classes17.dex */
public final class xih0 {
    public static final String a(wih0 wih0Var) {
        String e;
        if (wih0Var instanceof wih0.a) {
            wih0.a aVar = (wih0.a) wih0Var;
            wp50 wp50Var = aVar.b;
            return (wp50Var == null || (e = wp50Var.e()) == null) ? aVar.a.a1() : e;
        }
        if (wih0Var instanceof wih0.d) {
            return ((wih0.d) wih0Var).a;
        }
        if (wih0Var instanceof wih0.b) {
            return ((wih0.b) wih0Var).a;
        }
        if (wih0Var instanceof wih0.c) {
            return ((wih0.c) wih0Var).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(wih0 wih0Var) {
        String e;
        if (wih0Var instanceof wih0.a) {
            wih0.a aVar = (wih0.a) wih0Var;
            wp50 wp50Var = aVar.b;
            return (wp50Var == null || (e = wp50Var.e()) == null) ? aVar.a.r1() : e;
        }
        if (wih0Var instanceof wih0.d) {
            return ((wih0.d) wih0Var).a;
        }
        if (wih0Var instanceof wih0.b) {
            return ((wih0.b) wih0Var).a;
        }
        if (wih0Var instanceof wih0.c) {
            return ((wih0.c) wih0Var).a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
