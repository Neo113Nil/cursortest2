package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class aoc0 extends FunctionReferenceImpl implements izs<List<? extends LocalAlbum>, s3q0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final s3q0 invoke(List<? extends LocalAlbum> list) {
        List<? extends LocalAlbum> list2 = list;
        enc0 enc0Var = (enc0) this.receiver;
        enc0Var.X = list2;
        boolean z = list2.size() > 1;
        TabLayout.g b = enc0Var.s.b(enc0.q0.indexOf(MediaPickerState.Tab.LocalAlbum));
        View view = b != null ? b.f : null;
        com.vk.core.view.components.tabs.d dVar = view instanceof com.vk.core.view.components.tabs.d ? (com.vk.core.view.components.tabs.d) view : null;
        if (dVar != null) {
            com.vk.core.view.components.tabs.d.X4(dVar, z ? Integer.valueOf(R.drawable.vk_icon_dropdown_outline_16) : null);
            if (z) {
                ViewGroup.LayoutParams layoutParams = ((ImageView) dVar.findViewById(R.id.right_icon)).getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
        }
        return s3q0.a;
    }
}
