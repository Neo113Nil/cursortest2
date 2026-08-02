package xsna;

import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.clips.viewer.impl.feed.wrapper.domain.model.ClipsWrapperHeaderMode;
import java.util.List;

/* compiled from: ClipsWrapperViewState.kt */
/* loaded from: classes17.dex */
public final class uuf implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: ClipsWrapperViewState.kt */
    public static final class a implements fm50<isf> {
        public final yzt0<g> a;
        public final yzt0<e> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public static final class b implements fm50<isf> {
        public final yzt0<f> a;
        public final yzt0<j> b;
        public final yzt0<k> c;
        public final yzt0<h> d;
        public final yzt0<i> e;
        public final yzt0<c> f;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
        }
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public interface c {

        /* compiled from: ClipsWrapperViewState.kt */
        public interface a extends c {
        }

        /* compiled from: ClipsWrapperViewState.kt */
        public interface b extends c {
            ClipsFeedDecorationPayload a();

            ClipsDecorationKey f();
        }

        boolean e();
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public interface d {

        /* compiled from: ClipsWrapperViewState.kt */
        public interface a extends d {
        }

        /* compiled from: ClipsWrapperViewState.kt */
        public interface b extends d {
        }

        /* compiled from: ClipsWrapperViewState.kt */
        public interface c extends d {
        }

        ppf o();
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public static final class e {
        public final d a;
        public final d b;
        public final d c;

        public e(d dVar, d dVar2, d dVar3) {
            this.a = dVar;
            this.b = dVar2;
            this.c = dVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            d dVar = this.a;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            d dVar2 = this.b;
            int hashCode2 = (hashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            d dVar3 = this.c;
            return hashCode2 + (dVar3 != null ? dVar3.hashCode() : 0);
        }

        public final String toString() {
            return "ExtraButtonsData(first=" + this.a + ", second=" + this.b + ", third=" + this.c + ')';
        }
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public interface f {
        int a();

        int b();

        List<wrf> getItems();
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public interface g {
        ksf o();
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public interface h {
        psf a();
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public interface i {
        boolean A0();

        boolean isVisible();

        Long w0();

        npf x0();

        boolean y0();

        npf z0();
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public interface j {
        CharSequence a();

        boolean b();

        float c();

        f getItems();

        tlo0 getTitle();

        ClipsWrapperHeaderMode h();

        boolean isVisible();

        boolean m();
    }

    /* compiled from: ClipsWrapperViewState.kt */
    public interface k {
        iuf a();
    }

    public uuf(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
