package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.vg10;
import defpackage.w511;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class x0 {
    public static final List M = Collections.EMPTY_LIST;
    public int C;
    public RecyclerView K;
    public RecyclerView.Adapter L;
    public final View a;
    public WeakReference b;
    public int c = -1;
    public int w = -1;
    public long x = -1;
    public int y = -1;
    public int z = -1;
    public x0 A = null;
    public x0 B = null;
    public ArrayList D = null;
    public List E = null;
    public int F = 0;
    public r0 G = null;
    public boolean H = false;
    public int I = 0;
    public int J = -1;

    public x0(View view) {
        if (view != null) {
            this.a = view;
        } else {
            ny61.g("itemView may not be null");
            throw null;
        }
    }

    public final void D(int i) {
        this.C = i | this.C;
    }

    public final int E() {
        RecyclerView recyclerView = this.K;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionInRecyclerView(this);
    }

    public final int F() {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        int adapterPositionInRecyclerView;
        if (this.L == null || (recyclerView = this.K) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.K.getAdapterPositionInRecyclerView(this)) == -1) {
            return -1;
        }
        return adapter.findRelativeAdapterPositionIn(this.L, this, adapterPositionInRecyclerView);
    }

    public final int G() {
        int i = this.z;
        return i == -1 ? this.c : i;
    }

    public final List H() {
        ArrayList arrayList;
        return ((this.C & 1024) != 0 || (arrayList = this.D) == null || arrayList.size() == 0) ? M : this.E;
    }

    public final boolean J() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.K) ? false : true;
    }

    public final boolean K() {
        return (this.C & 1) != 0;
    }

    public final boolean L() {
        return (this.C & 4) != 0;
    }

    public final boolean M() {
        if ((this.C & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        return !this.a.hasTransientState();
    }

    public final boolean N() {
        return (this.C & 8) != 0;
    }

    public final boolean O() {
        return this.G != null;
    }

    public final boolean P() {
        return (this.C & 256) != 0;
    }

    public final boolean Q() {
        return (this.C & 2) != 0;
    }

    public final void R(int i, boolean z) {
        if (this.w == -1) {
            this.w = this.c;
        }
        if (this.z == -1) {
            this.z = this.c;
        }
        if (z) {
            this.z += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((RecyclerView.LayoutParams) view.getLayoutParams()).mInsetsDirty = true;
        }
    }

    public final void S() {
        if (RecyclerView.sDebugAssertionsEnabled && P()) {
            vg10.p("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
            return;
        }
        this.C = 0;
        this.c = -1;
        this.w = -1;
        this.x = -1L;
        this.z = -1;
        this.F = 0;
        this.A = null;
        this.B = null;
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.C &= -1025;
        this.I = 0;
        this.J = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    public final void T(boolean z) {
        int i = this.F;
        int i2 = z ? i - 1 : i + 1;
        this.F = i2;
        if (i2 < 0) {
            this.F = 0;
            if (RecyclerView.sDebugAssertionsEnabled) {
                w511.v(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                return;
            } else {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i2 == 1) {
            this.C |= 16;
        } else if (z && i2 == 0) {
            this.C &= -17;
        }
        if (RecyclerView.sVerboseLoggingEnabled) {
            toString();
        }
    }

    public final boolean U() {
        return (this.C & 128) != 0;
    }

    public final boolean V() {
        return (this.C & 32) != 0;
    }

    public final String toString() {
        StringBuilder v = oyr.v(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        v.append(Integer.toHexString(hashCode()));
        v.append(" position=");
        v.append(this.c);
        v.append(" id=");
        v.append(this.x);
        v.append(", oldPos=");
        v.append(this.w);
        v.append(", pLpos:");
        v.append(this.z);
        StringBuilder sb = new StringBuilder(v.toString());
        if (O()) {
            sb.append(" scrap ");
            sb.append(this.H ? "[changeScrap]" : "[attachedScrap]");
        }
        if (L()) {
            sb.append(" invalid");
        }
        if (!K()) {
            sb.append(" unbound");
        }
        if ((this.C & 2) != 0) {
            sb.append(" update");
        }
        if (N()) {
            sb.append(" removed");
        }
        if (U()) {
            sb.append(" ignored");
        }
        if (P()) {
            sb.append(" tmpDetached");
        }
        if (!M()) {
            sb.append(" not recyclable(" + this.F + Extension.C_BRAKE);
        }
        if ((this.C & 512) != 0 || L()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
