package xsna;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.groups.ManagedGroup;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;

/* compiled from: ManagedGroupViewHolder.kt */
/* loaded from: classes3.dex */
public final class yh00 extends vfz<xh00> {
    public final pi00 l;
    public final Drawable m;
    public final DialogItemView n;
    public int o;
    public String p;
    public String q;
    public boolean r;

    /* compiled from: ManagedGroupViewHolder.kt */
    public static abstract class a {

        /* compiled from: ManagedGroupViewHolder.kt */
        /* renamed from: xsna.yh00$a$a, reason: collision with other inner class name */
        public static final class C4101a extends a {
            public final ImageList a;

            public C4101a(ImageList imageList) {
                this.a = imageList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4101a) && epx.f(this.a, ((C4101a) obj).a);
            }

            public final int hashCode() {
                return this.a.b.hashCode();
            }

            public final String toString() {
                return "Avatar(newImageList=" + this.a + ')';
            }
        }

        /* compiled from: ManagedGroupViewHolder.kt */
        public static final class b extends a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Counter(newCount="), this.a, ')');
            }
        }

        /* compiled from: ManagedGroupViewHolder.kt */
        public static final class c extends a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("GroupActivity(newActivity="), this.a, ')');
            }
        }

        /* compiled from: ManagedGroupViewHolder.kt */
        public static final class d extends a {
            public final boolean a;

            public d(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Mute(isMuted="), this.a, ')');
            }
        }

        /* compiled from: ManagedGroupViewHolder.kt */
        public static final class e extends a {
            public final String a;

            public e(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Title(newTitle="), this.a, ')');
            }
        }
    }

    public yh00(ViewGroup viewGroup, pi00 pi00Var, Drawable drawable) {
        super(R.layout.managed_group_item, viewGroup);
        this.l = pi00Var;
        this.m = drawable;
        this.n = (DialogItemView) this.itemView.findViewById(R.id.managed_group_dialog_item);
        this.p = "";
        this.q = "";
    }

    @Override // xsna.vfz
    public final void W5(xh00 xh00Var) {
        xh00 xh00Var2 = xh00Var;
        ImageList imageList = xh00Var2.e;
        int i = DialogItemView.e;
        DialogItemView dialogItemView = this.n;
        dialogItemView.f(imageList, this.m, false);
        String str = xh00Var2.c;
        dialogItemView.p(str, false);
        String str2 = xh00Var2.d;
        dialogItemView.h(str2, null);
        int i2 = xh00Var2.f;
        if (i2 > 0) {
            dialogItemView.r(i2, false);
        } else {
            dialogItemView.u();
        }
        boolean z = xh00Var2.g == ManagedGroup.Type.EVENT;
        this.p = str;
        this.q = str2;
        this.o = i2;
        this.r = z;
        h6();
        jjc.g(this.itemView, new h1(22, this, xh00Var2));
    }

    public final void h6() {
        String string;
        String string2;
        boolean z = this.r;
        DialogItemView dialogItemView = this.n;
        if (z) {
            if (this.o > 0) {
                Resources resources = this.itemView.getContext().getResources();
                int i = this.o;
                string2 = resources.getQuantityString(R.plurals.vkim_accessibility_managed_groups_event_item_name_with_count, i, this.p, this.q, Integer.valueOf(i));
            } else {
                string2 = this.itemView.getContext().getString(R.string.vkim_accessibility_managed_group_event_item_name, this.p, this.q);
            }
            dialogItemView.setContentDescription(string2);
            return;
        }
        if (this.o > 0) {
            Resources resources2 = this.itemView.getContext().getResources();
            int i2 = this.o;
            string = resources2.getQuantityString(R.plurals.vkim_accessibility_managed_groups_item_name_with_count, i2, this.p, this.q, Integer.valueOf(i2));
        } else {
            string = this.itemView.getContext().getString(R.string.vkim_accessibility_managed_group_item_name, this.p, this.q);
        }
        dialogItemView.setContentDescription(string);
    }
}
