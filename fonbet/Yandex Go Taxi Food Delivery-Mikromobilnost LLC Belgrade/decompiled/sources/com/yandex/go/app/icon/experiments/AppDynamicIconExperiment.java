package com.yandex.go.app.icon.experiments;

import defpackage.gsq0;
import defpackage.i22;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/app/icon/experiments/AppDynamicIconExperiment;", "Lw96;", "Companion", "DynamicAppIcon", "com/yandex/go/app/icon/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppDynamicIconExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i22(14))};
    public static final AppDynamicIconExperiment e = new AppDynamicIconExperiment(0);
    public final boolean b;
    public final DynamicAppIcon c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/app/icon/experiments/AppDynamicIconExperiment$DynamicAppIcon;", "", "Companion", "com/yandex/go/app/icon/experiments/b", "DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DynamicAppIcon {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DynamicAppIcon[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final DynamicAppIcon DEFAULT;

        static {
            DynamicAppIcon dynamicAppIcon = new DynamicAppIcon("DEFAULT", 0);
            DEFAULT = dynamicAppIcon;
            DynamicAppIcon[] dynamicAppIconArr = {dynamicAppIcon};
            $VALUES = dynamicAppIconArr;
            $ENTRIES = kotlin.enums.a.a(dynamicAppIconArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i22(15));
        }

        public static DynamicAppIcon valueOf(String str) {
            return (DynamicAppIcon) Enum.valueOf(DynamicAppIcon.class, str);
        }

        public static DynamicAppIcon[] values() {
            return (DynamicAppIcon[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AppDynamicIconExperiment(int i, boolean z, DynamicAppIcon dynamicAppIcon) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = dynamicAppIcon;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public AppDynamicIconExperiment(int i) {
        this.b = false;
        this.c = null;
    }

    public AppDynamicIconExperiment() {
        this(0);
    }
}
