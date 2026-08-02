package xsna;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.styles.ServiceStickerStyle;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StoryServiceStickerBaseView.kt */
/* loaded from: classes6.dex */
public final class kdm0 extends LinearLayout implements c8l0<StoryServiceItemInfo> {
    public final kdm0 b;
    public final Object c;
    public final Object d;

    public kdm0(Context context) {
        super(context, null, 0);
        this.b = this;
        iia0 iia0Var = new iia0(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, iia0Var);
        this.d = msy.a(lazyThreadSafetyMode, new lbc0(this, 20));
        View.inflate(context, R.layout.sticker_service, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTvSubtitle() {
        return (TextView) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTvTitle() {
        return (TextView) this.c.getValue();
    }

    private final void setService(StoryServiceItemInfo storyServiceItemInfo) {
        getTvTitle().setText(storyServiceItemInfo.a);
        getTvSubtitle().setText(String.valueOf(storyServiceItemInfo.b));
        setContentDescription(pdq.c(getContext(), storyServiceItemInfo, ServiceStickerStyle.Sticker));
    }

    @Override // xsna.c8l0
    public final void update(StoryServiceItemInfo storyServiceItemInfo) {
        StoryServiceItemInfo storyServiceItemInfo2 = storyServiceItemInfo;
        if (storyServiceItemInfo2 != null) {
            setService(storyServiceItemInfo2);
            return;
        }
        getTvTitle().setText("");
        getTvSubtitle().setText("");
        setContentDescription(null);
    }

    @Override // xsna.c8l0
    public kdm0 getView() {
        return this.b;
    }
}
