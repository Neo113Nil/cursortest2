package defpackage;

import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class bd00 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MainSidePagerSidePage.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
