package com.yandex.go.navigator.user_placemark;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.z121;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/navigator/user_placemark/UserArrowToggleExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/navigator/user_placemark/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UserArrowToggleExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z121(25))};
    public static final UserArrowToggleExperiment h = new UserArrowToggleExperiment(0);
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final Map f;

    public /* synthetic */ UserArrowToggleExperiment(int i, String str, String str2, String str3, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 16) == 0) {
            this.f = kotlin.collections.b.f();
        } else {
            this.f = map;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.f;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public UserArrowToggleExperiment() {
        this(0);
    }

    public UserArrowToggleExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = f;
    }
}
