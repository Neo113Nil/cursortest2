package com.yandex.go.settings.hidephoneinfo.experiments;

import defpackage.b64;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.syu;
import defpackage.unr0;
import defpackage.xn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/settings/hidephoneinfo/experiments/InAppOnlySettingsToggleExperiment;", "Lxn11;", "Lc6z;", "Companion", "ModalConfig", "com/yandex/go/settings/hidephoneinfo/experiments/a", "$serializer", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InAppOnlySettingsToggleExperiment implements xn11, c6z {
    public static final a Companion = new a();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(22)), null, null};
    public static final InAppOnlySettingsToggleExperiment g = new InAppOnlySettingsToggleExperiment(0);
    public final boolean b;
    public final Map c;
    public final ModalConfig d;
    public final String e;

    public /* synthetic */ InAppOnlySettingsToggleExperiment(int i, boolean z, Map map, ModalConfig modalConfig, String str) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new ModalConfig(0);
        } else {
            this.d = modalConfig;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/settings/hidephoneinfo/experiments/InAppOnlySettingsToggleExperiment$ModalConfig;", "", "Companion", "$serializer", "com/yandex/go/settings/hidephoneinfo/experiments/b", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class ModalConfig {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ ModalConfig(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModalConfig)) {
                return false;
            }
            ModalConfig modalConfig = (ModalConfig) obj;
            return jl40.l(this.a, modalConfig.a) && jl40.l(this.b, modalConfig.b) && jl40.l(this.c, modalConfig.c) && jl40.l(this.d, modalConfig.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return g8e.r(b64.v("ModalConfig(iconTag=", this.a, ", titleKey=", this.b, ", textKey="), this.c, ", doneButtonKey=", this.d, Extension.C_BRAKE);
        }

        public ModalConfig(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public ModalConfig() {
            this(0);
        }
    }

    public InAppOnlySettingsToggleExperiment() {
        this(0);
    }

    public InAppOnlySettingsToggleExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        ModalConfig modalConfig = new ModalConfig(0);
        this.b = false;
        this.c = f2;
        this.d = modalConfig;
        this.e = "";
    }
}
