package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cg91;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.fch0;
import defpackage.jl40;
import defpackage.js41;
import defpackage.k4o;
import defpackage.l061;
import defpackage.lwg0;
import defpackage.m810;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.qk31;
import defpackage.qq31;
import defpackage.rje;
import defpackage.rtu;
import defpackage.sls;
import defpackage.sm91;
import defpackage.sp51;
import defpackage.t3i0;
import defpackage.tls;
import defpackage.ung0;
import defpackage.vvg0;
import defpackage.w511;
import defpackage.xty0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003456B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u0013\u0010\u0015\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0013\u0010\u0016\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010\"\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0 ¢\u0006\u0004\b&\u0010#J\u0017\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010(J\u000f\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u0004\u0018\u00010)¢\u0006\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/ybsdk/widgets/common/YbButtonViewGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/YbButtonViewGroup$Orientation;", "orientation", "Lzy11;", "setOrientation", "(Lcom/ybsdk/widgets/common/YbButtonViewGroup$Orientation;)V", "Landroidx/constraintlayout/widget/e;", "connectPrimaryButtonHorizontal", "(Landroidx/constraintlayout/widget/e;)V", "connectSecondaryButtonHorizontal", "connectPrimaryButtonVertical", "connectSecondaryButtonVertical", "connectPrimaryButtonVerticalReverse", "connectSecondaryButtonVerticalReverse", "Landroid/view/View;", "targetView", "calculateMargin", "(Landroid/view/View;)I", "Lkotlin/Function0;", "listener", "setPrimaryButtonOnClickListener", "(Lsls;)V", "setSecondaryButtonClickListener", "Lkotlin/Function1;", "", "setLinkClickListener", "(Ltls;)V", "Lcom/ybsdk/widgets/common/YbButtonViewGroup$b;", "update", "render", ClidProvider.STATE, "(Lcom/ybsdk/widgets/common/YbButtonViewGroup$b;)V", "Lcom/ybsdk/core/utils/text/Text;", "getPrimaryButtonText", "()Lcom/ybsdk/core/utils/text/Text;", "getSecondaryButtonText", "Ll061;", "binding", "Ll061;", "currentState", "Lcom/ybsdk/widgets/common/YbButtonViewGroup$b;", "linkClickListener", "Ltls;", "b", "a", "Orientation", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YbButtonViewGroup extends ConstraintLayout {
    private final l061 binding;
    private b currentState;
    private tls linkClickListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/widgets/common/YbButtonViewGroup$Orientation;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "VERTICAL_REVERSE", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Orientation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL", 0);
        public static final Orientation VERTICAL = new Orientation("VERTICAL", 1);
        public static final Orientation VERTICAL_REVERSE = new Orientation("VERTICAL_REVERSE", 2);

        private static final /* synthetic */ Orientation[] $values() {
            return new Orientation[]{HORIZONTAL, VERTICAL, VERTICAL_REVERSE};
        }

        static {
            Orientation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Orientation(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    public YbButtonViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_buttons_view_group, this);
        int i2 = fch0.linkMessage;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = fch0.primaryButton;
            YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
            if (ybButtonView != null) {
                i2 = fch0.secondaryButton;
                YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i2, this);
                if (ybButtonView2 != null) {
                    l061 l061Var = new l061(this, textView, ybButtonView, ybButtonView2);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    this.binding = l061Var;
                    this.currentState = new b(null, null, null, null, 15);
                    this.linkClickListener = new js41(26);
                    TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t3i0.YbSdkButtonViewGroup, 0, 0);
                    int b2 = m810.b(com.ybsdk.core.utils.ext.view.b.v(obtainStyledAttributes, t3i0.YbSdkButtonViewGroup_ybsdk_horizontal_margin, obtainStyledAttributes.getResources().getDimension(vvg0.ybsdk_screen_horizontal_space)));
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                    int d = rje.d(lwg0.ybsdk_buttons_group_view_vertical_margin, context);
                    setPadding(b2, d, b2, d);
                    setLayoutParams(layoutParams);
                    obtainStyledAttributes.recycle();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final int calculateMargin(View targetView) {
        if (targetView.getVisibility() == 0) {
            return getResources().getDimensionPixelSize(lwg0.ybsdk_buttons_group_view_margin);
        }
        return 0;
    }

    private final void connectPrimaryButtonHorizontal(androidx.constraintlayout.widget.e eVar) {
        l061 l061Var = this.binding;
        eVar.i(l061Var.c.getId(), 6, l061Var.d.getId(), 7);
        YbButtonView ybButtonView = l061Var.c;
        eVar.i(ybButtonView.getId(), 7, 0, 7);
        int id = ybButtonView.getId();
        TextView textView = l061Var.b;
        eVar.j(id, 4, textView.getId(), 3, calculateMargin(textView));
    }

    private final void connectPrimaryButtonVertical(androidx.constraintlayout.widget.e eVar) {
        l061 l061Var = this.binding;
        YbButtonView ybButtonView = l061Var.c;
        TextView textView = l061Var.b;
        int i = 0;
        eVar.i(ybButtonView.getId(), 6, 0, 6);
        YbButtonView ybButtonView2 = l061Var.c;
        eVar.i(ybButtonView2.getId(), 7, 0, 7);
        YbButtonView ybButtonView3 = l061Var.d;
        if (ybButtonView3.getVisibility() == 0) {
            i = calculateMargin(ybButtonView3);
        } else if (textView.getVisibility() == 0) {
            i = calculateMargin(textView);
        }
        eVar.j(ybButtonView2.getId(), 4, ybButtonView3.getId(), 3, i);
    }

    private final void connectPrimaryButtonVerticalReverse(androidx.constraintlayout.widget.e eVar) {
        l061 l061Var = this.binding;
        int id = l061Var.c.getId();
        YbButtonView ybButtonView = l061Var.d;
        eVar.i(id, 6, ybButtonView.getId(), 6);
        YbButtonView ybButtonView2 = l061Var.c;
        eVar.i(ybButtonView2.getId(), 7, ybButtonView.getId(), 7);
        int id2 = ybButtonView2.getId();
        TextView textView = l061Var.b;
        eVar.j(id2, 4, textView.getId(), 3, calculateMargin(textView));
    }

    private final void connectSecondaryButtonHorizontal(androidx.constraintlayout.widget.e eVar) {
        l061 l061Var = this.binding;
        YbButtonView ybButtonView = l061Var.c;
        TextView textView = l061Var.b;
        int visibility = ybButtonView.getVisibility();
        YbButtonView ybButtonView2 = l061Var.d;
        if (visibility != 0) {
            eVar.i(ybButtonView2.getId(), 6, 0, 6);
            eVar.i(ybButtonView2.getId(), 7, 0, 7);
            eVar.j(ybButtonView2.getId(), 4, textView.getId(), 3, calculateMargin(textView));
        } else {
            eVar.i(ybButtonView2.getId(), 3, ybButtonView.getId(), 3);
            eVar.i(ybButtonView2.getId(), 6, 0, 6);
            eVar.j(ybButtonView2.getId(), 7, ybButtonView.getId(), 6, calculateMargin(ybButtonView));
            eVar.j(ybButtonView2.getId(), 4, textView.getId(), 3, calculateMargin(textView));
        }
    }

    private final void connectSecondaryButtonVertical(androidx.constraintlayout.widget.e eVar) {
        l061 l061Var = this.binding;
        YbButtonView ybButtonView = l061Var.c;
        TextView textView = l061Var.b;
        YbButtonView ybButtonView2 = l061Var.d;
        int id = ybButtonView.getVisibility() == 0 ? l061Var.c.getId() : 0;
        eVar.i(ybButtonView2.getId(), 6, id, 6);
        eVar.j(ybButtonView2.getId(), 7, id, 7, 0);
        eVar.j(ybButtonView2.getId(), 4, textView.getId(), 3, calculateMargin(textView));
    }

    private final void connectSecondaryButtonVerticalReverse(androidx.constraintlayout.widget.e eVar) {
        l061 l061Var = this.binding;
        YbButtonView ybButtonView = l061Var.d;
        TextView textView = l061Var.b;
        int i = 0;
        eVar.i(ybButtonView.getId(), 6, 0, 6);
        YbButtonView ybButtonView2 = l061Var.d;
        eVar.i(ybButtonView2.getId(), 7, 0, 7);
        YbButtonView ybButtonView3 = l061Var.c;
        if (ybButtonView3.getVisibility() == 0) {
            i = calculateMargin(ybButtonView3);
        } else if (textView.getVisibility() == 0) {
            i = calculateMargin(textView);
        }
        eVar.j(ybButtonView2.getId(), 4, ybButtonView3.getId(), 3, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 linkClickListener$lambda$1(String str) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$13$lambda$12$lambda$11(YbButtonViewGroup ybButtonViewGroup, String str) {
        ybButtonViewGroup.linkClickListener.invoke(str);
        return zy11.a;
    }

    private final void setOrientation(Orientation orientation) {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.g(this);
        int i = q.a[orientation.ordinal()];
        if (i == 1) {
            connectPrimaryButtonHorizontal(eVar);
            connectSecondaryButtonHorizontal(eVar);
        } else if (i == 2) {
            connectPrimaryButtonVertical(eVar);
            connectSecondaryButtonVertical(eVar);
        } else if (i != 3) {
            w511.b();
            return;
        } else {
            connectSecondaryButtonVerticalReverse(eVar);
            connectPrimaryButtonVerticalReverse(eVar);
        }
        eVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPrimaryButtonOnClickListener$lambda$5$lambda$4(YbButtonViewGroup ybButtonViewGroup, YbButtonView ybButtonView, sls slsVar, View view) {
        qk31 qk31Var;
        YbButtonView.a aVar = ybButtonViewGroup.currentState.b;
        if (aVar != null && (qk31Var = aVar.j) != null) {
            cg91.c(ybButtonView, qk31Var);
        }
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSecondaryButtonClickListener$lambda$8$lambda$7(YbButtonViewGroup ybButtonViewGroup, YbButtonView ybButtonView, sls slsVar, View view) {
        qk31 qk31Var;
        YbButtonView.a aVar = ybButtonViewGroup.currentState.c;
        if (aVar != null && (qk31Var = aVar.j) != null) {
            cg91.c(ybButtonView, qk31Var);
        }
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public final Text getPrimaryButtonText() {
        YbButtonView.a aVar = this.currentState.b;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public final Text getSecondaryButtonText() {
        YbButtonView.a aVar = this.currentState.c;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public final void render(b state) {
        Text text;
        CharSequence a2;
        l061 l061Var = this.binding;
        int i = 8;
        setVisibility(state != null ? 0 : 8);
        if (state == null) {
            return;
        }
        YbButtonView.a aVar = state.c;
        YbButtonView.a aVar2 = state.b;
        a aVar3 = state.d;
        YbButtonView ybButtonView = l061Var.c;
        YbButtonView ybButtonView2 = l061Var.d;
        TextView textView = l061Var.b;
        ybButtonView.setVisibility(aVar2 != null ? 0 : 8);
        if (aVar2 != null) {
            l061Var.c.render(aVar2);
        }
        ybButtonView2.setVisibility(aVar != null ? 0 : 8);
        if (aVar != null) {
            ybButtonView2.render(aVar);
        }
        String obj = (aVar3 == null || (text = aVar3.a) == null || (a2 = com.ybsdk.core.utils.text.d.a(sm91.c(l061Var), text)) == null) ? null : a2.toString();
        if (obj != null && !evu0.J(obj)) {
            i = 0;
        }
        textView.setVisibility(i);
        if (obj != null) {
            ColorModel colorModel = aVar3.b;
            if (colorModel == null) {
                colorModel = new ColorModel.Attr(ung0.ybColor_textIcon_secondary);
            }
            xty0.e(textView, colorModel);
            ColorModel colorModel2 = aVar3.c;
            if (colorModel2 == null) {
                colorModel2 = new ColorModel.Attr(ung0.ybColor_textIcon_linkNormal);
            }
            textView.setLinkTextColor(colorModel2.get(textView.getContext()));
            textView.setText(rtu.a(new qq31(24, this), obj));
        }
        setOrientation(state.a);
        this.currentState = state;
    }

    public final void setLinkClickListener(tls listener) {
        this.linkClickListener = listener;
    }

    public final void setPrimaryButtonOnClickListener(sls listener) {
        YbButtonView ybButtonView = this.binding.c;
        ybButtonView.setOnClickListener(new sp51(this, ybButtonView, listener, 1));
    }

    public final void setSecondaryButtonClickListener(sls listener) {
        YbButtonView ybButtonView = this.binding.d;
        ybButtonView.setOnClickListener(new sp51(this, ybButtonView, listener, 0));
    }

    public static final class a {
        public final Text a;
        public final ColorModel b;
        public final ColorModel c;

        public /* synthetic */ a(Text text, int i) {
            this((i & 1) != 0 ? null : text, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            Text text = this.a;
            int hashCode = (text == null ? 0 : text.hashCode()) * 31;
            ColorModel colorModel = this.b;
            int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
            ColorModel colorModel2 = this.c;
            return hashCode2 + (colorModel2 != null ? colorModel2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkMessageState(text=");
            sb.append(this.a);
            sb.append(", textColor=");
            sb.append(this.b);
            sb.append(", linkColor=");
            return defpackage.n.o(sb, this.c, Extension.C_BRAKE);
        }

        public a() {
            this(null, 7);
        }

        public a(Text text, ColorModel colorModel, ColorModel colorModel2) {
            this.a = text;
            this.b = colorModel;
            this.c = colorModel2;
        }
    }

    public static final class b {
        public final Orientation a;
        public final YbButtonView.a b;
        public final YbButtonView.a c;
        public final a d;

        public /* synthetic */ b(Orientation orientation, YbButtonView.a aVar, YbButtonView.a aVar2, a aVar3, int i) {
            this((i & 1) != 0 ? Orientation.VERTICAL : orientation, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : aVar2, (i & 8) != 0 ? null : aVar3);
        }

        public static b a(b bVar, YbButtonView.a aVar, YbButtonView.a aVar2, int i) {
            Orientation orientation = bVar.a;
            if ((i & 2) != 0) {
                aVar = bVar.b;
            }
            if ((i & 4) != 0) {
                aVar2 = bVar.c;
            }
            a aVar3 = bVar.d;
            bVar.getClass();
            return new b(orientation, aVar, aVar2, aVar3);
        }

        public final Orientation b() {
            return this.a;
        }

        public final YbButtonView.a c() {
            return this.b;
        }

        public final YbButtonView.a d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c) && jl40.l(this.d, bVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            YbButtonView.a aVar = this.b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            YbButtonView.a aVar2 = this.c;
            int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            a aVar3 = this.d;
            return hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0);
        }

        public final String toString() {
            return "State(orientation=" + this.a + ", primaryButton=" + this.b + ", secondaryButton=" + this.c + ", linkMessage=" + this.d + Extension.C_BRAKE;
        }

        public b(Orientation orientation, YbButtonView.a aVar, YbButtonView.a aVar2, a aVar3) {
            this.a = orientation;
            this.b = aVar;
            this.c = aVar2;
            this.d = aVar3;
        }

        public b() {
            this(null, null, null, null, 15);
        }
    }

    public YbButtonViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void render(tls update) {
        render((b) update.invoke(this.currentState));
    }

    public /* synthetic */ YbButtonViewGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public YbButtonViewGroup(Context context) {
        this(context, null, 0, 6, null);
    }
}
