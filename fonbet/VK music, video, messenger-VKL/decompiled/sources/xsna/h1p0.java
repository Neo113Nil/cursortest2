package xsna;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.b;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: TogglesAdapter.kt */
/* loaded from: classes6.dex */
public final class h1p0 extends sxm {

    /* compiled from: TogglesAdapter.kt */
    public static final class a implements hfz {
        public final UserId b;
        public final boolean c;

        public a(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return 813721319;
        }

        public final int hashCode() {
            UserId userId = this.b;
            return Boolean.hashCode(this.c) + ((userId == null ? 0 : Long.hashCode(userId.b)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnotherUserButtonItem(userId=");
            sb.append(this.b);
            sb.append(", userTogglesLoaded=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: TogglesAdapter.kt */
    public static final class b extends vfz<a> {
        public final d0r0 l;
        public final nc6 m;
        public final TextView n;
        public final VkButton o;

        public b(ViewGroup viewGroup, d0r0 d0r0Var, nc6 nc6Var) {
            super(R.layout.item_toggle_user_button, viewGroup);
            this.l = d0r0Var;
            this.m = nc6Var;
            this.n = (TextView) this.itemView.findViewById(R.id.toggle_user_title);
            this.o = (VkButton) this.itemView.findViewById(R.id.toggle_user_button);
        }

        @Override // xsna.vfz
        public final void W5(a aVar) {
            a aVar2 = aVar;
            boolean z = aVar2.c;
            TextView textView = this.n;
            VkButton vkButton = this.o;
            if (!z) {
                textView.setText("No user selected");
                vkButton.setText("Select");
                jjc.g(vkButton, new m360(this, 25));
                return;
            }
            StringBuilder sb = new StringBuilder("Toggles for ");
            UserId userId = aVar2.b;
            sb.append(userId != null ? Long.valueOf(userId.b) : null);
            sb.append(" are applied");
            textView.setText(sb.toString());
            vkButton.setText("Reset");
            jjc.g(vkButton, new u2k0(this, 12));
        }
    }

    /* compiled from: TogglesAdapter.kt */
    public static final class c implements hfz {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("CategoryItem(title="), this.b, ')');
        }
    }

    /* compiled from: TogglesAdapter.kt */
    public static final class d extends vfz<c> {
        @Override // xsna.vfz
        public final void W5(c cVar) {
            ((TextView) this.itemView).setText(b6().getString(cVar.b));
        }
    }

    /* compiled from: TogglesAdapter.kt */
    public static final class e implements hfz {
        public final b.d b;
        public final boolean c;
        public final String d;
        public final String e;

        public e(b.d dVar, boolean z, String str, String str2) {
            this.b = dVar;
            this.c = z;
            this.d = str;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && this.c == eVar.c && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.b.toString().hashCode());
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleItem(toggle=");
            sb.append(this.b);
            sb.append(", isLocal=");
            sb.append(this.c);
            sb.append(", remoteValue=");
            sb.append(this.d);
            sb.append(", localValue=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: TogglesAdapter.kt */
    public static final class f extends vfz<e> implements CompoundButton.OnCheckedChangeListener {
        public final d0r0 l;
        public final nc6 m;
        public final SwitchCompat n;
        public final TextView o;
        public final TextView p;
        public final TextView q;
        public final String r;
        public e s;

        public f(ViewGroup viewGroup, d0r0 d0r0Var, nc6 nc6Var) {
            super(R.layout.item_toggle, viewGroup);
            this.l = d0r0Var;
            this.m = nc6Var;
            this.n = (SwitchCompat) this.itemView.findViewById(R.id.item_toggle_switch);
            this.o = (TextView) this.itemView.findViewById(R.id.item_toggle_title);
            this.p = (TextView) this.itemView.findViewById(R.id.item_toggle_value_local);
            this.q = (TextView) this.itemView.findViewById(R.id.item_toggle_value_remote);
            this.r = viewGroup.getContext().getResources().getString(R.string.toggle_checked_info);
            jjc.g(this.itemView, new gqe0(this, 13));
            bwt0.k0(this.itemView, new xc50(this, 28));
        }

        @Override // xsna.vfz
        /* renamed from: h6, reason: merged with bridge method [inline-methods] */
        public final void W5(e eVar) {
            this.s = eVar;
            b.d dVar = eVar.b;
            this.o.setText(dVar.b.toString());
            boolean z = eVar.c;
            TextView textView = this.p;
            if (!z || dVar.c.toString().length() <= 0) {
                f4m.j(textView);
            } else {
                String obj = dVar.c.toString();
                textView.setText(obj != null ? cqm0.e(obj) : null);
                textView.setVisibility(0);
            }
            TextView textView2 = this.q;
            if (z && dVar.c.toString().length() > 0) {
                String str = eVar.d;
                textView2.setText(str != null ? cqm0.e(str) : "<empty>");
                textView2.setTextColor(this.itemView.getContext().getColor(R.color.vk_red));
                textView2.setVisibility(0);
            } else if (dVar.c.toString().length() > 0) {
                String obj2 = dVar.c.toString();
                textView2.setText(obj2 != null ? cqm0.e(obj2) : null);
                textView2.setTextColor(this.itemView.getContext().getColor(R.color.vk_ui_text_title_color));
                textView2.setVisibility(0);
            } else {
                f4m.j(textView2);
            }
            SwitchCompat switchCompat = this.n;
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(dVar.a);
            switchCompat.setOnCheckedChangeListener(this);
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            e eVar = this.s;
            (eVar == null ? null : eVar).b.a = z;
            if (eVar == null) {
                eVar = null;
            }
            boolean c = this.l.c(eVar.b);
            nc6 nc6Var = this.m;
            if (c) {
                StringBuilder sb = new StringBuilder();
                e eVar2 = this.s;
                if (eVar2 == null) {
                    eVar2 = null;
                }
                sb.append(eVar2.b.b.toString());
                sb.append(' ');
                sb.append(this.r);
                String sb2 = sb.toString();
                ikv0.a aVar = new ikv0.a(nc6Var.a.requireContext());
                aVar.u = new ikv0.d(sb2, (String) null, (ikv0.d.a) null, 6);
                aVar.j = false;
                aVar.o = Integer.valueOf(iah0.a(96));
                aVar.n();
            }
            nc6Var.a();
        }
    }
}
