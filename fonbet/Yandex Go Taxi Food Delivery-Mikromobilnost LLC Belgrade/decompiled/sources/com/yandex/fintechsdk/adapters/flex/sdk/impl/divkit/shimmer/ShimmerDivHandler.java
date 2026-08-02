package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.preview.ColorModel;
import com.yandex.fintechsdk.entities.theme.Theme;
import defpackage.acx;
import defpackage.bpk;
import defpackage.dpk;
import defpackage.egk;
import defpackage.evu0;
import defpackage.itu0;
import defpackage.jl40;
import defpackage.qpe0;
import defpackage.rvo;
import defpackage.sbx;
import defpackage.tje;
import defpackage.ukr0;
import defpackage.vh5;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDivHandler;", "Ldpk;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableProvider;", "shimmerDrawableProvider", "Lvh5;", "themeProvider", "<init>", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableProvider;Lvh5;)V", "", "lightThemeColor", "darkThemeColor", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;", "parseColorByTheme", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;", "colorString", "parseColorString", "(Ljava/lang/String;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/preview/ColorModel;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lrvo;", "expressionResolver", "Landroid/view/View;", "view", "Legk;", "div", "Lzy11;", "bindView", "(Lcom/yandex/div/core/view2/Div2View;Lrvo;Landroid/view/View;Legk;)V", "", "matches", "(Legk;)Z", "unbindView", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDrawableProvider;", "Lvh5;", "Litu0;", "json", "Litu0;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShimmerDivHandler implements dpk {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EXTENSION_ID = "shimmer";

    @Deprecated
    public static final String NUMBER_SING = "#";
    private final itu0 json = tje.a(sbx.d, new ukr0(7));
    private final ShimmerDrawableProvider shimmerDrawableProvider;
    private final vh5 themeProvider;

    public ShimmerDivHandler(ShimmerDrawableProvider shimmerDrawableProvider, vh5 vh5Var) {
        this.shimmerDrawableProvider = shimmerDrawableProvider;
        this.themeProvider = vh5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 json$lambda$0(acx acxVar) {
        acxVar.c = true;
        return zy11.a;
    }

    private final ColorModel parseColorByTheme(String lightThemeColor, String darkThemeColor) {
        if (this.themeProvider.getTheme() != Theme.DAY) {
            lightThemeColor = darkThemeColor;
        }
        return parseColorString(lightThemeColor);
    }

    private final ColorModel parseColorString(String colorString) {
        Object failure;
        if (colorString == null) {
            return null;
        }
        try {
            failure = Integer.valueOf(Color.parseColor(NUMBER_SING.concat(evu0.Q(NUMBER_SING, colorString))));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        if (num != null) {
            return new ColorModel(num.intValue());
        }
        return null;
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void beforeBindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    @Override // defpackage.dpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bindView(Div2View divView, rvo expressionResolver, View view, egk div) {
        ShimmerConfig shimmerConfig;
        Long l;
        Themes color;
        Integer duration;
        Object obj;
        JSONObject jSONObject;
        Object failure;
        List extensions = div.getExtensions();
        ColorModel colorModel = null;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, EXTENSION_ID)) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null && (jSONObject = bpkVar.b) != null) {
                try {
                    itu0 itu0Var = this.json;
                    String jSONObject2 = jSONObject.toString();
                    itu0Var.getClass();
                    failure = (ShimmerConfig) ((sbx) itu0Var).b(ShimmerConfig.INSTANCE.serializer(), jSONObject2);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                shimmerConfig = (ShimmerConfig) failure;
                if (shimmerConfig != null && (duration = shimmerConfig.getDuration()) != null) {
                    if (duration.intValue() < 0) {
                        duration = null;
                    }
                    if (duration != null) {
                        l = Long.valueOf(duration.intValue());
                        if (shimmerConfig != null && (color = shimmerConfig.getColor()) != null) {
                            colorModel = parseColorByTheme(color.getLight(), color.getDark());
                        }
                        ShimmerDrawable shimmerDrawable = this.shimmerDrawableProvider.get(view.getContext());
                        shimmerDrawable.setShimmer$impl_18_1_0_release(colorModel, l);
                        shimmerDrawable.startShimmer$impl_18_1_0_release();
                        view.setForeground(shimmerDrawable);
                    }
                }
                l = null;
                if (shimmerConfig != null) {
                    colorModel = parseColorByTheme(color.getLight(), color.getDark());
                }
                ShimmerDrawable shimmerDrawable2 = this.shimmerDrawableProvider.get(view.getContext());
                shimmerDrawable2.setShimmer$impl_18_1_0_release(colorModel, l);
                shimmerDrawable2.startShimmer$impl_18_1_0_release();
                view.setForeground(shimmerDrawable2);
            }
        }
        shimmerConfig = null;
        if (shimmerConfig != null) {
            if (duration.intValue() < 0) {
            }
            if (duration != null) {
            }
        }
        l = null;
        if (shimmerConfig != null) {
        }
        ShimmerDrawable shimmerDrawable22 = this.shimmerDrawableProvider.get(view.getContext());
        shimmerDrawable22.setShimmer$impl_18_1_0_release(colorModel, l);
        shimmerDrawable22.startShimmer$impl_18_1_0_release();
        view.setForeground(shimmerDrawable22);
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void loadMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public boolean matches(egk div) {
        List extensions = div.getExtensions();
        if (extensions == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, EXTENSION_ID)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void preprocess(egk egkVar, rvo rvoVar, qpe0 qpe0Var) {
        super.preprocess(egkVar, rvoVar, qpe0Var);
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void releaseMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public void unbindView(Div2View divView, rvo expressionResolver, View view, egk div) {
        Drawable foreground = view.getForeground();
        ShimmerDrawable shimmerDrawable = foreground instanceof ShimmerDrawable ? (ShimmerDrawable) foreground : null;
        if (shimmerDrawable != null) {
            shimmerDrawable.stopShimmer$impl_18_1_0_release();
        }
        view.setForeground(null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/shimmer/ShimmerDivHandler$Companion;", "", "<init>", "()V", "EXTENSION_ID", "", "NUMBER_SING", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void preprocess(egk egkVar, rvo rvoVar) {
    }
}
