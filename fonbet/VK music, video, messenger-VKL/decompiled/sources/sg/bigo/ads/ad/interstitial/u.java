package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.v;
import xsna.ho8;

/* loaded from: classes9.dex */
public class u extends e {

    @NonNull
    public volatile sg.bigo.ads.y.b c;
    protected sg.bigo.ads.ax.b d;
    ImageView f;
    ImageView g;
    public Bitmap h;
    protected Bitmap i;
    private int l = 0;
    private final List<w> m = new ArrayList();
    private boolean n = false;
    private boolean o = false;
    public int j = 0;
    final AtomicBoolean k = new AtomicBoolean(false);
    final d e = new d();

    public interface a {
        Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2);
    }

    public u(@NonNull sg.bigo.ads.y.b bVar) {
        this.c = bVar;
    }

    public static void b(@Nullable View view) {
        AdOptionsView adOptionsView;
        if (view == null || (adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options)) == null) {
            return;
        }
        adOptionsView.setVisibility(adOptionsView.findViewWithTag("ad_options_real_view") == null ? 8 : 0);
    }

    public final synchronized void a(@Nullable Bitmap bitmap) {
        try {
            this.h = bitmap;
            Iterator<w> it = this.m.iterator();
            while (it.hasNext()) {
                it.next().a();
                it.remove();
            }
            this.l = 2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        if (this.h == null) {
            ImageView imageView = this.f;
            if (imageView != null && this.n) {
                a(imageView);
            }
            if (this.g == null || !this.o) {
                return;
            }
            a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.11
                @Override // sg.bigo.ads.ad.interstitial.w
                public final void a() {
                    final Bitmap b = sg.bigo.ads.common.utils.e.b(u.this.g.getContext(), u.this.h);
                    u.this.g.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.11.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            u.this.g.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            sg.bigo.ads.common.utils.e.a(u.this.g, b);
                        }
                    });
                }
            });
        }
    }

    @NonNull
    public d e() {
        return this.e;
    }

    @Nullable
    public final synchronized Bitmap g() {
        Bitmap bitmap = this.i;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        return this.i;
    }

    @NonNull
    public final synchronized sg.bigo.ads.an.p h() {
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            return new sg.bigo.ads.an.p(bitmap.getWidth(), this.i.getHeight());
        }
        return new sg.bigo.ads.an.p(-1, -1);
    }

    public final synchronized void i() {
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) this.c.f();
        if (aVar.aZ()) {
            Bitmap bitmap = this.i;
            if (bitmap == null || bitmap.isRecycled()) {
                if (this.k.compareAndSet(false, true)) {
                    String bb = aVar.bb();
                    if (sg.bigo.ads.common.utils.r.a((CharSequence) bb)) {
                        return;
                    }
                    sg.bigo.ads.bj.e.a(this.c.b.e, bb, aVar.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.u.7
                        @Override // sg.bigo.ads.bj.g
                        public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                            u.this.k.set(false);
                        }

                        @Override // sg.bigo.ads.bj.g
                        public final void a(@NonNull Bitmap bitmap2, @NonNull sg.bigo.ads.bj.f fVar) {
                            u uVar = u.this;
                            uVar.i = bitmap2;
                            uVar.j = sg.bigo.ads.bv.b.a(bitmap2, 0);
                            u.this.k.set(false);
                        }
                    });
                }
            }
        }
    }

    public void a(@NonNull View view) {
        if (this.d == null) {
            return;
        }
        this.d.a(view.findViewById(R.id.inter_options), 0);
        View findViewById = view.findViewById(R.id.inter_ad_label_layout);
        if (findViewById != null) {
            this.d.a(findViewById, 0);
            return;
        }
        this.d.a(view.findViewById(R.id.inter_ad_label), 0);
        this.d.a(view.findViewById(R.id.inter_advertiser), 0);
    }

    public void b(@NonNull final ViewGroup viewGroup) {
        sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), this.h, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                View findViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (findViewWithTag instanceof ImageView) {
                    u.this.g = (ImageView) findViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        u.this.g = new ImageView(context);
                        u.this.g.setTag("adview_background_main_tag");
                        u.this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.v.a(u.this.g, viewGroup, null, 0);
                    }
                }
                ImageView imageView = u.this.g;
                if (imageView == null || bitmap2 == null) {
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                u.this.g.setImageBitmap(bitmap2);
            }
        });
    }

    private synchronized void b(final ValueCallback<Bitmap> valueCallback) {
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) this.c.f();
        if (!aVar.aZ()) {
            String bb = aVar.bb();
            if (sg.bigo.ads.common.utils.r.a((CharSequence) bb)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                sg.bigo.ads.bj.e.a(this.c.b.e, bb, aVar.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.u.2
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                        valueCallback.onReceiveValue(null);
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                        valueCallback.onReceiveValue(bitmap);
                    }
                });
                return;
            }
        }
        String b = sg.bigo.ads.an.o.b(this.c.b.e, aVar.aV());
        if (sg.bigo.ads.common.utils.r.a((CharSequence) b)) {
            valueCallback.onReceiveValue(null);
        } else {
            final String path = Uri.parse(b).getPath();
            sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.15
                @Override // java.lang.Runnable
                public final void run() {
                    valueCallback.onReceiveValue(sg.bigo.ads.common.utils.e.a(Uri.parse(path).getPath(), u.this.c.b.e));
                }
            });
        }
    }

    public void a(@NonNull final ViewGroup viewGroup) {
        this.o = true;
        a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.4
            @Override // sg.bigo.ads.ad.interstitial.w
            public final void a() {
                Integer a2 = sg.bigo.ads.bv.b.a(u.this.h);
                if (a2 != null) {
                    u.this.e.a(a2.intValue());
                }
                u.this.b(viewGroup);
            }
        });
    }

    public final void a(@NonNull final ViewGroup viewGroup, final int i) {
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.6
            @Override // java.lang.Runnable
            public final void run() {
                View findViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                if (findViewWithTag instanceof ImageView) {
                    u.this.g = (ImageView) findViewWithTag;
                } else {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        u.this.g = new ImageView(context);
                        u.this.g.setTag("adview_background_main_tag");
                        u.this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        sg.bigo.ads.common.utils.v.a(u.this.g, viewGroup, null, 0);
                    }
                }
                ImageView imageView = u.this.g;
                if (imageView != null) {
                    imageView.setBackgroundColor(i);
                }
            }
        });
    }

    public void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i, int i2, int i3, @Nullable View... viewArr) {
        a(viewGroup, view, null, i, i2, i3, viewArr);
        sg.bigo.ads.common.utils.v.a(view, new v.a() { // from class: sg.bigo.ads.ad.interstitial.u.1
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view2, @NonNull Rect rect) {
                u.this.a(view2);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [sg.bigo.ads.api.core.b] */
    public void a(@NonNull ViewGroup viewGroup, @NonNull View view, a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        ArrayList arrayList = new ArrayList();
        b.d popPage = this.c.getPopPage();
        TextView textView = (TextView) view.findViewById(R.id.inter_title);
        if (textView != null) {
            textView.setTag(2);
            a(aVar, textView, this.c.getTitle(), popPage == null ? "" : popPage.b());
            arrayList.add(textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.inter_description);
        if (textView2 != null) {
            textView2.setTag(6);
            a(aVar, textView2, this.c.getDescription(), popPage == null ? "" : popPage.c());
            arrayList.add(textView2);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.inter_warning);
        if (textView3 != null) {
            textView3.setTag(8);
            String warning = this.c.getWarning();
            if (TextUtils.isEmpty(warning)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(warning);
            }
            arrayList.add(textView3);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.inter_btn_cta);
        if (textView4 != null) {
            textView4.setTag(7);
            a(aVar, textView4, this.c.getCallToAction(), "");
            arrayList.add(textView4);
        }
        TextView textView5 = (TextView) view.findViewById(R.id.inter_btn_cta_main);
        if (textView5 != null) {
            textView5.setTag(7);
            a(aVar, textView5, sg.bigo.ads.common.utils.a.a(textView5.getContext(), R.string.bigo_ad_cta_default, new Object[0]), "");
            arrayList.add(textView5);
        }
        final ImageView imageView = (ImageView) view.findViewById(R.id.inter_end_page_image);
        if (imageView != null) {
            imageView.setTag(5);
            final ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.8
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    final Bitmap bitmap2 = bitmap;
                    imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.8.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            imageView.setImageBitmap(bitmap2);
                        }
                    });
                }
            };
            Bitmap bitmap = this.i;
            if (bitmap != null) {
                valueCallback.onReceiveValue(bitmap);
            } else {
                a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.9
                    @Override // sg.bigo.ads.ad.interstitial.w
                    public final void a() {
                        valueCallback.onReceiveValue(u.this.h);
                    }
                });
            }
        }
        TextView textView6 = (TextView) view.findViewById(R.id.inter_company);
        if (textView6 != null) {
            textView6.setTag(26);
            if (popPage == null || sg.bigo.ads.common.utils.r.a((CharSequence) popPage.f())) {
                textView6.setVisibility(8);
            } else {
                a(aVar, textView6, popPage.f(), "");
            }
            arrayList.add(textView6);
        }
        TextView textView7 = (TextView) view.findViewById(R.id.inter_star_num);
        View findViewById = view.findViewById(R.id.inter_star_layout);
        if (textView7 != null && findViewById != null) {
            findViewById.setTag(26);
            textView7.setText(sg.bigo.ads.y.e.c(((sg.bigo.ads.cp.a) this.c.f()).o()));
            arrayList.add(findViewById);
        }
        TextView textView8 = (TextView) view.findViewById(R.id.inter_commit_num);
        if (textView8 != null) {
            textView8.setTag(26);
            StringBuilder b = ho8.b(sg.bigo.ads.y.e.b(((sg.bigo.ads.cp.a) this.c.f()).o()), " ");
            b.append(sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.string.bigo_ad_comment_num_text, new Object[0]));
            textView8.setText(b.toString());
            arrayList.add(textView8);
        }
        TextView textView9 = (TextView) view.findViewById(R.id.inter_download_num);
        View findViewById2 = view.findViewById(R.id.inter_download_num_layout);
        if (textView9 != null && findViewById2 != null) {
            findViewById2.setTag(26);
            textView9.setText(sg.bigo.ads.y.e.a(((sg.bigo.ads.cp.a) this.c.f()).o()));
            arrayList.add(findViewById2);
        }
        View findViewById3 = view.findViewById(R.id.inter_everyone_layout);
        if (findViewById3 != null) {
            findViewById3.setTag(26);
            arrayList.add(findViewById3);
        }
        this.f = (ImageView) view.findViewById(R.id.inter_icon);
        AdOptionsView adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options);
        MediaView mediaView = (MediaView) view.findViewById(R.id.inter_media);
        this.c.H = i3;
        this.c.a(viewGroup, mediaView, this.f, adOptionsView, (List<View>) arrayList, i2, viewArr);
        if (this.f == null || this.c.hasIcon()) {
            return;
        }
        String a2 = popPage == null ? "" : popPage.a();
        if (!sg.bigo.ads.common.utils.r.a((CharSequence) a2) && URLUtil.isNetworkUrl(a2)) {
            if (!sg.bigo.ads.ai.k.a.n().a(9) || !URLUtil.isHttpUrl(a2)) {
                sg.bigo.ads.bj.e.b(this.c.b.e, null, a2, ((sg.bigo.ads.cp.a) this.c.f()).am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.u.10
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i4, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap2, @NonNull sg.bigo.ads.bj.f fVar) {
                        ImageView imageView2 = u.this.f;
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(bitmap2);
                        }
                    }
                });
                return;
            } else {
                if (this.c == null || this.c.f() == 0) {
                    return;
                }
                sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) this.c.f(), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10220, "Invalid http url: ".concat(String.valueOf(a2)));
                return;
            }
        }
        if (i == 2) {
            this.f.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f.getContext(), R.drawable.bigo_ad_icon_default));
        } else if (i == 1) {
            a(this.f);
        } else if (i == 3) {
            this.f.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f.getContext(), R.drawable.bigo_ad_icon_novideo_default));
        }
    }

    public final synchronized void a(final ValueCallback<Bitmap> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.14
            @Override // sg.bigo.ads.ad.interstitial.w
            public final void a() {
                valueCallback.onReceiveValue(u.this.h);
            }
        });
    }

    public final void a(@NonNull final ImageView imageView) {
        this.n = true;
        a(new w() { // from class: sg.bigo.ads.ad.interstitial.u.3
            @Override // sg.bigo.ads.ad.interstitial.w
            public final void a() {
                sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.u.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        imageView.setImageBitmap(u.this.h);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                });
            }
        });
    }

    private static void a(a aVar, @NonNull TextView textView, @Nullable String str, @Nullable String str2) {
        Pair<String, String> a2;
        if (aVar != null && (a2 = aVar.a(textView, str, str2)) != null) {
            str = (String) a2.first;
            str2 = (String) a2.second;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            textView.setText(str2);
        }
    }

    private synchronized void a(@NonNull w wVar) {
        if (this.h != null) {
            wVar.a();
            return;
        }
        this.m.add(wVar);
        if (this.l == 1) {
            return;
        }
        this.l = 1;
        b(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.u.13
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                u.this.a(bitmap);
            }
        });
    }

    public final void a(sg.bigo.ads.ax.b bVar) {
        this.d = bVar;
    }

    public void f() {
    }
}
