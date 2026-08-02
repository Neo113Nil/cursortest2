package ru.ok.android.externcalls.sdk.stat.view;

import android.widget.TextView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TextStatRenderer.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class TextStatRenderer$setTextConsumer$1 extends FunctionReferenceImpl implements izs<CharSequence, s3q0> {
    public TextStatRenderer$setTextConsumer$1(Object obj) {
        super(1, obj, TextView.class, "setText", "setText(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        ((TextView) this.receiver).setText(charSequence);
    }
}
