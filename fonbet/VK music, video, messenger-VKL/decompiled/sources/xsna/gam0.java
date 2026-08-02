package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.w9m0;

/* compiled from: StoryPrivacyTextDelegate.kt */
/* loaded from: classes16.dex */
public final class gam0 extends p1u0<w9m0.b> {

    /* compiled from: StoryPrivacyTextDelegate.kt */
    public static final class a extends vfz<w9m0.b> {
        public final TextView l;

        public a(ViewGroup viewGroup) {
            super(s3j0.b(viewGroup, R.layout.layout_privacy_story_text, viewGroup, false));
            this.l = (TextView) this.itemView.findViewById(R.id.title);
        }

        @Override // xsna.vfz
        public final void W5(w9m0.b bVar) {
            Context context = this.itemView.getContext();
            bVar.getClass();
            String string = context.getString(R.string.story_privacy_selector_title);
            TextView textView = this.l;
            textView.setText(string);
            textView.setAllCaps(true);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends w9m0.b> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof w9m0.b;
    }
}
