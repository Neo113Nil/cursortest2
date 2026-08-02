package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.b;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: BaseNewsEntryHolder.kt */
/* loaded from: classes4.dex */
public abstract class qi6<T extends NewsEntry> extends RecyclerView.e0 implements UsableRecyclerView.j, w1c0 {
    public static final /* synthetic */ int B = 0;
    public b A;
    public final Object l;
    public u1c0 m;
    public NewsEntry n;
    public boolean o;
    public T p;
    public s6o q;
    public final View.OnClickListener r;
    public e6o s;
    public boolean t;
    public String u;
    public String v;
    public PostInteract w;
    public s1c0 x;
    public s980 y;
    public izs<? super Integer, ? extends ol60> z;

    /* compiled from: BaseNewsEntryHolder.kt */
    public static final class a {
        public static int a(Context context) {
            int b = cn70.b(context.getResources().getConfiguration().screenWidthDp);
            HashSet hashSet = iah0.a;
            return Math.min(b - (fnj.d(context) ? cn70.b(84) : 0), iah0.a(640.0f));
        }
    }

    /* compiled from: BaseNewsEntryHolder.kt */
    public interface b {
        void a(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i);
    }

    public qi6(int i, ViewGroup viewGroup) {
        super(tf3.b(viewGroup, i, viewGroup, false));
        this.l = msy.a(LazyThreadSafetyMode.NONE, new r(3));
        this.o = true;
        this.r = new pi6(this, 0);
    }

    public static boolean B6(u1c0 u1c0Var) {
        return (u1c0Var.b instanceof ShitAttachment) || (u1c0Var.a instanceof ShitAttachment);
    }

    public static boolean D6(u1c0 u1c0Var) {
        NewsEntry newsEntry = u1c0Var.b;
        NewsEntry newsEntry2 = u1c0Var.a;
        if (newsEntry2 instanceof Post) {
            Post post = (Post) newsEntry2;
            if (post.dc() || post.F) {
                return true;
            }
        }
        if (!(newsEntry instanceof Post)) {
            return false;
        }
        Post post2 = (Post) newsEntry;
        return post2.dc() || post2.F;
    }

    public boolean A6() {
        return this.A != null;
    }

    public void F6(T t, Object obj) {
        E6(t);
    }

    public final void G6(View view) {
        b bVar;
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : 0;
        T q6 = q6();
        if (q6 == null || (bVar = this.A) == null) {
            return;
        }
        bVar.a(view, q6, t6(), i);
    }

    public final NewsEntry H0() {
        return t6();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public void I6() {
        if (((Boolean) this.l.getValue()).booleanValue()) {
            this.A = null;
            this.p = null;
            this.m = null;
            this.n = null;
            this.x = null;
            this.q = null;
            this.s = null;
            this.z = null;
            this.w = null;
            this.v = null;
        }
    }

    @Override // xsna.w1c0
    public u1c0 J0() {
        u1c0 j6 = j6();
        return j6 == null ? this.m : j6;
    }

    public void O6(s980 s980Var) {
        this.y = s980Var;
    }

    public void Q6(s6o s6oVar) {
        this.q = s6oVar;
        this.s = s6oVar.a(this.r, s6oVar.e);
    }

    public void V5(ol60 ol60Var) {
        if (ol60Var instanceof z1c0) {
            a6(((z1c0) ol60Var).h);
        }
    }

    public void W5(ol60 ol60Var, Object obj) {
        if (ol60Var instanceof z1c0) {
            b6(((z1c0) ol60Var).h, obj);
        }
    }

    public void a6(u1c0 u1c0Var) {
        h6(u1c0Var);
        T t = (T) u1c0Var.a;
        this.p = t;
        E6(t);
        g6(u1c0Var);
    }

    public void b6(u1c0 u1c0Var, Object obj) {
        h6(u1c0Var);
        T t = (T) u1c0Var.a;
        this.p = t;
        F6(t, obj);
        g6(u1c0Var);
    }

    public void g6(u1c0 u1c0Var) {
        View view = this.itemView;
        NewsEntry t6 = t6();
        int i = u1c0Var.c;
        mnh0.v(view, t6);
    }

    public final Context getContext() {
        return this.itemView.getContext();
    }

    public final void h6(u1c0 u1c0Var) {
        DeprecatedStatisticUrl T6;
        this.m = u1c0Var;
        this.o = u1c0Var.e;
        NewsEntry newsEntry = u1c0Var.b;
        this.n = newsEntry;
        this.u = u1c0Var.l;
        this.w = u1c0Var.m;
        this.x = u1c0Var.n;
        this.t = D6(u1c0Var) || B6(u1c0Var) || (newsEntry instanceof MyTargetNativeAdEntry) || (u1c0Var.a instanceof MyTargetNativeAdEntry);
        NewsEntry.TrackData Cb = newsEntry.Cb();
        Cb.c = u1c0Var.k;
        String str = Cb.b;
        if (str == null) {
            PostInteract postInteract = this.w;
            str = postInteract != null ? postInteract.h : null;
        }
        this.v = str;
        sgw sgwVar = u1c0Var.o;
        if (sgwVar != null) {
            Parcelable parcelable = (NewsEntry) sgwVar.c;
            u1c0 u1c0Var2 = (u1c0) sgwVar.d;
            DeprecatedStatisticInterface deprecatedStatisticInterface = (DeprecatedStatisticInterface) parcelable;
            com.vkontakte.android.data.b.o(deprecatedStatisticInterface, "impression");
            int i = u1c0Var2.k;
            if (!(deprecatedStatisticInterface instanceof b.h) || (T6 = ((b.h) deprecatedStatisticInterface).T6()) == null) {
                return;
            }
            T6.Bb(com.vkontakte.android.data.b.y, i);
        }
    }

    public hi60 i6() {
        s980 l6 = l6();
        return l6 != null ? l6 : t980.a;
    }

    public boolean isEnabled() {
        return this.o;
    }

    public final u1c0 j6() {
        izs<? super Integer, ? extends ol60> izsVar = this.z;
        ol60 invoke = izsVar != null ? izsVar.invoke(Integer.valueOf(getBindingAdapterPosition())) : null;
        z1c0 z1c0Var = invoke instanceof z1c0 ? (z1c0) invoke : null;
        if (z1c0Var != null) {
            return z1c0Var.h;
        }
        return null;
    }

    public s980 l6() {
        return this.y;
    }

    public final ColorStateList m6(int i) throws Resources.NotFoundException {
        return anj.b(i, this.itemView.getContext());
    }

    public final String n() {
        return this.u;
    }

    public final Drawable o6(int i) throws Resources.NotFoundException {
        return m33.a(i, this.itemView.getContext());
    }

    public void onClick() {
        e6o e6oVar = this.s;
        if (e6oVar != null) {
            e6oVar.onClick(this.itemView);
        } else {
            this.r.onClick(this.itemView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.feed.core.models.news.NewsEntry] */
    public final T q6() {
        u1c0 j6 = j6();
        T t = j6 != null ? j6.a : null;
        T t2 = t != null ? t : null;
        return t2 == null ? this.p : t2;
    }

    public final String s6(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        return this.itemView.getResources().getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public final NewsEntry t6() {
        NewsEntry newsEntry;
        u1c0 j6 = j6();
        return (j6 == null || (newsEntry = j6.b) == null) ? this.n : newsEntry;
    }

    public final String v6(int i) throws Resources.NotFoundException {
        return this.itemView.getResources().getString(i);
    }

    public final String x6(int i, Object... objArr) throws Resources.NotFoundException {
        return this.itemView.getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public qi6(View view) {
        super(view);
        this.l = msy.a(LazyThreadSafetyMode.NONE, new r(3));
        this.o = true;
        this.r = new pi6(this, 0);
    }

    public void E6(T t) {
    }

    public void M6(hi60 hi60Var) {
    }
}
