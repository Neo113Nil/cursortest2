package xsna;

import android.content.Context;
import android.util.Size;
import android.view.Window;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ikv0;

/* compiled from: StickersQuestionOptionsBottomSheet.kt */
/* loaded from: classes6.dex */
public final class sbl0 {
    public final Context a;
    public final Window b;
    public final StoryEntry c;
    public final StoryQuestionEntry d;
    public final xkm0 e;
    public final a f;
    public final io.reactivex.rxjava3.disposables.b g;
    public final nm60 h;
    public final dac0 i;
    public final hri0 j;
    public final mll0 k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public dw20 p;

    /* compiled from: StickersQuestionOptionsBottomSheet.kt */
    public interface a {
        void a(int i);

        void b(int i, UserId userId);

        void c(int i, UserId userId);
    }

    public sbl0(Context context, Window window, StoryEntry storyEntry, StoryQuestionEntry storyQuestionEntry, xkm0 xkm0Var, a aVar, io.reactivex.rxjava3.disposables.b bVar, nm60 nm60Var, dac0 dac0Var, hri0 hri0Var, mll0 mll0Var) {
        this.a = context;
        this.b = window;
        this.c = storyEntry;
        this.d = storyQuestionEntry;
        this.e = xkm0Var;
        this.f = aVar;
        this.g = bVar;
        this.h = nm60Var;
        this.i = dac0Var;
        this.j = hri0Var;
        this.k = mll0Var;
        jaa0 jaa0Var = new jaa0(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, jaa0Var);
        this.m = msy.a(lazyThreadSafetyMode, new avj0(this, 3));
        this.n = msy.a(lazyThreadSafetyMode, new hk70(this, 22));
        this.o = msy.a(lazyThreadSafetyMode, new cck0(this, 3));
    }

    public final boolean a() {
        StoryQuestionEntry storyQuestionEntry = this.d;
        return storyQuestionEntry.e || storyQuestionEntry.g == null || storyQuestionEntry.c == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Context context = this.a;
        ikv0.a aVar = new ikv0.a(bwt0.u(context));
        aVar.t = new ikv0.c.C3058c(R.drawable.ic_cross_in_red_circle, (Integer) null, (Size) (0 == true ? 1 : 0), 14);
        aVar.u = new ikv0.d(context.getString(R.string.error), (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.o = Integer.valueOf(iah0.a(8));
        aVar.p(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String str) {
        ikv0.a aVar = new ikv0.a(bwt0.u(this.a));
        aVar.t = new ikv0.c.C3058c(R.drawable.ic_done_in_blue_circle, (Integer) null, (Size) (0 == true ? 1 : 0), 14);
        aVar.u = new ikv0.d(str, (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.o = Integer.valueOf(iah0.a(8));
        aVar.p(this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(StoryViewAction storyViewAction) {
        ((anm0) this.m.getValue()).J(storyViewAction, this.d, this.e);
    }
}
