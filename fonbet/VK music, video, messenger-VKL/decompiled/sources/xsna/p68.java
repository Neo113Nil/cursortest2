package xsna;

import com.vk.channels.api.Channel;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class p68 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p68(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        switch (this.b) {
            case 0:
                q68 q68Var = (q68) this.c;
                e.a.AbstractC1393a abstractC1393a = (e.a.AbstractC1393a) this.d;
                if (dhr0.M()) {
                    abstractC1393a.d.getClass();
                    i = R.raw.posting_attach_more_icon_dark;
                } else {
                    abstractC1393a.d.getClass();
                    i = R.raw.posting_attach_more_icon;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(q68Var.itemView.getContext().getResources().openRawResource(i), emb.b), 8192);
                try {
                    String b = a0a.b(bufferedReader);
                    bufferedReader.close();
                    String simpleName = abstractC1393a.getClass().getSimpleName();
                    String concat = dhr0.M() ? simpleName.concat("_dark") : simpleName.concat("_light");
                    int i2 = q68Var.n;
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(b, concat, i2, i2, null, false, false, null, 496);
                    rLottieDrawable.k.q = 1;
                    rLottieDrawable.i();
                    rLottieDrawable.setCallback(q68Var.o);
                    return rLottieDrawable;
                } finally {
                }
            case 1:
                Channel channel = (Channel) this.c;
                channel.P = ((lxa) this.d).d();
                return channel;
            case 2:
                return ((vh40) this.c).e.e(Collections.singletonList((MusicTrack) this.d));
            default:
                String str = (String) this.c;
                String str2 = (String) this.d;
                JSONObject jSONObject = new JSONObject(str);
                AnimatedStickerInfo animatedStickerInfo = new AnimatedStickerInfo(str2, jSONObject.optInt(Logger.METHOD_W), jSONObject.optInt("h"));
                animatedStickerInfo.e = str;
                return animatedStickerInfo;
        }
    }
}
