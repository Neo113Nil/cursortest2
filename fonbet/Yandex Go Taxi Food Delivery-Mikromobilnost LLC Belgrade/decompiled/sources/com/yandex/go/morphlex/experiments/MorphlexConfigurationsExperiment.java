package com.yandex.go.morphlex.experiments;

import com.yandex.go.morphlex.data.dto.MorphlexDimension;
import com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.um20;
import defpackage.vn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/morphlex/experiments/MorphlexConfigurationsExperiment;", "Lvn11;", "Companion", "MorphlexScreenConfig", "com/yandex/go/morphlex/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MorphlexConfigurationsExperiment implements vn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(17))};
    public static final MorphlexConfigurationsExperiment d = new MorphlexConfigurationsExperiment(0);
    public final Map b;

    public /* synthetic */ MorphlexConfigurationsExperiment(int i, Map map) {
        if ((i & 1) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
    }

    public MorphlexConfigurationsExperiment() {
        this(0);
    }

    public MorphlexConfigurationsExperiment(int i) {
        this.b = kotlin.collections.b.f();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/experiments/MorphlexConfigurationsExperiment$MorphlexScreenConfig;", "", "Companion", "$serializer", "com/yandex/go/morphlex/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class MorphlexScreenConfig {
        public static final b Companion = new b();
        public static final i3y[] j;
        public final String a;
        public final String b;
        public final List c;
        public final String d;
        public final MorphlexScreenPresentType e;
        public final boolean f;
        public final boolean g;
        public final MorphlexDimension h;
        public final boolean i;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            j = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new um20(18)), null, kotlin.a.b(lazyThreadSafetyMode, new um20(19)), null, null, null, null};
        }

        public /* synthetic */ MorphlexScreenConfig(int i, String str, String str2, List list, String str3, MorphlexScreenPresentType morphlexScreenPresentType, boolean z, boolean z2, MorphlexDimension morphlexDimension, boolean z3) {
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
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = MorphlexScreenPresentType.UNSUPPORTED;
            } else {
                this.e = morphlexScreenPresentType;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z2;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = morphlexDimension;
            }
            if ((i & 256) == 0) {
                this.i = false;
            } else {
                this.i = z3;
            }
        }

        public MorphlexScreenConfig() {
            MorphlexScreenPresentType morphlexScreenPresentType = MorphlexScreenPresentType.UNSUPPORTED;
            this.a = "";
            this.b = "";
            this.c = EmptyList.a;
            this.d = null;
            this.e = morphlexScreenPresentType;
            this.f = false;
            this.g = false;
            this.h = null;
            this.i = false;
        }
    }
}
