package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class etl0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ etl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ((ftl0) this.c).a.invoke(new GetStoriesResponse(arrayList, arrayList.size()));
                break;
            default:
                ((com.vk.story.viewer.impl.presentation.stories.b) this.c).F();
                break;
        }
    }
}
