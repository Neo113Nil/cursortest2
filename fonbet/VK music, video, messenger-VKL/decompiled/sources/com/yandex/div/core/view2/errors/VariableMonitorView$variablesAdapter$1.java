package com.yandex.div.core.view2.errors;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.s3q0;
import xsna.yzs;

/* compiled from: VariableMonitorView.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class VariableMonitorView$variablesAdapter$1 extends FunctionReferenceImpl implements yzs<String, String, String, s3q0> {
    public VariableMonitorView$variablesAdapter$1(Object obj) {
        super(3, obj, VariableMonitor.class, "mutateVariable", "mutateVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // xsna.yzs
    public /* bridge */ /* synthetic */ s3q0 invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        ((VariableMonitor) this.receiver).mutateVariable(str, str2, str3);
    }
}
