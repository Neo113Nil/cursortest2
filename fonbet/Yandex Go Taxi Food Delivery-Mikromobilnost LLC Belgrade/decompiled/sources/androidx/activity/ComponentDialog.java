package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentDialog;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import defpackage.bbh0;
import defpackage.blj;
import defpackage.csf0;
import defpackage.g2m0;
import defpackage.h2m0;
import defpackage.hjh0;
import defpackage.hx60;
import defpackage.i2m0;
import defpackage.i3y;
import defpackage.j2m0;
import defpackage.j750;
import defpackage.jxi;
import defpackage.k750;
import defpackage.pey;
import defpackage.qx60;
import defpackage.rx60;
import defpackage.s8o;
import defpackage.sls;
import defpackage.v4a;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ!\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0010H\u0017¢\u0006\u0004\b!\u0010\u0014R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R!\u00103\u001a\u00020.8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b/\u0010*\u0012\u0004\b2\u0010\u0014\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Lpey;", "Lrx60;", "Lk750;", "Lj2m0;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroidx/lifecycle/t;", "_lifecycleRegistry", "Landroidx/lifecycle/t;", "Lh2m0;", "savedStateRegistryController", "Lh2m0;", "Lblj;", "onBackPressedInput$delegate", "Li3y;", "getOnBackPressedInput", "()Lblj;", "onBackPressedInput", "Lqx60;", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Lqx60;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLifecycleRegistry", "()Landroidx/lifecycle/t;", "lifecycleRegistry", "Lg2m0;", "getSavedStateRegistry", "()Lg2m0;", "savedStateRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lj750;", "getNavigationEventDispatcher", "()Lj750;", "navigationEventDispatcher", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class ComponentDialog extends Dialog implements pey, rx60, k750, j2m0 {
    private t _lifecycleRegistry;

    /* renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final i3y onBackPressedDispatcher;

    /* renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final i3y onBackPressedInput;
    private final h2m0 savedStateRegistryController;

    public ComponentDialog(Context context, int i) {
        super(context, i);
        this.savedStateRegistryController = new h2m0(new i2m0(this, new csf0(20, this)));
        final int i2 = 0;
        this.onBackPressedInput = kotlin.a.a(new sls(this) { // from class: b1d
            public final /* synthetic */ ComponentDialog b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                blj onBackPressedInput_delegate$lambda$0;
                qx60 onBackPressedDispatcher_delegate$lambda$0;
                int i3 = i2;
                ComponentDialog componentDialog = this.b;
                switch (i3) {
                    case 0:
                        onBackPressedInput_delegate$lambda$0 = ComponentDialog.onBackPressedInput_delegate$lambda$0(componentDialog);
                        return onBackPressedInput_delegate$lambda$0;
                    default:
                        onBackPressedDispatcher_delegate$lambda$0 = ComponentDialog.onBackPressedDispatcher_delegate$lambda$0(componentDialog);
                        return onBackPressedDispatcher_delegate$lambda$0;
                }
            }
        });
        final int i3 = 1;
        this.onBackPressedDispatcher = kotlin.a.a(new sls(this) { // from class: b1d
            public final /* synthetic */ ComponentDialog b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                blj onBackPressedInput_delegate$lambda$0;
                qx60 onBackPressedDispatcher_delegate$lambda$0;
                int i32 = i3;
                ComponentDialog componentDialog = this.b;
                switch (i32) {
                    case 0:
                        onBackPressedInput_delegate$lambda$0 = ComponentDialog.onBackPressedInput_delegate$lambda$0(componentDialog);
                        return onBackPressedInput_delegate$lambda$0;
                    default:
                        onBackPressedDispatcher_delegate$lambda$0 = ComponentDialog.onBackPressedDispatcher_delegate$lambda$0(componentDialog);
                        return onBackPressedDispatcher_delegate$lambda$0;
                }
            }
        });
    }

    private final t getLifecycleRegistry() {
        t tVar = this._lifecycleRegistry;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this, true);
        this._lifecycleRegistry = tVar2;
        return tVar2;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private final blj getOnBackPressedInput() {
        return (blj) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qx60 onBackPressedDispatcher_delegate$lambda$0(ComponentDialog componentDialog) {
        return new qx60(new v4a(18, componentDialog));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final blj onBackPressedInput_delegate$lambda$0(ComponentDialog componentDialog) {
        blj bljVar = new blj();
        componentDialog.getNavigationEventDispatcher().b(bljVar);
        return bljVar;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        super.addContentView(view, params);
    }

    @Override // defpackage.pey
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // defpackage.k750
    public j750 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b;
    }

    @Override // defpackage.rx60
    public final qx60 getOnBackPressedDispatcher() {
        return (qx60) this.onBackPressedDispatcher.getValue();
    }

    @Override // defpackage.j2m0
    public g2m0 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    public void initializeViewTreeOwners() {
        vng.E(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(hjh0.view_tree_on_back_pressed_dispatcher_owner, this);
        s8o.R(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(bbh0.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    @jxi
    public void onBackPressed() {
        getOnBackPressedInput().a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            qx60 onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            j750 j750Var = onBackPressedDispatcher.b;
            j750Var.c(new hx60(onBackInvokedDispatcher, 0), 1);
            j750Var.c(new hx60(onBackInvokedDispatcher, 1000000), 0);
        }
        this.savedStateRegistryController.a(savedInstanceState);
        getLifecycleRegistry().g(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.savedStateRegistryController.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().g(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().g(Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        super.setContentView(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        super.setContentView(view, params);
    }

    public ComponentDialog(Context context) {
        this(context, 0, 2, null);
    }

    public /* synthetic */ ComponentDialog(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }
}
