package com.yandex.go.flex.common.scaffolds.appbarscaffold;

import defpackage.gsq0;
import defpackage.i22;
import defpackage.i3y;
import defpackage.mjm0;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/scaffolds/appbarscaffold/AppBarScaffold;", "Lmjm0;", "Companion", "ContentPadding", "$serializer", "com/yandex/go/flex/common/scaffolds/appbarscaffold/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarScaffold extends mjm0 {
    public static final a Companion = new a();
    public static final i3y[] i;
    public final DivkitSnippet a;
    public final ThemedColor b;
    public final Float c;
    public final DivkitSnippet d;
    public final DivkitSnippet e;
    public final DivkitSnippet f;
    public final ContentPadding g;
    public final ThemedColor h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new i22(8)), kotlin.a.b(lazyThreadSafetyMode, new i22(9)), null, kotlin.a.b(lazyThreadSafetyMode, new i22(10)), kotlin.a.b(lazyThreadSafetyMode, new i22(11)), kotlin.a.b(lazyThreadSafetyMode, new i22(12)), null, kotlin.a.b(lazyThreadSafetyMode, new i22(13))};
    }

    public /* synthetic */ AppBarScaffold(int i2, DivkitSnippet divkitSnippet, ThemedColor themedColor, Float f, DivkitSnippet divkitSnippet2, DivkitSnippet divkitSnippet3, DivkitSnippet divkitSnippet4, ContentPadding contentPadding, ThemedColor themedColor2) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = divkitSnippet;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = themedColor;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = divkitSnippet2;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = divkitSnippet3;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = divkitSnippet4;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = contentPadding;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = themedColor2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/scaffolds/appbarscaffold/AppBarScaffold$ContentPadding;", "", "Companion", "$serializer", "com/yandex/go/flex/common/scaffolds/appbarscaffold/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ContentPadding {
        public static final b Companion = new b();
        public final float a;
        public final boolean b;

        public /* synthetic */ ContentPadding(int i, float f, boolean z) {
            this.a = (i & 1) == 0 ? 0.0f : f;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentPadding)) {
                return false;
            }
            ContentPadding contentPadding = (ContentPadding) obj;
            return Float.compare(this.a, contentPadding.a) == 0 && this.b == contentPadding.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ContentPadding(value=" + this.a + ", respectNavigationInset=" + this.b + Extension.C_BRAKE;
        }

        public ContentPadding() {
            this.a = 0.0f;
            this.b = false;
        }
    }

    public AppBarScaffold() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
