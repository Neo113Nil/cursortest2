package com.yandex.go.places.searchbar.impl.experiments;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.l1b0;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/places/searchbar/impl/experiments/PlacesSearchbarExperiment;", "Lw96;", "Lc6z;", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "com/yandex/go/places/searchbar/impl/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlacesSearchbarExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] h = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(27)), null, null, null, null};
    public static final PlacesSearchbarExperiment i = new PlacesSearchbarExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final Button e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ PlacesSearchbarExperiment(int i2, boolean z, Map map, String str, Button button, boolean z2, boolean z3) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = new Button(0);
        } else {
            this.e = button;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getD() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/searchbar/impl/experiments/PlacesSearchbarExperiment$Button;", "", "Companion", "$serializer", "com/yandex/go/places/searchbar/impl/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Button {
        public static final a Companion = new a();
        public final String a;
        public final String b;

        public /* synthetic */ Button(int i, String str, String str2) {
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
        }

        public Button(int i) {
            this.a = "";
            this.b = "";
        }

        public Button() {
            this(0);
        }
    }

    public PlacesSearchbarExperiment() {
        this(0);
    }

    public PlacesSearchbarExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        Button button = new Button(0);
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = button;
        this.f = false;
        this.g = false;
    }
}
