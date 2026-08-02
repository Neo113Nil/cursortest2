package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.ej11;
import defpackage.fj11;
import defpackage.jl40;
import defpackage.tcc;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2Config;", "", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;", "gradientOffsetPosition", "", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2Component;", "components", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2AnimationSettings;", "animationSettings", "<init>", "(Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;Ljava/util/List;Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2AnimationSettings;)V", "Lfj11;", "toEntity", "()Lfj11;", "component1", "()Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;", "component2", "()Ljava/util/List;", "component3", "()Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2AnimationSettings;", "copy", "(Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;Ljava/util/List;Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2AnimationSettings;)Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2OffsetPosition;", "getGradientOffsetPosition", "Ljava/util/List;", "getComponents", "Lcom/ybsdk/rconfig/configs/TsarButtonGradientV2AnimationSettings;", "getAnimationSettings", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TsarButtonGradientV2Config {

    @Json(name = "animation_settings")
    private final TsarButtonGradientV2AnimationSettings animationSettings;

    @Json(name = "components")
    private final List<TsarButtonGradientV2Component> components;

    @Json(name = "offset")
    private final TsarButtonGradientV2OffsetPosition gradientOffsetPosition;

    public TsarButtonGradientV2Config(TsarButtonGradientV2OffsetPosition tsarButtonGradientV2OffsetPosition, List<TsarButtonGradientV2Component> list, TsarButtonGradientV2AnimationSettings tsarButtonGradientV2AnimationSettings) {
        this.gradientOffsetPosition = tsarButtonGradientV2OffsetPosition;
        this.components = list;
        this.animationSettings = tsarButtonGradientV2AnimationSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TsarButtonGradientV2Config copy$default(TsarButtonGradientV2Config tsarButtonGradientV2Config, TsarButtonGradientV2OffsetPosition tsarButtonGradientV2OffsetPosition, List list, TsarButtonGradientV2AnimationSettings tsarButtonGradientV2AnimationSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            tsarButtonGradientV2OffsetPosition = tsarButtonGradientV2Config.gradientOffsetPosition;
        }
        if ((i & 2) != 0) {
            list = tsarButtonGradientV2Config.components;
        }
        if ((i & 4) != 0) {
            tsarButtonGradientV2AnimationSettings = tsarButtonGradientV2Config.animationSettings;
        }
        return tsarButtonGradientV2Config.copy(tsarButtonGradientV2OffsetPosition, list, tsarButtonGradientV2AnimationSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final TsarButtonGradientV2OffsetPosition getGradientOffsetPosition() {
        return this.gradientOffsetPosition;
    }

    public final List<TsarButtonGradientV2Component> component2() {
        return this.components;
    }

    /* renamed from: component3, reason: from getter */
    public final TsarButtonGradientV2AnimationSettings getAnimationSettings() {
        return this.animationSettings;
    }

    public final TsarButtonGradientV2Config copy(TsarButtonGradientV2OffsetPosition gradientOffsetPosition, List<TsarButtonGradientV2Component> components, TsarButtonGradientV2AnimationSettings animationSettings) {
        return new TsarButtonGradientV2Config(gradientOffsetPosition, components, animationSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TsarButtonGradientV2Config)) {
            return false;
        }
        TsarButtonGradientV2Config tsarButtonGradientV2Config = (TsarButtonGradientV2Config) other;
        return jl40.l(this.gradientOffsetPosition, tsarButtonGradientV2Config.gradientOffsetPosition) && jl40.l(this.components, tsarButtonGradientV2Config.components) && jl40.l(this.animationSettings, tsarButtonGradientV2Config.animationSettings);
    }

    public final TsarButtonGradientV2AnimationSettings getAnimationSettings() {
        return this.animationSettings;
    }

    public final List<TsarButtonGradientV2Component> getComponents() {
        return this.components;
    }

    public final TsarButtonGradientV2OffsetPosition getGradientOffsetPosition() {
        return this.gradientOffsetPosition;
    }

    public int hashCode() {
        int c = unr0.c(this.gradientOffsetPosition.hashCode() * 31, 31, this.components);
        TsarButtonGradientV2AnimationSettings tsarButtonGradientV2AnimationSettings = this.animationSettings;
        return c + (tsarButtonGradientV2AnimationSettings == null ? 0 : tsarButtonGradientV2AnimationSettings.hashCode());
    }

    public final fj11 toEntity() {
        ej11 entity = this.gradientOffsetPosition.toEntity();
        List<TsarButtonGradientV2Component> list = this.components;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TsarButtonGradientV2Component) it.next()).toEntity());
        }
        TsarButtonGradientV2AnimationSettings tsarButtonGradientV2AnimationSettings = this.animationSettings;
        return new fj11(entity, arrayList, tsarButtonGradientV2AnimationSettings != null ? tsarButtonGradientV2AnimationSettings.toEntity() : null);
    }

    public String toString() {
        return "TsarButtonGradientV2Config(gradientOffsetPosition=" + this.gradientOffsetPosition + ", components=" + this.components + ", animationSettings=" + this.animationSettings + Extension.C_BRAKE;
    }
}
