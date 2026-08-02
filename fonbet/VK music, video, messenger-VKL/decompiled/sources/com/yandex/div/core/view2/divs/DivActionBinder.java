package com.yandex.div.core.view2.divs;

import android.annotation.SuppressLint;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import com.ironsource.D1;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAnimation;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.bin;
import xsna.cxb0;
import xsna.gzs;
import xsna.izs;
import xsna.rl3;
import xsna.s3q0;
import xsna.wh4;
import xsna.wzs;

/* compiled from: DivActionBinder.kt */
/* loaded from: classes7.dex */
public class DivActionBinder {
    private final DivActionHandler actionHandler;
    private final DivActionBeaconSender divActionBeaconSender;
    private final Div2Logger logger;
    private final boolean longtapActionsPassToChild;
    private final izs<View, Boolean> passToParentLongClickListener = new izs<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$passToParentLongClickListener$1
        @Override // xsna.izs
        public final Boolean invoke(View view) {
            boolean z = false;
            do {
                ViewParent parent = view.getParent();
                view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (view == null || view.getParent() == null) {
                    break;
                }
                z = view.performLongClick();
            } while (!z);
            return Boolean.valueOf(z);
        }
    };
    private final boolean shouldIgnoreActionMenuItems;

    /* compiled from: DivActionBinder.kt */
    public final class MenuWrapperListener extends OverflowMenuWrapper.Listener.Simple {
        private final BindingContext context;
        private final List<DivAction.a> items;

        public MenuWrapperListener(BindingContext bindingContext, List<DivAction.a> list) {
            this.context = bindingContext;
            this.items = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onMenuCreated$lambda$0(final Div2View div2View, final DivAction.a aVar, final ExpressionResolver expressionResolver, final DivActionBinder divActionBinder, final int i, MenuItem menuItem) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            div2View.bulkActions$div_release(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$MenuWrapperListener$onMenuCreated$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    List<DivAction> onlyEnabled;
                    Div2Logger div2Logger;
                    DivActionBeaconSender divActionBeaconSender;
                    List<DivAction> list = DivAction.a.this.b;
                    List<DivAction> list2 = list;
                    List<DivAction> list3 = null;
                    if (list2 == null || list2.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        DivAction divAction = DivAction.a.this.a;
                        if (divAction != null) {
                            list3 = Collections.singletonList(divAction);
                        }
                    } else {
                        list3 = list;
                    }
                    List<DivAction> list4 = list3;
                    if (list4 == null || list4.isEmpty()) {
                        KAssert kAssert = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Menu item does not have any action");
                            return;
                        }
                        return;
                    }
                    onlyEnabled = DivActionBinderKt.onlyEnabled(list3, expressionResolver);
                    DivActionBinder divActionBinder2 = divActionBinder;
                    Div2View div2View2 = div2View;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    int i2 = i;
                    DivAction.a aVar2 = DivAction.a.this;
                    for (DivAction divAction2 : onlyEnabled) {
                        ExpressionResolver expressionResolver3 = expressionResolver2;
                        Div2View div2View3 = div2View2;
                        div2Logger = divActionBinder2.logger;
                        div2Logger.logPopupMenuItemClick(div2View3, expressionResolver3, i2, aVar2.c.evaluate(expressionResolver3), divAction2);
                        divActionBeaconSender = divActionBinder2.divActionBeaconSender;
                        divActionBeaconSender.sendTapActionBeacon(divAction2, expressionResolver3);
                        div2View2 = div2View3;
                        expressionResolver2 = expressionResolver3;
                        DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder2, div2View2, expressionResolver2, divAction2, "menu", null, null, 48, null);
                        i2 = i2;
                    }
                    ref$BooleanRef.element = true;
                }
            });
            return ref$BooleanRef.element;
        }

        @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
        public void onMenuCreated(cxb0 cxb0Var) {
            final Div2View divView = this.context.getDivView();
            final ExpressionResolver expressionResolver = this.context.getExpressionResolver();
            f fVar = cxb0Var.a;
            for (final DivAction.a aVar : this.items) {
                final int size = fVar.f.size();
                h a = fVar.a(0, 0, 0, aVar.c.evaluate(expressionResolver));
                final DivActionBinder divActionBinder = DivActionBinder.this;
                a.p = new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.a
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        boolean onMenuCreated$lambda$0;
                        onMenuCreated$lambda$0 = DivActionBinder.MenuWrapperListener.onMenuCreated$lambda$0(Div2View.this, aVar, expressionResolver, divActionBinder, size, menuItem);
                        return onMenuCreated$lambda$0;
                    }
                };
            }
        }
    }

    public DivActionBinder(DivActionHandler divActionHandler, Div2Logger div2Logger, DivActionBeaconSender divActionBeaconSender, boolean z, boolean z2) {
        this.actionHandler = divActionHandler;
        this.logger = div2Logger;
        this.divActionBeaconSender = divActionBeaconSender;
        this.longtapActionsPassToChild = z;
        this.shouldIgnoreActionMenuItems = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyDivActions(BindingContext bindingContext, View view, List<DivAction> list, List<DivAction> list2, List<DivAction> list3, List<DivAction> list4, List<DivAction> list5, List<DivAction> list6, List<DivAction> list7, DivAnimation divAnimation, Expression<Boolean> expression) {
        boolean z;
        boolean parentIsLongClickable;
        List<DivAction> list8 = list2;
        if (list8.isEmpty()) {
            parentIsLongClickable = DivActionBinderKt.parentIsLongClickable(view);
            if (!parentIsLongClickable) {
                z = false;
                DivGestureListener divGestureListener = new DivGestureListener(z);
                bindLongTapActions(bindingContext, view, list2, list.isEmpty(), expression);
                bindDoubleTapActions(bindingContext, view, divGestureListener, list3, expression);
                bindTapActions(bindingContext, view, divGestureListener, list, this.shouldIgnoreActionMenuItems, expression, list8.isEmpty() || !list3.isEmpty());
                wzs<View, MotionEvent, Boolean> createAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, CollectionsKt.allIsNullOrEmpty(list, list2, list3) ? divAnimation : null, divGestureListener);
                wzs<View, MotionEvent, Boolean> createPressTouchListener = createPressTouchListener(bindingContext, view, list6, list7);
                bindHoverActions(bindingContext, view, list4, list5);
                attachTouchListeners(view, createAnimatedTouchListener, createPressTouchListener);
            }
        }
        z = true;
        DivGestureListener divGestureListener2 = new DivGestureListener(z);
        bindLongTapActions(bindingContext, view, list2, list.isEmpty(), expression);
        bindDoubleTapActions(bindingContext, view, divGestureListener2, list3, expression);
        bindTapActions(bindingContext, view, divGestureListener2, list, this.shouldIgnoreActionMenuItems, expression, list8.isEmpty() || !list3.isEmpty());
        wzs<View, MotionEvent, Boolean> createAnimatedTouchListener2 = BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, CollectionsKt.allIsNullOrEmpty(list, list2, list3) ? divAnimation : null, divGestureListener2);
        wzs<View, MotionEvent, Boolean> createPressTouchListener2 = createPressTouchListener(bindingContext, view, list6, list7);
        bindHoverActions(bindingContext, view, list4, list5);
        attachTouchListeners(view, createAnimatedTouchListener2, createPressTouchListener2);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void attachTouchListeners(View view, wzs<? super View, ? super MotionEvent, Boolean>... wzsVarArr) {
        List I = rl3.I(wzsVarArr);
        if (I.isEmpty()) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new bin(I, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachTouchListeners$lambda$17(List list, View view, MotionEvent motionEvent) {
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (((Boolean) ((wzs) it.next()).invoke(view, motionEvent)).booleanValue() || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    private void bindDoubleTapActions(final BindingContext bindingContext, final View view, DivGestureListener divGestureListener, final List<DivAction> list, final Expression<Boolean> expression) {
        Object obj = null;
        if (list.isEmpty()) {
            divGestureListener.setOnDoubleTapListener(null);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<DivAction.a> list2 = ((DivAction) next).e;
            if (list2 != null && !list2.isEmpty() && !this.shouldIgnoreActionMenuItems) {
                obj = next;
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            divGestureListener.setOnDoubleTapListener(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DivActionBinderKt.captureFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
                    this.handleBulkActions$div_release(bindingContext, view, list, "double_click");
                }
            });
            return;
        }
        List<DivAction.a> list3 = divAction.e;
        if (list3 != null) {
            final OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
            divGestureListener.setOnDoubleTapListener(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Div2Logger div2Logger;
                    DivActionBeaconSender divActionBeaconSender;
                    div2Logger = DivActionBinder.this.logger;
                    div2Logger.logDoubleClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, divAction);
                    divActionBeaconSender = DivActionBinder.this.divActionBeaconSender;
                    divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
                    DivActionBinderKt.captureFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
                    overflowGravity.getOnMenuClickListener().onClick(view);
                }
            });
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + divAction.c);
        }
    }

    private void bindHoverActions(final BindingContext bindingContext, final View view, final List<DivAction> list, final List<DivAction> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            view.setOnHoverListener(null);
        } else {
            view.setOnHoverListener(new View.OnHoverListener() { // from class: xsna.cin
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    boolean bindHoverActions$lambda$15;
                    bindHoverActions$lambda$15 = DivActionBinder.bindHoverActions$lambda$15(DivActionBinder.this, bindingContext, view, list, list2, view2, motionEvent);
                    return bindHoverActions$lambda$15;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindHoverActions$lambda$15(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, List list2, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 9) {
            divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "hover");
            return false;
        }
        if (action != 10) {
            return false;
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list2, "unhover");
        return false;
    }

    private void bindLongTapActions(final BindingContext bindingContext, final View view, final List<DivAction> list, boolean z, final Expression<Boolean> expression) {
        Object obj;
        if (list.isEmpty()) {
            clearLongClickListener(view, this.longtapActionsPassToChild, z);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List<DivAction.a> list2 = ((DivAction) obj).e;
            if (list2 != null && !list2.isEmpty() && !this.shouldIgnoreActionMenuItems) {
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction != null) {
            List<DivAction.a> list3 = divAction.e;
            if (list3 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + divAction.c);
                }
            } else {
                final OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
                Div2View divView = bindingContext.getDivView();
                divView.clearSubscriptions();
                divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.din
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        boolean bindLongTapActions$lambda$10$lambda$9;
                        bindLongTapActions$lambda$10$lambda$9 = DivActionBinder.bindLongTapActions$lambda$10$lambda$9(DivActionBinder.this, divAction, bindingContext, expression, overflowGravity, view, list, view2);
                        return bindLongTapActions$lambda$10$lambda$9;
                    }
                });
            }
        } else {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.ein
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean bindLongTapActions$lambda$11;
                    bindLongTapActions$lambda$11 = DivActionBinder.bindLongTapActions$lambda$11(expression, bindingContext, this, view, list, view2);
                    return bindLongTapActions$lambda$11;
                }
            });
        }
        if (this.longtapActionsPassToChild) {
            DivActionBinderKt.setPenetratingLongClickable$default(view, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$10$lambda$9(DivActionBinder divActionBinder, DivAction divAction, BindingContext bindingContext, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view, List list, View view2) {
        String uuid = UUID.randomUUID().toString();
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            divActionBinder.logger.logLongClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, (DivAction) it.next(), uuid);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$11(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "long_click");
        return true;
    }

    private void bindTapActions(final BindingContext bindingContext, final View view, DivGestureListener divGestureListener, final List<DivAction> list, boolean z, final Expression<Boolean> expression, boolean z2) {
        Object obj = null;
        if (list.isEmpty()) {
            if (z2) {
                bindTapActions$setTapListener(divGestureListener, view, new wh4(3, expression, bindingContext));
                return;
            }
            divGestureListener.setOnSingleTapListener(null);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<DivAction.a> list2 = ((DivAction) next).e;
            if (list2 != null && !list2.isEmpty() && !z) {
                obj = next;
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: xsna.gin
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DivActionBinder.bindTapActions$lambda$6(expression, bindingContext, this, view, list, view2);
                }
            });
            return;
        }
        List<DivAction.a> list3 = divAction.e;
        if (list3 != null) {
            final OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
            bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: xsna.fin
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DivActionBinder.bindTapActions$lambda$5$lambda$4(DivActionBinder.this, bindingContext, view, divAction, expression, overflowGravity, view2);
                }
            });
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + divAction.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$2(Expression expression, BindingContext bindingContext, View view) {
        DivActionBinderKt.clearFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$5$lambda$4(DivActionBinder divActionBinder, BindingContext bindingContext, View view, DivAction divAction, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view2) {
        divActionBinder.logger.logClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, divAction);
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$6(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        handleBulkActions$div_release$default(divActionBinder, bindingContext, view, list, null, 8, null);
    }

    private static final void bindTapActions$setTapListener(DivGestureListener divGestureListener, final View view, final View.OnClickListener onClickListener) {
        if (divGestureListener.getOnDoubleTapListener() != null) {
            divGestureListener.setOnSingleTapListener(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindTapActions$setTapListener$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onClickListener.onClick(view);
                }
            });
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    private void clearLongClickListener(View view, boolean z, boolean z2) {
        boolean parentIsLongClickable;
        if (!z || z2) {
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            return;
        }
        parentIsLongClickable = DivActionBinderKt.parentIsLongClickable(view);
        if (parentIsLongClickable) {
            final izs<View, Boolean> izsVar = this.passToParentLongClickListener;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.hin
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean clearLongClickListener$lambda$12;
                    clearLongClickListener$lambda$12 = DivActionBinder.clearLongClickListener$lambda$12(izs.this, view2);
                    return clearLongClickListener$lambda$12;
                }
            });
            DivActionBinderKt.setPenetratingLongClickable$default(view, null, 1, null);
        } else {
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            DivActionBinderKt.setPenetratingLongClickable(view, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearLongClickListener$lambda$12(izs izsVar, View view) {
        return ((Boolean) izsVar.invoke(view)).booleanValue();
    }

    private wzs<View, MotionEvent, Boolean> createPressTouchListener(final BindingContext bindingContext, final View view, final List<DivAction> list, final List<DivAction> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        return new wzs<View, MotionEvent, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$createPressTouchListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // xsna.wzs
            public final Boolean invoke(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                boolean z = true;
                if (action == 0) {
                    DivActionBinder.this.handleBulkActions$div_release(bindingContext, view, list, "press");
                } else if (action == 1 || action == 3) {
                    DivActionBinder.this.handleBulkActions$div_release(bindingContext, view, list2, "release");
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
    }

    public static /* synthetic */ boolean handleAction$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAction");
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            divActionHandler = div2View != null ? div2View.getActionHandler() : null;
        }
        return divActionBinder.handleAction$div_release(divViewFacade, expressionResolver, divAction, str, str2, divActionHandler);
    }

    public static /* synthetic */ boolean handleActionWithoutEnableCheck$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActionWithoutEnableCheck");
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            divActionHandler = div2View != null ? div2View.getActionHandler() : null;
        }
        return divActionBinder.handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, divAction, str, str2, divActionHandler);
    }

    public static /* synthetic */ void handleActions$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, List list, String str, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActions");
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        divActionBinder.handleActions$div_release(divViewFacade, expressionResolver, list, str, izsVar);
    }

    public static /* synthetic */ void handleBulkActions$div_release$default(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleBulkActions");
        }
        if ((i & 8) != 0) {
            str = "click";
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toDivActionReason(String str) {
        switch (str.hashCode()) {
            case -338877947:
                return !str.equals("long_click") ? D1.e : "long_click";
            case -287575485:
                return !str.equals("unhover") ? D1.e : "unhover";
            case 3027047:
                return !str.equals("blur") ? D1.e : "blur";
            case 94750088:
                return !str.equals("click") ? D1.e : "click";
            case 96667352:
                return !str.equals("enter") ? D1.e : "enter";
            case 97604824:
                return !str.equals("focus") ? D1.e : "focus";
            case 99469628:
                return !str.equals("hover") ? D1.e : "hover";
            case 106931267:
                return !str.equals("press") ? D1.e : "press";
            case 1090594823:
                return !str.equals("release") ? D1.e : "release";
            case 1374143386:
                return !str.equals("double_click") ? D1.e : "double_click";
            default:
                return D1.e;
        }
    }

    public void bindDivActions(final BindingContext bindingContext, final View view, final List<DivAction> list, final List<DivAction> list2, final List<DivAction> list3, final List<DivAction> list4, final List<DivAction> list5, final List<DivAction> list6, final List<DivAction> list7, final DivAnimation divAnimation, final Expression<Boolean> expression) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final gzs<s3q0> gzsVar = new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$onApply$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List onlyEnabled;
                List onlyEnabled2;
                List onlyEnabled3;
                List onlyEnabled4;
                List onlyEnabled5;
                List onlyEnabled6;
                List onlyEnabled7;
                onlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
                onlyEnabled2 = DivActionBinderKt.onlyEnabled(list3, expressionResolver);
                onlyEnabled3 = DivActionBinderKt.onlyEnabled(list2, expressionResolver);
                onlyEnabled4 = DivActionBinderKt.onlyEnabled(list4, expressionResolver);
                onlyEnabled5 = DivActionBinderKt.onlyEnabled(list5, expressionResolver);
                onlyEnabled6 = DivActionBinderKt.onlyEnabled(list6, expressionResolver);
                onlyEnabled7 = DivActionBinderKt.onlyEnabled(list7, expressionResolver);
                this.applyDivActions(bindingContext, view, onlyEnabled, onlyEnabled3, onlyEnabled2, onlyEnabled4, onlyEnabled5, onlyEnabled6, onlyEnabled7, divAnimation, expression);
            }
        };
        DivActionBinderKt.observe(view, (List<DivAction>) list, expressionResolver, (izs<Object, s3q0>) new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                gzsVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (List<DivAction>) list2, expressionResolver, (izs<Object, s3q0>) new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                gzsVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (List<DivAction>) list3, expressionResolver, (izs<Object, s3q0>) new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                gzsVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (Expression<Boolean>) expression, expressionResolver, (izs<Object, s3q0>) new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                gzsVar.invoke();
            }
        });
        gzsVar.invoke();
    }

    public boolean handleAction$div_release(DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler) {
        if (divAction.b.evaluate(expressionResolver).booleanValue()) {
            return handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, divAction, str, str2, divActionHandler);
        }
        return false;
    }

    public boolean handleActionWithoutEnableCheck$div_release(DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler) {
        String str3;
        ExpressionResolver expressionResolver2;
        DivAction divAction2;
        DivViewFacade divViewFacade2;
        if (!this.actionHandler.getUseActionUid() || str2 == null) {
            if (divActionHandler == null || !divActionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str)) {
                return this.actionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str);
            }
            return true;
        }
        if (divActionHandler != null) {
            divViewFacade2 = divViewFacade;
            str3 = str;
            expressionResolver2 = expressionResolver;
            divAction2 = divAction;
            if (divActionHandler.handleActionWithReason(divAction2, divViewFacade2, expressionResolver2, str2, str3)) {
                return true;
            }
        } else {
            str3 = str;
            expressionResolver2 = expressionResolver;
            divAction2 = divAction;
            divViewFacade2 = divViewFacade;
        }
        return this.actionHandler.handleActionWithReason(divAction2, divViewFacade2, expressionResolver2, str2, str3);
    }

    public void handleActions$div_release(DivViewFacade divViewFacade, ExpressionResolver expressionResolver, List<DivAction> list, String str, izs<? super DivAction, s3q0> izsVar) {
        List<DivAction> onlyEnabled;
        if (list == null) {
            return;
        }
        onlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
        for (DivAction divAction : onlyEnabled) {
            DivViewFacade divViewFacade2 = divViewFacade;
            ExpressionResolver expressionResolver2 = expressionResolver;
            String str2 = str;
            handleActionWithoutEnableCheck$div_release$default(this, divViewFacade2, expressionResolver2, divAction, str2, null, null, 48, null);
            if (izsVar != null) {
                izsVar.invoke(divAction);
            }
            divViewFacade = divViewFacade2;
            expressionResolver = expressionResolver2;
            str = str2;
        }
    }

    public void handleBulkActions$div_release(BindingContext bindingContext, final View view, final List<DivAction> list, final String str) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divView.bulkActions$div_release(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$handleBulkActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List<DivAction> onlyEnabled;
                Div2Logger div2Logger;
                DivAction divAction;
                Div2Logger div2Logger2;
                Div2Logger div2Logger3;
                Div2Logger div2Logger4;
                Div2Logger div2Logger5;
                Div2Logger div2Logger6;
                Div2Logger div2Logger7;
                Div2Logger div2Logger8;
                Div2Logger div2Logger9;
                DivActionBeaconSender divActionBeaconSender;
                String divActionReason;
                Div2Logger div2Logger10;
                String uuid = UUID.randomUUID().toString();
                onlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
                String str2 = str;
                DivActionBinder divActionBinder = this;
                Div2View div2View = divView;
                ExpressionResolver expressionResolver2 = expressionResolver;
                View view2 = view;
                for (DivAction divAction2 : onlyEnabled) {
                    switch (str2.hashCode()) {
                        case -338877947:
                            if (str2.equals("long_click")) {
                                div2Logger = divActionBinder.logger;
                                divAction = divAction2;
                                div2Logger.logLongClick(div2View, expressionResolver2, view2, divAction, uuid);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                            break;
                        case -287575485:
                            if (str2.equals("unhover")) {
                                div2Logger2 = divActionBinder.logger;
                                div2Logger2.logHoverChanged(div2View, expressionResolver2, view2, divAction2, false);
                                divAction = divAction2;
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                        case 3027047:
                            if (str2.equals("blur")) {
                                div2Logger3 = divActionBinder.logger;
                                div2Logger3.logFocusChanged(div2View, expressionResolver2, view2, divAction2, false);
                                divAction = divAction2;
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                        case 94750088:
                            divAction = divAction2;
                            if (str2.equals("click")) {
                                div2Logger4 = divActionBinder.logger;
                                div2Logger4.logClick(div2View, expressionResolver2, view2, divAction, uuid);
                                break;
                            }
                            divAction2 = divAction;
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                            break;
                        case 96667352:
                            divAction = divAction2;
                            if (str2.equals("enter")) {
                                div2Logger5 = divActionBinder.logger;
                                div2Logger5.logImeEnter(div2View, expressionResolver2, view2, divAction);
                                break;
                            }
                            divAction2 = divAction;
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                            break;
                        case 97604824:
                            if (str2.equals("focus")) {
                                div2Logger6 = divActionBinder.logger;
                                div2Logger6.logFocusChanged(div2View, expressionResolver2, view2, divAction2, true);
                                divAction = divAction2;
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                        case 99469628:
                            if (str2.equals("hover")) {
                                div2Logger7 = divActionBinder.logger;
                                div2Logger7.logHoverChanged(div2View, expressionResolver2, view2, divAction2, true);
                                divAction = divAction2;
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                        case 106931267:
                            if (str2.equals("press")) {
                                div2Logger8 = divActionBinder.logger;
                                div2Logger8.logPressChanged(div2View, expressionResolver2, view2, divAction2, true);
                                divAction = divAction2;
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                        case 1090594823:
                            if (str2.equals("release")) {
                                div2Logger9 = divActionBinder.logger;
                                div2Logger9.logPressChanged(div2View, expressionResolver2, view2, divAction2, false);
                                divAction = divAction2;
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                        case 1374143386:
                            if (str2.equals("double_click")) {
                                div2Logger10 = divActionBinder.logger;
                                divAction = divAction2;
                                div2Logger10.logDoubleClick(div2View, expressionResolver2, view2, divAction, uuid);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                            break;
                        default:
                            Assert.fail("Please, add new logType");
                            divAction = divAction2;
                            break;
                    }
                    divActionBeaconSender = divActionBinder.divActionBeaconSender;
                    divActionBeaconSender.sendTapActionBeacon(divAction, expressionResolver2);
                    DivAction divAction3 = divAction;
                    divActionReason = divActionBinder.toDivActionReason(str2);
                    DivActionBinder divActionBinder2 = divActionBinder;
                    DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder2, div2View, expressionResolver2, divAction3, divActionReason, uuid, null, 32, null);
                    divActionBinder = divActionBinder2;
                }
            }
        });
    }

    public void handleTapClick$div_release(BindingContext bindingContext, View view, List<DivAction> list) {
        List onlyEnabled;
        Object obj;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        onlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
        Iterator it = onlyEnabled.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List<DivAction.a> list2 = ((DivAction) obj).e;
            if (!(list2 == null || list2.isEmpty())) {
                break;
            }
        }
        DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            handleBulkActions$div_release$default(this, bindingContext, view, onlyEnabled, null, 8, null);
            return;
        }
        List<DivAction.a> list3 = divAction.e;
        if (list3 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to bind empty menu action: " + divAction.c);
                return;
            }
            return;
        }
        OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
        Div2View divView = bindingContext.getDivView();
        divView.clearSubscriptions();
        divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
        this.logger.logClick(bindingContext.getDivView(), expressionResolver, view, divAction);
        this.divActionBeaconSender.sendTapActionBeacon(divAction, expressionResolver);
        overflowGravity.getOnMenuClickListener().onClick(view);
    }
}
