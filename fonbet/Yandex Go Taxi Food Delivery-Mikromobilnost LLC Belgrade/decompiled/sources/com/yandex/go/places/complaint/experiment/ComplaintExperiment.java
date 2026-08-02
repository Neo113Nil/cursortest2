package com.yandex.go.places.complaint.experiment;

import defpackage.bgc;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/places/complaint/experiment/ComplaintExperiment;", "Lw96;", "Lc6z;", "Companion", "ComplaintButton", "ComplaintSuccessNotification", "com/yandex/go/places/complaint/experiment/a", "$serializer", "go-client-android.features.places.complaint:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComplaintExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e;
    public static final ComplaintExperiment f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new bgc(10)), kotlin.a.b(lazyThreadSafetyMode, new bgc(11))};
        f = new ComplaintExperiment(0);
    }

    public /* synthetic */ ComplaintExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/complaint/experiment/ComplaintExperiment$ComplaintSuccessNotification;", "", "Companion", "$serializer", "com/yandex/go/places/complaint/experiment/c", "go-client-android.features.places.complaint:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ComplaintSuccessNotification {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ ComplaintSuccessNotification(int i, String str, String str2) {
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

        public ComplaintSuccessNotification(int i) {
            this.a = "";
            this.b = "";
        }

        public ComplaintSuccessNotification() {
            this(0);
        }
    }

    public ComplaintExperiment() {
        this(0);
    }

    public ComplaintExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/complaint/experiment/ComplaintExperiment$ComplaintButton;", "", "Companion", "$serializer", "com/yandex/go/places/complaint/experiment/b", "go-client-android.features.places.complaint:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ComplaintButton {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final ComplaintSuccessNotification d;

        public /* synthetic */ ComplaintButton(int i, String str, String str2, String str3, ComplaintSuccessNotification complaintSuccessNotification) {
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
                this.d = new ComplaintSuccessNotification(0);
            } else {
                this.d = complaintSuccessNotification;
            }
        }

        public ComplaintButton() {
            ComplaintSuccessNotification complaintSuccessNotification = new ComplaintSuccessNotification(0);
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = complaintSuccessNotification;
        }
    }
}
