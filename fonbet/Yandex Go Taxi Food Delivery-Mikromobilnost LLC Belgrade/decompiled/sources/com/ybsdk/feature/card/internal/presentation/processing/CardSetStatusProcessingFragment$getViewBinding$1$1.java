package com.ybsdk.feature.card.internal.presentation.processing;

import android.net.Uri;
import com.ybsdk.di.modules.features.c;
import defpackage.tls;
import defpackage.uc5;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CardSetStatusProcessingFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements tls {
    public CardSetStatusProcessingFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((c) ((a) this.receiver).C).a(((Uri) obj).toString()));
    }
}
