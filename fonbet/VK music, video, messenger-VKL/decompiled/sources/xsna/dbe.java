package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ClipsGridBlockClipItemsContainer.kt */
/* loaded from: classes17.dex */
public final class dbe {
    public final View a;
    public final nbe b;
    public final List<abe> c;

    public dbe(View view, nbe nbeVar) {
        this.a = view;
        this.b = nbeVar;
        List<abe> l = e43.l(new abe((ViewGroup) view.findViewById(R.id.top_left_clip_item)), new abe((ViewGroup) view.findViewById(R.id.top_right_clip_item)), new abe((ViewGroup) view.findViewById(R.id.bottom_left_clip_item)), new abe((ViewGroup) view.findViewById(R.id.bottom_right_clip_item)));
        this.c = l;
        final int i = 0;
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            jjc.g(((abe) obj).a, new izs() { // from class: xsna.cbe
                @Override // xsna.izs
                public final Object invoke(Object obj2) {
                    dbe.this.b.invoke(new ClipsGridBlockAction.b(i));
                    return s3q0.a;
                }
            });
            i = i2;
        }
    }
}
