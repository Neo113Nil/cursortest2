package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.text.SimpleDateFormat;
import java.util.Locale;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class b8z extends lys {
    public static final SimpleDateFormat U;
    public static final SimpleDateFormat V;
    public final ListGroupHeaderComponent S;
    public final ViewGroup T;

    static {
        Locale locale = Locale.US;
        U = new SimpleDateFormat("HH:mm:ss", locale);
        V = new SimpleDateFormat("HH:mm:ss:SSS  dd:MMM", locale);
    }

    public b8z(View view) {
        super(view);
        this.S = (ListGroupHeaderComponent) view.findViewById(tih0.group_header);
        this.T = (ViewGroup) view.findViewById(tih0.container);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        String k;
        a8z a8zVar = (a8z) obj;
        int i = a8zVar.a;
        long j = a8zVar.b;
        this.S.setTitle(ShimmerDivHandler.NUMBER_SING + i + ". Requested at " + U.format(Long.valueOf(j)));
        for (yne yneVar : a8zVar.c) {
            View view = this.a;
            ListItemComponent listItemComponent = new ListItemComponent(view.getContext(), null, 0, 6, null);
            Boolean bool = tp11.a;
            tp11.b(3, listItemComponent.title());
            long time = j - yneVar.e.getTime();
            String upperCase = yneVar.c.toString().toUpperCase(Locale.ROOT);
            String i2 = oyr.i(yneVar.b, "accuracy: ");
            gju gjuVar = new gju(0, i2.length(), view.getContext().getColor(mqg0.component_blue_normal));
            listItemComponent.setTitle(upperCase);
            listItemComponent.setTitleTextColor(view.getContext().getColor(mqg0.component_white));
            listItemComponent.setSubtitle(i2 + "\n" + V.format(yneVar.e));
            listItemComponent.highLightSubTitle(scc.i(gjuVar));
            long j2 = (time / 1000) / 60;
            if (j2 == 0) {
                k = "< 1 min";
            } else if (0 > j2 || j2 >= 60) {
                k = qv10.k(j2 / 60, "~ ", " h");
            } else {
                k = j2 + " min";
            }
            listItemComponent.setTrailCompanionText("updated " + k + " ago");
            listItemComponent.setTrailTextSize(tje.r(mrg0.component_text_size_caption, view.getContext()));
            this.T.addView(listItemComponent);
        }
    }
}
