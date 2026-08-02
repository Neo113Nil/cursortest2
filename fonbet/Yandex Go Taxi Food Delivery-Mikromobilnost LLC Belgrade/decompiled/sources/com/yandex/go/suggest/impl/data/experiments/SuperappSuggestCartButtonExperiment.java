package com.yandex.go.suggest.impl.data.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w5w0;
import defpackage.xn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestCartButtonExperiment;", "Lxn11;", "Lc6z;", "Companion", "CartButton", "com/yandex/go/suggest/impl/data/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperappSuggestCartButtonExperiment implements xn11, c6z {
    public static final b Companion = new b();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(10)), null};
    public static final SuperappSuggestCartButtonExperiment e = new SuperappSuggestCartButtonExperiment(0);
    public final Map b;
    public final CartButton c;

    public /* synthetic */ SuperappSuggestCartButtonExperiment(int i, Map map, CartButton cartButton) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = cartButton;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestCartButtonExperiment$CartButton;", "", "Companion", "$serializer", "com/yandex/go/suggest/impl/data/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class CartButton {
        public static final a Companion = new a();
        public final String a;
        public final String b;

        public /* synthetic */ CartButton(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public CartButton() {
            this.a = null;
            this.b = null;
        }
    }

    public SuperappSuggestCartButtonExperiment() {
        this(0);
    }

    public SuperappSuggestCartButtonExperiment(int i) {
        this.b = kotlin.collections.b.f();
        this.c = null;
    }
}
