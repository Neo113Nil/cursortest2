package com.yandex.go.places.experiments.map.map_as_main_places;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/map_as_main_places/MapAsMainPlacesExperiment;", "Lw96;", "Companion", "com/yandex/go/places/experiments/map/map_as_main_places/a", "$serializer", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapAsMainPlacesExperiment extends w96 {
    public static final a Companion = new a();
    public static final MapAsMainPlacesExperiment d = new MapAsMainPlacesExperiment(0);
    public final boolean b;
    public final String c;

    public /* synthetic */ MapAsMainPlacesExperiment(int i, String str, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public MapAsMainPlacesExperiment(int i) {
        this.b = false;
        this.c = "";
    }

    public MapAsMainPlacesExperiment() {
        this(0);
    }
}
