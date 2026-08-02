package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.Pair;

/* compiled from: CollageGridView1.kt */
/* loaded from: classes4.dex */
public final class y0g extends l1g {
    public final Map<n2k0, CollageSlotView> e;

    public y0g(Context context) {
        super(context, null);
        addView(LayoutInflater.from(context).inflate(R.layout.grid_1, (ViewGroup) null));
        this.e = on00.f(new Pair(h2k0.a, findViewById(R.id.slot_1)));
        b();
    }

    @Override // xsna.l1g
    public Map<n2k0, CollageSlotView> getSlots() {
        return this.e;
    }
}
