package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.map_object.BubbleOrientation;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldxu0;", "", "Companion", "ywu0", "axu0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class dxu0 {
    public static final axu0 Companion = new axu0();
    public static final i3y[] k;
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;
    public final tn6 e;
    public final ym6 f;
    public final float g;
    public final Integer h;
    public final BubbleStructure i;
    public final BubbleOrientation j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new bmu0(16)), null, null, null, null, a.b(lazyThreadSafetyMode, new bmu0(17)), a.b(lazyThreadSafetyMode, new bmu0(18))};
    }

    public /* synthetic */ dxu0(int i, String str, String str2, boolean z, List list, tn6 tn6Var, ym6 ym6Var, float f, Integer num, BubbleStructure bubbleStructure, BubbleOrientation bubbleOrientation) {
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
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = tn6Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = ym6Var;
        }
        if ((i & 64) == 0) {
            this.g = 0.0f;
        } else {
            this.g = f;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = BubbleStructure.UNKNOWN;
        } else {
            this.i = bubbleStructure;
        }
        if ((i & 512) == 0) {
            this.j = BubbleOrientation.UNKNOWN;
        } else {
            this.j = bubbleOrientation;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final ym6 getF() {
        return this.f;
    }

    /* renamed from: f, reason: from getter */
    public final tn6 getE() {
        return this.e;
    }

    /* renamed from: g, reason: from getter */
    public final float getG() {
        return this.g;
    }

    public dxu0() {
        this(null, null, null, 1023);
    }

    public dxu0(String str, String str2, ym6 ym6Var, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        ym6Var = (i & 32) != 0 ? null : ym6Var;
        BubbleStructure bubbleStructure = BubbleStructure.UNKNOWN;
        BubbleOrientation bubbleOrientation = BubbleOrientation.UNKNOWN;
        this.a = str;
        this.b = str2;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = ym6Var;
        this.g = 0.0f;
        this.h = null;
        this.i = bubbleStructure;
        this.j = bubbleOrientation;
    }
}
