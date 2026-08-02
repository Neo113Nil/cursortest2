package com.yandex.go.navigator.main_screen.experiement;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ic50;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/navigator/main_screen/experiement/NavigatorMainScreenExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/navigator/main_screen/experiement/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorMainScreenExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] j;
    public static final NavigatorMainScreenExperiment k;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public final ListButtonsDto g;
    public final Map h;
    public final String i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ic50(4)), null, kotlin.a.b(lazyThreadSafetyMode, new ic50(5)), null};
        k = new NavigatorMainScreenExperiment(0);
    }

    public /* synthetic */ NavigatorMainScreenExperiment(int i, boolean z, String str, String str2, boolean z2, List list, ListButtonsDto listButtonsDto, Map map, String str3) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 16) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 32) == 0) {
            this.g = new ListButtonsDto(0);
        } else {
            this.g = listButtonsDto;
        }
        if ((i & 64) == 0) {
            this.h = kotlin.collections.b.f();
        } else {
            this.h = map;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.h;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public NavigatorMainScreenExperiment() {
        this(0);
    }

    public NavigatorMainScreenExperiment(int i) {
        ListButtonsDto listButtonsDto = new ListButtonsDto(0);
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = "";
        this.d = "";
        this.e = false;
        this.f = EmptyList.a;
        this.g = listButtonsDto;
        this.h = f;
        this.i = "";
    }
}
