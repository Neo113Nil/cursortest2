package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import defpackage.ctg0;
import defpackage.eng0;
import defpackage.leh0;
import defpackage.m810;
import defpackage.u1m;
import defpackage.u90;
import defpackage.yvf0;
import defpackage.ywl;
import flex.engine.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 L2\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010!\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b(\u0010)J+\u0010.\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u0010\u0003J\u0017\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010-\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010>R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/CustomBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Lflex/engine/a;", "createDocumentEngine", "()Lflex/engine/a;", "Lzy11;", "addBottomSheetCallback", "observeLayoutChanges", "removeLayoutListener", "adjustBottomSheetHeight", "", "computeAvailableHeight", "()I", "", "value", "applyDefaultHeight", "(F)V", "dpVal", "dp", "(F)I", "cleanup", "engine", "Landroid/view/View;", "obtainEngineView", "(Lflex/engine/a;)Landroid/view/View;", "Lu1m;", "query", "Lywl;", "document", "", "shouldLoadByQuery", "loadEngineContent", "(Lflex/engine/a;Lu1m;Lywl;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onDestroyView", "onDestroy", "Lflex/engine/a;", "engineView", "Landroid/view/View;", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "isHeightAdjusted", "Z", "lastAppliedPeek", CA20Status.STATUS_USER_I, "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/FlexArgs;", "argsHolder", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/FlexArgs;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomBottomSheetFragment extends BottomSheetDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float DIM_VALUE = 0.6f;
    private FlexArgs argsHolder;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout container;
    private a engine;
    private View engineView;
    private boolean isHeightAdjusted;
    private int lastAppliedPeek = -1;
    private View.OnLayoutChangeListener layoutChangeListener;

    private final void addBottomSheetCallback() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.v(new BottomSheetBehavior.a() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetFragment$addBottomSheetCallback$1
                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
                public void onSlide(View bottomSheet, float slideOffset) {
                    a aVar;
                    aVar = CustomBottomSheetFragment.this.engine;
                    if (aVar != null) {
                        aVar.n();
                    }
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
                public void onStateChanged(View bottomSheet, int newState) {
                    FlexArgs flexArgs;
                    if (newState == 3) {
                        CustomBottomSheetFragment.this.adjustBottomSheetHeight();
                    }
                    if (newState == 5) {
                        flexArgs = CustomBottomSheetFragment.this.argsHolder;
                        if (flexArgs == null) {
                            flexArgs = null;
                        }
                        if (flexArgs.getCloseOnSlideDown()) {
                            CustomBottomSheetFragment.this.dismissAllowingStateLoss();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustBottomSheetHeight() {
        View findViewById;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
        Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog == null || (findViewById = bottomSheetDialog.findViewById(leh0.design_bottom_sheet)) == null || (bottomSheetBehavior = this.behavior) == null) {
            return;
        }
        int computeAvailableHeight = computeAvailableHeight();
        findViewById.measure(View.MeasureSpec.makeMeasureSpec(findViewById.getWidth(), 1073741824), 0);
        int min = Math.min(findViewById.getMeasuredHeight(), computeAvailableHeight);
        if (min <= 0 || min == this.lastAppliedPeek) {
            return;
        }
        bottomSheetBehavior.V(min, false);
        this.lastAppliedPeek = min;
        this.isHeightAdjusted = true;
    }

    private final void applyDefaultHeight(float value) {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null) {
            return;
        }
        int computeAvailableHeight = computeAvailableHeight();
        bottomSheetBehavior.V(Math.min((0.0f > value || value > 1.0f) ? dp(value) : m810.b(computeAvailableHeight * value), computeAvailableHeight), false);
        this.lastAppliedPeek = bottomSheetBehavior.G();
    }

    private final void cleanup() {
        removeLayoutListener();
        View view = this.engineView;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        a aVar = this.engine;
        if (aVar != null) {
            aVar.i();
        }
        this.engine = null;
    }

    private final int computeAvailableHeight() {
        View requireView;
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (requireView = window.getDecorView()) == null) {
            requireView = requireView();
        }
        Rect rect = new Rect();
        requireView.getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    private final a createDocumentEngine() {
        yvf0 engineCreator = CustomBottomSheetFragmentHelper.INSTANCE.getEngineCreator(getArguments());
        if (engineCreator != null) {
            return (a) engineCreator.get();
        }
        return null;
    }

    private final int dp(float dpVal) {
        return m810.b(TypedValue.applyDimension(1, dpVal, getResources().getDisplayMetrics()));
    }

    private final void loadEngineContent(a engine, u1m query, ywl document, boolean shouldLoadByQuery) {
        if (engine == null) {
            return;
        }
        if (shouldLoadByQuery && query != null) {
            a.q(engine, query, document, false, 4);
        } else if (document != null) {
            engine.B(document, query);
        }
    }

    private final void observeLayoutChanges() {
        FrameLayout frameLayout;
        View view = this.engineView;
        if (view == null || (frameLayout = this.container) == null) {
            return;
        }
        u90 u90Var = new u90(22, this);
        this.layoutChangeListener = u90Var;
        view.addOnLayoutChangeListener(u90Var);
        frameLayout.addOnLayoutChangeListener(this.layoutChangeListener);
    }

    private final View obtainEngineView(a engine) {
        if (engine == null) {
            return new FrameLayout(requireContext());
        }
        NestedScrollView nestedScrollView = new NestedScrollView(requireContext());
        nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        nestedScrollView.setNestedScrollingEnabled(true);
        nestedScrollView.setFillViewport(false);
        FrameLayout frameLayout = new FrameLayout(nestedScrollView.getContext());
        engine.g(frameLayout, getViewLifecycleOwner());
        nestedScrollView.addView(frameLayout);
        return nestedScrollView;
    }

    private final void removeLayoutListener() {
        View.OnLayoutChangeListener onLayoutChangeListener = this.layoutChangeListener;
        if (onLayoutChangeListener == null) {
            return;
        }
        View view = this.engineView;
        if (view != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.layoutChangeListener = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FlexArgs args = CustomBottomSheetFragmentHelper.INSTANCE.getArgs(getArguments());
        if (args == null) {
            return;
        }
        this.argsHolder = args;
        setCancelable(args.getCloseOnTapOutside());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext(), getTheme());
        FlexArgs flexArgs = this.argsHolder;
        if (flexArgs == null) {
            flexArgs = null;
        }
        bottomSheetDialog.setCanceledOnTouchOutside(flexArgs.getCloseOnTapOutside());
        Window window = bottomSheetDialog.getWindow();
        if (window != null) {
            FlexArgs flexArgs2 = this.argsHolder;
            window.setDimAmount((flexArgs2 != null ? flexArgs2 : null).getDimBackground() ? 0.6f : 0.0f);
        }
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        this.container = frameLayout;
        CustomBottomSheetDragIndicatorView customBottomSheetDragIndicatorView = new CustomBottomSheetDragIndicatorView(requireContext());
        FrameLayout frameLayout2 = this.container;
        if (frameLayout2 != null) {
            frameLayout2.addView(customBottomSheetDragIndicatorView);
        }
        FrameLayout frameLayout3 = this.container;
        return frameLayout3 != null ? frameLayout3 : new FrameLayout(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (isRemoving() || isDetached() || getActivity() == null) {
            CustomBottomSheetFragmentHelper.INSTANCE.clearStorage(getArguments());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        removeLayoutListener();
        this.engineView = null;
        this.container = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        cleanup();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        super.onStart();
        Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog == null || (frameLayout = (FrameLayout) bottomSheetDialog.findViewById(leh0.design_bottom_sheet)) == null) {
            return;
        }
        this.behavior = BottomSheetBehavior.D(frameLayout);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(eng0.colorSurface, typedValue, true);
        int i = typedValue.data;
        final float dimension = getResources().getDimension(ctg0.finsdk_bottom_sheet_corner_radius_small);
        b.a aVar = new b.a();
        aVar.j(dimension);
        aVar.l(dimension);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar.a());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(i));
        frameLayout.setBackground(materialShapeDrawable);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetFragment$onStart$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), dimension);
            }
        });
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.g0 = true;
            FlexArgs flexArgs = this.argsHolder;
            if (flexArgs == null) {
                flexArgs = null;
            }
            bottomSheetBehavior.T(flexArgs.getCloseOnSlideDown());
            FlexArgs flexArgs2 = this.argsHolder;
            if (flexArgs2 == null) {
                flexArgs2 = null;
            }
            bottomSheetBehavior.f0 = flexArgs2.getFullscreen();
            FlexArgs flexArgs3 = this.argsHolder;
            if (flexArgs3 == null) {
                flexArgs3 = null;
            }
            if (flexArgs3.getFullscreen()) {
                frameLayout.getLayoutParams().height = -1;
                bottomSheetBehavior.W(3);
            } else {
                frameLayout.getLayoutParams().height = -2;
            }
        }
        FlexArgs flexArgs4 = this.argsHolder;
        Float defaultHeight = (flexArgs4 != null ? flexArgs4 : null).getDefaultHeight();
        if (defaultHeight != null) {
            applyDefaultHeight(defaultHeight.floatValue());
        }
        addBottomSheetCallback();
        observeLayoutChanges();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        a createDocumentEngine = createDocumentEngine();
        this.engine = createDocumentEngine;
        View obtainEngineView = obtainEngineView(createDocumentEngine);
        this.engineView = obtainEngineView;
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.addView(obtainEngineView, new FrameLayout.LayoutParams(-1, -2));
        }
        a aVar = this.engine;
        FlexArgs flexArgs = this.argsHolder;
        if (flexArgs == null) {
            flexArgs = null;
        }
        u1m query = flexArgs.getQuery();
        FlexArgs flexArgs2 = this.argsHolder;
        if (flexArgs2 == null) {
            flexArgs2 = null;
        }
        ywl document = flexArgs2.getDocument();
        FlexArgs flexArgs3 = this.argsHolder;
        loadEngineContent(aVar, query, document, (flexArgs3 != null ? flexArgs3 : null).getShouldLoadByQuery());
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u0017\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/CustomBottomSheetFragment$Companion;", "", "<init>", "()V", "Lyvf0;", "Lflex/engine/a;", "documentEngineCreator", "Lu1m;", "query", "Lywl;", "document", "", "fullscreen", "closeOnTapOutside", "closeOnSlideDown", "dimBackground", "", "defaultHeight", "shouldLoadByQuery", "", "", "customProps", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/CustomBottomSheetFragment;", "newInstance", "(Lyvf0;Lu1m;Lywl;ZZZZLjava/lang/Float;ZLjava/util/Map;)Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/presentation/bottomsheet/CustomBottomSheetFragment;", "DIM_VALUE", "F", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CustomBottomSheetFragment newInstance(yvf0 documentEngineCreator, u1m query, ywl document, boolean fullscreen, boolean closeOnTapOutside, boolean closeOnSlideDown, boolean dimBackground, Float defaultHeight, boolean shouldLoadByQuery, Map<String, ? extends Object> customProps) {
            CustomBottomSheetFragment customBottomSheetFragment = new CustomBottomSheetFragment();
            Bundle bundle = new Bundle();
            CustomBottomSheetFragmentHelper customBottomSheetFragmentHelper = CustomBottomSheetFragmentHelper.INSTANCE;
            customBottomSheetFragmentHelper.saveEngineCreator(bundle, documentEngineCreator);
            if (customProps == null) {
                customProps = kotlin.collections.b.f();
            }
            customBottomSheetFragmentHelper.saveArgs(bundle, new FlexArgs(query, document, fullscreen, closeOnTapOutside, closeOnSlideDown, dimBackground, defaultHeight, shouldLoadByQuery, customProps));
            customBottomSheetFragment.setArguments(bundle);
            return customBottomSheetFragment;
        }

        private Companion() {
        }
    }
}
