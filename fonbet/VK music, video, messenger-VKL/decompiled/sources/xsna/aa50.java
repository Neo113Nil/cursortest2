package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MusicTemplateTransitionViewsProvider.kt */
/* loaded from: classes17.dex */
public final class aa50 implements z8e {
    public final twc<FeedItem.k> b;
    public final awc c;

    public aa50(twc<FeedItem.k> twcVar) {
        this.b = twcVar;
        this.c = twcVar.getCommonOverlayContainer();
    }

    @Override // xsna.z8e
    public final List<View> N0() {
        return EmptyList.b;
    }

    @Override // xsna.z8e
    public final List<View> q1() {
        awc awcVar = this.c;
        return e43.l(awcVar.a, awcVar.b);
    }

    @Override // xsna.z8e
    public final List<View> w2() {
        List<View> q1 = q1();
        View[] d = awt0.d(this.b);
        ArrayList arrayList = new ArrayList();
        for (View view : d) {
            if (!q1.contains(view)) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }
}
