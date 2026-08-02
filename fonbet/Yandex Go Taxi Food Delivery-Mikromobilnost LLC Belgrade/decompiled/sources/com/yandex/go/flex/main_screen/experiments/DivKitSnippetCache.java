package com.yandex.go.flex.main_screen.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/DivKitSnippetCache;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivKitSnippetCache {
    public static final a Companion = new a();
    public final boolean a;
    public final int b;
    public final int c;

    public /* synthetic */ DivKitSnippetCache(int i, int i2, int i3, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        this.b = (i & 2) == 0 ? 15 : i2;
        if ((i & 4) == 0) {
            this.c = 25;
        } else {
            this.c = i3;
        }
    }

    public DivKitSnippetCache(int i) {
        this.a = false;
        this.b = 15;
        this.c = 25;
    }

    public DivKitSnippetCache() {
        this(0);
    }
}
