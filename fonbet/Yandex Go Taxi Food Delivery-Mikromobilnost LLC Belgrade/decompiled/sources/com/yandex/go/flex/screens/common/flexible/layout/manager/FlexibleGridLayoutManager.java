package com.yandex.go.flex.screens.common.flexible.layout.manager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.w;
import com.yandex.go.flex.screens.common.flexible.layout.manager.FlexibleGridLayoutManager;
import com.yandex.go.flex.screens.common.flexible.layout.manager.LayoutState;
import defpackage.amt0;
import defpackage.d6w;
import defpackage.emr;
import defpackage.f73;
import defpackage.gki0;
import defpackage.i3y;
import defpackage.jln;
import defpackage.m810;
import defpackage.mhp0;
import defpackage.n;
import defpackage.n43;
import defpackage.nnr;
import defpackage.onr;
import defpackage.qnr;
import defpackage.rh;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tjd;
import defpackage.w511;
import defpackage.xkp0;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u0011²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager;", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/LinearLayoutManagerWithGridLayoutLookup;", "Lgki0;", "Lmhp0;", "LayoutParams", "com/yandex/go/flex/screens/common/flexible/layout/manager/b", "LazySpanLookup", "SavedState", "emr", "jln", "nnr", "Landroidx/recyclerview/widget/d0;", "primaryOrientation", "", "childSize", "startGap", "endGap", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public class FlexibleGridLayoutManager extends LinearLayoutManagerWithGridLayoutLookup implements gki0, mhp0 {
    public final int b0;
    public final b[] c0;
    public final jln d0;
    public final nnr e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public final BitSet i0;
    public int j0;
    public int k0;
    public final LazySpanLookup l0;
    public boolean m0;
    public boolean n0;
    public SavedState o0;
    public int p0;
    public final Rect q0;
    public final emr r0;
    public int[] s0;
    public final LayoutState t0;
    public boolean u0;
    public boolean v0;

    public static final class LazySpanLookup {
        public int[] a = new int[0];
        public List b;

        public final void a(int i) {
            int[] iArr = this.a;
            if (iArr.length == 0) {
                if (i < 10) {
                    i = 10;
                }
                int[] iArr2 = new int[i + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
                return;
            }
            if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final FullSpanItem b(int i) {
            int size;
            List list = this.b;
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i2 = size - 1;
                    FullSpanItem fullSpanItem = (FullSpanItem) list.get(size);
                    if (fullSpanItem.getPosition() == i) {
                        return fullSpanItem;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
            return null;
        }

        public final void c(int i, int i2) {
            int size;
            int[] iArr = this.a;
            if (iArr.length == 0 || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            List list = this.b;
            if (list == null || list.size() - 1 < 0) {
                return;
            }
            while (true) {
                int i4 = size - 1;
                FullSpanItem fullSpanItem = (FullSpanItem) list.get(size);
                if (fullSpanItem.getPosition() >= i) {
                    fullSpanItem.setPosition(fullSpanItem.getPosition() + i2);
                }
                if (i4 < 0) {
                    return;
                } else {
                    size = i4;
                }
            }
        }

        public final void d(int i, int i2) {
            int size;
            int[] iArr = this.a;
            if (iArr.length == 0 || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = this.b;
            if (list == null || list.size() - 1 < 0) {
                return;
            }
            while (true) {
                int i4 = size - 1;
                FullSpanItem fullSpanItem = (FullSpanItem) list.get(size);
                if (fullSpanItem.getPosition() >= i) {
                    if (fullSpanItem.getPosition() < i3) {
                        list.remove(size);
                    } else {
                        fullSpanItem.setPosition(fullSpanItem.getPosition() - i2);
                    }
                }
                if (i4 < 0) {
                    return;
                } else {
                    size = i4;
                }
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$LazySpanLookup$FullSpanItem;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "source", "<init>", "(Landroid/os/Parcel;)V", "()V", "", "spanIndex", "getGapForSpan", "(I)I", "describeContents", "()I", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "position", CA20Status.STATUS_USER_I, "getPosition", "setPosition", "(I)V", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/LayoutState$LayoutDirection;", "gapDirection", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/LayoutState$LayoutDirection;", "getGapDirection$flexible_layout_managers", "()Lcom/yandex/go/flex/screens/common/flexible/layout/manager/LayoutState$LayoutDirection;", "setGapDirection$flexible_layout_managers", "(Lcom/yandex/go/flex/screens/common/flexible/layout/manager/LayoutState$LayoutDirection;)V", "", "gapPerSpan", "[I", "getGapPerSpan", "()[I", "setGapPerSpan", "([I)V", "", "hasUnwantedGapAfter", "Z", "getHasUnwantedGapAfter", "()Z", "setHasUnwantedGapAfter", "(Z)V", "CREATOR", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class FullSpanItem implements Parcelable {

            /* renamed from: CREATOR, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private LayoutState.LayoutDirection gapDirection;
            private int[] gapPerSpan;
            private boolean hasUnwantedGapAfter;
            private int position;

            public FullSpanItem(Parcel parcel) {
                this.gapPerSpan = new int[0];
                this.position = parcel.readInt();
                this.gapDirection = (LayoutState.LayoutDirection) (Build.VERSION.SDK_INT >= 33 ? rh.l(parcel) : parcel.readSerializable());
                this.hasUnwantedGapAfter = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.gapPerSpan = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* renamed from: getGapDirection$flexible_layout_managers, reason: from getter */
            public final LayoutState.LayoutDirection getGapDirection() {
                return this.gapDirection;
            }

            public final int getGapForSpan(int spanIndex) {
                int[] iArr = this.gapPerSpan;
                if (iArr.length == 0) {
                    return 0;
                }
                return iArr[spanIndex];
            }

            public final int[] getGapPerSpan() {
                return this.gapPerSpan;
            }

            public final boolean getHasUnwantedGapAfter() {
                return this.hasUnwantedGapAfter;
            }

            public final int getPosition() {
                return this.position;
            }

            public final void setGapDirection$flexible_layout_managers(LayoutState.LayoutDirection layoutDirection) {
                this.gapDirection = layoutDirection;
            }

            public final void setGapPerSpan(int[] iArr) {
                this.gapPerSpan = iArr;
            }

            public final void setHasUnwantedGapAfter(boolean z) {
                this.hasUnwantedGapAfter = z;
            }

            public final void setPosition(int i) {
                this.position = i;
            }

            public String toString() {
                int i = this.position;
                LayoutState.LayoutDirection layoutDirection = this.gapDirection;
                boolean z = this.hasUnwantedGapAfter;
                String arrays = Arrays.toString(this.gapPerSpan);
                StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(i);
                sb.append(", mGapDir=");
                sb.append(layoutDirection);
                sb.append(", mHasUnwantedGapAfter=");
                return n.m(", mGapPerSpan=", arrays, "}", sb, z);
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.position);
                dest.writeSerializable(this.gapDirection);
                dest.writeInt(this.hasUnwantedGapAfter ? 1 : 0);
                int[] iArr = this.gapPerSpan;
                if (iArr.length == 0) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(iArr.length);
                    dest.writeIntArray(this.gapPerSpan);
                }
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$LazySpanLookup$FullSpanItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$LazySpanLookup$FullSpanItem;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$LazySpanLookup$FullSpanItem;", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
            /* renamed from: com.yandex.go.flex.screens.common.flexible.layout.manager.FlexibleGridLayoutManager$LazySpanLookup$FullSpanItem$CREATOR, reason: from kotlin metadata */
            public static final class Companion implements Parcelable.Creator<FullSpanItem> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                private Companion() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int size) {
                    return new FullSpanItem[size];
                }
            }

            public FullSpanItem() {
                this.gapPerSpan = new int[0];
            }
        }
    }

    public FlexibleGridLayoutManager(int i, jln jlnVar, Context context) {
        super(context);
        this.b0 = -1;
        final int i2 = 0;
        this.c0 = new b[0];
        final int i3 = 1;
        this.e0 = new nnr(kotlin.a.a(new sls(this) { // from class: mnr
            public final /* synthetic */ FlexibleGridLayoutManager b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i2;
                FlexibleGridLayoutManager flexibleGridLayoutManager = this.b;
                switch (i4) {
                    case 0:
                        return d0.a(flexibleGridLayoutManager, 1);
                    default:
                        return d0.a(flexibleGridLayoutManager, 0);
                }
            }
        }), kotlin.a.a(new sls(this) { // from class: mnr
            public final /* synthetic */ FlexibleGridLayoutManager b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                FlexibleGridLayoutManager flexibleGridLayoutManager = this.b;
                switch (i4) {
                    case 0:
                        return d0.a(flexibleGridLayoutManager, 1);
                    default:
                        return d0.a(flexibleGridLayoutManager, 0);
                }
            }
        }));
        this.i0 = new BitSet();
        this.j0 = -1;
        this.k0 = Integer.MIN_VALUE;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.l0 = lazySpanLookup;
        this.q0 = new Rect();
        this.r0 = new emr(this);
        this.s0 = new int[0];
        this.t0 = new LayoutState();
        H(null);
        if (i != this.b0) {
            lazySpanLookup.a = new int[0];
            lazySpanLookup.b = null;
            i1();
            this.b0 = i;
            this.i0 = new BitSet(this.b0);
            int i4 = this.b0;
            b[] bVarArr = new b[i4];
            while (i2 < i4) {
                bVarArr[i2] = new b(this, i2);
                i2++;
            }
            this.c0 = bVarArr;
            i1();
        }
        this.d0 = jlnVar;
        b2(1);
        this.u0 = true;
        this.v0 = true;
    }

    public static int D2(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public static int p2(b[] bVarArr, int i) {
        int h = bVarArr[0].h(Integer.valueOf(i));
        int length = bVarArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            int h2 = bVarArr[i2].h(Integer.valueOf(i));
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    public static int q2(b[] bVarArr, int i) {
        int j = bVarArr[0].j(Integer.valueOf(i));
        int length = bVarArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            int j2 = bVarArr[i2].j(Integer.valueOf(i));
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    @Override // defpackage.mhp0
    public final void A(boolean z) {
        this.v0 = z;
    }

    public final void A2(int i, LayoutState.LayoutDirection layoutDirection) {
        for (int i2 = 0; i2 < this.b0; i2++) {
            if (!this.c0[i2].b.isEmpty()) {
                C2(this.c0[i2], layoutDirection, i);
            }
        }
    }

    public final void B2(int i, RecyclerView.k kVar) {
        int i2;
        int i3;
        int i4;
        d0 d0Var = (d0) this.e0.a.getValue();
        LayoutState layoutState = this.t0;
        boolean z = false;
        layoutState.b = 0;
        layoutState.c = i;
        if (!A0() || (i4 = kVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.h0 == (i4 < i)) {
                i2 = d0Var.l();
                i3 = 0;
            } else {
                i3 = d0Var.l();
                i2 = 0;
            }
        }
        if (f0()) {
            layoutState.f = d0Var.k() - i3;
            layoutState.g = d0Var.g() + i2;
        } else {
            layoutState.g = d0Var.f() + i2;
            layoutState.f = -i3;
        }
        layoutState.h = false;
        layoutState.a = true;
        if (d0Var.i() == 0 && d0Var.f() == 0) {
            z = true;
        }
        layoutState.i = z;
    }

    public final void C2(b bVar, LayoutState.LayoutDirection layoutDirection, int i) {
        int i2 = bVar.c;
        int i3 = bVar.a;
        LayoutState.LayoutDirection layoutDirection2 = LayoutState.LayoutDirection.START;
        BitSet bitSet = this.i0;
        if (layoutDirection == layoutDirection2) {
            if (bVar.d == Integer.MIN_VALUE) {
                bVar.c();
            }
            if (bVar.d + i2 <= i) {
                bitSet.set(i3, false);
                return;
            }
            return;
        }
        if (bVar.e == Integer.MIN_VALUE) {
            bVar.b();
        }
        if (bVar.e - i2 >= i) {
            bitSet.set(i3, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void E0(int i) {
        super.E0(i);
        for (int i2 = 0; i2 < this.b0; i2++) {
            b bVar = this.c0[i2];
            int i3 = bVar.d;
            if (i3 != Integer.MIN_VALUE) {
                bVar.d = i3 + i;
            }
            int i4 = bVar.e;
            if (i4 != Integer.MIN_VALUE) {
                bVar.e = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void F0(int i) {
        super.F0(i);
        for (int i2 = 0; i2 < this.b0; i2++) {
            b bVar = this.c0[i2];
            int i3 = bVar.d;
            if (i3 != Integer.MIN_VALUE) {
                bVar.d = i3 + i;
            }
            int i4 = bVar.e;
            if (i4 != Integer.MIN_VALUE) {
                bVar.e = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void G0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        LazySpanLookup lazySpanLookup = this.l0;
        lazySpanLookup.a = new int[0];
        lazySpanLookup.b = null;
        for (int i = 0; i < this.b0; i++) {
            this.c0[i].d();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void H(String str) {
        if (this.o0 == null) {
            super.H(str);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final boolean I() {
        return this.v0 && this.J == 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
        super.I0(recyclerView, r0Var);
        for (int i = 0; i < this.b0; i++) {
            this.c0[i].d();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        return this.u0 && this.J == 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final View J0(View view, int i, r0 r0Var, RecyclerView.k kVar) {
        View W;
        LayoutState.LayoutDirection layoutDirection;
        View i2;
        if (d0() != 0 && (W = W(view)) != null) {
            y2();
            if (i == 1) {
                layoutDirection = this.J == 1 ? LayoutState.LayoutDirection.START : U1() ? LayoutState.LayoutDirection.END : LayoutState.LayoutDirection.START;
            } else if (i == 2) {
                layoutDirection = this.J == 1 ? LayoutState.LayoutDirection.END : U1() ? LayoutState.LayoutDirection.START : LayoutState.LayoutDirection.END;
            } else if (i == 17) {
                if (this.J == 0) {
                    layoutDirection = LayoutState.LayoutDirection.START;
                }
                layoutDirection = null;
            } else if (i == 33) {
                if (this.J == 1) {
                    layoutDirection = LayoutState.LayoutDirection.START;
                }
                layoutDirection = null;
            } else if (i != 66) {
                if (i == 130 && this.J == 1) {
                    layoutDirection = LayoutState.LayoutDirection.END;
                }
                layoutDirection = null;
            } else {
                if (this.J == 0) {
                    layoutDirection = LayoutState.LayoutDirection.END;
                }
                layoutDirection = null;
            }
            if (layoutDirection != null) {
                LayoutParams layoutParams = (LayoutParams) W.getLayoutParams();
                boolean isFullSpan = layoutParams.getIsFullSpan();
                b span = layoutParams.getSpan();
                if (span != null) {
                    int o2 = layoutDirection == LayoutState.LayoutDirection.END ? o2() : n2();
                    B2(o2, kVar);
                    z2(layoutDirection);
                    LayoutState layoutState = this.t0;
                    layoutState.c = layoutState.d.getVector() + o2;
                    layoutState.b = (int) (((d0) this.e0.a.getValue()).l() * 0.33333334f);
                    layoutState.h = true;
                    layoutState.a = false;
                    i2(r0Var, layoutState, kVar);
                    this.m0 = this.h0;
                    if (!isFullSpan && (i2 = span.i(o2, layoutDirection)) != null && i2 != W) {
                        return i2;
                    }
                    boolean t2 = t2(layoutDirection);
                    int i3 = this.b0;
                    b[] bVarArr = this.c0;
                    if (t2) {
                        for (int i4 = i3 - 1; -1 < i4; i4--) {
                            View i5 = bVarArr[i4].i(o2, layoutDirection);
                            if (i5 != null && i5 != W) {
                                return i5;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i3; i6++) {
                            View i7 = bVarArr[i6].i(o2, layoutDirection);
                            if (i7 != null && i7 != W) {
                                return i7;
                            }
                        }
                    }
                    boolean z = (this.g0 ^ true) == (layoutDirection == LayoutState.LayoutDirection.START);
                    if (!isFullSpan) {
                        View X = X(z ? span.e() : span.f());
                        if (X != null && X != W) {
                            return X;
                        }
                    }
                    if (t2(layoutDirection)) {
                        for (int i8 = i3 - 1; -1 < i8; i8--) {
                            if (i8 != span.a) {
                                View X2 = X(z ? bVarArr[i8].e() : bVarArr[i8].f());
                                if (X2 != null && X2 != W) {
                                    return X2;
                                }
                            }
                        }
                    } else {
                        for (int i9 = 0; i9 < i3; i9++) {
                            View X3 = X(z ? bVarArr[i9].e() : bVarArr[i9].f());
                            if (X3 != null && X3 != W) {
                                return X3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean K(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (d0() > 0) {
            View k2 = k2(false);
            View j2 = j2(false);
            if (k2 == null || j2 == null) {
                return;
            }
            int viewLayoutPosition = ((RecyclerView.LayoutParams) k2.getLayoutParams()).getViewLayoutPosition();
            int viewLayoutPosition2 = ((RecyclerView.LayoutParams) j2.getLayoutParams()).getViewLayoutPosition();
            if (viewLayoutPosition < viewLayoutPosition2) {
                accessibilityEvent.setFromIndex(viewLayoutPosition);
                accessibilityEvent.setToIndex(viewLayoutPosition2);
            } else {
                accessibilityEvent.setFromIndex(viewLayoutPosition2);
                accessibilityEvent.setToIndex(viewLayoutPosition);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void M(int i, int i2, RecyclerView.k kVar, o oVar) {
        LayoutState layoutState;
        int h;
        if (this.J != 0) {
            i = i2;
        }
        if (d0() == 0 || i == 0) {
            return;
        }
        u2(i, kVar);
        int[] iArr = this.s0;
        int length = iArr.length;
        int i3 = this.b0;
        if (length == 0 || iArr.length < i3) {
            this.s0 = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            layoutState = this.t0;
            if (i4 >= i3) {
                break;
            }
            LayoutState.ItemDirection itemDirection = layoutState.d;
            LayoutState.ItemDirection itemDirection2 = LayoutState.ItemDirection.HEAD;
            b[] bVarArr = this.c0;
            if (itemDirection == itemDirection2) {
                int i6 = layoutState.f;
                h = i6 - bVarArr[i4].j(Integer.valueOf(i6));
            } else {
                h = bVarArr[i4].h(Integer.valueOf(layoutState.g)) - layoutState.g;
            }
            if (h >= 0) {
                this.s0[i5] = h;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.s0, 0, i5);
        for (int i7 = 0; i7 < i5 && layoutState.a(kVar); i7++) {
            oVar.a(layoutState.c, this.s0[i7]);
            layoutState.c = layoutState.d.getVector() + layoutState.c;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void O0(int i, int i2) {
        r2(i, i2, AdapterEvents.ADD);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void P0() {
        LazySpanLookup lazySpanLookup = this.l0;
        lazySpanLookup.a = new int[0];
        lazySpanLookup.b = null;
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Q0(int i, int i2) {
        r2(i, i2, AdapterEvents.MOVE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int R(RecyclerView.k kVar) {
        if (d0() != 0) {
            d0 a = d0.a(this, 1);
            View k2 = k2(false);
            View j2 = j2(false);
            if (d0() != 0 && kVar.b() != 0 && k2 != null && j2 != null) {
                return Math.min(a.l(), a.b(j2) - a.e(k2));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void R0(int i, int i2) {
        r2(i, i2, AdapterEvents.REMOVE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        if (d0() == 0) {
            return 0;
        }
        return xkp0.a(kVar, d0.a(this, 1), k2(false), j2(false), this);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int T(RecyclerView.k kVar) {
        if (d0() != 0) {
            d0 a = d0.a(this, 1);
            View k2 = k2(false);
            View j2 = j2(false);
            if (d0() != 0 && kVar.b() != 0 && k2 != null && j2 != null) {
                return (int) (((a.b(j2) - a.e(k2)) / (Math.abs(((RecyclerView.LayoutParams) k2.getLayoutParams()).getViewLayoutPosition() - ((RecyclerView.LayoutParams) j2.getLayoutParams()).getViewLayoutPosition()) + 1)) * kVar.b());
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void T0(RecyclerView recyclerView, int i, int i2, Object obj) {
        if (obj instanceof tjd) {
            return;
        }
        r2(i, i2, AdapterEvents.UPDATE);
    }

    /* JADX WARN: Removed duplicated region for block: B:303:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        SavedState savedState;
        int i;
        Iterator it;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        SavedState savedState2 = this.o0;
        emr emrVar = this.r0;
        if (!(savedState2 == null && this.j0 == -1) && kVar.b() == 0) {
            c1(r0Var);
            emrVar.c();
            return;
        }
        boolean z3 = emrVar.f;
        FlexibleGridLayoutManager flexibleGridLayoutManager = (FlexibleGridLayoutManager) emrVar.h;
        boolean z4 = (z3 && this.j0 == -1 && this.o0 == null) ? false : true;
        b[] bVarArr = this.c0;
        int i6 = this.b0;
        LazySpanLookup lazySpanLookup = this.l0;
        nnr nnrVar = this.e0;
        if (z4) {
            emrVar.c();
            SavedState savedState3 = this.o0;
            if (savedState3 != null) {
                if (savedState3.getSpanOffsetsSize() > 0) {
                    if (savedState3.getSpanOffsetsSize() == i6) {
                        int i7 = 0;
                        while (i7 < i6) {
                            bVarArr[i7].d();
                            d0 d0Var = (d0) nnrVar.a.getValue();
                            SavedState savedState4 = savedState2;
                            int i8 = savedState3.getSpanOffsets()[i7];
                            if (i8 != Integer.MIN_VALUE) {
                                i8 += savedState3.getAnchorLayoutIsFromEnd() ? d0Var.g() : d0Var.k();
                            }
                            b bVar = bVarArr[i7];
                            bVar.d = i8;
                            bVar.e = i8;
                            i7++;
                            savedState2 = savedState4;
                        }
                    } else {
                        savedState = savedState2;
                        savedState3.invalidateSpanInfo();
                        savedState3.setAnchorPosition(savedState3.getVisibleAnchorPosition());
                        this.n0 = savedState3.getLastLayoutIsRTL();
                        this.g0 = savedState3.getIsReverseLayout();
                        y2();
                        if (savedState3.getAnchorPosition() == -1) {
                            this.j0 = savedState3.getAnchorPosition();
                            emrVar.d = savedState3.getAnchorLayoutIsFromEnd();
                        } else {
                            emrVar.d = this.h0;
                        }
                        if (savedState3.getSpanLookupSize() > 1) {
                            lazySpanLookup.a = savedState3.getSpanLookup();
                            lazySpanLookup.b = savedState3.getFullSpanItems();
                        }
                    }
                }
                savedState = savedState2;
                this.n0 = savedState3.getLastLayoutIsRTL();
                this.g0 = savedState3.getIsReverseLayout();
                y2();
                if (savedState3.getAnchorPosition() == -1) {
                }
                if (savedState3.getSpanLookupSize() > 1) {
                }
            } else {
                savedState = savedState2;
                y2();
                emrVar.d = this.h0;
            }
            SavedState savedState5 = this.o0;
            if (kVar.g) {
                i3 = -1;
            } else {
                int i9 = this.j0;
                if (i9 == -1) {
                    i3 = -1;
                } else if (i9 < 0 || i9 >= kVar.b()) {
                    i3 = -1;
                    this.j0 = -1;
                    this.k0 = Integer.MIN_VALUE;
                } else {
                    if (savedState5 == null || savedState5.getAnchorPosition() == -1 || savedState5.getSpanOffsetsSize() < 1) {
                        final View X = X(this.j0);
                        if (X != null) {
                            emrVar.b = this.h0 ? o2() : n2();
                            final i3y i3yVar = nnrVar.a;
                            final int i10 = 0;
                            i3y a = kotlin.a.a(new sls() { // from class: lnr
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i11 = i10;
                                    i3y i3yVar2 = i3yVar;
                                    View view = X;
                                    switch (i11) {
                                        case 0:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).c(view));
                                        case 1:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).e(view) - ((d0) i3yVar2.getValue()).k());
                                        default:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).g() - ((d0) i3yVar2.getValue()).b(view));
                                    }
                                }
                            });
                            final int i11 = 1;
                            i3y a2 = kotlin.a.a(new sls() { // from class: lnr
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i112 = i11;
                                    i3y i3yVar2 = i3yVar;
                                    View view = X;
                                    switch (i112) {
                                        case 0:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).c(view));
                                        case 1:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).e(view) - ((d0) i3yVar2.getValue()).k());
                                        default:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).g() - ((d0) i3yVar2.getValue()).b(view));
                                    }
                                }
                            });
                            final int i12 = 2;
                            i3y a3 = kotlin.a.a(new sls() { // from class: lnr
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i112 = i12;
                                    i3y i3yVar2 = i3yVar;
                                    View view = X;
                                    switch (i112) {
                                        case 0:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).c(view));
                                        case 1:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).e(view) - ((d0) i3yVar2.getValue()).k());
                                        default:
                                            return Integer.valueOf(((d0) i3yVar2.getValue()).g() - ((d0) i3yVar2.getValue()).b(view));
                                    }
                                }
                            });
                            if (this.k0 != Integer.MIN_VALUE) {
                                if (emrVar.d) {
                                    emrVar.c = (((d0) i3yVar.getValue()).g() - this.k0) - ((d0) i3yVar.getValue()).b(X);
                                } else {
                                    emrVar.c = (((d0) i3yVar.getValue()).k() + this.k0) - ((d0) i3yVar.getValue()).e(X);
                                }
                            } else if (((Number) a.getValue()).intValue() > ((d0) i3yVar.getValue()).l()) {
                                emrVar.c = emrVar.d ? ((d0) i3yVar.getValue()).g() : ((d0) i3yVar.getValue()).k();
                            } else if (((Number) a2.getValue()).intValue() < 0) {
                                emrVar.c = -((Number) a2.getValue()).intValue();
                            } else if (((Number) a3.getValue()).intValue() < 0) {
                                emrVar.c = ((Number) a3.getValue()).intValue();
                            } else {
                                emrVar.c = Integer.MIN_VALUE;
                            }
                        } else {
                            int i13 = this.j0;
                            emrVar.b = i13;
                            nnr nnrVar2 = flexibleGridLayoutManager.e0;
                            int i14 = this.k0;
                            if (i14 == Integer.MIN_VALUE) {
                                emrVar.d = h2(i13) == LayoutState.LayoutDirection.END;
                                d0 d0Var2 = (d0) nnrVar2.a.getValue();
                                emrVar.c = emrVar.d ? d0Var2.g() : d0Var2.k();
                            } else {
                                d0 d0Var3 = (d0) nnrVar2.a.getValue();
                                emrVar.c = emrVar.d ? d0Var3.g() - i14 : d0Var3.k() + i14;
                            }
                            z2 = true;
                            emrVar.e = true;
                            emrVar.f = z2;
                        }
                    } else {
                        emrVar.c = Integer.MIN_VALUE;
                        emrVar.b = this.j0;
                    }
                    z2 = true;
                    emrVar.f = z2;
                }
            }
            if (this.m0) {
                int b = kVar.b();
                int d0 = d0() - 1;
                while (true) {
                    if (i3 >= d0) {
                        i5 = 0;
                        break;
                    }
                    View c0 = c0(d0);
                    if (c0 != null && (i5 = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition()) >= 0 && i5 < b) {
                        break;
                    }
                    d0--;
                    i3 = -1;
                }
            } else {
                int b2 = kVar.b();
                int d02 = d0();
                int i15 = 0;
                while (true) {
                    if (i15 >= d02) {
                        i4 = 0;
                        break;
                    }
                    View c02 = c0(i15);
                    if (c02 != null && (i4 = ((RecyclerView.LayoutParams) c02.getLayoutParams()).getViewLayoutPosition()) >= 0 && i4 < b2) {
                        break;
                    } else {
                        i15++;
                    }
                }
                i5 = i4;
            }
            emrVar.b = i5;
            emrVar.c = Integer.MIN_VALUE;
            z2 = true;
            emrVar.f = z2;
        } else {
            savedState = savedState2;
        }
        boolean z5 = savedState == null && this.j0 == -1;
        boolean z6 = (emrVar.d == this.m0 && U1() == this.n0) ? false : true;
        if (z5 && z6) {
            lazySpanLookup.a = new int[0];
            lazySpanLookup.b = null;
            i = 1;
            emrVar.e = true;
        } else {
            i = 1;
        }
        if (d0() > 0 && (savedState == null || savedState.getSpanOffsetsSize() < i)) {
            if (emrVar.e) {
                for (int i16 = 0; i16 < i6; i16++) {
                    bVarArr[i16].d();
                    int i17 = emrVar.c;
                    if (i17 != Integer.MIN_VALUE) {
                        b bVar2 = bVarArr[i16];
                        bVar2.d = i17;
                        bVar2.e = i17;
                    }
                }
            } else if (z4 || emrVar.g.length == 0) {
                boolean z7 = this.h0;
                int i18 = emrVar.c;
                ArrayList arrayList = new ArrayList(bVarArr.length);
                for (b bVar3 : bVarArr) {
                    arrayList.add(Integer.valueOf(z7 ? bVar3.h(Integer.MIN_VALUE) : bVar3.j(Integer.MIN_VALUE)));
                }
                d0 d0Var4 = (d0) nnrVar.a.getValue();
                Pair pair = new Pair(Integer.valueOf(d0Var4.k()), Integer.valueOf(d0Var4.g()));
                int intValue = ((Number) pair.getFirst()).intValue();
                int intValue2 = ((Number) pair.getSecond()).intValue();
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it) {
                    boolean z8 = z7;
                    int intValue3 = ((Number) it2.next()).intValue();
                    if (!z8 ? intValue3 <= intValue : intValue3 >= intValue2) {
                        it = it2;
                        i2 = Integer.MIN_VALUE;
                        z = false;
                    } else {
                        it = it2;
                        i2 = Integer.MIN_VALUE;
                        z = true;
                    }
                    arrayList2.add(Boolean.valueOf((intValue3 == i2 || z) ? false : true));
                    z7 = z8;
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (((Boolean) it3.next()).booleanValue()) {
                            Iterator it4 = arrayList.iterator();
                            int i19 = 0;
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                int i20 = i19 + 1;
                                if (i19 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                int intValue4 = ((Number) next).intValue();
                                bVarArr[i19].d();
                                if (intValue4 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i18);
                                    if (i18 == Integer.MIN_VALUE) {
                                        valueOf = null;
                                    }
                                    int intValue5 = valueOf != null ? valueOf.intValue() : 0;
                                    b bVar4 = bVarArr[i19];
                                    int i21 = intValue4 + intValue5;
                                    bVar4.d = i21;
                                    bVar4.e = i21;
                                }
                                i19 = i20;
                            }
                        }
                    }
                }
                int length = bVarArr.length;
                int[] iArr = emrVar.g;
                if (iArr.length == 0 || iArr.length < length) {
                    emrVar.g = new int[flexibleGridLayoutManager.c0.length];
                }
                for (int i22 = 0; i22 < length; i22++) {
                    emrVar.g[i22] = bVarArr[i22].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i23 = 0; i23 < i6; i23++) {
                    b bVar5 = bVarArr[i23];
                    bVar5.d();
                    int i24 = emrVar.g[i23];
                    bVar5.d = i24;
                    bVar5.e = i24;
                }
            }
        }
        U(r0Var);
        LayoutState layoutState = this.t0;
        layoutState.a = false;
        int l = ((d0) nnrVar.b.getValue()).l();
        this.f0 = l / i6;
        this.p0 = View.MeasureSpec.makeMeasureSpec(l, ((d0) nnrVar.b.getValue()).i());
        B2(emrVar.b, kVar);
        if (emrVar.d) {
            z2(LayoutState.LayoutDirection.START);
            i2(r0Var, layoutState, kVar);
            z2(LayoutState.LayoutDirection.END);
            layoutState.c = layoutState.d.getVector() + emrVar.b;
            i2(r0Var, layoutState, kVar);
        } else {
            z2(LayoutState.LayoutDirection.END);
            i2(r0Var, layoutState, kVar);
            z2(LayoutState.LayoutDirection.START);
            layoutState.c = layoutState.d.getVector() + emrVar.b;
            i2(r0Var, layoutState, kVar);
        }
        d0 d0Var5 = (d0) nnrVar.b.getValue();
        if (d0Var5.i() != 1073741824) {
            int d03 = d0();
            float f = 0.0f;
            for (int i25 = 0; i25 < d03; i25++) {
                View c03 = c0(i25);
                if (c03 != null) {
                    float c = d0Var5.c(c03);
                    if (c >= f) {
                        if (((LayoutParams) c03.getLayoutParams()).getIsFullSpan()) {
                            c = (c * 1.0f) / i6;
                        }
                        f = Math.max(f, c);
                    }
                }
            }
            int i26 = this.f0;
            int b3 = m810.b(f * i6);
            if (d0Var5.i() == Integer.MIN_VALUE) {
                b3 = Math.min(b3, d0Var5.l());
            }
            this.f0 = b3 / i6;
            this.p0 = View.MeasureSpec.makeMeasureSpec(b3, ((d0) nnrVar.b.getValue()).i());
            if (this.f0 != i26) {
                for (int i27 = 0; i27 < d03; i27++) {
                    View c04 = c0(i27);
                    if (c04 != null) {
                        LayoutParams layoutParams = (LayoutParams) c04.getLayoutParams();
                        b span = layoutParams.getSpan();
                        if (!layoutParams.getIsFullSpan() && span != null) {
                            int i28 = span.a;
                            if (U1() && this.J == 1) {
                                int i29 = -((i6 - 1) - i28);
                                c04.offsetLeftAndRight((this.f0 * i29) - (i29 * i26));
                            } else {
                                int i30 = this.f0 * i28;
                                int i31 = i28 * i26;
                                if (this.J == 1) {
                                    c04.offsetLeftAndRight(i30 - i31);
                                } else {
                                    c04.offsetTopAndBottom(i30 - i31);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (d0() > 0) {
            if (this.h0) {
                l2(r0Var, kVar, true);
                m2(r0Var, kVar, false);
            } else {
                m2(r0Var, kVar, true);
                l2(r0Var, kVar, false);
            }
        }
        if (kVar.g) {
            emrVar.c();
        }
        this.m0 = emrVar.d;
        this.n0 = U1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        super.V0(kVar);
        this.j0 = -1;
        this.k0 = Integer.MIN_VALUE;
        this.o0 = null;
        this.r0.c();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void W0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.o0 = savedState;
            if (this.j0 != -1) {
                savedState.invalidateAnchorPositionInfo();
                savedState.invalidateSpanInfo();
            }
            i1();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final Parcelable X0() {
        int j;
        int k;
        SavedState savedState = this.o0;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.setReverseLayout(this.g0);
        savedState2.setAnchorLayoutIsFromEnd(this.m0);
        savedState2.setLastLayoutIsRTL(this.n0);
        LazySpanLookup lazySpanLookup = this.l0;
        int[] iArr = lazySpanLookup.a;
        if (iArr.length == 0) {
            savedState2.setSpanLookupSize(0);
        } else {
            savedState2.setSpanLookup(iArr);
            savedState2.setSpanLookupSize(savedState2.getSpanLookup().length);
            savedState2.setFullSpanItems(lazySpanLookup.b);
        }
        if (d0() <= 0) {
            savedState2.setAnchorPosition(-1);
            savedState2.setVisibleAnchorPosition(-1);
            savedState2.setSpanOffsetsSize(0);
            return savedState2;
        }
        savedState2.setAnchorPosition(this.m0 ? o2() : n2());
        View j2 = this.h0 ? j2(true) : k2(true);
        savedState2.setVisibleAnchorPosition(j2 != null ? ((RecyclerView.LayoutParams) j2.getLayoutParams()).getViewLayoutPosition() : -1);
        int i = this.b0;
        savedState2.setSpanOffsetsSize(i);
        savedState2.setSpanOffsets(new int[i]);
        for (int i2 = 0; i2 < i; i2++) {
            d0 d0Var = (d0) this.e0.a.getValue();
            boolean z = this.m0;
            b[] bVarArr = this.c0;
            if (z) {
                j = bVarArr[i2].h(Integer.MIN_VALUE);
                if (j != Integer.MIN_VALUE) {
                    k = d0Var.g();
                    j -= k;
                    savedState2.getSpanOffsets()[i2] = j;
                } else {
                    savedState2.getSpanOffsets()[i2] = j;
                }
            } else {
                j = bVarArr[i2].j(Integer.MIN_VALUE);
                if (j != Integer.MIN_VALUE) {
                    k = d0Var.k();
                    j -= k;
                    savedState2.getSpanOffsets()[i2] = j;
                } else {
                    savedState2.getSpanOffsets()[i2] = j;
                }
            }
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Y() {
        return this.J == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Z(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gki0
    public final int a() {
        View j2 = this.h0 ? j2(true) : k2(true);
        if (j2 != null) {
            return ((RecyclerView.LayoutParams) j2.getLayoutParams()).getViewLayoutPosition();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams a0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final int a2(int i, r0 r0Var, RecyclerView.k kVar) {
        if (d0() == 0 || i == 0) {
            return 0;
        }
        u2(i, kVar);
        LayoutState layoutState = this.t0;
        int i2 = i2(r0Var, layoutState, kVar);
        if (layoutState.b >= i2) {
            i = i < 0 ? -i2 : i2;
        }
        ((d0) this.e0.a.getValue()).p(-i);
        this.m0 = this.h0;
        layoutState.b = 0;
        v2(r0Var, layoutState);
        return i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gki0
    public final int b() {
        View k2 = this.h0 ? k2(true) : j2(true);
        if (k2 != null) {
            return ((RecyclerView.LayoutParams) k2.getLayoutParams()).getViewLayoutPosition();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c2(boolean z) {
        H(null);
        SavedState savedState = this.o0;
        if (savedState != null && savedState.getIsReverseLayout() != z) {
            savedState.setReverseLayout(z);
        }
        this.g0 = z;
        i1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.u0
    public final PointF d(int i) {
        LayoutState.LayoutDirection h2 = h2(i);
        PointF pointF = new PointF();
        if (this.J == 0) {
            pointF.x = h2.getVector();
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = h2.getVector();
        return pointF;
    }

    public final LayoutState.LayoutDirection h2(int i) {
        if (d0() == 0) {
            return this.h0 ? LayoutState.LayoutDirection.END : LayoutState.LayoutDirection.START;
        }
        return (i < n2()) != this.h0 ? LayoutState.LayoutDirection.START : LayoutState.LayoutDirection.END;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022e A[LOOP:2: B:59:0x022c->B:60:0x022e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0248 A[LOOP:3: B:63:0x0242->B:65:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i2(r0 r0Var, LayoutState layoutState, RecyclerView.k kVar) {
        b[] bVarArr;
        Integer num;
        Integer num2;
        Integer num3;
        Integer valueOf;
        Integer num4;
        int i;
        int i2;
        Triple triple;
        int i3;
        b[] bVarArr2;
        int length;
        boolean booleanValue;
        int length2;
        int i4;
        Iterator it;
        LayoutState.LayoutDirection layoutDirection;
        boolean z;
        LayoutParams layoutParams;
        boolean isFullSpan;
        boolean z2;
        boolean isFullSpan2;
        nnr nnrVar;
        LazySpanLookup lazySpanLookup;
        b bVar;
        int i5;
        int q2;
        int c;
        LazySpanLookup lazySpanLookup2;
        int i6;
        d0 d0Var;
        int i7;
        LayoutState.LayoutDirection layoutDirection2;
        LayoutState.LayoutDirection layoutDirection3;
        d0 d0Var2;
        int c2;
        int i8;
        nnr nnrVar2;
        LayoutState layoutState2;
        int i9;
        LazySpanLookup.FullSpanItem b;
        FlexibleGridLayoutManager flexibleGridLayoutManager = this;
        r0 r0Var2 = r0Var;
        BitSet bitSet = flexibleGridLayoutManager.i0;
        int i10 = flexibleGridLayoutManager.b0;
        int i11 = 1;
        bitSet.set(0, i10, true);
        LayoutState layoutState3 = flexibleGridLayoutManager.t0;
        int i12 = layoutState3.i ? layoutState.e == LayoutState.LayoutDirection.END ? Integer.MAX_VALUE : Integer.MIN_VALUE : layoutState.e == LayoutState.LayoutDirection.END ? layoutState.g + layoutState.b : layoutState.f - layoutState.b;
        flexibleGridLayoutManager.A2(i12, layoutState.e);
        nnr nnrVar3 = flexibleGridLayoutManager.e0;
        d0 d0Var3 = (d0) nnrVar3.a.getValue();
        int g = flexibleGridLayoutManager.h0 ? d0Var3.g() : d0Var3.k();
        boolean z3 = false;
        while (true) {
            boolean a = layoutState.a(kVar);
            bVarArr = flexibleGridLayoutManager.c0;
            if (!a || (!layoutState3.i && bitSet.isEmpty())) {
                break;
            }
            View b2 = layoutState.b(r0Var2);
            LayoutParams layoutParams2 = (LayoutParams) b2.getLayoutParams();
            int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
            int viewLayoutPosition2 = layoutParams2.getViewLayoutPosition();
            int i13 = i11;
            jln jlnVar = flexibleGridLayoutManager.d0;
            Integer num5 = null;
            BitSet bitSet2 = bitSet;
            if (jlnVar != null) {
                amt0 amt0Var = (amt0) jlnVar.b;
                num = Integer.valueOf(amt0Var.b(viewLayoutPosition, amt0Var.e));
            } else {
                num = null;
            }
            if (num != null) {
                int length3 = bVarArr.length - 1;
                num2 = num;
                int intValue = num2.intValue();
                if (intValue >= 0 && intValue <= length3) {
                    num3 = num2;
                    valueOf = jlnVar == null ? Integer.valueOf(((amt0) jlnVar.b).c(viewLayoutPosition2)) : null;
                    if (valueOf == null) {
                        int intValue2 = valueOf.intValue();
                        num4 = num3;
                        if (i13 <= intValue2 && intValue2 <= i10) {
                            num5 = Integer.valueOf(intValue2);
                        }
                    } else {
                        num4 = num3;
                    }
                    if (num4 != null || num5 == null) {
                        i = -1;
                        if (layoutParams2.getIsFullSpan()) {
                            d0 d0Var4 = (d0) nnrVar3.a.getValue();
                            if (flexibleGridLayoutManager.t2(layoutState.e)) {
                                i2 = viewLayoutPosition2;
                                triple = new Triple(Integer.valueOf(i10 - 1), -1, -1);
                                i3 = i12;
                            } else {
                                i2 = viewLayoutPosition2;
                                i3 = i12;
                                triple = new Triple(0, Integer.valueOf(i10), 1);
                            }
                            int intValue3 = ((Number) triple.getFirst()).intValue();
                            int intValue4 = ((Number) triple.getSecond()).intValue();
                            int intValue5 = ((Number) triple.getThird()).intValue();
                            b bVar2 = bVarArr[intValue3];
                            if (layoutState.e == LayoutState.LayoutDirection.END) {
                                int k = d0Var4.k();
                                int i14 = intValue3;
                                int i15 = Integer.MAX_VALUE;
                                while (i14 != intValue4) {
                                    int i16 = i14;
                                    b bVar3 = bVarArr[i16];
                                    b bVar4 = bVar2;
                                    int h = bVar3.h(Integer.valueOf(k));
                                    if (h < i15) {
                                        i15 = h;
                                        bVar2 = bVar3;
                                    } else {
                                        bVar2 = bVar4;
                                    }
                                    i14 = i16 + intValue5;
                                }
                            } else {
                                int g2 = d0Var4.g();
                                int i17 = Integer.MIN_VALUE;
                                int i18 = intValue3;
                                while (i18 != intValue4) {
                                    int i19 = i18;
                                    b bVar5 = bVarArr[i19];
                                    int i20 = intValue4;
                                    int j = bVar5.j(Integer.valueOf(g2));
                                    if (j > i17) {
                                        bVar2 = bVar5;
                                        i17 = j;
                                    }
                                    i18 = i19 + intValue5;
                                    intValue4 = i20;
                                }
                            }
                            bVarArr2 = new b[]{bVar2};
                            LazySpanLookup lazySpanLookup3 = flexibleGridLayoutManager.l0;
                            lazySpanLookup3.getClass();
                            lazySpanLookup3.a((i2 + bVarArr2.length) - 1);
                            length = bVarArr2.length - 1;
                            LayoutState layoutState4 = layoutState3;
                            if (length >= 0) {
                                int i21 = 0;
                                while (true) {
                                    lazySpanLookup3.a[i2 + i21] = bVarArr2[i21].a;
                                    if (i21 == length) {
                                        break;
                                    }
                                    i21++;
                                }
                            }
                            Pair pair = new Pair(bVarArr2, Boolean.TRUE);
                            b[] bVarArr3 = (b[]) pair.getFirst();
                            booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                            ArrayList arrayList = new ArrayList(bVarArr3.length);
                            length2 = bVarArr3.length;
                            i4 = 0;
                            while (i4 < length2) {
                                int i22 = i4;
                                arrayList.add(Integer.valueOf(bVarArr3[i22].a));
                                i4 = i22 + 1;
                            }
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((Number) it.next()).intValue();
                            }
                            b bVar6 = bVarArr3[0];
                            layoutParams2.setSpan(bVar6);
                            layoutParams2.setSpanCount(Integer.valueOf(bVarArr3.length));
                            LayoutState.LayoutDirection layoutDirection4 = layoutState.e;
                            layoutDirection = LayoutState.LayoutDirection.END;
                            z = layoutDirection4 != layoutDirection;
                            if (jlnVar == null) {
                                amt0 amt0Var2 = (amt0) jlnVar.b;
                                layoutParams = layoutParams2;
                                isFullSpan = amt0Var2.c(viewLayoutPosition) == amt0Var2.e;
                            } else {
                                layoutParams = layoutParams2;
                                isFullSpan = layoutParams.getIsFullSpan();
                            }
                            z2 = isFullSpan;
                            if (z) {
                                flexibleGridLayoutManager.G(0, b2, false);
                            } else {
                                flexibleGridLayoutManager.F(b2);
                            }
                            int length4 = bVarArr3.length * flexibleGridLayoutManager.f0;
                            LayoutParams layoutParams3 = (LayoutParams) b2.getLayoutParams();
                            isFullSpan2 = layoutParams3.getIsFullSpan();
                            int i23 = flexibleGridLayoutManager.J;
                            if (isFullSpan2) {
                                nnrVar = nnrVar3;
                                lazySpanLookup = lazySpanLookup3;
                                bVar = bVar6;
                                if (i23 == 1) {
                                    flexibleGridLayoutManager.s2(RecyclerView.e.e0(length4, flexibleGridLayoutManager.F, 0, ((ViewGroup.MarginLayoutParams) layoutParams3).width, false), RecyclerView.e.e0(flexibleGridLayoutManager.I, flexibleGridLayoutManager.G, flexibleGridLayoutManager.getPaddingBottom() + flexibleGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams3).height, true), b2);
                                } else {
                                    i5 = viewLayoutPosition;
                                    flexibleGridLayoutManager.s2(RecyclerView.e.e0(flexibleGridLayoutManager.H, flexibleGridLayoutManager.F, flexibleGridLayoutManager.getPaddingRight() + flexibleGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams3).width, true), RecyclerView.e.e0(length4, flexibleGridLayoutManager.G, 0, ((ViewGroup.MarginLayoutParams) layoutParams3).height, false), b2);
                                    if (layoutState.e == layoutDirection) {
                                        c = z2 ? p2(bVarArr, g) : p2(bVarArr3, g);
                                        q2 = d0Var3.c(b2) + c;
                                    } else {
                                        q2 = z2 ? q2(bVarArr, g) : q2(bVarArr3, g);
                                        c = q2 - d0Var3.c(b2);
                                    }
                                    Pair pair2 = new Pair(Integer.valueOf(c), Integer.valueOf(q2));
                                    if (!booleanValue && z2) {
                                        LayoutState.LayoutDirection layoutDirection5 = layoutState.e;
                                        int intValue6 = layoutDirection5 == layoutDirection ? ((Number) pair2.c()).intValue() : ((Number) pair2.f()).intValue();
                                        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
                                        fullSpanItem.setGapPerSpan(new int[i10]);
                                        for (int i24 = 0; i24 < i10; i24++) {
                                            fullSpanItem.getGapPerSpan()[i24] = intValue6 - bVarArr[i24].h(Integer.valueOf(intValue6));
                                        }
                                        fullSpanItem.setGapDirection$flexible_layout_managers(layoutDirection5);
                                        i6 = i5;
                                        fullSpanItem.setPosition(i6);
                                        if (fullSpanItem.getGapDirection() != LayoutState.LayoutDirection.START) {
                                            lazySpanLookup2 = lazySpanLookup;
                                            List list = lazySpanLookup2.b;
                                            if (list == null) {
                                                list = new ArrayList();
                                            }
                                            int size = list.size();
                                            int i25 = 0;
                                            while (true) {
                                                if (i25 >= size) {
                                                    d0Var = d0Var3;
                                                    i7 = g;
                                                    list.add(fullSpanItem);
                                                    lazySpanLookup2.b = list;
                                                    break;
                                                }
                                                LazySpanLookup.FullSpanItem fullSpanItem2 = (LazySpanLookup.FullSpanItem) list.get(i25);
                                                d0Var = d0Var3;
                                                i7 = g;
                                                if (fullSpanItem2.getPosition() == fullSpanItem.getPosition()) {
                                                    list.remove(i25);
                                                }
                                                if (fullSpanItem2.getPosition() >= fullSpanItem.getPosition()) {
                                                    list.add(i25, fullSpanItem);
                                                    lazySpanLookup2.b = list;
                                                    break;
                                                }
                                                i25++;
                                                d0Var3 = d0Var;
                                                g = i7;
                                            }
                                        } else {
                                            i7 = g;
                                            lazySpanLookup2 = lazySpanLookup;
                                            d0Var = d0Var3;
                                        }
                                    } else {
                                        lazySpanLookup2 = lazySpanLookup;
                                        i6 = i5;
                                        d0Var = d0Var3;
                                        i7 = g;
                                    }
                                    if (layoutParams.getIsFullSpan() && layoutState.d == LayoutState.ItemDirection.HEAD && !booleanValue) {
                                        if (layoutState.e != LayoutState.LayoutDirection.END) {
                                            int h2 = bVarArr[0].h(Integer.MIN_VALUE);
                                            for (int i26 = 1; i26 < i10; i26++) {
                                                if (bVarArr[i26].h(Integer.MIN_VALUE) != h2) {
                                                    b = lazySpanLookup2.b(i6);
                                                    if (b != null) {
                                                        b.setHasUnwantedGapAfter(true);
                                                    }
                                                }
                                            }
                                        } else {
                                            int j2 = bVarArr[0].j(Integer.MIN_VALUE);
                                            for (int i27 = 1; i27 < i10; i27++) {
                                                if (bVarArr[i27].j(Integer.MIN_VALUE) != j2) {
                                                    b = lazySpanLookup2.b(i6);
                                                    if (b != null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    layoutDirection2 = layoutState.e;
                                    layoutDirection3 = LayoutState.LayoutDirection.END;
                                    List list2 = EmptyList.a;
                                    if (layoutDirection2 == layoutDirection3) {
                                        if (z2) {
                                            LayoutParams layoutParams4 = (LayoutParams) b2.getLayoutParams();
                                            layoutParams4.setSpan(bVarArr[0]);
                                            layoutParams4.setSpanCount(Integer.valueOf(i10));
                                            int i28 = i10 - 1;
                                            for (int i29 = i; i29 < i28; i29 = -1) {
                                                bVarArr[i28].a(b2);
                                                i28--;
                                            }
                                        } else {
                                            if (bVarArr3.length != 0) {
                                                list2 = new ArrayList(new n43(bVarArr3, false));
                                                Collections.reverse(list2);
                                            }
                                            Iterator it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                ((b) it2.next()).a(b2);
                                            }
                                        }
                                    } else if (z2) {
                                        LayoutParams layoutParams5 = (LayoutParams) b2.getLayoutParams();
                                        layoutParams5.setSpan(bVarArr[0]);
                                        layoutParams5.setSpanCount(Integer.valueOf(i10));
                                        for (int i30 = i10 - 1; -1 < i30; i30--) {
                                            bVarArr[i30].m(b2);
                                        }
                                    } else {
                                        if (bVarArr3.length != 0) {
                                            list2 = new ArrayList(new n43(bVarArr3, false));
                                            Collections.reverse(list2);
                                        }
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            ((b) it3.next()).m(b2);
                                        }
                                    }
                                    int intValue7 = ((Number) pair2.getFirst()).intValue();
                                    int intValue8 = ((Number) pair2.getSecond()).intValue();
                                    nnr nnrVar4 = nnrVar;
                                    d0Var2 = (d0) nnrVar4.b.getValue();
                                    if (flexibleGridLayoutManager.U1() || flexibleGridLayoutManager.J != 1) {
                                        int k2 = z2 ? d0Var2.k() : d0Var2.k() + (bVar.a * flexibleGridLayoutManager.f0);
                                        int i31 = k2;
                                        c2 = d0Var2.c(b2) + k2;
                                        i8 = i31;
                                    } else {
                                        c2 = z2 ? d0Var2.g() : d0Var2.g() - (((i10 - 1) - bVar.a) * flexibleGridLayoutManager.f0);
                                        i8 = c2 - d0Var2.c(b2);
                                    }
                                    i11 = 1;
                                    if (flexibleGridLayoutManager.J == 1) {
                                        nnrVar2 = nnrVar4;
                                        flexibleGridLayoutManager.C0(i8, intValue7, c2, intValue8, b2);
                                        flexibleGridLayoutManager = this;
                                    } else {
                                        nnrVar2 = nnrVar4;
                                        flexibleGridLayoutManager.C0(intValue7, i8, intValue8, c2, b2);
                                    }
                                    if (z2) {
                                        layoutState2 = layoutState4;
                                        i9 = i3;
                                        flexibleGridLayoutManager.A2(i9, layoutState2.e);
                                    } else {
                                        layoutState2 = layoutState4;
                                        i9 = i3;
                                        for (b bVar7 : bVarArr3) {
                                            flexibleGridLayoutManager.C2(bVar7, layoutState2.e, i9);
                                        }
                                    }
                                    flexibleGridLayoutManager.v2(r0Var, layoutState2);
                                    if (layoutState2.h && b2.hasFocusable()) {
                                        if (z2) {
                                            for (b bVar8 : bVarArr3) {
                                                bitSet2.set(bVar8.a, false);
                                            }
                                        } else {
                                            bitSet2.clear();
                                        }
                                    }
                                    layoutState3 = layoutState2;
                                    r0Var2 = r0Var;
                                    bitSet = bitSet2;
                                    z3 = true;
                                    i12 = i9;
                                    d0Var3 = d0Var;
                                    g = i7;
                                    nnrVar3 = nnrVar2;
                                }
                            } else {
                                bVar = bVar6;
                                if (i23 == 1) {
                                    nnrVar = nnrVar3;
                                    lazySpanLookup = lazySpanLookup3;
                                    flexibleGridLayoutManager.s2(flexibleGridLayoutManager.p0, RecyclerView.e.e0(flexibleGridLayoutManager.I, flexibleGridLayoutManager.G, flexibleGridLayoutManager.getPaddingBottom() + flexibleGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams3).height, true), b2);
                                } else {
                                    nnrVar = nnrVar3;
                                    lazySpanLookup = lazySpanLookup3;
                                    flexibleGridLayoutManager.s2(RecyclerView.e.e0(flexibleGridLayoutManager.H, flexibleGridLayoutManager.F, flexibleGridLayoutManager.getPaddingRight() + flexibleGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams3).width, true), flexibleGridLayoutManager.p0, b2);
                                }
                            }
                            i5 = viewLayoutPosition;
                            if (layoutState.e == layoutDirection) {
                            }
                            Pair pair22 = new Pair(Integer.valueOf(c), Integer.valueOf(q2));
                            if (!booleanValue) {
                            }
                            lazySpanLookup2 = lazySpanLookup;
                            i6 = i5;
                            d0Var = d0Var3;
                            i7 = g;
                            if (layoutParams.getIsFullSpan()) {
                                if (layoutState.e != LayoutState.LayoutDirection.END) {
                                }
                            }
                            layoutDirection2 = layoutState.e;
                            layoutDirection3 = LayoutState.LayoutDirection.END;
                            List list22 = EmptyList.a;
                            if (layoutDirection2 == layoutDirection3) {
                            }
                            int intValue72 = ((Number) pair22.getFirst()).intValue();
                            int intValue82 = ((Number) pair22.getSecond()).intValue();
                            nnr nnrVar42 = nnrVar;
                            d0Var2 = (d0) nnrVar42.b.getValue();
                            if (flexibleGridLayoutManager.U1()) {
                            }
                            if (z2) {
                            }
                            int i312 = k2;
                            c2 = d0Var2.c(b2) + k2;
                            i8 = i312;
                            i11 = 1;
                            if (flexibleGridLayoutManager.J == 1) {
                            }
                            if (z2) {
                            }
                            flexibleGridLayoutManager.v2(r0Var, layoutState2);
                            if (layoutState2.h) {
                                if (z2) {
                                }
                            }
                            layoutState3 = layoutState2;
                            r0Var2 = r0Var;
                            bitSet = bitSet2;
                            z3 = true;
                            i12 = i9;
                            d0Var3 = d0Var;
                            g = i7;
                            nnrVar3 = nnrVar2;
                        } else {
                            bVarArr2 = new b[]{bVarArr[0]};
                        }
                    } else {
                        i = -1;
                        d6w n = y6i0.n(num4.intValue(), num5.intValue() + num4.intValue());
                        bVarArr2 = (b[]) (n.isEmpty() ? f73.n(0, 0, bVarArr) : f73.n(n.a, n.b + 1, bVarArr));
                    }
                    i2 = viewLayoutPosition2;
                    i3 = i12;
                    LazySpanLookup lazySpanLookup32 = flexibleGridLayoutManager.l0;
                    lazySpanLookup32.getClass();
                    lazySpanLookup32.a((i2 + bVarArr2.length) - 1);
                    length = bVarArr2.length - 1;
                    LayoutState layoutState42 = layoutState3;
                    if (length >= 0) {
                    }
                    Pair pair3 = new Pair(bVarArr2, Boolean.TRUE);
                    b[] bVarArr32 = (b[]) pair3.getFirst();
                    booleanValue = ((Boolean) pair3.getSecond()).booleanValue();
                    ArrayList arrayList2 = new ArrayList(bVarArr32.length);
                    length2 = bVarArr32.length;
                    i4 = 0;
                    while (i4 < length2) {
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    b bVar62 = bVarArr32[0];
                    layoutParams2.setSpan(bVar62);
                    layoutParams2.setSpanCount(Integer.valueOf(bVarArr32.length));
                    LayoutState.LayoutDirection layoutDirection42 = layoutState.e;
                    layoutDirection = LayoutState.LayoutDirection.END;
                    if (layoutDirection42 != layoutDirection) {
                    }
                    if (jlnVar == null) {
                    }
                    z2 = isFullSpan;
                    if (z) {
                    }
                    int length42 = bVarArr32.length * flexibleGridLayoutManager.f0;
                    LayoutParams layoutParams32 = (LayoutParams) b2.getLayoutParams();
                    isFullSpan2 = layoutParams32.getIsFullSpan();
                    int i232 = flexibleGridLayoutManager.J;
                    if (isFullSpan2) {
                    }
                    i5 = viewLayoutPosition;
                    if (layoutState.e == layoutDirection) {
                    }
                    Pair pair222 = new Pair(Integer.valueOf(c), Integer.valueOf(q2));
                    if (!booleanValue) {
                    }
                    lazySpanLookup2 = lazySpanLookup;
                    i6 = i5;
                    d0Var = d0Var3;
                    i7 = g;
                    if (layoutParams.getIsFullSpan()) {
                    }
                    layoutDirection2 = layoutState.e;
                    layoutDirection3 = LayoutState.LayoutDirection.END;
                    List list222 = EmptyList.a;
                    if (layoutDirection2 == layoutDirection3) {
                    }
                    int intValue722 = ((Number) pair222.getFirst()).intValue();
                    int intValue822 = ((Number) pair222.getSecond()).intValue();
                    nnr nnrVar422 = nnrVar;
                    d0Var2 = (d0) nnrVar422.b.getValue();
                    if (flexibleGridLayoutManager.U1()) {
                    }
                    if (z2) {
                    }
                    int i3122 = k2;
                    c2 = d0Var2.c(b2) + k2;
                    i8 = i3122;
                    i11 = 1;
                    if (flexibleGridLayoutManager.J == 1) {
                    }
                    if (z2) {
                    }
                    flexibleGridLayoutManager.v2(r0Var, layoutState2);
                    if (layoutState2.h) {
                    }
                    layoutState3 = layoutState2;
                    r0Var2 = r0Var;
                    bitSet = bitSet2;
                    z3 = true;
                    i12 = i9;
                    d0Var3 = d0Var;
                    g = i7;
                    nnrVar3 = nnrVar2;
                }
            } else {
                num2 = num;
            }
            if (num2 != null) {
                int length5 = bVarArr.length;
            }
            num3 = null;
            if (jlnVar == null) {
            }
            if (valueOf == null) {
            }
            if (num4 != null) {
            }
            i = -1;
            if (layoutParams2.getIsFullSpan()) {
            }
        }
        d0 d0Var5 = d0Var3;
        r0 r0Var3 = r0Var2;
        LayoutState layoutState5 = layoutState3;
        if (!z3) {
            flexibleGridLayoutManager.v2(r0Var3, layoutState5);
        }
        int k3 = layoutState5.e == LayoutState.LayoutDirection.START ? d0Var5.k() - q2(bVarArr, d0Var5.k()) : p2(bVarArr, d0Var5.g()) - d0Var5.g();
        if (k3 > 0) {
            return Math.min(layoutState.b, k3);
        }
        return 0;
    }

    public final View j2(boolean z) {
        d0 d0Var = (d0) this.e0.a.getValue();
        int k = d0Var.k();
        int g = d0Var.g();
        View view = null;
        for (int d0 = d0() - 1; -1 < d0; d0--) {
            View c0 = c0(d0);
            int e = d0Var.e(c0);
            int b = d0Var.b(c0);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return c0;
                }
                if (view == null) {
                    view = c0;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int k1(int i, r0 r0Var, RecyclerView.k kVar) {
        return a2(i, r0Var, kVar);
    }

    public final View k2(boolean z) {
        d0 d0Var = (d0) this.e0.a.getValue();
        int k = d0Var.k();
        int g = d0Var.g();
        int d0 = d0();
        View view = null;
        for (int i = 0; i < d0; i++) {
            View c0 = c0(i);
            int e = d0Var.e(c0);
            if (d0Var.b(c0) > k && e < g) {
                if (e >= k || !z) {
                    return c0;
                }
                if (view == null) {
                    view = c0;
                }
            }
        }
        return view;
    }

    @Override // defpackage.j1u
    public final int l(int i) {
        int i2;
        jln jlnVar = this.d0;
        if (jlnVar != null) {
            amt0 amt0Var = (amt0) jlnVar.b;
            return amt0Var.b(i, amt0Var.e);
        }
        if (i < 0) {
            return 0;
        }
        int[] iArr = this.l0.a;
        if (i >= iArr.length || (i2 = iArr[i]) == -1) {
            return 0;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void l1(int i) {
        SavedState savedState = this.o0;
        if (savedState != null && savedState.getAnchorPosition() != i) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.j0 = i;
        this.k0 = Integer.MIN_VALUE;
        i1();
    }

    public final void l2(r0 r0Var, RecyclerView.k kVar, boolean z) {
        int p2 = p2(this.c0, Integer.MIN_VALUE);
        Integer valueOf = Integer.valueOf(p2);
        if (p2 == Integer.MIN_VALUE) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            nnr nnrVar = this.e0;
            int g = ((d0) nnrVar.a.getValue()).g() - intValue;
            if (g > 0) {
                int i = g - (-a2(-g, r0Var, kVar));
                if (!z || i <= 0) {
                    return;
                }
                ((d0) nnrVar.a.getValue()).p(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        return a2(i, r0Var, kVar);
    }

    public final void m2(r0 r0Var, RecyclerView.k kVar, boolean z) {
        int q2 = q2(this.c0, Integer.MAX_VALUE);
        Integer valueOf = Integer.valueOf(q2);
        if (q2 == Integer.MAX_VALUE) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            nnr nnrVar = this.e0;
            int k = intValue - ((d0) nnrVar.a.getValue()).k();
            if (k > 0) {
                int a2 = k - a2(k, r0Var, kVar);
                if (!z || a2 <= 0) {
                    return;
                }
                ((d0) nnrVar.a.getValue()).p(-a2);
            }
        }
    }

    public final int n2() {
        if (d0() == 0) {
            return 0;
        }
        View c0 = c0(0);
        if (c0 != null) {
            return ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
        }
        return -1;
    }

    @Override // defpackage.ylt0
    public final int o(int i) {
        int i2 = this.b0;
        jln jlnVar = this.d0;
        if (jlnVar != null) {
            amt0 amt0Var = (amt0) jlnVar.b;
            return amt0Var.c(i) == amt0Var.e ? i2 : amt0Var.c(i);
        }
        if (this.l0.b(i) != null) {
            return i2;
        }
        return 1;
    }

    public final int o2() {
        int d0 = d0();
        if (d0 == 0) {
            return 0;
        }
        View c0 = c0(d0 - 1);
        if (c0 != null) {
            return ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gki0
    public final void r(int i, int i2) {
        SavedState savedState = this.o0;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.j0 = i;
        this.k0 = i2;
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void r1(Rect rect, int i, int i2) {
        int L;
        int L2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.J == 1) {
            L2 = RecyclerView.e.L(i2, rect.height() + paddingBottom, p0());
            L = RecyclerView.e.L(i, (this.f0 * this.b0) + paddingRight, q0());
        } else {
            L = RecyclerView.e.L(i, rect.width() + paddingRight, q0());
            L2 = RecyclerView.e.L(i2, (this.f0 * this.b0) + paddingBottom, p0());
        }
        q1(L, L2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r2(int i, int i2, AdapterEvents adapterEvents) {
        int i3;
        int i4;
        int i5;
        int o2 = this.h0 ? o2() : n2();
        if (adapterEvents != AdapterEvents.MOVE) {
            i3 = i + i2;
        } else {
            if (i >= i2) {
                i3 = i + 1;
                i4 = i2;
                i5 = onr.a[adapterEvents.ordinal()];
                LazySpanLookup lazySpanLookup = this.l0;
                if (i5 != 1) {
                    lazySpanLookup.c(i, i2);
                } else if (i5 == 2) {
                    lazySpanLookup.d(i, i2);
                } else if (i5 == 3) {
                    lazySpanLookup.d(i, 1);
                    lazySpanLookup.c(i2, 1);
                } else if (i5 != 4) {
                    w511.b();
                    return;
                }
                if (i3 > o2) {
                    return;
                }
                if (i4 <= (this.h0 ? n2() : o2())) {
                    i1();
                    return;
                }
                return;
            }
            i3 = i2 + 1;
        }
        i4 = i;
        i5 = onr.a[adapterEvents.ordinal()];
        LazySpanLookup lazySpanLookup2 = this.l0;
        if (i5 != 1) {
        }
        if (i3 > o2) {
        }
    }

    public final void s2(int i, int i2, View view) {
        Rect rect = this.q0;
        super.m(view, rect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int D2 = D2(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int D22 = D2(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (qnr.b(this, view, D2, D22, layoutParams)) {
            view.measure(D2, D22);
        }
    }

    public final boolean t2(LayoutState.LayoutDirection layoutDirection) {
        if (this.J == 0) {
            return (layoutDirection == LayoutState.LayoutDirection.START) != this.h0;
        }
        return ((layoutDirection == LayoutState.LayoutDirection.START) == this.h0) == U1();
    }

    @Override // defpackage.j1u
    public final int u(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int o = o(i4);
            i3 += o;
            int i5 = this.b0;
            if (i3 >= i5) {
                i2++;
                if (i3 == i5) {
                    o = 0;
                }
                i3 = o;
            }
        }
        return i2;
    }

    public final void u2(int i, RecyclerView.k kVar) {
        LayoutState.LayoutDirection layoutDirection;
        int n2;
        if (i > 0) {
            layoutDirection = LayoutState.LayoutDirection.END;
            n2 = o2();
        } else {
            layoutDirection = LayoutState.LayoutDirection.START;
            n2 = n2();
        }
        LayoutState layoutState = this.t0;
        layoutState.a = true;
        B2(n2, kVar);
        z2(layoutDirection);
        layoutState.c = layoutState.d.getVector() + n2;
        layoutState.b = Math.abs(i);
    }

    public final void v2(r0 r0Var, LayoutState layoutState) {
        if (!layoutState.a || layoutState.i) {
            return;
        }
        int i = layoutState.b;
        LayoutState.LayoutDirection layoutDirection = layoutState.e;
        if (i == 0) {
            if (layoutDirection == LayoutState.LayoutDirection.START) {
                w2(r0Var, layoutState.g);
                return;
            } else {
                x2(r0Var, layoutState.f);
                return;
            }
        }
        LayoutState.LayoutDirection layoutDirection2 = LayoutState.LayoutDirection.START;
        int i2 = 1;
        b[] bVarArr = this.c0;
        if (layoutDirection == layoutDirection2) {
            int i3 = layoutState.f;
            int j = bVarArr[0].j(Integer.valueOf(i3));
            int length = bVarArr.length;
            while (i2 < length) {
                int j2 = bVarArr[i2].j(Integer.valueOf(i3));
                if (j2 > j) {
                    j = j2;
                }
                i2++;
            }
            int i4 = layoutState.f - j;
            int i5 = layoutState.g;
            if (i4 >= 0) {
                i5 -= Math.min(i4, layoutState.b);
            }
            w2(r0Var, i5);
            return;
        }
        int i6 = layoutState.g;
        int h = bVarArr[0].h(Integer.valueOf(i6));
        int length2 = bVarArr.length;
        while (i2 < length2) {
            int h2 = bVarArr[i2].h(Integer.valueOf(i6));
            if (h2 < h) {
                h = h2;
            }
            i2++;
        }
        int i7 = h - layoutState.g;
        int i8 = layoutState.f;
        if (i7 >= 0) {
            i8 += Math.min(i7, layoutState.b);
        }
        x2(r0Var, i8);
    }

    @Override // defpackage.mhp0
    public final void w(boolean z) {
        this.u0 = z;
    }

    public final void w2(r0 r0Var, int i) {
        for (int d0 = d0() - 1; d0 >= 0; d0--) {
            View c0 = c0(d0);
            if (c0 == null) {
                return;
            }
            d0 d0Var = (d0) this.e0.a.getValue();
            if (d0Var.e(c0) < i || d0Var.o(c0) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) c0.getLayoutParams();
            boolean isFullSpan = layoutParams.getIsFullSpan();
            b[] bVarArr = this.c0;
            if (isFullSpan) {
                int i2 = 0;
                while (true) {
                    int i3 = this.b0;
                    if (i2 >= i3) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            bVarArr[i4].k();
                        }
                    } else if (bVarArr[i2].b.size() == 1) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else {
                b span = layoutParams.getSpan();
                Integer valueOf = span != null ? Integer.valueOf(span.a) : null;
                Integer spanCount = layoutParams.getSpanCount();
                if (valueOf != null && spanCount != null) {
                    int intValue = spanCount.intValue() + valueOf.intValue();
                    for (int intValue2 = valueOf.intValue(); intValue2 < intValue; intValue2++) {
                        if (bVarArr[intValue2].b.size() == 1) {
                            return;
                        }
                    }
                    for (int intValue3 = valueOf.intValue(); intValue3 < intValue; intValue3++) {
                        bVarArr[intValue3].k();
                    }
                }
            }
            e1(c0, r0Var);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        w wVar = new w(recyclerView.getContext());
        wVar.a = i;
        v(wVar);
    }

    public final void x2(r0 r0Var, int i) {
        while (d0() > 0) {
            View c0 = c0(0);
            if (c0 == null) {
                return;
            }
            d0 d0Var = (d0) this.e0.a.getValue();
            if (d0Var.b(c0) > i || d0Var.n(c0) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) c0.getLayoutParams();
            boolean isFullSpan = layoutParams.getIsFullSpan();
            b[] bVarArr = this.c0;
            if (isFullSpan) {
                int i2 = 0;
                while (true) {
                    int i3 = this.b0;
                    if (i2 >= i3) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            bVarArr[i4].l();
                        }
                    } else if (bVarArr[i2].b.size() == 1) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else {
                b span = layoutParams.getSpan();
                Integer valueOf = span != null ? Integer.valueOf(span.a) : null;
                Integer spanCount = layoutParams.getSpanCount();
                if (valueOf != null && spanCount != null) {
                    int intValue = spanCount.intValue() + valueOf.intValue();
                    for (int intValue2 = valueOf.intValue(); intValue2 < intValue; intValue2++) {
                        if (bVarArr[intValue2].b.size() == 1) {
                            return;
                        }
                    }
                    for (int intValue3 = valueOf.intValue(); intValue3 < intValue; intValue3++) {
                        bVarArr[intValue3].l();
                    }
                }
            }
            e1(c0, r0Var);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final boolean y1() {
        return this.o0 == null;
    }

    public final void y2() {
        boolean z = true;
        if (this.J == 1 || !U1()) {
            z = this.g0;
        } else if (this.g0) {
            z = false;
        }
        this.h0 = z;
    }

    @Override // defpackage.ylt0
    /* renamed from: z, reason: from getter */
    public final int getB0() {
        return this.b0;
    }

    public final void z2(LayoutState.LayoutDirection layoutDirection) {
        LayoutState layoutState = this.t0;
        layoutState.e = layoutDirection;
        layoutState.d = this.h0 == (layoutDirection == LayoutState.LayoutDirection.START) ? LayoutState.ItemDirection.TAIL : LayoutState.ItemDirection.HEAD;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 ?2\u00020\u0001:\u0001?B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0017R\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0017R\"\u0010(\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R*\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00105\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010<\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00105\u001a\u0004\b=\u00106\"\u0004\b>\u00108¨\u0006@"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$SavedState;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "args", "(Landroid/os/Parcel;)V", "other", "(Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$SavedState;)V", "Lzy11;", "invalidateSpanInfo", "invalidateAnchorPositionInfo", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "anchorPosition", CA20Status.STATUS_USER_I, "getAnchorPosition", "setAnchorPosition", "(I)V", "visibleAnchorPosition", "getVisibleAnchorPosition", "setVisibleAnchorPosition", "spanOffsetsSize", "getSpanOffsetsSize", "setSpanOffsetsSize", "", "spanOffsets", "[I", "getSpanOffsets", "()[I", "setSpanOffsets", "([I)V", "spanLookupSize", "getSpanLookupSize", "setSpanLookupSize", "spanLookup", "getSpanLookup", "setSpanLookup", "", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$LazySpanLookup$FullSpanItem;", "fullSpanItems", "Ljava/util/List;", "getFullSpanItems", "()Ljava/util/List;", "setFullSpanItems", "(Ljava/util/List;)V", "", "isReverseLayout", "Z", "()Z", "setReverseLayout", "(Z)V", "anchorLayoutIsFromEnd", "getAnchorLayoutIsFromEnd", "setAnchorLayoutIsFromEnd", "lastLayoutIsRTL", "getLastLayoutIsRTL", "setLastLayoutIsRTL", "CREATOR", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private boolean anchorLayoutIsFromEnd;
        private int anchorPosition;
        private List<LazySpanLookup.FullSpanItem> fullSpanItems;
        private boolean isReverseLayout;
        private boolean lastLayoutIsRTL;
        private int[] spanLookup;
        private int spanLookupSize;
        private int[] spanOffsets;
        private int spanOffsetsSize;
        private int visibleAnchorPosition;

        public SavedState(Parcel parcel) {
            this.spanOffsets = new int[0];
            this.spanLookup = new int[0];
            this.anchorPosition = parcel.readInt();
            this.visibleAnchorPosition = parcel.readInt();
            int readInt = parcel.readInt();
            this.spanOffsetsSize = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.spanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.spanLookupSize = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.spanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.isReverseLayout = parcel.readInt() == 1;
            this.anchorLayoutIsFromEnd = parcel.readInt() == 1;
            this.lastLayoutIsRTL = parcel.readInt() == 1;
            this.fullSpanItems = parcel.createTypedArrayList(LazySpanLookup.FullSpanItem.INSTANCE);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean getAnchorLayoutIsFromEnd() {
            return this.anchorLayoutIsFromEnd;
        }

        public final int getAnchorPosition() {
            return this.anchorPosition;
        }

        public final List<LazySpanLookup.FullSpanItem> getFullSpanItems() {
            return this.fullSpanItems;
        }

        public final boolean getLastLayoutIsRTL() {
            return this.lastLayoutIsRTL;
        }

        public final int[] getSpanLookup() {
            return this.spanLookup;
        }

        public final int getSpanLookupSize() {
            return this.spanLookupSize;
        }

        public final int[] getSpanOffsets() {
            return this.spanOffsets;
        }

        public final int getSpanOffsetsSize() {
            return this.spanOffsetsSize;
        }

        public final int getVisibleAnchorPosition() {
            return this.visibleAnchorPosition;
        }

        public final void invalidateAnchorPositionInfo() {
            this.spanOffsets = new int[0];
            this.spanOffsetsSize = 0;
            this.anchorPosition = -1;
            this.visibleAnchorPosition = -1;
        }

        public final void invalidateSpanInfo() {
            this.spanOffsets = new int[0];
            this.spanOffsetsSize = 0;
            this.spanLookupSize = 0;
            this.spanLookup = new int[0];
            this.fullSpanItems = null;
        }

        /* renamed from: isReverseLayout, reason: from getter */
        public final boolean getIsReverseLayout() {
            return this.isReverseLayout;
        }

        public final void setAnchorLayoutIsFromEnd(boolean z) {
            this.anchorLayoutIsFromEnd = z;
        }

        public final void setAnchorPosition(int i) {
            this.anchorPosition = i;
        }

        public final void setFullSpanItems(List<LazySpanLookup.FullSpanItem> list) {
            this.fullSpanItems = list;
        }

        public final void setLastLayoutIsRTL(boolean z) {
            this.lastLayoutIsRTL = z;
        }

        public final void setReverseLayout(boolean z) {
            this.isReverseLayout = z;
        }

        public final void setSpanLookup(int[] iArr) {
            this.spanLookup = iArr;
        }

        public final void setSpanLookupSize(int i) {
            this.spanLookupSize = i;
        }

        public final void setSpanOffsets(int[] iArr) {
            this.spanOffsets = iArr;
        }

        public final void setSpanOffsetsSize(int i) {
            this.spanOffsetsSize = i;
        }

        public final void setVisibleAnchorPosition(int i) {
            this.visibleAnchorPosition = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.anchorPosition);
            dest.writeInt(this.visibleAnchorPosition);
            dest.writeInt(this.spanOffsetsSize);
            if (this.spanOffsetsSize > 0) {
                dest.writeIntArray(this.spanOffsets);
            }
            dest.writeInt(this.spanLookupSize);
            if (this.spanLookupSize > 0) {
                dest.writeIntArray(this.spanLookup);
            }
            dest.writeInt(this.isReverseLayout ? 1 : 0);
            dest.writeInt(this.anchorLayoutIsFromEnd ? 1 : 0);
            dest.writeInt(this.lastLayoutIsRTL ? 1 : 0);
            dest.writeList(this.fullSpanItems);
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$SavedState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$SavedState;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$SavedState;", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.yandex.go.flex.screens.common.flexible.layout.manager.FlexibleGridLayoutManager$SavedState$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        public SavedState() {
            this.spanOffsets = new int[0];
            this.spanLookup = new int[0];
        }

        public SavedState(SavedState savedState) {
            this.spanOffsets = new int[0];
            this.spanLookup = new int[0];
            this.spanOffsetsSize = savedState.spanOffsetsSize;
            this.anchorPosition = savedState.anchorPosition;
            this.visibleAnchorPosition = savedState.visibleAnchorPosition;
            this.spanOffsets = savedState.spanOffsets;
            this.spanLookupSize = savedState.spanLookupSize;
            this.spanLookup = savedState.spanLookup;
            this.isReverseLayout = savedState.isReverseLayout;
            this.anchorLayoutIsFromEnd = savedState.anchorLayoutIsFromEnd;
            this.lastLayoutIsRTL = savedState.lastLayoutIsRTL;
            this.fullSpanItems = savedState.fullSpanItems;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001'B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bB\u0013\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eB\u0013\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0010B\u0013\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0011R(\u0010\u0014\u001a\b\u0018\u00010\u0012R\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager$LayoutParams;", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "width", "height", "(II)V", "Landroid/view/ViewGroup$MarginLayoutParams;", "source", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/b;", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/FlexibleGridLayoutManager;", "span", "Lcom/yandex/go/flex/screens/common/flexible/layout/manager/b;", "getSpan", "()Lcom/yandex/go/flex/screens/common/flexible/layout/manager/b;", "setSpan", "(Lcom/yandex/go/flex/screens/common/flexible/layout/manager/b;)V", "spanCount", "Ljava/lang/Integer;", "getSpanCount", "()Ljava/lang/Integer;", "setSpanCount", "(Ljava/lang/Integer;)V", "", "isFullSpan", "Z", "()Z", "setFullSpan", "(Z)V", "Companion", "com/yandex/go/flex/screens/common/flexible/layout/manager/a", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LayoutParams extends RecyclerView.LayoutParams {
        public static final a Companion = new a();
        public static final int INVALID_SPAN_ID = -1;
        private boolean isFullSpan;
        private b span;
        private Integer spanCount;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final b getSpan() {
            return this.span;
        }

        public final Integer getSpanCount() {
            return this.spanCount;
        }

        /* renamed from: isFullSpan, reason: from getter */
        public final boolean getIsFullSpan() {
            return this.isFullSpan;
        }

        public final void setFullSpan(boolean z) {
            this.isFullSpan = z;
        }

        public final void setSpan(b bVar) {
            this.span = bVar;
        }

        public final void setSpanCount(Integer num) {
            this.spanCount = num;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
