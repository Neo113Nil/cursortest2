package com.yandex.go.explorer.impl.experiments;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.c6z;
import defpackage.fsn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/explorer/impl/experiments/ExplorerExperiment;", "Lw96;", "Lc6z;", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "ZoomToResolution", "GeofenceParams", "DistrictExploreFinishedImage", "NoBackgroundLocationPermissionInfo", "com/yandex/go/explorer/impl/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExplorerExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] i;
    public static final ExplorerExperiment j;
    public final Map b;
    public final boolean c;
    public final Button d;
    public final List e;
    public final GeofenceParams f;
    public final DistrictExploreFinishedImage g;
    public final NoBackgroundLocationPermissionInfo h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new fsn(13)), null, null, kotlin.a.b(lazyThreadSafetyMode, new fsn(14)), null, null, null};
        j = new ExplorerExperiment(0);
    }

    public /* synthetic */ ExplorerExperiment(int i2, Map map, boolean z, Button button, List list, GeofenceParams geofenceParams, DistrictExploreFinishedImage districtExploreFinishedImage, NoBackgroundLocationPermissionInfo noBackgroundLocationPermissionInfo) {
        this.b = (i2 & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i2 & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i2 & 4) == 0) {
            this.d = new Button(0);
        } else {
            this.d = button;
        }
        if ((i2 & 8) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i2 & 16) == 0) {
            this.f = new GeofenceParams(0);
        } else {
            this.f = geofenceParams;
        }
        if ((i2 & 32) == 0) {
            this.g = new DistrictExploreFinishedImage(0);
        } else {
            this.g = districtExploreFinishedImage;
        }
        if ((i2 & 64) == 0) {
            this.h = new NoBackgroundLocationPermissionInfo(0);
        } else {
            this.h = noBackgroundLocationPermissionInfo;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/experiments/ExplorerExperiment$DistrictExploreFinishedImage;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DistrictExploreFinishedImage {
        public static final c Companion = new c();
        public final String a;

        public /* synthetic */ DistrictExploreFinishedImage(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public DistrictExploreFinishedImage(int i) {
            this.a = "";
        }

        public DistrictExploreFinishedImage() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/experiments/ExplorerExperiment$ZoomToResolution;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/experiments/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ZoomToResolution {
        public static final f Companion = new f();
        public final int a;
        public final int b;

        public /* synthetic */ ZoomToResolution(int i, int i2, int i3) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
        }

        public ZoomToResolution() {
            this.a = 0;
            this.b = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/experiments/ExplorerExperiment$Button;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Button {
        public static final a Companion = new a();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ Button(int i, String str, String str2, String str3, String str4) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public Button(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public Button() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/experiments/ExplorerExperiment$NoBackgroundLocationPermissionInfo;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/experiments/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NoBackgroundLocationPermissionInfo {
        public static final e Companion = new e();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ NoBackgroundLocationPermissionInfo(int i, String str, String str2, String str3, String str4) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public NoBackgroundLocationPermissionInfo(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public NoBackgroundLocationPermissionInfo() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/experiments/ExplorerExperiment$GeofenceParams;", "", "Companion", "com/yandex/go/explorer/impl/experiments/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class GeofenceParams {
        public static final d Companion = new d();
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public /* synthetic */ GeofenceParams(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = (i & 1) == 0 ? 100 : i2;
            if ((i & 2) == 0) {
                this.b = 50;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = 30000;
            } else {
                this.c = i4;
            }
            if ((i & 8) == 0) {
                this.d = 12;
            } else {
                this.d = i5;
            }
            if ((i & 16) == 0) {
                this.e = 600;
            } else {
                this.e = i6;
            }
        }

        public GeofenceParams(int i) {
            this.a = 100;
            this.b = 50;
            this.c = 30000;
            this.d = 12;
            this.e = 600;
        }

        public GeofenceParams() {
            this(0);
        }
    }

    public ExplorerExperiment() {
        this(0);
    }

    public ExplorerExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        Button button = new Button(0);
        GeofenceParams geofenceParams = new GeofenceParams(0);
        DistrictExploreFinishedImage districtExploreFinishedImage = new DistrictExploreFinishedImage(0);
        NoBackgroundLocationPermissionInfo noBackgroundLocationPermissionInfo = new NoBackgroundLocationPermissionInfo(0);
        this.b = f;
        this.c = false;
        this.d = button;
        this.e = EmptyList.a;
        this.f = geofenceParams;
        this.g = districtExploreFinishedImage;
        this.h = noBackgroundLocationPermissionInfo;
    }
}
