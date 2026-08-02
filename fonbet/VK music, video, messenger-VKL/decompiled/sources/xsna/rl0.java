package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.imageloader.view.VKImageView;
import com.vk.metrics.eventtracking.Event;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vkontakte.android.R;

/* compiled from: AddKeywordButtonHolder.kt */
/* loaded from: classes5.dex */
public final class rl0 extends RecyclerView.e0 implements View.OnClickListener {
    public static final /* synthetic */ int m = 0;
    public final mj0 l;

    public rl0(FrameLayout frameLayout, AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow) {
        super(frameLayout);
        this.l = autoSuggestStickersPopupWindow;
        VKImageView vKImageView = (VKImageView) frameLayout.getChildAt(0);
        vKImageView.setAspectRatio(1.0f);
        vKImageView.setBackground(vKImageView.getContext().getDrawable(R.drawable.bg_pack_rounded));
        frameLayout.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g2v.d().v().a(view.getContext());
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("stickers_suggestions_bot_link");
        aVar.i("StatlogTracker");
        aVar.h();
        bVar.k(aVar.e());
    }
}
