package com.yandex.go.shortcuts.dto.request;

import defpackage.auu0;
import defpackage.b7l0;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/SavedPlace;", "", "Companion", "Location", "$serializer", "com/yandex/go/shortcuts/dto/request/q", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SavedPlace {
    public static final q Companion = new q();
    public final String a;
    public final Location b;

    public /* synthetic */ SavedPlace(int i, String str, Location location) {
        List list = null;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = new Location(list, 3);
        } else {
            this.b = location;
        }
    }

    public static final /* synthetic */ void a(SavedPlace savedPlace, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || savedPlace.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, savedPlace.a);
        }
        if (!yjdVar.F()) {
            if (jl40.l(savedPlace.b, new Location((List) null, 3))) {
                return;
            }
        }
        yjdVar.e(serialDescriptor, 1, SavedPlace$Location$$serializer.INSTANCE, savedPlace.b);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/SavedPlace$Location;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/r", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Location {
        public static final r Companion = new r();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(29)), null};
        public final List a;
        public final Integer b;

        public /* synthetic */ Location(int i, List list, Integer num) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
        }

        public static final /* synthetic */ void b(Location location, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(location.a, EmptyList.a)) {
                yjdVar.e(serialDescriptor, 0, (KSerializer) c[0].getValue(), location.a);
            }
            if (!yjdVar.F() && location.b == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 1, h6w.a, location.b);
        }

        public Location() {
            this((List) null, 3);
        }

        public Location(List list, Integer num) {
            this.a = list;
            this.b = num;
        }

        public /* synthetic */ Location(List list, int i) {
            this((i & 1) != 0 ? EmptyList.a : list, (Integer) null);
        }
    }

    public SavedPlace(String str, Location location) {
        this.a = str;
        this.b = location;
    }

    public SavedPlace() {
        this(null, new Location((List) null, 3));
    }
}
