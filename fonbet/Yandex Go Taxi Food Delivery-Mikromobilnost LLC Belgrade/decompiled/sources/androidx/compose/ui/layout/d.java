package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.aa10;
import defpackage.evw;
import defpackage.ixv;
import defpackage.tls;
import defpackage.yuw;
import java.util.Map;

/* loaded from: classes10.dex */
public final class d implements k, yuw {
    public final /* synthetic */ yuw a;
    public final LayoutDirection b;

    public d(yuw yuwVar, LayoutDirection layoutDirection) {
        this.a = yuwVar;
        this.b = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.k
    public final aa10 E(int i, int i2, Map map, tls tlsVar, tls tlsVar2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & ModalContentViewContainer.BASE_SHADOW_COLOR) != 0 || ((-16777216) & i2) != 0) {
            ixv.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new evw(i, i2, map, tlsVar);
    }

    @Override // defpackage.fwi
    public final float H(int i) {
        return this.a.H(i);
    }

    @Override // defpackage.fwi
    public final float I(float f) {
        return this.a.I(f);
    }

    @Override // defpackage.fwi
    public final long R(long j) {
        return this.a.R(j);
    }

    @Override // defpackage.fwi
    public final long W(float f) {
        return this.a.W(f);
    }

    @Override // defpackage.yuw
    public final boolean d0() {
        return this.a.d0();
    }

    @Override // defpackage.fwi
    public final long f(long j) {
        return this.a.f(j);
    }

    @Override // defpackage.fwi
    public final int f0(float f) {
        return this.a.f0(f);
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.yuw
    public final LayoutDirection getLayoutDirection() {
        return this.b;
    }

    @Override // defpackage.fwi
    public final float i(long j) {
        return this.a.i(j);
    }

    @Override // defpackage.fwi
    public final float i0(long j) {
        return this.a.i0(j);
    }

    @Override // defpackage.fwi
    public final long n(float f) {
        return this.a.n(f);
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.a.u0();
    }

    @Override // defpackage.fwi
    public final float w0(float f) {
        return this.a.w0(f);
    }
}
