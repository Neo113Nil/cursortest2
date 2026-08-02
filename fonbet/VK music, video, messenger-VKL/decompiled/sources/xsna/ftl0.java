package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoriesInvalidateHandlerImpl.kt */
/* loaded from: classes4.dex */
public final class ftl0 implements dtl0 {
    public final FunctionReferenceImpl a;
    public final p870 b;
    public final etl0 c = new etl0(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public ftl0(izs<? super GetStoriesResponse, s3q0> izsVar, p870 p870Var) {
        this.a = (FunctionReferenceImpl) izsVar;
        this.b = p870Var;
    }

    @Override // xsna.dtl0
    public final void onCreate() {
        this.b.b(101, this.c);
    }

    @Override // xsna.dtl0
    public final void onDestroy() {
        this.b.g(this.c);
    }
}
