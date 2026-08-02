package com.ybsdk.feature.split.deposit.internal.ui;

import com.ybsdk.core.utils.text.Text;
import defpackage.a9u0;
import defpackage.g8e;
import defpackage.qc70;
import defpackage.tc70;

/* loaded from: classes3.dex */
public abstract class a {
    public static final b a(a9u0 a9u0Var, qc70 qc70Var, boolean z) {
        String str;
        String str2;
        return new b(new tc70(qc70Var, z), (a9u0Var == null || (str2 = a9u0Var.a) == null) ? null : g8e.i(Text.Companion, str2), (a9u0Var == null || (str = a9u0Var.b) == null) ? null : g8e.i(Text.Companion, str), a9u0Var != null ? a9u0Var.c : null, 8);
    }
}
