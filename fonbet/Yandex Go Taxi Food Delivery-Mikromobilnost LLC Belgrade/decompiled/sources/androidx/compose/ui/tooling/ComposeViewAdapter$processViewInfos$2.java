package androidx.compose.ui.tooling;

import defpackage.aud;
import defpackage.bms;
import defpackage.ur31;
import defpackage.ybt0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* synthetic */ class ComposeViewAdapter$processViewInfos$2 extends FunctionReferenceImpl implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ur31 viewInfoFactory;
        viewInfoFactory = ((ComposeViewAdapter) this.receiver).toViewInfoFactory((aud) obj, (ybt0) obj2, (List) obj3, (List) obj4);
        return viewInfoFactory;
    }
}
