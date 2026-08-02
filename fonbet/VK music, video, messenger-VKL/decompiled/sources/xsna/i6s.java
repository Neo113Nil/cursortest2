package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vkontakte.android.R;
import xsna.gt10;
import xsna.n6s;

/* compiled from: FooterErrorHolder.kt */
/* loaded from: classes17.dex */
public final class i6s extends hf6<k6s> {
    public final gt10.a m;

    public i6s(View view, VkMediaPicker vkMediaPicker) {
        super(view);
        this.m = vkMediaPicker;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.error_view_container);
        n6s.a aVar = n6s.a;
        Context context = this.itemView.getContext();
        aVar.getClass();
        rhl rhlVar = new rhl(context);
        rhlVar.b();
        rhlVar.setRetryClickListener(new ao3(this, 1));
        frameLayout.addView(rhlVar);
    }

    @Override // xsna.hf6
    public final /* bridge */ /* synthetic */ void W5(k6s k6sVar) {
    }
}
