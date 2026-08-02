package com.ybsdk.widgets.common.segmented;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.j1;
import defpackage.jr31;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.p9q0;
import defpackage.poh0;
import defpackage.q9q0;
import defpackage.scc;
import defpackage.tls;
import defpackage.tyo0;
import defpackage.ung0;
import defpackage.wtn;
import defpackage.zy11;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.b;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0004\u000e\n\u001c\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/widgets/common/segmented/SegmentedControlView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/segmented/a;", "Lcom/ybsdk/widgets/common/YbButtonView$a;", "toButtonState", "(Lcom/ybsdk/widgets/common/segmented/a;)Lcom/ybsdk/widgets/common/YbButtonView$a;", "Lq9q0;", ClidProvider.STATE, "Lzy11;", "render", "(Lq9q0;)V", CA20Status.STATUS_USER_I, "Lkotlin/Function1;", "onItemSelectedListener", "Ltls;", "getOnItemSelectedListener", "()Ltls;", "setOnItemSelectedListener", "(Ltls;)V", "Companion", "ItemDesign", "p9q0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SegmentedControlView extends LinearLayoutCompat {
    public static final p9q0 Companion = new p9q0();
    private static final int horizontalMarginPx = kp50.r(4);
    private final int defStyleAttr;
    private tls onItemSelectedListener;

    public SegmentedControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defStyleAttr = i;
        this.onItemSelectedListener = new tyo0(20);
        setOrientation(0);
        setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onItemSelectedListener$lambda$0(int i) {
        return zy11.a;
    }

    private static final YbButtonView render$lambda$2(SegmentedControlView segmentedControlView) {
        View inflate = LayoutInflater.from(segmentedControlView.getContext()).inflate(poh0.ybsdk_item_segmented_control, (ViewGroup) segmentedControlView, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = horizontalMarginPx;
        marginLayoutParams.setMargins(i, marginLayoutParams.topMargin, i, marginLayoutParams.bottomMargin);
        inflate.setLayoutParams(marginLayoutParams);
        return (YbButtonView) inflate;
    }

    private static final zy11 render$lambda$4(SegmentedControlView segmentedControlView, q9q0 q9q0Var, int i, YbButtonView ybButtonView) {
        ybButtonView.render(segmentedControlView.toButtonState((a) q9q0Var.a.get(i)));
        ybButtonView.setOnClickListener(new wtn(segmentedControlView, i, 6));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$4$lambda$3(SegmentedControlView segmentedControlView, int i, View view) {
        segmentedControlView.onItemSelectedListener.invoke(Integer.valueOf(i));
    }

    private final YbButtonView.a toButtonState(a aVar) {
        Text text = aVar.a;
        nbv nbvVar = aVar.b;
        ItemDesign itemDesign = aVar.c;
        return new YbButtonView.a(text, null, nbvVar, itemDesign.getBackground(), itemDesign.getTextColor(), null, itemDesign.getTextColor(), false, false, null, 3938);
    }

    public final tls getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    public final void render(q9q0 state) {
        int size = state.a.size();
        int i = 0;
        List t = b.t(b.o(new jr31(this, i), new j1(26, this)));
        ArrayList arrayList = (ArrayList) t;
        int size2 = size - arrayList.size();
        if (size2 > 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                YbButtonView render$lambda$2 = render$lambda$2(this);
                arrayList.add(render$lambda$2);
                addView(render$lambda$2);
            }
        } else if (size2 < 0) {
            int i3 = -size2;
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.remove(scc.f(t));
            }
            removeViews(getChildCount() - i3, i3);
        }
        for (Object obj : t) {
            int i5 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            render$lambda$4(this, state, i, (YbButtonView) obj);
            i = i5;
        }
    }

    public final void setOnItemSelectedListener(tls tlsVar) {
        this.onItemSelectedListener = tlsVar;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0012\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/widgets/common/segmented/SegmentedControlView$ItemDesign;", "", C0553n3.g, "Lcom/ybsdk/core/utils/ColorModel;", "textColor", "<init>", "(Ljava/lang/String;ILcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;)V", "", "(Ljava/lang/String;III)V", "getBackground", "()Lcom/ybsdk/core/utils/ColorModel;", "getTextColor", "COMMON", "COMMON_SELECTED", "INVERTED", "INVERTED_SELECTED", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemDesign {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ItemDesign[] $VALUES;
        public static final ItemDesign COMMON = new ItemDesign("COMMON", 0, ung0.ybColor_button_secondaryNormal, ung0.ybColor_textIcon_primary);
        public static final ItemDesign COMMON_SELECTED = new ItemDesign("COMMON_SELECTED", 1, ung0.ybColor_button_primaryNormal, ung0.ybColor_textIcon_primaryInverted);
        public static final ItemDesign INVERTED = new ItemDesign("INVERTED", 2, ung0.ybColor_textIcon_secondaryStatic, ung0.ybColor_textIcon_primaryStaticInverted);
        public static final ItemDesign INVERTED_SELECTED = new ItemDesign("INVERTED_SELECTED", 3, ung0.ybColor_button_invertedStaticNormal, ung0.ybColor_textIcon_primaryStatic);
        private final ColorModel background;
        private final ColorModel textColor;

        private static final /* synthetic */ ItemDesign[] $values() {
            return new ItemDesign[]{COMMON, COMMON_SELECTED, INVERTED, INVERTED_SELECTED};
        }

        static {
            ItemDesign[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ItemDesign(String str, int i, int i2, int i3) {
            this(str, i, new ColorModel.Attr(i2), new ColorModel.Attr(i3));
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ItemDesign valueOf(String str) {
            return (ItemDesign) Enum.valueOf(ItemDesign.class, str);
        }

        public static ItemDesign[] values() {
            return (ItemDesign[]) $VALUES.clone();
        }

        public final ColorModel getBackground() {
            return this.background;
        }

        public final ColorModel getTextColor() {
            return this.textColor;
        }

        private ItemDesign(String str, int i, ColorModel colorModel, ColorModel colorModel2) {
            this.background = colorModel;
            this.textColor = colorModel2;
        }
    }

    public SegmentedControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SegmentedControlView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SegmentedControlView(Context context) {
        this(context, null, 0, 6, null);
    }
}
