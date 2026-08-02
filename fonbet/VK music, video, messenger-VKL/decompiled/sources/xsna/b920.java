package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.music.subscription.MusicSubscriptionDetailsContainer;
import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import com.vk.search.params.api.City;
import com.vk.search.params.api.SearchParamsWithCity;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: MergeTask.java */
/* loaded from: classes2.dex */
public abstract class b920 implements i7d0 {
    public static final String[] b = {"com.vkontakte.android", "ru.mail.mailapp", "ru.ok.messages", "ru.ok.android", "ru.ok.android.debug", "ru.vk.store", "ru.vk.store.qa", "com.vk.tv", "com.vk.vkvideo", "com.vk.clips", "com.my.targetdemo5.initauto", "com.my.targetdemo5.initmanual", "com.my.targetdemo5.logoff"};

    public static int b(float f, float f2) {
        float f3 = f - f2;
        if (f3 > 1.0E-6f) {
            return 1;
        }
        return f3 < -1.0E-6f ? -1 : 0;
    }

    public static String c(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static ViewGroup g(ViewGroup viewGroup, int i, List list, boolean z, f950 f950Var, Set set, int i2, int i3, boolean z2) {
        ViewGroup viewGroup2 = (ViewGroup) tf3.b(viewGroup, R.layout.music_buy_subscription_options_container, viewGroup, false);
        MusicSubscriptionDetailsContainer musicSubscriptionDetailsContainer = (MusicSubscriptionDetailsContainer) viewGroup2.getChildAt(0);
        Iterator it = set.iterator();
        int i4 = -1;
        while (it.hasNext() && (i4 = list.indexOf((zym0) it.next())) < 0) {
        }
        List<TextView> list2 = musicSubscriptionDetailsContainer.t;
        if (i4 > list.size()) {
            throw new IllegalArgumentException(" parameter \"activeIndex\" must satisfy condition:  activeIndex < options.size ");
        }
        if (list.size() > list2.size()) {
            throw new IllegalArgumentException(("Too many options for this container. " + new e07(0, musicSubscriptionDetailsContainer, qjg.class, "className", "className(Ljava/lang/Object;)Ljava/lang/String;", 1, 2) + " able to display only " + list2.size() + " options. Got " + list.size()).toString());
        }
        int i5 = 0;
        for (Object obj : list2) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                e43.t();
                throw null;
            }
            TextView textView = (TextView) obj;
            if (i5 < list.size()) {
                textView.setVisibility(0);
                textView.setText(((zym0) list.get(i5)).b);
                his0.w(textView, ((zym0) list.get(i5)).a, R.attr.vk_ui_icon_accent);
            } else {
                textView.setVisibility(4);
            }
            if (i5 == 0) {
                bwt0.p0(musicSubscriptionDetailsContainer.x, ((zym0) list.get(i5)).c);
            }
            i5 = i6;
        }
        View view = musicSubscriptionDetailsContainer.w;
        if (i4 >= 0) {
            TextView textView2 = list2.get(i4);
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(musicSubscriptionDetailsContainer);
            bVar.h(view.getId(), 3);
            bVar.h(view.getId(), 4);
            bVar.k(view.getId(), 3, textView2.getId(), 3);
            bVar.k(view.getId(), 4, textView2.getId(), 4);
            bVar.b(musicSubscriptionDetailsContainer);
            view.setVisibility(0);
        } else {
            f4m.j(view);
        }
        musicSubscriptionDetailsContainer.setTitle(viewGroup.getContext().getString(i));
        if (i3 != 0) {
            musicSubscriptionDetailsContainer.setButtonTitle(viewGroup.getContext().getString(i3));
        }
        if (i2 != 0) {
            musicSubscriptionDetailsContainer.setSubtitle(viewGroup.getContext().getString(i2));
        }
        musicSubscriptionDetailsContainer.setIsUpsell(z2);
        musicSubscriptionDetailsContainer.setBackground(gu9.a(viewGroup.getContext()));
        BuyMusicSubscriptionButton buyMusicSubscriptionButton = musicSubscriptionDetailsContainer.z;
        View view2 = musicSubscriptionDetailsContainer.y;
        if (!z) {
            view2.setOnClickListener(new v3o(f950Var, 5));
            bwt0.p0(buyMusicSubscriptionButton, false);
            bwt0.p0(view2, true);
            return viewGroup2;
        }
        buyMusicSubscriptionButton.setOnBuySubscriptionClickedListener(new iou(f950Var, 21));
        view2.setOnClickListener(new hn2(f950Var, 8));
        bwt0.p0(buyMusicSubscriptionButton, true);
        bwt0.p0(view2, false);
        return viewGroup2;
    }

    public static void l(xwz xwzVar, SearchParamsWithCity searchParamsWithCity) {
        String str;
        City city = searchParamsWithCity.b;
        if (city == null || (str = city.c) == null) {
            return;
        }
        exz exzVar = new exz(str);
        xwzVar.getClass();
        xwzVar.b(xwz.c(exzVar), false);
    }

    public abstract njz0 d(njz0 njz0Var, u6z0 u6z0Var, xla xlaVar);

    public abstract float e(float f, float f2, float f3, float f4);

    public abstract Object f();

    public abstract ViewGroup i(LinearLayout linearLayout, int i, f950 f950Var, Set set);

    @Nullable
    public fi20 j(qi20 qi20Var) {
        ByteBuffer byteBuffer = qi20Var.e;
        byteBuffer.getClass();
        fxc0.p(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return k(qi20Var, byteBuffer);
    }

    @Nullable
    public abstract fi20 k(qi20 qi20Var, ByteBuffer byteBuffer);

    public abstract int m();

    public void n(@NonNull w2w w2wVar) {
        o(w2wVar);
    }

    public abstract Object o(@NonNull w2w w2wVar);

    public abstract b920 p(String str, izs izsVar);
}
