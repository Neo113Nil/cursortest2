package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import xsna.egg0;
import xsna.fpv0;

/* compiled from: VkTabBar.kt */
/* loaded from: classes17.dex */
public final class fpv0 extends LinearLayout implements too0 {
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public int f;

    /* compiled from: VkTabBar.kt */
    public static final class a {
        public final InterfaceC2887a a;
        public final d b;

        /* compiled from: VkTabBar.kt */
        /* renamed from: xsna.fpv0$a$a, reason: collision with other inner class name */
        public interface InterfaceC2887a {

            /* compiled from: VkTabBar.kt */
            /* renamed from: xsna.fpv0$a$a$a, reason: collision with other inner class name */
            public static final class C2888a implements InterfaceC2887a {
                public final odu0 a;

                public C2888a(odu0 odu0Var) {
                    this.a = odu0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2888a)) {
                        return false;
                    }
                    C2888a c2888a = (C2888a) obj;
                    c2888a.getClass();
                    return epx.f(this.a, c2888a.a);
                }

                public final int hashCode() {
                    odu0 odu0Var = this.a;
                    return Boolean.hashCode(false) + (((-1870518946) + (odu0Var == null ? 0 : odu0Var.hashCode())) * 31);
                }

                public final String toString() {
                    return "Avatar(url=https://upload.wikimedia.org/wikipedia/commons/5/58/Shiba_inu_taiki.jpg, border=" + this.a + ", isBorderRespectedInMeasure=false)";
                }
            }

            /* compiled from: VkTabBar.kt */
            /* renamed from: xsna.fpv0$a$a$b */
            public static final class b implements InterfaceC2887a {
                public final Drawable a;

                public b(Drawable drawable) {
                    this.a = drawable;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Icon(drawable=" + this.a + ')';
                }
            }
        }

        public a(InterfaceC2887a interfaceC2887a, d dVar) {
            this.a = interfaceC2887a;
            this.b = dVar;
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
            int hashCode = this.a.hashCode() * 31;
            d dVar = this.b;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            return "Item(content=" + this.a + ", statusContent=" + this.b + ')';
        }
    }

    /* compiled from: VkTabBar.kt */
    public interface b {
        void a(int i);
    }

    /* compiled from: VkTabBar.kt */
    public interface c {
        void c(int i);
    }

    /* compiled from: VkTabBar.kt */
    public interface d {

        /* compiled from: VkTabBar.kt */
        public static final class a implements d {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Integer.hashCode(5);
            }

            public final String toString() {
                return "Counter(count=5)";
            }
        }

        /* compiled from: VkTabBar.kt */
        public static final class b implements d {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 851406515;
            }

            public final String toString() {
                return "StatusDot";
            }
        }
    }

    public fpv0(Context context) {
        super(context, null, 0);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
        setOrientation(0);
        setGravity(16);
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_l, context);
        setPaddingRelative(a2, 0, a2, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((jpv0) it.next()).Ng();
        }
    }

    public final void a(int i) {
        int i2;
        if (i < 0 || i >= this.b.size() || i == (i2 = this.f)) {
            return;
        }
        this.f = i;
        ArrayList arrayList = this.c;
        if (i2 >= 0 && i2 < arrayList.size()) {
            ((jpv0) arrayList.get(i2)).setSelected(false);
        }
        if (i >= 0 && i < arrayList.size()) {
            ((jpv0) arrayList.get(i)).setSelected(true);
        }
        Iterator it = new egg0(this.d).iterator();
        while (true) {
            ListIterator<T> listIterator = ((egg0.a) it).b;
            if (!listIterator.hasPrevious()) {
                return;
            } else {
                ((c) listIterator.previous()).c(i);
            }
        }
    }

    public final void setItems(List<a> list) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.addAll(list);
        removeAllViews();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        this.f = -1;
        Iterator it = arrayList.iterator();
        final int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            jpv0 jpv0Var = new jpv0(getContext());
            jpv0Var.setItem((a) next);
            jpv0Var.setLayoutParams(new LinearLayout.LayoutParams(0, hbh0.b(42, jpv0Var.getContext()), 1.0f));
            jpv0Var.setOnClickListener(new li4(this, i, 1));
            jpv0Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.epv0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    ListIterator<T> listIterator = ((egg0.a) new egg0(fpv0.this.e).iterator()).b;
                    if (!listIterator.hasPrevious()) {
                        return false;
                    }
                    ((fpv0.b) listIterator.previous()).a(i);
                    return true;
                }
            });
            arrayList2.add(jpv0Var);
            addView(jpv0Var);
            i = i2;
        }
    }
}
