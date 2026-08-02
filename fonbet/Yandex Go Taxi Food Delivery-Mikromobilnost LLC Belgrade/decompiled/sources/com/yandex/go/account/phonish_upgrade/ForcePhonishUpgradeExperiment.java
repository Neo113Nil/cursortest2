package com.yandex.go.account.phonish_upgrade;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ogr;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/account/phonish_upgrade/ForcePhonishUpgradeExperiment;", "Lw96;", "Lc6z;", "Companion", "ForceOpenMenuShowPolicy", "MenuItem", "com/yandex/go/account/phonish_upgrade/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ForcePhonishUpgradeExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(16)), null, null, null};
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final ForceOpenMenuShowPolicy e;
    public final MenuItem f;

    public /* synthetic */ ForcePhonishUpgradeExperiment(int i, boolean z, Map map, boolean z2, ForceOpenMenuShowPolicy forceOpenMenuShowPolicy, MenuItem menuItem) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = forceOpenMenuShowPolicy;
        }
        if ((i & 16) == 0) {
            this.f = new MenuItem(0);
        } else {
            this.f = menuItem;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/account/phonish_upgrade/ForcePhonishUpgradeExperiment$MenuItem;", "", "Companion", "$serializer", "com/yandex/go/account/phonish_upgrade/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class MenuItem {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ MenuItem(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public MenuItem(int i) {
            this.a = "";
            this.b = null;
        }

        public MenuItem() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/account/phonish_upgrade/ForcePhonishUpgradeExperiment$ForceOpenMenuShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/account/phonish_upgrade/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ForceOpenMenuShowPolicy {
        public static final b Companion = new b();
        public final int a;
        public final int b;

        public /* synthetic */ ForceOpenMenuShowPolicy(int i, int i2, int i3) {
            if ((i & 1) == 0) {
                this.a = Integer.MAX_VALUE;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = Integer.MAX_VALUE;
            } else {
                this.b = i3;
            }
        }

        public ForceOpenMenuShowPolicy() {
            this.a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
        }
    }

    public ForcePhonishUpgradeExperiment() {
        this(0);
    }

    public ForcePhonishUpgradeExperiment(int i) {
        Map f = kotlin.collections.b.f();
        MenuItem menuItem = new MenuItem(0);
        this.b = false;
        this.c = f;
        this.d = false;
        this.e = null;
        this.f = menuItem;
    }
}
