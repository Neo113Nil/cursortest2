package com.yandex.go.yb.api.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.w96;
import defpackage.z151;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/yb/api/experiments/YbWalletEntryPointExperiment;", "Lw96;", "Lc6z;", "Companion", "EntryPoint", "YbQr", "com/yandex/go/yb/api/experiments/a", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbWalletEntryPointExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] h;
    public static final YbWalletEntryPointExperiment i;
    public final boolean b;
    public final Map c;
    public final jsq0 d;
    public final boolean e;
    public final YbQr f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/yb/api/experiments/YbWalletEntryPointExperiment$EntryPoint;", "", "Companion", "com/yandex/go/yb/api/experiments/b", "MENU", "SUMMARY", "SUMMARY_FORCE", "DRIVE", "SUPER_APP_MAIN_QR", "AEROEXPRESS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class EntryPoint {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final EntryPoint AEROEXPRESS;
        public static final b Companion;
        public static final EntryPoint DRIVE;
        public static final EntryPoint MENU;
        public static final EntryPoint SUMMARY;
        public static final EntryPoint SUMMARY_FORCE;
        public static final EntryPoint SUPER_APP_MAIN_QR;

        static {
            EntryPoint entryPoint = new EntryPoint("MENU", 0);
            MENU = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("SUMMARY", 1);
            SUMMARY = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("SUMMARY_FORCE", 2);
            SUMMARY_FORCE = entryPoint3;
            EntryPoint entryPoint4 = new EntryPoint("DRIVE", 3);
            DRIVE = entryPoint4;
            EntryPoint entryPoint5 = new EntryPoint("SUPER_APP_MAIN_QR", 4);
            SUPER_APP_MAIN_QR = entryPoint5;
            EntryPoint entryPoint6 = new EntryPoint("AEROEXPRESS", 5);
            AEROEXPRESS = entryPoint6;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3, entryPoint4, entryPoint5, entryPoint6};
            $VALUES = entryPointArr;
            $ENTRIES = kotlin.enums.a.a(entryPointArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(19));
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new z151(17)), kotlin.a.b(lazyThreadSafetyMode, new z151(18)), null, null, null};
        i = new YbWalletEntryPointExperiment(62);
    }

    public /* synthetic */ YbWalletEntryPointExperiment(int i2, boolean z, Map map, jsq0 jsq0Var, boolean z2, YbQr ybQr, boolean z3) {
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
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var;
        }
        if ((i2 & 8) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = ybQr;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z3;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/yb/api/experiments/YbWalletEntryPointExperiment$YbQr;", "", "Companion", "$serializer", "com/yandex/go/yb/api/experiments/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class YbQr {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ YbQr(int i, String str, String str2) {
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

        public YbQr() {
            this.a = "";
            this.b = "";
        }
    }

    public YbWalletEntryPointExperiment() {
        this(63);
    }

    public YbWalletEntryPointExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = f;
        this.d = jsq0Var;
        this.e = false;
        this.f = null;
        this.g = false;
    }
}
