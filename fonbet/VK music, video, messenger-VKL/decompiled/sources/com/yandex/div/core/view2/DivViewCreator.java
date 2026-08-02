package com.yandex.div.core.view2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
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
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivContainer;
import com.yandex.div2.a;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.myc0;
import xsna.zcl;

/* compiled from: DivViewCreator.kt */
/* loaded from: classes7.dex */
public class DivViewCreator extends DivVisitor<View> {
    public static final Companion Companion = new Companion(null);
    private static final String[] TAGS = {"DIV2.TEXT_VIEW", "DIV2.IMAGE_VIEW", "DIV2.IMAGE_GIF_VIEW", "DIV2.OVERLAP_CONTAINER_VIEW", "DIV2.LINEAR_CONTAINER_VIEW", "DIV2.WRAP_CONTAINER_VIEW", "DIV2.GRID_VIEW", "DIV2.GALLERY_VIEW", "DIV2.PAGER_VIEW", "DIV2.TAB_VIEW", "DIV2.STATE", "DIV2.CUSTOM", "DIV2.INDICATOR", "DIV2.SLIDER", "DIV2.INPUT", "DIV2.SELECT", "DIV2.VIDEO", "DIV2.SWITCH"};
    private final Context context;
    private final DivValidator validator;
    private final ViewPool viewPool;
    private ViewPreCreationProfile viewPreCreationProfile;

    /* compiled from: DivViewCreator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTag(a aVar, ExpressionResolver expressionResolver) {
            if (aVar instanceof a.C2110a) {
                a.C2110a c2110a = (a.C2110a) aVar;
                return DivUtilKt.isWrapContainer(c2110a.c, expressionResolver) ? "DIV2.WRAP_CONTAINER_VIEW" : c2110a.c.I.evaluate(expressionResolver) == DivContainer.Orientation.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
            }
            if (aVar instanceof a.b) {
                return "DIV2.CUSTOM";
            }
            if (aVar instanceof a.c) {
                return "DIV2.GALLERY_VIEW";
            }
            if (aVar instanceof a.d) {
                return "DIV2.IMAGE_GIF_VIEW";
            }
            if (aVar instanceof a.e) {
                return "DIV2.GRID_VIEW";
            }
            if (aVar instanceof a.f) {
                return "DIV2.IMAGE_VIEW";
            }
            if (aVar instanceof a.g) {
                return "DIV2.INDICATOR";
            }
            if (aVar instanceof a.h) {
                return "DIV2.INPUT";
            }
            if (aVar instanceof a.i) {
                return "DIV2.PAGER_VIEW";
            }
            if (aVar instanceof a.j) {
                return "DIV2.SELECT";
            }
            if (aVar instanceof a.l) {
                return "DIV2.SLIDER";
            }
            if (aVar instanceof a.n) {
                return "DIV2.SWITCH";
            }
            if (aVar instanceof a.m) {
                return "DIV2.STATE";
            }
            if (aVar instanceof a.o) {
                return "DIV2.TAB_VIEW";
            }
            if (aVar instanceof a.p) {
                return "DIV2.TEXT_VIEW";
            }
            if (aVar instanceof a.q) {
                return "DIV2.VIDEO";
            }
            if (aVar instanceof a.k) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    public DivViewCreator(Context context, ViewPool viewPool, DivValidator divValidator, ViewPreCreationProfile viewPreCreationProfile, ViewPreCreationProfileRepository viewPreCreationProfileRepository) {
        this.context = context;
        this.viewPool = viewPool;
        this.validator = divValidator;
        String id = viewPreCreationProfile.getId();
        if (id != null) {
            ViewPreCreationProfile viewPreCreationProfile2 = (ViewPreCreationProfile) myc0.i(EmptyCoroutineContext.b, new DivViewCreator$viewPreCreationProfile$1$1(viewPreCreationProfileRepository, id, null));
            if (viewPreCreationProfile2 != null) {
                viewPreCreationProfile = viewPreCreationProfile2;
            }
        }
        this.viewPreCreationProfile = viewPreCreationProfile;
        ViewPreCreationProfile viewPreCreationProfile3 = getViewPreCreationProfile();
        viewPool.register("DIV2.TEXT_VIEW", new ViewFactory() { // from class: xsna.rqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivLineHeightTextView lambda$22$lambda$21$lambda$3;
                lambda$22$lambda$21$lambda$3 = DivViewCreator.lambda$22$lambda$21$lambda$3(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$3;
            }
        }, viewPreCreationProfile3.getText().getCapacity());
        viewPool.register("DIV2.IMAGE_VIEW", new ViewFactory() { // from class: xsna.irn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivImageView lambda$22$lambda$21$lambda$4;
                lambda$22$lambda$21$lambda$4 = DivViewCreator.lambda$22$lambda$21$lambda$4(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$4;
            }
        }, viewPreCreationProfile3.getImage().getCapacity());
        viewPool.register("DIV2.IMAGE_GIF_VIEW", new ViewFactory() { // from class: xsna.sqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivGifImageView lambda$22$lambda$21$lambda$5;
                lambda$22$lambda$21$lambda$5 = DivViewCreator.lambda$22$lambda$21$lambda$5(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$5;
            }
        }, viewPreCreationProfile3.getGifImage().getCapacity());
        viewPool.register("DIV2.OVERLAP_CONTAINER_VIEW", new ViewFactory() { // from class: xsna.tqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivFrameLayout lambda$22$lambda$21$lambda$6;
                lambda$22$lambda$21$lambda$6 = DivViewCreator.lambda$22$lambda$21$lambda$6(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$6;
            }
        }, viewPreCreationProfile3.getOverlapContainer().getCapacity());
        viewPool.register("DIV2.LINEAR_CONTAINER_VIEW", new ViewFactory() { // from class: xsna.uqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivLinearLayout lambda$22$lambda$21$lambda$7;
                lambda$22$lambda$21$lambda$7 = DivViewCreator.lambda$22$lambda$21$lambda$7(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$7;
            }
        }, viewPreCreationProfile3.getLinearContainer().getCapacity());
        viewPool.register("DIV2.WRAP_CONTAINER_VIEW", new ViewFactory() { // from class: xsna.vqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivWrapLayout lambda$22$lambda$21$lambda$8;
                lambda$22$lambda$21$lambda$8 = DivViewCreator.lambda$22$lambda$21$lambda$8(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$8;
            }
        }, viewPreCreationProfile3.getWrapContainer().getCapacity());
        viewPool.register("DIV2.GRID_VIEW", new ViewFactory() { // from class: xsna.wqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivGridLayout lambda$22$lambda$21$lambda$9;
                lambda$22$lambda$21$lambda$9 = DivViewCreator.lambda$22$lambda$21$lambda$9(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$9;
            }
        }, viewPreCreationProfile3.getGrid().getCapacity());
        viewPool.register("DIV2.GALLERY_VIEW", new ViewFactory() { // from class: xsna.xqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivRecyclerView lambda$22$lambda$21$lambda$10;
                lambda$22$lambda$21$lambda$10 = DivViewCreator.lambda$22$lambda$21$lambda$10(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$10;
            }
        }, viewPreCreationProfile3.getGallery().getCapacity());
        viewPool.register("DIV2.PAGER_VIEW", new ViewFactory() { // from class: xsna.yqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivPagerView lambda$22$lambda$21$lambda$11;
                lambda$22$lambda$21$lambda$11 = DivViewCreator.lambda$22$lambda$21$lambda$11(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$11;
            }
        }, viewPreCreationProfile3.getPager().getCapacity());
        viewPool.register("DIV2.TAB_VIEW", new ViewFactory() { // from class: xsna.zqn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivTabsLayout lambda$22$lambda$21$lambda$12;
                lambda$22$lambda$21$lambda$12 = DivViewCreator.lambda$22$lambda$21$lambda$12(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$12;
            }
        }, viewPreCreationProfile3.getTab().getCapacity());
        viewPool.register("DIV2.STATE", new ViewFactory() { // from class: xsna.arn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivStateLayout lambda$22$lambda$21$lambda$13;
                lambda$22$lambda$21$lambda$13 = DivViewCreator.lambda$22$lambda$21$lambda$13(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$13;
            }
        }, viewPreCreationProfile3.getState().getCapacity());
        viewPool.register("DIV2.CUSTOM", new ViewFactory() { // from class: xsna.brn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivCustomWrapper lambda$22$lambda$21$lambda$14;
                lambda$22$lambda$21$lambda$14 = DivViewCreator.lambda$22$lambda$21$lambda$14(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$14;
            }
        }, viewPreCreationProfile3.getCustom().getCapacity());
        viewPool.register("DIV2.INDICATOR", new ViewFactory() { // from class: xsna.crn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivPagerIndicatorView lambda$22$lambda$21$lambda$15;
                lambda$22$lambda$21$lambda$15 = DivViewCreator.lambda$22$lambda$21$lambda$15(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$15;
            }
        }, viewPreCreationProfile3.getIndicator().getCapacity());
        viewPool.register("DIV2.SLIDER", new ViewFactory() { // from class: xsna.drn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivSliderView lambda$22$lambda$21$lambda$16;
                lambda$22$lambda$21$lambda$16 = DivViewCreator.lambda$22$lambda$21$lambda$16(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$16;
            }
        }, viewPreCreationProfile3.getSlider().getCapacity());
        viewPool.register("DIV2.INPUT", new ViewFactory() { // from class: xsna.ern
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivInputView lambda$22$lambda$21$lambda$17;
                lambda$22$lambda$21$lambda$17 = DivViewCreator.lambda$22$lambda$21$lambda$17(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$17;
            }
        }, viewPreCreationProfile3.getInput().getCapacity());
        viewPool.register("DIV2.SELECT", new ViewFactory() { // from class: xsna.frn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivSelectView lambda$22$lambda$21$lambda$18;
                lambda$22$lambda$21$lambda$18 = DivViewCreator.lambda$22$lambda$21$lambda$18(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$18;
            }
        }, viewPreCreationProfile3.getSelect().getCapacity());
        viewPool.register("DIV2.VIDEO", new ViewFactory() { // from class: xsna.grn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivVideoView lambda$22$lambda$21$lambda$19;
                lambda$22$lambda$21$lambda$19 = DivViewCreator.lambda$22$lambda$21$lambda$19(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$19;
            }
        }, viewPreCreationProfile3.getVideo().getCapacity());
        viewPool.register("DIV2.SWITCH", new ViewFactory() { // from class: xsna.hrn
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivSwitchView lambda$22$lambda$21$lambda$20;
                lambda$22$lambda$21$lambda$20 = DivViewCreator.lambda$22$lambda$21$lambda$20(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$20;
            }
        }, viewPreCreationProfile3.getSwitch().getCapacity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivRecyclerView lambda$22$lambda$21$lambda$10(DivViewCreator divViewCreator) {
        return new DivRecyclerView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivPagerView lambda$22$lambda$21$lambda$11(DivViewCreator divViewCreator) {
        return new DivPagerView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DivTabsLayout lambda$22$lambda$21$lambda$12(DivViewCreator divViewCreator) {
        return new DivTabsLayout(divViewCreator.context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivStateLayout lambda$22$lambda$21$lambda$13(DivViewCreator divViewCreator) {
        return new DivStateLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivCustomWrapper lambda$22$lambda$21$lambda$14(DivViewCreator divViewCreator) {
        return new DivCustomWrapper(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivPagerIndicatorView lambda$22$lambda$21$lambda$15(DivViewCreator divViewCreator) {
        return new DivPagerIndicatorView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSliderView lambda$22$lambda$21$lambda$16(DivViewCreator divViewCreator) {
        return new DivSliderView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivInputView lambda$22$lambda$21$lambda$17(DivViewCreator divViewCreator) {
        return new DivInputView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSelectView lambda$22$lambda$21$lambda$18(DivViewCreator divViewCreator) {
        return new DivSelectView(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivVideoView lambda$22$lambda$21$lambda$19(DivViewCreator divViewCreator) {
        return new DivVideoView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSwitchView lambda$22$lambda$21$lambda$20(DivViewCreator divViewCreator) {
        return new DivSwitchView(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivLineHeightTextView lambda$22$lambda$21$lambda$3(DivViewCreator divViewCreator) {
        return new DivLineHeightTextView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivImageView lambda$22$lambda$21$lambda$4(DivViewCreator divViewCreator) {
        return new DivImageView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivGifImageView lambda$22$lambda$21$lambda$5(DivViewCreator divViewCreator) {
        return new DivGifImageView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivFrameLayout lambda$22$lambda$21$lambda$6(DivViewCreator divViewCreator) {
        return new DivFrameLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivLinearLayout lambda$22$lambda$21$lambda$7(DivViewCreator divViewCreator) {
        return new DivLinearLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivWrapLayout lambda$22$lambda$21$lambda$8(DivViewCreator divViewCreator) {
        return new DivWrapLayout(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivGridLayout lambda$22$lambda$21$lambda$9(DivViewCreator divViewCreator) {
        return new DivGridLayout(divViewCreator.context, null, 0, 6, null);
    }

    public View create(a aVar, ExpressionResolver expressionResolver) {
        if (!this.validator.validate(aVar, expressionResolver)) {
            return new Space(this.context);
        }
        View visit = visit(aVar, expressionResolver);
        visit.setBackground(NoOpDrawable.INSTANCE);
        return visit;
    }

    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.viewPreCreationProfile;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    public View defaultVisit(a aVar, ExpressionResolver expressionResolver) {
        return this.viewPool.obtain(Companion.getTag(aVar, expressionResolver));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    public View visit(a.k kVar, ExpressionResolver expressionResolver) {
        return new DivSeparatorView(this.context, null, 0, 6, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    public View visit(a.e eVar, ExpressionResolver expressionResolver) {
        ViewGroup viewGroup = (ViewGroup) defaultVisit((a) eVar, expressionResolver);
        Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(eVar.c).iterator();
        while (it.hasNext()) {
            viewGroup.addView(create((a) it.next(), expressionResolver));
        }
        return viewGroup;
    }
}
