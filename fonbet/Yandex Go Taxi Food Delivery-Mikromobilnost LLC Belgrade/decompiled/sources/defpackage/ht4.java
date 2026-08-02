package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.Spanned;
import android.view.ViewGroup;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.util.Locale;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes5.dex */
public abstract class ht4 {
    public static void a(BannerWidgets.f fVar, ViewGroup viewGroup, Runnable runnable) {
        ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
        listItemComponent.setTitle(fVar.b);
        Context context = viewGroup.getContext();
        String str = fVar.d;
        int color = context.getColor(mqg0.component_black);
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    color = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                color = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        listItemComponent.setTitleTextColor(color);
        listItemComponent.setTrailMode(2);
        listItemComponent.setDividers(DividerPosition.TOP, DividerType.NORMAL);
        listItemComponent.setDebounceClickListener(runnable);
        viewGroup.addView(listItemComponent);
    }

    public static void b(ListTextComponent listTextComponent, CharSequence charSequence, String str) {
        if (charSequence == null || evu0.J(charSequence)) {
            listTextComponent.setVisibility(8);
            return;
        }
        listTextComponent.setVisibility(0);
        int color = listTextComponent.getContext().getColor(mqg0.component_black);
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    color = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                color = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        if (!(charSequence instanceof Spanned)) {
            charSequence = qeb1.c(charSequence.toString());
        }
        listTextComponent.setHtmlText(charSequence);
        listTextComponent.setTextColor(color);
        listTextComponent.setLinkTextColor(color);
    }
}
