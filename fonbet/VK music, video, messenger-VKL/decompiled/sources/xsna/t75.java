package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AuthorChipSpan.kt */
/* loaded from: classes4.dex */
public final class t75 extends db6 {
    public final boolean j;
    public lh10 k;

    public t75(boolean z) {
        super(z);
        this.j = z;
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        Owner owner;
        lh10 lh10Var = this.k;
        if (lh10Var != null) {
            NewsEntry newsEntry = (NewsEntry) lh10Var.b;
            bio0 bio0Var = (bio0) lh10Var.c;
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post == null || (owner = post.q) == null) {
                if (post == null) {
                    return;
                } else {
                    owner = post.o;
                }
            }
            gd60.Z0(hd60.a(), bio0Var.itemView.getContext(), owner.b, null, null, 12);
        }
    }

    @Override // xsna.db6
    public final int j() {
        return cn70.b(16);
    }

    @Override // xsna.db6
    public final float k() {
        return cn70.e() * 13.0f;
    }

    @Override // xsna.db6
    public final Typeface l() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        FontFamily fontFamily = FontFamily.MEDIUM;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 13.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(13.0f);
        }
        return cqi.a(Font.Companion, fontFamily, f, context);
    }

    @Override // xsna.db6
    public final apo m() {
        apo apoVar = new apo(R.attr.vk_ui_text_secondary);
        apoVar.c(this.j);
        return apoVar;
    }

    @Override // xsna.db6
    public final CharSequence n(int i, CharSequence charSequence) {
        return erm0.C0(i, charSequence);
    }

    @Override // xsna.db6
    public final boolean r() {
        return this.k != null;
    }

    @Override // xsna.db6
    public final boolean t() {
        return this.j;
    }

    @Override // xsna.db6
    public final CharSequence p(CharSequence charSequence) {
        return charSequence;
    }
}
