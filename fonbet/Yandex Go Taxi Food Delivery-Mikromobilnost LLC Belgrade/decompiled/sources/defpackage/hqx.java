package defpackage;

import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.LabelType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhqx;", "", "Companion", "aqx", "cqx", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class hqx {
    public static final cqx Companion = new cqx();
    public static final i3y[] p;
    public final String a;
    public final LabelType b;
    public final Float[] c;
    public final jl5 d;
    public final Integer e;
    public final Integer f;
    public final Float g;
    public final Boolean h;
    public final Integer i;
    public final Float j;
    public final Float k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Float o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new i3y[]{null, a.b(lazyThreadSafetyMode, new vix(8)), a.b(lazyThreadSafetyMode, new vix(9)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public hqx(String str, LabelType labelType, Float[] fArr, Float f, int i) {
        Integer valueOf = Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR);
        Float valueOf2 = Float.valueOf(2.0f);
        Boolean bool = Boolean.FALSE;
        Float valueOf3 = Float.valueOf(40.0f);
        String str2 = (i & 1) != 0 ? null : str;
        LabelType labelType2 = (i & 2) != 0 ? null : labelType;
        Float[] fArr2 = (i & 4) != 0 ? null : fArr;
        valueOf = (i & 16) != 0 ? null : valueOf;
        Integer num = (i & 32) != 0 ? null : -1;
        valueOf2 = (i & 64) != 0 ? null : valueOf2;
        bool = (i & 128) != 0 ? null : bool;
        Integer num2 = (i & 256) != 0 ? null : 5;
        Float f2 = (i & 1024) != 0 ? null : f;
        Integer num3 = (i & 2048) != 0 ? null : 3;
        Integer num4 = (i & 4096) != 0 ? null : 15;
        Integer num5 = (i & 8192) != 0 ? null : 4;
        valueOf3 = (i & 16384) != 0 ? null : valueOf3;
        this.a = str2;
        this.b = labelType2;
        this.c = fArr2;
        this.d = null;
        this.e = valueOf;
        this.f = num;
        this.g = valueOf2;
        this.h = bool;
        this.i = num2;
        this.j = null;
        this.k = f2;
        this.l = num3;
        this.m = num4;
        this.n = num5;
        this.o = valueOf3;
    }

    public static final /* synthetic */ void c(hqx hqxVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || hqxVar.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, hqxVar.a);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = p;
        if (F || hqxVar.b != null) {
            yjdVar.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), hqxVar.b);
        }
        if (yjdVar.F() || hqxVar.c != null) {
            yjdVar.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), hqxVar.c);
        }
        if (yjdVar.F() || hqxVar.d != null) {
            yjdVar.g(serialDescriptor, 3, hl5.a, hqxVar.d);
        }
        if (yjdVar.F() || hqxVar.e != null) {
            yjdVar.g(serialDescriptor, 4, h6w.a, hqxVar.e);
        }
        if (yjdVar.F() || hqxVar.f != null) {
            yjdVar.g(serialDescriptor, 5, h6w.a, hqxVar.f);
        }
        if (yjdVar.F() || hqxVar.g != null) {
            yjdVar.g(serialDescriptor, 6, nor.a, hqxVar.g);
        }
        if (yjdVar.F() || hqxVar.h != null) {
            yjdVar.g(serialDescriptor, 7, z96.a, hqxVar.h);
        }
        if (yjdVar.F() || hqxVar.i != null) {
            yjdVar.g(serialDescriptor, 8, h6w.a, hqxVar.i);
        }
        if (yjdVar.F() || hqxVar.j != null) {
            yjdVar.g(serialDescriptor, 9, nor.a, hqxVar.j);
        }
        if (yjdVar.F() || hqxVar.k != null) {
            yjdVar.g(serialDescriptor, 10, nor.a, hqxVar.k);
        }
        if (yjdVar.F() || hqxVar.l != null) {
            yjdVar.g(serialDescriptor, 11, h6w.a, hqxVar.l);
        }
        if (yjdVar.F() || hqxVar.m != null) {
            yjdVar.g(serialDescriptor, 12, h6w.a, hqxVar.m);
        }
        if (yjdVar.F() || hqxVar.n != null) {
            yjdVar.g(serialDescriptor, 13, h6w.a, hqxVar.n);
        }
        if (!yjdVar.F() && hqxVar.o == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 14, nor.a, hqxVar.o);
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public /* synthetic */ hqx(int i, String str, LabelType labelType, Float[] fArr, jl5 jl5Var, Integer num, Integer num2, Float f, Boolean bool, Integer num3, Float f2, Float f3, Integer num4, Integer num5, Integer num6, Float f4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = labelType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = fArr;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = jl5Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = f;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = f3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num6;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = f4;
        }
    }

    public hqx() {
        this(null, null, null, null, 32767);
    }
}
