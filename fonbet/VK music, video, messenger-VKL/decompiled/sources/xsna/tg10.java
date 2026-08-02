package xsna;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MaskWrapVirtualBackground.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class tg10 extends FunctionReferenceImpl implements izs<Collection<? extends bi10>, ArrayList<bi10>> {
    public static final tg10 b = new tg10(1, ArrayList.class, "<init>", "<init>(Ljava/util/Collection;)V", 0);

    @Override // xsna.izs
    public final ArrayList<bi10> invoke(Collection<? extends bi10> collection) {
        return new ArrayList<>(collection);
    }
}
