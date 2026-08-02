package ru.ok.android.externcalls.sdk.stat.view;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TextStatRendererView.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class TextStatRendererView$setRenderer$1 extends FunctionReferenceImpl implements izs<CharSequence, s3q0> {
    public TextStatRendererView$setRenderer$1(Object obj) {
        super(1, obj, TextStatRendererView.class, "onStatText", "onStatText(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        ((TextStatRendererView) this.receiver).onStatText(charSequence);
    }
}
