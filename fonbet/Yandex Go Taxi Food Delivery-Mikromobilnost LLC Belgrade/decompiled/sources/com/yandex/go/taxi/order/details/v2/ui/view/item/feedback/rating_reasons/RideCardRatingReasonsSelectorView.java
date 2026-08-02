package com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_reasons;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.sql.BaseDatabaseHelper;
import com.yandex.go.taxi.order.feedback.tag.TagRatingReasonsView;
import com.yandex.go.taxi.order.feedback.ui.AchievementsView;
import defpackage.k4o;
import defpackage.kyh0;
import defpackage.mrg0;
import defpackage.msq;
import defpackage.mzh0;
import defpackage.pgk0;
import defpackage.pmk0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.tje;
import defpackage.w511;
import defpackage.wls;
import defpackage.wm;
import defpackage.xng0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.order.feedback.b;
import ru.yandex.taxi.order.view.AllRatingReasonsView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002*\u0004B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\n2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/rating_reasons/RideCardRatingReasonsSelectorView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lpmk0;", "dependencies", "<init>", "(Landroid/content/Context;Lpmk0;)V", "Lru/yandex/taxi/order/feedback/b;", "newRatingReasons", "Lzy11;", "setRatingReasonsSelector", "(Lru/yandex/taxi/order/feedback/b;)V", "", "title", "renderTitle", "(Ljava/lang/String;)V", "Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/rating_reasons/RideCardRatingReasonsSelectorView$Type;", "type", "setSelectorType", "(Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/rating_reasons/RideCardRatingReasonsSelectorView$Type;)V", "", "Lr8i0;", "ratingReasons", "setRatingReasons", "(Ljava/util/List;)V", "Lkotlin/Function2;", "", "listener", "setOnReasonClickListener", "(Lwls;)V", "cleanRatingReasonsView", "()V", "Lpmk0;", "Lru/yandex/taxi/design/ListTitleComponent;", "titleView", "Lru/yandex/taxi/design/ListTitleComponent;", "ratingReasonsSelector", "Lru/yandex/taxi/order/feedback/b;", "Ls8i0;", "reasonsOnClickListener", "Ls8i0;", "Type", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardRatingReasonsSelectorView extends GoLinearLayout {
    public static final int $stable = 8;
    private final pmk0 dependencies;
    private b ratingReasonsSelector;
    private s8i0 reasonsOnClickListener;
    private final ListTitleComponent titleView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/feedback/rating_reasons/RideCardRatingReasonsSelectorView$Type;", "", BaseDatabaseHelper.TYPE_TEXT, "TAGS", "ACHIEVEMENTS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ACHIEVEMENTS;
        public static final Type TAGS;
        public static final Type TEXT;

        static {
            Type type = new Type(BaseDatabaseHelper.TYPE_TEXT, 0);
            TEXT = type;
            Type type2 = new Type("TAGS", 1);
            TAGS = type2;
            Type type3 = new Type("ACHIEVEMENTS", 2);
            ACHIEVEMENTS = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public RideCardRatingReasonsSelectorView(Context context, pmk0 pmk0Var) {
        super(context, null, 0, 0, 14, null);
        this.dependencies = pmk0Var;
        ListTitleComponent listTitleComponent = new ListTitleComponent(context, null, 0, 6, null);
        listTitleComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        listTitleComponent.setPadding(tje.u(16, listTitleComponent.getContext()), tje.u(4, listTitleComponent.getContext()), tje.u(16, listTitleComponent.getContext()), tje.u(0, listTitleComponent.getContext()));
        listTitleComponent.setMinHeight(tje.u(56, listTitleComponent.getContext()));
        listTitleComponent.setLeadFrameMinimumWidth(0);
        listTitleComponent.setTitle(listTitleComponent.getContext().getString(kyh0.rate_comment_title));
        listTitleComponent.setTitleTextSizePx((int) tje.b0(listTitleComponent.getContext(), 20.0f));
        listTitleComponent.setTitleTypeface(3);
        listTitleComponent.setTitleLineSpacing(tje.r(mrg0.component_list_item_line_spacing, listTitleComponent.getContext()), 1.0f);
        listTitleComponent.setTitleColorAttr(xng0.textMain);
        listTitleComponent.setTitleFontFeatureSettings(listTitleComponent.getContext().getString(mzh0.go_default_font_settings));
        this.titleView = listTitleComponent;
        setOrientation(1);
        addView(listTitleComponent);
    }

    private final void setRatingReasonsSelector(b newRatingReasons) {
        this.ratingReasonsSelector = newRatingReasons;
        addView(newRatingReasons.getView());
        s8i0 s8i0Var = this.reasonsOnClickListener;
        if (s8i0Var != null) {
            newRatingReasons.setOnReasonClickListener(s8i0Var);
        }
    }

    public final void cleanRatingReasonsView() {
        b bVar = this.ratingReasonsSelector;
        if (bVar != null) {
            removeView(bVar.getView());
        }
        this.ratingReasonsSelector = null;
        this.reasonsOnClickListener = null;
    }

    public final void renderTitle(String title) {
        ListTitleComponent listTitleComponent = this.titleView;
        listTitleComponent.setTitle(title);
        listTitleComponent.setVisibility(title != null ? 0 : 8);
    }

    public final void setOnReasonClickListener(wls listener) {
        pgk0 pgk0Var = new pgk0(1, listener);
        this.reasonsOnClickListener = pgk0Var;
        b bVar = this.ratingReasonsSelector;
        if (bVar != null) {
            bVar.setOnReasonClickListener(pgk0Var);
        }
    }

    public final void setRatingReasons(List<r8i0> ratingReasons) {
        b bVar = this.ratingReasonsSelector;
        if (bVar != null) {
            bVar.setData(ratingReasons);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSelectorType(Type type) {
        b allRatingReasonsView;
        if (this.ratingReasonsSelector != null) {
            return;
        }
        int i = a.a[type.ordinal()];
        int i2 = 2;
        if (i == 1) {
            allRatingReasonsView = new AllRatingReasonsView(getContext(), null, i2, 0 == true ? 1 : 0);
        } else if (i == 2) {
            Context context = getContext();
            pmk0 pmk0Var = this.dependencies;
            allRatingReasonsView = new TagRatingReasonsView(context, new msq(pmk0Var.b, pmk0Var.c, pmk0Var.d));
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            allRatingReasonsView = new AchievementsView(getContext(), new wm(this.dependencies.a));
        }
        setRatingReasonsSelector(allRatingReasonsView);
    }
}
