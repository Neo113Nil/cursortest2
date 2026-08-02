package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.Pair;

/* compiled from: CollageGridView2Vertical.kt */
/* loaded from: classes4.dex */
public final class z0g extends l1g {
    public final Object e;

    public z0g(Context context) {
        super(context, null);
        addView(LayoutInflater.from(context).inflate(R.layout.grid_2_horizontal, (ViewGroup) null));
        this.e = pn00.k(new Pair(h2k0.a, findViewById(R.id.slot_1)), new Pair(i2k0.a, findViewById(R.id.slot_2)));
        b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<xsna.n2k0, com.vk.photo.editor.features.collage.view.CollageSlotView>] */
    @Override // xsna.l1g
    public Map<n2k0, CollageSlotView> getSlots() {
        return this.e;
    }
}
