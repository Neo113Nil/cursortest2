package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.aj11;
import defpackage.ccv;
import defpackage.dcv;
import defpackage.fob1;
import defpackage.jl40;
import defpackage.nbv;
import defpackage.of11;
import defpackage.pbv;
import defpackage.rbv;
import defpackage.rev;
import defpackage.txg0;
import defpackage.vfv;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/rconfig/configs/TsarButtonConfigV2;", "", "", "isEnabled", "Lcom/ybsdk/rconfig/configs/TsarButtonContentV2Config;", "content", "<init>", "(ZLcom/ybsdk/rconfig/configs/TsarButtonContentV2Config;)V", "Laj11;", "toEntity", "()Laj11;", "component1", "()Z", "component2", "()Lcom/ybsdk/rconfig/configs/TsarButtonContentV2Config;", "copy", "(ZLcom/ybsdk/rconfig/configs/TsarButtonContentV2Config;)Lcom/ybsdk/rconfig/configs/TsarButtonConfigV2;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lcom/ybsdk/rconfig/configs/TsarButtonContentV2Config;", "getContent", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TsarButtonConfigV2 {

    @Json(name = "content")
    private final TsarButtonContentV2Config content;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    public TsarButtonConfigV2(boolean z, TsarButtonContentV2Config tsarButtonContentV2Config) {
        this.isEnabled = z;
        this.content = tsarButtonContentV2Config;
    }

    public static /* synthetic */ TsarButtonConfigV2 copy$default(TsarButtonConfigV2 tsarButtonConfigV2, boolean z, TsarButtonContentV2Config tsarButtonContentV2Config, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tsarButtonConfigV2.isEnabled;
        }
        if ((i & 2) != 0) {
            tsarButtonContentV2Config = tsarButtonConfigV2.content;
        }
        return tsarButtonConfigV2.copy(z, tsarButtonContentV2Config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbv toEntity$lambda$1$lambda$0(String str) {
        return new pbv(str, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final TsarButtonContentV2Config getContent() {
        return this.content;
    }

    public final TsarButtonConfigV2 copy(boolean isEnabled, TsarButtonContentV2Config content) {
        return new TsarButtonConfigV2(isEnabled, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TsarButtonConfigV2)) {
            return false;
        }
        TsarButtonConfigV2 tsarButtonConfigV2 = (TsarButtonConfigV2) other;
        return this.isEnabled == tsarButtonConfigV2.isEnabled && jl40.l(this.content, tsarButtonConfigV2.content);
    }

    public final TsarButtonContentV2Config getContent() {
        return this.content;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        TsarButtonContentV2Config tsarButtonContentV2Config = this.content;
        return hashCode + (tsarButtonContentV2Config == null ? 0 : tsarButtonContentV2Config.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final aj11 toEntity() {
        aj11 aj11Var;
        TsarButtonContentV2Config tsarButtonContentV2Config = this.content;
        if (tsarButtonContentV2Config != null) {
            Text text = tsarButtonContentV2Config.getText();
            String action = tsarButtonContentV2Config.getAction();
            rbv c = fob1.c(this.content.getIcon().getLight(), this.content.getIcon().getDark(), new of11(6));
            if (c == null) {
                c = new nbv(txg0.ybsdk_ic_payments);
            }
            TsarButtonGradientV2Config gradientConfiguration = tsarButtonContentV2Config.getGradientConfiguration();
            aj11Var = new aj11(text, action, c, gradientConfiguration != null ? gradientConfiguration.toEntity() : null, tsarButtonContentV2Config.getColor());
        } else {
            aj11Var = null;
        }
        if (this.isEnabled) {
            return aj11Var;
        }
        return null;
    }

    public String toString() {
        return "TsarButtonConfigV2(isEnabled=" + this.isEnabled + ", content=" + this.content + Extension.C_BRAKE;
    }
}
