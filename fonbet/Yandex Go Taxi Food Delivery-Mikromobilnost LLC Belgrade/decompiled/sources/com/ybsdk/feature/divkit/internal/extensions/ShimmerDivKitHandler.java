package com.ybsdk.feature.divkit.internal.extensions;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.view2.Div2View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.shimmer.ShimmerArgs$CompositeMode;
import com.ybsdk.widgets.common.shimmer.ShimmerDrawable;
import defpackage.bpk;
import defpackage.d7g0;
import defpackage.dhr;
import defpackage.dpk;
import defpackage.egk;
import defpackage.f1k;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.lvy0;
import defpackage.ntr0;
import defpackage.oyr;
import defpackage.qxk;
import defpackage.rvo;
import defpackage.ukr0;
import defpackage.wm11;
import defpackage.x4c;
import defpackage.xah0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.BuildConfig;

/* loaded from: classes3.dex */
public final class ShimmerDivKitHandler implements dpk {
    public final ShimmerDivKitHandler_ShimmerConfigJsonAdapter a = new ShimmerDivKitHandler_ShimmerConfigJsonAdapter(new Moshi.Builder().build());

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jt\u0010-\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00063"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$ShimmerConfig;", "", "duration", "", "width", "Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$Width;", "color", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "highlightAlpha", "", "repeatDelay", "autostart", "", "playStateFlagName", "compositeMode", "Lcom/ybsdk/widgets/common/shimmer/ShimmerArgs$CompositeMode;", "<init>", "(Ljava/lang/Integer;Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$Width;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/widgets/common/shimmer/ShimmerArgs$CompositeMode;)V", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "()Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$Width;", "getColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getHighlightAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getRepeatDelay", "getAutostart", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPlayStateFlagName", "()Ljava/lang/String;", "getCompositeMode", "()Lcom/ybsdk/widgets/common/shimmer/ShimmerArgs$CompositeMode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$Width;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/widgets/common/shimmer/ShimmerArgs$CompositeMode;)Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$ShimmerConfig;", "equals", "other", "hashCode", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShimmerConfig {
        private final Boolean autostart;
        private final Themes<String> color;
        private final ShimmerArgs$CompositeMode compositeMode;
        private final Integer duration;
        private final Float highlightAlpha;
        private final String playStateFlagName;
        private final Integer repeatDelay;
        private final Width width;

        public ShimmerConfig(@Json(name = "duration") Integer num, @Json(name = "width") Width width, @Json(name = "color") Themes<String> themes, @Json(name = "highlight_alpha") Float f, @Json(name = "repeat_delay") Integer num2, @Json(name = "autostart") Boolean bool, @Json(name = "play_state_flag_name") String str, @Json(name = "composite_mode") ShimmerArgs$CompositeMode shimmerArgs$CompositeMode) {
            this.duration = num;
            this.width = width;
            this.color = themes;
            this.highlightAlpha = f;
            this.repeatDelay = num2;
            this.autostart = bool;
            this.playStateFlagName = str;
            this.compositeMode = shimmerArgs$CompositeMode;
        }

        public static /* synthetic */ ShimmerConfig copy$default(ShimmerConfig shimmerConfig, Integer num, Width width, Themes themes, Float f, Integer num2, Boolean bool, String str, ShimmerArgs$CompositeMode shimmerArgs$CompositeMode, int i, Object obj) {
            if ((i & 1) != 0) {
                num = shimmerConfig.duration;
            }
            if ((i & 2) != 0) {
                width = shimmerConfig.width;
            }
            if ((i & 4) != 0) {
                themes = shimmerConfig.color;
            }
            if ((i & 8) != 0) {
                f = shimmerConfig.highlightAlpha;
            }
            if ((i & 16) != 0) {
                num2 = shimmerConfig.repeatDelay;
            }
            if ((i & 32) != 0) {
                bool = shimmerConfig.autostart;
            }
            if ((i & 64) != 0) {
                str = shimmerConfig.playStateFlagName;
            }
            if ((i & 128) != 0) {
                shimmerArgs$CompositeMode = shimmerConfig.compositeMode;
            }
            String str2 = str;
            ShimmerArgs$CompositeMode shimmerArgs$CompositeMode2 = shimmerArgs$CompositeMode;
            Integer num3 = num2;
            Boolean bool2 = bool;
            return shimmerConfig.copy(num, width, themes, f, num3, bool2, str2, shimmerArgs$CompositeMode2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getDuration() {
            return this.duration;
        }

        /* renamed from: component2, reason: from getter */
        public final Width getWidth() {
            return this.width;
        }

        public final Themes<String> component3() {
            return this.color;
        }

        /* renamed from: component4, reason: from getter */
        public final Float getHighlightAlpha() {
            return this.highlightAlpha;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getRepeatDelay() {
            return this.repeatDelay;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getAutostart() {
            return this.autostart;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPlayStateFlagName() {
            return this.playStateFlagName;
        }

        /* renamed from: component8, reason: from getter */
        public final ShimmerArgs$CompositeMode getCompositeMode() {
            return this.compositeMode;
        }

        public final ShimmerConfig copy(@Json(name = "duration") Integer duration, @Json(name = "width") Width width, @Json(name = "color") Themes<String> color, @Json(name = "highlight_alpha") Float highlightAlpha, @Json(name = "repeat_delay") Integer repeatDelay, @Json(name = "autostart") Boolean autostart, @Json(name = "play_state_flag_name") String playStateFlagName, @Json(name = "composite_mode") ShimmerArgs$CompositeMode compositeMode) {
            return new ShimmerConfig(duration, width, color, highlightAlpha, repeatDelay, autostart, playStateFlagName, compositeMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShimmerConfig)) {
                return false;
            }
            ShimmerConfig shimmerConfig = (ShimmerConfig) other;
            return jl40.l(this.duration, shimmerConfig.duration) && jl40.l(this.width, shimmerConfig.width) && jl40.l(this.color, shimmerConfig.color) && jl40.l(this.highlightAlpha, shimmerConfig.highlightAlpha) && jl40.l(this.repeatDelay, shimmerConfig.repeatDelay) && jl40.l(this.autostart, shimmerConfig.autostart) && jl40.l(this.playStateFlagName, shimmerConfig.playStateFlagName) && this.compositeMode == shimmerConfig.compositeMode;
        }

        public final Boolean getAutostart() {
            return this.autostart;
        }

        public final Themes<String> getColor() {
            return this.color;
        }

        public final ShimmerArgs$CompositeMode getCompositeMode() {
            return this.compositeMode;
        }

        public final Integer getDuration() {
            return this.duration;
        }

        public final Float getHighlightAlpha() {
            return this.highlightAlpha;
        }

        public final String getPlayStateFlagName() {
            return this.playStateFlagName;
        }

        public final Integer getRepeatDelay() {
            return this.repeatDelay;
        }

        public final Width getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.duration;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Width width = this.width;
            int hashCode2 = (hashCode + (width == null ? 0 : width.hashCode())) * 31;
            Themes<String> themes = this.color;
            int hashCode3 = (hashCode2 + (themes == null ? 0 : themes.hashCode())) * 31;
            Float f = this.highlightAlpha;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            Integer num2 = this.repeatDelay;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.autostart;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.playStateFlagName;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            ShimmerArgs$CompositeMode shimmerArgs$CompositeMode = this.compositeMode;
            return hashCode7 + (shimmerArgs$CompositeMode != null ? shimmerArgs$CompositeMode.hashCode() : 0);
        }

        public String toString() {
            return "ShimmerConfig(duration=" + this.duration + ", width=" + this.width + ", color=" + this.color + ", highlightAlpha=" + this.highlightAlpha + ", repeatDelay=" + this.repeatDelay + ", autostart=" + this.autostart + ", playStateFlagName=" + this.playStateFlagName + ", compositeMode=" + this.compositeMode + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$Width;", "", "type", "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/ybsdk/feature/divkit/internal/extensions/ShimmerDivKitHandler$Width;", "equals", "", "other", "hashCode", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Width {
        private final String type;
        private final Integer value;

        public Width(@Json(name = "type") String str, @Json(name = "value") Integer num) {
            this.type = str;
            this.value = num;
        }

        public static /* synthetic */ Width copy$default(Width width, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = width.type;
            }
            if ((i & 2) != 0) {
                num = width.value;
            }
            return width.copy(str, num);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        public final Width copy(@Json(name = "type") String type, @Json(name = "value") Integer value) {
            return new Width(type, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Width)) {
                return false;
            }
            Width width = (Width) other;
            return jl40.l(this.type, width.type) && jl40.l(this.value, width.value);
        }

        public final String getType() {
            return this.type;
        }

        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.value;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Width(type=" + this.type + ", value=" + this.value + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // defpackage.dpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        ShimmerConfig shimmerConfig;
        ntr0 ntr0Var;
        ntr0 ntr0Var2;
        ntr0 ntr0Var3;
        ntr0 ntr0Var4;
        ntr0 ntr0Var5;
        ntr0 ntr0Var6;
        String playStateFlagName;
        ShimmerArgs$CompositeMode compositeMode;
        Boolean autostart;
        Float highlightAlpha;
        Themes<String> color;
        ColorModel.Raw raw;
        Integer repeatDelay;
        int intValue;
        Integer duration;
        int intValue2;
        Integer value;
        Width width;
        Object obj;
        JSONObject jSONObject;
        List extensions = egkVar.getExtensions();
        int i = 8;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, ShimmerDivHandler.EXTENSION_ID)) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null && (jSONObject = bpkVar.b) != null) {
                try {
                    shimmerConfig = this.a.fromJson(jSONObject.toString());
                } catch (Exception e) {
                    x4c.g("Failed to parse DivKit params", e, "in ShimmerDivKitHandler", null, 8);
                }
                ntr0Var = new ntr0(view.getContext(), 0.0f, 0, 0L, 0L, false, false, null, null, 4094);
                if (jl40.l((shimmerConfig != null || (width = shimmerConfig.getWidth()) == null) ? null : width.getType(), "fixed") && (value = shimmerConfig.getWidth().getValue()) != null && value.intValue() >= 0) {
                    ntr0Var = ntr0.a(ntr0Var, 0.0f, kp50.r(shimmerConfig.getWidth().getValue().intValue()), 0L, 0L, false, null, null, 4087);
                }
                ntr0Var2 = ntr0Var;
                if (shimmerConfig != null && (duration = shimmerConfig.getDuration()) != null && (intValue2 = duration.intValue()) >= 0) {
                    ntr0Var2 = ntr0.a(ntr0Var2, 0.0f, 0, intValue2, 0L, false, null, null, 4079);
                }
                ntr0Var3 = ntr0Var2;
                if (shimmerConfig != null && (repeatDelay = shimmerConfig.getRepeatDelay()) != null && (intValue = repeatDelay.intValue()) >= 0) {
                    ntr0Var3 = ntr0.a(ntr0Var3, 0.0f, 0, 0L, intValue, false, null, null, 4063);
                }
                ntr0 ntr0Var7 = ntr0Var3;
                if (shimmerConfig != null && (color = shimmerConfig.getColor()) != null) {
                    ColorModel e2 = lvy0.e(color.getLight(), color.getDark());
                    raw = e2 == null ? new ColorModel.Raw(e2.get(view.getContext())) : null;
                    if (raw != null) {
                        ntr0Var7 = ntr0.a(ntr0Var7, 0.0f, 0, 0L, 0L, false, null, raw, BuildConfig.VERSION_CODE);
                    }
                }
                ntr0Var4 = ntr0Var7;
                if (shimmerConfig != null && (highlightAlpha = shimmerConfig.getHighlightAlpha()) != null) {
                    ntr0Var4 = ntr0.a(ntr0Var4, highlightAlpha.floatValue(), 0, 0L, 0L, false, null, null, 4093);
                }
                ntr0Var5 = ntr0Var4;
                if (shimmerConfig != null && (autostart = shimmerConfig.getAutostart()) != null) {
                    ntr0Var5 = ntr0.a(ntr0Var5, 0.0f, 0, 0L, 0L, autostart.booleanValue(), null, null, 3967);
                }
                ntr0Var6 = ntr0Var5;
                if (shimmerConfig != null && (compositeMode = shimmerConfig.getCompositeMode()) != null) {
                    ntr0Var6 = ntr0.a(ntr0Var6, 0.0f, 0, 0L, 0L, false, compositeMode, null, 3839);
                }
                ShimmerDrawable shimmerDrawable = new ShimmerDrawable(view.getContext());
                shimmerDrawable.setShimmer(ntr0Var6);
                view.setForeground(shimmerDrawable);
                if (shimmerConfig != null || (playStateFlagName = shimmerConfig.getPlayStateFlagName()) == null) {
                }
                view.setTag(xah0.ybsdk_shimmer_variable_subscription, new com.yandex.div.json.expressions.a("shimmer_play_action_listener", oyr.p("@{", playStateFlagName, " == true}"), new ukr0(i), new d7g0(27), new qxk(2), wm11.a, null).c(rvoVar, new dhr(new WeakReference(shimmerDrawable), 1)));
                return;
            }
        }
        shimmerConfig = null;
        ntr0Var = new ntr0(view.getContext(), 0.0f, 0, 0L, 0L, false, false, null, null, 4094);
        if (jl40.l((shimmerConfig != null || (width = shimmerConfig.getWidth()) == null) ? null : width.getType(), "fixed")) {
            ntr0Var = ntr0.a(ntr0Var, 0.0f, kp50.r(shimmerConfig.getWidth().getValue().intValue()), 0L, 0L, false, null, null, 4087);
        }
        ntr0Var2 = ntr0Var;
        if (shimmerConfig != null) {
            ntr0Var2 = ntr0.a(ntr0Var2, 0.0f, 0, intValue2, 0L, false, null, null, 4079);
        }
        ntr0Var3 = ntr0Var2;
        if (shimmerConfig != null) {
            ntr0Var3 = ntr0.a(ntr0Var3, 0.0f, 0, 0L, intValue, false, null, null, 4063);
        }
        ntr0 ntr0Var72 = ntr0Var3;
        if (shimmerConfig != null) {
            ColorModel e22 = lvy0.e(color.getLight(), color.getDark());
            if (e22 == null) {
            }
            if (raw != null) {
            }
        }
        ntr0Var4 = ntr0Var72;
        if (shimmerConfig != null) {
            ntr0Var4 = ntr0.a(ntr0Var4, highlightAlpha.floatValue(), 0, 0L, 0L, false, null, null, 4093);
        }
        ntr0Var5 = ntr0Var4;
        if (shimmerConfig != null) {
            ntr0Var5 = ntr0.a(ntr0Var5, 0.0f, 0, 0L, 0L, autostart.booleanValue(), null, null, 3967);
        }
        ntr0Var6 = ntr0Var5;
        if (shimmerConfig != null) {
            ntr0Var6 = ntr0.a(ntr0Var6, 0.0f, 0, 0L, 0L, false, compositeMode, null, 3839);
        }
        ShimmerDrawable shimmerDrawable2 = new ShimmerDrawable(view.getContext());
        shimmerDrawable2.setShimmer(ntr0Var6);
        view.setForeground(shimmerDrawable2);
        if (shimmerConfig != null) {
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        Object obj = null;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((bpk) next).a, ShimmerDivHandler.EXTENSION_ID)) {
                    obj = next;
                    break;
                }
            }
            obj = (bpk) obj;
        }
        return obj != null;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object tag = view.getTag(xah0.ybsdk_shimmer_variable_subscription);
        f1k f1kVar = tag instanceof f1k ? (f1k) tag : null;
        if (f1kVar != null) {
            f1kVar.close();
        }
        Drawable foreground = view.getForeground();
        ShimmerDrawable shimmerDrawable = foreground instanceof ShimmerDrawable ? (ShimmerDrawable) foreground : null;
        if (shimmerDrawable != null) {
            shimmerDrawable.stopShimmer();
        }
        view.setForeground(null);
    }
}
