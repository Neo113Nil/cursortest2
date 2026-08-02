package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivTreeVisitorKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikn;
import xsna.s3q0;

/* compiled from: DivBinder.kt */
/* loaded from: classes7.dex */
public class DivBinder {
    private final DivContainerBinder containerBinder;
    private final DivCustomBinder customBinder;
    private final DivExtensionController extensionController;
    private final DivGalleryBinder galleryBinder;
    private final DivGifImageBinder gifImageBinder;
    private final DivGridBinder gridBinder;
    private final DivImageBinder imageBinder;
    private final DivIndicatorBinder indicatorBinder;
    private final DivInputBinder inputBinder;
    private final DivPagerBinder pagerBinder;
    private final PagerIndicatorConnector pagerIndicatorConnector;
    private final DivSelectBinder selectBinder;
    private final DivSeparatorBinder separatorBinder;
    private final DivSliderBinder sliderBinder;
    private final DivStateBinder stateBinder;
    private final DivSwitchBinder switchBinder;
    private final DivTabsBinder tabsBinder;
    private final DivTextBinder textBinder;
    private final DivValidator validator;
    private final DivVideoBinder videoBinder;

    public DivBinder(DivValidator divValidator, DivTextBinder divTextBinder, DivContainerBinder divContainerBinder, DivSeparatorBinder divSeparatorBinder, DivImageBinder divImageBinder, DivGifImageBinder divGifImageBinder, DivGridBinder divGridBinder, DivGalleryBinder divGalleryBinder, DivPagerBinder divPagerBinder, DivTabsBinder divTabsBinder, DivStateBinder divStateBinder, DivCustomBinder divCustomBinder, DivIndicatorBinder divIndicatorBinder, DivSliderBinder divSliderBinder, DivInputBinder divInputBinder, DivSelectBinder divSelectBinder, DivVideoBinder divVideoBinder, DivExtensionController divExtensionController, PagerIndicatorConnector pagerIndicatorConnector, DivSwitchBinder divSwitchBinder) {
        this.validator = divValidator;
        this.textBinder = divTextBinder;
        this.containerBinder = divContainerBinder;
        this.separatorBinder = divSeparatorBinder;
        this.imageBinder = divImageBinder;
        this.gifImageBinder = divGifImageBinder;
        this.gridBinder = divGridBinder;
        this.galleryBinder = divGalleryBinder;
        this.pagerBinder = divPagerBinder;
        this.tabsBinder = divTabsBinder;
        this.stateBinder = divStateBinder;
        this.customBinder = divCustomBinder;
        this.indicatorBinder = divIndicatorBinder;
        this.sliderBinder = divSliderBinder;
        this.inputBinder = divInputBinder;
        this.selectBinder = divSelectBinder;
        this.videoBinder = divVideoBinder;
        this.extensionController = divExtensionController;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.switchBinder = divSwitchBinder;
    }

    private void bindContainer(BindingContext bindingContext, View view, a.C2110a c2110a, DivStatePath divStatePath) {
        this.containerBinder.bindView(bindingContext, (ViewGroup) view, c2110a, divStatePath);
    }

    private void bindCustom(BindingContext bindingContext, View view, a.b bVar, DivStatePath divStatePath) {
        this.customBinder.bindView(bindingContext, (DivCustomWrapper) view, bVar, divStatePath);
    }

    private void bindGallery(BindingContext bindingContext, View view, a.c cVar, DivStatePath divStatePath) {
        this.galleryBinder.bindView(bindingContext, (DivRecyclerView) view, cVar, divStatePath);
    }

    private void bindGifImage(BindingContext bindingContext, View view, a.d dVar) {
        this.gifImageBinder.bindView(bindingContext, (DivGifImageView) view, dVar);
    }

    private void bindGrid(BindingContext bindingContext, View view, a.e eVar, DivStatePath divStatePath) {
        this.gridBinder.bindView(bindingContext, (DivGridLayout) view, eVar, divStatePath);
    }

    private void bindImage(BindingContext bindingContext, View view, a.f fVar) {
        this.imageBinder.bindView(bindingContext, (DivImageView) view, fVar);
    }

    private void bindIndicator(BindingContext bindingContext, View view, a.g gVar) {
        this.indicatorBinder.bindView(bindingContext, (DivPagerIndicatorView) view, gVar);
    }

    private void bindInput(BindingContext bindingContext, View view, a.h hVar, DivStatePath divStatePath) {
        this.inputBinder.bindView(bindingContext, (DivInputView) view, hVar, divStatePath);
    }

    private void bindLayoutParams(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt.applyMargins(view, iknVar.g(), expressionResolver);
    }

    private void bindPager(BindingContext bindingContext, View view, a.i iVar, DivStatePath divStatePath) {
        this.pagerBinder.bindView(bindingContext, (DivPagerView) view, iVar, divStatePath);
    }

    private void bindSelect(BindingContext bindingContext, View view, a.j jVar, DivStatePath divStatePath) {
        this.selectBinder.bindView(bindingContext, (DivSelectView) view, jVar, divStatePath);
    }

    private void bindSeparator(BindingContext bindingContext, View view, a.k kVar) {
        this.separatorBinder.bindView(bindingContext, (DivSeparatorView) view, kVar);
    }

    private void bindSlider(BindingContext bindingContext, View view, a.l lVar, DivStatePath divStatePath) {
        this.sliderBinder.bindView(bindingContext, (DivSliderView) view, lVar, divStatePath);
    }

    private void bindState(BindingContext bindingContext, View view, a.m mVar, DivStatePath divStatePath) {
        this.stateBinder.bindView(bindingContext, (DivStateLayout) view, mVar, divStatePath);
    }

    private void bindSwitch(BindingContext bindingContext, View view, a.n nVar, DivStatePath divStatePath) {
        this.switchBinder.bindView(bindingContext, (DivSwitchView) view, nVar, divStatePath);
    }

    private void bindTabs(BindingContext bindingContext, View view, a.o oVar, DivStatePath divStatePath) {
        this.tabsBinder.bindView(bindingContext, (DivTabsLayout) view, oVar, divStatePath);
    }

    private void bindText(BindingContext bindingContext, View view, a.p pVar) {
        this.textBinder.bindView(bindingContext, (DivLineHeightTextView) view, pVar);
    }

    private void bindVideo(BindingContext bindingContext, View view, a.q qVar, DivStatePath divStatePath) {
        this.videoBinder.bindView(bindingContext, (DivVideoView) view, qVar, divStatePath);
    }

    public void attachIndicators$div_release() {
        this.pagerIndicatorConnector.attach$div_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bind(BindingContext bindingContext, View view, a aVar, DivStatePath divStatePath) {
        boolean isExpressionResolveFail;
        a div;
        try {
            BindingContext childContext = DivTreeVisitorKt.getChildContext(bindingContext, aVar, divStatePath);
            Div2View divView = childContext.getDivView();
            ExpressionResolver expressionResolver = childContext.getExpressionResolver();
            ReusableTokenList currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release == null || currentRebindReusableList$div_release.pop(aVar) == null) {
                if (!this.validator.validate(aVar, expressionResolver)) {
                    bindLayoutParams(view, aVar.b(), expressionResolver);
                    return;
                }
                this.extensionController.beforeBindView(divView, expressionResolver, view, aVar.b());
                if (!(aVar instanceof a.b) && (div = ((DivHolderView) view).getDiv()) != null) {
                    this.extensionController.unbindView(divView, expressionResolver, view, div.b());
                }
                if (aVar instanceof a.p) {
                    bindText(childContext, view, (a.p) aVar);
                } else if (aVar instanceof a.f) {
                    bindImage(childContext, view, (a.f) aVar);
                } else if (aVar instanceof a.d) {
                    bindGifImage(childContext, view, (a.d) aVar);
                } else if (aVar instanceof a.k) {
                    bindSeparator(childContext, view, (a.k) aVar);
                } else if (aVar instanceof a.C2110a) {
                    bindContainer(childContext, view, (a.C2110a) aVar, divStatePath);
                } else if (aVar instanceof a.e) {
                    bindGrid(childContext, view, (a.e) aVar, divStatePath);
                } else if (aVar instanceof a.c) {
                    bindGallery(childContext, view, (a.c) aVar, divStatePath);
                } else if (aVar instanceof a.i) {
                    bindPager(childContext, view, (a.i) aVar, divStatePath);
                } else if (aVar instanceof a.o) {
                    bindTabs(childContext, view, (a.o) aVar, divStatePath);
                } else if (aVar instanceof a.m) {
                    bindState(childContext, view, (a.m) aVar, divStatePath);
                } else if (aVar instanceof a.b) {
                    bindCustom(childContext, view, (a.b) aVar, divStatePath);
                } else if (aVar instanceof a.g) {
                    bindIndicator(childContext, view, (a.g) aVar);
                } else if (aVar instanceof a.l) {
                    bindSlider(childContext, view, (a.l) aVar, divStatePath);
                } else if (aVar instanceof a.h) {
                    bindInput(childContext, view, (a.h) aVar, divStatePath);
                } else if (aVar instanceof a.j) {
                    bindSelect(childContext, view, (a.j) aVar, divStatePath);
                } else if (aVar instanceof a.q) {
                    bindVideo(childContext, view, (a.q) aVar, divStatePath);
                } else {
                    if (!(aVar instanceof a.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bindSwitch(childContext, view, (a.n) aVar, divStatePath);
                }
                s3q0 s3q0Var = s3q0.a;
                if (aVar instanceof a.b) {
                    return;
                }
                this.extensionController.bindView(divView, expressionResolver, view, aVar.b());
            }
        } catch (ParsingException e) {
            isExpressionResolveFail = ExpressionFallbacksHelperKt.isExpressionResolveFail(e);
            if (!isExpressionResolveFail) {
                throw e;
            }
        }
    }
}
