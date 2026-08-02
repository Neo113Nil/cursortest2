package xsna;

import android.view.View;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Lambda;

/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes12.dex */
public final class sml extends Lambda implements izs<Map.Entry<String, View>, Boolean> {
    final /* synthetic */ Collection<String> $names;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sml(Collection<String> collection) {
        super(1);
        this.$names = collection;
    }

    @Override // xsna.izs
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Collection<String> collection = this.$names;
        View value = entry.getValue();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return Boolean.valueOf(j5g.P(collection, value.getTransitionName()));
    }
}
