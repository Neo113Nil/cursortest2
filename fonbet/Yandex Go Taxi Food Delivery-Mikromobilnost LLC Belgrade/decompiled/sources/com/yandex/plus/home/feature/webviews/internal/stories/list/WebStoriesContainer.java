package com.yandex.plus.home.feature.webviews.internal.stories.list;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import com.yandex.plus.home.feature.webviews.internal.stories.list.WebStoriesContainer;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import defpackage.bb1;
import defpackage.emh0;
import defpackage.fc01;
import defpackage.gje;
import defpackage.i3y;
import defpackage.jr31;
import defpackage.kgx;
import defpackage.nk41;
import defpackage.pk41;
import defpackage.qk41;
import defpackage.qoi0;
import defpackage.rk41;
import defpackage.rx3;
import defpackage.sk41;
import defpackage.skd0;
import defpackage.sls;
import defpackage.tls;
import defpackage.v45;
import defpackage.v9h0;
import defpackage.vk41;
import defpackage.wk41;
import defpackage.wv5;
import defpackage.xj01;
import defpackage.xzr;
import defpackage.yk41;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$FloatRef;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002GL\b\u0001\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0012J%\u0010\u001f\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010'\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001dH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010\u0012J-\u0010.\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001d2\u0014\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0011\u00100\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00105R\u001a\u00107\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/stories/list/WebStoriesContainer;", "Landroid/widget/FrameLayout;", "Lgje;", "Lsk41;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lwk41;", "Lcom/yandex/plus/home/feature/webviews/internal/stories/WebStoriesView;", "viewFactory", "Lvk41;", "presenter", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "webViewsRouter", "<init>", "(Landroid/content/Context;Ltls;Lvk41;Lcom/yandex/plus/home/feature/webviews/internal/container/b;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onResume", "onPause", "", "onBackPressed", "()Z", "onModalHide", "onModalExpanded", "", "storiesEntry", "", "currentPosition", "showStories", "(Ljava/util/List;I)V", "pagePosition", "isSelected", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$StoryNavigationType;", "tapDirection", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$MiniStoryControlType;", "navigationType", "setStorySelected", "(IZLcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$StoryNavigationType;Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage$StoryIsVisibleEvent$MiniStoryControlType;)V", "position", "selectPage", "(I)V", "dismiss", "block", "onStoriesViewReady", "(ILtls;)V", "getCurrentStoriesView", "()Lcom/yandex/plus/home/feature/webviews/internal/stories/WebStoriesView;", "getStoriesView", "(I)Lcom/yandex/plus/home/feature/webviews/internal/stories/WebStoriesView;", "Lvk41;", "Lcom/yandex/plus/home/feature/webviews/internal/container/b;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager$delegate", "Lwv5;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Lnk41;", "adapter$delegate", "Li3y;", "getAdapter", "()Lnk41;", "adapter", "qk41", "pageChangeListener$delegate", "getPageChangeListener", "()Lqk41;", "pageChangeListener", "rk41", "viewPagerItemsProvider$delegate", "getViewPagerItemsProvider", "()Lrk41;", "viewPagerItemsProvider", "Lyk41;", "pageChangeCallback$delegate", "getPageChangeCallback", "()Lyk41;", "pageChangeCallback", "Companion", "pk41", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebStoriesContainer extends FrameLayout implements gje, sk41 {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    private static final pk41 Companion;

    @Deprecated
    public static final float PAGE_SCALE_FACTOR = 0.8f;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;

    /* renamed from: pageChangeCallback$delegate, reason: from kotlin metadata */
    private final i3y pageChangeCallback;

    /* renamed from: pageChangeListener$delegate, reason: from kotlin metadata */
    private final i3y pageChangeListener;
    private final vk41 presenter;
    private final View view;

    /* renamed from: viewPager$delegate, reason: from kotlin metadata */
    private final wv5 viewPager;

    /* renamed from: viewPagerItemsProvider$delegate, reason: from kotlin metadata */
    private final i3y viewPagerItemsProvider;
    private final b webViewsRouter;

    public static final class a implements tls {
        public static final a a = new a();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof RecyclerView);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("viewPager", 0, "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", WebStoriesContainer.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
        Companion = new pk41();
    }

    public WebStoriesContainer(Context context, tls tlsVar, vk41 vk41Var, b bVar) {
        super(context);
        this.presenter = vk41Var;
        this.webViewsRouter = bVar;
        this.view = this;
        this.viewPager = new wv5(new xzr(this, v9h0.view_pager, 6));
        this.adapter = kotlin.a.a(new fc01(25, tlsVar));
        final int i = 0;
        this.pageChangeListener = kotlin.a.a(new sls(this) { // from class: ok41
            public final /* synthetic */ WebStoriesContainer b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qk41 pageChangeListener_delegate$lambda$1;
                rk41 viewPagerItemsProvider_delegate$lambda$2;
                yk41 pageChangeCallback_delegate$lambda$3;
                int i2 = i;
                WebStoriesContainer webStoriesContainer = this.b;
                switch (i2) {
                    case 0:
                        pageChangeListener_delegate$lambda$1 = WebStoriesContainer.pageChangeListener_delegate$lambda$1(webStoriesContainer);
                        return pageChangeListener_delegate$lambda$1;
                    case 1:
                        viewPagerItemsProvider_delegate$lambda$2 = WebStoriesContainer.viewPagerItemsProvider_delegate$lambda$2(webStoriesContainer);
                        return viewPagerItemsProvider_delegate$lambda$2;
                    default:
                        pageChangeCallback_delegate$lambda$3 = WebStoriesContainer.pageChangeCallback_delegate$lambda$3(webStoriesContainer);
                        return pageChangeCallback_delegate$lambda$3;
                }
            }
        });
        final int i2 = 1;
        this.viewPagerItemsProvider = kotlin.a.a(new sls(this) { // from class: ok41
            public final /* synthetic */ WebStoriesContainer b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qk41 pageChangeListener_delegate$lambda$1;
                rk41 viewPagerItemsProvider_delegate$lambda$2;
                yk41 pageChangeCallback_delegate$lambda$3;
                int i22 = i2;
                WebStoriesContainer webStoriesContainer = this.b;
                switch (i22) {
                    case 0:
                        pageChangeListener_delegate$lambda$1 = WebStoriesContainer.pageChangeListener_delegate$lambda$1(webStoriesContainer);
                        return pageChangeListener_delegate$lambda$1;
                    case 1:
                        viewPagerItemsProvider_delegate$lambda$2 = WebStoriesContainer.viewPagerItemsProvider_delegate$lambda$2(webStoriesContainer);
                        return viewPagerItemsProvider_delegate$lambda$2;
                    default:
                        pageChangeCallback_delegate$lambda$3 = WebStoriesContainer.pageChangeCallback_delegate$lambda$3(webStoriesContainer);
                        return pageChangeCallback_delegate$lambda$3;
                }
            }
        });
        final int i3 = 2;
        this.pageChangeCallback = kotlin.a.a(new sls(this) { // from class: ok41
            public final /* synthetic */ WebStoriesContainer b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                qk41 pageChangeListener_delegate$lambda$1;
                rk41 viewPagerItemsProvider_delegate$lambda$2;
                yk41 pageChangeCallback_delegate$lambda$3;
                int i22 = i3;
                WebStoriesContainer webStoriesContainer = this.b;
                switch (i22) {
                    case 0:
                        pageChangeListener_delegate$lambda$1 = WebStoriesContainer.pageChangeListener_delegate$lambda$1(webStoriesContainer);
                        return pageChangeListener_delegate$lambda$1;
                    case 1:
                        viewPagerItemsProvider_delegate$lambda$2 = WebStoriesContainer.viewPagerItemsProvider_delegate$lambda$2(webStoriesContainer);
                        return viewPagerItemsProvider_delegate$lambda$2;
                    default:
                        pageChangeCallback_delegate$lambda$3 = WebStoriesContainer.pageChangeCallback_delegate$lambda$3(webStoriesContainer);
                        return pageChangeCallback_delegate$lambda$3;
                }
            }
        });
        skd0.e(PlusLogTag.UI, "init()");
        bb1.v(this, emh0.plus_sdk_web_stories_container, true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RecyclerView recyclerView = (RecyclerView) kotlin.sequences.b.j(kotlin.sequences.b.g(new jr31(getViewPager(), i), a.a));
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
        getViewPager().registerOnPageChangeCallback(getPageChangeCallback());
        getViewPager().setOffscreenPageLimit(3);
        getViewPager().setAdapter(getAdapter());
        getViewPager().setPageTransformer(new xj01(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(View view, float f) {
        float abs = 1.0f - (Math.abs(f) * 0.19999999f);
        view.setScaleX(abs);
        view.setScaleY(abs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nk41 adapter_delegate$lambda$0(tls tlsVar) {
        return new nk41(tlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nk41 getAdapter() {
        return (nk41) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebStoriesView getCurrentStoriesView() {
        return getStoriesView(getViewPager().getCurrentItem());
    }

    private final yk41 getPageChangeCallback() {
        return (yk41) this.pageChangeCallback.getValue();
    }

    private final qk41 getPageChangeListener() {
        return (qk41) this.pageChangeListener.getValue();
    }

    private final WebStoriesView getStoriesView(int position) {
        wk41 wk41Var = (wk41) kotlin.collections.a.S(position, getAdapter().b);
        if (wk41Var != null) {
            return (WebStoriesView) getViewPager().findViewWithTag(Integer.valueOf(wk41Var.hashCode()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewPager2 getViewPager() {
        return (ViewPager2) this.viewPager.a($$delegatedProperties[0]);
    }

    private final rk41 getViewPagerItemsProvider() {
        return (rk41) this.viewPagerItemsProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStoriesViewReady(int position, tls block) {
        WebStoriesView storiesView = getStoriesView(position);
        if (storiesView != null) {
            block.invoke(storiesView);
        } else {
            getAdapter().c = new v45(position, block, this, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onStoriesViewReady$lambda$6(int i, tls tlsVar, WebStoriesContainer webStoriesContainer, int i2) {
        if (i == i2) {
            tlsVar.invoke(webStoriesContainer.getStoriesView(i));
            webStoriesContainer.getAdapter().c = null;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yk41 pageChangeCallback_delegate$lambda$3(WebStoriesContainer webStoriesContainer) {
        return new yk41(webStoriesContainer.getPageChangeListener(), webStoriesContainer.getViewPagerItemsProvider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qk41 pageChangeListener_delegate$lambda$1(WebStoriesContainer webStoriesContainer) {
        return new qk41(webStoriesContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setStorySelected$lambda$5(boolean z, InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType, InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType, WebStoriesView webStoriesView) {
        if (webStoriesView != null) {
            webStoriesView.setStorySelected(z, inMessage$StoryIsVisibleEvent$StoryNavigationType, inMessage$StoryIsVisibleEvent$MiniStoryControlType);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rk41 viewPagerItemsProvider_delegate$lambda$2(WebStoriesContainer webStoriesContainer) {
        return new rk41(webStoriesContainer);
    }

    @Override // defpackage.sk41
    public void dismiss() {
        skd0.b(PlusLogTag.UI, "WebStories dismiss");
        ((com.yandex.plus.home.feature.webviews.internal.container.a) this.webViewsRouter).k();
    }

    @Override // defpackage.gje
    public View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        skd0.e(PlusLogTag.UI, "onAttachedToWindow()");
        vk41 vk41Var = this.presenter;
        vk41Var.b(this);
        List list = vk41Var.f;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((wk41) it.next()).b) {
                break;
            } else {
                i++;
            }
        }
        showStories(list, i >= 0 ? i : 0);
    }

    @Override // defpackage.gje
    public boolean onBackPressed() {
        WebStoriesView currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            return currentStoriesView.onBackPressed();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        skd0.e(PlusLogTag.UI, "onDetachedFromWindow()");
        this.presenter.d();
        getViewPager().unregisterOnPageChangeCallback(getPageChangeCallback());
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onHasStartedBeingOverlapped() {
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onHasStoppedBeingOverlapped() {
    }

    @Override // defpackage.gje
    public void onModalExpanded() {
        WebStoriesView currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            currentStoriesView.setIsFullyVisible(true);
        }
    }

    @Override // defpackage.gje
    public void onModalHide() {
        WebStoriesView currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            currentStoriesView.setIsFullyVisible(false);
        }
    }

    @Override // defpackage.gje
    public void onPause() {
        skd0.e(PlusLogTag.UI, "onPause()");
        WebStoriesView currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            currentStoriesView.setIsFullyVisible(false);
        }
        getAdapter().w = false;
    }

    @Override // defpackage.gje
    public void onResume() {
        skd0.e(PlusLogTag.UI, "onResume()");
        getAdapter().w = true;
        WebStoriesView currentStoriesView = getCurrentStoriesView();
        if (currentStoriesView != null) {
            currentStoriesView.setIsFullyVisible(true);
        }
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onStart() {
    }

    @Override // defpackage.gje
    public /* bridge */ /* synthetic */ void onStop() {
    }

    @Override // defpackage.sk41
    public void selectPage(int position) {
        skd0.b(PlusLogTag.UI, "WebStories selectPage position = " + position);
        final ViewPager2 viewPager = getViewPager();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        final int abs = Math.abs(viewPager.getCurrentItem() - position);
        final boolean z = viewPager.getCurrentItem() < position;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, viewPager.getWidth());
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rt31
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Ref$FloatRef ref$FloatRef2 = Ref$FloatRef.this;
                float f = (floatValue - ref$FloatRef2.element) * abs;
                if (z) {
                    f *= -1.0f;
                }
                viewPager.fakeDragBy(f);
                ref$FloatRef2.element = floatValue;
            }
        });
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.home.feature.webviews.internal.utils.ViewPagerUtilsKt$smoothScrollTo$lambda$3$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ViewPager2.this.beginFakeDrag();
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.home.feature.webviews.internal.utils.ViewPagerUtilsKt$smoothScrollTo$lambda$3$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewPager2.this.endFakeDrag();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }

    @Override // defpackage.sk41
    public void setStorySelected(int pagePosition, boolean isSelected, InMessage$StoryIsVisibleEvent$StoryNavigationType tapDirection, InMessage$StoryIsVisibleEvent$MiniStoryControlType navigationType) {
        skd0.b(PlusLogTag.UI, "WebStories updatePageState position = " + pagePosition + ", isSelected = " + isSelected + ", tapDirection = " + tapDirection + ", navigationType = " + navigationType);
        onStoriesViewReady(pagePosition, new rx3(isSelected, tapDirection, navigationType, 22));
    }

    @Override // defpackage.sk41
    public void showStories(List<wk41> storiesEntry, int currentPosition) {
        nk41 adapter = getAdapter();
        ArrayList arrayList = adapter.b;
        arrayList.clear();
        arrayList.addAll(storiesEntry);
        adapter.notifyDataSetChanged();
        getViewPager().setCurrentItem(currentPosition, false);
    }
}
