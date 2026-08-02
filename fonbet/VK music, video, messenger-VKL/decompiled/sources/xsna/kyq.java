package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FeedDiscoverTopBar.kt */
/* loaded from: classes18.dex */
public final class kyq extends FrameLayout {
    public final View b;
    public final VkAvatar c;
    public final VkSearchView d;
    public final Rect e;
    public a f;
    public b g;

    /* compiled from: FeedDiscoverTopBar.kt */
    public interface a {

        /* compiled from: FeedDiscoverTopBar.kt */
        /* renamed from: xsna.kyq$a$a, reason: collision with other inner class name */
        public static final class C3218a implements a {
            public final String a;
            public final CharSequence b;

            public /* synthetic */ C3218a(String str) {
                this(str, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3218a)) {
                    return false;
                }
                C3218a c3218a = (C3218a) obj;
                return epx.f(this.a, c3218a.a) && epx.f(this.b, c3218a.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                CharSequence charSequence = this.b;
                return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Avatar(url=");
                sb.append(this.a);
                sb.append(", contentDescription=");
                return thl0.a(sb, this.b, ')');
            }

            public C3218a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }
        }

        /* compiled from: FeedDiscoverTopBar.kt */
        public static final class b implements a {
            public final CharSequence a;

            public b() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                CharSequence charSequence = this.a;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            public final String toString() {
                return thl0.a(new StringBuilder("Back(contentDescription="), this.a, ')');
            }

            public b(String str) {
                this.a = str;
            }
        }
    }

    /* compiled from: FeedDiscoverTopBar.kt */
    public interface b {

        /* compiled from: FeedDiscoverTopBar.kt */
        public static final class a implements b {
            public final String a;
            public final CharSequence b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                CharSequence charSequence = this.b;
                return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Search(hint=");
                sb.append((Object) this.a);
                sb.append(", contentDescription=");
                return thl0.a(sb, this.b, ')');
            }
        }
    }

    public kyq(Context context) {
        super(context, null, 0);
        this.e = new Rect();
        LayoutInflater.from(context).inflate(R.layout.feed_discover_top_bar_view, (ViewGroup) this, true);
        this.b = findViewById(R.id.feed_discover_top_bar_back);
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.feed_discover_top_bar_back_icon);
        VkAvatar vkAvatar = (VkAvatar) findViewById(R.id.feed_discover_top_bar_avatar);
        this.c = vkAvatar;
        VkSearchView vkSearchView = (VkSearchView) findViewById(R.id.feed_discover_top_bar_search);
        this.d = vkSearchView;
        LinkedHashMap linkedHashMap = x1z.a;
        vkImageSimple.setImageResource(R.drawable.vk_icon_arrow_left_outline_28);
        vkAvatar.setFixedSize(cn70.b(40));
        vkAvatar.setPlaceholderImage(R.drawable.user_placeholder_square);
        vkSearchView.X4(false);
        vkSearchView.setInputFocusable(false);
        vkSearchView.V4();
        BaseVkSearchView.d5(vkSearchView, 0, 0, 10);
    }

    public final RectF getAvatarRect() {
        VkAvatar vkAvatar = this.c;
        if (vkAvatar.getVisibility() != 0) {
            return null;
        }
        Rect rect = this.e;
        if (vkAvatar.getGlobalVisibleRect(rect)) {
            return new RectF(rect);
        }
        return null;
    }

    @Override // android.view.View
    public final a getLeft() {
        return this.f;
    }

    public final b getMiddle() {
        return this.g;
    }

    public final void setLeft(a aVar) {
        this.f = aVar;
        boolean z = aVar instanceof a.b;
        int i = 0;
        int i2 = z ? 0 : 8;
        View view = this.b;
        view.setVisibility(i2);
        boolean z2 = aVar instanceof a.C3218a;
        int i3 = z2 ? 0 : 8;
        VkAvatar vkAvatar = this.c;
        vkAvatar.setVisibility(i3);
        if (z) {
            view.setContentDescription(((a.b) aVar).a);
        } else if (z2) {
            a.C3218a c3218a = (a.C3218a) aVar;
            vkAvatar.setContentDescription(c3218a.b);
            String str = c3218a.a;
            if (str == null) {
                str = "";
            }
            vkAvatar.setContent(new c.d(str, new gko(R.drawable.user_placeholder_square)));
        } else if (aVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.f != null && this.g != null) {
            i = cn70.b(10);
        }
        f4m.s(i, this.d);
    }

    public final void setMiddle(b bVar) {
        this.g = bVar;
        boolean z = bVar instanceof b.a;
        int i = 0;
        int i2 = z ? 0 : 8;
        VkSearchView vkSearchView = this.d;
        vkSearchView.setVisibility(i2);
        if (z) {
            b.a aVar = (b.a) bVar;
            String str = aVar.a;
            CharSequence charSequence = aVar.b;
            vkSearchView.setHint(str.toString());
            vkSearchView.setContentDescription(charSequence);
            vkSearchView.getEditView().setContentDescription(charSequence);
        } else if (bVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.f != null && this.g != null) {
            i = cn70.b(10);
        }
        f4m.s(i, vkSearchView);
    }

    public final void setOnAvatarClickListener(gzs<s3q0> gzsVar) {
        jjc.f(gzsVar != null ? new asq(gzsVar, 1) : null, this.c);
    }

    public final void setOnAvatarLongClickListener(gzs<s3q0> gzsVar) {
        VkAvatar vkAvatar = this.c;
        if (gzsVar == null) {
            vkAvatar.setOnLongClickListener(null);
        } else {
            bwt0.k0(vkAvatar, new cqf(gzsVar, 21));
        }
    }

    public final void setOnBackClickListener(gzs<s3q0> gzsVar) {
        jjc.f(gzsVar != null ? new bt8(gzsVar, 2) : null, this.b);
    }

    public final void setOnSearchClickListener(gzs<s3q0> gzsVar) {
        gmp gmpVar = gzsVar != null ? new gmp(gzsVar, 1) : null;
        VkSearchView vkSearchView = this.d;
        jjc.f(gmpVar, vkSearchView);
        vkSearchView.setOnActionSearchQueryClick(gmpVar);
    }
}
