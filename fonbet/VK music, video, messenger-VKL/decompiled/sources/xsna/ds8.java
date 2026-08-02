package xsna;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.ikv0;

/* compiled from: ButtonsFeedbackV2Holder.kt */
/* loaded from: classes4.dex */
public final class ds8 extends qi6<NewsEntry> implements View.OnClickListener, w8i {
    public final TextView C;
    public final View D;
    public final LinearLayout E;
    public final Object F;
    public final RecyclerView.u G;
    public final ArrayList<RecyclerView.e0> H;
    public final a I;
    public final Object J;
    public final Object K;
    public final ShapeDrawable L;

    /* compiled from: ButtonsFeedbackV2Holder.kt */
    public static final class a extends RecyclerView.Adapter<b> {
        public final ArrayList<ButtonsFeedback.Answer> c = new ArrayList<>();
        public cs8 d;

        public a(int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            b bVar2 = bVar;
            ButtonsFeedback.Answer answer = (ButtonsFeedback.Answer) j5g.b0(i, this.c);
            if (answer == null) {
                return;
            }
            cs8 cs8Var = this.d;
            bVar2.V5(answer);
            bVar2.o = cs8Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            int i2 = b.p;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            viewGroup.getContext();
            View inflate = from.inflate(R.layout.post_feedback_button_v3, viewGroup, false);
            inflate.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            return new b(inflate, viewGroup);
        }
    }

    /* compiled from: ButtonsFeedbackV2Holder.kt */
    public static final class b extends vif0<ButtonsFeedback.Answer> implements View.OnClickListener {
        public static final /* synthetic */ int p = 0;
        public final TextView n;
        public cs8 o;

        public b(View view, ViewGroup viewGroup) {
            super(view, viewGroup);
            this.n = (TextView) view;
            view.setOnClickListener(this);
        }

        @Override // xsna.vif0
        public final void i6(ButtonsFeedback.Answer answer) {
            this.n.setText(answer.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ButtonsFeedback.Answer answer;
            cs8 cs8Var;
            if (jjc.b() || (answer = (ButtonsFeedback.Answer) this.m) == null || (cs8Var = this.o) == null) {
                return;
            }
            cs8Var.accept(answer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds8(ViewGroup viewGroup) {
        super(R.layout.post_feedback_buttons_v3, viewGroup);
        viewGroup.getContext();
        this.C = (TextView) this.itemView.findViewById(R.id.tv_question);
        View findViewById = this.itemView.findViewById(R.id.hide_button);
        this.D = findViewById;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.buttons_container);
        this.E = linearLayout;
        s4 s4Var = new s4(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F = msy.a(lazyThreadSafetyMode, s4Var);
        this.G = new RecyclerView.u();
        this.H = new ArrayList<>(3);
        a aVar = new a(0);
        this.I = aVar;
        this.J = msy.a(lazyThreadSafetyMode, new sv0(5));
        this.K = msy.a(lazyThreadSafetyMode, new uv0(5));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicWidth(gbg0.a(this.itemView.getResources(), 8.0f));
        shapeDrawable.getPaint().setColor(0);
        this.L = shapeDrawable;
        linearLayout.setDividerDrawable(shapeDrawable);
        findViewById.setOnClickListener(this);
        aVar.d = new cs8(this, 0);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        RecyclerView.u uVar;
        Feedback feedback = newsEntry.g;
        if (feedback == null) {
            return;
        }
        this.C.setText(feedback.b);
        LinearLayout linearLayout = this.E;
        linearLayout.removeAllViews();
        ArrayList<RecyclerView.e0> arrayList = this.H;
        Iterator<T> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            uVar = this.G;
            if (!hasNext) {
                break;
            } else {
                uVar.putRecycledView((RecyclerView.e0) it.next());
            }
        }
        arrayList.clear();
        if (feedback instanceof ButtonsFeedback) {
            List<ButtonsFeedback.Answer> list = ((ButtonsFeedback) feedback).f;
            a aVar = this.I;
            ArrayList<ButtonsFeedback.Answer> arrayList2 = aVar.c;
            arrayList2.clear();
            List<ButtonsFeedback.Answer> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                arrayList2.addAll(list2);
            }
            if (list == null) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.e0 recycledView = uVar.getRecycledView(0);
                if (recycledView == null) {
                    recycledView = aVar.createViewHolder(linearLayout, 0);
                }
                arrayList.add(recycledView);
                linearLayout.addView(recycledView.itemView);
                if (recycledView instanceof b) {
                    aVar.bindViewHolder(recycledView, i);
                }
            }
            getContext();
            int a2 = list.size() > 2 ? gbg0.a(this.itemView.getResources(), 8.0f) : gbg0.a(this.itemView.getResources(), 12.0f);
            ShapeDrawable shapeDrawable = this.L;
            if (shapeDrawable.getIntrinsicWidth() != a2) {
                shapeDrawable.setIntrinsicWidth(a2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void R6(int i, NewsEntry newsEntry) {
        String Db;
        cz60 cz60Var = (cz60) this.K.getValue();
        String str = newsEntry.Cb().b;
        Feedback feedback = newsEntry.g;
        String str2 = feedback != null ? feedback.d : null;
        NewsEntry t6 = t6();
        if (t6 instanceof PromoPost) {
            ((PromoPost) t6).getClass();
            Db = com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        } else {
            Db = newsEntry.Db();
        }
        itg0.m(rsg0.y0(yfb.x(cz60.b(cz60Var, null, null, str, Integer.valueOf(i), Db, str2, 3)), null, null, 3));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void T6(ButtonsFeedback buttonsFeedback) {
        buttonsFeedback.e = true;
        NewsEntry t6 = t6();
        if (t6 != null) {
            ((p870) this.F.getValue()).e(128, t6);
        }
        String str = buttonsFeedback.c;
        if (str != null) {
            ikv0.a aVar = new ikv0.a(this.itemView.getContext());
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
            aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
            aVar.n();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void U6(NewsEntry newsEntry, ButtonsFeedback buttonsFeedback, String str) {
        String Db;
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : 0;
        cz60 cz60Var = (cz60) this.K.getValue();
        String str2 = newsEntry.Cb().b;
        String str3 = buttonsFeedback.d;
        NewsEntry t6 = t6();
        if (t6 instanceof PromoPost) {
            ((PromoPost) t6).getClass();
            Db = com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        } else {
            Db = newsEntry.Db();
        }
        rsg0.y0(yfb.x(cz60.h(cz60Var, null, null, str2, Integer.valueOf(i), str, null, null, Db, str3, 99)), null, null, 3).subscribe(new v8(new ri0(4, this, buttonsFeedback), 11), new x8(new qd1(3, this, buttonsFeedback), 7));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NewsEntry q6;
        if (jjc.b() || !epx.f(view, this.D) || (q6 = q6()) == null) {
            return;
        }
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : 0;
        if (q6 instanceof Post) {
            Post post = (Post) q6;
            Feedback feedback = post.g;
            String str = feedback != null ? feedback.d : null;
            if (str == null || str.length() == 0) {
                itg0.m(rsg0.y0(yfb.x(cz60.b((cz60) this.K.getValue(), post.m, Integer.valueOf(post.n), post.L.b, Integer.valueOf(i), null, null, 48)), null, null, 3));
            } else {
                R6(i, post);
            }
        } else if (q6 instanceof ShitAttachment) {
            itg0.m(rsg0.y0(yfb.x(((y11) this.J.getValue()).c(Integer.valueOf(i), ((ShitAttachment) q6).v)), null, null, 3));
        } else {
            R6(i, q6);
        }
        Feedback feedback2 = q6.g;
        if (feedback2 != null) {
            feedback2.e = true;
        }
        NewsEntry t6 = t6();
        if (t6 == null) {
            return;
        }
        ((p870) this.F.getValue()).e(128, t6);
    }
}
