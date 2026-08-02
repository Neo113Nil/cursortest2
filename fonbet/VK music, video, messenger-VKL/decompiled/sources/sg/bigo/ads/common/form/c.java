package sg.bigo.ads.common.form;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
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
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.ai.e;
import sg.bigo.ads.be.d;
import sg.bigo.ads.common.form.render.b;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.common.view.ViewFlow;
import xsna.ful0;

/* loaded from: classes9.dex */
public final class c {

    @NonNull
    public final sg.bigo.ads.common.form.render.b a;

    @NonNull
    public final RelativeLayout b;

    @NonNull
    public final ViewFlow c;

    @NonNull
    public final Indicator d;

    @NonNull
    public final LinearLayout e;

    private c(@NonNull RelativeLayout relativeLayout, @NonNull sg.bigo.ads.common.form.render.b bVar) {
        this.b = relativeLayout;
        this.a = bVar;
        this.c = (ViewFlow) relativeLayout.findViewById(R.id.inter_image_view_flow);
        this.d = (Indicator) relativeLayout.findViewById(R.id.inter_image_indicator);
        this.e = (LinearLayout) relativeLayout.findViewById(R.id.inter_form_content);
    }

    public static c a(Context context, @NonNull e eVar, @Nullable Map<String, Object> map, boolean z, int i, int i2, b.a aVar) {
        ViewGroup.LayoutParams layoutParams;
        int a;
        RelativeLayout relativeLayout;
        sg.bigo.ads.common.form.render.b bVar = new sg.bigo.ads.common.form.render.b(context, eVar, map, i, i2, aVar);
        sg.bigo.ads.be.a aVar2 = null;
        View view = null;
        RelativeLayout relativeLayout2 = (RelativeLayout) sg.bigo.ads.common.utils.a.a(bVar.a, sg.bigo.ads.common.form.render.a.a(3), null, false);
        bVar.e = relativeLayout2;
        if (relativeLayout2 == null) {
            relativeLayout = null;
        } else {
            if (z) {
                sg.bigo.ads.common.form.render.c.a(relativeLayout2, bVar.a, bVar.b, bVar, 5);
            } else {
                sg.bigo.ads.common.form.render.b.a((TextView) relativeLayout2.findViewById(R.id.inter_form_content_title), bVar.b.a());
                sg.bigo.ads.common.form.render.b.a((TextView) bVar.e.findViewById(R.id.inter_form_content_description), bVar.b.b());
                RelativeLayout relativeLayout3 = bVar.e;
                e eVar2 = bVar.b;
                int i3 = 1;
                if (eVar2.k() == null || !r.b((CharSequence) eVar2.k().c())) {
                    ViewGroup viewGroup = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_icon_layout);
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_content_layout);
                    if (viewGroup2 != null) {
                        viewGroup2.setPadding(0, 0, 0, 0);
                    }
                } else {
                    ImageView imageView = (ImageView) relativeLayout3.findViewById(R.id.inter_form_content_icon);
                    if (imageView != null) {
                        new sg.bigo.ads.bj.b(imageView, (byte) 0).a(null, eVar2.k().c(), true);
                    }
                }
                RelativeLayout relativeLayout4 = bVar.e;
                Context context2 = bVar.a;
                e eVar3 = bVar.b;
                View findViewById = relativeLayout4.findViewById(R.id.inter_blank_viewholder);
                if (findViewById != null && eVar3.j() != null) {
                    int a2 = sg.bigo.ads.common.form.render.c.a(context2, eVar3);
                    ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                    layoutParams2.height = a2 - f.a(context2, 8);
                    findViewById.setLayoutParams(layoutParams2);
                }
                FrameLayout frameLayout = (FrameLayout) relativeLayout4.findViewById(R.id.inter_form_icon_layout);
                if (frameLayout != null) {
                    if (eVar3.j() == null) {
                        a = 0;
                    } else {
                        a = sg.bigo.ads.common.form.render.c.a(context2, eVar3) - f.a(context2, 33);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams3.topMargin = a;
                        frameLayout.setLayoutParams(layoutParams3);
                    }
                    HeightScrollView heightScrollView = (HeightScrollView) relativeLayout4.findViewById(R.id.inter_form_scroll);
                    if (heightScrollView != null) {
                        heightScrollView.setBlankView(findViewById);
                        heightScrollView.setOnScrollListener(new HeightScrollView.a() { // from class: sg.bigo.ads.common.form.render.c.6
                            final /* synthetic */ FrameLayout a;
                            final /* synthetic */ int b;

                            public AnonymousClass6(FrameLayout frameLayout2, int a3) {
                                r1 = frameLayout2;
                                r2 = a3;
                            }

                            @Override // sg.bigo.ads.common.view.HeightScrollView.a
                            public final void a(int i4) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r1.getLayoutParams();
                                marginLayoutParams.topMargin = r2 - i4;
                                r1.setLayoutParams(marginLayoutParams);
                            }
                        });
                    }
                }
                Button button = (Button) bVar.e.findViewById(R.id.inter_form_submit);
                bVar.d = button;
                if (button != null) {
                    button.setText(a.a(bVar.a, R.string.bigo_ad_form_submit));
                    bVar.d.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.b.3
                        public AnonymousClass3() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            View view3;
                            GradientDrawable a3;
                            b bVar2 = b.this;
                            bVar2.a(3, bVar2.g, System.currentTimeMillis() - b.this.f);
                            sg.bigo.ads.be.c cVar = b.this.c;
                            if (cVar != null) {
                                List<sg.bigo.ads.be.a> list = cVar.g;
                                int size = list == null ? 0 : list.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    sg.bigo.ads.be.a aVar3 = cVar.g.get(i4);
                                    if (aVar3 != null && aVar3.a()) {
                                        view3 = aVar3.c();
                                        break;
                                    }
                                }
                            }
                            view3 = null;
                            if (view3 != null) {
                                RelativeLayout relativeLayout5 = b.this.e;
                                HeightScrollView heightScrollView2 = (HeightScrollView) relativeLayout5.findViewById(R.id.inter_form_scroll);
                                View findViewById2 = relativeLayout5.findViewById(R.id.inter_blank_viewholder);
                                int height = findViewById2 != null ? findViewById2.getHeight() : 0;
                                if (heightScrollView2 != null) {
                                    heightScrollView2.scrollTo(0, view3.getTop() + height);
                                    return;
                                }
                                return;
                            }
                            if (b.this.c.b()) {
                                b bVar3 = b.this;
                                c.a(bVar3.e, bVar3.a, bVar3.b, bVar3, 1);
                                return;
                            }
                            b bVar4 = b.this;
                            RelativeLayout relativeLayout6 = bVar4.e;
                            Context context3 = bVar4.a;
                            e eVar4 = bVar4.b;
                            ViewGroup viewGroup3 = (ViewGroup) relativeLayout6.findViewById(R.id.inter_privacy_notice_container);
                            View a4 = sg.bigo.ads.common.utils.a.a(context3, sg.bigo.ads.common.form.render.a.a(4), null, false);
                            if (a4 != null && viewGroup3 != null) {
                                v.a(a4, viewGroup3, null, -1);
                                TextView textView = (TextView) a4.findViewById(R.id.bigo_ad_form_btn_cancel);
                                if (textView != null) {
                                    if (context3 == null) {
                                        a3 = null;
                                    } else {
                                        boolean z2 = sg.bigo.ads.common.form.render.a.a;
                                        int i5 = z2 ? -14931661 : -1;
                                        int i6 = z2 ? -10456960 : -4009768;
                                        a3 = ful0.a(0);
                                        a3.setStroke(f.a(context3, 1), i6);
                                        a3.setColor(i5);
                                        a3.setCornerRadius(f.a(context3, 8));
                                    }
                                    textView.setBackground(a3);
                                    textView.setText(sg.bigo.ads.common.form.a.a(context3, R.string.bigo_ad_form_cancel));
                                    textView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.1
                                        final /* synthetic */ View a;
                                        final /* synthetic */ a b;

                                        public AnonymousClass1(View a42, a bVar42) {
                                            r1 = a42;
                                            r2 = bVar42;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view4) {
                                            v.b(r1);
                                            a aVar4 = r2;
                                            if (aVar4 != null) {
                                                aVar4.b();
                                            }
                                        }
                                    });
                                }
                                TextView textView2 = (TextView) a42.findViewById(R.id.bigo_ad_form_btn_agree);
                                if (textView2 != null) {
                                    textView2.setText(sg.bigo.ads.common.form.a.a(context3, R.string.bigo_ad_form_agree));
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.2
                                        final /* synthetic */ View a;
                                        final /* synthetic */ ViewGroup b;
                                        final /* synthetic */ Context c;
                                        final /* synthetic */ e d;
                                        final /* synthetic */ a e;

                                        public AnonymousClass2(View a42, ViewGroup relativeLayout62, Context context32, e eVar42, a bVar42) {
                                            r1 = a42;
                                            r2 = relativeLayout62;
                                            r3 = context32;
                                            r4 = eVar42;
                                            r5 = bVar42;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view4) {
                                            v.b(r1);
                                            c.a(r2, r3, r4, r5, 2);
                                            a aVar4 = r5;
                                            if (aVar4 != null) {
                                                aVar4.c();
                                            }
                                        }
                                    });
                                }
                                PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) a42.findViewById(R.id.inter_form_check_box);
                                if (privacyCheckBox != null && textView2 != null) {
                                    privacyCheckBox.setOnCheckChangeListener(new PrivacyCheckBox.d() { // from class: sg.bigo.ads.common.form.render.c.3
                                        final /* synthetic */ TextView a;

                                        public AnonymousClass3(TextView textView22) {
                                            r1 = textView22;
                                        }

                                        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.d
                                        public final void a(boolean z3) {
                                            r1.setBackgroundResource(z3 ? R.drawable.bigo_ad_btn_background : sg.bigo.ads.common.form.render.a.a ? R.drawable.bigo_ad_btn_background_white_dark : R.drawable.bigo_ad_btn_background_white);
                                            r1.setClickable(z3);
                                        }
                                    });
                                }
                                c.a(a42, eVar42, null, bVar42);
                            }
                            b bVar5 = b.this;
                            bVar5.a(4, bVar5.g, System.currentTimeMillis() - b.this.f);
                        }
                    });
                }
                ViewGroup viewGroup3 = (ViewGroup) bVar.e.findViewById(R.id.inter_form_content);
                if (viewGroup3 != null) {
                    sg.bigo.ads.be.c cVar = bVar.c;
                    View a3 = sg.bigo.ads.common.utils.a.a(cVar.a, sg.bigo.ads.common.form.render.a.a(5), null, false);
                    cVar.e = a3;
                    if (a3 == null) {
                        layoutParams = null;
                    } else {
                        ViewGroup viewGroup4 = (ViewGroup) a3.findViewById(R.id.bigo_ad_id_form_question);
                        e.c[] cVarArr = cVar.d;
                        if (cVarArr != null && viewGroup4 != null) {
                            int length = cVarArr.length;
                            int i4 = 0;
                            while (i4 < length) {
                                e.c cVar2 = cVarArr[i4];
                                Map<String, Object> map2 = cVar.b;
                                Context context3 = cVar.a;
                                if (cVar2 != null) {
                                    int i5 = cVar2.b;
                                    aVar2 = i5 != i3 ? (i5 == 2 || i5 == 3) ? new sg.bigo.ads.be.b(cVar2, map2, context3, cVar) : null : new d(cVar2, map2, context3, cVar);
                                }
                                if (aVar2 != null) {
                                    cVar.g.add(aVar2);
                                    View b = aVar2.b();
                                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                                    layoutParams4.bottomMargin = f.a(cVar.a, 27);
                                    v.a(b, viewGroup4, layoutParams4, -1);
                                }
                                i4++;
                                aVar2 = null;
                                i3 = 1;
                            }
                        }
                        TextView textView = (TextView) cVar.e.findViewById(R.id.inter_form_question_purpose);
                        if (textView != null) {
                            textView.setText(cVar.c.h());
                        }
                        cVar.f = sg.bigo.ads.common.form.render.c.a(cVar.e, cVar.c, cVar.b, cVar.h);
                        view = cVar.e;
                        layoutParams = null;
                    }
                    v.a(view, viewGroup3, layoutParams, -1);
                }
            }
            v.a(bVar.e, new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.common.form.render.b.2
                public AnonymousClass2() {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    sg.bigo.ads.bh.d.a(2, b.this.h);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    b bVar2 = b.this;
                    bVar2.a(12, bVar2.g, System.currentTimeMillis() - b.this.f);
                }
            });
            relativeLayout = bVar.e;
        }
        c cVar3 = new c(relativeLayout, bVar);
        cVar3.d.setType(0);
        cVar3.d.setRadius(f.a(context, 3));
        cVar3.d.setPadding(f.a(context, 4), f.a(context, 3), f.a(context, 4), f.a(context, 3));
        cVar3.c.setViewStyle(3);
        cVar3.c.setFlipInterval(5000);
        cVar3.c.setOnItemChangeListener(new ViewFlow.c() { // from class: sg.bigo.ads.common.form.c.1
            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(int i6) {
                Indicator indicator;
                int i7;
                c.this.d.setNum(i6);
                if (i6 > 1) {
                    indicator = c.this.d;
                    i7 = 0;
                } else {
                    indicator = c.this.d;
                    i7 = 4;
                }
                indicator.setVisibility(i7);
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(int i6, int i7) {
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(@NonNull View view2, int i6) {
                c.this.d.a(i6);
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(@NonNull View view2, int i6, float f) {
                c.this.d.a(f, i6);
            }
        });
        cVar3.c.getLayoutParams().height = sg.bigo.ads.common.form.render.c.a(context, eVar);
        sg.bigo.ads.ai.f[] i6 = eVar.i();
        if (!l.a(i6)) {
            for (sg.bigo.ads.ai.f fVar : i6) {
                ImageView imageView2 = new ImageView(context);
                new sg.bigo.ads.bj.b(imageView2).a(null, fVar.c(), false);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ViewFlow.b bVar2 = new ViewFlow.b();
                ((ViewGroup.LayoutParams) bVar2).width = -1;
                ((ViewGroup.LayoutParams) bVar2).height = -2;
                bVar2.e = 48;
                bVar2.d = 3;
                cVar3.c.addView(imageView2, bVar2);
                if (eVar.f() == 0) {
                    break;
                }
            }
        }
        return cVar3;
    }
}
