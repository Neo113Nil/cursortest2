package com.yandex.go.flex.main_screen.presentation.controllers.skaffold;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.mjm0;
import defpackage.pyy0;
import defpackage.qje;
import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/controllers/skaffold/TrackedScrollScaffold;", "Lmjm0;", "Companion", "$serializer", "com/yandex/go/flex/main_screen/presentation/controllers/skaffold/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrackedScrollScaffold extends mjm0 {
    public static final a Companion = new a();
    public static final i3y[] g;
    public final DivkitSnippet a;
    public final DivKitScaffoldPadding b;
    public final DivkitSnippet c;
    public final DivKitScaffoldPadding d;
    public final DivkitSnippet e;
    public final ThemedColor f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new pyy0(24)), null, kotlin.a.b(lazyThreadSafetyMode, new pyy0(25)), null, kotlin.a.b(lazyThreadSafetyMode, new pyy0(26)), kotlin.a.b(lazyThreadSafetyMode, new pyy0(27))};
    }

    public /* synthetic */ TrackedScrollScaffold(int i, DivkitSnippet divkitSnippet, DivKitScaffoldPadding divKitScaffoldPadding, DivkitSnippet divkitSnippet2, DivKitScaffoldPadding divKitScaffoldPadding2, DivkitSnippet divkitSnippet3, ThemedColor themedColor) {
        if (10 != (i & 10)) {
            qje.Z(i, 10, TrackedScrollScaffold$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = divkitSnippet;
        }
        this.b = divKitScaffoldPadding;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = divkitSnippet2;
        }
        this.d = divKitScaffoldPadding2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = divkitSnippet3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = themedColor;
        }
    }
}
