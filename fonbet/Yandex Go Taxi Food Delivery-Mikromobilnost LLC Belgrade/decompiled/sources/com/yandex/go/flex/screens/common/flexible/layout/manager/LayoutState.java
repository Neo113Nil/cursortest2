package com.yandex.go.flex.screens.common.flexible.layout.manager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import defpackage.b64;
import defpackage.evu0;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes.dex */
public final class LayoutState {
    public int b;
    public int c;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public ItemDirection d = ItemDirection.TAIL;
    public LayoutDirection e = LayoutDirection.END;
    public int f = Integer.MIN_VALUE;
    public int g = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/LayoutState$ItemDirection;", "", "", "vector", CA20Status.STATUS_USER_I, "a", "()I", "HEAD", "TAIL", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ItemDirection {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ItemDirection[] $VALUES;
        public static final ItemDirection HEAD;
        public static final ItemDirection TAIL;
        private final int vector;

        static {
            ItemDirection itemDirection = new ItemDirection("HEAD", 0, -1);
            HEAD = itemDirection;
            ItemDirection itemDirection2 = new ItemDirection("TAIL", 1, 1);
            TAIL = itemDirection2;
            ItemDirection[] itemDirectionArr = {itemDirection, itemDirection2};
            $VALUES = itemDirectionArr;
            $ENTRIES = kotlin.enums.a.a(itemDirectionArr);
        }

        public ItemDirection(String str, int i, int i2) {
            this.vector = i2;
        }

        public static ItemDirection valueOf(String str) {
            return (ItemDirection) Enum.valueOf(ItemDirection.class, str);
        }

        public static ItemDirection[] values() {
            return (ItemDirection[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final int getVector() {
            return this.vector;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/LayoutState$LayoutDirection;", "", "", "vector", CA20Status.STATUS_USER_I, "a", "()I", "START", "END", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LayoutDirection {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LayoutDirection[] $VALUES;
        public static final LayoutDirection END;
        public static final LayoutDirection START;
        private final int vector;

        static {
            LayoutDirection layoutDirection = new LayoutDirection("START", 0, -1);
            START = layoutDirection;
            LayoutDirection layoutDirection2 = new LayoutDirection("END", 1, 1);
            END = layoutDirection2;
            LayoutDirection[] layoutDirectionArr = {layoutDirection, layoutDirection2};
            $VALUES = layoutDirectionArr;
            $ENTRIES = kotlin.enums.a.a(layoutDirectionArr);
        }

        public LayoutDirection(String str, int i, int i2) {
            this.vector = i2;
        }

        public static LayoutDirection valueOf(String str) {
            return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
        }

        public static LayoutDirection[] values() {
            return (LayoutDirection[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final int getVector() {
            return this.vector;
        }
    }

    public final boolean a(RecyclerView.k kVar) {
        int b = kVar.b();
        int i = this.c;
        return i >= 0 && i < b;
    }

    public final View b(r0 r0Var) {
        View e = r0Var.e(this.c);
        this.c = this.d.getVector() + this.c;
        return e;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        ItemDirection itemDirection = this.d;
        LayoutDirection layoutDirection = this.e;
        int i3 = this.f;
        int i4 = this.g;
        StringBuilder s = b64.s(i, i2, "LayoutState {\n                \"mAvailable=\"", "\n                \"mCurrentPosition\"=", "\n                \"mItemDirection\"=");
        s.append(itemDirection);
        s.append("\n                \"mLayoutDirection\"=");
        s.append(layoutDirection);
        s.append("\n                \"mStartLine\"=");
        s.append(i3);
        s.append("\n                \"mEndLine\"=");
        s.append(i4);
        s.append("\n                }");
        return evu0.k0(s.toString()).toString();
    }
}
