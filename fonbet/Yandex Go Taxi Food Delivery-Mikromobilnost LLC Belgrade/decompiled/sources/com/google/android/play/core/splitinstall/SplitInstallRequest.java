package com.google.android.play.core.splitinstall;

import defpackage.hhs0;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class SplitInstallRequest {
    public final ArrayList a;
    public final ArrayList b;

    public /* synthetic */ SplitInstallRequest(hhs0 hhs0Var) {
        this.a = new ArrayList((ArrayList) hhs0Var.b);
        this.b = new ArrayList((ArrayList) hhs0Var.c);
    }

    public static hhs0 a() {
        return new hhs0(6);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
