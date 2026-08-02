package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import defpackage.cyv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties;", "", "Companion", "SuggestMapItemBbox", "SuggestMapLocation", "SuggestMapPin", "$serializer", "com/yandex/go/suggest/impl/view/divkit/custom_view/map_item/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSuggestMapItemViewProperties {
    public static final b Companion = new b();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(14)), null, null};
    public final SuggestMapItemBbox a;
    public final List b;
    public final float c;
    public final String d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapItemBbox;", "", "Companion", "$serializer", "com/yandex/go/suggest/impl/view/divkit/custom_view/map_item/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SuggestMapItemBbox {
        public static final c Companion = new c();
        public final SuggestMapLocation a;
        public final SuggestMapLocation b;

        public /* synthetic */ SuggestMapItemBbox(int i, SuggestMapLocation suggestMapLocation, SuggestMapLocation suggestMapLocation2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, SuperappSuggestMapItemViewProperties$SuggestMapItemBbox$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = suggestMapLocation;
            this.b = suggestMapLocation2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapLocation;", "", "Companion", "$serializer", "com/yandex/go/suggest/impl/view/divkit/custom_view/map_item/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SuggestMapLocation {
        public static final d Companion = new d();
        public final double a;
        public final double b;

        public /* synthetic */ SuggestMapLocation(double d, double d2, int i) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, SuperappSuggestMapItemViewProperties$SuggestMapLocation$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = d;
            this.b = d2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapPin;", "", "Companion", "$serializer", "com/yandex/go/suggest/impl/view/divkit/custom_view/map_item/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SuggestMapPin {
        public static final e Companion = new e();
        public final String a;
        public final String b;
        public final SuggestMapLocation c;

        public /* synthetic */ SuggestMapPin(int i, String str, String str2, SuggestMapLocation suggestMapLocation) {
            if (5 != (i & 5)) {
                qje.Z(i, 5, SuperappSuggestMapItemViewProperties$SuggestMapPin$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            this.c = suggestMapLocation;
        }
    }

    public /* synthetic */ SuperappSuggestMapItemViewProperties(int i, SuggestMapItemBbox suggestMapItemBbox, List list, float f, String str) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, SuperappSuggestMapItemViewProperties$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = suggestMapItemBbox;
        this.b = list;
        this.c = f;
        this.d = str;
    }
}
