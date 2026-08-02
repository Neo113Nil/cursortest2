package sg.bigo.ads.k;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* loaded from: classes9.dex */
public class g extends b {
    protected LinearLayout N;

    @Nullable
    private ImageView O;
    private ImageView P;

    /* renamed from: sg.bigo.ads.k.g$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.b.values().length];
            a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public g(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.k.b
    public final void E() {
        int a;
        super.E();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = ((b) this).z;
        if (realtimeBlurLinearLayout == null || ((b) this).z.getMeasuredWidth() <= (a = sg.bigo.ads.common.utils.f.a(realtimeBlurLinearLayout.getContext(), 288))) {
            return;
        }
        c(a);
    }

    @Override // sg.bigo.ads.k.b
    public final void F() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = ((b) this).z;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        boolean M = M();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int measuredWidth = ((b) this).z.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (M) {
                marginLayoutParams.rightMargin = -(measuredWidth + marginLayoutParams.rightMargin);
            } else {
                marginLayoutParams.leftMargin = -(measuredWidth + marginLayoutParams.leftMargin);
            }
            ((b) this).z.requestLayout();
        }
    }

    @Override // sg.bigo.ads.k.b
    public final void G() {
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = ((b) this).z;
        if (realtimeBlurLinearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
        boolean M = M();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int measuredWidth = ((b) this).z.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (M) {
                marginLayoutParams.rightMargin = -(marginLayoutParams.rightMargin + measuredWidth);
            } else {
                marginLayoutParams.leftMargin = -(marginLayoutParams.leftMargin + measuredWidth);
            }
            ((b) this).z.requestLayout();
        }
    }

    public boolean M() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, u.a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        super.a(viewGroup, view, new u.a() { // from class: sg.bigo.ads.k.g.1
            @Override // sg.bigo.ads.ad.interstitial.u.a
            public final Pair<String, String> a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
                if (textView != null && textView.getTag() == 6 && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    textView.setVisibility(8);
                }
                return Pair.create(str, str2);
            }
        }, i, i2, i3, viewArr);
    }

    public void b(int i) {
        TextView textView;
        if (i <= 1 || (textView = this.G) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public void c(int i) {
        ((b) this).z.getLayoutParams().width = i;
        ImageView imageView = this.P;
        if (imageView != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.addRule(11);
            layoutParams.addRule(1);
            LinearLayout linearLayout = this.N;
            if (linearLayout != null) {
                ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).addRule(0, this.P.getId());
            }
        }
        ((b) this).z.requestLayout();
    }

    @Override // sg.bigo.ads.k.b, sg.bigo.ads.k.a
    public final void t() {
        super.t();
        if (this.C != null) {
            boolean M = M();
            ViewGroup.LayoutParams layoutParams = this.C.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (M) {
                    layoutParams2.addRule(18, R.id.inter_media_layout);
                    layoutParams2.addRule(19, 0);
                    return;
                } else {
                    layoutParams2.addRule(18, 0);
                    layoutParams2.addRule(19, R.id.inter_media_layout);
                    return;
                }
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = M ? 3 : 5;
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = M ? 3 : 5;
            }
        }
    }

    @Override // sg.bigo.ads.k.b
    public int z() {
        return R.id.inter_component_24;
    }

    private void a(sg.bigo.ads.ad.interstitial.g gVar) {
        ImageView imageView;
        if (((b) this).z == null || (imageView = this.O) == null) {
            return;
        }
        Bitmap a = sg.bigo.ads.ad.interstitial.s.a(imageView.getContext(), ((sg.bigo.ads.ad.interstitial.u) this).c, this.v, gVar, gVar == sg.bigo.ads.ad.interstitial.g.WHITE);
        if (a != null) {
            this.O.setVisibility(0);
            this.O.setImageBitmap(a);
        }
    }

    @Override // sg.bigo.ads.k.b
    public final void b(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        Button button = (Button) ((b) this).z.findViewById(R.id.inter_btn_cta);
        this.H = button;
        if (button != null) {
            float a = sg.bigo.ads.common.utils.f.a(button.getContext(), 8);
            this.H.setBackground(sg.bigo.ads.common.utils.e.a(a, a, a, a, (Rect) null, -1));
            bVar.a(this.H);
        }
    }

    private void b(sg.bigo.ads.ad.interstitial.g gVar) {
        ImageView imageView;
        if (((b) this).z == null || (imageView = this.P) == null || gVar == null) {
            return;
        }
        imageView.setImageResource(gVar.c);
    }

    @Override // sg.bigo.ads.k.b
    public boolean a(@NonNull sg.bigo.ads.ad.interstitial.b bVar) {
        ViewGroup.LayoutParams layoutParams;
        if (!super.a(bVar) || ((b) this).z == null) {
            return false;
        }
        boolean M = M();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = ((b) this).z;
        if (realtimeBlurLinearLayout == null) {
            layoutParams = null;
        } else {
            ViewGroup.LayoutParams layoutParams2 = realtimeBlurLinearLayout.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                if (M) {
                    layoutParams3.addRule(11);
                    layoutParams3.addRule(9, 0);
                } else {
                    layoutParams3.addRule(11, 0);
                    layoutParams3.addRule(9);
                }
            } else {
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams2).gravity = M ? 5 : 3;
                } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = M ? 5 : 3;
                }
            }
            layoutParams = layoutParams2;
        }
        layoutParams.width = -2;
        ((b) this).z.requestLayout();
        this.N = (LinearLayout) ((b) this).z.findViewById(R.id.inter_text_layout);
        this.O = (ImageView) ((b) this).z.findViewById(R.id.inter_star);
        this.P = (ImageView) ((b) this).z.findViewById(R.id.inter_more);
        sg.bigo.ads.ad.interstitial.g gVar = AnonymousClass3.a[bVar.ordinal()] != 1 ? sg.bigo.ads.ad.interstitial.g.WHITE : sg.bigo.ads.ad.interstitial.g.BLACK;
        a(gVar);
        b(gVar);
        TextView textView = this.F;
        if (textView != null) {
            sg.bigo.ads.common.utils.v.a(textView, new v.a() { // from class: sg.bigo.ads.k.g.2
                @Override // sg.bigo.ads.common.utils.v.a
                public final void a(View view, @NonNull Rect rect) {
                    g gVar2 = g.this;
                    gVar2.b(gVar2.F.getLineCount());
                }
            });
        }
        return true;
    }
}
