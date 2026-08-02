package xsna;

import android.graphics.drawable.Drawable;
import com.vk.core.ui.utils.ItemType;
import com.vk.core.ui.utils.TitleColorAttr;

/* compiled from: SimpleAdapter.kt */
/* loaded from: classes17.dex */
public final class brj0 {
    public final int a;
    public final int b;
    public final Drawable c;
    public final int d;
    public final CharSequence e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final ItemType i;
    public final int j;
    public final Integer k;
    public final TitleColorAttr l;
    public final cpj0 m;
    public final Integer n;
    public final Object o;

    public brj0(int i, int i2, Drawable drawable, int i3, CharSequence charSequence, boolean z, boolean z2, ItemType itemType, int i4, Integer num, TitleColorAttr titleColorAttr, cpj0 cpj0Var, Integer num2, Object obj, int i5) {
        int i6 = (i5 & 2) != 0 ? 0 : i2;
        Drawable drawable2 = (i5 & 4) != 0 ? null : drawable;
        int i7 = (i5 & 8) != 0 ? 0 : i3;
        CharSequence charSequence2 = (i5 & 16) != 0 ? "" : charSequence;
        boolean z3 = (i5 & 64) == 0 ? z : false;
        boolean z4 = (i5 & 128) != 0 ? true : z2;
        ItemType itemType2 = (i5 & 256) != 0 ? ItemType.DEFAULT : itemType;
        int i8 = (i5 & 512) != 0 ? -1 : i4;
        Integer num3 = (i5 & 1024) != 0 ? null : num;
        TitleColorAttr titleColorAttr2 = (i5 & 4096) != 0 ? TitleColorAttr.DEFAULT : titleColorAttr;
        cpj0 cpj0Var2 = (i5 & 8192) != 0 ? null : cpj0Var;
        Integer num4 = (i5 & 16384) != 0 ? null : num2;
        Object obj2 = (i5 & 65536) != 0 ? null : obj;
        this.a = i;
        this.b = i6;
        this.c = drawable2;
        this.d = i7;
        this.e = charSequence2;
        this.f = null;
        this.g = z3;
        this.h = z4;
        this.i = itemType2;
        this.j = i8;
        this.k = num3;
        this.l = titleColorAttr2;
        this.m = cpj0Var2;
        this.n = num4;
        this.o = obj2;
    }
}
