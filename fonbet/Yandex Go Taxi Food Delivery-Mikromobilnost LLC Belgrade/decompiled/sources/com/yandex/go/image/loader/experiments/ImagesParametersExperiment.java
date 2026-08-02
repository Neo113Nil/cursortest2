package com.yandex.go.image.loader.experiments;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/image/loader/experiments/ImagesParametersExperiment;", "Lw96;", "Companion", "Cache", "Disk", "com/yandex/go/image/loader/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImagesParametersExperiment extends w96 {
    public static final b Companion = new b();
    public static final ImagesParametersExperiment d = new ImagesParametersExperiment(0);
    public final boolean b;
    public final Cache c;

    public /* synthetic */ ImagesParametersExperiment(int i, boolean z, Cache cache) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new Cache(0);
        } else {
            this.c = cache;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/image/loader/experiments/ImagesParametersExperiment$Disk;", "", "Companion", "$serializer", "com/yandex/go/image/loader/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Disk {
        public static final c Companion = new c();
        public final int a;

        public /* synthetic */ Disk(int i, int i2) {
            if ((i & 1) == 0) {
                this.a = 2592000;
            } else {
                this.a = i2;
            }
        }

        public Disk(int i) {
            this.a = 2592000;
        }

        public Disk() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/image/loader/experiments/ImagesParametersExperiment$Cache;", "", "Companion", "$serializer", "com/yandex/go/image/loader/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Cache {
        public static final a Companion = new a();
        public final Disk a;

        public /* synthetic */ Cache(int i, Disk disk) {
            if ((i & 1) == 0) {
                this.a = new Disk(0);
            } else {
                this.a = disk;
            }
        }

        public Cache() {
            this(0);
        }

        public Cache(int i) {
            this.a = new Disk(0);
        }
    }

    public ImagesParametersExperiment() {
        this(0);
    }

    public ImagesParametersExperiment(int i) {
        Cache cache = new Cache(0);
        this.b = false;
        this.c = cache;
    }
}
