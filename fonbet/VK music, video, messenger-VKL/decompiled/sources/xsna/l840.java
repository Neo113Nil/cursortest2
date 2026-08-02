package xsna;

import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: MusicActionBtnViewHolder.kt */
/* loaded from: classes3.dex */
public final class l840 extends se50<a> {
    public static final a n = new a(false);

    /* compiled from: MusicActionBtnViewHolder.kt */
    public static final class a {
        public final boolean a;

        public a() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ButtonState(isDisableState="), this.a, ')');
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    @Override // xsna.se50
    public final void b6(a aVar) {
        ((TextView) this.itemView.findViewById(R.id.music_action_btn)).setAlpha(aVar.a ? 0.5f : 1.0f);
    }
}
