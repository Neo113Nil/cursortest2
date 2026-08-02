package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import java.util.Calendar;
import xsna.tlo0;

/* compiled from: ContentEventsAdapter.kt */
/* loaded from: classes5.dex */
public final class hgj extends zoj0<Group, b> {
    public final x2e e;

    /* compiled from: ContentEventsAdapter.kt */
    public static final class a extends m.e<Group> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(Group group, Group group2) {
            Group group3 = group;
            Group group4 = group2;
            return epx.f(group3.e, group4.e) && epx.f(group3.f, group4.f) && epx.f(group3.d, group4.d) && group3.q == group4.q;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(Group group, Group group2) {
            return epx.f(group.c, group2.c);
        }
    }

    /* compiled from: ContentEventsAdapter.kt */
    public static final class b extends vif0<Group> {
        public final VkCell n;

        /* compiled from: ContentEventsAdapter.kt */
        public static final class a implements VkCell.d {
            public final VkAvatar a;

            public a(Context context) {
                VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
                vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                vkAvatar.setBackgroundResource(R.drawable.bg_community_circle_preview);
                this.a = vkAvatar;
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final void a(VkCell.f fVar) {
                c cVar = fVar instanceof c ? (c) fVar : null;
                if (cVar != null) {
                    this.a.o0(cVar.a, null);
                }
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final View getView() {
                return this.a;
            }
        }

        /* compiled from: ContentEventsAdapter.kt */
        /* renamed from: xsna.hgj$b$b, reason: collision with other inner class name */
        public static final class C2995b implements VkCell.e {
            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new a(context);
            }
        }

        /* compiled from: ContentEventsAdapter.kt */
        public static final class c implements VkCell.f {
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
                return ho8.a(new StringBuilder("AvatarViewParams(photoUrl="), this.a, ')');
            }
        }

        public b(VkCell vkCell, x2e x2eVar) {
            super(vkCell);
            this.n = vkCell;
            bwt0.i0(vkCell, new rm0(9, x2eVar, this));
            vkCell.setLeftMainAvatarController(new C2995b());
        }

        @Override // xsna.vif0
        public final void i6(Group group) {
            String str;
            String sb;
            Group group2 = group;
            String str2 = group2.f;
            if (str2.length() <= 0) {
                str2 = null;
            }
            if ((str2 == null || (str = js5.a(iah0.a(48), str2)) == null) && (str = group2.e) == null) {
                str = "";
            }
            VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(str), VkCell.Left.Main.Size.Medium));
            VkCell vkCell = this.n;
            vkCell.setLeft(a2);
            tlo0.h d = oq.d(tlo0.Companion, group2.d);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            VkCell.Middle.e eVar = new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            if (group2.q > pvo0.a() || group2.r > pvo0.a()) {
                StringBuilder sb2 = new StringBuilder();
                int i = group2.q;
                if (i > 0) {
                    sb2.append(pvo0.i(true, i, false, false));
                }
                if (group2.r > 0) {
                    sb2.append(" - ");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(group2.q * 1000);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(group2.r * 1000);
                    if (c09.c(calendar, calendar2)) {
                        sb2.append(pvo0.c(group2.r));
                    } else {
                        sb2.append(pvo0.i(true, group2.r, false, false));
                    }
                }
                sb = sb2.toString();
            } else {
                sb = group2.r == 0 ? this.itemView.getContext().getString(R.string.community_event_past, pvo0.i(false, group2.q, false, false)) : this.itemView.getContext().getString(R.string.community_event_past_with_end_date, pvo0.i(false, group2.r, false, false));
            }
            vkCell.setMiddle(new VkCell.Middle.b(eVar, new VkCell.Middle.d(new tlo0.h(sb), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        }
    }

    public hgj(x2e x2eVar) {
        super(new com.vk.lists.a(new a()));
        this.e = x2eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new b(vkCell, this.e);
    }
}
