package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CollageRendererGrid.kt */
@b6l(c = "com.vk.photo.editor.features.collage.render.CollageRendererGrid", f = "CollageRendererGrid.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "render")
/* loaded from: classes4.dex */
public final class a2g extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b2g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2g(b2g b2gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = b2gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
