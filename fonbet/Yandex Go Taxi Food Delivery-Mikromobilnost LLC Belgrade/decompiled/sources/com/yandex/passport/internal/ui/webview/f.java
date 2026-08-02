package com.yandex.passport.internal.ui.webview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.R;
import defpackage.uc20;

/* loaded from: classes2.dex */
public final class f {
    public final d a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public PopupWindow h;
    public WebViewDebugOverlay$ScalePreset i = WebViewDebugOverlay$ScalePreset.Full;
    public final View j;

    public f(WebViewActivity webViewActivity, d dVar) {
        this.a = dVar;
        View inflate = LayoutInflater.from(webViewActivity).inflate(R.layout.passport_overlay_web_view_debug, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.btn_toggle_resize);
        final int i = 0;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                float f;
                float f2;
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset = fVar.i;
                        webViewDebugOverlay$ScalePreset.getClass();
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset2 = WebViewDebugOverlay$ScalePreset.values()[(webViewDebugOverlay$ScalePreset.ordinal() + 1) % WebViewDebugOverlay$ScalePreset.values().length];
                        fVar.i = webViewDebugOverlay$ScalePreset2;
                        d dVar2 = fVar.a;
                        float horizontal = webViewDebugOverlay$ScalePreset2.getHorizontal();
                        float vertical = fVar.i.getVertical();
                        View view2 = dVar2.b;
                        WebView webView = dVar2.e;
                        if (horizontal > 1.0f) {
                            horizontal = 1.0f;
                        } else if (horizontal < 0.0f) {
                            horizontal = 0.0f;
                        }
                        if (vertical > 1.0f) {
                            vertical = 1.0f;
                        } else if (vertical < 0.0f) {
                            vertical = 0.0f;
                        }
                        if (horizontal < 1.0f || vertical < 1.0f) {
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            webView.setClipToOutline(true);
                            webView.setElevation(5.0f * uc20.a.density);
                        } else {
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            webView.setElevation(0.0f * uc20.a.density);
                            webView.setClipToOutline(false);
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) webView.getLayoutParams();
                        layoutParams.matchConstraintDefaultWidth = 2;
                        layoutParams.matchConstraintDefaultHeight = 2;
                        layoutParams.matchConstraintPercentWidth = horizontal;
                        layoutParams.matchConstraintPercentHeight = vertical;
                        webView.requestLayout();
                        break;
                    case 1:
                        d dVar3 = fVar.a;
                        float f3 = ((ConstraintLayout.LayoutParams) dVar3.e.getLayoutParams()).verticalBias - 0.25f;
                        f = f3 >= 0.0f ? f3 : 0.0f;
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout = dVar3.a;
                        eVar.g(constraintLayout);
                        eVar.o(dVar3.e.getId()).e.y = f;
                        eVar.b(constraintLayout);
                        break;
                    case 2:
                        d dVar4 = fVar.a;
                        float f4 = ((ConstraintLayout.LayoutParams) dVar4.e.getLayoutParams()).verticalBias + 0.25f;
                        f2 = f4 <= 1.0f ? f4 : 1.0f;
                        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout2 = dVar4.a;
                        eVar2.g(constraintLayout2);
                        eVar2.o(dVar4.e.getId()).e.y = f2;
                        eVar2.b(constraintLayout2);
                        break;
                    case 3:
                        d dVar5 = fVar.a;
                        float f5 = ((ConstraintLayout.LayoutParams) dVar5.e.getLayoutParams()).horizontalBias - 0.25f;
                        f = f5 >= 0.0f ? f5 : 0.0f;
                        androidx.constraintlayout.widget.e eVar3 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout3 = dVar5.a;
                        eVar3.g(constraintLayout3);
                        eVar3.o(dVar5.e.getId()).e.x = f;
                        eVar3.b(constraintLayout3);
                        break;
                    case 4:
                        d dVar6 = fVar.a;
                        float f6 = ((ConstraintLayout.LayoutParams) dVar6.e.getLayoutParams()).horizontalBias + 0.25f;
                        f2 = f6 <= 1.0f ? f6 : 1.0f;
                        androidx.constraintlayout.widget.e eVar4 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout4 = dVar6.a;
                        eVar4.g(constraintLayout4);
                        eVar4.o(dVar6.e.getId()).e.x = f2;
                        eVar4.b(constraintLayout4);
                        break;
                    default:
                        PopupWindow popupWindow = fVar.h;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        }
                        fVar.h = null;
                        break;
                }
            }
        });
        this.b = findViewById;
        View findViewById2 = inflate.findViewById(R.id.btn_anchor_top);
        final int i2 = 1;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                float f;
                float f2;
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset = fVar.i;
                        webViewDebugOverlay$ScalePreset.getClass();
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset2 = WebViewDebugOverlay$ScalePreset.values()[(webViewDebugOverlay$ScalePreset.ordinal() + 1) % WebViewDebugOverlay$ScalePreset.values().length];
                        fVar.i = webViewDebugOverlay$ScalePreset2;
                        d dVar2 = fVar.a;
                        float horizontal = webViewDebugOverlay$ScalePreset2.getHorizontal();
                        float vertical = fVar.i.getVertical();
                        View view2 = dVar2.b;
                        WebView webView = dVar2.e;
                        if (horizontal > 1.0f) {
                            horizontal = 1.0f;
                        } else if (horizontal < 0.0f) {
                            horizontal = 0.0f;
                        }
                        if (vertical > 1.0f) {
                            vertical = 1.0f;
                        } else if (vertical < 0.0f) {
                            vertical = 0.0f;
                        }
                        if (horizontal < 1.0f || vertical < 1.0f) {
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            webView.setClipToOutline(true);
                            webView.setElevation(5.0f * uc20.a.density);
                        } else {
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            webView.setElevation(0.0f * uc20.a.density);
                            webView.setClipToOutline(false);
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) webView.getLayoutParams();
                        layoutParams.matchConstraintDefaultWidth = 2;
                        layoutParams.matchConstraintDefaultHeight = 2;
                        layoutParams.matchConstraintPercentWidth = horizontal;
                        layoutParams.matchConstraintPercentHeight = vertical;
                        webView.requestLayout();
                        break;
                    case 1:
                        d dVar3 = fVar.a;
                        float f3 = ((ConstraintLayout.LayoutParams) dVar3.e.getLayoutParams()).verticalBias - 0.25f;
                        f = f3 >= 0.0f ? f3 : 0.0f;
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout = dVar3.a;
                        eVar.g(constraintLayout);
                        eVar.o(dVar3.e.getId()).e.y = f;
                        eVar.b(constraintLayout);
                        break;
                    case 2:
                        d dVar4 = fVar.a;
                        float f4 = ((ConstraintLayout.LayoutParams) dVar4.e.getLayoutParams()).verticalBias + 0.25f;
                        f2 = f4 <= 1.0f ? f4 : 1.0f;
                        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout2 = dVar4.a;
                        eVar2.g(constraintLayout2);
                        eVar2.o(dVar4.e.getId()).e.y = f2;
                        eVar2.b(constraintLayout2);
                        break;
                    case 3:
                        d dVar5 = fVar.a;
                        float f5 = ((ConstraintLayout.LayoutParams) dVar5.e.getLayoutParams()).horizontalBias - 0.25f;
                        f = f5 >= 0.0f ? f5 : 0.0f;
                        androidx.constraintlayout.widget.e eVar3 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout3 = dVar5.a;
                        eVar3.g(constraintLayout3);
                        eVar3.o(dVar5.e.getId()).e.x = f;
                        eVar3.b(constraintLayout3);
                        break;
                    case 4:
                        d dVar6 = fVar.a;
                        float f6 = ((ConstraintLayout.LayoutParams) dVar6.e.getLayoutParams()).horizontalBias + 0.25f;
                        f2 = f6 <= 1.0f ? f6 : 1.0f;
                        androidx.constraintlayout.widget.e eVar4 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout4 = dVar6.a;
                        eVar4.g(constraintLayout4);
                        eVar4.o(dVar6.e.getId()).e.x = f2;
                        eVar4.b(constraintLayout4);
                        break;
                    default:
                        PopupWindow popupWindow = fVar.h;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        }
                        fVar.h = null;
                        break;
                }
            }
        });
        this.c = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.btn_anchor_bottom);
        final int i3 = 2;
        findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                float f;
                float f2;
                int i22 = i3;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset = fVar.i;
                        webViewDebugOverlay$ScalePreset.getClass();
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset2 = WebViewDebugOverlay$ScalePreset.values()[(webViewDebugOverlay$ScalePreset.ordinal() + 1) % WebViewDebugOverlay$ScalePreset.values().length];
                        fVar.i = webViewDebugOverlay$ScalePreset2;
                        d dVar2 = fVar.a;
                        float horizontal = webViewDebugOverlay$ScalePreset2.getHorizontal();
                        float vertical = fVar.i.getVertical();
                        View view2 = dVar2.b;
                        WebView webView = dVar2.e;
                        if (horizontal > 1.0f) {
                            horizontal = 1.0f;
                        } else if (horizontal < 0.0f) {
                            horizontal = 0.0f;
                        }
                        if (vertical > 1.0f) {
                            vertical = 1.0f;
                        } else if (vertical < 0.0f) {
                            vertical = 0.0f;
                        }
                        if (horizontal < 1.0f || vertical < 1.0f) {
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            webView.setClipToOutline(true);
                            webView.setElevation(5.0f * uc20.a.density);
                        } else {
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            webView.setElevation(0.0f * uc20.a.density);
                            webView.setClipToOutline(false);
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) webView.getLayoutParams();
                        layoutParams.matchConstraintDefaultWidth = 2;
                        layoutParams.matchConstraintDefaultHeight = 2;
                        layoutParams.matchConstraintPercentWidth = horizontal;
                        layoutParams.matchConstraintPercentHeight = vertical;
                        webView.requestLayout();
                        break;
                    case 1:
                        d dVar3 = fVar.a;
                        float f3 = ((ConstraintLayout.LayoutParams) dVar3.e.getLayoutParams()).verticalBias - 0.25f;
                        f = f3 >= 0.0f ? f3 : 0.0f;
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout = dVar3.a;
                        eVar.g(constraintLayout);
                        eVar.o(dVar3.e.getId()).e.y = f;
                        eVar.b(constraintLayout);
                        break;
                    case 2:
                        d dVar4 = fVar.a;
                        float f4 = ((ConstraintLayout.LayoutParams) dVar4.e.getLayoutParams()).verticalBias + 0.25f;
                        f2 = f4 <= 1.0f ? f4 : 1.0f;
                        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout2 = dVar4.a;
                        eVar2.g(constraintLayout2);
                        eVar2.o(dVar4.e.getId()).e.y = f2;
                        eVar2.b(constraintLayout2);
                        break;
                    case 3:
                        d dVar5 = fVar.a;
                        float f5 = ((ConstraintLayout.LayoutParams) dVar5.e.getLayoutParams()).horizontalBias - 0.25f;
                        f = f5 >= 0.0f ? f5 : 0.0f;
                        androidx.constraintlayout.widget.e eVar3 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout3 = dVar5.a;
                        eVar3.g(constraintLayout3);
                        eVar3.o(dVar5.e.getId()).e.x = f;
                        eVar3.b(constraintLayout3);
                        break;
                    case 4:
                        d dVar6 = fVar.a;
                        float f6 = ((ConstraintLayout.LayoutParams) dVar6.e.getLayoutParams()).horizontalBias + 0.25f;
                        f2 = f6 <= 1.0f ? f6 : 1.0f;
                        androidx.constraintlayout.widget.e eVar4 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout4 = dVar6.a;
                        eVar4.g(constraintLayout4);
                        eVar4.o(dVar6.e.getId()).e.x = f2;
                        eVar4.b(constraintLayout4);
                        break;
                    default:
                        PopupWindow popupWindow = fVar.h;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        }
                        fVar.h = null;
                        break;
                }
            }
        });
        this.d = findViewById3;
        View findViewById4 = inflate.findViewById(R.id.btn_anchor_left);
        final int i4 = 3;
        findViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                float f;
                float f2;
                int i22 = i4;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset = fVar.i;
                        webViewDebugOverlay$ScalePreset.getClass();
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset2 = WebViewDebugOverlay$ScalePreset.values()[(webViewDebugOverlay$ScalePreset.ordinal() + 1) % WebViewDebugOverlay$ScalePreset.values().length];
                        fVar.i = webViewDebugOverlay$ScalePreset2;
                        d dVar2 = fVar.a;
                        float horizontal = webViewDebugOverlay$ScalePreset2.getHorizontal();
                        float vertical = fVar.i.getVertical();
                        View view2 = dVar2.b;
                        WebView webView = dVar2.e;
                        if (horizontal > 1.0f) {
                            horizontal = 1.0f;
                        } else if (horizontal < 0.0f) {
                            horizontal = 0.0f;
                        }
                        if (vertical > 1.0f) {
                            vertical = 1.0f;
                        } else if (vertical < 0.0f) {
                            vertical = 0.0f;
                        }
                        if (horizontal < 1.0f || vertical < 1.0f) {
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            webView.setClipToOutline(true);
                            webView.setElevation(5.0f * uc20.a.density);
                        } else {
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            webView.setElevation(0.0f * uc20.a.density);
                            webView.setClipToOutline(false);
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) webView.getLayoutParams();
                        layoutParams.matchConstraintDefaultWidth = 2;
                        layoutParams.matchConstraintDefaultHeight = 2;
                        layoutParams.matchConstraintPercentWidth = horizontal;
                        layoutParams.matchConstraintPercentHeight = vertical;
                        webView.requestLayout();
                        break;
                    case 1:
                        d dVar3 = fVar.a;
                        float f3 = ((ConstraintLayout.LayoutParams) dVar3.e.getLayoutParams()).verticalBias - 0.25f;
                        f = f3 >= 0.0f ? f3 : 0.0f;
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout = dVar3.a;
                        eVar.g(constraintLayout);
                        eVar.o(dVar3.e.getId()).e.y = f;
                        eVar.b(constraintLayout);
                        break;
                    case 2:
                        d dVar4 = fVar.a;
                        float f4 = ((ConstraintLayout.LayoutParams) dVar4.e.getLayoutParams()).verticalBias + 0.25f;
                        f2 = f4 <= 1.0f ? f4 : 1.0f;
                        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout2 = dVar4.a;
                        eVar2.g(constraintLayout2);
                        eVar2.o(dVar4.e.getId()).e.y = f2;
                        eVar2.b(constraintLayout2);
                        break;
                    case 3:
                        d dVar5 = fVar.a;
                        float f5 = ((ConstraintLayout.LayoutParams) dVar5.e.getLayoutParams()).horizontalBias - 0.25f;
                        f = f5 >= 0.0f ? f5 : 0.0f;
                        androidx.constraintlayout.widget.e eVar3 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout3 = dVar5.a;
                        eVar3.g(constraintLayout3);
                        eVar3.o(dVar5.e.getId()).e.x = f;
                        eVar3.b(constraintLayout3);
                        break;
                    case 4:
                        d dVar6 = fVar.a;
                        float f6 = ((ConstraintLayout.LayoutParams) dVar6.e.getLayoutParams()).horizontalBias + 0.25f;
                        f2 = f6 <= 1.0f ? f6 : 1.0f;
                        androidx.constraintlayout.widget.e eVar4 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout4 = dVar6.a;
                        eVar4.g(constraintLayout4);
                        eVar4.o(dVar6.e.getId()).e.x = f2;
                        eVar4.b(constraintLayout4);
                        break;
                    default:
                        PopupWindow popupWindow = fVar.h;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        }
                        fVar.h = null;
                        break;
                }
            }
        });
        this.f = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.btn_anchor_right);
        final int i5 = 4;
        findViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                float f;
                float f2;
                int i22 = i5;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset = fVar.i;
                        webViewDebugOverlay$ScalePreset.getClass();
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset2 = WebViewDebugOverlay$ScalePreset.values()[(webViewDebugOverlay$ScalePreset.ordinal() + 1) % WebViewDebugOverlay$ScalePreset.values().length];
                        fVar.i = webViewDebugOverlay$ScalePreset2;
                        d dVar2 = fVar.a;
                        float horizontal = webViewDebugOverlay$ScalePreset2.getHorizontal();
                        float vertical = fVar.i.getVertical();
                        View view2 = dVar2.b;
                        WebView webView = dVar2.e;
                        if (horizontal > 1.0f) {
                            horizontal = 1.0f;
                        } else if (horizontal < 0.0f) {
                            horizontal = 0.0f;
                        }
                        if (vertical > 1.0f) {
                            vertical = 1.0f;
                        } else if (vertical < 0.0f) {
                            vertical = 0.0f;
                        }
                        if (horizontal < 1.0f || vertical < 1.0f) {
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            webView.setClipToOutline(true);
                            webView.setElevation(5.0f * uc20.a.density);
                        } else {
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            webView.setElevation(0.0f * uc20.a.density);
                            webView.setClipToOutline(false);
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) webView.getLayoutParams();
                        layoutParams.matchConstraintDefaultWidth = 2;
                        layoutParams.matchConstraintDefaultHeight = 2;
                        layoutParams.matchConstraintPercentWidth = horizontal;
                        layoutParams.matchConstraintPercentHeight = vertical;
                        webView.requestLayout();
                        break;
                    case 1:
                        d dVar3 = fVar.a;
                        float f3 = ((ConstraintLayout.LayoutParams) dVar3.e.getLayoutParams()).verticalBias - 0.25f;
                        f = f3 >= 0.0f ? f3 : 0.0f;
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout = dVar3.a;
                        eVar.g(constraintLayout);
                        eVar.o(dVar3.e.getId()).e.y = f;
                        eVar.b(constraintLayout);
                        break;
                    case 2:
                        d dVar4 = fVar.a;
                        float f4 = ((ConstraintLayout.LayoutParams) dVar4.e.getLayoutParams()).verticalBias + 0.25f;
                        f2 = f4 <= 1.0f ? f4 : 1.0f;
                        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout2 = dVar4.a;
                        eVar2.g(constraintLayout2);
                        eVar2.o(dVar4.e.getId()).e.y = f2;
                        eVar2.b(constraintLayout2);
                        break;
                    case 3:
                        d dVar5 = fVar.a;
                        float f5 = ((ConstraintLayout.LayoutParams) dVar5.e.getLayoutParams()).horizontalBias - 0.25f;
                        f = f5 >= 0.0f ? f5 : 0.0f;
                        androidx.constraintlayout.widget.e eVar3 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout3 = dVar5.a;
                        eVar3.g(constraintLayout3);
                        eVar3.o(dVar5.e.getId()).e.x = f;
                        eVar3.b(constraintLayout3);
                        break;
                    case 4:
                        d dVar6 = fVar.a;
                        float f6 = ((ConstraintLayout.LayoutParams) dVar6.e.getLayoutParams()).horizontalBias + 0.25f;
                        f2 = f6 <= 1.0f ? f6 : 1.0f;
                        androidx.constraintlayout.widget.e eVar4 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout4 = dVar6.a;
                        eVar4.g(constraintLayout4);
                        eVar4.o(dVar6.e.getId()).e.x = f2;
                        eVar4.b(constraintLayout4);
                        break;
                    default:
                        PopupWindow popupWindow = fVar.h;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        }
                        fVar.h = null;
                        break;
                }
            }
        });
        this.e = findViewById5;
        View findViewById6 = inflate.findViewById(R.id.btn_close);
        final int i6 = 5;
        findViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                float f;
                float f2;
                int i22 = i6;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset = fVar.i;
                        webViewDebugOverlay$ScalePreset.getClass();
                        WebViewDebugOverlay$ScalePreset webViewDebugOverlay$ScalePreset2 = WebViewDebugOverlay$ScalePreset.values()[(webViewDebugOverlay$ScalePreset.ordinal() + 1) % WebViewDebugOverlay$ScalePreset.values().length];
                        fVar.i = webViewDebugOverlay$ScalePreset2;
                        d dVar2 = fVar.a;
                        float horizontal = webViewDebugOverlay$ScalePreset2.getHorizontal();
                        float vertical = fVar.i.getVertical();
                        View view2 = dVar2.b;
                        WebView webView = dVar2.e;
                        if (horizontal > 1.0f) {
                            horizontal = 1.0f;
                        } else if (horizontal < 0.0f) {
                            horizontal = 0.0f;
                        }
                        if (vertical > 1.0f) {
                            vertical = 1.0f;
                        } else if (vertical < 0.0f) {
                            vertical = 0.0f;
                        }
                        if (horizontal < 1.0f || vertical < 1.0f) {
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            webView.setClipToOutline(true);
                            webView.setElevation(5.0f * uc20.a.density);
                        } else {
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            webView.setElevation(0.0f * uc20.a.density);
                            webView.setClipToOutline(false);
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) webView.getLayoutParams();
                        layoutParams.matchConstraintDefaultWidth = 2;
                        layoutParams.matchConstraintDefaultHeight = 2;
                        layoutParams.matchConstraintPercentWidth = horizontal;
                        layoutParams.matchConstraintPercentHeight = vertical;
                        webView.requestLayout();
                        break;
                    case 1:
                        d dVar3 = fVar.a;
                        float f3 = ((ConstraintLayout.LayoutParams) dVar3.e.getLayoutParams()).verticalBias - 0.25f;
                        f = f3 >= 0.0f ? f3 : 0.0f;
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout = dVar3.a;
                        eVar.g(constraintLayout);
                        eVar.o(dVar3.e.getId()).e.y = f;
                        eVar.b(constraintLayout);
                        break;
                    case 2:
                        d dVar4 = fVar.a;
                        float f4 = ((ConstraintLayout.LayoutParams) dVar4.e.getLayoutParams()).verticalBias + 0.25f;
                        f2 = f4 <= 1.0f ? f4 : 1.0f;
                        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout2 = dVar4.a;
                        eVar2.g(constraintLayout2);
                        eVar2.o(dVar4.e.getId()).e.y = f2;
                        eVar2.b(constraintLayout2);
                        break;
                    case 3:
                        d dVar5 = fVar.a;
                        float f5 = ((ConstraintLayout.LayoutParams) dVar5.e.getLayoutParams()).horizontalBias - 0.25f;
                        f = f5 >= 0.0f ? f5 : 0.0f;
                        androidx.constraintlayout.widget.e eVar3 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout3 = dVar5.a;
                        eVar3.g(constraintLayout3);
                        eVar3.o(dVar5.e.getId()).e.x = f;
                        eVar3.b(constraintLayout3);
                        break;
                    case 4:
                        d dVar6 = fVar.a;
                        float f6 = ((ConstraintLayout.LayoutParams) dVar6.e.getLayoutParams()).horizontalBias + 0.25f;
                        f2 = f6 <= 1.0f ? f6 : 1.0f;
                        androidx.constraintlayout.widget.e eVar4 = new androidx.constraintlayout.widget.e();
                        ConstraintLayout constraintLayout4 = dVar6.a;
                        eVar4.g(constraintLayout4);
                        eVar4.o(dVar6.e.getId()).e.x = f2;
                        eVar4.b(constraintLayout4);
                        break;
                    default:
                        PopupWindow popupWindow = fVar.h;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        }
                        fVar.h = null;
                        break;
                }
            }
        });
        this.g = findViewById6;
        this.j = inflate;
    }
}
