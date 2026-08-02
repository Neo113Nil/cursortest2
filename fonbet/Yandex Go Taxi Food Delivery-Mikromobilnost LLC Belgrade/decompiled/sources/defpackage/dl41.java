package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class dl41 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebStoriesView b;
    public final /* synthetic */ int c;

    public /* synthetic */ dl41(WebStoriesView webStoriesView, int i, int i2) {
        this.a = i2;
        this.b = webStoriesView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        WebStoriesView webStoriesView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = webStoriesView.findViewById(i2);
                    if (findViewById != null) {
                        return (WebViewContainer) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = webStoriesView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (ViewGroup) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = webStoriesView.findViewById(i2);
                    if (findViewById3 != null) {
                        return (ViewGroup) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            case 3:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = webStoriesView.findViewById(i2);
                    if (findViewById4 != null) {
                        return (ViewGroup) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
            case 4:
                kgx kgxVar5 = (kgx) obj;
                try {
                    View findViewById5 = webStoriesView.findViewById(i2);
                    if (findViewById5 != null) {
                        return (ViewGroup) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e5) {
                    dy31.f(kgxVar5, e5);
                    return null;
                }
            default:
                kgx kgxVar6 = (kgx) obj;
                try {
                    View findViewById6 = webStoriesView.findViewById(i2);
                    if (findViewById6 != null) {
                        return (ViewGroup) findViewById6;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e6) {
                    dy31.f(kgxVar6, e6);
                    return null;
                }
        }
    }
}
