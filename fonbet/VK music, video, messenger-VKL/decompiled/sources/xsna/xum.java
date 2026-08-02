package xsna;

import android.content.Context;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xum implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xum(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, this.c, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -524289, 2097151);
            case 1:
                DonutReactionButtonView donutReactionButtonView = new DonutReactionButtonView((Context) obj, null, 6);
                donutReactionButtonView.setCount(5500);
                donutReactionButtonView.setOnClickListener(this.c ? new wv0(13) : null);
                return donutReactionButtonView;
            default:
                ((Boolean) obj).booleanValue();
                return Integer.valueOf(this.c ? R.string.music_track_dislike_on_talkback : R.string.music_track_dislike_off_talkback);
        }
    }
}
