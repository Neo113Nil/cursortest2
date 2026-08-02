package com.yandex.go.yb.lack_of_order.experiments;

import defpackage.b64;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n96;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.z530;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/yb/lack_of_order/experiments/MoneyNotEnoughExperiment;", "Ln96;", "Lc6z;", "Companion", "DialogItem", "PromoblockListItem", "com/yandex/go/yb/lack_of_order/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MoneyNotEnoughExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(0)), null, null};
    public static final MoneyNotEnoughExperiment g = new MoneyNotEnoughExperiment(0);
    public final boolean b;
    public final Map c;
    public final DialogItem d;
    public final PromoblockListItem e;

    public /* synthetic */ MoneyNotEnoughExperiment(int i, boolean z, Map map, DialogItem dialogItem, PromoblockListItem promoblockListItem) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            DialogItem.Companion.getClass();
            this.d = DialogItem.d;
        } else {
            this.d = dialogItem;
        }
        if ((i & 8) != 0) {
            this.e = promoblockListItem;
        } else {
            PromoblockListItem.Companion.getClass();
            this.e = PromoblockListItem.d;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/yb/lack_of_order/experiments/MoneyNotEnoughExperiment$DialogItem;", "", "Companion", "com/yandex/go/yb/lack_of_order/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class DialogItem {
        public static final b Companion = new b();
        public static final DialogItem d = new DialogItem(0);
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ DialogItem(int i, String str, String str2, String str3) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DialogItem)) {
                return false;
            }
            DialogItem dialogItem = (DialogItem) obj;
            return jl40.l(this.a, dialogItem.a) && jl40.l(this.b, dialogItem.b) && jl40.l(this.c, dialogItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("DialogItem(backgroundColor=", this.a, ", buttonTextKey=", this.b, ", titleKey="), this.c, Extension.C_BRAKE);
        }

        public DialogItem(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public DialogItem() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/yb/lack_of_order/experiments/MoneyNotEnoughExperiment$PromoblockListItem;", "", "Companion", "com/yandex/go/yb/lack_of_order/experiments/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class PromoblockListItem {
        public static final c Companion = new c();
        public static final PromoblockListItem d = new PromoblockListItem(0);
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ PromoblockListItem(int i, String str, String str2, String str3) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoblockListItem)) {
                return false;
            }
            PromoblockListItem promoblockListItem = (PromoblockListItem) obj;
            return jl40.l(this.a, promoblockListItem.a) && jl40.l(this.b, promoblockListItem.b) && jl40.l(this.c, promoblockListItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("PromoblockListItem(iconTag=", this.a, ", titleKey=", this.b, ", subtitleKey="), this.c, Extension.C_BRAKE);
        }

        public PromoblockListItem(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public PromoblockListItem() {
            this(0);
        }
    }

    public MoneyNotEnoughExperiment() {
        this(0);
    }

    public MoneyNotEnoughExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        DialogItem.Companion.getClass();
        PromoblockListItem.Companion.getClass();
        this.b = false;
        this.c = f2;
        this.d = DialogItem.d;
        this.e = PromoblockListItem.d;
    }
}
