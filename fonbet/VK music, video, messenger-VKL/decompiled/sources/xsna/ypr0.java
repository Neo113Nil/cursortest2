package xsna;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: VerticalizationModeViewState.kt */
/* loaded from: classes16.dex */
public final class ypr0 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: VerticalizationModeViewState.kt */
    public static final class a implements fm50<xpr0> {
        public final yzt0<iz8> a;
        public final yzt0<Bitmap> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(cadreSize=");
            sb.append(this.a);
            sb.append(", blurBitmap=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: VerticalizationModeViewState.kt */
    public static final class b implements fm50<xpr0> {
        public final yzt0<iz8> a;
        public final yzt0<c> b;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Picker(cadreSize=");
            sb.append(this.a);
            sb.append(", pickerItems=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: VerticalizationModeViewState.kt */
    public static final class c {
        public final ArrayList a;
        public final int b;

        public c(ArrayList arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }
    }

    public ypr0(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
