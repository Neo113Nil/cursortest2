package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.jb7;
import defpackage.k1m0;
import defpackage.l1m0;
import defpackage.m390;
import defpackage.sls;
import defpackage.tls;
import defpackage.ttd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010&\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b&\u0010'\"\u0004\b(\u0010)RB\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/RB\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/RB\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\u0014\u00108\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "", "Landroid/content/Context;", "context", "Lttd;", "parentContext", "typedView", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Ll1m0;", "saveStateRegistry", "", "compositeKeyHash", "Lm390;", "owner", "<init>", "(Landroid/content/Context;Lttd;Landroid/view/View;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Ll1m0;ILm390;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;Ltls;Lttd;Ll1m0;ILm390;)V", "Lzy11;", "registerSaveStateProvider", "()V", "unregisterSaveStateProvider", "Landroid/view/View;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Ll1m0;", CA20Status.STATUS_USER_I, "", "saveStateKey", "Ljava/lang/String;", "Lk1m0;", "value", "savableRegistryEntry", "Lk1m0;", "setSavableRegistryEntry", "(Lk1m0;)V", "updateBlock", "Ltls;", "getUpdateBlock", "()Ltls;", "setUpdateBlock", "(Ltls;)V", "resetBlock", "getResetBlock", "setResetBlock", "releaseBlock", "getReleaseBlock", "setReleaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {
    public static final int $stable = 8;
    private final int compositeKeyHash;
    private final NestedScrollDispatcher dispatcher;
    private tls releaseBlock;
    private tls resetBlock;
    private k1m0 savableRegistryEntry;
    private final String saveStateKey;
    private final l1m0 saveStateRegistry;
    private final T typedView;
    private tls updateBlock;

    private ViewFactoryHolder(Context context, ttd ttdVar, T t, NestedScrollDispatcher nestedScrollDispatcher, l1m0 l1m0Var, int i, m390 m390Var) {
        super(context, ttdVar, i, nestedScrollDispatcher, t, m390Var);
        this.typedView = t;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = l1m0Var;
        this.compositeKeyHash = i;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        this.saveStateKey = valueOf;
        Object e = l1m0Var != null ? l1m0Var.e(valueOf) : null;
        SparseArray<Parcelable> sparseArray = e instanceof SparseArray ? (SparseArray) e : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        tls tlsVar = b.a;
        AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.w;
        this.updateBlock = androidView_androidKt$NoOpUpdate$1;
        this.resetBlock = androidView_androidKt$NoOpUpdate$1;
        this.releaseBlock = androidView_androidKt$NoOpUpdate$1;
    }

    private final void registerSaveStateProvider() {
        l1m0 l1m0Var = this.saveStateRegistry;
        if (l1m0Var != null) {
            setSavableRegistryEntry(l1m0Var.c(new sls() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View view;
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    view = ((ViewFactoryHolder) ViewFactoryHolder.this).typedView;
                    view.saveHierarchyState(sparseArray);
                    return sparseArray;
                }
            }, this.saveStateKey));
        }
    }

    private final void setSavableRegistryEntry(k1m0 k1m0Var) {
        k1m0 k1m0Var2 = this.savableRegistryEntry;
        if (k1m0Var2 != null) {
            ((jb7) k1m0Var2).x();
        }
        this.savableRegistryEntry = k1m0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final tls getReleaseBlock() {
        return this.releaseBlock;
    }

    public final tls getResetBlock() {
        return this.resetBlock;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final tls getUpdateBlock() {
        return this.updateBlock;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(tls tlsVar) {
        this.releaseBlock = tlsVar;
        setRelease(new sls() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View view;
                view = ((ViewFactoryHolder) ViewFactoryHolder.this).typedView;
                ViewFactoryHolder.this.getReleaseBlock().invoke(view);
                ViewFactoryHolder.this.unregisterSaveStateProvider();
                return zy11.a;
            }
        });
    }

    public final void setResetBlock(tls tlsVar) {
        this.resetBlock = tlsVar;
        setReset(new sls() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View view;
                view = ((ViewFactoryHolder) ViewFactoryHolder.this).typedView;
                ViewFactoryHolder.this.getResetBlock().invoke(view);
                return zy11.a;
            }
        });
    }

    public final void setUpdateBlock(tls tlsVar) {
        this.updateBlock = tlsVar;
        setUpdate(new sls() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View view;
                view = ((ViewFactoryHolder) ViewFactoryHolder.this).typedView;
                ViewFactoryHolder.this.getUpdateBlock().invoke(view);
                return zy11.a;
            }
        });
    }

    public /* synthetic */ ViewFactoryHolder(Context context, ttd ttdVar, View view, NestedScrollDispatcher nestedScrollDispatcher, l1m0 l1m0Var, int i, m390 m390Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : ttdVar, view, (i2 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, l1m0Var, i, m390Var);
    }

    public /* synthetic */ ViewFactoryHolder(Context context, tls tlsVar, ttd ttdVar, l1m0 l1m0Var, int i, m390 m390Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, tlsVar, (i2 & 4) != 0 ? null : ttdVar, l1m0Var, i, m390Var);
    }

    public ViewFactoryHolder(Context context, tls tlsVar, ttd ttdVar, l1m0 l1m0Var, int i, m390 m390Var) {
        this(context, ttdVar, (View) tlsVar.invoke(context), null, l1m0Var, i, m390Var, 8, null);
    }
}
