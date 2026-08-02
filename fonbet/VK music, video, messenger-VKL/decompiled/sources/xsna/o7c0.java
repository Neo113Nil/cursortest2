package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import kotlin.collections.builders.ListBuilder;
import xsna.b8c0;
import xsna.i0c0;
import xsna.nov;
import xsna.u7c0;

/* compiled from: PostSticker.kt */
/* loaded from: classes6.dex */
public final class o7c0 extends nxt0 implements p7c0 {
    public static final int J = cn70.b(32);
    public static final int K = cn70.b(32);
    public static final int L = cn70.b(28);
    public final i0c0 A;
    public final n0c0 B;
    public final Drawable C;
    public final c8c0 D;
    public Context E;
    public boolean F;
    public int G;
    public final SpannableStringBuilder H;
    public final Semaphore I;
    public u7c0 f;
    public final izs<io.reactivex.rxjava3.disposables.c, s3q0> g;
    public final gzs<s3q0> h;
    public final View i;
    public final bpn0 j;
    public String k;
    public Bitmap l;
    public final View m;
    public final View n;
    public final TextView o;
    public final View p;
    public final FrameLayout q;
    public final FrameLayout r;
    public final View s;
    public final StoryAttachImageView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final FrameLayout z;

    /* compiled from: PostSticker.kt */
    public static final class a implements i0c0.a {
        public final int a;

        public a() {
            this.a = o7c0.this.getAvailableWidth();
        }

        @Override // xsna.i0c0.a
        public final boolean N1() {
            return false;
        }

        @Override // xsna.i0c0.a
        public final void a() {
            o7c0.this.v();
        }

        @Override // xsna.i0c0.a
        public final int b() {
            return this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o7c0(Context context, u7c0 u7c0Var, izs<? super io.reactivex.rxjava3.disposables.c, s3q0> izsVar, gzs<s3q0> gzsVar) {
        super(context);
        b8c0.d dVar;
        this.f = u7c0Var;
        this.g = izsVar;
        this.h = gzsVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_post, (ViewGroup) null);
        this.i = inflate;
        this.j = new bpn0(new s1x(this, 27));
        this.m = inflate.findViewById(R.id.post_sticker_full_info_container);
        View findViewById = inflate.findViewById(R.id.post_sticker_header);
        this.n = findViewById;
        TextView textView = (TextView) inflate.findViewById(R.id.post_sticker_text);
        this.o = textView;
        View findViewById2 = inflate.findViewById(R.id.post_sticker_repost);
        this.p = findViewById2;
        this.q = (FrameLayout) inflate.findViewById(R.id.post_sticker_attachment_container);
        this.r = (FrameLayout) inflate.findViewById(R.id.post_sticker_additional_attachments_container);
        this.s = inflate.findViewById(R.id.post_sticker_bottom_separator);
        StoryAttachImageView storyAttachImageView = (StoryAttachImageView) findViewById.findViewById(R.id.photo);
        this.t = storyAttachImageView;
        TextView textView2 = (TextView) findViewById.findViewById(R.id.name);
        this.u = textView2;
        this.v = (TextView) findViewById.findViewById(R.id.coauthorsName);
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.post_sticker_repost_name);
        this.w = textView3;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.post_sticker_repost_coauthors_name);
        this.x = textView4;
        TextView textView5 = (TextView) findViewById2.findViewById(R.id.post_sticker_repost_text);
        this.y = textView5;
        this.z = (FrameLayout) inflate.findViewById(R.id.post_sticker_repost_attachment_container);
        i0c0 i0c0Var = new i0c0();
        this.A = i0c0Var;
        this.B = new n0c0(i0c0Var);
        this.C = dhr0.w(R.drawable.bg_post_sticker, context);
        this.D = new c8c0();
        dhr0.a.getClass();
        this.E = dhr0.s();
        this.G = 255;
        this.H = new SpannableStringBuilder();
        this.I = new Semaphore(-2);
        addView(inflate);
        b8c0 a2 = c8c0.a(this.f, this.E);
        b8c0.e eVar = a2.d;
        b8c0.b bVar = a2.b;
        ListBuilder e = e43.e();
        b8c0.d dVar2 = bVar.b;
        e.add(dVar2.c);
        List<b8c0.d> list = bVar.c;
        if (list != null && (dVar = (b8c0.d) j5g.a0(list)) != null) {
            e.add(dVar.c);
        }
        ListBuilder g = e.g();
        int size = g.size();
        int i = K;
        setAvatarSize(size > 1 ? i : L);
        if (g.size() > 1) {
            izsVar.invoke(getCoauthorsUiProvider().a(Integer.valueOf(i), g).a0(asu0.a.d()).subscribe(new tmz(new l850(this, 3), 9), new ow40(new mgz(this, 22), 9), new m7c0()));
        } else {
            storyAttachImageView.setOnBindCompleted(new cty(this, 28));
            storyAttachImageView.setImageCornerRadius(cn70.c(28));
            storyAttachImageView.T0(dVar2.c);
        }
        textView.setText(a2.c.a);
        textView5.setText(eVar.c.a);
        setClipChildren(false);
        setClipToPadding(false);
        p(a2);
        float originalWidth = getOriginalWidth();
        b8c0.b bVar2 = eVar.b;
        b8c0.d dVar3 = bVar2.b;
        textView3.setText(dVar3.a);
        List<b8c0.d> list2 = bVar2.c;
        if (list2 != null && !list2.isEmpty()) {
            bwt0.p0(textView4, true);
            int measureText = (int) textView2.getPaint().measureText(dVar3.a);
            List<b8c0.d> list3 = list2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((b8c0.d) it.next()).a);
            }
            textView4.setText(s(arrayList, measureText, originalWidth));
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAvailableWidth() {
        return iah0.z(getContext()) - (J * 2);
    }

    private final jnd getCoauthorsUiProvider() {
        return (jnd) this.j.getValue();
    }

    private final void setAvatarSize(int i) {
        StoryAttachImageView storyAttachImageView = this.t;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) storyAttachImageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        storyAttachImageView.setLayoutParams(layoutParams);
    }

    private final void setupAuthorHeader(b8c0.b bVar) {
        SpannableStringBuilder spannableStringBuilder = this.H;
        spannableStringBuilder.clear();
        b8c0.d dVar = bVar.b;
        spannableStringBuilder.append((CharSequence) dVar.a);
        Drawable drawable = dVar.b;
        if (drawable != null) {
            int a2 = iah0.a(4);
            getContext();
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            newSpannable.setSpan(new tzx0(drawable, 3, -1.0f, false, 0, a2, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) newSpannable);
        }
        TextView textView = this.u;
        textView.setText(spannableStringBuilder);
        bwt0.p0(this.n, bVar.a);
        bwt0.p0(this.t, bVar.i);
        textView.setTextColor(bVar.d);
        f4m.v(bVar.f, textView);
        f4m.l(bVar.g, bVar.h, textView);
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        float f = getContext().getResources().getDisplayMetrics().density;
        Bitmap createBitmap = Bitmap.createBitmap((int) (getWidth() * f), (int) (getHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(f, f);
        draw(canvas);
        l0u0 l0u0Var = new l0u0(createBitmap, getMeasuredWidth() * 2, WebStickerType.POST, "");
        l0u0Var.q = o7c0.class;
        l0u0Var.s = new u210(this, 15);
        l0u0Var.t = this.f;
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new o7c0(getContext(), this.f, this.g, getOnBindCompleted()));
    }

    public Bitmap getContentImageBitmap() {
        return this.l;
    }

    @Override // xsna.p7c0
    public String getContentImageUrl() {
        return this.k;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 1.5f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMinScaleLimit() {
        return 0.3f;
    }

    public gzs<s3q0> getOnBindCompleted() {
        return this.h;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.i.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.i.getMeasuredWidth();
    }

    @Override // xsna.nxt0, xsna.nov
    public int getStickerAlpha() {
        return this.G;
    }

    public final u7c0 getStickerInfo() {
        return this.f;
    }

    @Override // xsna.p7c0
    public final void i() {
        n0c0 n0c0Var = this.B;
        n0c0Var.a.clear();
        n0c0Var.b.clear();
        n0c0Var.c.clear();
    }

    @Override // xsna.v4l0
    public final u7c0 m() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.i.layout(i, i2, i3, i4);
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        t();
        View view = this.i;
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void p(b8c0 b8c0Var) {
        Drawable drawable;
        float originalWidth = getOriginalWidth();
        b8c0.b bVar = b8c0Var.b;
        b8c0.a aVar = b8c0Var.e;
        q7c0 q7c0Var = aVar.f;
        b8c0.e eVar = b8c0Var.d;
        q(originalWidth, bVar);
        b8c0.f fVar = b8c0Var.c;
        int i = fVar.b;
        TextView textView = this.o;
        textView.setTextColor(i);
        textView.setTextSize(fVar.c);
        textView.setMaxLines(fVar.d);
        boolean z = fVar.e;
        Drawable drawable2 = this.C;
        if (z) {
            if (drawable2 != null) {
                drawable2.setTint(fVar.f);
            }
            drawable = drawable2;
        } else {
            drawable = null;
        }
        textView.setBackground(drawable);
        textView.setElevation(fVar.j);
        int i2 = fVar.i;
        textView.setPadding(i2, fVar.g, i2, fVar.h);
        bwt0.p0(textView, fVar.k);
        r(eVar);
        u7c0 u7c0Var = this.f;
        n7c0 n7c0Var = new n7c0(this);
        n0c0 n0c0Var = this.B;
        View a2 = n0c0Var.a(u7c0Var, q7c0Var, false, n7c0Var);
        FrameLayout frameLayout = this.q;
        if (a2 != null) {
            if (s101.r(frameLayout)) {
                frameLayout.removeAllViews();
                frameLayout.addView(a2);
            } else {
                frameLayout.addView(a2);
            }
        }
        if (aVar.a) {
            if (drawable2 != null) {
                drawable2.setTint(aVar.b);
            }
            frameLayout.setBackground(drawable2);
        } else {
            frameLayout.setBackground(null);
        }
        frameLayout.setElevation(aVar.c);
        int i3 = aVar.d;
        int i4 = aVar.e;
        frameLayout.setPadding(i3, i4, i3, i4);
        FrameLayout frameLayout2 = this.r;
        frameLayout2.removeAllViews();
        if (aVar.g) {
            PostStickerStyle postStickerStyle = this.f.j.a;
            int i5 = aVar.h;
            EnumMap<PostStickerStyle, View> enumMap = n0c0Var.c;
            View view = enumMap.get(postStickerStyle);
            if (view == null) {
                Context h = postStickerStyle.h();
                View inflate = LayoutInflater.from(h).inflate(R.layout.sticker_post_attachment_additional, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.post_sticker_attachment_additional_title)).setText(enj.f(R.plurals.post_sticker_attachment_additional_count, i5, h));
                enumMap.put((EnumMap<PostStickerStyle, View>) postStickerStyle, (PostStickerStyle) inflate);
                view = inflate;
            }
            frameLayout2.addView(view);
        }
        b8c0.c cVar = b8c0Var.a;
        boolean z2 = cVar.c;
        View view2 = this.m;
        View view3 = this.s;
        if (z2) {
            if (drawable2 != null) {
                drawable2.setTint(cVar.a);
            }
            bwt0.c0(cVar.b, view3);
            view2.setBackground(drawable2);
        } else {
            bwt0.c0(0, view3);
            view2.setBackground(null);
        }
        Context h2 = this.f.j.a.h();
        int availableWidth = getAvailableWidth();
        u7c0.a aVar2 = this.f.g;
        this.A.getClass();
        String a3 = i0c0.a(h2, q7c0Var, aVar2, availableWidth);
        if (a3 == null) {
            Context h3 = this.f.j.a.h();
            int availableWidth2 = getAvailableWidth();
            q7c0 q7c0Var2 = eVar.d.f;
            u7c0.d dVar = this.f.f;
            a3 = i0c0.a(h3, q7c0Var2, dVar != null ? dVar.d : null, availableWidth2);
        }
        setContentImageUrl(a3);
    }

    public final void q(float f, b8c0.b bVar) {
        setupAuthorHeader(bVar);
        float c = ((f - cn70.c(24)) - cn70.c(32)) - cn70.c(9);
        List<b8c0.d> list = bVar.c;
        if (list == null || list.isEmpty()) {
            return;
        }
        TextView textView = this.v;
        bwt0.p0(textView, true);
        int measureText = (int) this.u.getPaint().measureText(bVar.b.a);
        List<b8c0.d> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((b8c0.d) it.next()).a);
        }
        textView.setText(s(arrayList, measureText, c));
        textView.setTextColor(bVar.d);
        f4m.v(bVar.f, textView);
    }

    public final void r(b8c0.e eVar) {
        Drawable drawable;
        b8c0.f fVar = eVar.c;
        boolean z = eVar.a;
        b8c0.a aVar = eVar.d;
        bwt0.p0(this.p, z);
        if (!z) {
            v();
            return;
        }
        b8c0.b bVar = eVar.b;
        Integer num = bVar.e;
        TextView textView = this.w;
        if (num != null) {
            textView.setTextAppearance(num.intValue());
        }
        int i = bVar.d;
        int i2 = bVar.h;
        int i3 = bVar.f;
        textView.setTextColor(i);
        Drawable drawable2 = textView.getCompoundDrawables()[0];
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
        f4m.v(i3, textView);
        f4m.l(bVar.g, i2, textView);
        TextView textView2 = this.x;
        if (num != null) {
            textView2.setTextAppearance(num.intValue());
        }
        textView2.setTextColor(i);
        f4m.v(i3, textView2);
        f4m.l(0, i2, textView2);
        boolean z2 = fVar.k;
        TextView textView3 = this.y;
        bwt0.p0(textView3, z2);
        textView3.setTextColor(fVar.b);
        textView3.setTextSize(fVar.c);
        textView3.setMaxLines(fVar.d);
        boolean z3 = fVar.e;
        Drawable drawable3 = null;
        Drawable drawable4 = this.C;
        if (z3) {
            if (drawable4 != null) {
                drawable4.setTint(fVar.f);
            }
            drawable = drawable4;
        } else {
            drawable = null;
        }
        textView3.setBackground(drawable);
        textView3.setElevation(fVar.j);
        int i4 = fVar.i;
        textView3.setPadding(i4, fVar.g, i4, fVar.h);
        View a2 = this.B.a(this.f, aVar.f, true, new a());
        FrameLayout frameLayout = this.z;
        if (a2 != null) {
            if (s101.r(frameLayout)) {
                frameLayout.removeAllViews();
                frameLayout.addView(a2);
            } else {
                frameLayout.addView(a2);
            }
        }
        if (aVar.a) {
            if (drawable4 != null) {
                drawable4.setTint(aVar.b);
            }
            drawable3 = drawable4;
        }
        frameLayout.setBackground(drawable3);
        frameLayout.setElevation(aVar.c);
        int i5 = aVar.d;
        int i6 = aVar.e;
        frameLayout.setPadding(i5, i6, i5, i6);
    }

    public final String s(ArrayList arrayList, int i, float f) {
        if (arrayList.isEmpty()) {
            return "";
        }
        if (arrayList.size() != 1) {
            return getContext().getResources().getQuantityString(R.plurals.and_more_n_coauthors_plural, arrayList.size(), Integer.valueOf(arrayList.size()));
        }
        String string = getContext().getResources().getString(R.string.and_coauthor, j5g.Y(arrayList));
        return ((float) (((int) this.v.getPaint().measureText(string)) + i)) > f ? getContext().getResources().getQuantityString(R.plurals.and_more_n_coauthors_plural, 1, 1) : string;
    }

    @Override // xsna.p7c0
    public void setContentImageBitmap(Bitmap bitmap) {
        this.l = bitmap;
        u7c0 u7c0Var = this.f;
        u7c0.d dVar = u7c0Var.f;
        if (dVar != null) {
            dVar.d.e = bitmap;
        }
        u7c0Var.g.e = bitmap;
        Context context = this.E;
        this.D.getClass();
        p(c8c0.a(u7c0Var, context));
        u();
    }

    public void setContentImageUrl(String str) {
        this.k = str;
    }

    @Override // xsna.nxt0, xsna.nov
    public void setRemovable(boolean z) {
        this.F = z;
    }

    @Override // xsna.nxt0, xsna.nov
    public void setStickerAlpha(int i) {
        this.i.setAlpha(i / 255.0f);
        this.G = i;
    }

    public final void setStickerInfo(u7c0 u7c0Var) {
        this.f = u7c0Var;
    }

    public final void t() {
        this.i.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getAvailableWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iah0.f().heightPixels), Integer.MIN_VALUE));
    }

    public final void u() {
        float originalWidth = getOriginalWidth();
        float originalHeight = getOriginalHeight();
        if (originalWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || originalHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        t();
        nov.a.i(this, (originalWidth - getOriginalWidth()) / 2.0f, (originalHeight - getOriginalHeight()) / 2.0f);
    }

    @Override // xsna.v4l0
    public final void update(u7c0 u7c0Var) {
        u7c0 u7c0Var2 = u7c0Var;
        this.f = u7c0Var2;
        Context context = this.E;
        this.D.getClass();
        p(c8c0.a(u7c0Var2, context));
        u();
        xaq.a(this, new n7w(this, 24));
    }

    public final void v() {
        Semaphore semaphore = this.I;
        semaphore.release();
        if (semaphore.tryAcquire()) {
            getOnBindCompleted().invoke();
        }
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean v0() {
        return this.F;
    }

    @Override // xsna.nxt0, xsna.nov
    public final void x0(RectF rectF, float f, float f2) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
    }
}
